package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ti4 {
    /* JADX INFO: renamed from: a */
    public static double m11059a(rv1 rv1Var) {
        double[] dArrM10637I = sc6.m10637I(rv1Var.f29660a);
        double dAtan2 = (Math.atan2(dArrM10637I[2], dArrM10637I[1]) * 57.29577951308232d) % 360.0d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        double dPow = Math.pow(Math.hypot(dArrM10637I[1], dArrM10637I[2]), 1.07d) * 0.02d;
        double d = (dAtan2 - 50.0d) % 360.0d;
        if (d < 0.0d) {
            d += 360.0d;
        }
        return (Math.cos(d * 0.017453292519943295d) * dPow) - 0.5d;
    }
}
