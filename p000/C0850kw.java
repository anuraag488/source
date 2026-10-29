package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: kw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0850kw extends mt2 implements s31, y23, g14 {

    /* JADX INFO: renamed from: o */
    public long f23548o;

    /* JADX INFO: renamed from: p */
    public p44 f23549p;

    /* JADX INFO: renamed from: q */
    public long f23550q;

    /* JADX INFO: renamed from: r */
    public df2 f23551r;

    /* JADX INFO: renamed from: s */
    public lb5 f23552s;

    /* JADX INFO: renamed from: t */
    public p44 f23553t;

    /* JADX INFO: renamed from: u */
    public lb5 f23554u;

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        this.f23550q = 9205357640488583168L;
        this.f23551r = null;
        this.f23552s = null;
        this.f23553t = null;
        z62.m13348G(this);
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        lb5 lb5Var;
        yf2 yf2Var2;
        C0489bf c0489bf;
        yf2 yf2Var3 = yf2Var;
        j70 j70Var = yf2Var3.f35194a;
        if (this.f23549p != k43.f22879x) {
            uf1 uf1Var = uf1.f31820j;
            if (h74.m6270b(j70Var.mo11227d(), this.f23550q) && yf2Var3.getLayoutDirection() == this.f23551r && z62.m13387o(this.f23553t, this.f23549p)) {
                lb5Var = this.f23552s;
            } else {
                C0675g4 c0675g4 = new C0675g4((byte) 7);
                c0675g4.f19600b = this;
                c0675g4.f19601c = yf2Var3;
                VarHandle.storeStoreFence();
                c20.m3797B(this, c0675g4);
                lb5Var = this.f23554u;
                this.f23554u = null;
            }
            this.f23552s = lb5Var;
            this.f23550q = j70Var.mo11227d();
            this.f23551r = yf2Var3.getLayoutDirection();
            this.f23553t = this.f23549p;
            if (!ws4.m12408a(this.f23548o, pb0.f27501h)) {
                long j = this.f23548o;
                if (lb5Var instanceof h63) {
                    jl3 jl3Var = ((h63) lb5Var).f20408o;
                    float f = jl3Var.f22396a;
                    float f2 = jl3Var.f22397b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
                    long jM13015P = y70.m13015P(jl3Var);
                    yf2Var2 = yf2Var;
                    yf2Var2.mo7034H(j, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), jM13015P, uf1Var, 3);
                } else {
                    yf2Var2 = yf2Var3;
                    if (lb5Var instanceof i63) {
                        i63 i63Var = (i63) lb5Var;
                        c0489bf = i63Var.f21140p;
                        if (c0489bf == null) {
                            cr3 cr3Var = i63Var.f21139o;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (cr3Var.f16398h >> 32));
                            float f3 = cr3Var.f16391a;
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(cr3Var.f16392b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(cr3Var.m4144b())) << 32) | (((long) Float.floatToRawIntBits(cr3Var.m4143a())) & 4294967295L);
                            long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i = (int) (jFloatToRawIntBits3 >> 32);
                            int i2 = (int) (jFloatToRawIntBits3 & 4294967295L);
                            j70Var.f22063a.f21148c.mo6252h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits5 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits5 & 4294967295L)), j70.m7033a(j70Var, j, uf1Var, 3));
                        }
                    } else {
                        if (!(lb5Var instanceof g63)) {
                            C0670g.m5864c();
                            return;
                        }
                        c0489bf = ((g63) lb5Var).f19622o;
                    }
                    yf2Var2.mo7040m0(c0489bf, j, uf1Var);
                }
            }
            yf2Var2.m13113a();
        }
        if (!ws4.m12408a(this.f23548o, pb0.f27501h)) {
            u31.m11225x(yf2Var, this.f23548o, 0L, 0L, null, 126);
            yf2Var3 = yf2Var;
        }
        yf2Var2 = yf2Var3;
        yf2Var2.m13113a();
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        o14.m8924e(q14Var, this.f23549p);
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: k */
    public final boolean mo5442k() {
        return false;
    }
}
