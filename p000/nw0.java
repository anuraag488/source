package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 {

    /* JADX INFO: renamed from: a */
    public final so0 f26128a;

    /* JADX INFO: renamed from: b */
    public final so0 f26129b;

    /* JADX INFO: renamed from: c */
    public final so0 f26130c;

    /* JADX INFO: renamed from: d */
    public final so0 f26131d;

    /* JADX INFO: renamed from: e */
    public final q13 f26132e;

    /* JADX INFO: renamed from: f */
    public final gd3 f26133f;

    /* JADX INFO: renamed from: g */
    public final Bitmap.Config f26134g;

    /* JADX INFO: renamed from: h */
    public final boolean f26135h;

    /* JADX INFO: renamed from: i */
    public final boolean f26136i;

    /* JADX INFO: renamed from: j */
    public final Drawable f26137j;

    /* JADX INFO: renamed from: k */
    public final Drawable f26138k;

    /* JADX INFO: renamed from: l */
    public final Drawable f26139l;

    /* JADX INFO: renamed from: m */
    public final a60 f26140m;

    /* JADX INFO: renamed from: n */
    public final a60 f26141n;

    /* JADX INFO: renamed from: o */
    public final a60 f26142o;

    public nw0(so0 so0Var, so0 so0Var2, so0 so0Var3, so0 so0Var4, q13 q13Var, gd3 gd3Var, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, a60 a60Var, a60 a60Var2, a60 a60Var3) {
        this.f26128a = so0Var;
        this.f26129b = so0Var2;
        this.f26130c = so0Var3;
        this.f26131d = so0Var4;
        this.f26132e = q13Var;
        this.f26133f = gd3Var;
        this.f26134g = config;
        this.f26135h = z;
        this.f26136i = z2;
        this.f26137j = drawable;
        this.f26138k = drawable2;
        this.f26139l = drawable3;
        this.f26140m = a60Var;
        this.f26141n = a60Var2;
        this.f26142o = a60Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) obj;
        return z62.m13387o(this.f26128a, nw0Var.f26128a) && z62.m13387o(this.f26129b, nw0Var.f26129b) && z62.m13387o(this.f26130c, nw0Var.f26130c) && z62.m13387o(this.f26131d, nw0Var.f26131d) && z62.m13387o(this.f26132e, nw0Var.f26132e) && this.f26133f == nw0Var.f26133f && this.f26134g == nw0Var.f26134g && this.f26135h == nw0Var.f26135h && this.f26136i == nw0Var.f26136i && z62.m13387o(this.f26137j, nw0Var.f26137j) && z62.m13387o(this.f26138k, nw0Var.f26138k) && z62.m13387o(this.f26139l, nw0Var.f26139l) && this.f26140m == nw0Var.f26140m && this.f26141n == nw0Var.f26141n && this.f26142o == nw0Var.f26142o;
    }

    public final int hashCode() {
        int iHashCode = (this.f26131d.hashCode() + ((this.f26130c.hashCode() + ((this.f26129b.hashCode() + (this.f26128a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f26132e.getClass();
        int iM13611k = zi4.m13611k(zi4.m13611k((this.f26134g.hashCode() + ((this.f26133f.hashCode() + ((q13.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f26135h), 31, this.f26136i);
        Drawable drawable = this.f26137j;
        int iHashCode2 = (iM13611k + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f26138k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f26139l;
        return this.f26142o.hashCode() + ((this.f26141n.hashCode() + ((this.f26140m.hashCode() + ((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
