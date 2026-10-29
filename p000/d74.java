package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d74 extends zh0 {

    /* JADX INFO: renamed from: f */
    public Object f16823f;

    /* JADX INFO: renamed from: g */
    public Object f16824g;

    /* JADX INFO: renamed from: h */
    public mw2 f16825h;

    /* JADX INFO: renamed from: i */
    public mw2 f16826i;

    /* JADX INFO: renamed from: j */
    public y14 f16827j;

    /* JADX INFO: renamed from: k */
    public o04 f16828k;

    /* JADX INFO: renamed from: l */
    public C1040pn f16829l;

    @Override // p000.zh0
    /* JADX INFO: renamed from: i */
    public final void mo4394i(y14 y14Var) {
        this.f16824g = null;
        this.f16826i = null;
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: j */
    public final void mo4395j() {
        synchronized (this.f36084a) {
            try {
                this.f16823f = this.f16824g;
                if (this.f16826i == null) {
                    this.f16825h = null;
                } else {
                    mw2 mw2Var = this.f16825h;
                    if (mw2Var == null) {
                        mw2 mw2Var2 = uv3.f32207a;
                        mw2Var = new mw2();
                        this.f16825h = mw2Var;
                    }
                    this.f16825h = this.f16826i;
                    this.f16826i = mw2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: k */
    public final void mo4396k() {
        this.f16829l.m9573k();
        this.f16824g = null;
        this.f16826i = null;
        synchronized (this.f36084a) {
            this.f16827j = null;
            this.f16823f = null;
            this.f16825h = null;
        }
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: o */
    public final yp1 mo4397o(y14 y14Var) {
        y14 y14Var2 = this.f16827j;
        if (y14Var2 != null && !y14Var2.equals(y14Var)) {
            kd3.m7503b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f16827j = y14Var;
        return this.f16828k;
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: p */
    public final void mo4398p(b80 b80Var) {
        this.f16827j = null;
        this.f16824g = null;
        this.f16826i = null;
        mo4395j();
    }
}
