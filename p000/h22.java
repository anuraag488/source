package p000;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h22 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ l22 f20277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f20278b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ float f20279c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ float f20280d;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        char c;
        C0489bf c0489bf;
        boolean z;
        boolean z2;
        C0489bf c0489bf2;
        l22 l22Var = this.f20277a;
        boolean z3 = this.f20278b;
        float f = this.f20279c;
        float f2 = this.f20280d;
        yf2 yf2Var = (yf2) obj;
        C0910mi c0910mi = l22Var.f23733D;
        n90 n90Var = l22Var.f23747y;
        float fFloatValue = c0910mi != null ? ((Number) c0910mi.m8328d()).floatValue() : 0.0f;
        C0910mi c0910mi2 = l22Var.f23734E;
        float fFloatValue2 = c0910mi2 != null ? ((Number) c0910mi2.m8328d()).floatValue() : 0.0f;
        C0910mi c0910mi3 = l22Var.f23735F;
        float fFloatValue3 = c0910mi3 != null ? ((Number) c0910mi3.m8328d()).floatValue() : 0.1f;
        long jMo11227d = yf2Var.f35194a.mo11227d();
        float f3 = fFloatValue;
        i22 i22Var = new i22(6, l22Var, l22.class, "progressPathProvider", "progressPathProvider-wzdHmys(FFFJZLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
        j22 j22Var = new j22(5, l22Var, l22.class, "trackPathProvider", "trackPathProvider-yzxVdVo(FFFJLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
        float f4 = l22Var.f23737H;
        float fM13399h = z3 ? l22Var.f23748z.m13399h() : 0.0f;
        pd4 pd4Var = l22Var.f23741s;
        pd4 pd4Var2 = l22Var.f23742t;
        C0525cf c0525cf = n90Var.f25562s;
        C0489bf c0489bf3 = n90Var.f25559p;
        float f5 = fFloatValue2;
        C0489bf c0489bf4 = n90Var.f25560q;
        C0525cf c0525cf2 = n90Var.f25561r;
        C0489bf c0489bf5 = n90Var.f25558o;
        C0489bf c0489bf6 = n90Var.f25557n;
        float[] fArr = n90Var.f25555l;
        if (h74.m6270b(n90Var.f25546c, jMo11227d) && n90Var.f25544a == f4 && n90Var.f25545b == f && z62.m13387o(n90Var.f25550g, pd4Var) && z62.m13387o(n90Var.f25551h, pd4Var2) && n90Var.f25548e == f2 && n90Var.f25554k == z3) {
            z2 = false;
            c0489bf = c0489bf6;
            c = ' ';
        } else {
            c = ' ';
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo11227d & 4294967295L));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo11227d >> 32));
            int i = pd4Var.f27549l;
            float f6 = pd4Var.f27547j;
            n90Var.f25563t = (!(i == 0 && pd4Var2.f27549l == 0) && fIntBitsToFloat <= fIntBitsToFloat2) ? Math.max(f6 / 2.0f, pd4Var2.f27547j / 2.0f) : 0.0f;
            rq2.m10395e(fArr);
            rq2.m10397g(fArr, fIntBitsToFloat2 - f6, fIntBitsToFloat - f6);
            c0489bf6.m3565h();
            i22Var.mo6204c(Float.valueOf(f4), Float.valueOf(f), Float.valueOf(f6), h74.m6269a(jMo11227d), Boolean.valueOf(z3), c0489bf6);
            c0489bf = c0489bf6;
            c0489bf.m3566i(fArr);
            c0489bf.m3567j(b33.m3429g(i20.m6597v(jMo11227d), c0489bf.m3561d().m7167c()));
            c0525cf2.m3995b(c0489bf, true);
            PathMeasure pathMeasure = c0525cf2.f15974a;
            n90Var.f25552i = z3 ? pathMeasure.getLength() / 2.0f : pathMeasure.getLength();
            c0489bf5.m3565h();
            if (((C0489bf) j22Var.mo6994d(Float.valueOf(f4), Float.valueOf(f), Float.valueOf(f6), h74.m6269a(jMo11227d), c0489bf5)) != null) {
                c0489bf5.m3566i(fArr);
                c0489bf5.m3567j(b33.m3429g(i20.m6597v(jMo11227d), c0489bf5.m3561d().m7167c()));
                z = true;
                c0525cf.m3995b(c0489bf5, true);
                n90Var.f25553j = c0525cf.f15974a.getLength();
            } else {
                z = true;
                n90Var.f25553j = 0.0f;
            }
            n90Var.f25546c = jMo11227d;
            n90Var.f25544a = f4;
            n90Var.f25545b = f;
            n90Var.f25550g = pd4Var;
            n90Var.f25551h = pd4Var2;
            n90Var.f25548e = f2;
            n90Var.f25554k = z3;
            z2 = z;
        }
        float[] fArr2 = n90Var.f25556m;
        if (h74.m6270b(n90Var.f25546c, 9205357640488583168L)) {
            C1077qn.m9987m("updateDrawPaths was called before updateFullPaths");
            return null;
        }
        if (!z2 && n90Var.f25547d == fFloatValue3 && n90Var.f25549f == fM13399h) {
            c0489bf2 = c0489bf4;
        } else {
            c0489bf4.m3565h();
            c0489bf3.m3565h();
            float f7 = n90Var.f25552i;
            float f8 = 0.0f * f7;
            float f9 = fFloatValue3 * f7;
            float fMin = (Math.min(f9, n90Var.f25563t) * 2.0f) + Math.min(f9, n90Var.f25548e);
            if (n90Var.f25554k) {
                float f10 = fM13399h < 0.0f ? 0.0f : fM13399h;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = n90Var.f25552i * f10;
                c0525cf2.m3994a(f8 + f11, f9 + f11, c0489bf3);
                float f12 = (f10 * 360.0f) % 360.0f;
                if (f12 != 0.0f) {
                    jl3 jl3VarM3561d = c0489bf.m3561d();
                    c0489bf3.m3567j((((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (jl3VarM3561d.m7167c() >> c)))) << c) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (jl3VarM3561d.m7167c() & 4294967295L)))) & 4294967295L));
                    rq2.m10395e(fArr2);
                    rq2.m10396f(fArr2, -f12);
                    c0489bf3.m3566i(fArr2);
                    c0489bf3.m3567j((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jl3VarM3561d.m7167c() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jl3VarM3561d.m7167c() >> c)))) << c));
                }
            } else {
                c0525cf2.m3994a(f8, f9, c0489bf3);
            }
            float f13 = n90Var.f25553j;
            if (f13 > 0.0f) {
                c0489bf2 = c0489bf4;
                c0525cf.m3994a((fFloatValue3 * f13) + fMin, f13 - fMin, c0489bf2);
            } else {
                c0489bf2 = c0489bf4;
            }
            n90Var.f25547d = fFloatValue3;
            n90Var.f25549f = fM13399h;
        }
        yf2 yf2Var2 = yf2Var;
        jp0 jp0Var = yf2Var2.f35194a.f22064b;
        long jM7219E = jp0Var.m7219E();
        jp0Var.m7248w().mo6253j();
        try {
            ar3 ar3Var = (ar3) jp0Var.f22481b;
            ar3Var.m3154x(i20.m6597v(((jp0) ar3Var.f14813b).m7219E()), f3 + f5 + 90.0f);
            long j = l22Var.f23739q;
            long j2 = l22Var.f23740r;
            pd4 pd4Var3 = l22Var.f23741s;
            pd4 pd4Var4 = l22Var.f23742t;
            long j3 = pb0.f27500g;
            if (!ws4.m12408a(j2, j3)) {
                if (ws4.m12408a(j2, pb0.f27501h)) {
                    yf2Var2 = yf2Var2;
                } else {
                    yf2Var2 = yf2Var2;
                    u31.m11224q(yf2Var2, c0489bf2, j2, pd4Var4, 52);
                }
            }
            if (!ws4.m12408a(j, j3) && !ws4.m12408a(j, pb0.f27501h)) {
                u31.m11224q(yf2Var2, c0489bf3, j, pd4Var3, 52);
            }
            return ju4.f22634a;
        } finally {
            d55.m4374s(jp0Var, jM7219E);
        }
    }
}
