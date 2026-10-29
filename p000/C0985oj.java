package p000;

/* JADX INFO: renamed from: oj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0985oj extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f26769i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f26770j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ nt2 f26771k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ p91 f26772l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ mc1 f26773m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f26774n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ pg0 f26775o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0985oj(boolean z, nt2 nt2Var, p91 p91Var, mc1 mc1Var, String str, pg0 pg0Var, int i, byte b) {
        super(2);
        this.f26769i = b;
        this.f26770j = z;
        this.f26771k = nt2Var;
        this.f26772l = p91Var;
        this.f26773m = mc1Var;
        this.f26774n = str;
        this.f26775o = pg0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26769i;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iM11838V = vd6.m11838V(196609);
                z62.m13372c(this.f26770j, this.f26771k, this.f26772l, this.f26773m, this.f26774n, this.f26775o, (mi0) obj, iM11838V);
                break;
            default:
                ((Number) obj2).intValue();
                int iM11838V2 = vd6.m11838V(1572865);
                z62.m13374d(this.f26770j, this.f26771k, this.f26772l, this.f26773m, this.f26774n, this.f26775o, (mi0) obj, iM11838V2);
                break;
        }
        return ju4Var;
    }
}
