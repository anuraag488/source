package p000;

/* JADX INFO: renamed from: bv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0505bv {

    /* JADX INFO: renamed from: a */
    public String f15641a;

    /* JADX INFO: renamed from: b */
    public String f15642b;

    /* JADX INFO: renamed from: c */
    public boolean f15643c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0505bv) {
            C0505bv c0505bv = (C0505bv) obj;
            if (this.f15641a.equals(c0505bv.f15641a) && this.f15642b.equals(c0505bv.f15642b) && this.f15643c == c0505bv.f15643c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15643c ? 1231 : 1237) ^ ((((this.f15641a.hashCode() ^ 1000003) * 1000003) ^ this.f15642b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f15641a + ", osCodeName=" + this.f15642b + ", isRooted=" + this.f15643c + "}";
    }
}
