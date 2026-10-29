package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bt4 implements Comparable {

    /* JADX INFO: renamed from: a */
    public short f15594a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return z62.m13393u(this.f15594a & 65535, ((bt4) obj).f15594a & 65535);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bt4) && this.f15594a == ((bt4) obj).f15594a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f15594a);
    }

    public final String toString() {
        return String.valueOf(this.f15594a & 65535);
    }
}
