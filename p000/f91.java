package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f18852i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ p91 f18853j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ mc1 f18854k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f91(p91 p91Var, mc1 mc1Var, byte b) {
        super(1);
        this.f18852i = b;
        this.f18853j = p91Var;
        this.f18854k = mc1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ag1 ag1Var;
        ag1 ag1Var2;
        ag1 ag1Var3;
        ag1 ag1Var4;
        byte b = this.f18852i;
        mc1 mc1Var = this.f18854k;
        p91 p91Var = this.f18853j;
        switch (b) {
            case 0:
                zo4 zo4Var = (zo4) obj;
                b91 b91Var = b91.f15168a;
                b91 b91Var2 = b91.f15169b;
                if (zo4Var.mo10251b(b91Var, b91Var2)) {
                    xc1 xc1Var = p91Var.f27464a.f16334a;
                    return (xc1Var == null || (ag1Var2 = xc1Var.f34149b) == null) ? k91.f23004b : ag1Var2;
                }
                if (!zo4Var.mo10251b(b91Var2, b91.f15170c)) {
                    return k91.f23004b;
                }
                xc1 xc1Var2 = mc1Var.f24813a.f16334a;
                return (xc1Var2 == null || (ag1Var = xc1Var2.f34149b) == null) ? k91.f23004b : ag1Var;
            default:
                zo4 zo4Var2 = (zo4) obj;
                b91 b91Var3 = b91.f15168a;
                b91 b91Var4 = b91.f15169b;
                if (zo4Var2.mo10251b(b91Var3, b91Var4)) {
                    rv3 rv3Var = p91Var.f27464a.f16337d;
                    return (rv3Var == null || (ag1Var4 = rv3Var.f29668c) == null) ? k91.f23004b : ag1Var4;
                }
                if (!zo4Var2.mo10251b(b91Var4, b91.f15170c)) {
                    return k91.f23004b;
                }
                rv3 rv3Var2 = mc1Var.f24813a.f16337d;
                return (rv3Var2 == null || (ag1Var3 = rv3Var2.f29668c) == null) ? k91.f23004b : ag1Var3;
        }
    }
}
