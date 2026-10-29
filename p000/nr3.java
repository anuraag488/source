package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nr3 {

    /* JADX INFO: renamed from: a */
    public float f26055a;

    /* JADX INFO: renamed from: b */
    public boolean f26056b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr3)) {
            return false;
        }
        nr3 nr3Var = (nr3) obj;
        return Float.compare(this.f26055a, nr3Var.f26055a) == 0 && this.f26056b == nr3Var.f26056b;
    }

    public final int hashCode() {
        return zi4.m13611k(Float.hashCode(this.f26055a) * 31, 961, this.f26056b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f26055a + ", fill=" + this.f26056b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
