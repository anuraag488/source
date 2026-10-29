package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class zg2 extends st2 {

    /* JADX INFO: renamed from: a */
    public ei2 f36060a;

    /* JADX INFO: renamed from: b */
    public b30 f36061b;

    /* JADX INFO: renamed from: c */
    public d63 f36062c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        ei2 ei2Var = this.f36060a;
        b30 b30Var = this.f36061b;
        d63 d63Var = this.f36062c;
        ch2 ch2Var = new ch2();
        ch2Var.f16018o = ei2Var;
        ch2Var.f16019p = b30Var;
        ch2Var.f16020q = d63Var;
        return ch2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg2)) {
            return false;
        }
        zg2 zg2Var = (zg2) obj;
        return z62.m13387o(this.f36060a, zg2Var.f36060a) && z62.m13387o(this.f36061b, zg2Var.f36061b) && this.f36062c == zg2Var.f36062c;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ch2 ch2Var = (ch2) mt2Var;
        ei2 ei2Var = this.f36060a;
        b30 b30Var = this.f36061b;
        d63 d63Var = this.f36062c;
        ch2Var.f16018o = ei2Var;
        ch2Var.f16019p = b30Var;
        ch2Var.f16020q = d63Var;
    }

    public final int hashCode() {
        return this.f36062c.hashCode() + zi4.m13611k((this.f36061b.hashCode() + (this.f36060a.hashCode() * 31)) * 31, 31, false);
    }
}
