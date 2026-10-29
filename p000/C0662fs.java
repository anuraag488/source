package p000;

/* JADX INFO: renamed from: fs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0662fs extends da0 {

    /* JADX INFO: renamed from: a */
    public C0549cs f19246a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0Var = (da0) obj;
        Object obj2 = ca0.f15901a;
        return obj2.equals(obj2) && this.f19246a.equals(((C0662fs) da0Var).f19246a);
    }

    public final int hashCode() {
        return this.f19246a.hashCode() ^ ((ca0.f15901a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ca0.f15901a + ", androidClientInfo=" + this.f19246a + "}";
    }
}
