package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v84 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32464a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nl3 f32465b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f32466c;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f32464a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                nl3 nl3Var = this.f32465b;
                yp1 yp1Var = this.f32466c;
                float fFloatValue = nl3Var.f25933a - ((Float) obj).floatValue();
                nl3Var.f25933a = fFloatValue;
                yp1Var.invoke(Float.valueOf(fFloatValue));
                break;
            default:
                nl3 nl3Var2 = this.f32465b;
                yp1 yp1Var2 = this.f32466c;
                float fFloatValue2 = nl3Var2.f25933a - ((Float) obj).floatValue();
                nl3Var2.f25933a = fFloatValue2;
                yp1Var2.invoke(Float.valueOf(fFloatValue2));
                break;
        }
        return ju4Var;
    }
}
