package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h63 extends lb5 {

    /* JADX INFO: renamed from: o */
    public final jl3 f20408o;

    public h63(jl3 jl3Var) {
        this.f20408o = jl3Var;
    }

    @Override // p000.lb5
    /* JADX INFO: renamed from: M */
    public final jl3 mo5906M() {
        return this.f20408o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h63) {
            return this.f20408o.equals(((h63) obj).f20408o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20408o.hashCode();
    }
}
