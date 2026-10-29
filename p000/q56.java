package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class q56 extends t36 {

    /* JADX INFO: renamed from: f */
    public boolean f28230f;

    public q56(oa6 oa6Var) {
        super(oa6Var);
        ((oa6) this.f36084a).f26505A++;
    }

    /* JADX INFO: renamed from: u */
    public final void m9741u() {
        if (this.f28230f) {
            return;
        }
        C1077qn.m9989o("Not initialized");
    }

    /* JADX INFO: renamed from: v */
    public final void m9742v() {
        if (this.f28230f) {
            C1077qn.m9989o("Can't initialize twice");
        } else {
            if (mo8203x()) {
                return;
            }
            ((oa6) this.f36084a).f26507C.incrementAndGet();
            this.f28230f = true;
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean mo8203x() {
        return true;
    }
}
