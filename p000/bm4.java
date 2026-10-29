package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bm4 {

    /* JADX INFO: renamed from: b */
    public static final cm4[] f15418b = {cm4.m4047a(0), cm4.m4047a(4294967296L), cm4.m4047a(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f15419c = vd6.m11825I(0, Float.NaN);

    /* JADX INFO: renamed from: a */
    public long f15420a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ bm4 m3631a(long j) {
        bm4 bm4Var = new bm4();
        bm4Var.f15420a = j;
        VarHandle.storeStoreFence();
        return bm4Var;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3632b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m3633c(long j) {
        return f15418b[(int) ((j & 1095216660480L) >>> 32)].f16128a;
    }

    /* JADX INFO: renamed from: d */
    public static final float m3634d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static String m3635e(long j) {
        long jM3633c = m3633c(j);
        if (cm4.m4048b(jM3633c, 0L)) {
            return "Unspecified";
        }
        if (cm4.m4048b(jM3633c, 4294967296L)) {
            return m3634d(j) + ".sp";
        }
        if (!cm4.m4048b(jM3633c, 8589934592L)) {
            return "Invalid";
        }
        return m3634d(j) + ".em";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bm4) && this.f15420a == ((bm4) obj).f15420a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15420a);
    }

    public final String toString() {
        return m3635e(this.f15420a);
    }
}
