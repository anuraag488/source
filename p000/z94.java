package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z94 {

    /* JADX INFO: renamed from: a */
    public yp1 f35888a;

    /* JADX INFO: renamed from: b */
    public Object f35889b;

    /* JADX INFO: renamed from: c */
    public yv2 f35890c;

    /* JADX INFO: renamed from: d */
    public int f35891d;

    /* JADX INFO: renamed from: e */
    public lw2 f35892e;

    /* JADX INFO: renamed from: f */
    public lw2 f35893f;

    /* JADX INFO: renamed from: g */
    public mw2 f35894g;

    /* JADX INFO: renamed from: h */
    public uw2 f35895h;

    /* JADX INFO: renamed from: i */
    public hr1 f35896i;

    /* JADX INFO: renamed from: j */
    public boolean f35897j;

    /* JADX INFO: renamed from: k */
    public int f35898k;

    /* JADX INFO: renamed from: l */
    public lw2 f35899l;

    /* JADX INFO: renamed from: m */
    public HashMap f35900m;

    /* JADX WARN: Code duplicated, block: B:100:0x0220 A[DONT_INVERT, PHI: r22
  0x0220: PHI (r22v20 boolean) = (r22v19 boolean), (r22v21 boolean) binds: [B:91:0x01f8, B:99:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x0222 A[Catch: all -> 0x0132, LOOP:8: B:90:0x01ee->B:101:0x0222, LOOP_END, TryCatch #0 {all -> 0x0132, blocks: (B:24:0x0083, B:26:0x0089, B:28:0x008d, B:31:0x00a2, B:33:0x00b2, B:35:0x00bc, B:37:0x00c2, B:40:0x00da, B:42:0x00e8, B:44:0x00ee, B:46:0x00f2, B:49:0x0104, B:51:0x0114, B:53:0x011e, B:55:0x0124, B:59:0x0138, B:70:0x0174, B:63:0x0143, B:65:0x014f, B:66:0x015b, B:76:0x019b, B:78:0x01b0, B:81:0x01ca, B:83:0x01d6, B:85:0x01dc, B:87:0x01e0, B:90:0x01ee, B:92:0x01fa, B:94:0x0206, B:96:0x020c, B:97:0x0216, B:101:0x0222, B:102:0x0225, B:103:0x022b), top: B:321:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2 A[DONT_INVERT, PHI: r22
  0x02a2: PHI (r22v13 boolean) = (r22v12 boolean), (r22v14 boolean) binds: [B:120:0x0279, B:128:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x02a4 A[LOOP:6: B:119:0x026f->B:130:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x04da A[EDGE_INSN: B:244:0x04da->B:245:0x04db BREAK  A[LOOP:20: B:228:0x0499->B:241:0x04d0], PHI: r2
  0x04da: PHI (r2v8 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v12 boolean) binds: [B:222:0x0484, B:226:0x0495, B:242:0x04d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:248:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:273:0x0543 A[DONT_INVERT, PHI: r0
  0x0543: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:264:0x051b, B:272:0x0541] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x0545 A[LOOP:14: B:263:0x0511->B:274:0x0545, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:334:0x0164 A[EDGE_INSN: B:334:0x0164->B:67:0x0164 BREAK  A[LOOP:4: B:49:0x0104->B:63:0x0143], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x02ac A[EDGE_INSN: B:339:0x02ac->B:132:0x02ac BREAK  A[LOOP:6: B:119:0x026f->B:130:0x02a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x01ad A[EDGE_INSN: B:344:0x01ad->B:77:0x01ad BREAK  A[LOOP:8: B:90:0x01ee->B:101:0x0222], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x054c A[EDGE_INSN: B:359:0x054c->B:276:0x054c BREAK  A[LOOP:14: B:263:0x0511->B:274:0x0545], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0141 A[DONT_INVERT, PHI: r22
  0x0141: PHI (r22v30 boolean) = (r22v29 boolean), (r22v31 boolean) binds: [B:50:0x0112, B:61:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0143 A[Catch: all -> 0x0132, LOOP:4: B:49:0x0104->B:63:0x0143, LOOP_END, TryCatch #0 {all -> 0x0132, blocks: (B:24:0x0083, B:26:0x0089, B:28:0x008d, B:31:0x00a2, B:33:0x00b2, B:35:0x00bc, B:37:0x00c2, B:40:0x00da, B:42:0x00e8, B:44:0x00ee, B:46:0x00f2, B:49:0x0104, B:51:0x0114, B:53:0x011e, B:55:0x0124, B:59:0x0138, B:70:0x0174, B:63:0x0143, B:65:0x014f, B:66:0x015b, B:76:0x019b, B:78:0x01b0, B:81:0x01ca, B:83:0x01d6, B:85:0x01dc, B:87:0x01e0, B:90:0x01ee, B:92:0x01fa, B:94:0x0206, B:96:0x020c, B:97:0x0216, B:101:0x0222, B:102:0x0225, B:103:0x022b), top: B:321:0x0083 }] */
    /* JADX INFO: renamed from: a */
    public final boolean m13458a(Set set) throws Throwable {
        long j;
        char c;
        boolean z;
        Iterator it;
        lw2 lw2Var;
        z94 z94Var;
        int i;
        z94 z94Var2;
        boolean z2;
        boolean z3;
        Object[] objArr;
        Iterator it2;
        lw2 lw2Var2;
        int i2;
        Object[] objArr2;
        long j2;
        boolean z4;
        int i3;
        int i4;
        Object[] objArr3;
        yv2 yv2Var;
        long[] jArr;
        ia5 ia5Var;
        Object[] objArr4;
        int i5;
        long[] jArr2;
        ia5 ia5Var2;
        Object[] objArr5;
        int i6;
        int i7;
        long j3;
        int i8;
        long j4;
        Object obj;
        Object[] objArr6;
        Object[] objArr7;
        long j5;
        int i9;
        Object[] objArr8;
        Object obj2;
        z94 z94Var3 = this;
        ia5 ia5Var3 = ia5.f21230u;
        uw2 uw2Var = z94Var3.f35895h;
        lw2 lw2Var3 = z94Var3.f35899l;
        HashMap map = z94Var3.f35900m;
        lw2 lw2Var4 = z94Var3.f35892e;
        mw2 mw2Var = z94Var3.f35894g;
        long j6 = -9187201950435737472L;
        if (set instanceof vv3) {
            mw2 mw2Var2 = ((vv3) set).f32888a;
            Object[] objArr9 = mw2Var2.f25258b;
            long[] jArr3 = mw2Var2.f25257a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                c = 7;
                z = false;
                while (true) {
                    int i11 = length;
                    long j7 = jArr3[i10];
                    int i12 = 8;
                    if ((((~j7) << 7) & j7 & j6) != j6) {
                        int i13 = 8 - ((~(i10 - i11)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j7 & 255) < 128) {
                                j4 = j6;
                                Object obj3 = objArr9[(i10 << 3) + i14];
                                if (obj3 instanceof ic4) {
                                    jArr2 = jArr3;
                                    if (!((ic4) obj3).m6749f(2)) {
                                        ia5Var2 = ia5Var3;
                                        objArr5 = objArr9;
                                        i6 = i13;
                                        i7 = i14;
                                        j3 = j7;
                                        i8 = i10;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                }
                                if (z94Var3.f35897j || !lw2Var3.m8128c(obj3)) {
                                    ia5Var2 = ia5Var3;
                                    objArr5 = objArr9;
                                    i6 = i13;
                                    i7 = i14;
                                    j3 = j7;
                                    i8 = i10;
                                    obj = obj3;
                                } else {
                                    z94Var3.f35897j = true;
                                    try {
                                        Object objM8132g = lw2Var3.m8132g(obj3);
                                        if (objM8132g != null) {
                                            if (objM8132g instanceof mw2) {
                                                mw2 mw2Var3 = (mw2) objM8132g;
                                                Object[] objArr10 = mw2Var3.f25258b;
                                                long[] jArr4 = mw2Var3.f25257a;
                                                ia5Var2 = ia5Var3;
                                                int length2 = jArr4.length - 2;
                                                if (length2 >= 0) {
                                                    j3 = j7;
                                                    int i15 = 0;
                                                    int i16 = i14;
                                                    while (true) {
                                                        long j8 = jArr4[i15];
                                                        i7 = i16;
                                                        i8 = i10;
                                                        if ((((~j8) << 7) & j8 & j4) != j4) {
                                                            int i17 = 8 - ((~(i15 - length2)) >>> 31);
                                                            int i18 = 0;
                                                            while (i18 < i17) {
                                                                if ((j8 & 255) < 128) {
                                                                    objArr7 = objArr9;
                                                                    wy0 wy0Var = (wy0) objArr10[(i15 << 3) + i18];
                                                                    j5 = j8;
                                                                    Object obj4 = map.get(wy0Var);
                                                                    r94 r94Var = wy0Var.f33847c;
                                                                    if (r94Var == null) {
                                                                        r94Var = ia5Var2;
                                                                    }
                                                                    i9 = i18;
                                                                    if (r94Var.mo6713d(wy0Var.m12439i().f32930f, obj4)) {
                                                                        i13 = i13;
                                                                        objArr8 = objArr10;
                                                                        obj2 = obj3;
                                                                        uw2Var.m11663b(wy0Var);
                                                                    } else {
                                                                        Object objM8132g2 = lw2Var4.m8132g(wy0Var);
                                                                        if (objM8132g2 != null) {
                                                                            if (objM8132g2 instanceof mw2) {
                                                                                mw2 mw2Var4 = (mw2) objM8132g2;
                                                                                Object[] objArr11 = mw2Var4.f25258b;
                                                                                long[] jArr5 = mw2Var4.f25257a;
                                                                                int length3 = jArr5.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    i13 = i13;
                                                                                    int i19 = 0;
                                                                                    while (true) {
                                                                                        long j9 = jArr5[i19];
                                                                                        objArr8 = objArr10;
                                                                                        obj2 = obj3;
                                                                                        if ((((~j9) << 7) & j9 & j4) == j4) {
                                                                                            if (i19 != length3) {
                                                                                                break;
                                                                                                break;
                                                                                            }
                                                                                            i19++;
                                                                                            obj3 = obj2;
                                                                                            objArr10 = objArr8;
                                                                                            i12 = 8;
                                                                                        } else {
                                                                                            int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                                                                            for (int i21 = 0; i21 < i20; i21++) {
                                                                                                if ((j9 & 255) < 128) {
                                                                                                    mw2Var.m8409a(objArr11[(i19 << 3) + i21]);
                                                                                                    z = true;
                                                                                                }
                                                                                                j9 >>= i12;
                                                                                            }
                                                                                            if (i20 != i12) {
                                                                                                break;
                                                                                            }
                                                                                            if (i19 != length3) {
                                                                                                break;
                                                                                            }
                                                                                            i19++;
                                                                                            obj3 = obj2;
                                                                                            objArr10 = objArr8;
                                                                                            i12 = 8;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i13 = i13;
                                                                                objArr8 = objArr10;
                                                                                obj2 = obj3;
                                                                                mw2Var.m8409a(objM8132g2);
                                                                                z = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    j8 = j5 >> 8;
                                                                    i18 = i9 + 1;
                                                                    i12 = 8;
                                                                    objArr9 = objArr7;
                                                                    i13 = i13;
                                                                    obj3 = obj2;
                                                                    objArr10 = objArr8;
                                                                } else {
                                                                    objArr7 = objArr9;
                                                                    j5 = j8;
                                                                    i9 = i18;
                                                                }
                                                                objArr8 = objArr10;
                                                                obj2 = obj3;
                                                                j8 = j5 >> 8;
                                                                i18 = i9 + 1;
                                                                i12 = 8;
                                                                objArr9 = objArr7;
                                                                i13 = i13;
                                                                obj3 = obj2;
                                                                objArr10 = objArr8;
                                                            }
                                                            objArr5 = objArr9;
                                                            i6 = i13;
                                                            objArr6 = objArr10;
                                                            obj = obj3;
                                                            if (i17 != i12) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr5 = objArr9;
                                                            i6 = i13;
                                                            objArr6 = objArr10;
                                                            obj = obj3;
                                                        }
                                                        if (i15 == length2) {
                                                            break;
                                                        }
                                                        i15++;
                                                        i10 = i8;
                                                        i16 = i7;
                                                        objArr9 = objArr5;
                                                        i13 = i6;
                                                        obj3 = obj;
                                                        objArr10 = objArr6;
                                                        i12 = 8;
                                                    }
                                                }
                                            } else {
                                                ia5Var2 = ia5Var3;
                                                objArr5 = objArr9;
                                                i6 = i13;
                                                i7 = i14;
                                                j3 = j7;
                                                i8 = i10;
                                                obj = obj3;
                                                wy0 wy0Var2 = (wy0) objM8132g;
                                                Object obj5 = map.get(wy0Var2);
                                                r94 r94Var2 = wy0Var2.f33847c;
                                                if (r94Var2 == null) {
                                                    r94Var2 = ia5Var2;
                                                }
                                                if (r94Var2.mo6713d(wy0Var2.m12439i().f32930f, obj5)) {
                                                    uw2Var.m11663b(wy0Var2);
                                                } else {
                                                    Object objM8132g3 = lw2Var4.m8132g(wy0Var2);
                                                    if (objM8132g3 != null) {
                                                        if (objM8132g3 instanceof mw2) {
                                                            mw2 mw2Var5 = (mw2) objM8132g3;
                                                            Object[] objArr12 = mw2Var5.f25258b;
                                                            long[] jArr6 = mw2Var5.f25257a;
                                                            int length4 = jArr6.length - 2;
                                                            if (length4 >= 0) {
                                                                int i22 = 0;
                                                                while (true) {
                                                                    long j10 = jArr6[i22];
                                                                    if ((((~j10) << 7) & j10 & j4) == j4) {
                                                                        if (i22 != length4) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i22++;
                                                                    } else {
                                                                        int i23 = 8 - ((~(i22 - length4)) >>> 31);
                                                                        for (int i24 = 0; i24 < i23; i24++) {
                                                                            if ((j10 & 255) < 128) {
                                                                                mw2Var.m8409a(objArr12[(i22 << 3) + i24]);
                                                                                z = true;
                                                                            }
                                                                            j10 >>= 8;
                                                                        }
                                                                        if (i23 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i22 != length4) {
                                                                            break;
                                                                        }
                                                                        i22++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mw2Var.m8409a(objM8132g3);
                                                            z = true;
                                                        }
                                                    }
                                                }
                                            }
                                            z94Var3.f35897j = false;
                                        } else {
                                            ia5Var2 = ia5Var3;
                                        }
                                        objArr5 = objArr9;
                                        i6 = i13;
                                        i7 = i14;
                                        j3 = j7;
                                        i8 = i10;
                                        obj = obj3;
                                        z94Var3.f35897j = false;
                                    } catch (Throwable th) {
                                        z94Var3.f35897j = false;
                                        throw th;
                                    }
                                }
                                Object objM8132g4 = lw2Var4.m8132g(obj);
                                if (objM8132g4 != null) {
                                    if (objM8132g4 instanceof mw2) {
                                        mw2 mw2Var6 = (mw2) objM8132g4;
                                        Object[] objArr13 = mw2Var6.f25258b;
                                        long[] jArr7 = mw2Var6.f25257a;
                                        int length5 = jArr7.length - 2;
                                        if (length5 >= 0) {
                                            int i25 = 0;
                                            while (true) {
                                                long j11 = jArr7[i25];
                                                if ((((~j11) << 7) & j11 & j4) == j4) {
                                                    if (i25 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i25++;
                                                } else {
                                                    int i26 = 8 - ((~(i25 - length5)) >>> 31);
                                                    long j12 = j11;
                                                    for (int i27 = 0; i27 < i26; i27++) {
                                                        if ((j12 & 255) < 128) {
                                                            mw2Var.m8409a(objArr13[(i25 << 3) + i27]);
                                                            z = true;
                                                        }
                                                        j12 >>= 8;
                                                    }
                                                    if (i26 != 8) {
                                                        break;
                                                    }
                                                    if (i25 != length5) {
                                                        break;
                                                    }
                                                    i25++;
                                                }
                                            }
                                        }
                                    } else {
                                        mw2Var.m8409a(objM8132g4);
                                        z = true;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                ia5Var2 = ia5Var3;
                                objArr5 = objArr9;
                                i6 = i13;
                                i7 = i14;
                                j3 = j7;
                                i8 = i10;
                                j4 = j6;
                            }
                            j7 = j3 >> 8;
                            i14 = i7 + 1;
                            i12 = 8;
                            jArr3 = jArr2;
                            j6 = j4;
                            ia5Var3 = ia5Var2;
                            i10 = i8;
                            objArr9 = objArr5;
                            i13 = i6;
                        }
                        jArr = jArr3;
                        ia5Var = ia5Var3;
                        objArr4 = objArr9;
                        int i28 = i10;
                        j = j6;
                        if (i13 != i12) {
                            break;
                        }
                        i5 = i28;
                    } else {
                        jArr = jArr3;
                        ia5Var = ia5Var3;
                        objArr4 = objArr9;
                        j = j6;
                        i5 = i10;
                    }
                    length = i11;
                    if (i5 == length) {
                        break;
                    }
                    i10 = i5 + 1;
                    jArr3 = jArr;
                    j6 = j;
                    ia5Var3 = ia5Var;
                    objArr9 = objArr4;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                z = false;
            }
        } else {
            j = -9187201950435737472L;
            c = 7;
            Iterator it3 = set.iterator();
            boolean z5 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof ic4) || ((ic4) next).m6749f(2)) {
                    if (z94Var3.f35897j || !lw2Var3.m8128c(next)) {
                        it = it3;
                        lw2Var = lw2Var3;
                        z94Var = z94Var3;
                        i = 0;
                    } else {
                        z94Var3.f35897j = true;
                        try {
                            Object objM8132g5 = lw2Var3.m8132g(next);
                            if (objM8132g5 != null) {
                                try {
                                    if (objM8132g5 instanceof mw2) {
                                        mw2 mw2Var7 = (mw2) objM8132g5;
                                        Object[] objArr14 = mw2Var7.f25258b;
                                        long[] jArr8 = mw2Var7.f25257a;
                                        int length6 = jArr8.length - 2;
                                        if (length6 >= 0) {
                                            boolean z6 = z5;
                                            int i29 = 0;
                                            while (true) {
                                                long j13 = jArr8[i29];
                                                long[] jArr9 = jArr8;
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length6)) >>> 31);
                                                    int i31 = 0;
                                                    while (i31 < i30) {
                                                        if ((j13 & 255) < 128) {
                                                            it2 = it3;
                                                            wy0 wy0Var3 = (wy0) objArr14[(i29 << 3) + i31];
                                                            lw2Var2 = lw2Var3;
                                                            Object obj6 = map.get(wy0Var3);
                                                            i2 = i31;
                                                            r94 r94Var3 = wy0Var3.f33847c;
                                                            if (r94Var3 == null) {
                                                                r94Var3 = ia5Var3;
                                                            }
                                                            objArr2 = objArr14;
                                                            if (r94Var3.mo6713d(wy0Var3.m12439i().f32930f, obj6)) {
                                                                j2 = j13;
                                                                uw2Var.m11663b(wy0Var3);
                                                            } else {
                                                                Object objM8132g6 = lw2Var4.m8132g(wy0Var3);
                                                                if (objM8132g6 != null) {
                                                                    if (objM8132g6 instanceof mw2) {
                                                                        mw2 mw2Var8 = (mw2) objM8132g6;
                                                                        Object[] objArr15 = mw2Var8.f25258b;
                                                                        long[] jArr10 = mw2Var8.f25257a;
                                                                        int length7 = jArr10.length - 2;
                                                                        j2 = j13;
                                                                        if (length7 >= 0) {
                                                                            int i32 = 0;
                                                                            boolean z7 = z6;
                                                                            while (true) {
                                                                                long j14 = jArr10[i32];
                                                                                long[] jArr11 = jArr10;
                                                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i33 = 8 - ((~(i32 - length7)) >>> 31);
                                                                                    for (int i34 = 0; i34 < i33; i34++) {
                                                                                        if ((j14 & 255) < 128) {
                                                                                            mw2Var.m8409a(objArr15[(i32 << 3) + i34]);
                                                                                            z7 = true;
                                                                                        }
                                                                                        j14 >>= 8;
                                                                                    }
                                                                                    if (i33 != 8) {
                                                                                        z4 = z7;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (i32 != length7) {
                                                                                    i32++;
                                                                                    jArr10 = jArr11;
                                                                                } else {
                                                                                    z6 = z7;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        j2 = j13;
                                                                        mw2Var.m8409a(objM8132g6);
                                                                        z4 = true;
                                                                    }
                                                                    z6 = z4;
                                                                } else {
                                                                    j2 = j13;
                                                                }
                                                                z4 = z6;
                                                                z6 = z4;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            lw2Var2 = lw2Var3;
                                                            i2 = i31;
                                                            objArr2 = objArr14;
                                                            j2 = j13;
                                                        }
                                                        i31 = i2 + 1;
                                                        j13 = j2 >> 8;
                                                        lw2Var3 = lw2Var2;
                                                        objArr14 = objArr2;
                                                        it3 = it2;
                                                    }
                                                    it = it3;
                                                    lw2Var = lw2Var3;
                                                    objArr = objArr14;
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    lw2Var = lw2Var3;
                                                    objArr = objArr14;
                                                }
                                                if (i29 == length6) {
                                                    break;
                                                }
                                                i29++;
                                                it3 = it;
                                                jArr8 = jArr9;
                                                lw2Var3 = lw2Var;
                                                objArr14 = objArr;
                                            }
                                            z5 = z6;
                                        } else {
                                            it = it3;
                                            lw2Var = lw2Var3;
                                        }
                                    } else {
                                        it = it3;
                                        lw2Var = lw2Var3;
                                        wy0 wy0Var4 = (wy0) objM8132g5;
                                        Object obj7 = map.get(wy0Var4);
                                        r94 r94Var4 = wy0Var4.f33847c;
                                        if (r94Var4 == null) {
                                            r94Var4 = ia5Var3;
                                        }
                                        if (r94Var4.mo6713d(wy0Var4.m12439i().f32930f, obj7)) {
                                            uw2Var.m11663b(wy0Var4);
                                        } else {
                                            Object objM8132g7 = lw2Var4.m8132g(wy0Var4);
                                            if (objM8132g7 == null) {
                                                z3 = z5;
                                                break;
                                            }
                                            if (objM8132g7 instanceof mw2) {
                                                mw2 mw2Var9 = (mw2) objM8132g7;
                                                Object[] objArr16 = mw2Var9.f25258b;
                                                long[] jArr12 = mw2Var9.f25257a;
                                                int length8 = jArr12.length - 2;
                                                if (length8 < 0) {
                                                    z3 = z5;
                                                    break;
                                                }
                                                boolean z8 = z5;
                                                int i35 = 0;
                                                while (true) {
                                                    long j15 = jArr12[i35];
                                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i35 - length8)) >>> 31);
                                                        long j16 = j15;
                                                        for (int i37 = 0; i37 < i36; i37++) {
                                                            if ((j16 & 255) < 128) {
                                                                mw2Var.m8409a(objArr16[(i35 << 3) + i37]);
                                                                z8 = true;
                                                            }
                                                            j16 >>= 8;
                                                        }
                                                        if (i36 != 8) {
                                                            z3 = z8;
                                                            break;
                                                        }
                                                    }
                                                    if (i35 == length8) {
                                                        z5 = z8;
                                                        z3 = z5;
                                                        break;
                                                    }
                                                    i35++;
                                                }
                                            } else {
                                                mw2Var.m8409a(objM8132g7);
                                                z3 = true;
                                            }
                                            z5 = z3;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = false;
                                    z94Var2 = this;
                                    z94Var2.f35897j = z2;
                                    throw th;
                                }
                            } else {
                                it = it3;
                                lw2Var = lw2Var3;
                            }
                            i = 0;
                            z94Var = this;
                            z94Var.f35897j = false;
                        } catch (Throwable th3) {
                            th = th3;
                            z94Var2 = z94Var3;
                            z2 = false;
                        }
                    }
                    boolean z9 = z5;
                    Object objM8132g8 = lw2Var4.m8132g(next);
                    if (objM8132g8 != null) {
                        if (objM8132g8 instanceof mw2) {
                            mw2 mw2Var10 = (mw2) objM8132g8;
                            Object[] objArr17 = mw2Var10.f25258b;
                            long[] jArr13 = mw2Var10.f25257a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                int i38 = i;
                                while (true) {
                                    long j17 = jArr13[i38];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i38 != length9) {
                                            break;
                                            break;
                                        }
                                        i38++;
                                    } else {
                                        int i39 = 8 - ((~(i38 - length9)) >>> 31);
                                        long j18 = j17;
                                        for (int i40 = i; i40 < i39; i40++) {
                                            if ((j18 & 255) < 128) {
                                                mw2Var.m8409a(objArr17[(i38 << 3) + i40]);
                                                z9 = true;
                                            }
                                            j18 >>= 8;
                                        }
                                        if (i39 != 8) {
                                            break;
                                        }
                                        if (i38 != length9) {
                                            break;
                                        }
                                        i38++;
                                    }
                                }
                            }
                        } else {
                            mw2Var.m8409a(objM8132g8);
                            z9 = true;
                        }
                    }
                    z5 = z9;
                } else {
                    it = it3;
                    lw2Var = lw2Var3;
                    z94Var = z94Var3;
                }
                it3 = it;
                z94Var3 = z94Var;
                lw2Var3 = lw2Var;
            }
            z = z5;
        }
        z94 z94Var4 = z94Var3;
        int i41 = 0;
        if (!z94Var4.f35897j && (i3 = uw2Var.f32213c) != 0) {
            Object[] objArr18 = uw2Var.f32211a;
            int i42 = 0;
            while (i42 < i3) {
                wy0 wy0Var5 = (wy0) objArr18[i42];
                lw2 lw2Var5 = z94Var4.f35893f;
                int iHashCode = Long.hashCode(k94.m7451h().mo5015g());
                Object objM8132g9 = lw2Var4.m8132g(wy0Var5);
                if (objM8132g9 == null) {
                    i4 = i3;
                    objArr3 = objArr18;
                } else if (objM8132g9 instanceof mw2) {
                    mw2 mw2Var11 = (mw2) objM8132g9;
                    Object[] objArr19 = mw2Var11.f25258b;
                    long[] jArr14 = mw2Var11.f25257a;
                    int length10 = jArr14.length - 2;
                    if (length10 >= 0) {
                        int i43 = i41;
                        while (true) {
                            long j19 = jArr14[i43];
                            objArr3 = objArr18;
                            if ((((~j19) << c) & j19 & j) != j) {
                                int i44 = 8 - ((~(i43 - length10)) >>> 31);
                                int i45 = 0;
                                while (i45 < i44) {
                                    if ((j19 & 255) < 128) {
                                        Object obj8 = objArr19[(i43 << 3) + i45];
                                        yv2 yv2Var2 = (yv2) lw2Var5.m8132g(obj8);
                                        if (yv2Var2 == null) {
                                            yv2Var = new yv2();
                                            lw2Var5.m8138m(obj8, yv2Var);
                                        } else {
                                            yv2Var = yv2Var2;
                                        }
                                        z94Var4.m13459b(wy0Var5, iHashCode, obj8, yv2Var);
                                    }
                                    j19 >>= 8;
                                    i45++;
                                    i3 = i3;
                                }
                                i4 = i3;
                                if (i44 != 8) {
                                    break;
                                }
                            } else {
                                i4 = i3;
                            }
                            if (i43 == length10) {
                                break;
                            }
                            i43++;
                            objArr18 = objArr3;
                            i3 = i4;
                        }
                    } else {
                        i4 = i3;
                        objArr3 = objArr18;
                    }
                } else {
                    i4 = i3;
                    objArr3 = objArr18;
                    yv2 yv2Var3 = (yv2) lw2Var5.m8132g(objM8132g9);
                    if (yv2Var3 == null) {
                        yv2Var3 = new yv2();
                        lw2Var5.m8138m(objM8132g9, yv2Var3);
                    }
                    z94Var4.m13459b(wy0Var5, iHashCode, objM8132g9, yv2Var3);
                }
                i42++;
                objArr18 = objArr3;
                i3 = i4;
                i41 = 0;
            }
            uw2Var.m11668g();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m13459b(Object obj, int i, Object obj2, yv2 yv2Var) {
        int i2;
        if (this.f35898k > 0) {
            return;
        }
        int iM13259c = yv2Var.m13259c(obj);
        if (iM13259c < 0) {
            iM13259c = ~iM13259c;
            i2 = -1;
        } else {
            i2 = yv2Var.f35549c[iM13259c];
        }
        yv2Var.f35548b[iM13259c] = obj;
        yv2Var.f35549c[iM13259c] = i;
        if ((obj instanceof wy0) && i2 != i) {
            vy0 vy0VarM12439i = ((wy0) obj).m12439i();
            this.f35900m.put(obj, vy0VarM12439i.f32930f);
            yv2 yv2Var2 = vy0VarM12439i.f32929e;
            lw2 lw2Var = this.f35899l;
            dt0.m4690S(lw2Var, obj);
            Object[] objArr = yv2Var2.f35548b;
            long[] jArr = yv2Var2.f35547a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                hc4 hc4Var = (hc4) objArr[(i3 << 3) + i5];
                                if (hc4Var instanceof ic4) {
                                    ((ic4) hc4Var).m6750g(2);
                                }
                                dt0.m4713o(lw2Var, hc4Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof ic4) {
                ((ic4) obj).m6750g(2);
            }
            dt0.m4713o(this.f35892e, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13460c(Object obj, Object obj2) {
        lw2 lw2Var = this.f35892e;
        dt0.m4689R(lw2Var, obj2, obj);
        if (!(obj2 instanceof wy0) || lw2Var.m8128c(obj2)) {
            return;
        }
        dt0.m4690S(this.f35899l, obj2);
        this.f35900m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m13461d(t63 t63Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        lw2 lw2Var = this.f35893f;
        long[] jArr3 = lw2Var.f24418a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = lw2Var.f24419b[i6];
                        j2 = j4;
                        yv2 yv2Var = (yv2) lw2Var.f24420c[i6];
                        Boolean bool = (Boolean) t63Var.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = yv2Var.f35548b;
                            int[] iArr = yv2Var.f35549c;
                            long[] jArr4 = yv2Var.f35547a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                m13460c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else if (i8 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                        }
                        if (bool.booleanValue()) {
                            lw2Var.m8137l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
