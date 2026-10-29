package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h74 {

    /* JADX INFO: renamed from: a */
    public long f20418a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ h74 m6269a(long j) {
        h74 h74Var = new h74();
        h74Var.f20418a = j;
        VarHandle.storeStoreFence();
        return h74Var;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6270b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final float m6271c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final float m6272d(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: e */
    public static final float m6273e(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m6274f(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public static String m6275g(long j) {
        return j != 9205357640488583168L ? zi4.m13622v("Size(", c20.m3803H(Float.intBitsToFloat((int) (j >> 32))), ", ", c20.m3803H(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h74) && this.f20418a == ((h74) obj).f20418a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20418a);
    }

    public final String toString() {
        return m6275g(this.f20418a);
    }
}
