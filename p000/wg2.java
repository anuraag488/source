package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wg2 extends st2 {

    /* JADX INFO: renamed from: a */
    public ag1 f33365a;

    /* JADX INFO: renamed from: b */
    public ag1 f33366b;

    /* JADX INFO: renamed from: c */
    public ag1 f33367c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        ag1 ag1Var = this.f33365a;
        ag1 ag1Var2 = this.f33366b;
        ag1 ag1Var3 = this.f33367c;
        xg2 xg2Var = new xg2();
        xg2Var.f34268o = ag1Var;
        xg2Var.f34269p = ag1Var2;
        xg2Var.f34270q = ag1Var3;
        return xg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg2)) {
            return false;
        }
        wg2 wg2Var = (wg2) obj;
        return z62.m13387o(this.f33365a, wg2Var.f33365a) && z62.m13387o(this.f33366b, wg2Var.f33366b) && z62.m13387o(this.f33367c, wg2Var.f33367c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        xg2 xg2Var = (xg2) mt2Var;
        xg2Var.f34268o = this.f33365a;
        xg2Var.f34269p = this.f33366b;
        xg2Var.f34270q = this.f33367c;
    }

    public final int hashCode() {
        ag1 ag1Var = this.f33365a;
        int iHashCode = (ag1Var == null ? 0 : ag1Var.hashCode()) * 31;
        ag1 ag1Var2 = this.f33366b;
        int iHashCode2 = (iHashCode + (ag1Var2 == null ? 0 : ag1Var2.hashCode())) * 31;
        ag1 ag1Var3 = this.f33367c;
        return iHashCode2 + (ag1Var3 != null ? ag1Var3.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f33365a + ", placementSpec=" + this.f33366b + ", fadeOutSpec=" + this.f33367c + ")";
    }
}
