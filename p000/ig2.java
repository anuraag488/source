package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ig2 implements de4 {

    /* JADX INFO: renamed from: a */
    public mv2 f21404a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ jg2 f21405b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21406c;

    @Override // p000.de4
    /* JADX INFO: renamed from: a */
    public final void mo4491a() {
        this.f21405b.m7095h(this.f21406c);
    }

    @Override // p000.de4
    /* JADX INFO: renamed from: b */
    public final void mo4492b(C0607ec c0607ec) {
        C0940nb c0940nb;
        wf2 wf2Var = (wf2) this.f21405b.f22239j.m8132g(this.f21406c);
        mt2 mt2Var = (wf2Var == null || (c0940nb = wf2Var.f33299G) == null) ? null : (mt2) c0940nb.f25610g;
        if (mt2Var == null || !mt2Var.f25208n) {
            return;
        }
        dt0.m4697Z(mt2Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0607ec);
    }

    @Override // p000.de4
    /* JADX INFO: renamed from: c */
    public final int mo4493c() {
        wf2 wf2Var = (wf2) this.f21405b.f22239j.m8132g(this.f21406c);
        if (wf2Var != null) {
            return ((uw2) ((aw2) wf2Var.m12288o()).f14915b).f32213c;
        }
        return 0;
    }

    @Override // p000.de4
    /* JADX INFO: renamed from: d */
    public final void mo4494d(int i, long j) {
        jg2 jg2Var = this.f21405b;
        wf2 wf2Var = (wf2) jg2Var.f22239j.m8132g(this.f21406c);
        if (wf2Var == null || !wf2Var.m12256J()) {
            return;
        }
        int i2 = ((uw2) ((aw2) wf2Var.m12288o()).f14915b).f32213c;
        if (i < 0 || i >= i2) {
            q32.m9723e("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (wf2Var.m12257K()) {
            q32.m9719a("Pre-measure called on node that is not placed");
        }
        wf2 wf2Var2 = jg2Var.f22230a;
        wf2Var2.f33328r = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).m10620t((wf2) ((aw2) wf2Var.m12288o()).get(i), j);
        wf2Var2.f33328r = false;
        this.f21404a.m8403a(i);
    }
}
