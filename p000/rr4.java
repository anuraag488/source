package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rr4 implements vq4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Class f29551a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Class f29552b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ uq4 f29553c;

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        Class cls = cs4Var.f16429a;
        if (cls == this.f29551a || cls == this.f29552b) {
            return this.f29553c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f29552b.getName() + "+" + this.f29551a.getName() + ",adapter=" + this.f29553c + "]";
    }
}
