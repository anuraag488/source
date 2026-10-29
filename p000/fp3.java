package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fp3 extends w82 {

    /* JADX INFO: renamed from: e */
    public y82 f19213e;

    @Override // p000.w82
    /* JADX INFO: renamed from: n */
    public final boolean mo3514n() {
        return false;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: o */
    public final void mo3515o(Throwable th) {
        Object objM4983O = m12167m().m4983O();
        boolean z = objM4983O instanceof ff0;
        y82 y82Var = this.f19213e;
        if (z) {
            y82Var.resumeWith(k43.m7389n(((ff0) objM4983O).f18941a));
        } else {
            y82Var.resumeWith(f92.m5616a(objM4983O));
        }
    }
}
