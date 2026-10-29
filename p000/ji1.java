package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ji1 {

    /* JADX INFO: renamed from: a */
    public long f22298a;

    /* JADX INFO: renamed from: a */
    public static long m7130a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ji1) && this.f22298a == ((ji1) obj).f22298a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22298a);
    }

    public final String toString() {
        long j = this.f22298a;
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
