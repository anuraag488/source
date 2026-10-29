package p000;

/* JADX INFO: renamed from: cw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0553cw implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16520a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ny2 f16521b;

    public /* synthetic */ C0553cw(byte b) {
        this.f16520a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16520a;
        ju4 ju4Var = ju4.f22634a;
        ny2 ny2Var = this.f16521b;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    ny2Var.m8898a(0, ir1Var);
                }
                break;
            case 1:
                ir1 ir1Var2 = (ir1) mi0Var;
                if (!ir1Var2.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    ny2Var.m8898a(0, ir1Var2);
                }
                break;
            default:
                ir1 ir1Var3 = (ir1) mi0Var;
                if (!ir1Var3.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var3.m6874W();
                } else {
                    ny2Var.m8898a(0, ir1Var3);
                }
                break;
        }
        return ju4Var;
    }
}
