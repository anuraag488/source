package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 {

    /* JADX INFO: renamed from: a */
    public final int f18948a;

    /* JADX INFO: renamed from: b */
    public final int f18949b;

    /* JADX INFO: renamed from: c */
    public final boolean f18950c;

    public ff2(int i, int i2, boolean z) {
        this.f18948a = i;
        this.f18949b = i2;
        this.f18950c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff2)) {
            return false;
        }
        ff2 ff2Var = (ff2) obj;
        return this.f18948a == ff2Var.f18948a && this.f18949b == ff2Var.f18949b && this.f18950c == ff2Var.f18950c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18950c) + zi4.m13609i(this.f18949b, Integer.hashCode(this.f18948a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM13624x = zi4.m13624x("BidiRun(start=", this.f18948a, ", end=", this.f18949b, ", isRtl=");
        sbM13624x.append(this.f18950c);
        sbM13624x.append(")");
        return sbM13624x.toString();
    }
}
