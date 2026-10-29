package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rm4 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public nv2 f29419o;

    /* JADX INFO: renamed from: p */
    public boolean f29420p;

    /* JADX INFO: renamed from: q */
    public ag1 f29421q;

    /* JADX INFO: renamed from: r */
    public boolean f29422r;

    /* JADX INFO: renamed from: s */
    public C0910mi f29423s;

    /* JADX INFO: renamed from: t */
    public C0910mi f29424t;

    /* JADX INFO: renamed from: u */
    public float f29425u;

    /* JADX INFO: renamed from: v */
    public float f29426v;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        lb5.m7910S(m8391C0(), null, null, new C0982og((Object) this, (wm0) null, (byte) 28), 3);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        this.f29423s = null;
        this.f29424t = null;
        this.f29426v = Float.NaN;
        this.f29425u = Float.NaN;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        float f;
        byte b = 0;
        byte b2 = 1;
        boolean z = (sq2Var.mo5827h(kl0.m7539i(j)) == 0 || sq2Var.mo5824Z(kl0.m7538h(j)) == 0) ? false : true;
        if (this.f29422r) {
            f = 28.0f;
        } else {
            f = (z || this.f29420p) ? 24.0f : 16.0f;
        }
        float fMo3575E = zq2Var.mo3575E(f);
        C0910mi c0910mi = this.f29424t;
        int iFloatValue = (int) (c0910mi != null ? ((Number) c0910mi.m8328d()).floatValue() : fMo3575E);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            s32.m10514a("width and height must be >= 0");
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8016h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo3575E2 = zq2Var.mo3575E((32.0f - zq2Var.mo3572A0(fMo3575E)) / 2.0f);
        float fMo3575E3 = zq2Var.mo3575E(24.0f);
        boolean z2 = this.f29422r;
        if (z2 && this.f29420p) {
            fMo3575E2 = fMo3575E3 - zq2Var.mo3575E(2.0f);
        } else if (z2 && !this.f29420p) {
            fMo3575E2 = zq2Var.mo3575E(2.0f);
        } else if (this.f29420p) {
            fMo3575E2 = fMo3575E3;
        }
        C0910mi c0910mi2 = this.f29424t;
        wm0 wm0Var = null;
        Float f2 = c0910mi2 != null ? (Float) c0910mi2.f24931e.getValue() : null;
        if (f2 == null || f2.floatValue() != fMo3575E) {
            lb5.m7910S(m8391C0(), null, null, new qm4(this, fMo3575E, wm0Var, b), 3);
        }
        C0910mi c0910mi3 = this.f29423s;
        Float f3 = c0910mi3 != null ? (Float) c0910mi3.f24931e.getValue() : null;
        if (f3 == null || f3.floatValue() != fMo3575E2) {
            lb5.m7910S(m8391C0(), null, null, new qm4(this, fMo3575E2, wm0Var, b2), 3);
        }
        if (Float.isNaN(this.f29426v) && Float.isNaN(this.f29425u)) {
            this.f29426v = fMo3575E;
            this.f29425u = fMo3575E2;
        }
        C0979od c0979od = new C0979od((byte) 2);
        c0979od.f26628c = db3VarMo5826e;
        c0979od.f26629d = this;
        c0979od.f26627b = fMo3575E2;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iFloatValue, iFloatValue, w71.f33134a, c0979od);
    }
}
