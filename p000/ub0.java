package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31767a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f31768b;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f31767a;
        ju4 ju4Var = ju4.f22634a;
        mq1 mq1Var = this.f31768b;
        Float f = (Float) obj;
        f.floatValue();
        switch (b) {
            case 0:
                mq1Var.invoke(f, Boolean.FALSE);
                break;
            default:
                mq1Var.invoke(f, Boolean.TRUE);
                break;
        }
        return ju4Var;
    }
}
