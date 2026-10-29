package com.materialkolor.ktx;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC0647fd;
import p000.AbstractC0990oo;
import p000.C0602e8;
import p000.C0670g;
import p000.C0759ie;
import p000.C1077qn;
import p000.d24;
import p000.ev0;
import p000.hb0;
import p000.i50;
import p000.ib0;
import p000.ir1;
import p000.k43;
import p000.ki0;
import p000.lb5;
import p000.lq2;
import p000.mi0;
import p000.mq1;
import p000.n45;
import p000.pb0;
import p000.pi3;
import p000.pq2;
import p000.qi3;
import p000.qs5;
import p000.ri3;
import p000.sc6;
import p000.si3;
import p000.sw2;
import p000.t02;
import p000.ti3;
import p000.v02;
import p000.vl1;
import p000.w02;
import p000.z62;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ImageBitmapKt {
    /* JADX WARN: Code duplicated, block: B:150:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d1 A[LOOP:7: B:151:0x03c6->B:155:0x03d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x03da  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e5 A[LOOP:6: B:101:0x028b->B:161:0x03e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:364:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x03d4 A[EDGE_INSN: B:371:0x03d4->B:156:0x03d4 BREAK  A[LOOP:7: B:151:0x03c6->B:155:0x03d1], SYNTHETIC] */
    public static final Map<Integer, Integer> quantize(pi3 pi3Var, t02 t02Var, int i) {
        Bitmap bitmapCopy;
        boolean z;
        String str;
        int[] iArr;
        int i2;
        Integer numValueOf;
        qi3[][] qi3VarArr;
        int[] iArr2;
        int iMo3405d;
        int i3;
        int iMo3403a;
        int i4;
        int i5;
        int i6;
        int i7;
        double d;
        double d2;
        int i8;
        int i9;
        double d3;
        C0759ie c0759ie = (C0759ie) t02Var;
        Bitmap bitmap = c0759ie.f21276a;
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr3 = new int[height];
        int i10 = 0;
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap bitmapM5679r = AbstractC0647fd.m5679r(c0759ie);
        int i11 = 1;
        if (bitmapM5679r.getConfig() != Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapM5679r;
            z = false;
        } else {
            bitmapCopy = bitmapM5679r.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        bitmapCopy.getPixels(iArr3, 0, width, 0, 0, width, height2);
        if (z) {
            bitmapCopy.recycle();
        }
        C0602e8 c0602e8 = new C0602e8();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = iArr3[i12];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i13));
            linkedHashMap.put(Integer.valueOf(i13), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
        }
        c0602e8.f17867a = new int[35937];
        c0602e8.f17868b = new int[35937];
        c0602e8.f17869c = new int[35937];
        c0602e8.f17870d = new int[35937];
        c0602e8.f17871e = new double[35937];
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            int i14 = (iIntValue >> 16) & 255;
            int i15 = i10;
            int i16 = (iIntValue >> 8) & 255;
            int i17 = iIntValue & 255;
            int i18 = i11;
            Iterator it2 = it;
            int iM13848L = zy5.m13848L((i14 >> 3) + 1, (i16 >> 3) + 1, (i17 >> 3) + 1);
            int[] iArr4 = (int[]) c0602e8.f17867a;
            if (iArr4 == null) {
                z62.m13366Y("weights");
                throw null;
            }
            iArr4[iM13848L] = iArr4[iM13848L] + iIntValue2;
            int[] iArr5 = (int[]) c0602e8.f17868b;
            if (iArr5 == null) {
                z62.m13366Y("momentsR");
                throw null;
            }
            iArr5[iM13848L] = (i14 * iIntValue2) + iArr5[iM13848L];
            int[] iArr6 = (int[]) c0602e8.f17869c;
            if (iArr6 == null) {
                z62.m13366Y("momentsG");
                throw null;
            }
            iArr6[iM13848L] = (i16 * iIntValue2) + iArr6[iM13848L];
            int[] iArr7 = (int[]) c0602e8.f17870d;
            if (iArr7 == null) {
                z62.m13366Y("momentsB");
                throw null;
            }
            iArr7[iM13848L] = (i17 * iIntValue2) + iArr7[iM13848L];
            double[] dArr = (double[]) c0602e8.f17871e;
            if (dArr == null) {
                z62.m13366Y("moments");
                throw null;
            }
            dArr[iM13848L] = dArr[iM13848L] + ((double) (((i17 * i17) + (i16 * i16) + (i14 * i14)) * iIntValue2));
            i10 = i15;
            it = it2;
            i11 = i18;
        }
        int i19 = i10;
        int i20 = i11;
        int i21 = i20;
        while (true) {
            int i22 = 33;
            if (i21 < 33) {
                int[] iArr8 = new int[33];
                int[] iArr9 = new int[33];
                int[] iArr10 = new int[33];
                int[] iArr11 = new int[33];
                double[] dArr2 = new double[33];
                int i23 = i20;
                while (i23 < i22) {
                    int i24 = i19;
                    int i25 = i24;
                    int i26 = i25;
                    int i27 = i26;
                    int[] iArr12 = iArr11;
                    int i28 = i20;
                    double d4 = 0.0d;
                    while (i28 < i22) {
                        int iM13848L2 = zy5.m13848L(i21, i23, i28);
                        int[] iArr13 = (int[]) c0602e8.f17867a;
                        if (iArr13 == null) {
                            z62.m13366Y("weights");
                            throw null;
                        }
                        i24 += iArr13[iM13848L2];
                        int[] iArr14 = (int[]) c0602e8.f17868b;
                        if (iArr14 == null) {
                            z62.m13366Y("momentsR");
                            throw null;
                        }
                        i25 += iArr14[iM13848L2];
                        int[] iArr15 = (int[]) c0602e8.f17869c;
                        if (iArr15 == null) {
                            z62.m13366Y("momentsG");
                            throw null;
                        }
                        i26 += iArr15[iM13848L2];
                        int[] iArr16 = (int[]) c0602e8.f17870d;
                        if (iArr16 == null) {
                            z62.m13366Y("momentsB");
                            throw null;
                        }
                        i27 += iArr16[iM13848L2];
                        double[] dArr3 = (double[]) c0602e8.f17871e;
                        if (dArr3 == null) {
                            z62.m13366Y("moments");
                            throw null;
                        }
                        d4 += dArr3[iM13848L2];
                        iArr8[i28] = iArr8[i28] + i24;
                        iArr9[i28] = iArr9[i28] + i25;
                        iArr10[i28] = iArr10[i28] + i26;
                        iArr12[i28] = iArr12[i28] + i27;
                        dArr2[i28] = dArr2[i28] + d4;
                        int iM13848L3 = zy5.m13848L(i21 - 1, i23, i28);
                        int i29 = i21;
                        int[] iArr17 = (int[]) c0602e8.f17867a;
                        if (iArr17 == null) {
                            z62.m13366Y("weights");
                            throw null;
                        }
                        iArr17[iM13848L2] = iArr17[iM13848L3] + iArr8[i28];
                        int[] iArr18 = (int[]) c0602e8.f17868b;
                        if (iArr18 == null) {
                            z62.m13366Y("momentsR");
                            throw null;
                        }
                        iArr18[iM13848L2] = iArr18[iM13848L3] + iArr9[i28];
                        int[] iArr19 = (int[]) c0602e8.f17869c;
                        if (iArr19 == null) {
                            z62.m13366Y("momentsG");
                            throw null;
                        }
                        iArr19[iM13848L2] = iArr19[iM13848L3] + iArr10[i28];
                        int[] iArr20 = (int[]) c0602e8.f17870d;
                        if (iArr20 == null) {
                            z62.m13366Y("momentsB");
                            throw null;
                        }
                        iArr20[iM13848L2] = iArr20[iM13848L3] + iArr12[i28];
                        double[] dArr4 = (double[]) c0602e8.f17871e;
                        if (dArr4 == null) {
                            z62.m13366Y("moments");
                            throw null;
                        }
                        dArr4[iM13848L2] = dArr4[iM13848L3] + dArr2[i28];
                        i28++;
                        i21 = i29;
                        i22 = 33;
                    }
                    i23++;
                    iArr11 = iArr12;
                    i22 = 33;
                }
                i21++;
            } else {
                c0602e8.f17872f = new ri3[i];
                int i30 = i19;
                while (true) {
                    String str2 = "cubes";
                    if (i30 >= i) {
                        double[] dArr5 = new double[i];
                        ri3[] ri3VarArr = (ri3[]) c0602e8.f17872f;
                        if (ri3VarArr == null) {
                            z62.m13366Y("cubes");
                            throw null;
                        }
                        ri3 ri3Var = ri3VarArr[i19];
                        ri3Var.f29317b = 32;
                        ri3Var.f29319d = 32;
                        ri3Var.f29321f = 32;
                        int i31 = i19;
                        int i32 = i20;
                        while (true) {
                            if (i32 >= i) {
                                str = str2;
                                iArr = iArr3;
                                i2 = i;
                                break;
                            }
                            ri3[] ri3VarArr2 = (ri3[]) c0602e8.f17872f;
                            if (ri3VarArr2 == null) {
                                z62.m13366Y(str2);
                                throw null;
                            }
                            ri3 ri3Var2 = ri3VarArr2[i31];
                            ri3 ri3Var3 = ri3VarArr2[i32];
                            int[] iArr21 = (int[]) c0602e8.f17868b;
                            if (iArr21 == null) {
                                z62.m13366Y("momentsR");
                                throw null;
                            }
                            int iM13866b0 = zy5.m13866b0(ri3Var2, iArr21);
                            int[] iArr22 = (int[]) c0602e8.f17869c;
                            if (iArr22 == null) {
                                z62.m13366Y("momentsG");
                                throw null;
                            }
                            int iM13866b1 = zy5.m13866b0(ri3Var2, iArr22);
                            int[] iArr23 = (int[]) c0602e8.f17870d;
                            if (iArr23 == null) {
                                z62.m13366Y("momentsB");
                                throw null;
                            }
                            int iM13866b2 = zy5.m13866b0(ri3Var2, iArr23);
                            int[] iArr24 = (int[]) c0602e8.f17867a;
                            if (iArr24 == null) {
                                z62.m13366Y("weights");
                                throw null;
                            }
                            int iM13866b3 = zy5.m13866b0(ri3Var2, iArr24);
                            si3 si3Var = si3.f30318a;
                            ti3 ti3VarM4953q = c0602e8.m4953q(ri3Var2, si3Var, ri3Var2.f29316a + 1, ri3Var2.f29317b, iM13866b0, iM13866b1, iM13866b2, iM13866b3);
                            double[] dArr6 = dArr5;
                            str = str2;
                            int i33 = ti3VarM4953q.f31184a;
                            si3 si3Var2 = si3.f30319b;
                            int i34 = i31;
                            ti3 ti3VarM4953q2 = c0602e8.m4953q(ri3Var2, si3Var2, ri3Var2.f29318c + 1, ri3Var2.f29319d, iM13866b0, iM13866b1, iM13866b2, iM13866b3);
                            si3 si3Var3 = si3.f30320c;
                            int i35 = i32;
                            ti3 ti3VarM4953q3 = c0602e8.m4953q(ri3Var2, si3Var3, ri3Var2.f29320e + 1, ri3Var2.f29321f, iM13866b0, iM13866b1, iM13866b2, iM13866b3);
                            iArr = iArr3;
                            double d5 = ti3VarM4953q.f31185b;
                            double d6 = ti3VarM4953q2.f31185b;
                            double d7 = ti3VarM4953q3.f31185b;
                            if (d5 >= d6 && d5 >= d7) {
                                if (i33 < 0) {
                                    dArr6[i34] = 0.0d;
                                    i7 = i35 - 1;
                                    i6 = i20;
                                } else {
                                    si3Var3 = si3Var;
                                }
                                d = dArr6[i19];
                                if (i6 <= i7) {
                                    d2 = d;
                                    i8 = 1;
                                    i9 = i19;
                                    while (true) {
                                        d3 = dArr6[i8];
                                        if (d3 > d2) {
                                            i9 = i8;
                                            d2 = d3;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                        i8++;
                                    }
                                    i31 = i9;
                                    d = d2;
                                } else {
                                    i31 = i19;
                                }
                                if (d <= 0.0d) {
                                    i2 = i7 + 1;
                                    break;
                                }
                                i32 = i7 + 1;
                                iArr3 = iArr;
                                dArr5 = dArr6;
                                str2 = str;
                                i20 = 1;
                            } else if (d6 >= d5 && d6 >= d7) {
                                si3Var3 = si3Var2;
                            }
                            ri3Var3.f29317b = ri3Var2.f29317b;
                            ri3Var3.f29319d = ri3Var2.f29319d;
                            ri3Var3.f29321f = ri3Var2.f29321f;
                            int iOrdinal = si3Var3.ordinal();
                            if (iOrdinal == 0) {
                                ri3Var2.f29317b = i33;
                                ri3Var3.f29316a = i33;
                                i4 = ri3Var2.f29318c;
                                ri3Var3.f29318c = i4;
                                i5 = ri3Var2.f29320e;
                                ri3Var3.f29320e = i5;
                            } else if (iOrdinal == i20) {
                                i4 = ti3VarM4953q2.f31184a;
                                ri3Var2.f29319d = i4;
                                i33 = ri3Var2.f29316a;
                                ri3Var3.f29316a = i33;
                                ri3Var3.f29318c = i4;
                                i5 = ri3Var2.f29320e;
                                ri3Var3.f29320e = i5;
                            } else {
                                if (iOrdinal != 2) {
                                    C0670g.m5864c();
                                    return null;
                                }
                                i5 = ti3VarM4953q3.f31184a;
                                ri3Var2.f29321f = i5;
                                i33 = ri3Var2.f29316a;
                                ri3Var3.f29316a = i33;
                                i4 = ri3Var2.f29318c;
                                ri3Var3.f29318c = i4;
                                ri3Var3.f29320e = i5;
                            }
                            ri3Var2.f29322g = (ri3Var2.f29321f - ri3Var2.f29320e) * (ri3Var2.f29319d - ri3Var2.f29318c) * (ri3Var2.f29317b - ri3Var2.f29316a);
                            ri3Var3.f29322g = (ri3Var3.f29321f - i5) * (ri3Var3.f29319d - i4) * (ri3Var3.f29317b - i33);
                            ri3[] ri3VarArr3 = (ri3[]) c0602e8.f17872f;
                            if (ri3VarArr3 == null) {
                                z62.m13366Y(str);
                                throw null;
                            }
                            ri3 ri3Var4 = ri3VarArr3[i34];
                            i6 = 1;
                            dArr6[i34] = ri3Var4.f29322g > 1 ? c0602e8.m4959w(ri3Var4) : 0.0d;
                            ri3[] ri3VarArr4 = (ri3[]) c0602e8.f17872f;
                            if (ri3VarArr4 == null) {
                                z62.m13366Y(str);
                                throw null;
                            }
                            ri3 ri3Var5 = ri3VarArr4[i35];
                            dArr6[i35] = ri3Var5.f29322g > 1 ? c0602e8.m4959w(ri3Var5) : 0.0d;
                            i7 = i35;
                            d = dArr6[i19];
                            if (i6 <= i7) {
                                d2 = d;
                                i8 = 1;
                                i9 = i19;
                                while (true) {
                                    d3 = dArr6[i8];
                                    if (d3 > d2) {
                                        i9 = i8;
                                        d2 = d3;
                                    }
                                    if (i8 != i7) {
                                        break;
                                        break;
                                    }
                                    i8++;
                                }
                                i31 = i9;
                                d = d2;
                            } else {
                                i31 = i19;
                            }
                            if (d <= 0.0d) {
                                i2 = i7 + 1;
                                break;
                            }
                            i32 = i7 + 1;
                            iArr3 = iArr;
                            dArr5 = dArr6;
                            str2 = str;
                            i20 = 1;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i36 = i19; i36 < i2; i36++) {
                            ri3[] ri3VarArr5 = (ri3[]) c0602e8.f17872f;
                            if (ri3VarArr5 == null) {
                                z62.m13366Y(str);
                                throw null;
                            }
                            ri3 ri3Var6 = ri3VarArr5[i36];
                            int[] iArr25 = (int[]) c0602e8.f17867a;
                            if (iArr25 == null) {
                                z62.m13366Y("weights");
                                throw null;
                            }
                            int iM13866b4 = zy5.m13866b0(ri3Var6, iArr25);
                            if (iM13866b4 > 0) {
                                int[] iArr26 = (int[]) c0602e8.f17868b;
                                if (iArr26 == null) {
                                    z62.m13366Y("momentsR");
                                    throw null;
                                }
                                int iM13866b5 = zy5.m13866b0(ri3Var6, iArr26) / iM13866b4;
                                int[] iArr27 = (int[]) c0602e8.f17869c;
                                if (iArr27 == null) {
                                    z62.m13366Y("momentsG");
                                    throw null;
                                }
                                int iM13866b6 = zy5.m13866b0(ri3Var6, iArr27) / iM13866b4;
                                int[] iArr28 = (int[]) c0602e8.f17870d;
                                if (iArr28 == null) {
                                    z62.m13366Y("momentsB");
                                    throw null;
                                }
                                arrayList.add(Integer.valueOf(((zy5.m13866b0(ri3Var6, iArr28) / iM13866b4) & 255) | ((iM13866b5 & 255) << 16) | (-16777216) | ((iM13866b6 & 255) << 8)));
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size = arrayList.size();
                        int i37 = i19;
                        while (i37 < size) {
                            Object obj = arrayList.get(i37);
                            i37++;
                            linkedHashMap2.put(Integer.valueOf(((Number) obj).intValue()), 0);
                        }
                        Set setKeySet = linkedHashMap2.keySet();
                        int size2 = setKeySet.size();
                        int[] iArr29 = new int[size2];
                        Iterator it3 = setKeySet.iterator();
                        int i38 = i19;
                        while (it3.hasNext()) {
                            iArr29[i38] = ((Number) it3.next()).intValue();
                            i38++;
                        }
                        n45 n45Var = new n45();
                        n45Var.f25449b = 272008;
                        n45Var.f25450c = i19;
                        n45Var.f25451d = i19;
                        n45Var.f25452e = i19;
                        n45Var.f25453f = -272009;
                        n45Var.f25454g = 278536192;
                        for (int i39 = 0; i39 < 64; i39++) {
                            n45Var.mo3405d();
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        double[][] dArr7 = new double[height][];
                        int[] iArr30 = new int[height];
                        int i40 = 0;
                        for (int i41 = 0; i41 < height; i41++) {
                            int i42 = iArr[i41];
                            Integer num2 = (Integer) linkedHashMap3.get(Integer.valueOf(i42));
                            if (num2 == null) {
                                double[] dArrM10637I = sc6.m10637I(i42);
                                dArr7[i40] = new double[]{dArrM10637I[0], dArrM10637I[1], dArrM10637I[2]};
                                iArr30[i40] = i42;
                                i40++;
                                linkedHashMap3.put(Integer.valueOf(i42), 1);
                            } else {
                                linkedHashMap3.put(Integer.valueOf(i42), Integer.valueOf(num2.intValue() + 1));
                            }
                        }
                        int[] iArr31 = new int[i40];
                        for (int i43 = 0; i43 < i40; i43++) {
                            iArr31[i43] = ((Number) linkedHashMap3.get(Integer.valueOf(iArr30[i43]))).intValue();
                        }
                        int iMin = Math.min(i, i40);
                        if (size2 != 0) {
                            iMin = Math.min(iMin, size2);
                        }
                        double[][] dArr8 = new double[iMin][];
                        for (int i44 = 0; i44 < size2; i44++) {
                            double[] dArrM10637I2 = sc6.m10637I(iArr29[i44]);
                            dArr8[i44] = new double[]{dArrM10637I2[0], dArrM10637I2[1], dArrM10637I2[2]};
                        }
                        int[] iArr32 = new int[i40];
                        for (int i45 = 0; i45 < i40; i45++) {
                            if (iMin <= 0) {
                                C1077qn.m9988n(d24.m4308i(0, Integer.valueOf(iMin)));
                                return null;
                            }
                            if (iMin <= 0 && iMin != Integer.MIN_VALUE) {
                                while (true) {
                                    iMo3403a = n45Var.mo3405d();
                                    if (iMo3403a < 0 || iMo3403a >= iMin) {
                                    }
                                }
                            } else if (((-iMin) & iMin) == iMin) {
                                iMo3403a = n45Var.mo3403a(31 - Integer.numberOfLeadingZeros(iMin));
                            } else {
                                do {
                                    iMo3405d = n45Var.mo3405d() >>> 1;
                                    i3 = iMo3405d % iMin;
                                } while ((iMin - 1) + (iMo3405d - i3) < 0);
                                iMo3403a = i3;
                            }
                            iArr32[i45] = iMo3403a;
                        }
                        int[][] iArr33 = new int[iMin][];
                        for (int i46 = 0; i46 < iMin; i46++) {
                            iArr33[i46] = new int[iMin];
                        }
                        qi3[][] qi3VarArr2 = new qi3[iMin][];
                        for (int i47 = 0; i47 < iMin; i47++) {
                            qi3[] qi3VarArr3 = new qi3[iMin];
                            for (int i48 = 0; i48 < iMin; i48++) {
                                qi3VarArr3[i48] = new qi3();
                            }
                            qi3VarArr2[i47] = qi3VarArr3;
                        }
                        for (int i49 = 0; i49 < iMin; i49++) {
                            qi3VarArr2[i49] = new qi3[iMin];
                            for (int i50 = 0; i50 < iMin; i50++) {
                                qi3VarArr2[i49][i50] = new qi3();
                            }
                        }
                        int[] iArr34 = new int[iMin];
                        int i51 = 0;
                        while (i51 < 10) {
                            int i52 = 0;
                            while (i52 < iMin) {
                                int i53 = i52 + 1;
                                for (int i54 = i53; i54 < iMin; i54++) {
                                    double dM10113r = qs5.m10113r(dArr8[i52], dArr8[i54]);
                                    qi3 qi3Var = qi3VarArr2[i54][i52];
                                    qi3Var.f28510b = dM10113r;
                                    qi3Var.f28509a = i52;
                                    qi3 qi3Var2 = qi3VarArr2[i52][i54];
                                    qi3Var2.f28510b = dM10113r;
                                    qi3Var2.f28509a = i54;
                                }
                                qi3[] qi3VarArr4 = qi3VarArr2[i52];
                                if (qi3VarArr4.length > 1) {
                                    vl1 vl1Var = new vl1((byte) 15);
                                    if (qi3VarArr4.length > 1) {
                                        Arrays.sort(qi3VarArr4, vl1Var);
                                    }
                                }
                                for (int i55 = 0; i55 < iMin; i55++) {
                                    iArr33[i52][i55] = qi3VarArr2[i52][i55].f28509a;
                                }
                                i52 = i53;
                            }
                            int i56 = 0;
                            int i57 = 0;
                            while (i56 < i40) {
                                double[] dArr9 = dArr7[i56];
                                int i58 = iArr32[i56];
                                double dM10113r2 = qs5.m10113r(dArr9, dArr8[i58]);
                                int[][] iArr35 = iArr33;
                                int[] iArr36 = iArr32;
                                double d8 = dM10113r2;
                                int i59 = 0;
                                int i60 = -1;
                                while (i59 < iMin) {
                                    int i61 = i59;
                                    qi3 qi3Var3 = qi3VarArr2[i58][i61];
                                    if (qi3Var3 == null) {
                                        qi3VarArr = qi3VarArr2;
                                        iArr2 = iArr31;
                                    } else {
                                        qi3VarArr = qi3VarArr2;
                                        iArr2 = iArr31;
                                        if (qi3Var3.f28510b < 4.0d * dM10113r2) {
                                            double dM10113r3 = qs5.m10113r(dArr9, dArr8[i61]);
                                            if (dM10113r3 < d8) {
                                                d8 = dM10113r3;
                                                i60 = i61;
                                            }
                                        }
                                    }
                                    i59 = i61 + 1;
                                    iArr31 = iArr2;
                                    qi3VarArr2 = qi3VarArr;
                                }
                                qi3[][] qi3VarArr5 = qi3VarArr2;
                                int[] iArr37 = iArr31;
                                if (i60 != -1 && Math.abs(Math.sqrt(d8) - Math.sqrt(dM10113r2)) > 3.0d) {
                                    i57++;
                                    iArr36[i56] = i60;
                                }
                                i56++;
                                iArr33 = iArr35;
                                iArr32 = iArr36;
                                iArr31 = iArr37;
                                qi3VarArr2 = qi3VarArr5;
                            }
                            int[][] iArr38 = iArr33;
                            int[] iArr39 = iArr32;
                            qi3[][] qi3VarArr6 = qi3VarArr2;
                            int[] iArr40 = iArr31;
                            if (i57 == 0 && i51 != 0) {
                                break;
                            }
                            double[] dArr10 = new double[iMin];
                            double[] dArr11 = new double[iMin];
                            double[] dArr12 = new double[iMin];
                            char c = 0;
                            AbstractC0990oo.m9207b0(iArr34, 0);
                            int i62 = 0;
                            while (i62 < i40) {
                                int i63 = iArr39[i62];
                                double[] dArr13 = dArr7[i62];
                                int i64 = iArr40[i62];
                                iArr34[i63] = iArr34[i63] + i64;
                                double d9 = i64;
                                dArr10[i63] = (dArr13[c] * d9) + dArr10[i63];
                                dArr11[i63] = (dArr13[1] * d9) + dArr11[i63];
                                dArr12[i63] = (dArr13[2] * d9) + dArr12[i63];
                                i62++;
                                c = 0;
                            }
                            for (int i65 = 0; i65 < iMin; i65++) {
                                int i66 = iArr34[i65];
                                if (i66 == 0) {
                                    dArr8[i65] = new double[]{0.0d, 0.0d, 0.0d};
                                } else {
                                    double d10 = i66;
                                    double d11 = dArr10[i65] / d10;
                                    double d12 = dArr11[i65] / d10;
                                    double d13 = dArr12[i65] / d10;
                                    double[] dArr14 = dArr8[i65];
                                    dArr14[0] = d11;
                                    dArr14[1] = d12;
                                    dArr14[2] = d13;
                                }
                            }
                            i51++;
                            iArr33 = iArr38;
                            iArr32 = iArr39;
                            iArr31 = iArr40;
                            qi3VarArr2 = qi3VarArr6;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (int i67 = 0; i67 < iMin; i67++) {
                            int i68 = iArr34[i67];
                            if (i68 != 0) {
                                double[] dArr15 = dArr8[i67];
                                if (dArr15 != null) {
                                    double d14 = dArr15[0];
                                    double d15 = dArr15[1];
                                    double d16 = dArr15[2];
                                    double[] dArr16 = sc6.f30167d;
                                    double d17 = (d14 + 16.0d) / 116.0d;
                                    numValueOf = Integer.valueOf(sc6.m10667h(sc6.m10638J((d15 / 500.0d) + d17) * dArr16[0], sc6.m10638J(d17) * dArr16[1], sc6.m10638J(d17 - (d16 / 200.0d)) * dArr16[2]));
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null && !linkedHashMap4.containsKey(numValueOf)) {
                                    linkedHashMap4.put(numValueOf, Integer.valueOf(i68));
                                }
                            }
                        }
                        return linkedHashMap4;
                    }
                    ri3[] ri3VarArr6 = (ri3[]) c0602e8.f17872f;
                    if (ri3VarArr6 == null) {
                        z62.m13366Y("cubes");
                        throw null;
                    }
                    ri3VarArr6[i30] = new ri3();
                    i30++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: rememberThemeColor-sW7UJKQ, reason: not valid java name */
    public static final long m13951rememberThemeColorsW7UJKQ(t02 t02Var, long j, boolean z, int i, mi0 mi0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            j = ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24277a.f16940a;
        }
        long j2 = j;
        boolean z2 = true;
        boolean z3 = (i3 & 4) != 0 ? true : z;
        if ((i3 & 8) != 0) {
            i = 128;
        }
        int i4 = i;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(pb0.m9462a(j2));
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        Object[] objArr = {t02Var, pb0.m9462a(j2), Boolean.valueOf(z3), Integer.valueOf(i4)};
        boolean z4 = ((((i2 & 14) ^ 6) > 4 && ir1Var.m6894i(t02Var)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ir1Var.m6888f(j2)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && ir1Var.m6892h(z3)) || (i2 & 384) == 256);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !ir1Var.m6886e(i4)) && (i2 & 3072) != 2048) {
            z2 = false;
        }
        boolean z5 = z2 | z4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z5 || objM6869O2 == i50Var) {
            v02 v02Var = new v02(t02Var, j2, z3, i4, sw2Var, null);
            ir1Var.m6905n0(v02Var);
            objM6869O2 = v02Var;
        }
        lb5.m7929j(objArr, (mq1) objM6869O2, ir1Var);
        return ((pb0) sw2Var.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: rememberThemeColors-8V94_ZQ, reason: not valid java name */
    public static final List<pb0> m13952rememberThemeColors8V94_ZQ(t02 t02Var, long j, int i, boolean z, int i2, mi0 mi0Var, int i3, int i4) {
        long j2;
        sw2 sw2Var;
        if ((i4 & 2) != 0) {
            j2 = ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24277a.f16940a;
        } else {
            j2 = j;
        }
        int i5 = (i4 & 4) != 0 ? 128 : i;
        boolean z2 = true;
        boolean z3 = (i4 & 8) != 0 ? true : z;
        int i6 = (i4 & 16) != 0 ? 4 : i2;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(Collections.singletonList(pb0.m9462a(j2)));
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var2 = (sw2) objM6869O;
        Object[] objArr = {t02Var, pb0.m9462a(j2), Boolean.valueOf(z3), Integer.valueOf(i5)};
        boolean z4 = ((((i3 & 14) ^ 6) > 4 && ir1Var.m6894i(t02Var)) || (i3 & 6) == 4) | ((((i3 & 896) ^ 384) > 256 && ir1Var.m6886e(i5)) || (i3 & 384) == 256) | ((((i3 & 112) ^ 48) > 32 && ir1Var.m6888f(j2)) || (i3 & 48) == 32) | ((((i3 & 7168) ^ 3072) > 2048 && ir1Var.m6892h(z3)) || (i3 & 3072) == 2048);
        if ((((57344 & i3) ^ 24576) <= 16384 || !ir1Var.m6886e(i6)) && (i3 & 24576) != 16384) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        Object objM6869O2 = ir1Var.m6869O();
        if (z5 || objM6869O2 == i50Var) {
            int i7 = i6;
            sw2Var = sw2Var2;
            w02 w02Var = new w02(t02Var, i5, j2, z3, i7, sw2Var, null);
            ir1Var.m6905n0(w02Var);
            objM6869O2 = w02Var;
        } else {
            sw2Var = sw2Var2;
        }
        lb5.m7929j(objArr, (mq1) objM6869O2, ir1Var);
        return (List) sw2Var.getValue();
    }

    /* JADX INFO: renamed from: themeColor-RPmYEkk, reason: not valid java name */
    public static final long m13953themeColorRPmYEkk(t02 t02Var, long j, boolean z, int i) {
        return ((pb0) hb0.m6299K0(m13956themeColorsXOJAsU$default(t02Var, i, j, z, 0, 8, null))).f27503a;
    }

    /* JADX INFO: renamed from: themeColor-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ long m13954themeColorRPmYEkk$default(t02 t02Var, long j, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 128;
        }
        return m13953themeColorRPmYEkk(t02Var, j, z, i);
    }

    public static final pb0 themeColorOrNull(t02 t02Var, boolean z, int i) {
        Integer num = (Integer) hb0.m6301M0(ev0.m5371u0(quantize(pi3.f27636a, t02Var, i), 1, null, z));
        if (num != null) {
            return pb0.m9462a(zy5.m13869d(num.intValue()));
        }
        return null;
    }

    public static /* synthetic */ pb0 themeColorOrNull$default(t02 t02Var, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = 128;
        }
        return themeColorOrNull(t02Var, z, i);
    }

    /* JADX INFO: renamed from: themeColors-XO-JAsU, reason: not valid java name */
    public static final List<pb0> m13955themeColorsXOJAsU(t02 t02Var, int i, long j, boolean z, int i2) {
        ArrayList arrayListM5371u0 = ev0.m5371u0(quantize(pi3.f27636a, t02Var, i), i2, Integer.valueOf(zy5.m13858V(j)), z);
        ArrayList arrayList = new ArrayList(ib0.m6717y0(arrayListM5371u0, 10));
        int size = arrayListM5371u0.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM5371u0.get(i3);
            i3++;
            arrayList.add(pb0.m9462a(zy5.m13869d(((Number) obj).intValue())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: themeColors-XO-JAsU$default, reason: not valid java name */
    public static /* synthetic */ List m13956themeColorsXOJAsU$default(t02 t02Var, int i, long j, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 128;
        }
        if ((i3 & 2) != 0) {
            j = zy5.m13869d(-12417548);
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            i2 = 4;
        }
        return m13955themeColorsXOJAsU(t02Var, i, j, z, i2);
    }
}
