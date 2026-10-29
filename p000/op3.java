package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class op3 implements k11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26936a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ so4 f26937b;

    public /* synthetic */ op3(byte b) {
        this.f26936a = b;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public final double mo7356e(double d) {
        switch (this.f26936a) {
            case 0:
                so4 so4Var = this.f26937b;
                float[] fArr = oc0.f26547a;
                return oc0.m9030a(so4Var, d);
            case 1:
                so4 so4Var2 = this.f26937b;
                float[] fArr2 = oc0.f26547a;
                return oc0.m9032c(so4Var2, d);
            case 2:
                so4 so4Var3 = this.f26937b;
                double d2 = so4Var3.f30446b;
                return d >= so4Var3.f30449e ? Math.pow((d2 * d) + so4Var3.f30447c, so4Var3.f30445a) : so4Var3.f30448d * d;
            case 3:
                so4 so4Var4 = this.f26937b;
                double d3 = so4Var4.f30446b;
                double d4 = so4Var4.f30447c;
                double d5 = so4Var4.f30448d;
                return d >= so4Var4.f30449e ? Math.pow((d3 * d) + d4, so4Var4.f30445a) + so4Var4.f30450f : (d5 * d) + so4Var4.f30451g;
            case 4:
                so4 so4Var5 = this.f26937b;
                float[] fArr3 = oc0.f26547a;
                return oc0.m9031b(so4Var5, d);
            case 5:
                so4 so4Var6 = this.f26937b;
                float[] fArr4 = oc0.f26547a;
                return oc0.m9033d(so4Var6, d);
            case 6:
                so4 so4Var7 = this.f26937b;
                double d6 = so4Var7.f30446b;
                double d7 = so4Var7.f30447c;
                double d8 = so4Var7.f30448d;
                return d >= so4Var7.f30449e * d8 ? (Math.pow(d, 1.0d / so4Var7.f30445a) - d7) / d6 : d / d8;
            default:
                so4 so4Var8 = this.f26937b;
                double d9 = so4Var8.f30446b;
                double d10 = so4Var8.f30447c;
                double d11 = so4Var8.f30448d;
                return d >= so4Var8.f30449e * d11 ? (Math.pow(d - so4Var8.f30450f, 1.0d / so4Var8.f30445a) - d10) / d9 : (d - so4Var8.f30451g) / d11;
        }
    }
}
