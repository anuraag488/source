package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iv1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21817a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nv2 f21818b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f21819c;

    public /* synthetic */ iv1(byte b) {
        this.f21817a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21817a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                nv2 nv2Var = this.f21818b;
                int i = this.f21819c;
                ((Integer) obj2).intValue();
                qq2.m10018b(nv2Var, (mi0) obj, vd6.m11838V(i | 1));
                break;
            default:
                nv2 nv2Var2 = this.f21818b;
                int i2 = this.f21819c;
                ((Integer) obj2).intValue();
                qq2.m10018b(nv2Var2, (mi0) obj, vd6.m11838V(i2 | 1));
                break;
        }
        return ju4Var;
    }
}
