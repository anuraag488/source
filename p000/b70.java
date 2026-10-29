package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class b70 extends i01 implements a70, bp0, yy4 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f15135f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f15136g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f15137h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    public final wm0 f15138d;

    /* JADX INFO: renamed from: e */
    public final ro0 f15139e;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f15135f = unsafe.objectFieldOffset(b70.class.getDeclaredField("_decisionAndIndex$volatile"));
        f15137h = unsafe.objectFieldOffset(b70.class.getDeclaredField("_state$volatile"));
        f15136g = unsafe.objectFieldOffset(b70.class.getDeclaredField("_parentHandle$volatile"));
    }

    public b70(int i, wm0 wm0Var) {
        super(i);
        this.f15138d = wm0Var;
        this.f15139e = wm0Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1206u4.f31639a;
    }

    /* JADX INFO: renamed from: E */
    public static Object m3476E(s13 s13Var, Object obj, int i, nq1 nq1Var) {
        if (obj instanceof ff0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (nq1Var != null || (s13Var instanceof x60)) {
            return new df0(obj, s13Var instanceof x60 ? (x60) s13Var : null, nq1Var, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: z */
    public static void m3477z(s13 s13Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + s13Var + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: A */
    public String mo3478A() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: B */
    public final void m3479B() {
        b70 b70Var;
        wm0 wm0Var = this.f15138d;
        Throwable th = null;
        f01 f01Var = wm0Var instanceof f01 ? (f01) wm0Var : null;
        if (f01Var != null) {
            while (true) {
                Unsafe unsafe = AbstractC1078qo.f28633a;
                long j = f01.f18625h;
                Object objectVolatile = unsafe.getObjectVolatile(f01Var, j);
                C0641f8 c0641f8 = g01.f19458b;
                if (objectVolatile != c0641f8) {
                    b70Var = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        nm0.m8798k(objectVolatile, "Inconsistent state ");
                        return;
                    } else if (unsafe.compareAndSwapObject(f01Var, j, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                        break;
                    } else {
                        C1077qn.m9987m("Failed requirement.");
                        return;
                    }
                }
                b70 b70Var2 = this;
                b70Var = b70Var2;
                if (unsafe.compareAndSwapObject(f01Var, j, c0641f8, b70Var2)) {
                    break;
                } else {
                    this = b70Var;
                }
            }
            if (th == null) {
                return;
            }
            b70Var.m3492o();
            b70Var.mo115m(th);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m3480C(Object obj, int i, nq1 nq1Var) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15137h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof s13)) {
                b70 b70Var = this;
                if (objectVolatile instanceof e70) {
                    e70 e70Var = (e70) objectVolatile;
                    if (unsafe.compareAndSwapInt(e70Var, e70.f17861c, 0, 1)) {
                        if (nq1Var != null) {
                            b70Var.m3490l(nq1Var, e70Var.f18941a, obj);
                            return;
                        }
                        return;
                    }
                }
                nm0.m8798k(obj, "Already resumed, but proposed with update ");
                return;
            }
            b70 b70Var2 = this;
            if (unsafe.compareAndSwapObject(b70Var2, j, objectVolatile, m3476E((s13) objectVolatile, obj, i, nq1Var))) {
                if (!b70Var2.m3501y()) {
                    b70Var2.m3492o();
                }
                b70Var2.m3493p(i);
                return;
            }
            this = b70Var2;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3481D(so0 so0Var) {
        wm0 wm0Var = this.f15138d;
        f01 f01Var = wm0Var instanceof f01 ? (f01) wm0Var : null;
        m3480C(ju4.f22634a, (f01Var != null ? f01Var.f18626d : null) == so0Var ? 4 : this.f20971c, null);
    }

    /* JADX INFO: renamed from: F */
    public final C0641f8 m3482F(Object obj, nq1 nq1Var) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15137h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof s13)) {
                return null;
            }
            b70 b70Var = this;
            if (unsafe.compareAndSwapObject(b70Var, j, objectVolatile, m3476E((s13) objectVolatile, obj, this.f20971c, nq1Var))) {
                boolean zM3501y = b70Var.m3501y();
                C0641f8 c0641f8 = c70.f15849a;
                if (!zM3501y) {
                    b70Var.m3492o();
                }
                return c0641f8;
            }
            this = b70Var;
        }
    }

    @Override // p000.yy4
    /* JADX INFO: renamed from: a */
    public final void mo3483a(a04 a04Var, int i) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15135f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                C1077qn.m9989o("invokeOnCancellation should be called at most once");
                return;
            }
            b70 b70Var = this;
            if (unsafe.compareAndSwapInt(b70Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                b70Var.m3500x(a04Var);
                return;
            }
            this = b70Var;
        }
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: b */
    public final boolean mo112b() {
        return m3496t() instanceof s13;
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: c */
    public final void mo3484c(CancellationException cancellationException) {
        b70 b70Var;
        CancellationException cancellationException2;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15137h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof s13) {
                C1077qn.m9989o("Not completed");
                return;
            }
            if (objectVolatile instanceof ff0) {
                return;
            }
            if (objectVolatile instanceof df0) {
                df0 df0Var = (df0) objectVolatile;
                if (df0Var.f17005e != null) {
                    C1077qn.m9989o("Must be called at most once");
                    return;
                }
                b70Var = this;
                if (unsafe.compareAndSwapObject(b70Var, j, objectVolatile, df0.m4497a(df0Var, null, cancellationException, 15))) {
                    x60 x60Var = df0Var.f17002b;
                    if (x60Var != null) {
                        b70Var.m3489k(x60Var, cancellationException);
                    }
                    nq1 nq1Var = df0Var.f17003c;
                    if (nq1Var != null) {
                        b70Var.m3490l(nq1Var, cancellationException, df0Var.f17001a);
                        return;
                    }
                    return;
                }
                cancellationException2 = cancellationException;
            } else {
                b70Var = this;
                cancellationException2 = cancellationException;
                if (unsafe.compareAndSwapObject(b70Var, j, objectVolatile, new df0(objectVolatile, (x60) null, (nq1) null, cancellationException2, 14))) {
                    return;
                }
            }
            this = b70Var;
            cancellationException = cancellationException2;
        }
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: d */
    public final wm0 mo3485d() {
        return this.f15138d;
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: e */
    public final Throwable mo3486e(Object obj) {
        Throwable thMo3486e = super.mo3486e(obj);
        if (thMo3486e != null) {
            return thMo3486e;
        }
        return null;
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: f */
    public final Object mo3487f(Object obj) {
        return obj instanceof df0 ? ((df0) obj).f17001a : obj;
    }

    @Override // p000.bp0
    public final bp0 getCallerFrame() {
        wm0 wm0Var = this.f15138d;
        if (wm0Var instanceof bp0) {
            return (bp0) wm0Var;
        }
        return null;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f15139e;
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: h */
    public final void mo113h(Object obj, nq1 nq1Var) {
        m3480C(obj, this.f20971c, nq1Var);
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: i */
    public final Object mo3488i() {
        return m3496t();
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: j */
    public final C0641f8 mo114j(Object obj, nq1 nq1Var) {
        return m3482F(obj, nq1Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m3489k(x60 x60Var, Throwable th) {
        try {
            x60Var.mo5874b(th);
        } catch (Throwable th2) {
            n40.m8509s(this.f15139e, new gf0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3490l(nq1 nq1Var, Throwable th, Object obj) {
        ro0 ro0Var = this.f15139e;
        try {
            nq1Var.invoke(th, obj, ro0Var);
        } catch (Throwable th2) {
            n40.m8509s(ro0Var, new gf0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: m */
    public final boolean mo115m(Throwable th) {
        Throwable cancellationException;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15137h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof s13)) {
                return false;
            }
            boolean z = false;
            if ((objectVolatile instanceof x60) || (objectVolatile instanceof a04)) {
                z = true;
            }
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            e70 e70Var = new e70(cancellationException, z);
            b70 b70Var = this;
            if (unsafe.compareAndSwapObject(b70Var, j, objectVolatile, e70Var)) {
                s13 s13Var = (s13) objectVolatile;
                if (s13Var instanceof x60) {
                    b70Var.m3489k((x60) objectVolatile, th);
                } else if (s13Var instanceof a04) {
                    b70Var.m3491n((a04) objectVolatile, th);
                }
                if (!b70Var.m3501y()) {
                    b70Var.m3492o();
                }
                b70Var.m3493p(b70Var.f20971c);
                return true;
            }
            this = b70Var;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3491n(a04 a04Var, Throwable th) {
        ro0 ro0Var = this.f15139e;
        int intVolatile = AbstractC1078qo.f28633a.getIntVolatile(this, f15135f) & 536870911;
        if (intVolatile == 536870911) {
            C1077qn.m9989o("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            a04Var.mo6h(intVolatile, ro0Var);
        } catch (Throwable th2) {
            n40.m8509s(ro0Var, new gf0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3492o() {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f15136g;
        w01 w01Var = (w01) unsafe.getObjectVolatile(this, j);
        if (w01Var == null) {
            return;
        }
        w01Var.mo3937a();
        unsafe.putObjectVolatile(this, j, l13.f23702a);
    }

    /* JADX INFO: renamed from: p */
    public final void m3493p(int i) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15135f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    C1077qn.m9989o("Already resumed");
                    return;
                }
                boolean z = i == 4;
                wm0 wm0Var = this.f15138d;
                if (!z && (wm0Var instanceof f01)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f20971c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        f01 f01Var = (f01) wm0Var;
                        so0 so0Var = f01Var.f18626d;
                        ro0 context = f01Var.f18627e.getContext();
                        if (g01.m5869c(so0Var, context)) {
                            g01.m5868b(so0Var, context, this);
                            return;
                        }
                        eb1 eb1VarM5204a = em4.m5204a();
                        if (eb1VarM5204a.f17948b >= 4294967296L) {
                            eb1VarM5204a.m5044P(this);
                            return;
                        }
                        eb1VarM5204a.m5049U(true);
                        try {
                            i20.m6567B(this, wm0Var, true);
                            do {
                            } while (eb1VarM5204a.m5052X());
                        } catch (Throwable th) {
                            try {
                                this.m6536g(th);
                            } finally {
                                eb1VarM5204a.m5043O(true);
                            }
                        }
                        return;
                    }
                }
                i20.m6567B(this, wm0Var, z);
                return;
            }
            b70 b70Var = this;
            if (unsafe.compareAndSwapInt(b70Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = b70Var;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public Throwable mo3494q(e92 e92Var) {
        return e92Var.mo5006u();
    }

    /* JADX INFO: renamed from: r */
    public final Object m3495r() {
        t82 t82Var;
        boolean zM3501y = m3501y();
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15135f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    C1077qn.m9989o("Already suspended");
                    return null;
                }
                if (zM3501y) {
                    this.m3479B();
                }
                Object objM3496t = this.m3496t();
                if (objM3496t instanceof ff0) {
                    throw ((ff0) objM3496t).f18941a;
                }
                int i2 = this.f20971c;
                if ((i2 != 1 && i2 != 2) || (t82Var = (t82) this.f15139e.get(o85.f26448h)) == null || t82Var.mo4995b()) {
                    return this.mo3487f(objM3496t);
                }
                CancellationException cancellationExceptionMo5006u = t82Var.mo5006u();
                this.mo3484c(cancellationExceptionMo5006u);
                throw cancellationExceptionMo5006u;
            }
            b70 b70Var = this;
            if (unsafe.compareAndSwapInt(b70Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((w01) unsafe.getObjectVolatile(b70Var, f15136g)) == null) {
                    b70Var.m3498v();
                }
                if (zM3501y) {
                    b70Var.m3479B();
                }
                return ap0.f14763a;
            }
            this = b70Var;
        }
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        Throwable thM4638b = dp3.m4638b(obj);
        if (thM4638b != null) {
            obj = new ff0(thM4638b, false);
        }
        m3480C(obj, this.f20971c, null);
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: s */
    public final void mo116s(Object obj) {
        m3493p(this.f20971c);
    }

    /* JADX INFO: renamed from: t */
    public final Object m3496t() {
        return AbstractC1078qo.f28633a.getObjectVolatile(this, f15137h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(mo3478A());
        sb.append('(');
        sb.append(ev0.m5373w0(this.f15138d));
        sb.append("){");
        Object objM3496t = m3496t();
        if (objM3496t instanceof s13) {
            str = "Active";
        } else {
            str = objM3496t instanceof e70 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(ev0.m5354d0(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m3497u() {
        w01 w01VarM3498v = m3498v();
        if (w01VarM3498v == null || (m3496t() instanceof s13)) {
            return;
        }
        w01VarM3498v.mo3937a();
        AbstractC1078qo.f28633a.putObjectVolatile(this, f15136g, l13.f23702a);
    }

    /* JADX INFO: renamed from: v */
    public final w01 m3498v() {
        t82 t82Var = (t82) this.f15139e.get(o85.f26448h);
        if (t82Var == null) {
            return null;
        }
        d90 d90Var = new d90();
        d90Var.f16866e = this;
        VarHandle.storeStoreFence();
        w01 w01VarM13005F = y70.m13005F(t82Var, true, d90Var);
        AbstractC1078qo.f28633a.compareAndSwapObject(this, f15136g, (Object) null, w01VarM13005F);
        return w01VarM13005F;
    }

    /* JADX INFO: renamed from: w */
    public final void m3499w(yp1 yp1Var) {
        w60 w60Var = new w60((byte) 1);
        w60Var.f33119b = yp1Var;
        VarHandle.storeStoreFence();
        m3500x(w60Var);
    }

    /* JADX INFO: renamed from: x */
    public final void m3500x(s13 s13Var) {
        s13 s13Var2;
        b70 b70Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f15137h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof C1206u4) {
                b70 b70Var2 = this;
                s13 s13Var3 = s13Var;
                s13Var2 = s13Var3;
                if (unsafe.compareAndSwapObject(b70Var2, j, objectVolatile, s13Var3)) {
                    return;
                } else {
                    b70Var = b70Var2;
                }
            } else {
                s13Var2 = s13Var;
                b70 b70Var3 = this;
                if ((objectVolatile instanceof x60) || (objectVolatile instanceof a04)) {
                    m3477z(s13Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof ff0) {
                    ff0 ff0Var = (ff0) objectVolatile;
                    if (!unsafe.compareAndSwapInt(ff0Var, ff0.f18940b, 0, 1)) {
                        m3477z(s13Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof e70) {
                        Throwable th = ff0Var.f18941a;
                        if (s13Var2 instanceof x60) {
                            b70Var3.m3489k((x60) s13Var2, th);
                            return;
                        } else {
                            b70Var3.m3491n((a04) s13Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof df0) {
                    df0 df0Var = (df0) objectVolatile;
                    if (df0Var.f17002b != null) {
                        m3477z(s13Var2, objectVolatile);
                        throw null;
                    }
                    if (s13Var2 instanceof a04) {
                        return;
                    }
                    x60 x60Var = (x60) s13Var2;
                    Throwable th2 = df0Var.f17005e;
                    if (th2 != null) {
                        b70Var3.m3489k(x60Var, th2);
                        return;
                    }
                    df0 df0VarM4497a = df0.m4497a(df0Var, x60Var, null, 29);
                    b70Var = b70Var3;
                    if (unsafe.compareAndSwapObject(b70Var, j, objectVolatile, df0VarM4497a)) {
                        return;
                    }
                } else {
                    b70Var = b70Var3;
                    if (s13Var2 instanceof a04) {
                        return;
                    }
                    if (unsafe.compareAndSwapObject(b70Var, j, objectVolatile, new df0(objectVolatile, (x60) s13Var2, (nq1) null, (Throwable) null, 28))) {
                        return;
                    }
                }
            }
            this = b70Var;
            s13Var = s13Var2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3501y() {
        if (this.f20971c == 2) {
            return AbstractC1078qo.f28633a.getObjectVolatile((f01) this.f15138d, f01.f18625h) != null;
        }
        return false;
    }
}
