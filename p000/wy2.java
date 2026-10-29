package p000;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0910mi f33855a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zx2 f33856b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ float f33857c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ float f33858d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C0910mi f33859e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ C0489bf f33860f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ xb4 f33861g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        char c;
        u31 u31Var;
        long jMo11227d;
        float fIntBitsToFloat2;
        C0910mi c0910mi = this.f33855a;
        zx2 zx2Var = this.f33856b;
        float f = this.f33857c;
        float f2 = this.f33858d;
        C0910mi c0910mi2 = this.f33859e;
        C0489bf c0489bf = this.f33860f;
        xb4 xb4Var = this.f33861g;
        u31 u31Var2 = (u31) obj;
        long j = ((b33) c0910mi.m8328d()).f15059a;
        yx2 yx2Var = zx2Var.f36443a;
        boolean z = yx2Var == yx2.f35586c;
        int iOrdinal = yx2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
            } else {
                if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return null;
                }
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            fIntBitsToFloat = -fIntBitsToFloat2;
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float f3 = (fIntBitsToFloat / f) + 1.0f;
        if (f3 < 0.1f) {
            f3 = 0.1f;
        }
        if (fIntBitsToFloat < 0.0f) {
            fIntBitsToFloat = 0.0f;
        }
        float f4 = (fIntBitsToFloat * 0.2f) / f3;
        if (z) {
            c = ' ';
            u31Var = u31Var2;
            jMo11227d = u31Var2.mo11227d() >> 32;
        } else {
            c = ' ';
            u31Var = u31Var2;
            jMo11227d = u31Var.mo11227d() & 4294967295L;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) jMo11227d);
        long jMo11227d2 = u31Var.mo11227d();
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (z ? jMo11227d2 & 4294967295L : jMo11227d2 >> c));
        float fMin = Math.min(f2, fIntBitsToFloat3) / 2.0f;
        float fM10674o = sc6.m10674o(yx2Var == yx2.f35585b ? fIntBitsToFloat3 - ((Number) c0910mi2.m8328d()).floatValue() : ((Number) c0910mi2.m8328d()).floatValue(), fMin, fIntBitsToFloat3 - fMin);
        jp0 jp0VarMo7035J = u31Var.mo7035J();
        long jM7219E = jp0VarMo7035J.m7219E();
        jp0VarMo7035J.m7248w().mo6253j();
        try {
            ar3 ar3Var = (ar3) jp0VarMo7035J.f22481b;
            int iOrdinal2 = yx2Var.ordinal();
            if (iOrdinal2 == 0) {
                ar3Var.m3130A(Float.intBitsToFloat((int) (((jp0) ar3Var.f14813b).m7219E() >> c)), 0.0f);
                ar3Var.m3154x(0L, 90.0f);
            } else if (iOrdinal2 == 1) {
                ar3Var.m3130A(0.0f, Float.intBitsToFloat((int) (((jp0) ar3Var.f14813b).m7219E() & 4294967295L)));
                ar3Var.m3154x(0L, -90.0f);
            } else if (iOrdinal2 != 2) {
                throw new gf0();
            }
            c0489bf.m3564g();
            Path path = c0489bf.f15228a;
            path.moveTo(0.0f, fIntBitsToFloat4);
            c0489bf.m3562e(0.0f, 0.0f);
            c0489bf.m3562e(fM10674o - fMin, 0.0f);
            float f5 = fMin * 0.5f;
            float f6 = fM10674o - f5;
            float f7 = -f4;
            c0489bf.m3560c(f6, 0.0f, f6, f7, fM10674o, f7);
            float f8 = fM10674o + f5;
            c0489bf.m3560c(f8, f7, f8, 0.0f, fM10674o + fMin, 0.0f);
            c0489bf.m3562e(fIntBitsToFloat3, 0.0f);
            c0489bf.m3562e(fIntBitsToFloat3, fIntBitsToFloat4);
            path.close();
            u31.m11224q(u31Var, c0489bf, ((pb0) xb4Var.getValue()).f27503a, null, 60);
            d55.m4374s(jp0VarMo7035J, jM7219E);
            return ju4.f22634a;
        } catch (Throwable th) {
            d55.m4374s(jp0VarMo7035J, jM7219E);
            throw th;
        }
    }
}
