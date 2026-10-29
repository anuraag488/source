package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ci0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ b70 f16041b;

    public /* synthetic */ ci0(byte b) {
        this.f16040a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f16040a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                b70 b70Var = this.f16041b;
                if (b70Var.m3496t() instanceof s13) {
                    b70Var.resumeWith(obj);
                }
                break;
            case 1:
                this.f16041b.resumeWith(dp3.m4637a(((dp3) obj).f17257a));
                break;
            default:
                this.f16041b.resumeWith(ju4Var);
                break;
        }
        return ju4Var;
    }
}
