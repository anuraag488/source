package p000;

/* JADX INFO: renamed from: gs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0699gs extends nf0 {

    /* JADX INFO: renamed from: a */
    public C0626eu f20084a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nf0) || !this.f20084a.equals(((C0699gs) ((nf0) obj)).f20084a)) {
            return false;
        }
        Object obj2 = mf0.f24854a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f20084a.hashCode() ^ 1000003) * 1000003) ^ mf0.f24854a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f20084a + ", productIdOrigin=" + mf0.f24854a + "}";
    }
}
