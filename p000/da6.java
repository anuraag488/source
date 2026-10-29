package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class da6 {

    /* JADX INFO: renamed from: b */
    public static final da6 f16886b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f16887a;

    static {
        da6 da6Var = new da6();
        da6Var.f16887a = new ConcurrentHashMap();
        VarHandle.storeStoreFence();
        f16886b = da6Var;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:201:0x0441  */
    /* JADX INFO: renamed from: a */
    public final na6 m4415a(Class cls) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int iCharAt3;
        int i4;
        int iCharAt4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        int i16;
        u36 u36Var;
        int i17;
        int iObjectFieldOffset;
        Class<?> cls2;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        Class<?> cls3;
        Field fieldM10567B;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field fieldM10567B2;
        Field fieldM10567B3;
        int i26;
        char cCharAt9;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        int i31;
        char cCharAt12;
        na6 na6Var;
        Class cls4 = cls;
        ConcurrentHashMap concurrentHashMap = this.f16887a;
        Object obj = concurrentHashMap.get(cls4);
        if (obj != null) {
            return (na6) obj;
        }
        pj5 pj5Var = ra6.f29122a;
        if (!s66.class.isAssignableFrom(cls4)) {
            int i32 = a46.f101a;
        }
        int i33 = a46.f101a;
        if (!s66.class.isAssignableFrom(cls4)) {
            C1077qn.m9987m("Unsupported message type: ".concat(cls4.getName()));
            return null;
        }
        try {
            int i34 = 3;
            la6 la6Var = (la6) s66.m10533m(cls4.asSubclass(s66.class)).mo3836j(3);
            int iCharAt5 = 0;
            if ((la6Var.f23901d & 2) == 2) {
                pj5 pj5Var2 = ra6.f29122a;
                u36 u36Var2 = la6Var.f23898a;
                v96 v96Var = new v96();
                v96Var.f32481a = u36Var2;
                VarHandle.storeStoreFence();
                na6Var = v96Var;
            } else {
                pj5 pj5Var3 = ra6.f29122a;
                Unsafe unsafe = s96.f30017j;
                if (unsafe == null) {
                    throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(la6Var instanceof la6)) {
                    xy4.m12778e();
                    return null;
                }
                u36 u36Var3 = la6Var.f23898a;
                String str = la6Var.f23899b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i35 = 1;
                    while (true) {
                        i = i35 + 1;
                        if (str.charAt(i35) < 55296) {
                            break;
                        }
                        i35 = i;
                    }
                } else {
                    i = 1;
                }
                int i36 = i + 1;
                int iCharAt6 = str.charAt(i);
                if (iCharAt6 >= 55296) {
                    int i37 = iCharAt6 & 8191;
                    int i38 = 13;
                    while (true) {
                        i31 = i36 + 1;
                        cCharAt12 = str.charAt(i36);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i37 |= (cCharAt12 & 8191) << i38;
                        i38 += 13;
                        i36 = i31;
                    }
                    iCharAt6 = i37 | (cCharAt12 << i38);
                    i36 = i31;
                }
                if (iCharAt6 == 0) {
                    iArr = s96.f30016i;
                    i34 = 3;
                    iCharAt4 = 0;
                    i6 = 0;
                    iCharAt3 = 0;
                    iCharAt = 0;
                    iCharAt2 = 0;
                    i5 = 0;
                } else {
                    int i39 = i36 + 1;
                    int iCharAt7 = str.charAt(i36);
                    if (iCharAt7 >= 55296) {
                        int i40 = iCharAt7 & 8191;
                        int i41 = 13;
                        while (true) {
                            i14 = i39 + 1;
                            cCharAt7 = str.charAt(i39);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i40 |= (cCharAt7 & 8191) << i41;
                            i41 += 13;
                            i39 = i14;
                        }
                        iCharAt7 = i40 | (cCharAt7 << i41);
                        i39 = i14;
                    }
                    int i42 = i39 + 1;
                    int iCharAt8 = str.charAt(i39);
                    if (iCharAt8 >= 55296) {
                        int i43 = iCharAt8 & 8191;
                        int i44 = 13;
                        while (true) {
                            i13 = i42 + 1;
                            cCharAt6 = str.charAt(i42);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i43 |= (cCharAt6 & 8191) << i44;
                            i44 += 13;
                            i42 = i13;
                        }
                        iCharAt8 = i43 | (cCharAt6 << i44);
                        i42 = i13;
                    }
                    int i45 = i42 + 1;
                    iCharAt = str.charAt(i42);
                    if (iCharAt >= 55296) {
                        int i46 = iCharAt & 8191;
                        int i47 = 13;
                        while (true) {
                            i12 = i45 + 1;
                            cCharAt5 = str.charAt(i45);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i46 |= (cCharAt5 & 8191) << i47;
                            i47 += 13;
                            i45 = i12;
                        }
                        iCharAt = i46 | (cCharAt5 << i47);
                        i45 = i12;
                    }
                    int i48 = i45 + 1;
                    iCharAt2 = str.charAt(i45);
                    if (iCharAt2 >= 55296) {
                        int i49 = iCharAt2 & 8191;
                        int i50 = i48;
                        int i51 = 13;
                        while (true) {
                            i11 = i50 + 1;
                            cCharAt4 = str.charAt(i50);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i49 |= (cCharAt4 & 8191) << i51;
                            i51 += 13;
                            i50 = i11;
                        }
                        iCharAt2 = i49 | (cCharAt4 << i51);
                        i2 = i11;
                    } else {
                        i2 = i48;
                    }
                    int i52 = i2 + 1;
                    iCharAt5 = str.charAt(i2);
                    if (iCharAt5 >= 55296) {
                        int i53 = iCharAt5 & 8191;
                        int i54 = i52;
                        int i55 = 13;
                        while (true) {
                            i10 = i54 + 1;
                            cCharAt3 = str.charAt(i54);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i53 |= (cCharAt3 & 8191) << i55;
                            i55 += 13;
                            i54 = i10;
                        }
                        iCharAt5 = i53 | (cCharAt3 << i55);
                        i3 = i10;
                    } else {
                        i3 = i52;
                    }
                    int i56 = i3 + 1;
                    iCharAt3 = str.charAt(i3);
                    if (iCharAt3 >= 55296) {
                        int i57 = iCharAt3 & 8191;
                        int i58 = i56;
                        int i59 = 13;
                        while (true) {
                            i9 = i58 + 1;
                            cCharAt2 = str.charAt(i58);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i57 |= (cCharAt2 & 8191) << i59;
                            i59 += 13;
                            i58 = i9;
                        }
                        iCharAt3 = i57 | (cCharAt2 << i59);
                        i4 = i9;
                    } else {
                        i4 = i56;
                    }
                    int i60 = i4 + 1;
                    if (str.charAt(i4) >= 55296) {
                        do {
                            i8 = i60;
                            i60 = i8 + 1;
                        } while (str.charAt(i8) >= 55296);
                    }
                    int i61 = i60;
                    int i62 = i61 + 1;
                    iCharAt4 = str.charAt(i61);
                    if (iCharAt4 >= 55296) {
                        int i63 = iCharAt4 & 8191;
                        int i64 = i62;
                        int i65 = 13;
                        while (true) {
                            i7 = i64 + 1;
                            cCharAt = str.charAt(i64);
                            if (cCharAt < 55296) {
                                break;
                            }
                            i63 |= (cCharAt & 8191) << i65;
                            i65 += 13;
                            i64 = i7;
                        }
                        iCharAt4 = i63 | (cCharAt << i65);
                        i62 = i7;
                    }
                    i5 = iCharAt7 + iCharAt7 + iCharAt8;
                    iArr = new int[iCharAt4 + iCharAt3 + iCharAt7];
                    i6 = iCharAt7;
                    i36 = i62;
                }
                Object[] objArr = la6Var.f23900c;
                Class<?> cls5 = u36Var3.getClass();
                int i66 = iCharAt3 + iCharAt4;
                int i67 = iCharAt5;
                int i68 = i6;
                int[] iArr2 = new int[i67 * 3];
                Object[] objArr2 = new Object[i67 + i67];
                int i69 = iCharAt4;
                int i70 = i66;
                int i71 = 0;
                int i72 = 0;
                while (i36 < length) {
                    int i73 = i36 + 1;
                    int iCharAt9 = str.charAt(i36);
                    int i74 = length;
                    if (iCharAt9 >= 55296) {
                        int i75 = iCharAt9 & 8191;
                        int i76 = i73;
                        int i77 = 13;
                        while (true) {
                            i29 = i76 + 1;
                            cCharAt11 = str.charAt(i76);
                            i30 = i75;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i75 = i30 | ((cCharAt11 & 8191) << i77);
                            i77 += 13;
                            i76 = i29;
                        }
                        iCharAt9 = i30 | (cCharAt11 << i77);
                        i15 = i29;
                    } else {
                        i15 = i73;
                    }
                    int i78 = i15 + 1;
                    int iCharAt10 = str.charAt(i15);
                    int i79 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i80 = iCharAt10 & 8191;
                        int i81 = i78;
                        int i82 = 13;
                        while (true) {
                            i27 = i81 + 1;
                            cCharAt10 = str.charAt(i81);
                            i28 = i80;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i80 = i28 | ((cCharAt10 & 8191) << i82);
                            i82 += 13;
                            i81 = i27;
                        }
                        iCharAt10 = i28 | (cCharAt10 << i82);
                        i36 = i27;
                    } else {
                        i36 = i78;
                    }
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i72] = i71;
                        i72++;
                    }
                    int i83 = iCharAt10 & 255;
                    int i84 = iCharAt10 & 2048;
                    if (i83 >= 51) {
                        int i85 = i36 + 1;
                        int iCharAt11 = str.charAt(i36);
                        char c = 55296;
                        if (iCharAt11 >= 55296) {
                            int i86 = iCharAt11 & 8191;
                            int i87 = i85;
                            int i88 = 13;
                            while (true) {
                                i26 = i87 + 1;
                                cCharAt9 = str.charAt(i87);
                                if (cCharAt9 < c) {
                                    break;
                                }
                                i86 |= (cCharAt9 & 8191) << i88;
                                i88 += 13;
                                i87 = i26;
                                c = 55296;
                            }
                            iCharAt11 = i86 | (cCharAt9 << i88);
                            i24 = i26;
                        } else {
                            i24 = i85;
                        }
                        int i89 = i24;
                        int i90 = i83 - 51;
                        int i91 = iCharAt11;
                        if (i90 == 9 || i90 == 17) {
                            objArr2[sk5.m10849o(i71, i34, 1)] = objArr[i5];
                            i25 = i84;
                            i5++;
                        } else if (i90 != 12) {
                            i25 = i84;
                        } else if (la6Var.m7890a() == 1 || i84 != 0) {
                            objArr2[sk5.m10849o(i71, i34, 1)] = objArr[i5];
                            i5++;
                            i25 = i84;
                        } else {
                            i25 = 0;
                        }
                        int i92 = i91 + i91;
                        int i93 = i25;
                        Object obj2 = objArr[i92];
                        if (obj2 instanceof Field) {
                            fieldM10567B2 = (Field) obj2;
                        } else {
                            fieldM10567B2 = s96.m10567B(cls5, (String) obj2);
                            objArr[i92] = fieldM10567B2;
                            iArr[i70] = i71;
                            i70++;
                        }
                        i16 = iCharAt4;
                        u36Var = u36Var3;
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM10567B2);
                        int i94 = i92 + 1;
                        Object obj3 = objArr[i94];
                        if (obj3 instanceof Field) {
                            fieldM10567B3 = (Field) obj3;
                        } else {
                            fieldM10567B3 = s96.m10567B(cls5, (String) obj3);
                            objArr[i94] = fieldM10567B3;
                        }
                        i83 = i83;
                        cls2 = cls5;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10567B3);
                        i36 = i89;
                        i19 = 0;
                        i17 = i5;
                        iObjectFieldOffset = iObjectFieldOffset3;
                        i18 = i93;
                    } else {
                        i16 = iCharAt4;
                        u36Var = u36Var3;
                        i17 = i5 + 1;
                        Field fieldM10567B4 = s96.m10567B(cls5, (String) objArr[i5]);
                        if (i83 == 9 || i83 == 17) {
                            objArr2[sk5.m10849o(i71, 3, 1)] = fieldM10567B4.getType();
                        } else {
                            if (i83 != 27) {
                                if (i83 == 49) {
                                    i23 = i5 + 2;
                                    i21 = 1;
                                    i22 = 3;
                                } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                                    i17 = i17;
                                    if (la6Var.m7890a() == 1 || i84 != 0) {
                                        i23 = i5 + 2;
                                        objArr2[sk5.m10849o(i71, 3, 1)] = objArr[i17];
                                        i17 = i23;
                                    } else {
                                        i84 = 0;
                                    }
                                } else if (i83 == 50) {
                                    int i95 = i5 + 2;
                                    int i96 = i69 + 1;
                                    iArr[i69] = i71;
                                    int i97 = i71 / 3;
                                    int i98 = i97 + i97;
                                    objArr2[i98] = objArr[i17];
                                    if (i84 != 0) {
                                        objArr2[i98 + 1] = objArr[i95];
                                        i69 = i96;
                                        i17 = i5 + 3;
                                    } else {
                                        i69 = i96;
                                        i84 = 0;
                                        i17 = i95;
                                    }
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10567B4);
                                if ((iCharAt10 & 4096) != 0 || i83 > 17) {
                                    i83 = i83;
                                    cls2 = cls5;
                                    iObjectFieldOffset = iObjectFieldOffset;
                                    iObjectFieldOffset2 = 1048575;
                                    i18 = i84;
                                    i19 = 0;
                                } else {
                                    int i99 = i36 + 1;
                                    int iCharAt12 = str.charAt(i36);
                                    if (iCharAt12 >= 55296) {
                                        int i100 = iCharAt12 & 8191;
                                        int i101 = 13;
                                        while (true) {
                                            i20 = i99 + 1;
                                            cCharAt8 = str.charAt(i99);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i100 |= (cCharAt8 & 8191) << i101;
                                            i101 += 13;
                                            i99 = i20;
                                        }
                                        iCharAt12 = i100 | (cCharAt8 << i101);
                                        i99 = i20;
                                    }
                                    int i102 = (iCharAt12 / 32) + i68 + i68;
                                    Object obj4 = objArr[i102];
                                    if (obj4 instanceof Field) {
                                        fieldM10567B = (Field) obj4;
                                        cls3 = cls5;
                                    } else {
                                        cls3 = cls5;
                                        fieldM10567B = s96.m10567B(cls3, (String) obj4);
                                        objArr[i102] = fieldM10567B;
                                    }
                                    i19 = iCharAt12 % 32;
                                    int i103 = i99;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10567B);
                                    cls2 = cls3;
                                    i36 = i103;
                                    i18 = i84;
                                }
                            } else {
                                i21 = 1;
                                i22 = 3;
                                i23 = i5 + 2;
                            }
                            objArr2[sk5.m10849o(i71, i22, i21)] = objArr[i17];
                            i17 = i23;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10567B4);
                            if ((iCharAt10 & 4096) != 0) {
                                i83 = i83;
                                cls2 = cls5;
                                iObjectFieldOffset = iObjectFieldOffset;
                                iObjectFieldOffset2 = 1048575;
                                i18 = i84;
                                i19 = 0;
                            } else {
                                i83 = i83;
                                cls2 = cls5;
                                iObjectFieldOffset = iObjectFieldOffset;
                                iObjectFieldOffset2 = 1048575;
                                i18 = i84;
                                i19 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10567B4);
                        if ((iCharAt10 & 4096) != 0) {
                            i83 = i83;
                            cls2 = cls5;
                            iObjectFieldOffset = iObjectFieldOffset;
                            iObjectFieldOffset2 = 1048575;
                            i18 = i84;
                            i19 = 0;
                        } else {
                            i83 = i83;
                            cls2 = cls5;
                            iObjectFieldOffset = iObjectFieldOffset;
                            iObjectFieldOffset2 = 1048575;
                            i18 = i84;
                            i19 = 0;
                        }
                    }
                    int i104 = i71 + 1;
                    iArr2[i71] = i79;
                    int i105 = i71 + 2;
                    Class<?> cls6 = cls2;
                    iArr2[i104] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i18 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset;
                    i71 += 3;
                    iArr2[i105] = (i19 << 20) | iObjectFieldOffset2;
                    concurrentHashMap = concurrentHashMap2;
                    length = i74;
                    cls5 = cls6;
                    i5 = i17;
                    u36Var3 = u36Var;
                    iCharAt4 = i16;
                    i34 = 3;
                }
                int i106 = iCharAt4;
                s96 s96Var = new s96();
                s96Var.f30018a = iArr2;
                s96Var.f30019b = objArr2;
                s96Var.f30020c = iCharAt;
                s96Var.f30021d = iCharAt2;
                s96Var.f30023f = iArr;
                s96Var.f30024g = i106;
                s96Var.f30025h = i66;
                s96Var.f30022e = u36Var3;
                VarHandle.storeStoreFence();
                cls4 = cls;
                concurrentHashMap = concurrentHashMap;
                na6Var = s96Var;
            }
            na6 na6Var2 = (na6) concurrentHashMap.putIfAbsent(cls4, na6Var);
            return na6Var2 != null ? na6Var2 : na6Var;
        } catch (Exception e) {
            xy4.m12785n("Unable to get message info for ".concat(cls4.getName()), e);
            return null;
        }
    }
}
