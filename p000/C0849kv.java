package p000;

/* JADX INFO: renamed from: kv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0849kv implements x60 {

    /* JADX INFO: renamed from: a */
    public C0812jv[] f23528a;

    /* JADX INFO: renamed from: a */
    public final void m7632a() {
        for (C0812jv c0812jv : this.f23528a) {
            w01 w01Var = c0812jv.f22639f;
            if (w01Var == null) {
                z62.m13366Y("handle");
                throw null;
            }
            w01Var.mo3937a();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: b */
    public final void mo5874b(Throwable th) {
        m7632a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f23528a + ']';
    }
}
