package p000;

/* JADX INFO: renamed from: i */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0744i implements hj3 {

    /* JADX INFO: renamed from: a */
    public static final C0744i f20960a = new C0744i();

    /* JADX INFO: renamed from: b */
    public static final double f20961b = ((Math.log(65504.0d) / dl0.f17141a) + 9.72d) / 17.52d;

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public final float mo6008i(float f) {
        double dPow;
        double d = f;
        if (d <= -0.3013698630136986d) {
            dPow = (as4.m3234M(2.0d, (d * 17.52d) - 9.72d) - 1.52587890625E-5d) * 2.0d;
        } else {
            dPow = d < f20961b ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d;
        }
        return (float) dPow;
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public final float mo6009j(float f) {
        double dLog;
        double d = f;
        if (d < 3.0517578125E-5d) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            dLog = Math.log((((double) f) / 2.0d) + 1.52587890625E-5d) / dl0.f17141a;
        } else {
            dLog = (float) (Math.log(d) / dl0.f17141a);
        }
        return (float) ((dLog + 9.72d) / 17.52d);
    }
}
