package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ap3 extends AbstractC0888lx {
    public ap3(wm0 wm0Var) {
        super(wm0Var);
        if (wm0Var == null || wm0Var.getContext() == r71.f29063a) {
            return;
        }
        C1077qn.m9987m("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return r71.f29063a;
    }
}
