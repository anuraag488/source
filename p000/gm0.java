package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gm0 extends st2 {

    /* JADX INFO: renamed from: a */
    public final i73 f19874a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0520ca f19875b;

    /* JADX INFO: renamed from: c */
    public final jm0 f19876c;

    /* JADX INFO: renamed from: d */
    public final float f19877d;

    /* JADX INFO: renamed from: e */
    public final o00 f19878e;

    public gm0(i73 i73Var, InterfaceC0520ca interfaceC0520ca, jm0 jm0Var, float f, o00 o00Var) {
        this.f19874a = i73Var;
        this.f19875b = interfaceC0520ca;
        this.f19876c = jm0Var;
        this.f19877d = f;
        this.f19878e = o00Var;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        hm0 hm0Var = new hm0();
        hm0Var.f20691o = this.f19874a;
        hm0Var.f20692p = this.f19875b;
        hm0Var.f20693q = this.f19876c;
        hm0Var.f20694r = this.f19877d;
        hm0Var.f20695s = this.f19878e;
        return hm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return z62.m13387o(this.f19874a, gm0Var.f19874a) && z62.m13387o(this.f19875b, gm0Var.f19875b) && z62.m13387o(this.f19876c, gm0Var.f19876c) && Float.compare(this.f19877d, gm0Var.f19877d) == 0 && z62.m13387o(this.f19878e, gm0Var.f19878e);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        hm0 hm0Var = (hm0) mt2Var;
        long jMo40g = hm0Var.f20691o.mo40g();
        i73 i73Var = this.f19874a;
        boolean zM6270b = h74.m6270b(jMo40g, i73Var.mo40g());
        hm0Var.f20691o = i73Var;
        hm0Var.f20692p = this.f19875b;
        hm0Var.f20693q = this.f19876c;
        hm0Var.f20694r = this.f19877d;
        hm0Var.f20695s = this.f19878e;
        if (!zM6270b) {
            z62.m13349H(hm0Var);
        }
        z62.m13348G(hm0Var);
    }

    public final int hashCode() {
        int iM3874f = c75.m3874f(this.f19877d, (this.f19876c.hashCode() + ((this.f19875b.hashCode() + (this.f19874a.hashCode() * 31)) * 31)) * 31, 31);
        o00 o00Var = this.f19878e;
        return iM3874f + (o00Var == null ? 0 : o00Var.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f19874a + ", alignment=" + this.f19875b + ", contentScale=" + this.f19876c + ", alpha=" + this.f19877d + ", colorFilter=" + this.f19878e + ')';
    }
}
