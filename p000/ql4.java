package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ql4 {

    /* JADX INFO: renamed from: b */
    public static final long f28556b = sc6.m10657b(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f28557c = 0;

    /* JADX INFO: renamed from: a */
    public long f28558a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ql4 m9897a(long j) {
        ql4 ql4Var = new ql4();
        ql4Var.f28558a = j;
        VarHandle.storeStoreFence();
        return ql4Var;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9898b(long j, Object obj) {
        return (obj instanceof ql4) && j == ((ql4) obj).f28558a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9899c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9900d(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static final int m9901e(long j) {
        return m9902f(j) - m9903g(j);
    }

    /* JADX INFO: renamed from: f */
    public static final int m9902f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final int m9903g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m9904h(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: i */
    public static String m9905i(long j) {
        return d55.m4367l("TextRange(", (int) (j >> 32), ", ", (int) (j & 4294967295L), ")");
    }

    public final boolean equals(Object obj) {
        return m9898b(this.f28558a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f28558a);
    }

    public final String toString() {
        return m9905i(this.f28558a);
    }
}
