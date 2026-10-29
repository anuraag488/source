package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zb3 {

    /* JADX INFO: renamed from: a */
    public final mb3 f35919a;

    public zb3(mb3 mb3Var) {
        this.f35919a = mb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zb3) {
            return z62.m13387o(this.f35919a, ((zb3) obj).f35919a);
        }
        return false;
    }

    public final int hashCode() {
        mb3 mb3Var = this.f35919a;
        if (mb3Var != null) {
            return mb3Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f35919a + ")";
    }
}
