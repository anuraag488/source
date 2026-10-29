package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oa4 extends me1 {

    /* JADX INFO: renamed from: a */
    public final d12 f26501a;

    /* JADX INFO: renamed from: b */
    public final String f26502b;

    /* JADX INFO: renamed from: c */
    public final kt0 f26503c;

    public oa4(d12 d12Var, String str, kt0 kt0Var) {
        this.f26501a = d12Var;
        this.f26502b = str;
        this.f26503c = kt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa4)) {
            return false;
        }
        oa4 oa4Var = (oa4) obj;
        return this.f26501a.equals(oa4Var.f26501a) && z62.m13387o(this.f26502b, oa4Var.f26502b) && this.f26503c == oa4Var.f26503c;
    }

    public final int hashCode() {
        int iHashCode = this.f26501a.hashCode() * 31;
        String str = this.f26502b;
        return this.f26503c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
