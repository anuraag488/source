package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b63 {

    /* JADX INFO: renamed from: a */
    public final Context f15109a;

    /* JADX INFO: renamed from: b */
    public final Bitmap.Config f15110b;

    /* JADX INFO: renamed from: c */
    public final ColorSpace f15111c;

    /* JADX INFO: renamed from: d */
    public final g74 f15112d;

    /* JADX INFO: renamed from: e */
    public final qv3 f15113e;

    /* JADX INFO: renamed from: f */
    public final boolean f15114f;

    /* JADX INFO: renamed from: g */
    public final boolean f15115g;

    /* JADX INFO: renamed from: h */
    public final boolean f15116h;

    /* JADX INFO: renamed from: i */
    public final String f15117i;

    /* JADX INFO: renamed from: j */
    public final uv1 f15118j;

    /* JADX INFO: renamed from: k */
    public final uh4 f15119k;

    /* JADX INFO: renamed from: l */
    public final u73 f15120l;

    /* JADX INFO: renamed from: m */
    public final a60 f15121m;

    /* JADX INFO: renamed from: n */
    public final a60 f15122n;

    /* JADX INFO: renamed from: o */
    public final a60 f15123o;

    public b63(Context context, Bitmap.Config config, ColorSpace colorSpace, g74 g74Var, qv3 qv3Var, boolean z, boolean z2, boolean z3, String str, uv1 uv1Var, uh4 uh4Var, u73 u73Var, a60 a60Var, a60 a60Var2, a60 a60Var3) {
        this.f15109a = context;
        this.f15110b = config;
        this.f15111c = colorSpace;
        this.f15112d = g74Var;
        this.f15113e = qv3Var;
        this.f15114f = z;
        this.f15115g = z2;
        this.f15116h = z3;
        this.f15117i = str;
        this.f15118j = uv1Var;
        this.f15119k = uh4Var;
        this.f15120l = u73Var;
        this.f15121m = a60Var;
        this.f15122n = a60Var2;
        this.f15123o = a60Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b63)) {
            return false;
        }
        b63 b63Var = (b63) obj;
        return z62.m13387o(this.f15109a, b63Var.f15109a) && this.f15110b == b63Var.f15110b && z62.m13387o(this.f15111c, b63Var.f15111c) && z62.m13387o(this.f15112d, b63Var.f15112d) && this.f15113e == b63Var.f15113e && this.f15114f == b63Var.f15114f && this.f15115g == b63Var.f15115g && this.f15116h == b63Var.f15116h && z62.m13387o(this.f15117i, b63Var.f15117i) && z62.m13387o(this.f15118j, b63Var.f15118j) && z62.m13387o(this.f15119k, b63Var.f15119k) && z62.m13387o(this.f15120l, b63Var.f15120l) && this.f15121m == b63Var.f15121m && this.f15122n == b63Var.f15122n && this.f15123o == b63Var.f15123o;
    }

    public final int hashCode() {
        int iHashCode = (this.f15110b.hashCode() + (this.f15109a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f15111c;
        int iM13611k = zi4.m13611k(zi4.m13611k(zi4.m13611k((this.f15113e.hashCode() + ((this.f15112d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f15114f), 31, this.f15115g), 31, this.f15116h);
        String str = this.f15117i;
        return this.f15123o.hashCode() + ((this.f15122n.hashCode() + ((this.f15121m.hashCode() + ((this.f15120l.f31698a.hashCode() + ((this.f15119k.f31879a.hashCode() + ((((iM13611k + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15118j.f32204a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
