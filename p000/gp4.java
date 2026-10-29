package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gp4 extends rw2 {

    /* JADX INFO: renamed from: o */
    public final rw2 f20007o;

    /* JADX INFO: renamed from: p */
    public final boolean f20008p;

    /* JADX INFO: renamed from: q */
    public final boolean f20009q;

    /* JADX INFO: renamed from: r */
    public yp1 f20010r;

    /* JADX INFO: renamed from: s */
    public yp1 f20011s;

    /* JADX INFO: renamed from: t */
    public final long f20012t;

    /* JADX WARN: Illegal instructions before constructor call */
    public gp4(rw2 rw2Var, yp1 yp1Var, yp1 yp1Var2, boolean z, boolean z2) {
        yp1 yp1VarMo5017i;
        yp1 yp1VarMo3783e;
        r54 r54Var = k94.f23010a;
        super(0L, i94.f21191e, k94.m7452i(yp1Var, (rw2Var == null || (yp1VarMo3783e = rw2Var.mo3783e()) == null) ? k94.f23019j.f29678e : yp1VarMo3783e, z), k94.m7453j(yp1Var2, (rw2Var == null || (yp1VarMo5017i = rw2Var.mo5017i()) == null) ? k94.f23019j.f29679f : yp1VarMo5017i));
        this.f20007o = rw2Var;
        this.f20008p = z;
        this.f20009q = z2;
        this.f20010r = this.f29678e;
        this.f20011s = this.f29679f;
        this.f20012t = oh6.m9110p();
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: B */
    public final void mo6056B(mw2 mw2Var) {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: C */
    public final rw2 mo6057C(yp1 yp1Var, yp1 yp1Var2) {
        yp1 yp1VarM7452i = k94.m7452i(yp1Var, this.f20010r, true);
        yp1 yp1VarM7453j = k94.m7453j(yp1Var2, this.f20011s);
        return !this.f20008p ? new gp4(m6058D().mo6057C(null, yp1VarM7453j), yp1VarM7452i, yp1VarM7453j, false, true) : m6058D().mo6057C(yp1VarM7452i, yp1VarM7453j);
    }

    /* JADX INFO: renamed from: D */
    public final rw2 m6058D() {
        rw2 rw2Var = this.f20007o;
        return rw2Var == null ? k94.f23019j : rw2Var;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: c */
    public final void mo3384c() {
        rw2 rw2Var;
        this.f17914c = true;
        if (!this.f20009q || (rw2Var = this.f20007o) == null) {
            return;
        }
        rw2Var.mo3384c();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: d */
    public final i94 mo5014d() {
        return m6058D().mo5014d();
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: e */
    public final yp1 mo3783e() {
        return this.f20010r;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: f */
    public final boolean mo3784f() {
        return m6058D().mo3784f();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: g */
    public final long mo5015g() {
        return m6058D().mo5015g();
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: h */
    public final int mo5016h() {
        return m6058D().mo5016h();
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: i */
    public final yp1 mo5017i() {
        return this.f20011s;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: k */
    public final void mo5019k() {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: l */
    public final void mo5020l() {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: m */
    public final void mo5021m() {
        m6058D().mo5021m();
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: n */
    public final void mo5022n(hc4 hc4Var) {
        m6058D().mo5022n(hc4Var);
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: r */
    public final void mo5025r(i94 i94Var) {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: s */
    public final void mo5026s(long j) {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: t */
    public final void mo5027t(int i) {
        m6058D().mo5027t(i);
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: u */
    public final e94 mo3785u(yp1 yp1Var) {
        yp1 yp1VarM7452i = k94.m7452i(yp1Var, this.f20010r, true);
        return !this.f20008p ? k94.m7448e(m6058D().mo3785u(null), yp1VarM7452i, true) : m6058D().mo3785u(yp1VarM7452i);
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: w */
    public final y42 mo3385w() {
        return m6058D().mo3385w();
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: x */
    public final mw2 mo6059x() {
        return m6058D().mo6059x();
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: y */
    public final yp1 mo3783e() {
        return this.f20010r;
    }
}
