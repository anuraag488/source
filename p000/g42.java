package p000;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g42 {

    /* JADX INFO: renamed from: e */
    public static final g42 f19605e = new g42(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f19606a;

    /* JADX INFO: renamed from: b */
    public final int f19607b;

    /* JADX INFO: renamed from: c */
    public final int f19608c;

    /* JADX INFO: renamed from: d */
    public final int f19609d;

    public g42(int i, int i2, int i3, int i4) {
        this.f19606a = i;
        this.f19607b = i2;
        this.f19608c = i3;
        this.f19609d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static g42 m5898a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f19605e : new g42(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static g42 m5899b(Insets insets) {
        return m5898a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: c */
    public final Insets m5900c() {
        return Insets.of(this.f19606a, this.f19607b, this.f19608c, this.f19609d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g42.class != obj.getClass()) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return this.f19609d == g42Var.f19609d && this.f19606a == g42Var.f19606a && this.f19608c == g42Var.f19608c && this.f19607b == g42Var.f19607b;
    }

    public final int hashCode() {
        return (((((this.f19606a * 31) + this.f19607b) * 31) + this.f19608c) * 31) + this.f19609d;
    }

    public final String toString() {
        return "Insets{left=" + this.f19606a + ", top=" + this.f19607b + ", right=" + this.f19608c + ", bottom=" + this.f19609d + '}';
    }
}
