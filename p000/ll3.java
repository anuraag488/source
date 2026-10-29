package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ll3 {

    /* JADX INFO: renamed from: a */
    public lv2 f24126a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f24127b;

    /* JADX INFO: renamed from: c */
    public C0795je f24128c;

    /* JADX INFO: renamed from: d */
    public mm4 f24129d;

    /* JADX INFO: renamed from: e */
    public cw2 f24130e;

    /* JADX INFO: renamed from: f */
    public boolean f24131f;

    /* JADX INFO: renamed from: g */
    public boolean f24132g;

    /* JADX INFO: renamed from: h */
    public boolean f24133h;

    /* JADX INFO: renamed from: i */
    public RunnableC1054q0 f24134i;

    /* JADX INFO: renamed from: j */
    public long f24135j;

    /* JADX INFO: renamed from: k */
    public g32 f24136k;

    /* JADX INFO: renamed from: l */
    public kw2 f24137l;

    /* JADX INFO: renamed from: c */
    public static boolean m8024c(e13 e13Var) {
        q63 q63Var = e13Var.f17623V;
        return (q63Var == null || y42.m12871t0(((du1) q63Var).m4734b())) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static long m8025f(wf2 wf2Var) {
        C0940nb c0940nb = wf2Var.f33299G;
        e13 e13Var = (e13) c0940nb.f25608e;
        long jM8958e = 0;
        for (e13 e13Var2 = (w32) c0940nb.f25607d; e13Var2 != null && e13Var2 != e13Var; e13Var2 = e13Var2.f17629y) {
            if (m8024c(e13Var2)) {
                return 9223372034707292159L;
            }
            jM8958e = o52.m8958e(jM8958e, e13Var2.f17609H);
        }
        return jM8958e;
    }

    /* JADX INFO: renamed from: i */
    public static void m8026i(wf2 wf2Var) {
        if (!wf2Var.f33313c || m8024c((e13) wf2Var.f33299G.f25608e)) {
            return;
        }
        wf2Var.f33313c = false;
        if (wf2Var.f33315e) {
            wf2Var.f33314d = m8025f(wf2Var);
            wf2Var.f33315e = false;
        }
        if (o52.m8956c(wf2Var.f33314d, 9223372034707292159L)) {
            return;
        }
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            m8026i((wf2) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0278 A[LOOP:11: B:100:0x0276->B:101:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0283 A[LOOP:9: B:93:0x0253->B:105:0x0283, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x028a A[ADDED_TO_REGION, LOOP:12: B:108:0x028a->B:109:0x028c, LOOP_START, PHI: r1
  0x028a: PHI (r1v6 lm4) = (r1v5 lm4), (r1v7 lm4) binds: [B:107:0x0288, B:109:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x028c A[LOOP:12: B:108:0x028a->B:109:0x028c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0297  */
    /* JADX WARN: Code duplicated, block: B:133:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0286 A[EDGE_INSN: B:134:0x0286->B:106:0x0286 BREAK  A[LOOP:9: B:93:0x0253->B:105:0x0283], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0286 A[EDGE_INSN: B:135:0x0286->B:106:0x0286 BREAK  A[LOOP:9: B:93:0x0253->B:105:0x0283], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9 A[ADDED_TO_REGION, LOOP:7: B:72:0x01b9->B:73:0x01bb, LOOP_START, PHI: r3 r4
  0x01b9: PHI (r3v11 lm4) = (r3v10 lm4), (r3v12 lm4) binds: [B:71:0x01b7, B:73:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r4v5 long) = (r4v4 long), (r4v12 long) binds: [B:71:0x01b7, B:73:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb A[LOOP:7: B:72:0x01b9->B:73:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0223  */
    /* JADX WARN: Code duplicated, block: B:90:0x0247  */
    /* JADX WARN: Code duplicated, block: B:92:0x0252  */
    /* JADX WARN: Code duplicated, block: B:95:0x025f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0269  */
    /* JADX WARN: Code duplicated, block: B:99:0x026f  */
    /* JADX INFO: renamed from: a */
    public final void m8027a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        lm4 lm4Var;
        int i2;
        long j5;
        int i3;
        int i4;
        lm4 lm4Var2;
        long[] jArr2;
        long[] jArr3;
        int i5;
        int i6;
        int i7;
        long j6;
        long j7;
        float[] fArr;
        lm4 lm4Var3;
        int i8;
        Object[] objArr2;
        long j8;
        long j9;
        C0795je c0795je = this.f24128c;
        mm4 mm4Var = this.f24129d;
        RunnableC1054q0 runnableC1054q0 = this.f24134i;
        if (runnableC1054q0 != null) {
            this.f24127b.removeCallbacks(runnableC1054q0);
            this.f24134i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f24131f;
        boolean z3 = z2 || this.f24132g;
        if (z2) {
            this.f24131f = false;
            cw2 cw2Var = this.f24130e;
            Object[] objArr3 = cw2Var.f16532a;
            int i9 = cw2Var.f16533b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((wp1) objArr3[i10]).invoke();
            }
            long[] jArr4 = (long[]) c0795je.f22194c;
            int i11 = c0795je.f22193b;
            int i12 = 0;
            while (i12 < jArr4.length - 2 && i12 < i11) {
                long j10 = jArr4[i12 + 2];
                int i13 = i11;
                if ((((int) (j10 >> 60)) & 1) != 0) {
                    long j11 = jArr4[i12];
                    long j12 = jArr4[i12 + 1];
                    lm4 lm4Var4 = (lm4) mm4Var.f25032a.m8197b(((int) j10) & 33554431);
                    while (lm4Var4 != null) {
                        lm4 lm4Var5 = lm4Var4.f24176d;
                        boolean z4 = z3;
                        long j13 = lm4Var4.f24179g;
                        boolean z5 = jCurrentTimeMillis - j13 >= 0 || j13 == Long.MIN_VALUE;
                        lm4Var4.f24177e = j11;
                        lm4Var4.f24178f = j12;
                        if (z5) {
                            lm4Var4.f24179g = jCurrentTimeMillis;
                            j8 = j11;
                            j9 = j12;
                            lm4Var4.m8037a(j8, j9, mm4Var.f25035d, mm4Var.f25036e, mm4Var.f25038g);
                        } else {
                            j8 = j11;
                            j9 = j12;
                        }
                        lm4Var4 = lm4Var5;
                        j11 = j8;
                        j12 = j9;
                        z3 = z4;
                        jArr4 = jArr4;
                    }
                }
                i12 += 3;
                i11 = i13;
                z3 = z3;
                jArr4 = jArr4;
            }
            z = z3;
            j = 0;
            long[] jArr5 = (long[]) c0795je.f22194c;
            int i14 = c0795je.f22193b;
            for (int i15 = 0; i15 < jArr5.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr5[i16] = jArr5[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f24132g) {
            this.f24132g = false;
            long j14 = mm4Var.f25035d;
            long j15 = mm4Var.f25036e;
            float[] fArr2 = mm4Var.f25038g;
            int i17 = 8;
            lv2 lv2Var = mm4Var.f25032a;
            j2 = 128;
            Object[] objArr4 = lv2Var.f24667c;
            long[] jArr6 = lv2Var.f24665a;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i18 = length2;
                int i19 = 0;
                j3 = 255;
                while (true) {
                    mm4 mm4Var2 = mm4Var;
                    long j16 = jArr6[i19];
                    long j17 = j14;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i19 - i18)) >>> 31);
                        long j18 = j16;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j18 & 255) < 128) {
                                lm4 lm4Var6 = (lm4) objArr4[(i19 << 3) + i21];
                                while (lm4Var6 != null) {
                                    int i22 = i18;
                                    int i23 = i21;
                                    mm4 mm4Var3 = mm4Var2;
                                    int i24 = i20;
                                    long j19 = j17;
                                    mm4Var3.m8358a(lm4Var6, j19, j15, fArr2, jCurrentTimeMillis);
                                    lm4Var6 = lm4Var6.f24176d;
                                    mm4Var2 = mm4Var3;
                                    i21 = i23;
                                    i18 = i22;
                                    i17 = i17;
                                    objArr4 = objArr4;
                                    j17 = j19;
                                    i20 = i24;
                                }
                            }
                            int i25 = i20;
                            long j20 = j17;
                            Object[] objArr5 = objArr4;
                            int i26 = i17;
                            j18 >>= i26;
                            i17 = i26;
                            i18 = i18;
                            objArr4 = objArr5;
                            mm4Var2 = mm4Var2;
                            i21++;
                            j17 = j20;
                            i20 = i25;
                        }
                        int i27 = i20;
                        mm4Var = mm4Var2;
                        i8 = i18;
                        j14 = j17;
                        objArr2 = objArr4;
                        i = i17;
                        if (i27 != i) {
                            break;
                        }
                    } else {
                        mm4Var = mm4Var2;
                        i8 = i18;
                        j14 = j17;
                        objArr2 = objArr4;
                        i = i17;
                    }
                    if (i19 == i8) {
                        break;
                    }
                    i19++;
                    i17 = i;
                    i18 = i8;
                    objArr4 = objArr2;
                }
            } else {
                i = 8;
            }
            if (z) {
                j6 = mm4Var.f25035d;
                j7 = mm4Var.f25036e;
                fArr = mm4Var.f25038g;
                lm4Var3 = mm4Var.f25033b;
                if (lm4Var3 != null) {
                    while (lm4Var3 != null) {
                        wf2 wf2VarM10652X = sc6.m10652X(lm4Var3.f24174b);
                        long jM8028b = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2VarM10652X)).getRectManager().m8028b(wf2VarM10652X);
                        lm4Var3.f24177e = jM8028b;
                        wq2 wq2Var = wf2VarM10652X.f33300H.f14483p;
                        lm4Var3.f24178f = (((long) (wq2Var.f16900b + ((int) (jM8028b & 4294967295L)))) & 4294967295L) | (((long) (wq2Var.f16899a + ((int) (jM8028b >> 32)))) << 32);
                        j6 = j6;
                        mm4Var.m8358a(lm4Var3, j6, j7, fArr, jCurrentTimeMillis);
                        lm4Var3 = lm4Var3.f24176d;
                    }
                }
            }
            if (this.f24133h) {
                this.f24133h = false;
                jArr2 = (long[]) c0795je.f22194c;
                int i28 = c0795je.f22193b;
                jArr3 = (long[]) c0795je.f22195d;
                i6 = 0;
                for (i5 = 0; i5 < jArr2.length - 2 && i6 < jArr3.length - 2 && i5 < i28; i5 += 3) {
                    i7 = i5 + 2;
                    if (jArr2[i7] != kl3.f23214a) {
                        jArr3[i6] = jArr2[i5];
                        jArr3[i6 + 1] = jArr2[i5 + 1];
                        jArr3[i6 + 2] = jArr2[i7];
                        i6 += 3;
                    }
                }
                c0795je.f22193b = i6;
                c0795je.f22194c = jArr3;
                c0795je.f22195d = jArr2;
            }
            j4 = mm4Var.f25034c;
            if (j4 <= jCurrentTimeMillis) {
                lv2 lv2Var2 = mm4Var.f25032a;
                objArr = lv2Var2.f24667c;
                jArr = lv2Var2.f24665a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i2 = 0;
                    while (true) {
                        j5 = jArr[i2];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (i4 = 0; i4 < i3; i4++) {
                                if ((j5 & j3) < j2) {
                                    for (lm4Var2 = (lm4) objArr[(i2 << 3) + i4]; lm4Var2 != null; lm4Var2 = lm4Var2.f24176d) {
                                    }
                                }
                                j5 >>= i;
                            }
                            if (i3 == i) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                lm4Var = mm4Var.f25033b;
                if (lm4Var != null) {
                    while (lm4Var != null) {
                        lm4Var = lm4Var.f24176d;
                    }
                }
                j4 = -1;
                mm4Var.f25034c = -1L;
            }
            if (j4 > j) {
                m8033j();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j6 = mm4Var.f25035d;
            j7 = mm4Var.f25036e;
            fArr = mm4Var.f25038g;
            lm4Var3 = mm4Var.f25033b;
            if (lm4Var3 != null) {
                while (lm4Var3 != null) {
                    wf2 wf2VarM10652X2 = sc6.m10652X(lm4Var3.f24174b);
                    long jM8028b2 = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2VarM10652X2)).getRectManager().m8028b(wf2VarM10652X2);
                    lm4Var3.f24177e = jM8028b2;
                    wq2 wq2Var2 = wf2VarM10652X2.f33300H.f14483p;
                    lm4Var3.f24178f = (((long) (wq2Var2.f16900b + ((int) (jM8028b2 & 4294967295L)))) & 4294967295L) | (((long) (wq2Var2.f16899a + ((int) (jM8028b2 >> 32)))) << 32);
                    j6 = j6;
                    mm4Var.m8358a(lm4Var3, j6, j7, fArr, jCurrentTimeMillis);
                    lm4Var3 = lm4Var3.f24176d;
                }
            }
        }
        if (this.f24133h) {
            this.f24133h = false;
            jArr2 = (long[]) c0795je.f22194c;
            int i29 = c0795je.f22193b;
            jArr3 = (long[]) c0795je.f22195d;
            i6 = 0;
            while (i5 < jArr2.length - 2) {
                i7 = i5 + 2;
                if (jArr2[i7] != kl3.f23214a) {
                    jArr3[i6] = jArr2[i5];
                    jArr3[i6 + 1] = jArr2[i5 + 1];
                    jArr3[i6 + 2] = jArr2[i7];
                    i6 += 3;
                }
            }
            c0795je.f22193b = i6;
            c0795je.f22194c = jArr3;
            c0795je.f22195d = jArr2;
        }
        j4 = mm4Var.f25034c;
        if (j4 <= jCurrentTimeMillis) {
            lv2 lv2Var3 = mm4Var.f25032a;
            objArr = lv2Var3.f24667c;
            jArr = lv2Var3.f24665a;
            length = jArr.length - 2;
            if (length >= 0) {
                i2 = 0;
                while (true) {
                    j5 = jArr[i2];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        i3 = 8 - ((~(i2 - length)) >>> 31);
                        while (i4 < i3) {
                            if ((j5 & j3) < j2) {
                                while (lm4Var2 != null) {
                                }
                            }
                            j5 >>= i;
                        }
                        if (i3 == i) {
                            break;
                            break;
                        } else {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            lm4Var = mm4Var.f25033b;
            if (lm4Var != null) {
                while (lm4Var != null) {
                    lm4Var = lm4Var.f24176d;
                }
            }
            j4 = -1;
            mm4Var.f25034c = -1L;
        }
        if (j4 > j) {
            m8033j();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m8028b(wf2 wf2Var) {
        if (wf2Var.f33317g == -4) {
            return 9223372034707292159L;
        }
        C0795je c0795je = this.f24128c;
        long j = ((long[]) c0795je.f22194c)[m8029d(wf2Var)];
        int i = (int) (j >> 32);
        return (((long) ((int) j)) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final int m8029d(wf2 wf2Var) {
        int i = wf2Var.f33317g;
        if (i != -4) {
            C0795je c0795je = this.f24128c;
            int i2 = wf2Var.f33312b;
            long[] jArr = (long[]) c0795je.f22194c;
            if (i < 0 || i >= c0795je.f22193b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = c0795je.f22193b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (!(i != -4)) {
            q32.m9719a("LayoutNode " + wf2Var.f33312b + " not found in RectList");
        }
        wf2Var.f33317g = i;
        return i;
    }

    /* JADX INFO: renamed from: e */
    public final void m8030e(wf2 wf2Var) {
        wf2Var.f33313c = true;
        C0940nb c0940nb = wf2Var.f33299G;
        wq2 wq2Var = wf2Var.f33300H.f14483p;
        int iMo4421j0 = wq2Var.mo4421j0();
        int iMo4420i0 = wq2Var.mo4420i0();
        kw2 kw2Var = this.f24137l;
        kw2Var.f23558a = 0.0f;
        kw2Var.f23559b = 0.0f;
        kw2Var.f23560c = iMo4421j0;
        kw2Var.f23561d = iMo4420i0;
        for (e13 e13Var = (e13) c0940nb.f25608e; e13Var != null; e13Var = e13Var.f17629y) {
            wf2 wf2Var2 = e13Var.f17625u;
            if (e13Var == ((e13) wf2Var2.f33299G.f25608e) && !wf2Var2.f33313c) {
                long jM8028b = m8028b(wf2Var2);
                if (!o52.m8956c(jM8028b, 9223372034707292159L)) {
                    kw2Var.m7642c((((long) Float.floatToRawIntBits((int) (jM8028b >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM8028b & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            q63 q63Var = e13Var.f17623V;
            if (q63Var != null) {
                float[] fArrM4734b = ((du1) q63Var).m4734b();
                if (!y42.m12871t0(fArrM4734b)) {
                    rq2.m10394d(fArrM4734b, kw2Var);
                }
            }
            long j = e13Var.f17609H;
            kw2Var.m7642c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) kw2Var.f23558a;
        int i2 = (int) kw2Var.f23559b;
        int i3 = (int) kw2Var.f23560c;
        int i4 = (int) kw2Var.f23561d;
        int i5 = wf2Var.f33312b;
        if (wf2Var.f33317g != -4) {
            C0795je c0795je = this.f24128c;
            int iM8029d = m8029d(wf2Var);
            long[] jArr = (long[]) c0795je.f22194c;
            jArr[iM8029d] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iM8029d + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i6 = iM8029d + 2;
            long j2 = jArr[i6];
            jArr[i6] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            wf2 wf2VarM12295v = wf2Var.m12295v();
            wf2Var.f33317g = this.f24128c.m7081f(i5, i, i2, i3, i4, wf2VarM12295v != null ? wf2VarM12295v.f33312b : -1, wf2VarM12295v != null ? m8029d(wf2VarM12295v) : -4, c0940nb.m8671i(1024), c0940nb.m8671i(16), this.f24129d.f25032a.m8196a(i5));
        }
        wf2Var.f33316f = false;
        this.f24131f = true;
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i7 = uw2VarM12248A.f32213c;
        for (int i8 = 0; i8 < i7; i8++) {
            wf2 wf2Var3 = (wf2) objArr[i8];
            if (wf2Var3.m12257K()) {
                m8030e(wf2Var3);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8031g(wf2 wf2Var) {
        long j;
        boolean zM12257K = wf2Var.m12257K();
        C0940nb c0940nb = wf2Var.f33299G;
        if (zM12257K && wf2Var.f33316f) {
            wf2 wf2VarM12295v = wf2Var.m12295v();
            if (wf2VarM12295v == null || wf2VarM12295v.f33313c) {
                j = wf2VarM12295v == null ? 0L : 9223372034707292159L;
            } else {
                if (wf2VarM12295v.f33315e) {
                    wf2VarM12295v.f33315e = false;
                    wf2VarM12295v.f33314d = m8025f(wf2VarM12295v);
                }
                j = wf2VarM12295v.f33314d;
            }
            e13 e13Var = (e13) c0940nb.f25608e;
            if (o52.m8956c(j, 9223372034707292159L) || m8024c(e13Var)) {
                m8030e(wf2Var);
            } else if (wf2Var.f33313c) {
                m8030e(wf2Var);
                m8026i(wf2Var);
            } else {
                long jM8958e = o52.m8958e(j, e13Var.f17609H);
                wq2 wq2Var = wf2Var.f33300H.f14483p;
                int iMo4421j0 = wq2Var.mo4421j0();
                int iMo4420i0 = wq2Var.mo4420i0();
                if (wf2Var.f33317g != -4) {
                    int iM8029d = m8029d(wf2Var);
                    C0795je c0795je = this.f24128c;
                    if (wf2VarM12295v != null) {
                        int iM8029d2 = m8029d(wf2VarM12295v);
                        long[] jArr = (long[]) c0795je.f22194c;
                        long j2 = jArr[iM8029d2];
                        int i = ((int) (j2 >> 32)) + ((int) (jM8958e >> 32));
                        int i2 = ((int) j2) + ((int) (jM8958e & 4294967295L));
                        long j3 = jArr[iM8029d];
                        int i3 = i - ((int) (j3 >> 32));
                        int i4 = i2 - ((int) j3);
                        int i5 = iM8029d + 2;
                        long j4 = jArr[i5];
                        jArr[iM8029d] = (((long) i2) & 4294967295L) | (((long) i) << 32);
                        jArr[iM8029d + 1] = (((long) (iMo4420i0 + i2)) & 4294967295L) | (((long) (iMo4421j0 + i)) << 32);
                        jArr[i5] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i3 != 0 || i4 != 0) {
                            c0795je.m7084i(iM8029d, i3, i4, j4);
                        }
                    } else {
                        int iM8029d3 = m8029d(wf2Var);
                        int i6 = (int) (jM8958e >> 32);
                        int i7 = (int) (jM8958e & 4294967295L);
                        long[] jArr2 = (long[]) c0795je.f22194c;
                        long j5 = jArr2[iM8029d3];
                        jArr2[iM8029d3] = (((long) i6) << 32) | (((long) i7) & 4294967295L);
                        jArr2[iM8029d3 + 1] = (((long) (iMo4420i0 + i7)) & 4294967295L) | (((long) (iMo4421j0 + i6)) << 32);
                        int i8 = iM8029d3 + 2;
                        long j6 = jArr2[i8];
                        jArr2[i8] = j6 | (((j6 >> 63) & 1) << 60);
                        int i9 = i6 - ((int) (j5 >> 32));
                        int i10 = i7 - ((int) j5);
                        if (i9 != 0 || i10 != 0) {
                            c0795je.m7084i(iM8029d3, i9, i10, j6);
                        }
                    }
                } else {
                    int i11 = wf2Var.f33312b;
                    boolean zM8671i = c0940nb.m8671i(1024);
                    boolean zM8671i2 = c0940nb.m8671i(16);
                    boolean zM8196a = this.f24129d.f25032a.m8196a(i11);
                    C0795je c0795je2 = this.f24128c;
                    if (wf2VarM12295v != null) {
                        int i12 = wf2VarM12295v.f33312b;
                        int iM8029d4 = m8029d(wf2VarM12295v);
                        int i13 = (int) (jM8958e >> 32);
                        int i14 = (int) (jM8958e & 4294967295L);
                        int i15 = i11 & 33554431;
                        long[] jArr3 = (long[]) c0795je2.f22194c;
                        if ((((int) jArr3[iM8029d4 + 2]) & 33554431) != (33554431 & i12)) {
                            q32.m9719a("Inserted child " + i15 + " without valid parent index or parent " + i12 + " not found");
                        }
                        long j7 = jArr3[iM8029d4];
                        int i16 = ((int) (j7 >> 32)) + i13;
                        int i17 = ((int) j7) + i14;
                        wf2Var.f33317g = c0795je2.m7081f(i15, i16, i17, i16 + iMo4421j0, i17 + iMo4420i0, i12, iM8029d4, zM8671i, zM8671i2, zM8196a);
                    } else {
                        int i18 = (int) (jM8958e >> 32);
                        int i19 = (int) (jM8958e & 4294967295L);
                        wf2Var.f33317g = c0795je2.m7081f(i11, i18, i19, i18 + iMo4421j0, i19 + iMo4420i0, -1, -4, zM8671i, zM8671i2, zM8196a);
                    }
                }
            }
            wf2Var.f33316f = false;
            this.f24131f = true;
            m8033j();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8032h(wf2 wf2Var) {
        if (wf2Var.f33317g != -4) {
            C0795je c0795je = this.f24128c;
            int iM8029d = m8029d(wf2Var);
            long[] jArr = (long[]) c0795je.f22194c;
            jArr[iM8029d] = -1;
            jArr[iM8029d + 1] = -1;
            jArr[iM8029d + 2] = kl3.f23214a;
            wf2Var.f33317g = -4;
            wf2Var.f33316f = true;
            this.f24131f = true;
            this.f24133h = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public final void m8033j() {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f24127b;
        RunnableC1054q0 runnableC1054q0 = this.f24134i;
        byte b = 1;
        boolean z = runnableC1054q0 != null;
        long j = this.f24129d.f25034c;
        if (j >= 0 || !z) {
            if (this.f24135j == j && z) {
                return;
            }
            if (runnableC1054q0 != null) {
                viewTreeObserverOnGlobalLayoutListenerC1140sc.removeCallbacks(runnableC1054q0);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f24135j = jMax;
            g32 g32Var = this.f24136k;
            RunnableC1054q0 runnableC1054q1 = new RunnableC1054q0(b);
            runnableC1054q1.f28115b = g32Var;
            VarHandle.storeStoreFence();
            viewTreeObserverOnGlobalLayoutListenerC1140sc.postDelayed(runnableC1054q1, jMax - jCurrentTimeMillis);
            this.f24134i = runnableC1054q1;
        }
    }
}
