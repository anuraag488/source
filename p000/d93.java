package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d93 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f16875c;

    /* JADX INFO: renamed from: d */
    public final float f16876d;

    public d93(float f, float f2) {
        super(3);
        this.f16875c = f;
        this.f16876d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d93)) {
            return false;
        }
        d93 d93Var = (d93) obj;
        return Float.compare(this.f16875c, d93Var.f16875c) == 0 && Float.compare(this.f16876d, d93Var.f16876d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16876d) + (Float.hashCode(this.f16875c) * 31);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.f16875c + ", dy=" + this.f16876d + ")";
    }
}
