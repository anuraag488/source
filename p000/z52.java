package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z52 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35755a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ u93 f35756b;

    public /* synthetic */ z52(byte b) {
        this.f35755a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35755a;
        ju4 ju4Var = ju4.f22634a;
        u93 u93Var = this.f35756b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b(u93Var.getTitle(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262142);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    l02.m7759a(u93Var.getIcon(), null, 0L, ir1Var2, 48, 12);
                }
                break;
        }
        return ju4Var;
    }
}
