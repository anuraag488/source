package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w52 {

    /* JADX INFO: renamed from: a */
    public long f33109a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ w52 m12106a(long j) {
        w52 w52Var = new w52();
        w52Var.f33109a = j;
        VarHandle.storeStoreFence();
        return w52Var;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12107b(long j, Object obj) {
        return (obj instanceof w52) && j == ((w52) obj).f33109a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m12108c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static String m12109d(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return m12107b(this.f33109a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f33109a);
    }

    public final String toString() {
        return m12109d(this.f33109a);
    }
}
