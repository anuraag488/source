package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b92 extends w82 {

    /* JADX INFO: renamed from: e */
    public final g04 f15172e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ e92 f15173f;

    public b92(e92 e92Var, g04 g04Var) {
        this.f15173f = e92Var;
        this.f15172e = g04Var;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: n */
    public final boolean mo3514n() {
        return false;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: o */
    public final void mo3515o(Throwable th) {
        e92 e92Var = this.f15173f;
        Object objM4983O = e92Var.m4983O();
        if (!(objM4983O instanceof ff0)) {
            objM4983O = f92.m5616a(objM4983O);
        }
        this.f15172e.m5880i(e92Var, objM4983O);
    }
}
