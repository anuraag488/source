package p000;

/* JADX INFO: renamed from: tv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1196tv implements hj3 {

    /* JADX INFO: renamed from: a */
    public static final C1196tv f31463a = new C1196tv();

    /* JADX INFO: renamed from: b */
    public static final double f31464b = (as4.m3234M(0.018d, 0.45d) * 1.099d) - 0.099d;

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public final float mo6008i(float f) {
        double d = f;
        return (d < f31464b ? Float.valueOf(f / 4.5f) : Double.valueOf(as4.m3234M((d + 0.099d) / 1.099d, 2.2222222222222223d))).floatValue();
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public final float mo6009j(float f) {
        double d = f;
        return (float) (d < 0.018d ? d * 4.5d : (as4.m3234M(d, 0.45d) * 1.099d) - 0.099d);
    }
}
