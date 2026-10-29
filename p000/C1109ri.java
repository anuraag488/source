package p000;

/* JADX INFO: renamed from: ri */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1109ri extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f29299i = 0;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ nt2 f29300j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ pg0 f29301k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f29302l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f29303m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f29304n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f29305o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f29306p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109ri(tw2 tw2Var, nt2 nt2Var, p91 p91Var, mc1 mc1Var, String str, pg0 pg0Var, int i) {
        super(2);
        this.f29303m = tw2Var;
        this.f29300j = nt2Var;
        this.f29304n = p91Var;
        this.f29305o = mc1Var;
        this.f29306p = str;
        this.f29301k = pg0Var;
        this.f29302l = i;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29299i;
        ju4 ju4Var = ju4.f22634a;
        int i = this.f29302l;
        Object obj3 = this.f29306p;
        Object obj4 = this.f29305o;
        Object obj5 = this.f29304n;
        Object obj6 = this.f29303m;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iM11838V = vd6.m11838V(i | 1);
                nt2 nt2Var = this.f29300j;
                ev0.m5330E((dp4) obj6, nt2Var, (yp1) obj5, (InterfaceC0520ca) obj3, (yp1) obj4, this.f29301k, (mi0) obj, iM11838V);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM11838V2 = vd6.m11838V(i | 1);
                nt2 nt2Var2 = this.f29300j;
                z62.m13370b((tw2) obj6, nt2Var2, (p91) obj5, (mc1) obj4, (String) obj3, this.f29301k, (mi0) obj, iM11838V2);
                break;
            default:
                ((Number) obj2).intValue();
                int iM11838V3 = vd6.m11838V(i | 1);
                nt2 nt2Var3 = this.f29300j;
                z62.m13376e((dp4) obj6, (yp1) obj5, nt2Var3, (p91) obj4, (mc1) obj3, this.f29301k, (mi0) obj, iM11838V3);
                break;
        }
        return ju4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109ri(dp4 dp4Var, yp1 yp1Var, nt2 nt2Var, p91 p91Var, mc1 mc1Var, pg0 pg0Var, int i) {
        super(2);
        this.f29303m = dp4Var;
        this.f29304n = yp1Var;
        this.f29300j = nt2Var;
        this.f29305o = p91Var;
        this.f29306p = mc1Var;
        this.f29301k = pg0Var;
        this.f29302l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109ri(dp4 dp4Var, nt2 nt2Var, yp1 yp1Var, InterfaceC0520ca interfaceC0520ca, yp1 yp1Var2, pg0 pg0Var, int i) {
        super(2);
        this.f29303m = dp4Var;
        this.f29300j = nt2Var;
        this.f29304n = yp1Var;
        this.f29306p = interfaceC0520ca;
        this.f29305o = yp1Var2;
        this.f29301k = pg0Var;
        this.f29302l = i;
    }
}
