package p000;

/* JADX INFO: renamed from: nt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0958nt extends iq0 {

    /* JADX INFO: renamed from: a */
    public String f26072a;

    /* JADX INFO: renamed from: b */
    public int f26073b;

    /* JADX INFO: renamed from: c */
    public int f26074c;

    /* JADX INFO: renamed from: d */
    public boolean f26075d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iq0) {
            C0958nt c0958nt = (C0958nt) ((iq0) obj);
            if (this.f26072a.equals(c0958nt.f26072a) && this.f26073b == c0958nt.f26073b && this.f26074c == c0958nt.f26074c && this.f26075d == c0958nt.f26075d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26075d ? 1231 : 1237) ^ ((((((this.f26072a.hashCode() ^ 1000003) * 1000003) ^ this.f26073b) * 1000003) ^ this.f26074c) * 1000003);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f26072a + ", pid=" + this.f26073b + ", importance=" + this.f26074c + ", defaultProcess=" + this.f26075d + "}";
    }
}
