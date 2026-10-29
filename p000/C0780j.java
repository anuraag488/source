package p000;

/* JADX INFO: renamed from: j */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0780j implements hj3 {

    /* JADX INFO: renamed from: a */
    public static final C0780j f21912a = new C0780j();

    /* JADX INFO: renamed from: b */
    public static final double f21913b = ((Math.log(65504.0d) / dl0.f17141a) + 9.72d) / 17.52d;

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public final float mo6008i(float f) {
        double dPow;
        double d = f;
        if (d <= 0.155251141552511d) {
            dPow = (d - 0.0729055341958355d) / 10.5402377416545d;
        } else {
            dPow = d < f21913b ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d;
        }
        return (float) dPow;
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public final float mo6009j(float f) {
        double d = f;
        return (float) (d < 0.0078125d ? (d * 10.5402377416545d) + 0.0729055341958355d : (((double) ((float) (Math.log(d) / dl0.f17141a))) + 9.72d) / 17.52d);
    }
}
