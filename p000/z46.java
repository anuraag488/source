package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class z46 {
    /* JADX INFO: renamed from: a */
    public static int m13335a(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: b */
    public static void m13336b(String str, long j) {
        if (j >= 0) {
            return;
        }
        C1077qn.m9987m(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13337c(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }
}
