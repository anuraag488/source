package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c03 extends e94 {

    /* JADX INFO: renamed from: e */
    public final yp1 f15736e;

    /* JADX INFO: renamed from: f */
    public final e94 f15737f;

    public c03(long j, i94 i94Var, yp1 yp1Var, e94 e94Var) {
        super(j, i94Var);
        this.f15736e = yp1Var;
        this.f15737f = e94Var;
        e94Var.mo5019k();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: c */
    public final void mo3384c() {
        e94 e94Var = this.f15737f;
        if (this.f17914c) {
            return;
        }
        if (this.f17913b != e94Var.mo5015g()) {
            m5012a();
        }
        e94Var.mo5020l();
        this.f17914c = true;
        synchronized (k94.f23012c) {
            m5023o();
        }
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: e */
    public final yp1 mo3783e() {
        return this.f15736e;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: f */
    public final boolean mo3784f() {
        return true;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: u */
    public final e94 mo3785u(yp1 yp1Var) {
        return new c03(this.f17913b, this.f17912a, k94.m7452i(yp1Var, this.f15736e, true), this.f15737f);
    }
}
