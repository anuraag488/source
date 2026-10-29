package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j90 extends st2 {

    /* JADX INFO: renamed from: a */
    public C0499bp f22108a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C0499bp c0499bp = this.f22108a;
        i90 i90Var = new i90();
        i90Var.f21183o = c0499bp;
        return i90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && this.f22108a == ((j90) obj).f22108a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        i90 i90Var = (i90) mt2Var;
        i90Var.f21183o = this.f22108a;
        y70.m13004E(i90Var);
    }

    public final int hashCode() {
        return this.f22108a.hashCode();
    }
}
