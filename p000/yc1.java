package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 {

    /* JADX INFO: renamed from: a */
    public Throwable f35112a;

    public final boolean equals(Object obj) {
        return (obj instanceof yc1) && this.f35112a.equals(((yc1) obj).f35112a);
    }

    public final int hashCode() {
        return this.f35112a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f35112a + ')';
    }
}
