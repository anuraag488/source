package p000;

/* JADX INFO: renamed from: qm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1076qm implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28560a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0766im f28561b;

    public /* synthetic */ C1076qm(byte b) {
        this.f28560a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28560a;
        ju4 ju4Var = ju4.f22634a;
        C0766im c0766im = this.f28561b;
        mi0 mi0Var = (mi0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                y62.m12957a(c0766im, mi0Var, vd6.m11838V(1));
                break;
            case 1:
                num.getClass();
                y62.m12961c(c0766im, mi0Var, vd6.m11838V(1));
                break;
            case 2:
                int iIntValue = num.intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    y62.m12961c(c0766im, ir1Var, 0);
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                ir1 ir1Var2 = (ir1) mi0Var;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    y62.m12957a(c0766im, ir1Var2, 0);
                }
                break;
        }
        return ju4Var;
    }
}
