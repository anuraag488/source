package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mj3 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0476b2 f24971a;

    static {
        AbstractC0476b2 ac3Var;
        Integer num = b82.f15154a;
        if (num == null || num.intValue() >= 34) {
            ac3Var = new ac3();
        } else {
            zc1 zc1Var = new zc1();
            zc1Var.f35975b = new C0753i8((byte) 6);
            VarHandle.storeStoreFence();
            ac3Var = zc1Var;
        }
        f24971a = ac3Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo3403a(int i);

    /* JADX INFO: renamed from: b */
    public double mo3404b() {
        return ((((long) mo3403a(26)) << 27) + ((long) mo3403a(27))) / 9.007199254740992E15d;
    }

    /* JADX INFO: renamed from: c */
    public double mo191c() {
        double dMo3404b;
        if (!Double.isInfinite(1.0d) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(1.0d) > Double.MAX_VALUE) {
            dMo3404b = 0.0d + (mo3404b() * 1.0d);
        } else {
            double dMo3404b2 = mo3404b() * 0.5d;
            dMo3404b = 0.0d + dMo3404b2 + dMo3404b2;
        }
        return dMo3404b >= 1.0d ? Math.nextAfter(1.0d, Double.NEGATIVE_INFINITY) : dMo3404b;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo3405d();

    /* JADX INFO: renamed from: e */
    public long mo3406e() {
        return (((long) mo3405d()) << 32) + ((long) mo3405d());
    }

    /* JADX INFO: renamed from: f */
    public long mo192f() {
        long jMo3406e;
        long j;
        do {
            jMo3406e = mo3406e() >>> 1;
            j = jMo3406e % 10000000000000000L;
        } while ((jMo3406e - j) + 9999999999999999L < 0);
        return j;
    }
}
