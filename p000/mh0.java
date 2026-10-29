package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 implements lk2 {

    /* JADX INFO: renamed from: a */
    public ok2 f24910a;

    /* JADX INFO: renamed from: b */
    public fk2 f24911b;

    /* JADX INFO: renamed from: c */
    public fk2 f24912c;

    /* JADX INFO: renamed from: a */
    public final void m8322a() {
        fk2 fk2Var = this.f24911b.ordinal() < this.f24912c.ordinal() ? this.f24911b : this.f24912c;
        ok2 ok2Var = this.f24910a;
        if (ok2Var.f26810h == fk2.f19055b && fk2Var == fk2.f19054a) {
            return;
        }
        ok2Var.m9156h(fk2Var);
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        return this.f24910a;
    }
}
