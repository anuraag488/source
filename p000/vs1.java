package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vs1 implements xs1 {

    /* JADX INFO: renamed from: a */
    public og3 f32829a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs1) && z62.m13387o(this.f32829a, ((vs1) obj).f32829a);
    }

    public final int hashCode() {
        return this.f32829a.hashCode();
    }

    public final String toString() {
        return "Success(product=" + this.f32829a + ")";
    }
}
