package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class e92 implements t82 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ long f17907a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f17908b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f17909c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f17908b = unsafe.objectFieldOffset(e92.class.getDeclaredField("_state$volatile"));
        f17907a = unsafe.objectFieldOffset(e92.class.getDeclaredField("_parentHandle$volatile"));
    }

    public e92(boolean z) {
        this._state$volatile = z ? f92.f18861g : f92.f18860f;
    }

    /* JADX INFO: renamed from: X */
    public static f90 m4968X(fn2 fn2Var) {
        while (fn2Var.mo5755l()) {
            fn2Var = fn2Var.m5754k();
        }
        while (true) {
            fn2Var = fn2Var.m5753j();
            if (!fn2Var.mo5755l()) {
                if (fn2Var instanceof f90) {
                    return (f90) fn2Var;
                }
                if (fn2Var instanceof g13) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static String m4969e0(Object obj) {
        if (!(obj instanceof a92)) {
            if (obj instanceof c22) {
                return ((c22) obj).mo146b() ? "Active" : "New";
            }
            return obj instanceof ff0 ? "Cancelled" : "Completed";
        }
        a92 a92Var = (a92) obj;
        if (a92Var.m149e()) {
            return "Cancelling";
        }
        return a92Var.m150f() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public String mo4970A() {
        return "Job was cancelled";
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: B */
    public final boolean mo4971B() {
        return !(m4983O() instanceof c22);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: C */
    public final w01 mo4972C(yp1 yp1Var) {
        return m4987S(true, new p72(yp1Var));
    }

    /* JADX INFO: renamed from: E */
    public boolean mo4973E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m5008x(th) && mo4980L();
    }

    /* JADX INFO: renamed from: F */
    public final void m4974F(c22 c22Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f17907a;
        e90 e90Var = (e90) unsafe.getObjectVolatile(this, j);
        if (e90Var != null) {
            e90Var.mo3937a();
            unsafe.putObjectVolatile(this, j, l13.f23702a);
        }
        gf0 gf0Var = null;
        ff0 ff0Var = obj instanceof ff0 ? (ff0) obj : null;
        Throwable th = ff0Var != null ? ff0Var.f18941a : null;
        if (c22Var instanceof w82) {
            try {
                ((w82) c22Var).mo3515o(th);
                return;
            } catch (Throwable th2) {
                mo4985Q(new gf0("Exception in completion handler " + c22Var + " for " + this, th2));
                return;
            }
        }
        g13 g13VarMo148d = c22Var.mo148d();
        if (g13VarMo148d != null) {
            g13VarMo148d.m5749f(1);
            for (fn2 fn2VarM5753j = (fn2) g13VarMo148d.m5752i(); !fn2VarM5753j.equals(g13VarMo148d); fn2VarM5753j = fn2VarM5753j.m5753j()) {
                if (fn2VarM5753j instanceof w82) {
                    try {
                        ((w82) fn2VarM5753j).mo3515o(th);
                    } catch (Throwable th3) {
                        if (gf0Var != null) {
                            se0.m10720f(gf0Var, th3);
                        } else {
                            gf0Var = new gf0("Exception in completion handler " + fn2VarM5753j + " for " + this, th3);
                        }
                    }
                }
            }
            if (gf0Var != null) {
                mo4985Q(gf0Var);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final Throwable m4975G(Object obj) {
        Throwable thM147c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        e92 e92Var = (e92) obj;
        Object objM4983O = e92Var.m4983O();
        if (objM4983O instanceof a92) {
            thM147c = ((a92) objM4983O).m147c();
        } else if (objM4983O instanceof ff0) {
            thM147c = ((ff0) objM4983O).f18941a;
        } else {
            if (objM4983O instanceof c22) {
                nm0.m8798k(objM4983O, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM147c = null;
        }
        CancellationException cancellationException = thM147c instanceof CancellationException ? (CancellationException) thM147c : null;
        return cancellationException == null ? new u82("Parent job is ".concat(m4969e0(objM4983O)), thM147c, e92Var) : cancellationException;
    }

    /* JADX INFO: renamed from: H */
    public final Object m4976H(a92 a92Var, Object obj) throws Throwable {
        Throwable th;
        Object obj2;
        ff0 ff0Var = obj instanceof ff0 ? (ff0) obj : null;
        Throwable th2 = ff0Var != null ? ff0Var.f18941a : null;
        synchronized (a92Var) {
            try {
                a92Var.m149e();
                ArrayList arrayListM151g = a92Var.m151g(th2);
                Throwable thM4979K = m4979K(a92Var, arrayListM151g);
                if (thM4979K != null) {
                    try {
                        if (arrayListM151g.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM151g.size()));
                            int size = arrayListM151g.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = arrayListM151g.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj3;
                                if (th3 != thM4979K && th3 != thM4979K && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    se0.m10720f(thM4979K, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thM4979K != null && thM4979K != th2) {
                    obj = new ff0(thM4979K, false);
                }
                if (thM4979K != null && (m5010z(thM4979K) || mo4984P(thM4979K))) {
                    AbstractC1078qo.f28633a.compareAndSwapInt((ff0) obj, ff0.f18940b, 0, 1);
                }
                mo4992Z(obj);
                if (obj instanceof c22) {
                    d22 d22Var = new d22();
                    d22Var.f16742a = (c22) obj;
                    VarHandle.storeStoreFence();
                    obj2 = d22Var;
                } else {
                    obj2 = obj;
                }
                AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, a92Var, obj2);
                m4974F(a92Var, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final Object m4977I() throws Throwable {
        Object objM4983O = m4983O();
        if (objM4983O instanceof c22) {
            C1077qn.m9989o("This job has not completed yet");
            return null;
        }
        if (objM4983O instanceof ff0) {
            throw ((ff0) objM4983O).f18941a;
        }
        return f92.m5616a(objM4983O);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: J */
    public final w01 mo4978J(boolean z, boolean z2, C0633f0 c0633f0) {
        w82 p72Var;
        if (z) {
            o72 o72Var = new o72();
            o72Var.f26410e = c0633f0;
            VarHandle.storeStoreFence();
            p72Var = o72Var;
        } else {
            p72Var = new p72(c0633f0);
        }
        return m4987S(z2, p72Var);
    }

    /* JADX INFO: renamed from: K */
    public final Throwable m4979K(a92 a92Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (a92Var.m149e()) {
                return new u82(mo4970A(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof zm4) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof zm4)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: L */
    public boolean mo4980L() {
        return true;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo4981M() {
        return this instanceof cf0;
    }

    /* JADX INFO: renamed from: N */
    public final g13 m4982N(c22 c22Var) {
        g13 g13VarMo148d = c22Var.mo148d();
        if (g13VarMo148d != null) {
            return g13VarMo148d;
        }
        if (c22Var instanceof n71) {
            return new g13();
        }
        if (c22Var instanceof w82) {
            m4997c0((w82) c22Var);
            return null;
        }
        nm0.m8798k(c22Var, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final Object m4983O() {
        return AbstractC1078qo.f28633a.getObjectVolatile(this, f17908b);
    }

    /* JADX INFO: renamed from: P */
    public boolean mo4984P(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final void m4986R(t82 t82Var) {
        long j = f17907a;
        l13 l13Var = l13.f23702a;
        if (t82Var == null) {
            AbstractC1078qo.f28633a.putObjectVolatile(this, j, l13Var);
            return;
        }
        t82Var.start();
        e90 e90VarMo5003q = t82Var.mo5003q(this);
        Unsafe unsafe = AbstractC1078qo.f28633a;
        unsafe.putObjectVolatile(this, j, e90VarMo5003q);
        if (mo4971B()) {
            e90VarMo5003q.mo3937a();
            unsafe.putObjectVolatile(this, j, l13Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final w01 m4987S(boolean z, w82 w82Var) {
        e92 e92Var;
        w82 w82Var2;
        boolean zM5748e;
        w82Var.f33153d = this;
        while (true) {
            Object objM4983O = this.m4983O();
            if (!(objM4983O instanceof n71)) {
                e92Var = this;
                w82Var2 = w82Var;
                boolean z2 = objM4983O instanceof c22;
                l13 l13Var = l13.f23702a;
                if (z2) {
                    c22 c22Var = (c22) objM4983O;
                    g13 g13VarMo148d = c22Var.mo148d();
                    if (g13VarMo148d == null) {
                        e92Var.m4997c0((w82) objM4983O);
                    } else {
                        if (w82Var2.mo3514n()) {
                            a92 a92Var = c22Var instanceof a92 ? (a92) c22Var : null;
                            Throwable thM147c = a92Var != null ? a92Var.m147c() : null;
                            if (thM147c == null) {
                                zM5748e = g13VarMo148d.m5748e(w82Var2, 5);
                            } else if (z) {
                                w82Var2.mo3515o(thM147c);
                                return l13Var;
                            }
                        } else {
                            zM5748e = g13VarMo148d.m5748e(w82Var2, 1);
                        }
                        if (zM5748e) {
                            break;
                        }
                    }
                    this = e92Var;
                    w82Var = w82Var2;
                } else if (z) {
                    Object objM4983O2 = e92Var.m4983O();
                    ff0 ff0Var = objM4983O2 instanceof ff0 ? (ff0) objM4983O2 : null;
                    w82Var2.mo3515o(ff0Var != null ? ff0Var.f18941a : null);
                }
                return l13Var;
            }
            n71 n71Var = (n71) objM4983O;
            if (n71Var.f25489a) {
                e92Var = this;
                w82Var2 = w82Var;
                if (AbstractC1078qo.f28633a.compareAndSwapObject(e92Var, f17908b, objM4983O, w82Var2)) {
                    break;
                }
            } else {
                e92Var = this;
                w82Var2 = w82Var;
                e92Var.m4996b0(n71Var);
            }
            this = e92Var;
            w82Var = w82Var2;
        }
        return w82Var2;
    }

    /* JADX INFO: renamed from: T */
    public boolean mo4988T() {
        return this instanceof t00;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m4989U(Object obj) {
        Object objM5000f0;
        do {
            objM5000f0 = m5000f0(m4983O(), obj);
            if (objM5000f0 == f92.f18855a) {
                return false;
            }
            if (objM5000f0 == f92.f18856b) {
                return true;
            }
        } while (objM5000f0 == f92.f18857c);
        mo5002p(objM5000f0);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final Object m4990V(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objM5000f0;
        do {
            objM5000f0 = m5000f0(m4983O(), obj);
            if (objM5000f0 == f92.f18855a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ff0 ff0Var = obj instanceof ff0 ? (ff0) obj : null;
                throw new IllegalStateException(str, ff0Var != null ? ff0Var.f18941a : null);
            }
        } while (objM5000f0 == f92.f18857c);
        return objM5000f0;
    }

    /* JADX INFO: renamed from: W */
    public String mo3053W() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: Y */
    public final void m4991Y(g13 g13Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        g13Var.m5749f(4);
        gf0 gf0Var = null;
        for (fn2 fn2VarM5753j = (fn2) g13Var.m5752i(); !fn2VarM5753j.equals(g13Var); fn2VarM5753j = fn2VarM5753j.m5753j()) {
            if ((fn2VarM5753j instanceof w82) && ((w82) fn2VarM5753j).mo3514n()) {
                try {
                    ((w82) fn2VarM5753j).mo3515o(th);
                } catch (Throwable th2) {
                    if (gf0Var != null) {
                        se0.m10720f(gf0Var, th2);
                    } else {
                        gf0Var = new gf0("Exception in completion handler " + fn2VarM5753j + " for " + this, th2);
                    }
                }
            }
        }
        if (gf0Var != null) {
            mo4985Q(gf0Var);
        }
        m5010z(th);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: a */
    public void mo4993a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new u82(mo4970A(), null, this);
        }
        mo5009y(cancellationException);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: b */
    public boolean mo4995b() {
        Object objM4983O = m4983O();
        return (objM4983O instanceof c22) && ((c22) objM4983O).mo146b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4996b0(n71 n71Var) {
        Object obj;
        g13 g13Var = new g13();
        if (n71Var.f25489a) {
            obj = g13Var;
        } else {
            b22 b22Var = new b22();
            b22Var.f15037a = g13Var;
            VarHandle.storeStoreFence();
            obj = b22Var;
        }
        AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, n71Var, obj);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4997c0(w82 w82Var) {
        w82 w82Var2;
        g13 g13Var = new g13();
        Unsafe unsafe = AbstractC1078qo.f28633a;
        unsafe.putObjectVolatile(g13Var, fn2.f19132b, w82Var);
        unsafe.putObjectVolatile(g13Var, fn2.f19131a, w82Var);
        while (w82Var.m5752i() == w82Var) {
            w82Var2 = w82Var;
            if (AbstractC1078qo.f28633a.compareAndSwapObject(w82Var2, fn2.f19131a, w82Var, g13Var)) {
                g13Var.m5751h(w82Var2);
                AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, w82Var2, w82Var2.m5753j());
            }
            w82Var = w82Var2;
        }
        w82Var2 = w82Var;
        AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, w82Var2, w82Var2.m5753j());
    }

    /* JADX INFO: renamed from: d0 */
    public final int m4998d0(Object obj) {
        if (obj instanceof n71) {
            if (((n71) obj).f25489a) {
                return 0;
            }
            if (!AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, obj, f92.f18861g)) {
                return -1;
            }
            mo4994a0();
            return 1;
        }
        if (!(obj instanceof b22)) {
            return 0;
        }
        if (!AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, obj, ((b22) obj).f15037a)) {
            return -1;
        }
        mo4994a0();
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public Object m4999e() {
        return m4977I();
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m5000f0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Object obj3;
        if (!(obj instanceof c22)) {
            return f92.f18855a;
        }
        if (((obj instanceof n71) || (obj instanceof w82)) && !(obj instanceof f90) && !(obj2 instanceof ff0)) {
            c22 c22Var = (c22) obj;
            if (obj2 instanceof c22) {
                d22 d22Var = new d22();
                d22Var.f16742a = (c22) obj2;
                VarHandle.storeStoreFence();
                obj3 = d22Var;
            } else {
                obj3 = obj2;
            }
            if (!AbstractC1078qo.f28633a.compareAndSwapObject(this, f17908b, c22Var, obj3)) {
                return f92.f18857c;
            }
            mo4992Z(obj2);
            m4974F(c22Var, obj2);
            return obj2;
        }
        e92 e92Var = this;
        c22 c22Var2 = (c22) obj;
        g13 g13VarM4982N = e92Var.m4982N(c22Var2);
        if (g13VarM4982N == null) {
            return f92.f18857c;
        }
        a92 a92Var = c22Var2 instanceof a92 ? (a92) c22Var2 : null;
        if (a92Var == null) {
            a92Var = new a92(g13VarM4982N, null);
        }
        a92 a92Var2 = a92Var;
        synchronized (a92Var2) {
            if (a92Var2.m150f()) {
                return f92.f18855a;
            }
            Unsafe unsafe = AbstractC1078qo.f28633a;
            unsafe.putIntVolatile(a92Var2, a92.f182c, 1);
            if (a92Var2 != c22Var2 && !unsafe.compareAndSwapObject(e92Var, f17908b, c22Var2, a92Var2)) {
                e92Var = e92Var;
                return f92.f18857c;
            }
            e92Var = e92Var;
            boolean zM149e = a92Var2.m149e();
            ff0 ff0Var = obj2 instanceof ff0 ? (ff0) obj2 : null;
            if (ff0Var != null) {
                a92Var2.m145a(ff0Var.f18941a);
            }
            Throwable thM147c = zM149e ? null : a92Var2.m147c();
            if (thM147c != null) {
                e92Var.m4991Y(g13VarM4982N, thM147c);
            }
            f90 f90VarM4968X = m4968X(g13VarM4982N);
            if (f90VarM4968X != null && e92Var.m5001g0(a92Var2, f90VarM4968X, obj2)) {
                return f92.f18856b;
            }
            g13VarM4982N.m5749f(2);
            f90 f90VarM4968X2 = m4968X(g13VarM4982N);
            return (f90VarM4968X2 == null || !e92Var.m5001g0(a92Var2, f90VarM4968X2, obj2)) ? e92Var.m4976H(a92Var2, obj2) : f92.f18856b;
        }
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m5001g0(a92 a92Var, f90 f90Var, Object obj) {
        do {
            e92 e92Var = f90Var.f18851e;
            z82 z82Var = new z82();
            z82Var.f35867e = this;
            z82Var.f35868f = a92Var;
            z82Var.f35869g = f90Var;
            z82Var.f35870h = obj;
            VarHandle.storeStoreFence();
            if (y70.m13005F(e92Var, false, z82Var) != l13.f23702a) {
                return true;
            }
            f90Var = m4968X(f90Var);
        } while (f90Var != null);
        return false;
    }

    @Override // p000.ro0
    public final po0 get(qo0 qo0Var) {
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.po0
    public final qo0 getKey() {
        return o85.f26448h;
    }

    @Override // p000.t82
    public final boolean isCancelled() {
        Object objM4983O = m4983O();
        if (objM4983O instanceof ff0) {
            return true;
        }
        return (objM4983O instanceof a92) && ((a92) objM4983O).m149e();
    }

    @Override // p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: q */
    public final e90 mo5003q(e92 e92Var) {
        e92 e92Var2;
        f90 f90Var = new f90();
        f90Var.f18851e = e92Var;
        VarHandle.storeStoreFence();
        f90Var.f33153d = this;
        while (true) {
            Object objM4983O = this.m4983O();
            if (objM4983O instanceof n71) {
                n71 n71Var = (n71) objM4983O;
                if (n71Var.f25489a) {
                    e92Var2 = this;
                    if (AbstractC1078qo.f28633a.compareAndSwapObject(e92Var2, f17908b, objM4983O, f90Var)) {
                        break;
                    }
                } else {
                    e92Var2 = this;
                    e92Var2.m4996b0(n71Var);
                }
                this = e92Var2;
            } else {
                e92Var2 = this;
                boolean z = objM4983O instanceof c22;
                l13 l13Var = l13.f23702a;
                Throwable thM147c = null;
                if (!z) {
                    Object objM4983O2 = e92Var2.m4983O();
                    ff0 ff0Var = objM4983O2 instanceof ff0 ? (ff0) objM4983O2 : null;
                    f90Var.mo3515o(ff0Var != null ? ff0Var.f18941a : null);
                    return l13Var;
                }
                g13 g13VarMo148d = ((c22) objM4983O).mo148d();
                if (g13VarMo148d != null) {
                    if (g13VarMo148d.m5748e(f90Var, 7)) {
                        break;
                    }
                    boolean zM5748e = g13VarMo148d.m5748e(f90Var, 3);
                    Object objM4983O3 = e92Var2.m4983O();
                    if (objM4983O3 instanceof a92) {
                        thM147c = ((a92) objM4983O3).m147c();
                    } else {
                        ff0 ff0Var2 = objM4983O3 instanceof ff0 ? (ff0) objM4983O3 : null;
                        if (ff0Var2 != null) {
                            thM147c = ff0Var2.f18941a;
                        }
                    }
                    f90Var.mo3515o(thM147c);
                    if (zM5748e) {
                        break;
                    }
                    return l13Var;
                }
                e92Var2.m4997c0((w82) objM4983O);
                this = e92Var2;
            }
        }
        return f90Var;
    }

    /* JADX INFO: renamed from: r */
    public void mo5004r(Object obj) {
        mo5002p(obj);
    }

    @Override // p000.t82
    public final boolean start() {
        int iM4998d0;
        do {
            iM4998d0 = m4998d0(m4983O());
            if (iM4998d0 == 0) {
                return false;
            }
        } while (iM4998d0 != 1);
        return true;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: t */
    public final Object mo5005t(wm0 wm0Var) {
        Object objM4983O;
        ju4 ju4Var;
        do {
            objM4983O = m4983O();
            boolean z = objM4983O instanceof c22;
            ju4Var = ju4.f22634a;
            if (!z) {
                y70.m13040t(wm0Var.getContext());
                return ju4Var;
            }
        } while (m4998d0(objM4983O) < 0);
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        gp3 gp3Var = new gp3();
        gp3Var.f20006e = b70Var;
        VarHandle.storeStoreFence();
        c20.m3817l(b70Var, y70.m13005F(this, true, gp3Var));
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        if (objM3495r != ap0Var) {
            objM3495r = ju4Var;
        }
        return objM3495r == ap0Var ? objM3495r : ju4Var;
    }

    public final String toString() {
        return (mo3053W() + '{' + m4969e0(m4983O()) + '}') + '@' + ev0.m5354d0(this);
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: u */
    public final CancellationException mo5006u() {
        CancellationException cancellationException;
        Object objM4983O = m4983O();
        if (objM4983O instanceof a92) {
            Throwable thM147c = ((a92) objM4983O).m147c();
            if (thM147c == null) {
                nm0.m8798k(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM147c instanceof CancellationException ? (CancellationException) thM147c : null;
            return cancellationException == null ? new u82(strConcat, thM147c, this) : cancellationException;
        }
        if (objM4983O instanceof c22) {
            nm0.m8798k(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM4983O instanceof ff0)) {
            return new u82(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((ff0) objM4983O).f18941a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new u82(mo4970A(), th, this) : cancellationException;
    }

    /* JADX INFO: renamed from: w */
    public final Object m5007w(wm0 wm0Var) {
        Object objM4983O;
        do {
            objM4983O = m4983O();
            if (!(objM4983O instanceof c22)) {
                if (objM4983O instanceof ff0) {
                    throw ((ff0) objM4983O).f18941a;
                }
                return f92.m5616a(objM4983O);
            }
        } while (m4998d0(objM4983O) < 0);
        y82 y82Var = new y82(1, C0006a5.m86x(wm0Var));
        y82Var.f35020i = this;
        VarHandle.storeStoreFence();
        y82Var.m3497u();
        fp3 fp3Var = new fp3();
        fp3Var.f19213e = y82Var;
        VarHandle.storeStoreFence();
        c20.m3817l(y82Var, y70.m13005F(this, true, fp3Var));
        Object objM3495r = y82Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:78:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:78:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:78:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    /* JADX INFO: renamed from: x */
    public final boolean m5008x(Object obj) {
        e92 e92Var;
        Throwable thM4975G;
        Object objM4983O;
        Throwable thM147c;
        C0641f8 c0641f8;
        Object objM5000f0;
        c22 c22Var;
        g13 g13VarM4982N;
        Object objM5000f1 = f92.f18855a;
        if (mo4981M()) {
            do {
                Object objM4983O2 = m4983O();
                if (!(objM4983O2 instanceof c22) || ((objM4983O2 instanceof a92) && ((a92) objM4983O2).m150f())) {
                    objM5000f1 = f92.f18855a;
                    break;
                }
                objM5000f1 = m5000f0(objM4983O2, new ff0(m4975G(obj), false));
            } while (objM5000f1 == f92.f18857c);
            if (objM5000f1 != f92.f18856b) {
                if (objM5000f1 == f92.f18855a) {
                    thM4975G = null;
                    while (true) {
                        objM4983O = this.m4983O();
                        if (objM4983O instanceof a92) {
                            if (objM4983O instanceof c22) {
                                if (thM4975G == null) {
                                    thM4975G = this.m4975G(obj);
                                }
                                c22Var = (c22) objM4983O;
                                if (c22Var.mo146b()) {
                                    g13VarM4982N = this.m4982N(c22Var);
                                    if (g13VarM4982N == null) {
                                        e92Var = this;
                                    } else {
                                        e92Var = this;
                                        if (!AbstractC1078qo.f28633a.compareAndSwapObject(e92Var, f17908b, c22Var, new a92(g13VarM4982N, thM4975G))) {
                                            e92Var.m4991Y(g13VarM4982N, thM4975G);
                                            objM5000f0 = f92.f18855a;
                                        }
                                    }
                                    this = e92Var;
                                } else {
                                    e92Var = this;
                                    objM5000f0 = e92Var.m5000f0(objM4983O, new ff0(thM4975G, false));
                                    if (objM5000f0 != f92.f18855a) {
                                        nm0.m8798k(objM4983O, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objM5000f0 != f92.f18857c) {
                                        this = e92Var;
                                    }
                                }
                            } else {
                                e92Var = this;
                                objM5000f0 = f92.f18858d;
                            }
                            objM5000f1 = objM5000f0;
                            break;
                        }
                        synchronized (objM4983O) {
                            if (AbstractC1078qo.f28633a.getObjectVolatile((a92) objM4983O, a92.f181b) == f92.f18859e) {
                                c0641f8 = f92.f18858d;
                            } else {
                                boolean zM149e = ((a92) objM4983O).m149e();
                                if (thM4975G == null) {
                                    thM4975G = this.m4975G(obj);
                                }
                                ((a92) objM4983O).m145a(thM4975G);
                                thM147c = zM149e ? null : ((a92) objM4983O).m147c();
                                if (thM147c != null) {
                                    this.m4991Y(((a92) objM4983O).f184a, thM147c);
                                }
                                c0641f8 = f92.f18855a;
                            }
                        }
                        e92Var = this;
                        objM5000f1 = c0641f8;
                        break;
                    }
                }
                e92Var = this;
                if (objM5000f1 != f92.f18855a && objM5000f1 != f92.f18856b) {
                    if (objM5000f1 == f92.f18858d) {
                        return false;
                    }
                    e92Var.mo5002p(objM5000f1);
                    return true;
                }
            }
        } else {
            if (objM5000f1 == f92.f18855a) {
                thM4975G = null;
                while (true) {
                    objM4983O = this.m4983O();
                    if (objM4983O instanceof a92) {
                        if (objM4983O instanceof c22) {
                            if (thM4975G == null) {
                                thM4975G = this.m4975G(obj);
                            }
                            c22Var = (c22) objM4983O;
                            if (c22Var.mo146b()) {
                                g13VarM4982N = this.m4982N(c22Var);
                                if (g13VarM4982N == null) {
                                    e92Var = this;
                                } else {
                                    e92Var = this;
                                    if (!AbstractC1078qo.f28633a.compareAndSwapObject(e92Var, f17908b, c22Var, new a92(g13VarM4982N, thM4975G))) {
                                        e92Var.m4991Y(g13VarM4982N, thM4975G);
                                        objM5000f0 = f92.f18855a;
                                    }
                                }
                                this = e92Var;
                            } else {
                                e92Var = this;
                                objM5000f0 = e92Var.m5000f0(objM4983O, new ff0(thM4975G, false));
                                if (objM5000f0 != f92.f18855a) {
                                    nm0.m8798k(objM4983O, "Cannot happen in ");
                                    return false;
                                }
                                if (objM5000f0 != f92.f18857c) {
                                    this = e92Var;
                                }
                            }
                        } else {
                            e92Var = this;
                            objM5000f0 = f92.f18858d;
                        }
                        objM5000f1 = objM5000f0;
                        break;
                    }
                    synchronized (objM4983O) {
                        if (AbstractC1078qo.f28633a.getObjectVolatile((a92) objM4983O, a92.f181b) == f92.f18859e) {
                            c0641f8 = f92.f18858d;
                        } else {
                            boolean zM149e2 = ((a92) objM4983O).m149e();
                            if (thM4975G == null) {
                                thM4975G = this.m4975G(obj);
                            }
                            ((a92) objM4983O).m145a(thM4975G);
                            if (zM149e2) {
                            }
                            if (thM147c != null) {
                                this.m4991Y(((a92) objM4983O).f184a, thM147c);
                            }
                            c0641f8 = f92.f18855a;
                        }
                        e92Var = this;
                        objM5000f1 = c0641f8;
                        break;
                    }
                }
            }
            e92Var = this;
            if (objM5000f1 != f92.f18855a) {
                if (objM5000f1 == f92.f18858d) {
                    return false;
                }
                e92Var.mo5002p(objM5000f1);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void mo5009y(CancellationException cancellationException) {
        m5008x(cancellationException);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5010z(Throwable th) {
        if (mo4988T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        e90 e90Var = (e90) AbstractC1078qo.f28633a.getObjectVolatile(this, f17907a);
        if (e90Var == null || e90Var == l13.f23702a) {
            return z;
        }
        return e90Var.mo4967c(th) || z;
    }

    /* JADX INFO: renamed from: Q */
    public void mo4985Q(gf0 gf0Var) {
        throw gf0Var;
    }

    /* JADX INFO: renamed from: Z */
    public void mo4992Z(Object obj) {
    }

    /* JADX INFO: renamed from: p */
    public void mo5002p(Object obj) {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo4994a0() {
    }
}
