package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class dl1 extends st2 {

    /* JADX INFO: renamed from: a */
    public gl1 f17142a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        gl1 gl1Var = this.f17142a;
        il1 il1Var = new il1();
        il1Var.f21528o = gl1Var;
        return il1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl1) && z62.m13387o(this.f17142a, ((dl1) obj).f17142a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((il1) mt2Var).f21528o = this.f17142a;
    }

    public final int hashCode() {
        return this.f17142a.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f17142a + ")";
    }
}
