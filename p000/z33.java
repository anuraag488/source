package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class z33 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f35740a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f35740a;
        a43 a43Var = new a43();
        a43Var.f100o = yp1Var;
        return a43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z33) && this.f35740a == ((z33) obj).f35740a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((a43) mt2Var).f100o = this.f35740a;
    }

    public final int hashCode() {
        return this.f35740a.hashCode();
    }
}
