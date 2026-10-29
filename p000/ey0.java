package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 implements a71 {

    /* JADX INFO: renamed from: a */
    public final int f18567a;

    /* JADX INFO: renamed from: b */
    public final int f18568b;

    public ey0(int i, int i2) {
        this.f18567a = i;
        this.f18568b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        r32.m10186a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p000.a71
    /* JADX INFO: renamed from: a */
    public final void mo117a(c71 c71Var) {
        int i = c71Var.f15852c;
        n83 n83Var = c71Var.f15850a;
        int i2 = this.f18568b;
        int iM8598b = i + i2;
        if (((i ^ iM8598b) & (i2 ^ iM8598b)) < 0) {
            iM8598b = n83Var.m8598b();
        }
        c71Var.m3857a(c71Var.f15852c, Math.min(iM8598b, n83Var.m8598b()));
        int i3 = c71Var.f15851b;
        int i4 = this.f18567a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        c71Var.m3857a(Math.max(0, i5), c71Var.f15851b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey0)) {
            return false;
        }
        ey0 ey0Var = (ey0) obj;
        return this.f18567a == ey0Var.f18567a && this.f18568b == ey0Var.f18568b;
    }

    public final int hashCode() {
        return (this.f18567a * 31) + this.f18568b;
    }

    public final String toString() {
        return d55.m4367l("DeleteSurroundingTextCommand(lengthBeforeCursor=", this.f18567a, ", lengthAfterCursor=", this.f18568b, ")");
    }
}
