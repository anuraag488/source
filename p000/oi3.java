package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oi3 {

    /* JADX INFO: renamed from: a */
    @s24("app")
    public final C1336xm f26762a;

    public oi3(C1336xm c1336xm) {
        this.f26762a = c1336xm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi3) && z62.m13387o(this.f26762a, ((oi3) obj).f26762a);
    }

    public final int hashCode() {
        return this.f26762a.hashCode();
    }

    public final String toString() {
        return "QualitySignals(appStats=" + this.f26762a + ")";
    }
}
