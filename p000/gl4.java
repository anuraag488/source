package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gl4 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f19869a;

    static {
        ia5 ia5Var = ia5.f21230u;
        kj0 kj0Var = new kj0(new nu3((byte) 16), (byte) 1);
        kj0Var.f23162c = ia5Var;
        VarHandle.storeStoreFence();
        f19869a = kj0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m6036a(xl4 xl4Var, mq1 mq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(15327438);
        int i2 = i | (ir1Var.m6890g(xl4Var) ? 4 : 2) | (ir1Var.m6894i(mq1Var) ? 32 : 16);
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            kj0 kj0Var = f19869a;
            as4.m3244c(kj0Var.mo7523a(((xl4) ir1Var.m6898k(kj0Var)).m12712d(xl4Var)), mq1Var, ir1Var, (i2 & 112) | 8);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            er1 er1Var = new er1((byte) 21);
            er1Var.f18412b = xl4Var;
            er1Var.f18413c = mq1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = er1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0191  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:135:0x019c  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:169:0x0204  */
    /* JADX WARN: Code duplicated, block: B:170:0x0208  */
    /* JADX WARN: Code duplicated, block: B:172:0x020d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0213  */
    /* JADX WARN: Code duplicated, block: B:178:0x021b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0221  */
    /* JADX WARN: Code duplicated, block: B:184:0x022c  */
    /* JADX WARN: Code duplicated, block: B:187:0x023c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0249  */
    /* JADX WARN: Code duplicated, block: B:194:0x0253  */
    /* JADX WARN: Code duplicated, block: B:196:0x025d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0285  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:207:0x028d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0291  */
    /* JADX WARN: Code duplicated, block: B:211:0x0295  */
    /* JADX WARN: Code duplicated, block: B:213:0x0298  */
    /* JADX WARN: Code duplicated, block: B:214:0x029a  */
    /* JADX WARN: Code duplicated, block: B:216:0x029e  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:220:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:223:0x02af  */
    /* JADX WARN: Code duplicated, block: B:225:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:226:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:229:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:231:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:232:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:238:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:243:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:244:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:246:0x0307  */
    /* JADX WARN: Code duplicated, block: B:248:0x030b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:252:0x0322  */
    /* JADX WARN: Code duplicated, block: B:254:0x0395  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r51v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX INFO: renamed from: b */
    public static final void m6037b(String str, nt2 nt2Var, long j, long j2, xm1 xm1Var, bm1 bm1Var, long j3, wi4 wi4Var, long j4, int i, boolean z, int i2, int i3, xl4 xl4Var, mi0 mi0Var, int i4, int i5, int i6) {
        int i7;
        nt2 nt2Var2;
        int i8;
        int i9;
        boolean zM6894i;
        int i10;
        int i11;
        long j5;
        int i12;
        int i13;
        int i14;
        xm1 xm1Var2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z2;
        String str2;
        long j6;
        bm1 bm1Var2;
        long j7;
        wi4 wi4Var2;
        ?? r12;
        boolean z3;
        int i38;
        int i39;
        xl4 xl4Var2;
        ir1 ir1Var;
        long j8;
        yk3 yk3VarM6916v;
        long j9;
        bm1 bm1Var3;
        wi4 wi4Var3;
        long j10;
        int i40;
        boolean z4;
        int i41;
        xl4 xl4Var3;
        wi4 wi4Var4;
        long jM12710b;
        boolean z5;
        ?? r6;
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6889f0(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (ir1Var2.m6890g(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i42 = i6 & 2;
        if (i42 == 0) {
            if ((i4 & 48) == 0) {
                nt2Var2 = nt2Var;
                i7 |= ir1Var2.m6890g(nt2Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                if (ir1Var2.m6888f(j)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            if ((i6 & 8) != 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if ((i4 & 4096) == 0) {
                    zM6894i = ir1Var2.m6890g(null);
                } else {
                    zM6894i = ir1Var2.m6894i(null);
                }
                if (zM6894i) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i7 |= i10;
            }
            i11 = i6 & 16;
            if (i11 != 0) {
                i7 |= 24576;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 24576) == 0) {
                    if (ir1Var2.m6888f(j5)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i7 |= i12;
                }
            }
            if ((i6 & 32) != 0) {
                i7 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (ir1Var2.m6890g(null)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i7 |= i13;
            }
            i14 = i6 & 64;
            if (i14 != 0) {
                i7 |= 1572864;
                xm1Var2 = xm1Var;
            } else {
                xm1Var2 = xm1Var;
                if ((i4 & 1572864) == 0) {
                    if (ir1Var2.m6890g(xm1Var2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
            }
            i16 = i6 & 128;
            i17 = 4194304;
            if (i16 != 0) {
                i7 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (ir1Var2.m6890g(bm1Var)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i7 |= i18;
            }
            i19 = i6 & 256;
            if (i19 != 0) {
                i20 = i7 | 100663296;
            } else {
                i20 = i7;
                if ((i4 & 100663296) == 0) {
                    if (ir1Var2.m6888f(j3)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i20 |= i21;
                }
            }
            if ((i6 & 512) != 0) {
                i20 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if (ir1Var2.m6890g(null)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i20 |= i22;
            }
            i23 = i6 & 1024;
            if (i23 != 0) {
                i24 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (ir1Var2.m6890g(wi4Var)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            i26 = i6 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i5 & 48) == 0) {
                if (ir1Var2.m6888f(j4)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i6 & 4096;
            if (i29 != 0) {
                if ((i5 & 384) == 0) {
                    if (ir1Var2.m6886e(i)) {
                        i30 = 256;
                    } else {
                        i30 = 128;
                    }
                    i28 |= i30;
                }
                i31 = i6 & 8192;
                if (i31 != 0) {
                    i33 = i28 | 3072;
                } else {
                    i32 = i28;
                    if ((i5 & 3072) == 0) {
                        i33 = i32 | (ir1Var2.m6892h(z) ? 2048 : 1024);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i6 & 16384;
                if (i34 != 0) {
                    i35 = i33;
                    if ((i5 & 24576) == 0) {
                        i35 |= ir1Var2.m6886e(i2) ? 16384 : 8192;
                    }
                    i36 = i6 & 32768;
                    if (i36 != 0) {
                        i35 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        if (ir1Var2.m6886e(i3)) {
                            i37 = 131072;
                        } else {
                            i37 = 65536;
                        }
                        i35 |= i37;
                    }
                    if ((i6 & 65536) != 0) {
                        i35 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0 && ir1Var2.m6890g(xl4Var)) {
                            i17 = 8388608;
                        }
                        i35 |= i17;
                    }
                    if ((i20 & 306783379) == 306783378 || (i35 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (ir1Var2.m6871T(i20 & 1, z2)) {
                        ir1Var2.m6876Y();
                        if ((i4 & 1) != 0 || ir1Var2.m6856B()) {
                            if (i42 != 0) {
                                nt2Var2 = kt2.f23428a;
                            }
                            if (i8 != 0) {
                                j9 = pb0.f27501h;
                            } else {
                                j9 = j;
                            }
                            if (i11 != 0) {
                                j5 = bm4.f15419c;
                            }
                            if (i14 != 0) {
                                xm1Var2 = null;
                            }
                            if (i16 != 0) {
                                bm1Var3 = null;
                            } else {
                                bm1Var3 = bm1Var;
                            }
                            if (i19 != 0) {
                                j7 = bm4.f15419c;
                            } else {
                                j7 = j3;
                            }
                            if (i23 != 0) {
                                wi4Var3 = null;
                            } else {
                                wi4Var3 = wi4Var;
                            }
                            if (i26 != 0) {
                                j10 = bm4.f15419c;
                            } else {
                                j10 = j4;
                            }
                            if (i29 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i;
                            }
                            if (i31 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i34 != 0) {
                                i38 = Integer.MAX_VALUE;
                            } else {
                                i38 = i2;
                            }
                            i41 = i36 == 0 ? i3 : 1;
                            if ((i6 & 131072) != 0) {
                                i35 &= -29360129;
                                xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                            } else {
                                xl4Var3 = xl4Var;
                            }
                            wi4Var4 = wi4Var3;
                        } else {
                            ir1Var2.m6874W();
                            if ((i6 & 131072) != 0) {
                                i35 &= -29360129;
                            }
                            j9 = j;
                            bm1Var3 = bm1Var;
                            j7 = j3;
                            wi4Var4 = wi4Var;
                            j10 = j4;
                            i40 = i;
                            z4 = z;
                            i38 = i2;
                            i41 = i3;
                            xl4Var3 = xl4Var;
                        }
                        ir1Var2.m6913s();
                        ir1Var2.m6885d0(-565217490);
                        if (j9 != 16) {
                            i20 = i20;
                            jM12710b = j9;
                            z5 = false;
                        } else {
                            ir1Var2.m6885d0(-565216717);
                            jM12710b = xl4Var3.m12710b();
                            if (jM12710b != 16) {
                                jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                            }
                            z5 = false;
                            ir1Var2.m6912r(false);
                        }
                        ir1Var2.m6912r(z5);
                        r6 = z5;
                        if (wi4Var4 != null) {
                            r6 = wi4Var4.f33412a;
                        }
                        bm1 bm1Var4 = bm1Var3;
                        xl4 xl4Var4 = xl4Var3;
                        bm1Var2 = bm1Var4;
                        int i43 = i35 << 6;
                        c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var4, jM12710b, j5, xm1Var2, bm1Var4, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | ((i20 << 18) & 1879048192), 256);
                        str2 = str;
                        ir1Var = ir1Var2;
                        xl4Var2 = xl4Var4;
                        z3 = z4;
                        i39 = i41;
                        j8 = j10;
                        r12 = i40;
                        wi4Var2 = wi4Var4;
                        j6 = j9;
                    } else {
                        str2 = str;
                        ir1Var2.m6874W();
                        j6 = j;
                        bm1Var2 = bm1Var;
                        j7 = j3;
                        wi4Var2 = wi4Var;
                        r12 = i;
                        z3 = z;
                        i38 = i2;
                        i39 = i3;
                        xl4Var2 = xl4Var;
                        ir1Var = ir1Var2;
                        j8 = j4;
                    }
                    yk3VarM6916v = ir1Var.m6916v();
                    if (yk3VarM6916v != null) {
                        fl4 fl4Var = new fl4();
                        fl4Var.f19088a = str2;
                        fl4Var.f19089b = nt2Var2;
                        fl4Var.f19090c = j6;
                        fl4Var.f19091d = j5;
                        fl4Var.f19092e = xm1Var2;
                        fl4Var.f19093f = bm1Var2;
                        fl4Var.f19094g = j7;
                        fl4Var.f19095h = wi4Var2;
                        fl4Var.f19096i = j8;
                        fl4Var.f19097j = r12;
                        fl4Var.f19098k = z3;
                        fl4Var.f19099l = i38;
                        fl4Var.f19100m = i39;
                        fl4Var.f19101n = xl4Var2;
                        fl4Var.f19102o = i4;
                        fl4Var.f19103p = i5;
                        fl4Var.f19104q = i6;
                        VarHandle.storeStoreFence();
                        yk3VarM6916v.f35300d = fl4Var;
                    }
                }
                i35 = i33 | 24576;
                i36 = i6 & 32768;
                if (i36 != 0) {
                    i35 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (ir1Var2.m6886e(i3)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i35 |= i37;
                }
                if ((i6 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i17 = 8388608;
                    }
                    i35 |= i17;
                }
                if ((i20 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (ir1Var2.m6871T(i20 & 1, z2)) {
                    ir1Var2.m6876Y();
                    if ((i4 & 1) != 0) {
                        if (i42 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i8 != 0) {
                            j9 = pb0.f27501h;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            j5 = bm4.f15419c;
                        }
                        if (i14 != 0) {
                            xm1Var2 = null;
                        }
                        if (i16 != 0) {
                            bm1Var3 = null;
                        } else {
                            bm1Var3 = bm1Var;
                        }
                        if (i19 != 0) {
                            j7 = bm4.f15419c;
                        } else {
                            j7 = j3;
                        }
                        if (i23 != 0) {
                            wi4Var3 = null;
                        } else {
                            wi4Var3 = wi4Var;
                        }
                        if (i26 != 0) {
                            j10 = bm4.f15419c;
                        } else {
                            j10 = j4;
                        }
                        if (i29 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i35 &= -29360129;
                            xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                        } else {
                            xl4Var3 = xl4Var;
                        }
                        wi4Var4 = wi4Var3;
                    } else {
                        if (i42 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i8 != 0) {
                            j9 = pb0.f27501h;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            j5 = bm4.f15419c;
                        }
                        if (i14 != 0) {
                            xm1Var2 = null;
                        }
                        if (i16 != 0) {
                            bm1Var3 = null;
                        } else {
                            bm1Var3 = bm1Var;
                        }
                        if (i19 != 0) {
                            j7 = bm4.f15419c;
                        } else {
                            j7 = j3;
                        }
                        if (i23 != 0) {
                            wi4Var3 = null;
                        } else {
                            wi4Var3 = wi4Var;
                        }
                        if (i26 != 0) {
                            j10 = bm4.f15419c;
                        } else {
                            j10 = j4;
                        }
                        if (i29 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i35 &= -29360129;
                            xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                        } else {
                            xl4Var3 = xl4Var;
                        }
                        wi4Var4 = wi4Var3;
                    }
                    ir1Var2.m6913s();
                    ir1Var2.m6885d0(-565217490);
                    if (j9 != 16) {
                        i20 = i20;
                        jM12710b = j9;
                        z5 = false;
                    } else {
                        ir1Var2.m6885d0(-565216717);
                        jM12710b = xl4Var3.m12710b();
                        if (jM12710b != 16) {
                            jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                        }
                        z5 = false;
                        ir1Var2.m6912r(false);
                    }
                    ir1Var2.m6912r(z5);
                    r6 = z5;
                    if (wi4Var4 != null) {
                        r6 = wi4Var4.f33412a;
                    }
                    bm1 bm1Var5 = bm1Var3;
                    xl4 xl4Var5 = xl4Var3;
                    bm1Var2 = bm1Var5;
                    int i44 = i35 << 6;
                    c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var5, jM12710b, j5, xm1Var2, bm1Var5, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i44 & 57344) | (i44 & 458752) | (i44 & 3670016) | (i44 & 29360128) | ((i20 << 18) & 1879048192), 256);
                    str2 = str;
                    ir1Var = ir1Var2;
                    xl4Var2 = xl4Var5;
                    z3 = z4;
                    i39 = i41;
                    j8 = j10;
                    r12 = i40;
                    wi4Var2 = wi4Var4;
                    j6 = j9;
                } else {
                    str2 = str;
                    ir1Var2.m6874W();
                    j6 = j;
                    bm1Var2 = bm1Var;
                    j7 = j3;
                    wi4Var2 = wi4Var;
                    r12 = i;
                    z3 = z;
                    i38 = i2;
                    i39 = i3;
                    xl4Var2 = xl4Var;
                    ir1Var = ir1Var2;
                    j8 = j4;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    fl4 fl4Var2 = new fl4();
                    fl4Var2.f19088a = str2;
                    fl4Var2.f19089b = nt2Var2;
                    fl4Var2.f19090c = j6;
                    fl4Var2.f19091d = j5;
                    fl4Var2.f19092e = xm1Var2;
                    fl4Var2.f19093f = bm1Var2;
                    fl4Var2.f19094g = j7;
                    fl4Var2.f19095h = wi4Var2;
                    fl4Var2.f19096i = j8;
                    fl4Var2.f19097j = r12;
                    fl4Var2.f19098k = z3;
                    fl4Var2.f19099l = i38;
                    fl4Var2.f19100m = i39;
                    fl4Var2.f19101n = xl4Var2;
                    fl4Var2.f19102o = i4;
                    fl4Var2.f19103p = i5;
                    fl4Var2.f19104q = i6;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = fl4Var2;
                }
            }
            i28 |= 384;
            i31 = i6 & 8192;
            if (i31 != 0) {
                i33 = i28 | 3072;
            } else {
                i32 = i28;
                if ((i5 & 3072) == 0) {
                    i33 = i32 | (ir1Var2.m6892h(z) ? 2048 : 1024);
                } else {
                    i33 = i32;
                }
            }
            i34 = i6 & 16384;
            if (i34 != 0) {
                i35 = i33;
                if ((i5 & 24576) == 0) {
                    i35 |= ir1Var2.m6886e(i2) ? 16384 : 8192;
                }
                i36 = i6 & 32768;
                if (i36 != 0) {
                    i35 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (ir1Var2.m6886e(i3)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i35 |= i37;
                }
                if ((i6 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i17 = 8388608;
                    }
                    i35 |= i17;
                }
                if ((i20 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (ir1Var2.m6871T(i20 & 1, z2)) {
                    ir1Var2.m6876Y();
                    if ((i4 & 1) != 0) {
                        if (i42 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i8 != 0) {
                            j9 = pb0.f27501h;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            j5 = bm4.f15419c;
                        }
                        if (i14 != 0) {
                            xm1Var2 = null;
                        }
                        if (i16 != 0) {
                            bm1Var3 = null;
                        } else {
                            bm1Var3 = bm1Var;
                        }
                        if (i19 != 0) {
                            j7 = bm4.f15419c;
                        } else {
                            j7 = j3;
                        }
                        if (i23 != 0) {
                            wi4Var3 = null;
                        } else {
                            wi4Var3 = wi4Var;
                        }
                        if (i26 != 0) {
                            j10 = bm4.f15419c;
                        } else {
                            j10 = j4;
                        }
                        if (i29 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i35 &= -29360129;
                            xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                        } else {
                            xl4Var3 = xl4Var;
                        }
                        wi4Var4 = wi4Var3;
                    } else {
                        if (i42 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i8 != 0) {
                            j9 = pb0.f27501h;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            j5 = bm4.f15419c;
                        }
                        if (i14 != 0) {
                            xm1Var2 = null;
                        }
                        if (i16 != 0) {
                            bm1Var3 = null;
                        } else {
                            bm1Var3 = bm1Var;
                        }
                        if (i19 != 0) {
                            j7 = bm4.f15419c;
                        } else {
                            j7 = j3;
                        }
                        if (i23 != 0) {
                            wi4Var3 = null;
                        } else {
                            wi4Var3 = wi4Var;
                        }
                        if (i26 != 0) {
                            j10 = bm4.f15419c;
                        } else {
                            j10 = j4;
                        }
                        if (i29 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i35 &= -29360129;
                            xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                        } else {
                            xl4Var3 = xl4Var;
                        }
                        wi4Var4 = wi4Var3;
                    }
                    ir1Var2.m6913s();
                    ir1Var2.m6885d0(-565217490);
                    if (j9 != 16) {
                        i20 = i20;
                        jM12710b = j9;
                        z5 = false;
                    } else {
                        ir1Var2.m6885d0(-565216717);
                        jM12710b = xl4Var3.m12710b();
                        if (jM12710b != 16) {
                            jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                        }
                        z5 = false;
                        ir1Var2.m6912r(false);
                    }
                    ir1Var2.m6912r(z5);
                    r6 = z5;
                    if (wi4Var4 != null) {
                        r6 = wi4Var4.f33412a;
                    }
                    bm1 bm1Var6 = bm1Var3;
                    xl4 xl4Var6 = xl4Var3;
                    bm1Var2 = bm1Var6;
                    int i45 = i35 << 6;
                    c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var6, jM12710b, j5, xm1Var2, bm1Var6, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128) | ((i20 << 18) & 1879048192), 256);
                    str2 = str;
                    ir1Var = ir1Var2;
                    xl4Var2 = xl4Var6;
                    z3 = z4;
                    i39 = i41;
                    j8 = j10;
                    r12 = i40;
                    wi4Var2 = wi4Var4;
                    j6 = j9;
                } else {
                    str2 = str;
                    ir1Var2.m6874W();
                    j6 = j;
                    bm1Var2 = bm1Var;
                    j7 = j3;
                    wi4Var2 = wi4Var;
                    r12 = i;
                    z3 = z;
                    i38 = i2;
                    i39 = i3;
                    xl4Var2 = xl4Var;
                    ir1Var = ir1Var2;
                    j8 = j4;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    fl4 fl4Var3 = new fl4();
                    fl4Var3.f19088a = str2;
                    fl4Var3.f19089b = nt2Var2;
                    fl4Var3.f19090c = j6;
                    fl4Var3.f19091d = j5;
                    fl4Var3.f19092e = xm1Var2;
                    fl4Var3.f19093f = bm1Var2;
                    fl4Var3.f19094g = j7;
                    fl4Var3.f19095h = wi4Var2;
                    fl4Var3.f19096i = j8;
                    fl4Var3.f19097j = r12;
                    fl4Var3.f19098k = z3;
                    fl4Var3.f19099l = i38;
                    fl4Var3.f19100m = i39;
                    fl4Var3.f19101n = xl4Var2;
                    fl4Var3.f19102o = i4;
                    fl4Var3.f19103p = i5;
                    fl4Var3.f19104q = i6;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = fl4Var3;
                }
            }
            i35 = i33 | 24576;
            i36 = i6 & 32768;
            if (i36 != 0) {
                i35 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (ir1Var2.m6886e(i3)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i35 |= i37;
            }
            if ((i6 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i17 = 8388608;
                }
                i35 |= i17;
            }
            if ((i20 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ir1Var2.m6871T(i20 & 1, z2)) {
                ir1Var2.m6876Y();
                if ((i4 & 1) != 0) {
                    if (i42 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i8 != 0) {
                        j9 = pb0.f27501h;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        j5 = bm4.f15419c;
                    }
                    if (i14 != 0) {
                        xm1Var2 = null;
                    }
                    if (i16 != 0) {
                        bm1Var3 = null;
                    } else {
                        bm1Var3 = bm1Var;
                    }
                    if (i19 != 0) {
                        j7 = bm4.f15419c;
                    } else {
                        j7 = j3;
                    }
                    if (i23 != 0) {
                        wi4Var3 = null;
                    } else {
                        wi4Var3 = wi4Var;
                    }
                    if (i26 != 0) {
                        j10 = bm4.f15419c;
                    } else {
                        j10 = j4;
                    }
                    if (i29 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i35 &= -29360129;
                        xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                    } else {
                        xl4Var3 = xl4Var;
                    }
                    wi4Var4 = wi4Var3;
                } else {
                    if (i42 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i8 != 0) {
                        j9 = pb0.f27501h;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        j5 = bm4.f15419c;
                    }
                    if (i14 != 0) {
                        xm1Var2 = null;
                    }
                    if (i16 != 0) {
                        bm1Var3 = null;
                    } else {
                        bm1Var3 = bm1Var;
                    }
                    if (i19 != 0) {
                        j7 = bm4.f15419c;
                    } else {
                        j7 = j3;
                    }
                    if (i23 != 0) {
                        wi4Var3 = null;
                    } else {
                        wi4Var3 = wi4Var;
                    }
                    if (i26 != 0) {
                        j10 = bm4.f15419c;
                    } else {
                        j10 = j4;
                    }
                    if (i29 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i35 &= -29360129;
                        xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                    } else {
                        xl4Var3 = xl4Var;
                    }
                    wi4Var4 = wi4Var3;
                }
                ir1Var2.m6913s();
                ir1Var2.m6885d0(-565217490);
                if (j9 != 16) {
                    i20 = i20;
                    jM12710b = j9;
                    z5 = false;
                } else {
                    ir1Var2.m6885d0(-565216717);
                    jM12710b = xl4Var3.m12710b();
                    if (jM12710b != 16) {
                        jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                    }
                    z5 = false;
                    ir1Var2.m6912r(false);
                }
                ir1Var2.m6912r(z5);
                r6 = z5;
                if (wi4Var4 != null) {
                    r6 = wi4Var4.f33412a;
                }
                bm1 bm1Var7 = bm1Var3;
                xl4 xl4Var7 = xl4Var3;
                bm1Var2 = bm1Var7;
                int i46 = i35 << 6;
                c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var7, jM12710b, j5, xm1Var2, bm1Var7, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | ((i20 << 18) & 1879048192), 256);
                str2 = str;
                ir1Var = ir1Var2;
                xl4Var2 = xl4Var7;
                z3 = z4;
                i39 = i41;
                j8 = j10;
                r12 = i40;
                wi4Var2 = wi4Var4;
                j6 = j9;
            } else {
                str2 = str;
                ir1Var2.m6874W();
                j6 = j;
                bm1Var2 = bm1Var;
                j7 = j3;
                wi4Var2 = wi4Var;
                r12 = i;
                z3 = z;
                i38 = i2;
                i39 = i3;
                xl4Var2 = xl4Var;
                ir1Var = ir1Var2;
                j8 = j4;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                fl4 fl4Var4 = new fl4();
                fl4Var4.f19088a = str2;
                fl4Var4.f19089b = nt2Var2;
                fl4Var4.f19090c = j6;
                fl4Var4.f19091d = j5;
                fl4Var4.f19092e = xm1Var2;
                fl4Var4.f19093f = bm1Var2;
                fl4Var4.f19094g = j7;
                fl4Var4.f19095h = wi4Var2;
                fl4Var4.f19096i = j8;
                fl4Var4.f19097j = r12;
                fl4Var4.f19098k = z3;
                fl4Var4.f19099l = i38;
                fl4Var4.f19100m = i39;
                fl4Var4.f19101n = xl4Var2;
                fl4Var4.f19102o = i4;
                fl4Var4.f19103p = i5;
                fl4Var4.f19104q = i6;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = fl4Var4;
            }
        }
        i7 |= 48;
        nt2Var2 = nt2Var;
        i8 = i6 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            if (ir1Var2.m6888f(j)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if ((i4 & 4096) == 0) {
                zM6894i = ir1Var2.m6890g(null);
            } else {
                zM6894i = ir1Var2.m6894i(null);
            }
            if (zM6894i) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i7 |= i10;
        }
        i11 = i6 & 16;
        if (i11 != 0) {
            i7 |= 24576;
            j5 = j2;
        } else {
            j5 = j2;
            if ((i4 & 24576) == 0) {
                if (ir1Var2.m6888f(j5)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i7 |= i12;
            }
        }
        if ((i6 & 32) != 0) {
            i7 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (ir1Var2.m6890g(null)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i7 |= i13;
        }
        i14 = i6 & 64;
        if (i14 != 0) {
            i7 |= 1572864;
            xm1Var2 = xm1Var;
        } else {
            xm1Var2 = xm1Var;
            if ((i4 & 1572864) == 0) {
                if (ir1Var2.m6890g(xm1Var2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
        }
        i16 = i6 & 128;
        i17 = 4194304;
        if (i16 != 0) {
            i7 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            if (ir1Var2.m6890g(bm1Var)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i7 |= i18;
        }
        i19 = i6 & 256;
        if (i19 != 0) {
            i20 = i7 | 100663296;
        } else {
            i20 = i7;
            if ((i4 & 100663296) == 0) {
                if (ir1Var2.m6888f(j3)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i20 |= i21;
            }
        }
        if ((i6 & 512) != 0) {
            i20 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            if (ir1Var2.m6890g(null)) {
                i22 = 536870912;
            } else {
                i22 = 268435456;
            }
            i20 |= i22;
        }
        i23 = i6 & 1024;
        if (i23 != 0) {
            i24 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (ir1Var2.m6890g(wi4Var)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i5 | i25;
        } else {
            i24 = i5;
        }
        i26 = i6 & 2048;
        if (i26 != 0) {
            i24 |= 48;
        } else if ((i5 & 48) == 0) {
            if (ir1Var2.m6888f(j4)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i24 |= i27;
        }
        i28 = i24;
        i29 = i6 & 4096;
        if (i29 != 0) {
            if ((i5 & 384) == 0) {
                if (ir1Var2.m6886e(i)) {
                    i30 = 256;
                } else {
                    i30 = 128;
                }
                i28 |= i30;
            }
            i31 = i6 & 8192;
            if (i31 != 0) {
                i33 = i28 | 3072;
            } else {
                i32 = i28;
                if ((i5 & 3072) == 0) {
                    i33 = i32 | (ir1Var2.m6892h(z) ? 2048 : 1024);
                } else {
                    i33 = i32;
                }
            }
            i34 = i6 & 16384;
            if (i34 != 0) {
                i35 = i33;
                if ((i5 & 24576) == 0) {
                    i35 |= ir1Var2.m6886e(i2) ? 16384 : 8192;
                }
                i36 = i6 & 32768;
                if (i36 != 0) {
                    i35 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (ir1Var2.m6886e(i3)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i35 |= i37;
                }
                if ((i6 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i17 = 8388608;
                    }
                    i35 |= i17;
                }
                if ((i20 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (ir1Var2.m6871T(i20 & 1, z2)) {
                    ir1Var2.m6876Y();
                    if ((i4 & 1) != 0) {
                        if (i42 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i8 != 0) {
                            j9 = pb0.f27501h;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            j5 = bm4.f15419c;
                        }
                        if (i14 != 0) {
                            xm1Var2 = null;
                        }
                        if (i16 != 0) {
                            bm1Var3 = null;
                        } else {
                            bm1Var3 = bm1Var;
                        }
                        if (i19 != 0) {
                            j7 = bm4.f15419c;
                        } else {
                            j7 = j3;
                        }
                        if (i23 != 0) {
                            wi4Var3 = null;
                        } else {
                            wi4Var3 = wi4Var;
                        }
                        if (i26 != 0) {
                            j10 = bm4.f15419c;
                        } else {
                            j10 = j4;
                        }
                        if (i29 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i35 &= -29360129;
                            xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                        } else {
                            xl4Var3 = xl4Var;
                        }
                        wi4Var4 = wi4Var3;
                    } else {
                        if (i42 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i8 != 0) {
                            j9 = pb0.f27501h;
                        } else {
                            j9 = j;
                        }
                        if (i11 != 0) {
                            j5 = bm4.f15419c;
                        }
                        if (i14 != 0) {
                            xm1Var2 = null;
                        }
                        if (i16 != 0) {
                            bm1Var3 = null;
                        } else {
                            bm1Var3 = bm1Var;
                        }
                        if (i19 != 0) {
                            j7 = bm4.f15419c;
                        } else {
                            j7 = j3;
                        }
                        if (i23 != 0) {
                            wi4Var3 = null;
                        } else {
                            wi4Var3 = wi4Var;
                        }
                        if (i26 != 0) {
                            j10 = bm4.f15419c;
                        } else {
                            j10 = j4;
                        }
                        if (i29 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            i35 &= -29360129;
                            xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                        } else {
                            xl4Var3 = xl4Var;
                        }
                        wi4Var4 = wi4Var3;
                    }
                    ir1Var2.m6913s();
                    ir1Var2.m6885d0(-565217490);
                    if (j9 != 16) {
                        i20 = i20;
                        jM12710b = j9;
                        z5 = false;
                    } else {
                        ir1Var2.m6885d0(-565216717);
                        jM12710b = xl4Var3.m12710b();
                        if (jM12710b != 16) {
                            jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                        }
                        z5 = false;
                        ir1Var2.m6912r(false);
                    }
                    ir1Var2.m6912r(z5);
                    r6 = z5;
                    if (wi4Var4 != null) {
                        r6 = wi4Var4.f33412a;
                    }
                    bm1 bm1Var8 = bm1Var3;
                    xl4 xl4Var8 = xl4Var3;
                    bm1Var2 = bm1Var8;
                    int i47 = i35 << 6;
                    c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var8, jM12710b, j5, xm1Var2, bm1Var8, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i47 & 57344) | (i47 & 458752) | (i47 & 3670016) | (i47 & 29360128) | ((i20 << 18) & 1879048192), 256);
                    str2 = str;
                    ir1Var = ir1Var2;
                    xl4Var2 = xl4Var8;
                    z3 = z4;
                    i39 = i41;
                    j8 = j10;
                    r12 = i40;
                    wi4Var2 = wi4Var4;
                    j6 = j9;
                } else {
                    str2 = str;
                    ir1Var2.m6874W();
                    j6 = j;
                    bm1Var2 = bm1Var;
                    j7 = j3;
                    wi4Var2 = wi4Var;
                    r12 = i;
                    z3 = z;
                    i38 = i2;
                    i39 = i3;
                    xl4Var2 = xl4Var;
                    ir1Var = ir1Var2;
                    j8 = j4;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    fl4 fl4Var5 = new fl4();
                    fl4Var5.f19088a = str2;
                    fl4Var5.f19089b = nt2Var2;
                    fl4Var5.f19090c = j6;
                    fl4Var5.f19091d = j5;
                    fl4Var5.f19092e = xm1Var2;
                    fl4Var5.f19093f = bm1Var2;
                    fl4Var5.f19094g = j7;
                    fl4Var5.f19095h = wi4Var2;
                    fl4Var5.f19096i = j8;
                    fl4Var5.f19097j = r12;
                    fl4Var5.f19098k = z3;
                    fl4Var5.f19099l = i38;
                    fl4Var5.f19100m = i39;
                    fl4Var5.f19101n = xl4Var2;
                    fl4Var5.f19102o = i4;
                    fl4Var5.f19103p = i5;
                    fl4Var5.f19104q = i6;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = fl4Var5;
                }
            }
            i35 = i33 | 24576;
            i36 = i6 & 32768;
            if (i36 != 0) {
                i35 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (ir1Var2.m6886e(i3)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i35 |= i37;
            }
            if ((i6 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i17 = 8388608;
                }
                i35 |= i17;
            }
            if ((i20 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ir1Var2.m6871T(i20 & 1, z2)) {
                ir1Var2.m6876Y();
                if ((i4 & 1) != 0) {
                    if (i42 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i8 != 0) {
                        j9 = pb0.f27501h;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        j5 = bm4.f15419c;
                    }
                    if (i14 != 0) {
                        xm1Var2 = null;
                    }
                    if (i16 != 0) {
                        bm1Var3 = null;
                    } else {
                        bm1Var3 = bm1Var;
                    }
                    if (i19 != 0) {
                        j7 = bm4.f15419c;
                    } else {
                        j7 = j3;
                    }
                    if (i23 != 0) {
                        wi4Var3 = null;
                    } else {
                        wi4Var3 = wi4Var;
                    }
                    if (i26 != 0) {
                        j10 = bm4.f15419c;
                    } else {
                        j10 = j4;
                    }
                    if (i29 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i35 &= -29360129;
                        xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                    } else {
                        xl4Var3 = xl4Var;
                    }
                    wi4Var4 = wi4Var3;
                } else {
                    if (i42 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i8 != 0) {
                        j9 = pb0.f27501h;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        j5 = bm4.f15419c;
                    }
                    if (i14 != 0) {
                        xm1Var2 = null;
                    }
                    if (i16 != 0) {
                        bm1Var3 = null;
                    } else {
                        bm1Var3 = bm1Var;
                    }
                    if (i19 != 0) {
                        j7 = bm4.f15419c;
                    } else {
                        j7 = j3;
                    }
                    if (i23 != 0) {
                        wi4Var3 = null;
                    } else {
                        wi4Var3 = wi4Var;
                    }
                    if (i26 != 0) {
                        j10 = bm4.f15419c;
                    } else {
                        j10 = j4;
                    }
                    if (i29 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i35 &= -29360129;
                        xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                    } else {
                        xl4Var3 = xl4Var;
                    }
                    wi4Var4 = wi4Var3;
                }
                ir1Var2.m6913s();
                ir1Var2.m6885d0(-565217490);
                if (j9 != 16) {
                    i20 = i20;
                    jM12710b = j9;
                    z5 = false;
                } else {
                    ir1Var2.m6885d0(-565216717);
                    jM12710b = xl4Var3.m12710b();
                    if (jM12710b != 16) {
                        jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                    }
                    z5 = false;
                    ir1Var2.m6912r(false);
                }
                ir1Var2.m6912r(z5);
                r6 = z5;
                if (wi4Var4 != null) {
                    r6 = wi4Var4.f33412a;
                }
                bm1 bm1Var9 = bm1Var3;
                xl4 xl4Var9 = xl4Var3;
                bm1Var2 = bm1Var9;
                int i48 = i35 << 6;
                c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var9, jM12710b, j5, xm1Var2, bm1Var9, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016) | (i48 & 29360128) | ((i20 << 18) & 1879048192), 256);
                str2 = str;
                ir1Var = ir1Var2;
                xl4Var2 = xl4Var9;
                z3 = z4;
                i39 = i41;
                j8 = j10;
                r12 = i40;
                wi4Var2 = wi4Var4;
                j6 = j9;
            } else {
                str2 = str;
                ir1Var2.m6874W();
                j6 = j;
                bm1Var2 = bm1Var;
                j7 = j3;
                wi4Var2 = wi4Var;
                r12 = i;
                z3 = z;
                i38 = i2;
                i39 = i3;
                xl4Var2 = xl4Var;
                ir1Var = ir1Var2;
                j8 = j4;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                fl4 fl4Var6 = new fl4();
                fl4Var6.f19088a = str2;
                fl4Var6.f19089b = nt2Var2;
                fl4Var6.f19090c = j6;
                fl4Var6.f19091d = j5;
                fl4Var6.f19092e = xm1Var2;
                fl4Var6.f19093f = bm1Var2;
                fl4Var6.f19094g = j7;
                fl4Var6.f19095h = wi4Var2;
                fl4Var6.f19096i = j8;
                fl4Var6.f19097j = r12;
                fl4Var6.f19098k = z3;
                fl4Var6.f19099l = i38;
                fl4Var6.f19100m = i39;
                fl4Var6.f19101n = xl4Var2;
                fl4Var6.f19102o = i4;
                fl4Var6.f19103p = i5;
                fl4Var6.f19104q = i6;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = fl4Var6;
            }
        }
        i28 |= 384;
        i31 = i6 & 8192;
        if (i31 != 0) {
            i33 = i28 | 3072;
        } else {
            i32 = i28;
            if ((i5 & 3072) == 0) {
                i33 = i32 | (ir1Var2.m6892h(z) ? 2048 : 1024);
            } else {
                i33 = i32;
            }
        }
        i34 = i6 & 16384;
        if (i34 != 0) {
            i35 = i33;
            if ((i5 & 24576) == 0) {
                i35 |= ir1Var2.m6886e(i2) ? 16384 : 8192;
            }
            i36 = i6 & 32768;
            if (i36 != 0) {
                i35 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (ir1Var2.m6886e(i3)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i35 |= i37;
            }
            if ((i6 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i17 = 8388608;
                }
                i35 |= i17;
            }
            if ((i20 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ir1Var2.m6871T(i20 & 1, z2)) {
                ir1Var2.m6876Y();
                if ((i4 & 1) != 0) {
                    if (i42 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i8 != 0) {
                        j9 = pb0.f27501h;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        j5 = bm4.f15419c;
                    }
                    if (i14 != 0) {
                        xm1Var2 = null;
                    }
                    if (i16 != 0) {
                        bm1Var3 = null;
                    } else {
                        bm1Var3 = bm1Var;
                    }
                    if (i19 != 0) {
                        j7 = bm4.f15419c;
                    } else {
                        j7 = j3;
                    }
                    if (i23 != 0) {
                        wi4Var3 = null;
                    } else {
                        wi4Var3 = wi4Var;
                    }
                    if (i26 != 0) {
                        j10 = bm4.f15419c;
                    } else {
                        j10 = j4;
                    }
                    if (i29 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i35 &= -29360129;
                        xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                    } else {
                        xl4Var3 = xl4Var;
                    }
                    wi4Var4 = wi4Var3;
                } else {
                    if (i42 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i8 != 0) {
                        j9 = pb0.f27501h;
                    } else {
                        j9 = j;
                    }
                    if (i11 != 0) {
                        j5 = bm4.f15419c;
                    }
                    if (i14 != 0) {
                        xm1Var2 = null;
                    }
                    if (i16 != 0) {
                        bm1Var3 = null;
                    } else {
                        bm1Var3 = bm1Var;
                    }
                    if (i19 != 0) {
                        j7 = bm4.f15419c;
                    } else {
                        j7 = j3;
                    }
                    if (i23 != 0) {
                        wi4Var3 = null;
                    } else {
                        wi4Var3 = wi4Var;
                    }
                    if (i26 != 0) {
                        j10 = bm4.f15419c;
                    } else {
                        j10 = j4;
                    }
                    if (i29 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        i35 &= -29360129;
                        xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                    } else {
                        xl4Var3 = xl4Var;
                    }
                    wi4Var4 = wi4Var3;
                }
                ir1Var2.m6913s();
                ir1Var2.m6885d0(-565217490);
                if (j9 != 16) {
                    i20 = i20;
                    jM12710b = j9;
                    z5 = false;
                } else {
                    ir1Var2.m6885d0(-565216717);
                    jM12710b = xl4Var3.m12710b();
                    if (jM12710b != 16) {
                        jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                    }
                    z5 = false;
                    ir1Var2.m6912r(false);
                }
                ir1Var2.m6912r(z5);
                r6 = z5;
                if (wi4Var4 != null) {
                    r6 = wi4Var4.f33412a;
                }
                bm1 bm1Var10 = bm1Var3;
                xl4 xl4Var10 = xl4Var3;
                bm1Var2 = bm1Var10;
                int i49 = i35 << 6;
                c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var10, jM12710b, j5, xm1Var2, bm1Var10, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016) | (i49 & 29360128) | ((i20 << 18) & 1879048192), 256);
                str2 = str;
                ir1Var = ir1Var2;
                xl4Var2 = xl4Var10;
                z3 = z4;
                i39 = i41;
                j8 = j10;
                r12 = i40;
                wi4Var2 = wi4Var4;
                j6 = j9;
            } else {
                str2 = str;
                ir1Var2.m6874W();
                j6 = j;
                bm1Var2 = bm1Var;
                j7 = j3;
                wi4Var2 = wi4Var;
                r12 = i;
                z3 = z;
                i38 = i2;
                i39 = i3;
                xl4Var2 = xl4Var;
                ir1Var = ir1Var2;
                j8 = j4;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                fl4 fl4Var7 = new fl4();
                fl4Var7.f19088a = str2;
                fl4Var7.f19089b = nt2Var2;
                fl4Var7.f19090c = j6;
                fl4Var7.f19091d = j5;
                fl4Var7.f19092e = xm1Var2;
                fl4Var7.f19093f = bm1Var2;
                fl4Var7.f19094g = j7;
                fl4Var7.f19095h = wi4Var2;
                fl4Var7.f19096i = j8;
                fl4Var7.f19097j = r12;
                fl4Var7.f19098k = z3;
                fl4Var7.f19099l = i38;
                fl4Var7.f19100m = i39;
                fl4Var7.f19101n = xl4Var2;
                fl4Var7.f19102o = i4;
                fl4Var7.f19103p = i5;
                fl4Var7.f19104q = i6;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = fl4Var7;
            }
        }
        i35 = i33 | 24576;
        i36 = i6 & 32768;
        if (i36 != 0) {
            i35 |= 196608;
        } else if ((i5 & 196608) == 0) {
            if (ir1Var2.m6886e(i3)) {
                i37 = 131072;
            } else {
                i37 = 65536;
            }
            i35 |= i37;
        }
        if ((i6 & 65536) != 0) {
            i35 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            i35 |= ir1Var2.m6894i(null) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) != 0) {
            if ((i6 & 131072) == 0) {
                i17 = 8388608;
            }
            i35 |= i17;
        }
        if ((i20 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (ir1Var2.m6871T(i20 & 1, z2)) {
            ir1Var2.m6876Y();
            if ((i4 & 1) != 0) {
                if (i42 != 0) {
                    nt2Var2 = kt2.f23428a;
                }
                if (i8 != 0) {
                    j9 = pb0.f27501h;
                } else {
                    j9 = j;
                }
                if (i11 != 0) {
                    j5 = bm4.f15419c;
                }
                if (i14 != 0) {
                    xm1Var2 = null;
                }
                if (i16 != 0) {
                    bm1Var3 = null;
                } else {
                    bm1Var3 = bm1Var;
                }
                if (i19 != 0) {
                    j7 = bm4.f15419c;
                } else {
                    j7 = j3;
                }
                if (i23 != 0) {
                    wi4Var3 = null;
                } else {
                    wi4Var3 = wi4Var;
                }
                if (i26 != 0) {
                    j10 = bm4.f15419c;
                } else {
                    j10 = j4;
                }
                if (i29 != 0) {
                    i40 = 1;
                } else {
                    i40 = i;
                }
                if (i31 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i34 != 0) {
                    i38 = Integer.MAX_VALUE;
                } else {
                    i38 = i2;
                }
                if (i36 == 0) {
                }
                if ((i6 & 131072) != 0) {
                    i35 &= -29360129;
                    xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                } else {
                    xl4Var3 = xl4Var;
                }
                wi4Var4 = wi4Var3;
            } else {
                if (i42 != 0) {
                    nt2Var2 = kt2.f23428a;
                }
                if (i8 != 0) {
                    j9 = pb0.f27501h;
                } else {
                    j9 = j;
                }
                if (i11 != 0) {
                    j5 = bm4.f15419c;
                }
                if (i14 != 0) {
                    xm1Var2 = null;
                }
                if (i16 != 0) {
                    bm1Var3 = null;
                } else {
                    bm1Var3 = bm1Var;
                }
                if (i19 != 0) {
                    j7 = bm4.f15419c;
                } else {
                    j7 = j3;
                }
                if (i23 != 0) {
                    wi4Var3 = null;
                } else {
                    wi4Var3 = wi4Var;
                }
                if (i26 != 0) {
                    j10 = bm4.f15419c;
                } else {
                    j10 = j4;
                }
                if (i29 != 0) {
                    i40 = 1;
                } else {
                    i40 = i;
                }
                if (i31 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i34 != 0) {
                    i38 = Integer.MAX_VALUE;
                } else {
                    i38 = i2;
                }
                if (i36 == 0) {
                }
                if ((i6 & 131072) != 0) {
                    i35 &= -29360129;
                    xl4Var3 = (xl4) ir1Var2.m6898k(f19869a);
                } else {
                    xl4Var3 = xl4Var;
                }
                wi4Var4 = wi4Var3;
            }
            ir1Var2.m6913s();
            ir1Var2.m6885d0(-565217490);
            if (j9 != 16) {
                i20 = i20;
                jM12710b = j9;
                z5 = false;
            } else {
                ir1Var2.m6885d0(-565216717);
                jM12710b = xl4Var3.m12710b();
                if (jM12710b != 16) {
                    jM12710b = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                }
                z5 = false;
                ir1Var2.m6912r(false);
            }
            ir1Var2.m6912r(z5);
            r6 = z5;
            if (wi4Var4 != null) {
                r6 = wi4Var4.f33412a;
            }
            bm1 bm1Var11 = bm1Var3;
            xl4 xl4Var11 = xl4Var3;
            bm1Var2 = bm1Var11;
            int i410 = i35 << 6;
            c20.m3807b(str, nt2Var2, xl4.m12709e(xl4Var11, jM12710b, j5, xm1Var2, bm1Var11, j7, r6 == true ? 1 : 0, j10, 16609104), i40, z4, i38, i41, ir1Var2, (i20 & 126) | ((i35 >> 9) & 7168) | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016) | (i410 & 29360128) | ((i20 << 18) & 1879048192), 256);
            str2 = str;
            ir1Var = ir1Var2;
            xl4Var2 = xl4Var11;
            z3 = z4;
            i39 = i41;
            j8 = j10;
            r12 = i40;
            wi4Var2 = wi4Var4;
            j6 = j9;
        } else {
            str2 = str;
            ir1Var2.m6874W();
            j6 = j;
            bm1Var2 = bm1Var;
            j7 = j3;
            wi4Var2 = wi4Var;
            r12 = i;
            z3 = z;
            i38 = i2;
            i39 = i3;
            xl4Var2 = xl4Var;
            ir1Var = ir1Var2;
            j8 = j4;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            fl4 fl4Var8 = new fl4();
            fl4Var8.f19088a = str2;
            fl4Var8.f19089b = nt2Var2;
            fl4Var8.f19090c = j6;
            fl4Var8.f19091d = j5;
            fl4Var8.f19092e = xm1Var2;
            fl4Var8.f19093f = bm1Var2;
            fl4Var8.f19094g = j7;
            fl4Var8.f19095h = wi4Var2;
            fl4Var8.f19096i = j8;
            fl4Var8.f19097j = r12;
            fl4Var8.f19098k = z3;
            fl4Var8.f19099l = i38;
            fl4Var8.f19100m = i39;
            fl4Var8.f19101n = xl4Var2;
            fl4Var8.f19102o = i4;
            fl4Var8.f19103p = i5;
            fl4Var8.f19104q = i6;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = fl4Var8;
        }
    }
}
