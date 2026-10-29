package p000;

/* JADX INFO: renamed from: np */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0954np {

    /* JADX INFO: renamed from: a */
    public final C0532cm f25988a;

    /* JADX INFO: renamed from: b */
    public final r50 f25989b;

    /* JADX INFO: renamed from: c */
    public final lk3 f25990c;

    public C0954np(C0532cm c0532cm, r50 r50Var, lk3 lk3Var) {
        this.f25988a = c0532cm;
        this.f25989b = r50Var;
        this.f25990c = lk3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0954np) {
                C0954np c0954np = (C0954np) obj;
                Object obj2 = c0954np.f25988a;
                this.f25989b.getClass();
                C0532cm c0532cm = this.f25988a;
                if (!(c0532cm == obj2 ? true : c0532cm.equals(obj2)) || !this.f25990c.equals(c0954np.f25990c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        this.f25989b.getClass();
        return this.f25990c.hashCode() + (this.f25988a.hashCode() * 31);
    }
}
