package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35994a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0910mi f35995b;

    public /* synthetic */ zd0(byte b) {
        this.f35994a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f35994a;
        ju4 ju4Var = ju4.f22634a;
        C0910mi c0910mi = this.f35995b;
        jp3 jp3Var = (jp3) obj;
        switch (b) {
            case 0:
                jp3Var.m7256j(((Number) c0910mi.m8328d()).floatValue());
                break;
            case 1:
                jp3Var.m7253b(((Number) c0910mi.m8328d()).floatValue());
                break;
            case 2:
                jp3Var.m7253b(((Number) c0910mi.m8328d()).floatValue());
                break;
            case 3:
                jp3Var.m7253b(((Number) c0910mi.m8328d()).floatValue());
                break;
            default:
                jp3Var.m7263v(Float.intBitsToFloat((int) (((b33) c0910mi.m8328d()).f15059a >> 32)));
                jp3Var.m7264w(Float.intBitsToFloat((int) (((b33) c0910mi.m8328d()).f15059a & 4294967295L)));
                break;
        }
        return ju4Var;
    }
}
