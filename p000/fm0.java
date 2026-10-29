package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 extends mt2 implements bj0, cr2 {

    /* JADX INFO: renamed from: o */
    public d63 f19108o;

    /* JADX INFO: renamed from: p */
    public vy3 f19109p;

    /* JADX INFO: renamed from: q */
    public boolean f19110q;

    /* JADX INFO: renamed from: r */
    public k30 f19111r;

    /* JADX INFO: renamed from: s */
    public gy3 f19112s;

    /* JADX INFO: renamed from: t */
    public b30 f19113t;

    /* JADX INFO: renamed from: u */
    public boolean f19114u;

    /* JADX INFO: renamed from: v */
    public long f19115v;

    /* JADX INFO: renamed from: w */
    public boolean f19116w;

    /* JADX INFO: renamed from: Q0 */
    public static boolean m5738Q0(fm0 fm0Var, jl3 jl3Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = fm0Var.m5740P0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM5742S0 = fm0Var.m5742S0(jl3Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM5742S0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM5742S0 & 4294967295L))) <= 0.5f;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    /* JADX INFO: renamed from: O0 */
    public final float m5739O0(k30 k30Var, long j) {
        float f;
        jl3 jl3Var;
        int iCompare;
        long j2 = this.f19115v;
        uw2 uw2Var = this.f19113t.f15048a;
        int i = uw2Var.f32213c - 1;
        Object[] objArr = uw2Var.f32211a;
        if (i < objArr.length) {
            jl3Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                jl3 jl3Var2 = (jl3) ((cm0) objArr[i]).f16119a.invoke();
                if (jl3Var2 != null) {
                    long jM7168d = jl3Var2.m7168d();
                    long jM13369a0 = z62.m13369a0(m5740P0());
                    f = 0.0f;
                    int iOrdinal = this.f19108o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM7168d & 4294967295L)), Float.intBitsToFloat((int) (jM13369a0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            C0670g.m5864c();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM7168d >> 32)), Float.intBitsToFloat((int) (jM13369a0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (jl3Var != null) {
                            break;
                        }
                        jl3Var = jl3Var2;
                        break;
                    }
                    jl3Var = jl3Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            jl3Var = null;
        }
        if (jl3Var == null) {
            jl3 jl3Var3 = this.f19114u ? (jl3) this.f19112s.invoke() : null;
            if (jl3Var3 == null) {
                return f;
            }
            jl3Var = jl3Var3;
        }
        long jM13369a1 = z62.m13369a0(j2);
        int iOrdinal2 = this.f19108o.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = jl3Var.f22397b;
            return k30Var.mo7365a(f2 - ((int) (j & 4294967295L)), jl3Var.f22399d - f2, Float.intBitsToFloat((int) (jM13369a1 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = jl3Var.f22396a;
            return k30Var.mo7365a(f3 - ((int) (j >> 32)), jl3Var.f22398c - f3, Float.intBitsToFloat((int) (jM13369a1 >> 32)));
        }
        C0670g.m5864c();
        return f;
    }

    /* JADX INFO: renamed from: P0 */
    public final long m5740P0() {
        long j = this.f19115v;
        if (w52.m12108c(j, -1L)) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m5741R0(long j) {
        k30 k30Var = this.f19111r;
        if (k30Var == null) {
            k30Var = (k30) sj3.m10825u(this, m30.f24616a);
        }
        k30 k30Var2 = k30Var;
        if (this.f19116w) {
            t32.m10970c("launchAnimation called when previous animation was running");
        }
        k30 k30Var3 = this.f19111r;
        if (k30Var3 == null) {
            k30Var3 = (k30) sj3.m10825u(this, m30.f24616a);
        }
        k30Var3.getClass();
        k30.f22840a.getClass();
        db4 db4Var = j30.f21981b;
        iv4 iv4Var = new iv4();
        iv4Var.f21825a = db4Var.mo4410a(sw4.f30612a);
        iv4Var.f21826b = Long.MIN_VALUE;
        iv4Var.f21827c = iv4.f21824f;
        VarHandle.storeStoreFence();
        lb5.m7910S(m8391C0(), null, cp0.f16328d, new em0(this, iv4Var, k30Var2, j, null), 1);
    }

    /* JADX INFO: renamed from: S0 */
    public final long m5742S0(jl3 jl3Var, long j, long j2) {
        long jM13369a0 = z62.m13369a0(j);
        int iOrdinal = this.f19108o.ordinal();
        if (iOrdinal == 0) {
            k30 k30Var = this.f19111r;
            if (k30Var == null) {
                k30Var = (k30) sj3.m10825u(this, m30.f24616a);
            }
            float f = jl3Var.f22397b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(k30Var.mo7365a(f - ((int) (j2 & 4294967295L)), jl3Var.f22399d - f, Float.intBitsToFloat((int) (jM13369a0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            C0670g.m5864c();
            return 0L;
        }
        k30 k30Var2 = this.f19111r;
        if (k30Var2 == null) {
            k30Var2 = (k30) sj3.m10825u(this, m30.f24616a);
        }
        float f2 = jl3Var.f22396a;
        return (((long) Float.floatToRawIntBits(k30Var2.mo7365a(f2 - ((int) (j2 >> 32)), jl3Var.f22398c - f2, Float.intBitsToFloat((int) (jM13369a0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // p000.cr2
    /* JADX INFO: renamed from: b */
    public final void mo2964b(long j) {
        int iM13393u;
        long j2;
        long jM5740P0 = m5740P0();
        this.f19115v = j;
        int iOrdinal = this.f19108o.ordinal();
        if (iOrdinal == 0) {
            iM13393u = z62.m13393u((int) (j & 4294967295L), (int) (jM5740P0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return;
            }
            iM13393u = z62.m13393u((int) (j >> 32), (int) (jM5740P0 >> 32));
        }
        if (iM13393u >= 0) {
            return;
        }
        if (this.f19110q) {
            j2 = 0;
        } else {
            j2 = this.f19108o == d63.f16814a ? ((long) (((int) (jM5740P0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM5740P0 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        jl3 jl3Var = (jl3) this.f19112s.invoke();
        if (jl3Var == null || this.f19116w || this.f19114u || !m5738Q0(this, jl3Var, jM5740P0, 0L, 2) || m5738Q0(this, jl3Var, 0L, j3, 1)) {
            return;
        }
        this.f19114u = true;
        m5741R0(j3);
    }
}
