package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r11 {

    /* JADX INFO: renamed from: a */
    public long f28953a;

    public final boolean equals(Object obj) {
        return (obj instanceof r11) && this.f28953a == ((r11) obj).f28953a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28953a);
    }

    public final String toString() {
        long j = this.f28953a;
        return j != 9205357640488583168L ? zi4.m13622v("(", p11.m9353d(Float.intBitsToFloat((int) (j >> 32))), ", ", p11.m9353d(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "DpOffset.Unspecified";
    }
}
