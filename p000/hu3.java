package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hu3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20882a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ iu3 f20883b;

    public /* synthetic */ hu3(byte b) {
        this.f20882a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20882a;
        iu3 iu3Var = this.f20883b;
        switch (b) {
            case 0:
                lu3 lu3Var = iu3Var.f21807c;
                return Boolean.valueOf(lu3Var != null ? lu3Var.mo8110b(obj) : true);
            default:
                iu3Var.mo6171f(obj);
                return ju4.f22634a;
        }
    }
}
