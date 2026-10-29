package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class am2 extends cm2 {

    /* JADX INFO: renamed from: a */
    public final zs0 f14626a = zs0.f36338b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am2.class != obj.getClass()) {
            return false;
        }
        return this.f14626a.equals(((am2) obj).f14626a);
    }

    public final int hashCode() {
        return this.f14626a.hashCode() + (am2.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f14626a + '}';
    }
}
