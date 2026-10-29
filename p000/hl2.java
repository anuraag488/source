package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hl2 extends jl2 {

    /* JADX INFO: renamed from: a */
    public String f20671a;

    /* JADX INFO: renamed from: b */
    public ml4 f20672b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl2)) {
            return false;
        }
        hl2 hl2Var = (hl2) obj;
        return this.f20671a.equals(hl2Var.f20671a) && z62.m13387o(this.f20672b, hl2Var.f20672b);
    }

    public final int hashCode() {
        int iHashCode = this.f20671a.hashCode() * 31;
        ml4 ml4Var = this.f20672b;
        return (iHashCode + (ml4Var != null ? ml4Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return zi4.m13621u("LinkAnnotation.Clickable(tag=", this.f20671a, ")");
    }
}
