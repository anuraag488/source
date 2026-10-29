package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b12 {

    /* JADX INFO: renamed from: a */
    public Context f14996a;

    /* JADX INFO: renamed from: b */
    public Object f14997b;

    /* JADX INFO: renamed from: c */
    public ar3 f14998c;

    /* JADX INFO: renamed from: d */
    public Bitmap.Config f14999d;

    /* JADX INFO: renamed from: e */
    public gd3 f15000e;

    /* JADX INFO: renamed from: f */
    public List f15001f;

    /* JADX INFO: renamed from: g */
    public q13 f15002g;

    /* JADX INFO: renamed from: h */
    public uv1 f15003h;

    /* JADX INFO: renamed from: i */
    public uh4 f15004i;

    /* JADX INFO: renamed from: j */
    public boolean f15005j;

    /* JADX INFO: renamed from: k */
    public boolean f15006k;

    /* JADX INFO: renamed from: l */
    public boolean f15007l;

    /* JADX INFO: renamed from: m */
    public boolean f15008m;

    /* JADX INFO: renamed from: n */
    public a60 f15009n;

    /* JADX INFO: renamed from: o */
    public a60 f15010o;

    /* JADX INFO: renamed from: p */
    public a60 f15011p;

    /* JADX INFO: renamed from: q */
    public so0 f15012q;

    /* JADX INFO: renamed from: r */
    public so0 f15013r;

    /* JADX INFO: renamed from: s */
    public so0 f15014s;

    /* JADX INFO: renamed from: t */
    public so0 f15015t;

    /* JADX INFO: renamed from: u */
    public gk2 f15016u;

    /* JADX INFO: renamed from: v */
    public p74 f15017v;

    /* JADX INFO: renamed from: w */
    public qv3 f15018w;

    /* JADX INFO: renamed from: x */
    public u73 f15019x;

    /* JADX INFO: renamed from: y */
    public lx0 f15020y;

    /* JADX INFO: renamed from: z */
    public nw0 f15021z;

    /* JADX INFO: renamed from: a */
    public static a12 m3401a(b12 b12Var) {
        Context context = b12Var.f14996a;
        b12Var.getClass();
        a12 a12Var = new a12();
        a12Var.f37a = context;
        a12Var.f38b = b12Var.f15021z;
        a12Var.f39c = b12Var.f14997b;
        a12Var.f40d = b12Var.f14998c;
        lx0 lx0Var = b12Var.f15020y;
        a12Var.f41e = lx0Var.f24431c;
        a12Var.f42f = b12Var.f15001f;
        a12Var.f43g = b12Var.f15003h.m11659c();
        a12Var.f44h = new LinkedHashMap(b12Var.f15004i.f31879a);
        a12Var.f45i = b12Var.f15005j;
        a12Var.f46j = b12Var.f15008m;
        u73 u73Var = b12Var.f15019x;
        cp2 cp2Var = new cp2();
        cp2Var.f16332a = new LinkedHashMap(u73Var.f31698a);
        VarHandle.storeStoreFence();
        a12Var.f47k = cp2Var;
        a12Var.f48l = lx0Var.f24429a;
        a12Var.f49m = lx0Var.f24430b;
        if (b12Var.f14996a == context) {
            a12Var.f50n = b12Var.f15016u;
            a12Var.f51o = b12Var.f15017v;
            a12Var.f52p = b12Var.f15018w;
        } else {
            a12Var.f50n = null;
            a12Var.f51o = null;
            a12Var.f52p = null;
        }
        VarHandle.storeStoreFence();
        return a12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b12)) {
            return false;
        }
        b12 b12Var = (b12) obj;
        return z62.m13387o(this.f14996a, b12Var.f14996a) && this.f14997b.equals(b12Var.f14997b) && z62.m13387o(this.f14998c, b12Var.f14998c) && this.f14999d == b12Var.f14999d && this.f15000e == b12Var.f15000e && z62.m13387o(this.f15001f, b12Var.f15001f) && z62.m13387o(this.f15002g, b12Var.f15002g) && z62.m13387o(this.f15003h, b12Var.f15003h) && this.f15004i.equals(b12Var.f15004i) && this.f15005j == b12Var.f15005j && this.f15006k == b12Var.f15006k && this.f15007l == b12Var.f15007l && this.f15008m == b12Var.f15008m && this.f15009n == b12Var.f15009n && this.f15010o == b12Var.f15010o && this.f15011p == b12Var.f15011p && z62.m13387o(this.f15012q, b12Var.f15012q) && z62.m13387o(this.f15013r, b12Var.f15013r) && z62.m13387o(this.f15014s, b12Var.f15014s) && z62.m13387o(this.f15015t, b12Var.f15015t) && z62.m13387o(this.f15016u, b12Var.f15016u) && this.f15017v.equals(b12Var.f15017v) && this.f15018w == b12Var.f15018w && this.f15019x.equals(b12Var.f15019x) && this.f15020y.equals(b12Var.f15020y) && z62.m13387o(this.f15021z, b12Var.f15021z);
    }

    public final int hashCode() {
        int iHashCode = (this.f14997b.hashCode() + (this.f14996a.hashCode() * 31)) * 31;
        ar3 ar3Var = this.f14998c;
        int iHashCode2 = (this.f15001f.hashCode() + ((this.f15000e.hashCode() + ((this.f14999d.hashCode() + ((iHashCode + (ar3Var != null ? ar3Var.hashCode() : 0)) * 923521)) * 961)) * 29791)) * 31;
        this.f15002g.getClass();
        return this.f15021z.hashCode() + ((this.f15020y.hashCode() + ((this.f15019x.f31698a.hashCode() + ((this.f15018w.hashCode() + ((this.f15017v.hashCode() + ((this.f15016u.hashCode() + ((this.f15015t.hashCode() + ((this.f15014s.hashCode() + ((this.f15013r.hashCode() + ((this.f15012q.hashCode() + ((this.f15011p.hashCode() + ((this.f15010o.hashCode() + ((this.f15009n.hashCode() + zi4.m13611k(zi4.m13611k(zi4.m13611k(zi4.m13611k((this.f15004i.f31879a.hashCode() + ((((q13.class.hashCode() + iHashCode2) * 31) + Arrays.hashCode(this.f15003h.f32204a)) * 31)) * 31, 31, this.f15005j), 31, this.f15006k), 31, this.f15007l), 31, this.f15008m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
