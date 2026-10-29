package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yy0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35612a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f35613b;

    public /* synthetic */ yy0(byte b) {
        this.f35612a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f35612a;
        ju4 ju4Var = ju4.f22634a;
        yp1 yp1Var = this.f35613b;
        switch (b) {
            case 0:
                yp1Var.invoke(Boolean.TRUE);
                return ju4Var;
            case 1:
                Boolean bool = Boolean.TRUE;
                yp1Var.invoke(bool);
                return bool;
            case 2:
                yp1Var.invoke(Boolean.FALSE);
                return Boolean.TRUE;
            case 3:
                yp1Var.invoke(Boolean.FALSE);
                return ju4Var;
            case 4:
                yp1Var.invoke(Boolean.TRUE);
                return ju4Var;
            case 5:
                yp1Var.invoke(new xk4(7, 0L, (String) null));
                return ju4Var;
            default:
                f12 f12Var = new f12(null, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 225);
                yp1Var.invoke(f12Var);
                return f12Var.m5449e();
        }
    }
}
