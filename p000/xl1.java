package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xl1 extends qx0 implements g14, ns1, bj0, y23, pp4 {

    /* JADX INFO: renamed from: w */
    public static final r50 f34379w = new r50((byte) 8);

    /* JADX INFO: renamed from: q */
    public nv2 f34380q;

    /* JADX INFO: renamed from: r */
    public final yp1 f34381r;

    /* JADX INFO: renamed from: s */
    public rk1 f34382s;

    /* JADX INFO: renamed from: t */
    public qh2 f34383t;

    /* JADX INFO: renamed from: u */
    public e13 f34384u;

    /* JADX INFO: renamed from: v */
    public final sl1 f34385v;

    public xl1(nv2 nv2Var, int i, C0633f0 c0633f0) {
        this.f34380q = nv2Var;
        this.f34381r = c0633f0;
        sl1 sl1Var = new sl1(i, new pl1(2, this, xl1.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 1), 10);
        m10154O0(sl1Var);
        this.f34385v = sl1Var;
    }

    @Override // p000.ns1
    /* JADX INFO: renamed from: B */
    public final void mo43B(e13 e13Var) {
        this.f34384u = e13Var;
        if (this.f34385v.m10858T0().m8794a()) {
            if (!e13Var.mo4871Z0().f25208n) {
                m12706S0();
                return;
            }
            e13 e13Var2 = this.f34384u;
            if (e13Var2 == null || !e13Var2.mo4871Z0().f25208n) {
                return;
            }
            m12706S0();
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        qh2 qh2Var = this.f34383t;
        if (qh2Var != null) {
            qh2Var.m9888b();
        }
        this.f34383t = null;
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        ql3 ql3Var = new ql3();
        C0675g4 c0675g4 = new C0675g4((byte) 29);
        c0675g4.f19600b = ql3Var;
        c0675g4.f19601c = this;
        VarHandle.storeStoreFence();
        c20.m3797B(this, c0675g4);
        qh2 qh2Var = (qh2) ql3Var.f28555a;
        if (this.f34385v.m10858T0().m8794a()) {
            qh2 qh2Var2 = this.f34383t;
            if (qh2Var2 != null) {
                qh2Var2.m9888b();
            }
            if (qh2Var != null) {
                qh2Var.m9887a();
            } else {
                qh2Var = null;
            }
            this.f34383t = qh2Var;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m12705R0(nv2 nv2Var, tk1 tk1Var) {
        w01 w01VarMo4972C;
        if (!this.f25208n) {
            nv2Var.m8861b(tk1Var);
            return;
        }
        t82 t82Var = (t82) ((um0) m8391C0()).f31989a.get(o85.f26448h);
        wm0 wm0Var = null;
        if (t82Var != null) {
            na1 na1Var = new na1((byte) 4);
            na1Var.f25595b = nv2Var;
            na1Var.f25596c = tk1Var;
            VarHandle.storeStoreFence();
            w01VarMo4972C = t82Var.mo4972C(na1Var);
        } else {
            w01VarMo4972C = null;
        }
        lb5.m7910S(m8391C0(), null, null, new C0671g0(nv2Var, tk1Var, w01VarMo4972C, wm0Var, (byte) 21), 3);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m12706S0() {
        C0940nb c0940nb;
        if (this.f25208n) {
            if (!this.f25195a.f25208n) {
                q32.m9721c("visitAncestors called on an unattached node");
            }
            mt2 mt2Var = this.f25195a.f25199e;
            wf2 wf2VarM10652X = sc6.m10652X(this);
            while (wf2VarM10652X != null) {
                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 262144) != 0) {
                    while (mt2Var != null) {
                        if ((mt2Var.f25197c & 262144) != 0) {
                            mt2 mt2VarM10644P = mt2Var;
                            uw2 uw2Var = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof pp4) {
                                    if (yl1.f35315o == ((pp4) mt2VarM10644P).mo3663w()) {
                                        return;
                                    }
                                }
                                if ((mt2VarM10644P.f25197c & 262144) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i = 0;
                                    for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                        if ((mt2Var2.f25197c & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                mt2VarM10644P = mt2Var2;
                                            } else {
                                                if (uw2Var == null) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var.m11663b(mt2Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var);
                            }
                        }
                        mt2Var = mt2Var.f25199e;
                    }
                }
                wf2VarM10652X = wf2VarM10652X.m12295v();
                mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m12707T0(nv2 nv2Var) {
        rk1 rk1Var;
        if (z62.m13387o(this.f34380q, nv2Var)) {
            return;
        }
        nv2 nv2Var2 = this.f34380q;
        if (nv2Var2 != null && (rk1Var = this.f34382s) != null) {
            nv2Var2.m8861b(new sk1(rk1Var));
        }
        this.f34382s = null;
        this.f34380q = nv2Var;
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        boolean zM8794a = this.f34385v.m10858T0().m8794a();
        ic2[] ic2VarArr = o14.f26289a;
        p14 p14Var = m14.f24563l;
        ic2 ic2Var = o14.f26289a[4];
        Boolean boolValueOf = Boolean.valueOf(zM8794a);
        p14Var.getClass();
        q14Var.mo4898a(p14Var, boolValueOf);
        q14Var.mo4898a(d14.f16726w, new C1353y2(null, new C0941nc(0, this, xl1.class, "requestFocus", "requestFocus()Z", 0, (byte) 6)));
    }

    @Override // p000.pp4
    /* JADX INFO: renamed from: w */
    public final Object mo3663w() {
        return f34379w;
    }
}
