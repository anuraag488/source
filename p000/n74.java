package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class n74 {

    /* JADX INFO: renamed from: a */
    public static final vf1 f25504a = new vf1(vz0.f32979b, 1.0f);

    /* JADX INFO: renamed from: b */
    public static final vf1 f25505b = new vf1(vz0.f32978a, 1.0f);

    /* JADX INFO: renamed from: c */
    public static final vf1 f25506c = new vf1(vz0.f32980c, 1.0f);

    /* JADX INFO: renamed from: d */
    public static final j35 f25507d = z62.m13377e0(ig1.f21391o);

    /* JADX INFO: renamed from: e */
    public static final j35 f25508e = z62.m13377e0(ig1.f21390n);

    /* JADX INFO: renamed from: f */
    public static final j35 f25509f = z62.m13347F(ig1.f21388l);

    /* JADX INFO: renamed from: g */
    public static final j35 f25510g = z62.m13347F(ig1.f21387k);

    /* JADX INFO: renamed from: h */
    public static final j35 f25511h = z62.m13364W(ig1.f21382f);

    /* JADX INFO: renamed from: i */
    public static final j35 f25512i = z62.m13364W(ig1.f21378b);

    /* JADX INFO: renamed from: a */
    public static final nt2 m8573a(nt2 nt2Var, float f, float f2) {
        ev4 ev4Var = new ev4();
        ev4Var.f18516a = f;
        ev4Var.f18517b = f2;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(ev4Var);
    }

    /* JADX INFO: renamed from: b */
    public static final nt2 m8574b(nt2 nt2Var, float f) {
        return nt2Var.mo7630d(f == 1.0f ? f25504a : new vf1(vz0.f32979b, f));
    }

    /* JADX INFO: renamed from: c */
    public static final nt2 m8575c(nt2 nt2Var, float f) {
        return nt2Var.mo7630d(new m74(0.0f, f, 0.0f, f, 5));
    }

    /* JADX INFO: renamed from: d */
    public static final nt2 m8576d(nt2 nt2Var, float f, float f2) {
        return nt2Var.mo7630d(new m74(0.0f, f, 0.0f, f2, 5));
    }

    /* JADX INFO: renamed from: e */
    public static final nt2 m8577e() {
        return new m74(40.0f, 40.0f, 40.0f, 40.0f, false);
    }

    /* JADX INFO: renamed from: f */
    public static nt2 m8578f(nt2 nt2Var, float f, float f2, float f3, float f4, int i) {
        return nt2Var.mo7630d(new m74(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    /* JADX INFO: renamed from: g */
    public static final nt2 m8579g(nt2 nt2Var, float f) {
        return nt2Var.mo7630d(new m74(f, f, f, f, true));
    }

    /* JADX INFO: renamed from: h */
    public static final nt2 m8580h(nt2 nt2Var, float f, float f2) {
        return nt2Var.mo7630d(new m74(f, f2, f, f2, true));
    }

    /* JADX INFO: renamed from: i */
    public static final nt2 m8581i(nt2 nt2Var, float f, float f2, float f3, float f4) {
        return nt2Var.mo7630d(new m74(f, f2, f3, f4, true));
    }

    /* JADX INFO: renamed from: j */
    public static nt2 m8582j(float f, float f2, int i) {
        float f3 = (i & 2) != 0 ? Float.NaN : 24.0f;
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        return m8581i(kt2.f23428a, f, f3, f2, Float.NaN);
    }

    /* JADX INFO: renamed from: k */
    public static final nt2 m8583k(nt2 nt2Var, float f) {
        return nt2Var.mo7630d(new m74(f, 0.0f, f, 0.0f, 10));
    }

    /* JADX INFO: renamed from: l */
    public static nt2 m8584l(nt2 nt2Var, float f, float f2, int i) {
        return nt2Var.mo7630d(new m74((i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 0.0f, 10));
    }

    /* JADX INFO: renamed from: m */
    public static nt2 m8585m(nt2 nt2Var, C0853kz c0853kz, int i) {
        j35 j35VarM13364W;
        C0853kz c0853kz2 = ig1.f21382f;
        if ((i & 1) != 0) {
            c0853kz = c0853kz2;
        }
        if (c0853kz.equals(c0853kz2)) {
            j35VarM13364W = f25511h;
        } else {
            j35VarM13364W = c0853kz.equals(ig1.f21378b) ? f25512i : z62.m13364W(c0853kz);
        }
        return nt2Var.mo7630d(j35VarM13364W);
    }

    /* JADX INFO: renamed from: n */
    public static nt2 m8586n(nt2 nt2Var) {
        j35 j35VarM13377e0;
        C0779iz c0779iz = ig1.f21391o;
        if (z62.m13387o(c0779iz, c0779iz)) {
            j35VarM13377e0 = f25507d;
        } else {
            j35VarM13377e0 = z62.m13387o(c0779iz, ig1.f21390n) ? f25508e : z62.m13377e0(c0779iz);
        }
        return nt2Var.mo7630d(j35VarM13377e0);
    }
}
