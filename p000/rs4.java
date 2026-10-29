package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rs4 implements Comparable {

    /* JADX INFO: renamed from: a */
    public int f29588a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return z62.m13393u(this.f29588a ^ Integer.MIN_VALUE, ((rs4) obj).f29588a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rs4) && this.f29588a == ((rs4) obj).f29588a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29588a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f29588a) & 4294967295L);
    }
}
