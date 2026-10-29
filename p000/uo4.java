package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uo4 {

    /* JADX INFO: renamed from: a */
    public final C0875lk f32033a;

    /* JADX INFO: renamed from: b */
    public final vi3 f32034b;

    public uo4(C0875lk c0875lk, vi3 vi3Var) {
        this.f32033a = c0875lk;
        this.f32034b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo4)) {
            return false;
        }
        uo4 uo4Var = (uo4) obj;
        return z62.m13387o(this.f32033a, uo4Var.f32033a) && this.f32034b.equals(uo4Var.f32034b);
    }

    public final int hashCode() {
        return this.f32034b.hashCode() + (this.f32033a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f32033a) + ", offsetMapping=" + this.f32034b + ")";
    }
}
