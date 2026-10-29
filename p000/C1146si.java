package p000;

/* JADX INFO: renamed from: si */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1146si extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f30285i = 0;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ dp4 f30286j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ yp1 f30287k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ nt2 f30288l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ pg0 f30289m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f30290n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f30291o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f30292p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f30293q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146si(dp4 dp4Var, yp1 yp1Var, nt2 nt2Var, p91 p91Var, mc1 mc1Var, mq1 mq1Var, pg0 pg0Var, int i) {
        super(2);
        this.f30286j = dp4Var;
        this.f30287k = yp1Var;
        this.f30288l = nt2Var;
        this.f30291o = p91Var;
        this.f30292p = mc1Var;
        this.f30293q = mq1Var;
        this.f30289m = pg0Var;
        this.f30290n = i;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f30285i;
        ju4 ju4Var = ju4.f22634a;
        int i = this.f30290n;
        Object obj3 = this.f30293q;
        Object obj4 = this.f30292p;
        Object obj5 = this.f30291o;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iM11838V = vd6.m11838V(i | 1);
                dp4 dp4Var = this.f30286j;
                nt2 nt2Var = this.f30288l;
                yp1 yp1Var = this.f30287k;
                ev0.m5332G(dp4Var, nt2Var, yp1Var, (InterfaceC0520ca) obj3, (yp1) obj5, (yp1) obj4, this.f30289m, (mi0) obj, iM11838V);
                break;
            default:
                ((Number) obj2).intValue();
                int iM11838V2 = vd6.m11838V(i | 1);
                dp4 dp4Var2 = this.f30286j;
                yp1 yp1Var2 = this.f30287k;
                nt2 nt2Var2 = this.f30288l;
                z62.m13368a(dp4Var2, yp1Var2, nt2Var2, (p91) obj5, (mc1) obj4, (mq1) obj3, this.f30289m, (mi0) obj, iM11838V2);
                break;
        }
        return ju4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146si(dp4 dp4Var, nt2 nt2Var, yp1 yp1Var, InterfaceC0520ca interfaceC0520ca, yp1 yp1Var2, yp1 yp1Var3, pg0 pg0Var, int i) {
        super(2);
        this.f30286j = dp4Var;
        this.f30288l = nt2Var;
        this.f30287k = yp1Var;
        this.f30293q = interfaceC0520ca;
        this.f30291o = yp1Var2;
        this.f30292p = yp1Var3;
        this.f30289m = pg0Var;
        this.f30290n = i;
    }
}
