package p000;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class er3 {

    /* JADX INFO: renamed from: a */
    public int f18419a;

    /* JADX INFO: renamed from: b */
    public int f18420b;

    /* JADX INFO: renamed from: c */
    public Point f18421c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof er3) {
            er3 er3Var = (er3) obj;
            if (this.f18419a == er3Var.f18419a && this.f18420b == er3Var.f18420b && this.f18421c.equals(er3Var.f18421c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18421c.hashCode() + (((this.f18419a * 31) + this.f18420b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f18419a;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f18420b);
        sb.append(", center=");
        sb.append(this.f18421c);
        sb.append('}');
        return sb.toString();
    }
}
