package p000;

import java.util.List;

/* JADX INFO: renamed from: at */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0466at extends hq0 {

    /* JADX INFO: renamed from: a */
    public List f14847a;

    /* JADX INFO: renamed from: b */
    public C0625et f14848b;

    /* JADX INFO: renamed from: c */
    public vp0 f14849c;

    /* JADX INFO: renamed from: d */
    public C0700gt f14850d;

    /* JADX INFO: renamed from: e */
    public List f14851e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hq0)) {
            return false;
        }
        hq0 hq0Var = (hq0) obj;
        List list = this.f14847a;
        if (list == null) {
            if (((C0466at) hq0Var).f14847a != null) {
                return false;
            }
        } else if (!list.equals(((C0466at) hq0Var).f14847a)) {
            return false;
        }
        C0625et c0625et = this.f14848b;
        if (c0625et == null) {
            if (((C0466at) hq0Var).f14848b != null) {
                return false;
            }
        } else if (!c0625et.equals(((C0466at) hq0Var).f14848b)) {
            return false;
        }
        vp0 vp0Var = this.f14849c;
        if (vp0Var == null) {
            if (((C0466at) hq0Var).f14849c != null) {
                return false;
            }
        } else if (!vp0Var.equals(((C0466at) hq0Var).f14849c)) {
            return false;
        }
        C0466at c0466at = (C0466at) hq0Var;
        return this.f14850d.equals(c0466at.f14850d) && this.f14851e.equals(c0466at.f14851e);
    }

    public final int hashCode() {
        List list = this.f14847a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        C0625et c0625et = this.f14848b;
        int iHashCode2 = (iHashCode ^ (c0625et == null ? 0 : c0625et.hashCode())) * 1000003;
        vp0 vp0Var = this.f14849c;
        return this.f14851e.hashCode() ^ ((((iHashCode2 ^ (vp0Var != null ? vp0Var.hashCode() : 0)) * 1000003) ^ this.f14850d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.f14847a + ", exception=" + this.f14848b + ", appExitInfo=" + this.f14849c + ", signal=" + this.f14850d + ", binaries=" + this.f14851e + "}";
    }
}
