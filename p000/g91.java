package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f19666i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ p91 f19667j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ mc1 f19668k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ b54 f19669l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g91(p91 p91Var, mc1 mc1Var, b54 b54Var, byte b) {
        super(1);
        this.f19666i = b;
        this.f19667j = p91Var;
        this.f19668k = mc1Var;
        this.f19669l = b54Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f19666i;
        p91 p91Var = this.f19667j;
        b54 b54Var = this.f19669l;
        mc1 mc1Var = this.f19668k;
        float f = 1.0f;
        switch (b) {
            case 0:
                int iOrdinal = ((b91) obj).ordinal();
                if (iOrdinal == 0) {
                    xc1 xc1Var = p91Var.f27464a.f16334a;
                    if (xc1Var != null) {
                        f = xc1Var.f34148a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    xc1 xc1Var2 = mc1Var.f24813a.f16334a;
                    f = xc1Var2 != null ? xc1Var2.f34148a : b54Var.f15094f;
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((b91) obj).ordinal();
                if (iOrdinal2 == 0) {
                    rv3 rv3Var = p91Var.f27464a.f16337d;
                    if (rv3Var != null) {
                        f = rv3Var.f29666a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    rv3 rv3Var2 = mc1Var.f24813a.f16337d;
                    f = rv3Var2 != null ? rv3Var2.f29666a : b54Var.f15095g;
                }
                return Float.valueOf(f);
        }
    }
}
