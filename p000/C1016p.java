package p000;

/* JADX INFO: renamed from: p */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1016p implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27251a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0950nl f27252b;

    public /* synthetic */ C1016p(byte b) {
        this.f27251a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27251a;
        ju4 ju4Var = ju4.f22634a;
        C0950nl c0950nl = this.f27252b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b(c0950nl.f25923d, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262142);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1238v.m11688a(c0950nl, (mi0) obj, vd6.m11838V(1));
                break;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    lb5.m7918a(c0950nl.f25920a ? "ca-app-pub-3940256099942544/9214589741" : "ca-app-pub-9158627376176162/3214584219", null, null, ir1Var2, 0);
                }
                break;
        }
        return ju4Var;
    }
}
