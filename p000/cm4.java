package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cm4 {

    /* JADX INFO: renamed from: a */
    public long f16128a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cm4 m4047a(long j) {
        cm4 cm4Var = new cm4();
        cm4Var.f16128a = j;
        VarHandle.storeStoreFence();
        return cm4Var;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4048b(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cm4) && this.f16128a == ((cm4) obj).f16128a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16128a);
    }

    public final String toString() {
        long j = this.f16128a;
        if (m4048b(j, 0L)) {
            return "Unspecified";
        }
        if (m4048b(j, 4294967296L)) {
            return "Sp";
        }
        return m4048b(j, 8589934592L) ? "Em" : "Invalid";
    }
}
