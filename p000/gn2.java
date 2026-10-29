package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class gn2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ long f19975a = AbstractC1078qo.f28633a.objectFieldOffset(gn2.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new in2(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m6049a(Runnable runnable) {
        gn2 gn2Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f19975a;
            in2 in2Var = (in2) unsafe.getObjectVolatile(this, j);
            int iM6820a = in2Var.m6820a(runnable);
            if (iM6820a == 0) {
                return true;
            }
            if (iM6820a == 1) {
                gn2Var = this;
                unsafe.compareAndSwapObject(gn2Var, j, in2Var, in2Var.m6822c());
            } else {
                if (iM6820a == 2) {
                    return false;
                }
                gn2Var = this;
            }
            this = gn2Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m6050b() {
        in2 in2Var = (in2) AbstractC1078qo.f28633a.getObjectVolatile(this, f19975a);
        in2Var.getClass();
        long longVolatile = AbstractC1078qo.f28633a.getLongVolatile(in2Var, in2.f21576g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    /* JADX INFO: renamed from: c */
    public final Object m6051c() {
        while (true) {
            in2 in2Var = (in2) AbstractC1078qo.f28633a.getObjectVolatile(this, f19975a);
            Object objM6823d = in2Var.m6823d();
            if (objM6823d != in2.f21574e) {
                return objM6823d;
            }
            AbstractC1078qo.f28633a.compareAndSwapObject(this, f19975a, in2Var, in2Var.m6822c());
        }
    }
}
