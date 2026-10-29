package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ml4 {

    /* JADX INFO: renamed from: a */
    public pa4 f25003a;

    /* JADX INFO: renamed from: b */
    public pa4 f25004b;

    /* JADX INFO: renamed from: c */
    public pa4 f25005c;

    /* JADX INFO: renamed from: d */
    public pa4 f25006d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ml4)) {
            return false;
        }
        ml4 ml4Var = (ml4) obj;
        return z62.m13387o(this.f25003a, ml4Var.f25003a) && z62.m13387o(this.f25004b, ml4Var.f25004b) && z62.m13387o(this.f25005c, ml4Var.f25005c) && z62.m13387o(this.f25006d, ml4Var.f25006d);
    }

    public final int hashCode() {
        pa4 pa4Var = this.f25003a;
        int iHashCode = (pa4Var != null ? pa4Var.hashCode() : 0) * 31;
        pa4 pa4Var2 = this.f25004b;
        int iHashCode2 = (iHashCode + (pa4Var2 != null ? pa4Var2.hashCode() : 0)) * 31;
        pa4 pa4Var3 = this.f25005c;
        int iHashCode3 = (iHashCode2 + (pa4Var3 != null ? pa4Var3.hashCode() : 0)) * 31;
        pa4 pa4Var4 = this.f25006d;
        return iHashCode3 + (pa4Var4 != null ? pa4Var4.hashCode() : 0);
    }
}
