package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class q45 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f28218a;

    /* JADX INFO: renamed from: b */
    public Object f28219b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f28218a;
        Object obj = this.f28219b;
        r45 r45Var = new r45();
        r45Var.f29008o = f;
        r45Var.f29009p = obj;
        return r45Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q45)) {
            return false;
        }
        q45 q45Var = (q45) obj;
        return q45Var.f28218a == this.f28218a && z62.m13387o(q45Var.f28219b, this.f28219b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        r45 r45Var = (r45) mt2Var;
        r45Var.f29008o = this.f28218a;
        r45Var.f29009p = this.f28219b;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f28218a) * 31;
        Object obj = this.f28219b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
