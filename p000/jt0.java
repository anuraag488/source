package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 {

    /* JADX INFO: renamed from: a */
    public long f22600a;

    /* JADX INFO: renamed from: b */
    public float f22601b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt0)) {
            return false;
        }
        jt0 jt0Var = (jt0) obj;
        return this.f22600a == jt0Var.f22600a && Float.compare(this.f22601b, jt0Var.f22601b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22601b) + (Long.hashCode(this.f22600a) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.f22600a + ", dataPoint=" + this.f22601b + ")";
    }
}
