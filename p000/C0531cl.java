package p000;

/* JADX INFO: renamed from: cl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0531cl implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16096a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ho4 f16097b;

    public /* synthetic */ C0531cl(byte b) {
        this.f16096a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f16096a;
        ju4 ju4Var = ju4.f22634a;
        ho4 ho4Var = this.f16097b;
        switch (b) {
            case 0:
                ho4Var.f20756a = -(((int) (((w52) obj).f33109a & 4294967295L)) - ho4Var.f20759d.m13399h());
                break;
            default:
                ho4Var.m6465b(((Number) ((C1370yj) obj).f35255e.getValue()).floatValue());
                break;
        }
        return ju4Var;
    }
}
