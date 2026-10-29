package p000;

/* JADX INFO: renamed from: tp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1190tp {

    /* JADX INFO: renamed from: a */
    public final vt1 f31297a;

    public C1190tp(vt1 vt1Var) {
        this.f31297a = vt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1190tp) && z62.m13387o(this.f31297a, ((C1190tp) obj).f31297a);
    }

    public final int hashCode() {
        return this.f31297a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f31297a + ", loaderKey=null)";
    }
}
