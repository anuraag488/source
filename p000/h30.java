package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h30 extends mt2 implements z20, af2 {

    /* JADX INFO: renamed from: o */
    public fm0 f20296o;

    /* JADX INFO: renamed from: p */
    public boolean f20297p;

    /* JADX INFO: renamed from: O0 */
    public static final jl3 m6206O0(h30 h30Var, e13 e13Var, C0675g4 c0675g4) {
        jl3 jl3Var;
        if (h30Var.f25208n && h30Var.f20297p) {
            e13 e13VarM10651W = sc6.m10651W(h30Var);
            if (!e13Var.mo4871Z0().f25208n) {
                e13Var = null;
            }
            if (e13Var != null && (jl3Var = (jl3) c0675g4.invoke()) != null) {
                return jl3Var.m7174j(e13VarM10651W.mo4003Q(e13Var, false).m7169e());
            }
        }
        return null;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.z20
    /* JADX INFO: renamed from: u0 */
    public final Object mo6207u0(e13 e13Var, C0675g4 c0675g4, ym0 ym0Var) {
        C1048pv c1048pv = new C1048pv((byte) 4);
        c1048pv.f28016b = this;
        c1048pv.f28017c = e13Var;
        c1048pv.f28018d = c0675g4;
        VarHandle.storeStoreFence();
        Object objM13685q = zp0.m13685q(new C1218ug((Object) this, (Object) e13Var, (Object) c0675g4, (Object) c1048pv, (wm0) null, (byte) 1), ym0Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    @Override // p000.af2
    /* JADX INFO: renamed from: v */
    public final void mo2965v(cf2 cf2Var) {
        this.f20297p = true;
    }
}
