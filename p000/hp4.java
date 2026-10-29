package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hp4 extends e94 {

    /* JADX INFO: renamed from: e */
    public final e94 f20769e;

    /* JADX INFO: renamed from: f */
    public final boolean f20770f;

    /* JADX INFO: renamed from: g */
    public final boolean f20771g;

    /* JADX INFO: renamed from: h */
    public yp1 f20772h;

    /* JADX INFO: renamed from: i */
    public final long f20773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp4(e94 e94Var, yp1 yp1Var, boolean z, boolean z2) {
        yp1 yp1VarMo3783e;
        super(0L, i94.f21191e);
        r54 r54Var = k94.f23010a;
        this.f20769e = e94Var;
        this.f20770f = z;
        this.f20771g = z2;
        this.f20772h = k94.m7452i(yp1Var, (e94Var == null || (yp1VarMo3783e = e94Var.mo3783e()) == null) ? k94.f23019j.f29678e : yp1VarMo3783e, z);
        this.f20773i = oh6.m9110p();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: c */
    public final void mo3384c() {
        e94 e94Var;
        this.f17914c = true;
        if (!this.f20771g || (e94Var = this.f20769e) == null) {
            return;
        }
        e94Var.mo3384c();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: d */
    public final i94 mo5014d() {
        return m6469v().mo5014d();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: e */
    public final yp1 mo3783e() {
        return this.f20772h;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: f */
    public final boolean mo3784f() {
        return m6469v().mo3784f();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: g */
    public final long mo5015g() {
        return m6469v().mo5015g();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: i */
    public final yp1 mo5017i() {
        return null;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: k */
    public final void mo5019k() {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: l */
    public final void mo5020l() {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: m */
    public final void mo5021m() {
        m6469v().mo5021m();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: n */
    public final void mo5022n(hc4 hc4Var) {
        m6469v().mo5022n(hc4Var);
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: u */
    public final e94 mo3785u(yp1 yp1Var) {
        yp1 yp1VarM7452i = k94.m7452i(yp1Var, this.f20772h, true);
        return !this.f20770f ? k94.m7448e(m6469v().mo3785u(null), yp1VarM7452i, true) : m6469v().mo3785u(yp1VarM7452i);
    }

    /* JADX INFO: renamed from: v */
    public final e94 m6469v() {
        e94 e94Var = this.f20769e;
        return e94Var == null ? k94.f23019j : e94Var;
    }
}
