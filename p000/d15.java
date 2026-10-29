package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d15 {

    /* JADX INFO: renamed from: a */
    public final j20 f16730a;

    /* JADX INFO: renamed from: b */
    public final float f16731b;

    public d15(Rect rect, float f) {
        this.f16730a = new j20(rect.left, rect.top, rect.right, rect.bottom);
        this.f16731b = f;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m4280a() {
        j20 j20Var = this.f16730a;
        return new Rect(j20Var.f21957a, j20Var.f21958b, j20Var.f21959c, j20Var.f21960d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d15.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d15 d15Var = (d15) obj;
        return this.f16730a.equals(d15Var.f16730a) && this.f16731b == d15Var.f16731b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16731b) + (this.f16730a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.f16730a + ", density=" + this.f16731b + ')';
    }
}
