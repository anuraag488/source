package p000;

/* JADX INFO: renamed from: rj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1110rj extends ue2 implements nq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1147sj f29337i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ p91 f29338j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ mc1 f29339k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1110rj(InterfaceC1147sj interfaceC1147sj, p91 p91Var, mc1 mc1Var) {
        super(3);
        this.f29337i = interfaceC1147sj;
        this.f29338j = p91Var;
        this.f29339k = mc1Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ir1 ir1Var = (ir1) ((mi0) obj2);
        ir1Var.m6885d0(1840112047);
        nt2 nt2VarMo7630d = ((nt2) obj).mo7630d(k91.m7437b(this.f29337i.mo2997b(), this.f29338j, this.f29339k, null, "animateEnterExit", ir1Var, 0, 28));
        ir1Var.m6912r(false);
        return nt2VarMo7630d;
    }
}
