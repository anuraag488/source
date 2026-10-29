package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w83 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f33154c;

    /* JADX INFO: renamed from: d */
    public final float f33155d;

    public w83(float f, float f2) {
        super(3);
        this.f33154c = f;
        this.f33155d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w83)) {
            return false;
        }
        w83 w83Var = (w83) obj;
        return Float.compare(this.f33154c, w83Var.f33154c) == 0 && Float.compare(this.f33155d, w83Var.f33155d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33155d) + (Float.hashCode(this.f33154c) * 31);
    }

    public final String toString() {
        return "MoveTo(x=" + this.f33154c + ", y=" + this.f33155d + ")";
    }
}
