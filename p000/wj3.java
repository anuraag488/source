package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wj3 extends e94 {

    /* JADX INFO: renamed from: e */
    public yp1 f33429e;

    /* JADX INFO: renamed from: f */
    public int f33430f;

    @Override // p000.e94
    /* JADX INFO: renamed from: c */
    public final void mo3384c() {
        if (this.f17914c) {
            return;
        }
        mo5020l();
        this.f17914c = true;
        synchronized (k94.f23012c) {
            m5023o();
        }
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: e */
    public final yp1 mo3783e() {
        return this.f33429e;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: f */
    public final boolean mo3784f() {
        return true;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: i */
    public final yp1 mo5017i() {
        return null;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: k */
    public final void mo5019k() {
        this.f33430f++;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: l */
    public final void mo5020l() {
        int i = this.f33430f - 1;
        this.f33430f = i;
        if (i == 0) {
            m5012a();
        }
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: n */
    public final void mo5022n(hc4 hc4Var) {
        r54 r54Var = k94.f23010a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: u */
    public final e94 mo3785u(yp1 yp1Var) {
        k94.m7465v(this);
        return new c03(this.f17913b, this.f17912a, k94.m7452i(yp1Var, this.f33429e, true), this);
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: m */
    public final void mo5021m() {
    }
}
