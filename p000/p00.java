package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class p00 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f27255a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new q00(this.f27255a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p00) && this.f27255a == ((p00) obj).f27255a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        e13 e13Var;
        q00 q00Var = (q00) mt2Var;
        yp1 yp1Var = this.f27255a;
        q00Var.f28116o = yp1Var;
        if (q00Var.f25195a.f25208n && (e13Var = sc6.m10650V(q00Var, 2).f17628x) != null) {
            e13Var.m4897z1(yp1Var, true);
        }
    }

    public final int hashCode() {
        return this.f27255a.hashCode();
    }
}
