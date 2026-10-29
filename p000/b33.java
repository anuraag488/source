package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b33 {

    /* JADX INFO: renamed from: a */
    public long f15059a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ b33 m3423a(long j) {
        b33 b33Var = new b33();
        b33Var.f15059a = j;
        VarHandle.storeStoreFence();
        return b33Var;
    }

    /* JADX INFO: renamed from: b */
    public static long m3424b(long j, float f, int i) {
        float fIntBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3425c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final float m3426d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    /* JADX INFO: renamed from: e */
    public static final float m3427e(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: f */
    public static final float m3428f(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final long m3429g(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h */
    public static final long m3430h(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: i */
    public static final long m3431i(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: j */
    public static String m3432j(long j) {
        return (9223372034707292159L & j) != 9205357640488583168L ? zi4.m13622v("Offset(", c20.m3803H(Float.intBitsToFloat((int) (j >> 32))), ", ", c20.m3803H(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b33) && this.f15059a == ((b33) obj).f15059a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15059a);
    }

    public final String toString() {
        return m3432j(this.f15059a);
    }
}
