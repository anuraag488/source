package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p11 implements Comparable {

    /* JADX INFO: renamed from: a */
    public float f27285a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ p11 m9350a(float f) {
        p11 p11Var = new p11();
        p11Var.f27285a = f;
        VarHandle.storeStoreFence();
        return p11Var;
    }

    /* JADX INFO: renamed from: b */
    public static int m9351b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9352c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m9353d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m9351b(this.f27285a, ((p11) obj).f27285a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p11) && Float.compare(this.f27285a, ((p11) obj).f27285a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27285a);
    }

    public final String toString() {
        return m9353d(this.f27285a);
    }
}
