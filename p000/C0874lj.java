package p000;

/* JADX INFO: renamed from: lj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0874lj {

    /* JADX INFO: renamed from: a */
    public final r90 f24060a;

    /* JADX INFO: renamed from: b */
    public final Object f24061b;

    public C0874lj(wv3 wv3Var) {
        r90 r90VarM10361a = rl3.m10361a(wv3Var.getClass());
        Object key = wv3Var.getKey();
        this.f24060a = r90VarM10361a;
        this.f24061b = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0874lj)) {
            return false;
        }
        C0874lj c0874lj = (C0874lj) obj;
        return this.f24060a.equals(c0874lj.f24060a) && z62.m13387o(this.f24061b, c0874lj.f24061b);
    }

    public final int hashCode() {
        return this.f24061b.hashCode() + (this.f24060a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedSceneKey(clazz=" + this.f24060a + ", key=" + this.f24061b + ")";
    }
}
