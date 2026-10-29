package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lc6 extends zh0 {

    /* JADX INFO: renamed from: f */
    public boolean f23955f;

    public lc6(oa6 oa6Var) {
        this.f36084a = oa6Var;
        oa6Var.f26505A++;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo4615u() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m7955v() {
        if (this.f23955f) {
            return;
        }
        C1077qn.m9989o("Not initialized");
    }

    /* JADX INFO: renamed from: x */
    public final void m7956x() {
        if (this.f23955f) {
            C1077qn.m9989o("Can't initialize twice");
        } else {
            if (mo4615u()) {
                return;
            }
            ((oa6) this.f36084a).f26507C.incrementAndGet();
            this.f23955f = true;
        }
    }
}
