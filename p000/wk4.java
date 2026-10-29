package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wk4 extends mt2 implements bj0, lf2 {

    /* JADX INFO: renamed from: o */
    public xl4 f33451o;

    /* JADX INFO: renamed from: p */
    public is4 f33452p;

    /* JADX INFO: renamed from: q */
    public uk4 f33453q;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        xl4 xl4VarM13512I = zc6.m13512I(this.f33451o, sc6.m10652X(this).f33293A);
        am1 am1Var = (am1) sj3.m10825u(this, ij0.f21476k);
        m12318O0(xl4VarM13512I, am1Var);
        df2 df2Var = sc6.m10652X(this).f33293A;
        ky0 ky0Var = sc6.m10652X(this).f33336z;
        is4 is4Var = this.f33452p;
        if (is4Var == null) {
            throw d55.m4375t("Font resolution state is not set.");
        }
        Object value = is4Var.getValue();
        uk4 uk4Var = new uk4();
        uk4Var.f31953a = df2Var;
        uk4Var.f31954b = ky0Var;
        uk4Var.f31955c = am1Var;
        uk4Var.f31956d = xl4VarM13512I;
        uk4Var.f31957e = value;
        uk4Var.f31958f = k43.m7398w(Boolean.TRUE);
        uk4Var.f31959g = 0L;
        VarHandle.storeStoreFence();
        this.f33453q = uk4Var;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        this.f33452p = null;
        this.f33453q = null;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m12318O0(xl4 xl4Var, am1 am1Var) {
        pa4 pa4Var = xl4Var.f34389a;
        bm1 bm1Var = pa4Var.f27483f;
        xm1 xm1Var = pa4Var.f27480c;
        if (xm1Var == null) {
            xm1Var = xm1.f34413f;
        }
        tm1 tm1Var = pa4Var.f27481d;
        int i = tm1Var != null ? tm1Var.f31237a : 0;
        um1 um1Var = pa4Var.f27482e;
        this.f33452p = ((cm1) am1Var).m4044b(bm1Var, xm1Var, i, um1Var != null ? um1Var.f31990a : 65535);
        z62.m13349H(this);
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        uk4 uk4Var = this.f33453q;
        if (uk4Var != null) {
            uk4.m11580a(uk4Var, null, sc6.m10652X(this).f33336z, null, 29);
        }
        z62.m13349H(this);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        uk4 uk4Var = this.f33453q;
        if (uk4Var == null) {
            throw d55.m4375t("Min size state is not set.");
        }
        d83 d83Var = uk4Var.f31958f;
        is4 is4Var = this.f33452p;
        if (is4Var == null) {
            throw d55.m4375t("Font resolution state is not set.");
        }
        Object value = is4Var.getValue();
        if (!z62.m13387o(value, uk4Var.f31957e)) {
            uk4Var.f31957e = value;
            d83Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) d83Var.getValue()).booleanValue()) {
            uk4Var.f31959g = zj4.m13627a(uk4Var.f31956d, uk4Var.f31954b, uk4Var.f31955c);
            d83Var.setValue(Boolean.FALSE);
        }
        long j2 = uk4Var.f31959g;
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8013e(j, ll0.m8010b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 14);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: z0 */
    public final void mo4199z0() {
        uk4 uk4Var = this.f33453q;
        if (uk4Var != null) {
            uk4.m11580a(uk4Var, sc6.m10652X(this).f33293A, null, null, 30);
        }
        z62.m13349H(this);
    }
}
