package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y74 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ d63 f34995a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ k84 f34996b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f34997c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ long f34998d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long f34999e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ long f35000f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ float f35001g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ float f35002h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ mq1 f35003i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ nq1 f35004j;

    /* JADX WARN: Code duplicated, block: B:129:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:150:0x0326  */
    /* JADX WARN: Code duplicated, block: B:152:0x034b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0350  */
    /* JADX WARN: Code duplicated, block: B:156:0x036b  */
    /* JADX WARN: Code duplicated, block: B:164:0x03af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float fMo3575E;
        boolean z;
        boolean z2;
        float f;
        float f2;
        float fMo3575E2;
        float f3;
        float f4;
        float fMo3575E3;
        float fMo3575E4;
        u31 u31Var;
        boolean z3;
        long j;
        nq1 nq1Var;
        d63 d63Var;
        mq1 mq1Var;
        float f5;
        float f6;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jFloatToRawIntBits3;
        int iFloatToRawIntBits2;
        long jFloatToRawIntBits4;
        u31 u31Var2;
        long jFloatToRawIntBits5;
        int iFloatToRawIntBits3;
        long jFloatToRawIntBits6;
        long jFloatToRawIntBits7;
        int iFloatToRawIntBits4;
        long jFloatToRawIntBits8;
        long jFloatToRawIntBits9;
        int iFloatToRawIntBits5;
        long jFloatToRawIntBits10;
        int iFloatToRawIntBits6;
        long jFloatToRawIntBits11;
        d63 d63Var2 = this.f34995a;
        k84 k84Var = this.f34996b;
        long j2 = this.f34997c;
        long j3 = this.f34998d;
        long j4 = this.f34999e;
        long j5 = this.f35000f;
        float f7 = this.f35001g;
        float f8 = this.f35002h;
        mq1 mq1Var2 = this.f35003i;
        nq1 nq1Var2 = this.f35004j;
        u31 u31Var3 = (u31) obj;
        if (p11.m9352c(Float.NaN, Float.NaN)) {
            fMo3575E = (d63Var2 == d63.f16814a ? Float.intBitsToFloat((int) (u31Var3.mo11227d() >> 32)) : Float.intBitsToFloat((int) (u31Var3.mo11227d() & 4294967295L))) / 2.0f;
        } else {
            j2 = j2;
            mq1Var2 = mq1Var2;
            fMo3575E = u31Var3.mo3575E(Float.NaN);
        }
        k84Var.m7426c();
        a83 a83Var = k84Var.f22996k;
        a83 a83Var2 = k84Var.f22995j;
        k84Var.m7426c();
        float fMo3586w0 = u31Var3.mo3586w0(a83Var2.m132h());
        float fMo3586w1 = u31Var3.mo3586w0(a83Var.m132h());
        a84 a84Var = a84.f165a;
        float[] fArr = k84Var.f22989d;
        float fM7426c = k84Var.m7426c();
        float f9 = f7 + 0.0f;
        float fMo3572A0 = u31Var3.mo3572A0(fMo3575E);
        boolean z4 = d63Var2 == d63.f16814a;
        boolean z5 = u31Var3.getLayoutDirection() == df2.f17012b;
        boolean z6 = z5 && !z4;
        float fMo3575E5 = u31Var3.mo3575E(fMo3572A0);
        long jMo11227d = u31Var3.mo11227d();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (z4 ? jMo11227d & 4294967295L : jMo11227d >> 32));
        if (z62.m13386n(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[0]))) {
            z = true;
        } else {
            if (z62.m13386n(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[fArr.length - 1]))) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z62.m13386n(fM7426c, fArr.length == 0 ? null : Float.valueOf(fArr[0]))) {
            z2 = true;
        } else {
            if (z62.m13386n(fM7426c, fArr.length != 0 ? Float.valueOf(fArr[fArr.length - 1]) : null)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (fArr.length == 0 || z2) {
            f = 0.0f;
            f2 = ((fIntBitsToFloat - 0.0f) * fM7426c) + 0.0f;
        } else {
            f = 0.0f;
            f2 = (((fIntBitsToFloat - 0.0f) - (fMo3575E5 * 2.0f)) * fM7426c) + 0.0f + fMo3575E5;
        }
        float f10 = f2;
        float f11 = (fArr.length == 0 || z) ? ((fIntBitsToFloat - f) * f) + f : (((fIntBitsToFloat - f) - (fMo3575E5 * 2.0f)) * f) + f + fMo3575E5;
        float fMo3575E6 = u31Var3.mo3575E(f8);
        if (z4) {
            fMo3575E2 = p11.m9351b(f, f) > 0 ? (u31Var3.mo3575E(f) / 2.0f) + u31Var3.mo3575E(f) : f;
            if (p11.m9351b(f9, f) > 0) {
                fMo3575E3 = u31Var3.mo3575E(fMo3586w1) / 2.0f;
                fMo3575E4 = u31Var3.mo3575E(f9);
                f3 = fMo3575E2;
                f4 = fMo3575E3 + fMo3575E4;
            } else {
                f3 = fMo3575E2;
                f4 = f;
            }
        } else {
            fMo3575E2 = p11.m9351b(f, f) > 0 ? (u31Var3.mo3575E(f) / 2.0f) + u31Var3.mo3575E(f) : f;
            if (p11.m9351b(f9, f) > 0) {
                fMo3575E3 = u31Var3.mo3575E(fMo3586w0) / 2.0f;
                fMo3575E4 = u31Var3.mo3575E(f9);
                f3 = fMo3575E2;
                f4 = fMo3575E3 + fMo3575E4;
            } else {
                f3 = fMo3575E2;
                f4 = 0.0f;
            }
        }
        long jMo11226a0 = u31Var3.mo11226a0();
        Float.intBitsToFloat((int) (z4 ? jMo11226a0 & 4294967295L : jMo11226a0 >> 32));
        if (f10 < (fIntBitsToFloat - f4) - fMo3575E5) {
            u31Var = u31Var3;
            float f12 = z6 ? fMo3575E5 : fMo3575E6;
            float f13 = z6 ? fMo3575E6 : fMo3575E5;
            float f14 = f10 + f4;
            float f15 = fIntBitsToFloat - f14;
            if (z4) {
                jFloatToRawIntBits7 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits8 = Float.floatToRawIntBits(f14);
            } else {
                if (z5) {
                    jFloatToRawIntBits7 = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                } else {
                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f14);
                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                }
                jFloatToRawIntBits8 = iFloatToRawIntBits4;
            }
            long j6 = (jFloatToRawIntBits7 << 32) | (jFloatToRawIntBits8 & 4294967295L);
            if (z4) {
                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)));
                iFloatToRawIntBits5 = Float.floatToRawIntBits(f15);
            } else if (z5) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) - f14;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L));
                jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L));
                jFloatToRawIntBits9 = Float.floatToRawIntBits(f15);
                iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
            }
            long j7 = (((long) iFloatToRawIntBits5) & 4294967295L) | (jFloatToRawIntBits9 << 32);
            z3 = z4;
            d63Var = d63Var2;
            mq1Var = mq1Var2;
            long j8 = j2;
            j = j4;
            nq1Var = nq1Var2;
            a84.m134e(u31Var, d63Var, j6, j7, j8, f12, f13);
            if (z3) {
                jFloatToRawIntBits10 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11226a0() >> 32)));
                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fMo3575E5);
            } else {
                if (z5) {
                    jFloatToRawIntBits11 = (((long) Float.floatToRawIntBits(fMo3575E5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11226a0() & 4294967295L)))) & 4294967295L);
                } else {
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (u31Var.mo11226a0() & 4294967295L));
                    jFloatToRawIntBits10 = Float.floatToRawIntBits(fIntBitsToFloat - fMo3575E5);
                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                }
                if (mq1Var != null) {
                    mq1Var.invoke(u31Var, b33.m3423a(jFloatToRawIntBits11));
                }
            }
            jFloatToRawIntBits11 = (((long) iFloatToRawIntBits6) & 4294967295L) | (jFloatToRawIntBits10 << 32);
            if (mq1Var != null) {
                mq1Var.invoke(u31Var, b33.m3423a(jFloatToRawIntBits11));
            }
        } else {
            u31Var = u31Var3;
            z3 = z4;
            j = j4;
            nq1Var = nq1Var2;
            d63Var = d63Var2;
            mq1Var = mq1Var2;
        }
        float f16 = f10 - f4;
        float f17 = !z6 ? fMo3575E5 : fMo3575E6;
        float f18 = z6 ? fMo3575E5 : fMo3575E6;
        if (z6) {
            f6 = f16;
            f5 = 0.0f;
        } else {
            f5 = 0.0f;
            f6 = f16 - 0.0f;
        }
        if (f6 > f17) {
            if (z3) {
                jFloatToRawIntBits3 = Float.floatToRawIntBits(f5);
                iFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
            } else {
                if (z5) {
                    jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) - f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                } else {
                    jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                }
                if (z3) {
                    u31Var2 = u31Var;
                    jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)))) << 32);
                } else {
                    u31Var2 = u31Var;
                    if (z5) {
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (u31Var2.mo11227d() & 4294967295L));
                        jFloatToRawIntBits5 = Float.floatToRawIntBits(f16);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                    } else {
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (u31Var2.mo11227d() & 4294967295L));
                        jFloatToRawIntBits5 = Float.floatToRawIntBits(f6);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                    }
                    jFloatToRawIntBits6 = (jFloatToRawIntBits5 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
                }
                long j9 = jFloatToRawIntBits6;
                u31Var = u31Var2;
                a84.m134e(u31Var, d63Var, jFloatToRawIntBits4, j9, j3, f17, f18);
                f5 = 0.0f;
            }
            jFloatToRawIntBits4 = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits2) & 4294967295L);
            if (z3) {
                u31Var2 = u31Var;
                jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)))) << 32);
            } else {
                u31Var2 = u31Var;
                if (z5) {
                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (u31Var2.mo11227d() & 4294967295L));
                    jFloatToRawIntBits5 = Float.floatToRawIntBits(f16);
                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat8);
                } else {
                    float fIntBitsToFloat9 = Float.intBitsToFloat((int) (u31Var2.mo11227d() & 4294967295L));
                    jFloatToRawIntBits5 = Float.floatToRawIntBits(f6);
                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat9);
                }
                jFloatToRawIntBits6 = (jFloatToRawIntBits5 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
            }
            long j10 = jFloatToRawIntBits6;
            u31Var = u31Var2;
            a84.m134e(u31Var, d63Var, jFloatToRawIntBits4, j10, j3, f17, f18);
            f5 = 0.0f;
        }
        float f19 = f5 + fMo3575E5;
        float f20 = fIntBitsToFloat - fMo3575E5;
        ma0 ma0VarM10645Q = sc6.m10645Q(f5, f16);
        sc6.m10645Q(f5, f5);
        sc6.m10645Q(f11 - f3, f11 + f3);
        ma0 ma0VarM10645Q2 = sc6.m10645Q(f10 - f4, f10 + f4);
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f21 = fArr[i];
            int i3 = i2 + 1;
            if (mq1Var == null || i2 != fArr.length - 1) {
                float fM13656G = zp0.m13656G(f19, f20, f21);
                if (ma0VarM10645Q2.m8256a(Float.valueOf(fM13656G))) {
                    f19 = f19;
                    f20 = f20;
                } else {
                    if (z3) {
                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (u31Var.mo11226a0() >> 32)));
                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fM13656G);
                    } else {
                        if (z5) {
                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) - fM13656G;
                            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (u31Var.mo11226a0() & 4294967295L));
                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat11);
                        } else {
                            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (u31Var.mo11226a0() & 4294967295L));
                            jFloatToRawIntBits = Float.floatToRawIntBits(fM13656G);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat12);
                        }
                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                    }
                    nq1Var.invoke(u31Var, b33.m3423a((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32)), pb0.m9462a(ma0VarM10645Q.m8256a(Float.valueOf(fM13656G)) ? j5 : j));
                }
            } else {
                f19 = f19;
                f20 = f20;
            }
            i++;
            f19 = f19;
            i2 = i3;
            f20 = f20;
        }
        return ju4.f22634a;
    }
}
