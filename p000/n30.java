package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n30 extends AbstractC1085qv {

    /* JADX INFO: renamed from: a */
    public b70 f25416a;

    /* JADX INFO: renamed from: b */
    public yp1 f25417b;

    @Override // p000.AbstractC1085qv
    /* JADX INFO: renamed from: a */
    public final void mo8485a() {
        this.f25417b = null;
        this.f25416a = null;
    }

    @Override // p000.AbstractC1085qv
    /* JADX INFO: renamed from: b */
    public final void mo8486b(Throwable th) {
        b70 b70Var = this.f25416a;
        if (b70Var != null) {
            b70Var.resumeWith(k43.m7389n(th));
        }
    }
}
