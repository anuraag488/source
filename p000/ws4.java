package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ws4 implements Comparable {

    /* JADX INFO: renamed from: a */
    public long f33693a;

    /* JADX INFO: renamed from: a */
    public static final boolean m12408a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return z62.m13394v(this.f33693a ^ Long.MIN_VALUE, ((ws4) obj).f33693a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ws4) && this.f33693a == ((ws4) obj).f33693a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33693a);
    }

    public final String toString() {
        long j = this.f33693a;
        if (j >= 0) {
            y62.m12992v(10);
            return Long.toString(j, 10);
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        y62.m12992v(10);
        String string = Long.toString(j2, 10);
        y62.m12992v(10);
        return string.concat(Long.toString(j3, 10));
    }
}
