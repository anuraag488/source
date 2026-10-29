package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 {

    /* JADX INFO: renamed from: a */
    public et0 f19269a;

    /* JADX INFO: renamed from: b */
    public et0 f19270b;

    /* JADX INFO: renamed from: c */
    public double f19271c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft0)) {
            return false;
        }
        ft0 ft0Var = (ft0) obj;
        return this.f19269a == ft0Var.f19269a && this.f19270b == ft0Var.f19270b && Double.compare(this.f19271c, ft0Var.f19271c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19271c) + ((this.f19270b.hashCode() + (this.f19269a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f19269a + ", crashlytics=" + this.f19270b + ", sessionSamplingRate=" + this.f19271c + ')';
    }
}
