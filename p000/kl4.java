package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kl4 {

    /* JADX INFO: renamed from: a */
    public jl4 f23216a;

    /* JADX INFO: renamed from: b */
    public cf2 f23217b;

    /* JADX INFO: renamed from: c */
    public cf2 f23218c;

    /* JADX INFO: renamed from: a */
    public final long m7543a(long j) {
        jl3 jl3VarMo4003Q;
        cf2 cf2Var = this.f23217b;
        jl3 jl3Var = jl3.f22395e;
        if (cf2Var != null) {
            if (cf2Var.mo4000K()) {
                cf2 cf2Var2 = this.f23218c;
                jl3VarMo4003Q = cf2Var2 != null ? cf2Var2.mo4003Q(cf2Var, true) : null;
            } else {
                jl3VarMo4003Q = jl3Var;
            }
            if (jl3VarMo4003Q != null) {
                jl3Var = jl3VarMo4003Q;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = jl3Var.f22396a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = jl3Var.f22398c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = jl3Var.f22397b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = jl3Var.f22399d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final int m7544b(long j, boolean z) {
        if (z) {
            j = m7543a(j);
        }
        return this.f23216a.f22401b.m13248g(m7546d(j));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7545c(long j) {
        long jM7546d = m7546d(m7543a(j));
        jl4 jl4Var = this.f23216a;
        int iM13246e = jl4Var.f22401b.m13246e(Float.intBitsToFloat((int) (4294967295L & jM7546d)));
        int i = (int) (jM7546d >> 32);
        return Float.intBitsToFloat(i) >= jl4Var.m7178d(iM13246e) && Float.intBitsToFloat(i) <= jl4Var.m7179e(iM13246e);
    }

    /* JADX INFO: renamed from: d */
    public final long m7546d(long j) {
        cf2 cf2Var;
        cf2 cf2Var2 = this.f23217b;
        if (cf2Var2 != null) {
            if (!cf2Var2.mo4000K()) {
                cf2Var2 = null;
            }
            if (cf2Var2 != null && (cf2Var = this.f23218c) != null) {
                cf2 cf2Var3 = cf2Var.mo4000K() ? cf2Var : null;
                if (cf2Var3 != null) {
                    return cf2Var2.mo3998G(cf2Var3, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final long m7547e(long j) {
        cf2 cf2Var;
        cf2 cf2Var2 = this.f23217b;
        if (cf2Var2 != null) {
            if (!cf2Var2.mo4000K()) {
                cf2Var2 = null;
            }
            if (cf2Var2 != null && (cf2Var = this.f23218c) != null) {
                cf2 cf2Var3 = cf2Var.mo4000K() ? cf2Var : null;
                if (cf2Var3 != null) {
                    return cf2Var3.mo3998G(cf2Var2, j);
                }
            }
        }
        return j;
    }
}
