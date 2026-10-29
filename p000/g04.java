package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g04 implements x60, yy4 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f19470f = AbstractC1078qo.f28633a.objectFieldOffset(g04.class.getDeclaredField("state$volatile"));

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f19471g = 0;

    /* JADX INFO: renamed from: a */
    public final ro0 f19472a;

    /* JADX INFO: renamed from: c */
    public Object f19474c;
    private volatile /* synthetic */ Object state$volatile = i04.f20986a;

    /* JADX INFO: renamed from: b */
    public ArrayList f19473b = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public int f19475d = -1;

    /* JADX INFO: renamed from: e */
    public Object f19476e = i04.f20989d;

    public g04(ro0 ro0Var) {
        this.f19472a = ro0Var;
    }

    /* JADX INFO: renamed from: d */
    public static Object m5873d(g04 g04Var, ym0 ym0Var) {
        return AbstractC1078qo.f28633a.getObjectVolatile(g04Var, f19470f) instanceof e04 ? g04Var.m5875c(ym0Var) : g04Var.m5876e(ym0Var);
    }

    @Override // p000.yy4
    /* JADX INFO: renamed from: a */
    public final void mo3483a(a04 a04Var, int i) {
        this.f19474c = a04Var;
        this.f19475d = i;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: b */
    public final void mo5874b(Throwable th) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f19470f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == i04.f20987b) {
                return;
            }
            g04 g04Var = this;
            if (unsafe.compareAndSwapObject(g04Var, j, objectVolatile, i04.f20988c)) {
                ArrayList arrayList = g04Var.f19473b;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((e04) obj).m4836a();
                }
                g04Var.f19476e = i04.f20989d;
                g04Var.f19473b = null;
                return;
            }
            this = g04Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m5875c(ym0 ym0Var) {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f19470f;
        e04 e04Var = (e04) unsafe.getObjectVolatile(this, j);
        Object obj = e04Var.f17569d;
        Object obj2 = this.f19476e;
        ArrayList arrayList = this.f19473b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                e04 e04Var2 = (e04) obj3;
                if (e04Var2 != e04Var) {
                    e04Var2.m4836a();
                }
            }
            AbstractC1078qo.f28633a.putObjectVolatile(this, j, i04.f20987b);
            this.f19476e = i04.f20989d;
            this.f19473b = null;
        }
        Object objInvoke = e04Var.f17568c.invoke(e04Var.f17566a, obj, obj2);
        bp0 bp0Var = e04Var.f17570e;
        return obj == i04.f20990e ? ((yp1) bp0Var).invoke(ym0Var) : ((mq1) bp0Var).invoke(objInvoke, ym0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m5876e(ym0 ym0Var) {
        f04 f04Var;
        Object obj;
        b70 b70Var;
        if (ym0Var instanceof f04) {
            f04Var = (f04) ym0Var;
            int i = f04Var.f18642v;
            if ((i & Integer.MIN_VALUE) != 0) {
                f04Var.f18642v = i - Integer.MIN_VALUE;
            } else {
                f04Var = new f04(this, ym0Var);
            }
        } else {
            f04Var = new f04(this, ym0Var);
        }
        f04 f04Var2 = f04Var;
        Object obj2 = f04Var2.f18640t;
        Object obj3 = ap0.f14763a;
        int i2 = f04Var2.f18642v;
        if (i2 == 0) {
            k43.m7376J(obj2);
            f04Var2.f18642v = 1;
            b70 b70Var2 = new b70(1, C0006a5.m86x(f04Var2));
            b70Var2.m3497u();
            while (true) {
                Unsafe unsafe = AbstractC1078qo.f28633a;
                long j = f19470f;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                obj = ju4.f22634a;
                C0641f8 c0641f8 = i04.f20986a;
                if (objectVolatile == c0641f8) {
                    b70Var = b70Var2;
                    if (unsafe.compareAndSwapObject(this, j, objectVolatile, b70Var2)) {
                        b70Var.m3500x(this);
                        break;
                    }
                    b70Var2 = b70Var;
                } else {
                    b70Var = b70Var2;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof e04)) {
                            nm0.m8798k(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        e04 e04Var = (e04) objectVolatile;
                        Object obj4 = this.f19476e;
                        nq1 nq1Var = e04Var.f17571f;
                        b70Var.mo113h(obj, nq1Var != null ? (nq1) nq1Var.invoke(this, e04Var.f17569d, obj4) : null);
                        break;
                    }
                    if (unsafe.compareAndSwapObject(this, j, objectVolatile, c0641f8)) {
                        Iterator it = ((Iterable) objectVolatile).iterator();
                        while (it.hasNext()) {
                            e04 e04VarM5877f = m5877f(it.next());
                            e04VarM5877f.f17572g = null;
                            e04VarM5877f.f17573h = -1;
                            m5879h(e04VarM5877f, true);
                        }
                    }
                    b70Var2 = b70Var;
                }
            }
            Object objM3495r = b70Var.m3495r();
            if (objM3495r == ap0.f14763a) {
                obj = objM3495r;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(obj2);
                return obj2;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj2);
        f04Var2.f18642v = 2;
        Object objM5875c = m5875c(f04Var2);
        return objM5875c == obj3 ? obj3 : objM5875c;
    }

    /* JADX INFO: renamed from: f */
    public final e04 m5877f(Object obj) {
        ArrayList arrayList = this.f19473b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (((e04) obj3).f17566a == obj) {
                obj2 = obj3;
                break;
            }
        }
        e04 e04Var = (e04) obj2;
        if (e04Var != null) {
            return e04Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m5878g(C1283w7 c1283w7, mq1 mq1Var) {
        m5879h(new e04(this, c1283w7.f33127c, (nq1) c1283w7.f33128d, (nq1) c1283w7.f33129e, null, (of4) mq1Var, (nq1) c1283w7.f33126b), false);
    }

    /* JADX INFO: renamed from: h */
    public final void m5879h(e04 e04Var, boolean z) {
        Object obj = e04Var.f17566a;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f19470f;
        if (unsafe.getObjectVolatile(this, j) instanceof e04) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.f19473b;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((e04) obj2).f17566a == obj) {
                        xd2.m12669p(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        e04Var.f17567b.invoke(obj, this, e04Var.f17569d);
        if (this.f19476e != i04.f20989d) {
            AbstractC1078qo.f28633a.putObjectVolatile(this, j, e04Var);
            return;
        }
        if (!z) {
            this.f19473b.add(e04Var);
        }
        e04Var.f17572g = this.f19474c;
        e04Var.f17573h = this.f19475d;
        this.f19474c = null;
        this.f19475d = -1;
    }

    /* JADX INFO: renamed from: i */
    public final int m5880i(Object obj, Object obj2) {
        g04 g04Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f19470f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof a70) {
                e04 e04VarM5877f = this.m5877f(obj);
                if (e04VarM5877f != null) {
                    nq1 nq1Var = e04VarM5877f.f17571f;
                    nq1 nq1Var2 = nq1Var != null ? (nq1) nq1Var.invoke(this, e04VarM5877f.f17569d, obj2) : null;
                    g04Var = this;
                    if (unsafe.compareAndSwapObject(g04Var, j, objectVolatile, e04VarM5877f)) {
                        a70 a70Var = (a70) objectVolatile;
                        g04Var.f19476e = obj2;
                        C0641f8 c0641f8Mo114j = a70Var.mo114j(ju4.f22634a, nq1Var2);
                        if (c0641f8Mo114j == null) {
                            g04Var.f19476e = i04.f20989d;
                            return 2;
                        }
                        a70Var.mo116s(c0641f8Mo114j);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                g04Var = this;
                if (z62.m13387o(objectVolatile, i04.f20987b) || (objectVolatile instanceof e04)) {
                    return 3;
                }
                if (z62.m13387o(objectVolatile, i04.f20988c)) {
                    return 2;
                }
                if (z62.m13387o(objectVolatile, i04.f20986a)) {
                    if (unsafe.compareAndSwapObject(g04Var, j, objectVolatile, Collections.singletonList(obj))) {
                        return 1;
                    }
                } else {
                    if (!(objectVolatile instanceof List)) {
                        nm0.m8798k(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    if (unsafe.compareAndSwapObject(g04Var, j, objectVolatile, hb0.m6311W0((Collection) objectVolatile, obj))) {
                        return 1;
                    }
                }
            }
            this = g04Var;
        }
    }
}
