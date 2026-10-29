package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xv3 extends hz2 {

    /* JADX INFO: renamed from: a */
    public final wv3 f34645a;

    public xv3(wv3 wv3Var) {
        this.f34645a = wv3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xv3.class != obj.getClass()) {
            return false;
        }
        return z62.m13387o(this.f34645a, ((xv3) obj).f34645a);
    }

    public final int hashCode() {
        return this.f34645a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.f34645a + ")";
    }
}
