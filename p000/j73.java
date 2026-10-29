package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class j73 extends st2 {

    /* JADX INFO: renamed from: a */
    public i73 f22071a;

    /* JADX INFO: renamed from: b */
    public boolean f22072b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0520ca f22073c;

    /* JADX INFO: renamed from: d */
    public i50 f22074d;

    /* JADX INFO: renamed from: e */
    public float f22075e;

    /* JADX INFO: renamed from: f */
    public o00 f22076f;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        i73 i73Var = this.f22071a;
        boolean z = this.f22072b;
        InterfaceC0520ca interfaceC0520ca = this.f22073c;
        i50 i50Var = this.f22074d;
        float f = this.f22075e;
        o00 o00Var = this.f22076f;
        k73 k73Var = new k73();
        k73Var.f22962o = i73Var;
        k73Var.f22963p = z;
        k73Var.f22964q = interfaceC0520ca;
        k73Var.f22965r = i50Var;
        k73Var.f22966s = f;
        k73Var.f22967t = o00Var;
        return k73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        return z62.m13387o(this.f22071a, j73Var.f22071a) && this.f22072b == j73Var.f22072b && z62.m13387o(this.f22073c, j73Var.f22073c) && z62.m13387o(this.f22074d, j73Var.f22074d) && Float.compare(this.f22075e, j73Var.f22075e) == 0 && z62.m13387o(this.f22076f, j73Var.f22076f);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        k73 k73Var = (k73) mt2Var;
        i73 i73Var = this.f22071a;
        boolean z = k73Var.f22963p;
        boolean z2 = this.f22072b;
        boolean z3 = z != z2 || (z2 && !h74.m6270b(k73Var.f22962o.mo40g(), i73Var.mo40g()));
        k73Var.f22962o = i73Var;
        k73Var.f22963p = z2;
        k73Var.f22964q = this.f22073c;
        k73Var.f22965r = this.f22074d;
        k73Var.f22966s = this.f22075e;
        k73Var.f22967t = this.f22076f;
        if (z3) {
            z62.m13349H(k73Var);
        }
        z62.m13348G(k73Var);
    }

    public final int hashCode() {
        int iM3874f = c75.m3874f(this.f22075e, (this.f22074d.hashCode() + ((this.f22073c.hashCode() + zi4.m13611k(this.f22071a.hashCode() * 31, 31, this.f22072b)) * 31)) * 31, 31);
        o00 o00Var = this.f22076f;
        return iM3874f + (o00Var == null ? 0 : o00Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f22071a + ", sizeToIntrinsics=" + this.f22072b + ", alignment=" + this.f22073c + ", contentScale=" + this.f22074d + ", alpha=" + this.f22075e + ", colorFilter=" + this.f22076f + ")";
    }
}
