package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class m74 extends st2 {

    /* JADX INFO: renamed from: a */
    public final float f24715a;

    /* JADX INFO: renamed from: b */
    public final float f24716b;

    /* JADX INFO: renamed from: c */
    public final float f24717c;

    /* JADX INFO: renamed from: d */
    public final float f24718d;

    /* JADX INFO: renamed from: e */
    public final boolean f24719e;

    public m74(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        o74 o74Var = new o74();
        o74Var.f26414o = this.f24715a;
        o74Var.f26415p = this.f24716b;
        o74Var.f26416q = this.f24717c;
        o74Var.f26417r = this.f24718d;
        o74Var.f26418s = this.f24719e;
        return o74Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m74)) {
            return false;
        }
        m74 m74Var = (m74) obj;
        return p11.m9352c(this.f24715a, m74Var.f24715a) && p11.m9352c(this.f24716b, m74Var.f24716b) && p11.m9352c(this.f24717c, m74Var.f24717c) && p11.m9352c(this.f24718d, m74Var.f24718d) && this.f24719e == m74Var.f24719e;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        o74 o74Var = (o74) mt2Var;
        o74Var.f26414o = this.f24715a;
        o74Var.f26415p = this.f24716b;
        o74Var.f26416q = this.f24717c;
        o74Var.f26417r = this.f24718d;
        o74Var.f26418s = this.f24719e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24719e) + c75.m3874f(this.f24718d, c75.m3874f(this.f24717c, c75.m3874f(this.f24716b, Float.hashCode(this.f24715a) * 31, 31), 31), 31);
    }

    public m74(float f, float f2, float f3, float f4, boolean z) {
        this.f24715a = f;
        this.f24716b = f2;
        this.f24717c = f3;
        this.f24718d = f4;
        this.f24719e = z;
    }
}
