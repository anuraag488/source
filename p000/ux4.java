package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32237a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gx1[] f32238b;

    public /* synthetic */ ux4(byte b) {
        this.f32237a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        float fM13759D;
        byte b = this.f32237a;
        gx1[] gx1VarArr = this.f32238b;
        cb3 cb3Var = (cb3) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                fM13759D = zt5.m13759D(cb3Var, false, gx1VarArr, fFloatValue);
                break;
            default:
                fM13759D = zt5.m13759D(cb3Var, true, gx1VarArr, fFloatValue);
                break;
        }
        return Float.valueOf(fM13759D);
    }
}
