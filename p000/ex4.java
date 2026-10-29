package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ex4 {

    /* JADX INFO: renamed from: a */
    public AbstractC0654fk f18562a;

    /* JADX INFO: renamed from: b */
    public g51 f18563b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex4)) {
            return false;
        }
        ex4 ex4Var = (ex4) obj;
        return z62.m13387o(this.f18562a, ex4Var.f18562a) && z62.m13387o(this.f18563b, ex4Var.f18563b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f18563b.hashCode() + (this.f18562a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f18562a + ", easing=" + this.f18563b + ", arcMode=ArcMode(value=0))";
    }
}
