package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e93 extends k93 {

    /* JADX INFO: renamed from: c */
    public float f17910c;

    /* JADX INFO: renamed from: d */
    public float f17911d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e93)) {
            return false;
        }
        e93 e93Var = (e93) obj;
        return Float.compare(this.f17910c, e93Var.f17910c) == 0 && Float.compare(this.f17911d, e93Var.f17911d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17911d) + (Float.hashCode(this.f17910c) * 31);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.f17910c + ", dy=" + this.f17911d + ")";
    }
}
