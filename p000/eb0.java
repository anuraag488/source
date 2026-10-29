package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 {

    /* JADX INFO: renamed from: a */
    public final float f17942a;

    /* JADX INFO: renamed from: b */
    public final float f17943b;

    public eb0(float f, float f2) {
        this.f17942a = f;
        this.f17943b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        return Float.compare(this.f17942a, eb0Var.f17942a) == 0 && Float.compare(this.f17943b, eb0Var.f17943b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17943b) + (Float.hashCode(this.f17942a) * 31);
    }

    public final String toString() {
        return "CollectionScrollPadding(start=" + this.f17942a + ", end=" + this.f17943b + ')';
    }
}
