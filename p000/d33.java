package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class d33 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f16761a;

    /* JADX INFO: renamed from: b */
    public boolean f16762b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f16761a;
        boolean z = this.f16762b;
        e33 e33Var = new e33();
        e33Var.f17663o = yp1Var;
        e33Var.f17664p = z;
        return e33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d33 d33Var = obj instanceof d33 ? (d33) obj : null;
        return d33Var != null && this.f16761a == d33Var.f16761a && this.f16762b == d33Var.f16762b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        e33 e33Var = (e33) mt2Var;
        yp1 yp1Var = this.f16761a;
        boolean z = this.f16762b;
        if (e33Var.f17663o != yp1Var || e33Var.f17664p != z) {
            sc6.m10652X(e33Var).m12268W(false);
        }
        e33Var.f17663o = yp1Var;
        e33Var.f17664p = z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16762b) + (this.f16761a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f16761a + ", rtlAware=" + this.f16762b + ")";
    }
}
