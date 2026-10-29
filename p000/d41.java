package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d41 extends me1 {

    /* JADX INFO: renamed from: a */
    public final Drawable f16773a;

    /* JADX INFO: renamed from: b */
    public final boolean f16774b;

    /* JADX INFO: renamed from: c */
    public final kt0 f16775c;

    public d41(Drawable drawable, boolean z, kt0 kt0Var) {
        this.f16773a = drawable;
        this.f16774b = z;
        this.f16775c = kt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41Var = (d41) obj;
        return z62.m13387o(this.f16773a, d41Var.f16773a) && this.f16774b == d41Var.f16774b && this.f16775c == d41Var.f16775c;
    }

    public final int hashCode() {
        return this.f16775c.hashCode() + zi4.m13611k(this.f16773a.hashCode() * 31, 31, this.f16774b);
    }
}
