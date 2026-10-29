package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ap4 implements zo4 {

    /* JADX INFO: renamed from: a */
    public final Object f14769a;

    /* JADX INFO: renamed from: b */
    public final Object f14770b;

    public ap4(Object obj, Object obj2) {
        this.f14769a = obj;
        this.f14770b = obj2;
    }

    @Override // p000.zo4
    /* JADX INFO: renamed from: a */
    public final Object mo3110a() {
        return this.f14769a;
    }

    @Override // p000.zo4
    /* JADX INFO: renamed from: d */
    public final Object mo3111d() {
        return this.f14770b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo4)) {
            return false;
        }
        zo4 zo4Var = (zo4) obj;
        return z62.m13387o(this.f14769a, zo4Var.mo3110a()) && z62.m13387o(this.f14770b, zo4Var.mo3111d());
    }

    public final int hashCode() {
        Object obj = this.f14769a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f14770b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
