package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ep3 {

    /* JADX INFO: renamed from: a */
    public Object f18355a;

    public final boolean equals(Object obj) {
        return (obj instanceof ep3) && z62.m13387o(this.f18355a, ((ep3) obj).f18355a);
    }

    public final int hashCode() {
        Object obj = this.f18355a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f18355a;
        if (obj instanceof yc1) {
            return "Err(" + ((yc1) obj).f35112a + ')';
        }
        return "Ok(" + obj + ')';
    }
}
