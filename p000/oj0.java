package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class oj0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ long f26776a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f26777b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f26778c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f26776a = unsafe.objectFieldOffset(oj0.class.getDeclaredField("_next$volatile"));
        f26777b = unsafe.objectFieldOffset(oj0.class.getDeclaredField("_prev$volatile"));
    }

    public oj0(a04 a04Var) {
        this._prev$volatile = a04Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m9128a() {
        AbstractC1078qo.f28633a.putObjectVolatile(this, f26777b, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final oj0 m9129c() {
        Object objectVolatile = AbstractC1078qo.f28633a.getObjectVolatile(this, f26776a);
        if (objectVolatile == nj0.f25879a) {
            return null;
        }
        return (oj0) objectVolatile;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo3d();

    /* JADX INFO: renamed from: e */
    public final void m9130e() {
        oj0 oj0Var;
        Unsafe unsafe;
        Object objectVolatile;
        if (m9129c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = AbstractC1078qo.f28633a;
            long j = f26777b;
            oj0 oj0Var2 = (oj0) unsafe2.getObjectVolatile(this, j);
            while (oj0Var2 != null && oj0Var2.mo3d()) {
                oj0Var2 = (oj0) AbstractC1078qo.f28633a.getObjectVolatile(oj0Var2, j);
            }
            oj0 oj0VarM9129c = m9129c();
            do {
                oj0Var = oj0VarM9129c;
                if (!oj0Var.mo3d()) {
                    break;
                } else {
                    oj0VarM9129c = oj0Var.m9129c();
                }
            } while (oj0VarM9129c != null);
            do {
                unsafe = AbstractC1078qo.f28633a;
                objectVolatile = unsafe.getObjectVolatile(oj0Var, j);
            } while (!unsafe.compareAndSwapObject(oj0Var, f26777b, objectVolatile, ((oj0) objectVolatile) == null ? null : oj0Var2));
            if (oj0Var2 != null) {
                unsafe.putObjectVolatile(oj0Var2, f26776a, oj0Var);
            }
            if (!oj0Var.mo3d() || oj0Var.m9129c() == null) {
                if (oj0Var2 == null || !oj0Var2.mo3d()) {
                    return;
                }
            }
        }
    }
}
