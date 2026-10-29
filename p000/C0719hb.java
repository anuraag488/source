package p000;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0719hb extends v21 {

    /* JADX INFO: renamed from: J */
    public C0940nb f20462J;

    /* JADX INFO: renamed from: K */
    public w10 f20463K;

    /* JADX INFO: renamed from: L */
    public xh1 f20464L;

    /* JADX INFO: renamed from: M */
    public ky0 f20465M;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        m6293k1(this.f20463K);
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: S0 */
    public final Object mo6290S0(C1031pe c1031pe, C1312wz c1312wz) {
        Object objM8663d = C0940nb.m8663d(this.f20462J, new C0521cb(c1031pe, this, null), c1312wz);
        return objM8663d == ap0.f14763a ? objM8663d : ju4.f22634a;
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        mo8143j0();
        if (this.f25208n) {
            ky0 ky0Var = sc6.m10652X(this).f33336z;
            ky0 ky0Var2 = this.f20465M;
            if (ky0Var2 == null || !ky0Var2.equals(ky0Var)) {
                this.f20465M = ky0Var;
                m6293k1(this.f20463K);
            }
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: g1 */
    public final boolean mo6291g1() {
        return this.f20462J.m8672j();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j1 */
    public final Object m6292j1(float f, ym0 ym0Var) {
        C0569db c0569db;
        nl3 nl3Var;
        if (ym0Var instanceof C0569db) {
            c0569db = (C0569db) ym0Var;
            int i = c0569db.f16891w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0569db.f16891w = i - Integer.MIN_VALUE;
            } else {
                c0569db = new C0569db(this, ym0Var);
            }
        } else {
            c0569db = new C0569db(this, ym0Var);
        }
        Object obj = c0569db.f16889u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0569db.f16891w;
        if (i2 == 0) {
            k43.m7376J(obj);
            this.f20462J.getClass();
            nl3 nl3Var2 = new nl3();
            nl3Var2.f25933a = f;
            C0940nb c0940nb = this.f20462J;
            C0644fb c0644fb = new C0644fb(this, nl3Var2, f, null);
            c0569db.f16888t = nl3Var2;
            c0569db.f16891w = 2;
            if (C0940nb.m8663d(c0940nb, c0644fb, c0569db) == ap0Var) {
                return ap0Var;
            }
            nl3Var = nl3Var2;
        } else {
            if (i2 == 1) {
                k43.m7376J(obj);
                return obj;
            }
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nl3Var = c0569db.f16888t;
            k43.m7376J(obj);
        }
        return new Float(nl3Var.f25933a);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m6293k1(w10 w10Var) {
        xh1 xh1VarM3535b = w10Var;
        if (w10Var == null) {
            rq4 rq4Var = AbstractC1212ua.f31742a;
            C0891m c0891m = AbstractC1212ua.f31743b;
            ky0 ky0Var = sc6.m10652X(this).f33336z;
            this.f20465M = ky0Var;
            xh1VarM3535b = AbstractC0485bb.m3535b(this.f20462J, ky0Var, c0891m, rq4Var);
        }
        this.f20464L = xh1VarM3535b;
    }
}
