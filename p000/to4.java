package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class to4 {

    /* JADX INFO: renamed from: b */
    public static final long f31292b = zp0.m13673e(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f31293c = 0;

    /* JADX INFO: renamed from: a */
    public long f31294a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ to4 m11080a(long j) {
        to4 to4Var = new to4();
        to4Var.f31294a = j;
        VarHandle.storeStoreFence();
        return to4Var;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11081b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static String m11082c(long j) {
        return "TransformOrigin(packedValue=" + j + ")";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof to4) && this.f31294a == ((to4) obj).f31294a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31294a);
    }

    public final String toString() {
        return m11082c(this.f31294a);
    }
}
