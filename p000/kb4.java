package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kb4 implements wm0, bp0 {

    /* JADX INFO: renamed from: a */
    public f80 f23057a;

    /* JADX INFO: renamed from: b */
    public ro0 f23058b;

    @Override // p000.bp0
    public final bp0 getCallerFrame() {
        f80 f80Var = this.f23057a;
        if (f80Var != null) {
            return f80Var;
        }
        return null;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f23058b;
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        this.f23057a.resumeWith(obj);
    }
}
