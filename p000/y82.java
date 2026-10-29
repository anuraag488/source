package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y82 extends b70 {

    /* JADX INFO: renamed from: i */
    public e92 f35020i;

    @Override // p000.b70
    /* JADX INFO: renamed from: A */
    public final String mo3478A() {
        return "AwaitContinuation";
    }

    @Override // p000.b70
    /* JADX INFO: renamed from: q */
    public final Throwable mo3494q(e92 e92Var) {
        Throwable thM147c;
        Object objM4983O = this.f35020i.m4983O();
        if (!(objM4983O instanceof a92) || (thM147c = ((a92) objM4983O).m147c()) == null) {
            return objM4983O instanceof ff0 ? ((ff0) objM4983O).f18941a : e92Var.mo5006u();
        }
        return thM147c;
    }
}
