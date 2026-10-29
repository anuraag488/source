package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class np3 implements k11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26019a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ double f26020b;

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public final double mo7356e(double d) {
        switch (this.f26019a) {
            case 0:
                double d2 = this.f26020b;
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, 1.0d / d2);
            default:
                double d3 = this.f26020b;
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, d3);
        }
    }
}
