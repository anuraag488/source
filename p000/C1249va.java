package p000;

/* JADX INFO: renamed from: va */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class C1249va<T> extends st2 {

    /* JADX INFO: renamed from: a */
    public C0940nb f32482a;

    /* JADX INFO: renamed from: b */
    public d63 f32483b;

    /* JADX INFO: renamed from: c */
    public boolean f32484c;

    /* JADX INFO: renamed from: d */
    public w10 f32485d;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C0940nb c0940nb = this.f32482a;
        d63 d63Var = this.f32483b;
        boolean z = this.f32484c;
        w10 w10Var = this.f32485d;
        C0719hb c0719hb = new C0719hb(AbstractC0485bb.f15192a, z, null, d63Var);
        c0719hb.f20462J = c0940nb;
        c0719hb.f20463K = w10Var;
        return c0719hb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1249va)) {
            return false;
        }
        C1249va c1249va = (C1249va) obj;
        return z62.m13387o(this.f32482a, c1249va.f32482a) && this.f32483b == c1249va.f32483b && this.f32484c == c1249va.f32484c && z62.m13387o(this.f32485d, c1249va.f32485d);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        boolean z;
        boolean z2;
        C0719hb c0719hb = (C0719hb) mt2Var;
        C0940nb c0940nb = this.f32482a;
        d63 d63Var = this.f32483b;
        boolean z3 = this.f32484c;
        w10 w10Var = this.f32485d;
        c0719hb.f20463K = w10Var;
        if (z62.m13387o(c0719hb.f20462J, c0940nb)) {
            z = false;
        } else {
            c0719hb.f20462J = c0940nb;
            c0719hb.m6293k1(w10Var);
            z = true;
        }
        if (c0719hb.f32335q != d63Var) {
            c0719hb.f32335q = d63Var;
            z2 = true;
        } else {
            z2 = z;
        }
        c0719hb.m11708i1(c0719hb.f32336r, z3, null, d63Var, z2);
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k((this.f32483b.hashCode() + (this.f32482a.hashCode() * 31)) * 31, 28629151, this.f32484c);
        w10 w10Var = this.f32485d;
        return iM13611k + (w10Var != null ? w10Var.hashCode() : 0);
    }
}
