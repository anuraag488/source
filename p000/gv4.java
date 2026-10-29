package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gv4 extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a */
    public final ed1 f20148a;

    public gv4(ed1 ed1Var) {
        this.f20148a = ed1Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f20148a));
    }
}
