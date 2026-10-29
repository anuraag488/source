package p000;

import android.view.View;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ip2 extends st2 {

    /* JADX INFO: renamed from: a */
    public C0729hl f21621a;

    /* JADX INFO: renamed from: b */
    public sk4 f21622b;

    /* JADX INFO: renamed from: c */
    public float f21623c;

    /* JADX INFO: renamed from: d */
    public boolean f21624d;

    /* JADX INFO: renamed from: e */
    public long f21625e;

    /* JADX INFO: renamed from: f */
    public float f21626f;

    /* JADX INFO: renamed from: g */
    public float f21627g;

    /* JADX INFO: renamed from: h */
    public boolean f21628h;

    /* JADX INFO: renamed from: i */
    public gb5 f21629i;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C0729hl c0729hl = this.f21621a;
        float f = this.f21623c;
        boolean z = this.f21624d;
        long j = this.f21625e;
        float f2 = this.f21626f;
        float f3 = this.f21627g;
        boolean z2 = this.f21628h;
        sk4 sk4Var = this.f21622b;
        gb5 gb5Var = this.f21629i;
        kp2 kp2Var = new kp2();
        kp2Var.f23318o = c0729hl;
        kp2Var.f23319p = sk4Var;
        kp2Var.f23320q = f;
        kp2Var.f23321r = z;
        kp2Var.f23322s = j;
        kp2Var.f23323t = f2;
        kp2Var.f23324u = f3;
        kp2Var.f23325v = z2;
        kp2Var.f23326w = gb5Var;
        kp2Var.f23313A = new d83(null, o85.f26450j);
        kp2Var.f23315C = 9205357640488583168L;
        VarHandle.storeStoreFence();
        return kp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip2) {
            ip2 ip2Var = (ip2) obj;
            if (this.f21621a == ip2Var.f21621a && this.f21623c == ip2Var.f21623c && this.f21624d == ip2Var.f21624d && this.f21625e == ip2Var.f21625e && p11.m9352c(this.f21626f, ip2Var.f21626f) && p11.m9352c(this.f21627g, ip2Var.f21627g) && this.f21628h == ip2Var.f21628h && this.f21622b == ip2Var.f21622b && z62.m13387o(this.f21629i, ip2Var.f21629i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        kp2 kp2Var = (kp2) mt2Var;
        C0729hl c0729hl = this.f21621a;
        float f = this.f21623c;
        boolean z = this.f21624d;
        long j = this.f21625e;
        float f2 = this.f21626f;
        float f3 = this.f21627g;
        boolean z2 = this.f21628h;
        sk4 sk4Var = this.f21622b;
        gb5 gb5Var = this.f21629i;
        float f4 = kp2Var.f23320q;
        long j2 = kp2Var.f23322s;
        float f5 = kp2Var.f23323t;
        boolean z3 = kp2Var.f23321r;
        float f6 = kp2Var.f23324u;
        boolean z4 = kp2Var.f23325v;
        gb5 gb5Var2 = kp2Var.f23326w;
        View view = kp2Var.f23327x;
        ky0 ky0Var = kp2Var.f23328y;
        kp2Var.f23318o = c0729hl;
        kp2Var.f23320q = f;
        kp2Var.f23321r = z;
        kp2Var.f23322s = j;
        kp2Var.f23323t = f2;
        kp2Var.f23324u = f3;
        kp2Var.f23325v = z2;
        kp2Var.f23319p = sk4Var;
        kp2Var.f23326w = gb5Var;
        View viewM13511H = zc6.m13511H(kp2Var);
        ky0 ky0Var2 = sc6.m10652X(kp2Var).f33336z;
        if (kp2Var.f23329z != null) {
            p14 p14Var = lp2.f24268a;
            if ((!Float.isNaN(f) || !Float.isNaN(f4)) && f != f4) {
                gb5Var.getClass();
            }
            if (j != j2 || !p11.m9352c(f2, f5) || !p11.m9352c(f3, f6) || z != z3 || z2 != z4 || !z62.m13387o(gb5Var, gb5Var2) || !viewM13511H.equals(view) || !z62.m13387o(ky0Var2, ky0Var)) {
                kp2Var.m7572P0();
            }
        }
        kp2Var.m7573Q0();
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k(c75.m3874f(this.f21627g, c75.m3874f(this.f21626f, zi4.m13612l(zi4.m13611k(c75.m3874f(this.f21623c, this.f21621a.hashCode() * 961, 31), 31, this.f21624d), this.f21625e, 31), 31), 31), 31, this.f21628h);
        sk4 sk4Var = this.f21622b;
        return this.f21629i.hashCode() + ((iM13611k + (sk4Var != null ? sk4Var.hashCode() : 0)) * 31);
    }
}
