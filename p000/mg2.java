package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mg2 extends mt2 implements g83 {

    /* JADX INFO: renamed from: o */
    public float f24883o;

    /* JADX INFO: renamed from: p */
    public boolean f24884p;

    @Override // p000.g83
    /* JADX INFO: renamed from: q0 */
    public final Object mo5931q0(Object obj) {
        nr3 nr3Var = obj instanceof nr3 ? (nr3) obj : null;
        if (nr3Var == null) {
            nr3Var = new nr3();
            nr3Var.f26055a = 0.0f;
            nr3Var.f26056b = true;
        }
        nr3Var.f26055a = this.f24883o;
        nr3Var.f26056b = this.f24884p;
        return nr3Var;
    }
}
