package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 {

    /* JADX INFO: renamed from: a */
    public wf2 f14468a;

    /* JADX INFO: renamed from: b */
    public boolean f14469b;

    /* JADX INFO: renamed from: c */
    public boolean f14470c;

    /* JADX INFO: renamed from: d */
    public sf2 f14471d;

    /* JADX INFO: renamed from: e */
    public boolean f14472e;

    /* JADX INFO: renamed from: f */
    public boolean f14473f;

    /* JADX INFO: renamed from: g */
    public boolean f14474g;

    /* JADX INFO: renamed from: h */
    public int f14475h;

    /* JADX INFO: renamed from: i */
    public int f14476i;

    /* JADX INFO: renamed from: j */
    public boolean f14477j;

    /* JADX INFO: renamed from: k */
    public boolean f14478k;

    /* JADX INFO: renamed from: l */
    public int f14479l;

    /* JADX INFO: renamed from: m */
    public boolean f14480m;

    /* JADX INFO: renamed from: n */
    public boolean f14481n;

    /* JADX INFO: renamed from: o */
    public int f14482o;

    /* JADX INFO: renamed from: p */
    public wq2 f14483p;

    /* JADX INFO: renamed from: q */
    public yo2 f14484q;

    /* JADX INFO: renamed from: a */
    public final e13 m2982a() {
        return (e13) this.f14468a.f33299G.f25608e;
    }

    /* JADX INFO: renamed from: b */
    public final void m2983b() {
        sf2 sf2Var = this.f14468a.f33300H.f14471d;
        if (sf2Var == sf2.f30228c || sf2Var == sf2.f30229d) {
            if (this.f14483p.f33609B) {
                m2988g(true);
            } else {
                m2987f(true);
            }
        }
        if (sf2Var == sf2.f30229d) {
            yo2 yo2Var = this.f14484q;
            if (yo2Var == null || !yo2Var.f35419v) {
                m2989h(true);
            } else {
                m2990i(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2984c(long j) {
        yo2 yo2Var = this.f14484q;
        if (yo2Var != null) {
            sf2 sf2Var = sf2.f30227b;
            ag2 ag2Var = yo2Var.f35403f;
            ag2Var.f14471d = sf2Var;
            wf2 wf2Var = ag2Var.f14468a;
            ag2Var.f14472e = false;
            yo2Var.f35423z = j;
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getSnapshotObserver();
            wo2 wo2Var = yo2Var.f35400A;
            snapshotObserver.f31675a.m159e(wf2Var, snapshotObserver.f31676b, wo2Var);
            ag2Var.f14473f = true;
            ag2Var.f14474g = true;
            boolean zM10039w = qq2.m10039w(wf2Var);
            wq2 wq2Var = ag2Var.f14483p;
            if (zM10039w) {
                wq2Var.f33638w = true;
                wq2Var.f33639x = true;
            } else {
                wq2Var.f33637v = true;
            }
            ag2Var.f14471d = sf2.f30230e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2985d(int i) {
        int i2 = this.f14479l;
        this.f14479l = i;
        if ((i2 == 0) != (i == 0)) {
            wf2 wf2VarM12295v = this.f14468a.m12295v();
            ag2 ag2Var = wf2VarM12295v != null ? wf2VarM12295v.f33300H : null;
            if (ag2Var != null) {
                int i3 = ag2Var.f14479l;
                if (i == 0) {
                    ag2Var.m2985d(i3 - 1);
                } else {
                    ag2Var.m2985d(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2986e(int i) {
        int i2 = this.f14482o;
        this.f14482o = i;
        if ((i2 == 0) != (i == 0)) {
            wf2 wf2VarM12295v = this.f14468a.m12295v();
            ag2 ag2Var = wf2VarM12295v != null ? wf2VarM12295v.f33300H : null;
            if (ag2Var != null) {
                int i3 = ag2Var.f14482o;
                if (i == 0) {
                    ag2Var.m2986e(i3 - 1);
                } else {
                    ag2Var.m2986e(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2987f(boolean z) {
        if (this.f14478k != z) {
            this.f14478k = z;
            if (z && !this.f14477j) {
                m2985d(this.f14479l + 1);
            } else {
                if (z || this.f14477j) {
                    return;
                }
                m2985d(this.f14479l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2988g(boolean z) {
        if (this.f14477j != z) {
            this.f14477j = z;
            if (z && !this.f14478k) {
                m2985d(this.f14479l + 1);
            } else {
                if (z || this.f14478k) {
                    return;
                }
                m2985d(this.f14479l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2989h(boolean z) {
        if (this.f14481n != z) {
            this.f14481n = z;
            if (z && !this.f14480m) {
                m2986e(this.f14482o + 1);
            } else {
                if (z || this.f14480m) {
                    return;
                }
                m2986e(this.f14482o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2990i(boolean z) {
        if (this.f14480m != z) {
            this.f14480m = z;
            if (z && !this.f14481n) {
                m2986e(this.f14482o + 1);
            } else {
                if (z || this.f14481n) {
                    return;
                }
                m2986e(this.f14482o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2991j() {
        wf2 wf2Var = this.f14468a;
        wq2 wq2Var = this.f14483p;
        ag2 ag2Var = wq2Var.f33621f;
        if ((wq2Var.f33634s != null || ag2Var.m2982a().mo4423m() != null) && wq2Var.f33633r) {
            wq2Var.f33633r = false;
            wq2Var.f33634s = ag2Var.m2982a().mo4423m();
            wf2 wf2VarM12295v = wf2Var.m12295v();
            if (wf2VarM12295v != null) {
                wf2.m12245X(wf2VarM12295v, false, 7);
            }
        }
        yo2 yo2Var = this.f14484q;
        if (yo2Var != null) {
            ag2 ag2Var2 = yo2Var.f35403f;
            if (!(yo2Var.f35422y == null && ag2Var2.m2982a().mo4869X0().f32026u.mo4423m() == null) && yo2Var.f35421x) {
                yo2Var.f35421x = false;
                yo2Var.f35422y = ag2Var2.m2982a().mo4869X0().f32026u.mo4423m();
                if (qq2.m10039w(wf2Var)) {
                    wf2 wf2VarM12295v2 = wf2Var.m12295v();
                    if (wf2VarM12295v2 != null) {
                        wf2.m12245X(wf2VarM12295v2, false, 7);
                        return;
                    }
                    return;
                }
                wf2 wf2VarM12295v3 = wf2Var.m12295v();
                if (wf2VarM12295v3 != null) {
                    wf2.m12244V(wf2VarM12295v3, false, 7);
                }
            }
        }
    }
}
