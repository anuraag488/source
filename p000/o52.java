package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o52 {

    /* JADX INFO: renamed from: a */
    public long f26352a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ o52 m8954a(long j) {
        o52 o52Var = new o52();
        o52Var.f26352a = j;
        VarHandle.storeStoreFence();
        return o52Var;
    }

    /* JADX INFO: renamed from: b */
    public static long m8955b(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8956c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final long m8957d(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m8958e(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: f */
    public static String m8959f(long j) {
        return d55.m4367l("(", (int) (j >> 32), ", ", (int) (j & 4294967295L), ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o52) && this.f26352a == ((o52) obj).f26352a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26352a);
    }

    public final String toString() {
        return m8959f(this.f26352a);
    }
}
