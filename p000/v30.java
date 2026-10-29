package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v30 implements yk4 {

    /* JADX INFO: renamed from: a */
    public final u30 f32356a;

    /* JADX INFO: renamed from: b */
    public final float f32357b;

    public v30(u30 u30Var, float f) {
        this.f32356a = u30Var;
        this.f32357b = f;
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: a */
    public final long mo5689a() {
        int i = pb0.f27502i;
        return pb0.f27501h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v30) {
            v30 v30Var = (v30) obj;
            if (this.f32356a == v30Var.f32356a && Float.compare(this.f32357b, v30Var.f32357b) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: f */
    public final t30 mo5690f() {
        return this.f32356a;
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: h */
    public final float mo5691h() {
        return this.f32357b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32357b) + (this.f32356a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.f32356a + ", alpha=" + this.f32357b + ")";
    }
}
