package p000;

/* JADX INFO: renamed from: jw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class C0813jw extends st2 {

    /* JADX INFO: renamed from: a */
    public long f22696a;

    /* JADX INFO: renamed from: b */
    public float f22697b;

    /* JADX INFO: renamed from: c */
    public p44 f22698c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        long j = this.f22696a;
        p44 p44Var = this.f22698c;
        C0850kw c0850kw = new C0850kw();
        c0850kw.f23548o = j;
        c0850kw.f23549p = p44Var;
        c0850kw.f23550q = 9205357640488583168L;
        return c0850kw;
    }

    public final boolean equals(Object obj) {
        C0813jw c0813jw = obj instanceof C0813jw ? (C0813jw) obj : null;
        if (c0813jw == null) {
            return false;
        }
        long j = this.f22696a;
        long j2 = c0813jw.f22696a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && this.f22697b == c0813jw.f22697b && z62.m13387o(this.f22698c, c0813jw.f22698c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        C0850kw c0850kw = (C0850kw) mt2Var;
        c0850kw.f23548o = this.f22696a;
        p44 p44Var = c0850kw.f23549p;
        p44 p44Var2 = this.f22698c;
        if (!z62.m13387o(p44Var, p44Var2)) {
            c0850kw.f23549p = p44Var2;
            y70.m13004E(c0850kw);
        }
        z62.m13348G(c0850kw);
    }

    public final int hashCode() {
        long j = this.f22696a;
        int i = pb0.f27502i;
        return this.f22698c.hashCode() + c75.m3874f(this.f22697b, Long.hashCode(j) * 961, 31);
    }
}
