package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fy0 implements a71 {

    /* JADX INFO: renamed from: a */
    public final int f19407a;

    /* JADX INFO: renamed from: b */
    public final int f19408b;

    public fy0(int i, int i2) {
        this.f19407a = i;
        this.f19408b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        r32.m10186a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p000.a71
    /* JADX INFO: renamed from: a */
    public final void mo117a(c71 c71Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.f19407a; i2++) {
            int i3 = i + 1;
            int i4 = c71Var.f15851b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(c71Var.m3858b((i4 - i3) + (-1))) && Character.isLowSurrogate(c71Var.m3858b(c71Var.f15851b - i3))) ? i + 2 : i3;
        }
        int iM8598b = 0;
        for (int i5 = 0; i5 < this.f19408b; i5++) {
            int i6 = iM8598b + 1;
            int i7 = c71Var.f15852c;
            n83 n83Var = c71Var.f15850a;
            if (i7 + i6 >= n83Var.m8598b()) {
                iM8598b = n83Var.m8598b() - c71Var.f15852c;
                break;
            }
            iM8598b = (Character.isHighSurrogate(c71Var.m3858b((c71Var.f15852c + i6) + (-1))) && Character.isLowSurrogate(c71Var.m3858b(c71Var.f15852c + i6))) ? iM8598b + 2 : i6;
        }
        int i8 = c71Var.f15852c;
        c71Var.m3857a(i8, iM8598b + i8);
        int i9 = c71Var.f15851b;
        c71Var.m3857a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy0)) {
            return false;
        }
        fy0 fy0Var = (fy0) obj;
        return this.f19407a == fy0Var.f19407a && this.f19408b == fy0Var.f19408b;
    }

    public final int hashCode() {
        return (this.f19407a * 31) + this.f19408b;
    }

    public final String toString() {
        return d55.m4367l("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.f19407a, ", lengthAfterCursor=", this.f19408b, ")");
    }
}
