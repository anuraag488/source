package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j52 {

    /* JADX INFO: renamed from: a */
    public long f22027a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ j52 m7021a(long j) {
        j52 j52Var = new j52();
        j52Var.f22027a = j;
        VarHandle.storeStoreFence();
        return j52Var;
    }

    /* JADX INFO: renamed from: b */
    public static long m7022b(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j52) && this.f22027a == ((j52) obj).f22027a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22027a);
    }

    public final String toString() {
        long j = this.f22027a;
        return "(" + ((int) (j >> 32)) + ", " + ((int) (j & 4294967295L)) + ')';
    }
}
