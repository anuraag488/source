package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 extends c12 {

    /* JADX INFO: renamed from: a */
    public Drawable f17922a;

    /* JADX INFO: renamed from: b */
    public b12 f17923b;

    /* JADX INFO: renamed from: c */
    public Throwable f17924c;

    @Override // p000.c12
    /* JADX INFO: renamed from: a */
    public final b12 mo3789a() {
        return this.f17923b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea1)) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        return z62.m13387o(this.f17922a, ea1Var.f17922a) && z62.m13387o(this.f17923b, ea1Var.f17923b) && this.f17924c.equals(ea1Var.f17924c);
    }

    public final int hashCode() {
        Drawable drawable = this.f17922a;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.f17924c.hashCode() + ((this.f17923b.hashCode() + (iHashCode * 31)) * 31);
    }
}
