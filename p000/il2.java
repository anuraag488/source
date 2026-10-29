package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class il2 extends jl2 {

    /* JADX INFO: renamed from: a */
    public String f21529a;

    /* JADX INFO: renamed from: b */
    public ml4 f21530b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il2)) {
            return false;
        }
        il2 il2Var = (il2) obj;
        return this.f21529a.equals(il2Var.f21529a) && z62.m13387o(this.f21530b, il2Var.f21530b);
    }

    public final int hashCode() {
        int iHashCode = this.f21529a.hashCode() * 31;
        ml4 ml4Var = this.f21530b;
        return (iHashCode + (ml4Var != null ? ml4Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return zi4.m13621u("LinkAnnotation.Url(url=", this.f21529a, ")");
    }
}
