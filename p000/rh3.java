package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rh3 {

    /* JADX INFO: renamed from: c */
    public static final rh3 f29290c;

    /* JADX INFO: renamed from: a */
    public i50 f29291a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f29292b;

    static {
        rh3 rh3Var = new rh3();
        rh3Var.f29292b = new ConcurrentHashMap();
        i50 i50Var = new i50((byte) 13);
        byte[] bArr = l62.f23817a;
        VarHandle.storeStoreFence();
        rh3Var.f29291a = i50Var;
        VarHandle.storeStoreFence();
        f29290c = rh3Var;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x031a  */
    /* JADX WARN: Code duplicated, block: B:151:0x031d  */
    /* JADX WARN: Code duplicated, block: B:154:0x033a  */
    /* JADX WARN: Code duplicated, block: B:155:0x033d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0446  */
    /* JADX INFO: renamed from: a */
    public final gw3 m10338a(Class cls) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iCharAt;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        ConcurrentHashMap concurrentHashMap;
        gw3 gw3Var;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i23;
        int i24;
        Field fieldM10050E;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        Object obj;
        Field fieldM10050E2;
        int i28;
        Object obj2;
        Field fieldM10050E3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        int i32;
        char cCharAt11;
        int i33;
        int i34;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap2 = this.f29292b;
        Object obj3 = concurrentHashMap2.get(cls);
        if (obj3 != null) {
            return (gw3) obj3;
        }
        this.f29291a.getClass();
        Class cls2 = kw3.f23562a;
        if (!vr1.class.isAssignableFrom(cls)) {
            Class cls3 = AbstractC1176tb.f31045a;
            Class cls4 = kw3.f23562a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                C1077qn.m9987m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        Class cls5 = AbstractC1176tb.f31045a;
        if (!vr1.class.isAssignableFrom(cls)) {
            C1077qn.m9987m("Full runtime messages are not supported by this schema factory: ".concat(cls.getName()));
            return null;
        }
        if (!vr1.class.isAssignableFrom(cls)) {
            C1077qn.m9987m("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            rj3 rj3Var = (rj3) vr1.m11974c(cls.asSubclass(vr1.class)).mo3989b(3);
            int i35 = 0;
            if ((rj3Var.f29357d & 2) == 2) {
                ia5 ia5Var = kw3.f23563b;
                AbstractC1277w1 abstractC1277w1 = rj3Var.f29354a;
                ss2 ss2Var = new ss2();
                ss2Var.f30545b = ia5Var;
                ss2Var.f30544a = abstractC1277w1;
                VarHandle.storeStoreFence();
                concurrentHashMap = concurrentHashMap2;
                gw3Var = ss2Var;
            } else {
                ia5 ia5Var2 = kw3.f23563b;
                d55.m4376u(rj3Var.m10345a());
                Unsafe unsafe = qs2.f28750l;
                if (unsafe == null) {
                    throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(rj3Var instanceof rj3)) {
                    xy4.m12778e();
                    return null;
                }
                AbstractC1277w1 abstractC1277w2 = rj3Var.f29354a;
                String str = rj3Var.f29355b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i36 = 1;
                    while (true) {
                        i = i36 + 1;
                        if (str.charAt(i36) < 55296) {
                            break;
                        }
                        i36 = i;
                    }
                } else {
                    i = 1;
                }
                int i37 = i + 1;
                int iCharAt2 = str.charAt(i);
                if (iCharAt2 >= 55296) {
                    int i38 = iCharAt2 & 8191;
                    int i39 = 13;
                    while (true) {
                        i34 = i37 + 1;
                        cCharAt12 = str.charAt(i37);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i38 |= (cCharAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i34;
                    }
                    iCharAt2 = i38 | (cCharAt12 << i39);
                    i37 = i34;
                }
                if (iCharAt2 == 0) {
                    i12 = 0;
                    iCharAt = 0;
                    i10 = 0;
                    i11 = 0;
                    i9 = 0;
                    i8 = i37;
                    iArr = qs2.f28749k;
                    i7 = 0;
                } else {
                    int i40 = i37 + 1;
                    int iCharAt3 = str.charAt(i37);
                    if (iCharAt3 >= 55296) {
                        int i41 = iCharAt3 & 8191;
                        int i42 = 13;
                        while (true) {
                            i20 = i40 + 1;
                            cCharAt7 = str.charAt(i40);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i41 |= (cCharAt7 & 8191) << i42;
                            i42 += 13;
                            i40 = i20;
                        }
                        iCharAt3 = i41 | (cCharAt7 << i42);
                        i40 = i20;
                    }
                    int i43 = i40 + 1;
                    int iCharAt4 = str.charAt(i40);
                    if (iCharAt4 >= 55296) {
                        int i44 = iCharAt4 & 8191;
                        int i45 = 13;
                        while (true) {
                            i19 = i43 + 1;
                            cCharAt6 = str.charAt(i43);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i44 |= (cCharAt6 & 8191) << i45;
                            i45 += 13;
                            i43 = i19;
                        }
                        iCharAt4 = i44 | (cCharAt6 << i45);
                        i43 = i19;
                    }
                    int i46 = i43 + 1;
                    int iCharAt5 = str.charAt(i43);
                    if (iCharAt5 >= 55296) {
                        int i47 = iCharAt5 & 8191;
                        int i48 = i46;
                        int i49 = 13;
                        while (true) {
                            i18 = i48 + 1;
                            cCharAt5 = str.charAt(i48);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i47 |= (cCharAt5 & 8191) << i49;
                            i49 += 13;
                            i48 = i18;
                        }
                        iCharAt5 = i47 | (cCharAt5 << i49);
                        i2 = i18;
                    } else {
                        i2 = i46;
                    }
                    int i50 = i2 + 1;
                    int iCharAt6 = str.charAt(i2);
                    if (iCharAt6 >= 55296) {
                        int i51 = iCharAt6 & 8191;
                        int i52 = i50;
                        int i53 = 13;
                        while (true) {
                            i17 = i52 + 1;
                            cCharAt4 = str.charAt(i52);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i51 |= (cCharAt4 & 8191) << i53;
                            i53 += 13;
                            i52 = i17;
                        }
                        iCharAt6 = i51 | (cCharAt4 << i53);
                        i3 = i17;
                    } else {
                        i3 = i50;
                    }
                    int i54 = i3 + 1;
                    int iCharAt7 = str.charAt(i3);
                    if (iCharAt7 >= 55296) {
                        int i55 = iCharAt7 & 8191;
                        int i56 = i54;
                        int i57 = 13;
                        while (true) {
                            i16 = i56 + 1;
                            cCharAt3 = str.charAt(i56);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i55 |= (cCharAt3 & 8191) << i57;
                            i57 += 13;
                            i56 = i16;
                        }
                        iCharAt7 = i55 | (cCharAt3 << i57);
                        i4 = i16;
                    } else {
                        i4 = i54;
                    }
                    int i58 = i4 + 1;
                    int iCharAt8 = str.charAt(i4);
                    if (iCharAt8 >= 55296) {
                        int i59 = iCharAt8 & 8191;
                        int i60 = i58;
                        int i61 = 13;
                        while (true) {
                            i15 = i60 + 1;
                            cCharAt2 = str.charAt(i60);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i59 |= (cCharAt2 & 8191) << i61;
                            i61 += 13;
                            i60 = i15;
                        }
                        iCharAt8 = i59 | (cCharAt2 << i61);
                        i5 = i15;
                    } else {
                        i5 = i58;
                    }
                    int i62 = i5 + 1;
                    if (str.charAt(i5) >= 55296) {
                        do {
                            i14 = i62;
                            i62 = i14 + 1;
                        } while (str.charAt(i14) >= 55296);
                    }
                    int i63 = i62;
                    int i64 = i63 + 1;
                    iCharAt = str.charAt(i63);
                    if (iCharAt >= 55296) {
                        int i65 = iCharAt & 8191;
                        int i66 = i64;
                        int i67 = 13;
                        while (true) {
                            i13 = i66 + 1;
                            cCharAt = str.charAt(i66);
                            i6 = iCharAt6;
                            if (cCharAt < 55296) {
                                break;
                            }
                            i65 |= (cCharAt & 8191) << i67;
                            i67 += 13;
                            i66 = i13;
                            iCharAt6 = i6;
                        }
                        iCharAt = i65 | (cCharAt << i67);
                        i64 = i13;
                    } else {
                        i6 = iCharAt6;
                    }
                    i7 = (iCharAt3 * 2) + iCharAt4;
                    i8 = i64;
                    i9 = iCharAt7;
                    i10 = iCharAt3;
                    i35 = iCharAt5;
                    i11 = iCharAt8;
                    iArr = new int[iCharAt + iCharAt8 + iCharAt3];
                    i12 = i6;
                }
                Object[] objArr = rj3Var.f29356c;
                Class<?> cls6 = abstractC1277w2.getClass();
                int[] iArr2 = new int[i9 * 3];
                int i68 = i10;
                Object[] objArr2 = new Object[i9 * 2];
                int i69 = i11 + iCharAt;
                int i70 = iCharAt;
                int i71 = i7;
                int i72 = i69;
                int i73 = i8;
                int i74 = 0;
                int i75 = 0;
                while (i73 < length) {
                    int i76 = i73 + 1;
                    int iCharAt9 = str.charAt(i73);
                    int i77 = length;
                    if (iCharAt9 >= 55296) {
                        int i78 = iCharAt9 & 8191;
                        int i79 = i76;
                        int i80 = 13;
                        while (true) {
                            i32 = i79 + 1;
                            cCharAt11 = str.charAt(i79);
                            i33 = i78;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i78 = i33 | ((cCharAt11 & 8191) << i80);
                            i80 += 13;
                            i79 = i32;
                        }
                        iCharAt9 = i33 | (cCharAt11 << i80);
                        i21 = i32;
                    } else {
                        i21 = i76;
                    }
                    int i81 = i21 + 1;
                    int iCharAt10 = str.charAt(i21);
                    int i82 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i83 = iCharAt10 & 8191;
                        int i84 = i81;
                        int i85 = 13;
                        while (true) {
                            i30 = i84 + 1;
                            cCharAt10 = str.charAt(i84);
                            i31 = i83;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i83 = i31 | ((cCharAt10 & 8191) << i85);
                            i85 += 13;
                            i84 = i30;
                        }
                        iCharAt10 = i31 | (cCharAt10 << i85);
                        i22 = i30;
                    } else {
                        i22 = i81;
                    }
                    int i86 = iCharAt10 & 255;
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i74] = i75;
                        i74++;
                    }
                    ia5 ia5Var3 = ia5Var2;
                    if (i86 >= 51) {
                        int i87 = i22 + 1;
                        int iCharAt11 = str.charAt(i22);
                        char c = 55296;
                        if (iCharAt11 >= 55296) {
                            int i88 = iCharAt11 & 8191;
                            int i89 = 13;
                            while (true) {
                                i29 = i87 + 1;
                                cCharAt9 = str.charAt(i87);
                                if (cCharAt9 < c) {
                                    break;
                                }
                                i88 |= (cCharAt9 & 8191) << i89;
                                i89 += 13;
                                i87 = i29;
                                c = 55296;
                            }
                            iCharAt11 = i88 | (cCharAt9 << i89);
                            i87 = i29;
                        }
                        int i90 = i86 - 51;
                        i23 = i87;
                        if (i90 == 9 || i90 == 17) {
                            i26 = i71 + 1;
                            objArr2[((i75 / 3) * 2) + 1] = objArr[i71];
                        } else {
                            if (i90 == 12 && (d55.m4358c(rj3Var.m10345a(), 1) || (iCharAt10 & 2048) != 0)) {
                                i26 = i71 + 1;
                                objArr2[((i75 / 3) * 2) + 1] = objArr[i71];
                            }
                            i27 = iCharAt11 * 2;
                            obj = objArr[i27];
                            if (obj instanceof Field) {
                                fieldM10050E2 = (Field) obj;
                            } else {
                                fieldM10050E2 = qs2.m10050E(cls6, (String) obj);
                                objArr[i27] = fieldM10050E2;
                                iArr[i72] = i75;
                                i72++;
                            }
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM10050E2);
                            i28 = i27 + 1;
                            obj2 = objArr[i28];
                            if (obj2 instanceof Field) {
                                fieldM10050E3 = (Field) obj2;
                            } else {
                                fieldM10050E3 = qs2.m10050E(cls6, (String) obj2);
                                objArr[i28] = fieldM10050E3;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10050E3);
                            iObjectFieldOffset = iObjectFieldOffset3;
                            i24 = 0;
                            i69 = i69;
                        }
                        i71 = i26;
                        i27 = iCharAt11 * 2;
                        obj = objArr[i27];
                        if (obj instanceof Field) {
                            fieldM10050E2 = (Field) obj;
                        } else {
                            fieldM10050E2 = qs2.m10050E(cls6, (String) obj);
                            objArr[i27] = fieldM10050E2;
                            iArr[i72] = i75;
                            i72++;
                        }
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM10050E2);
                        i28 = i27 + 1;
                        obj2 = objArr[i28];
                        if (obj2 instanceof Field) {
                            fieldM10050E3 = (Field) obj2;
                        } else {
                            fieldM10050E3 = qs2.m10050E(cls6, (String) obj2);
                            objArr[i28] = fieldM10050E3;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10050E3);
                        iObjectFieldOffset = iObjectFieldOffset4;
                        i24 = 0;
                        i69 = i69;
                    } else {
                        int i91 = i71 + 1;
                        Field fieldM10050E4 = qs2.m10050E(cls6, (String) objArr[i71]);
                        if (i86 == 9 || i86 == 17) {
                            i69 = i69;
                            objArr2[((i75 / 3) * 2) + 1] = fieldM10050E4.getType();
                        } else {
                            if (i86 == 27 || i86 == 49) {
                                i69 = i69;
                                i71 += 2;
                                objArr2[((i75 / 3) * 2) + 1] = objArr[i91];
                            } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                                i69 = i69;
                                if (rj3Var.m10345a() == 1 || (iCharAt10 & 2048) != 0) {
                                    i71 += 2;
                                    objArr2[((i75 / 3) * 2) + 1] = objArr[i91];
                                }
                            } else if (i86 == 50) {
                                int i92 = i70 + 1;
                                iArr[i70] = i75;
                                int i93 = (i75 / 3) * 2;
                                int i94 = i71 + 2;
                                objArr2[i93] = objArr[i91];
                                i70 = i92;
                                if ((iCharAt10 & 2048) != 0) {
                                    objArr2[i93 + 1] = objArr[i94];
                                    i71 += 3;
                                } else {
                                    i71 = i94;
                                }
                            } else {
                                i69 = i69;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10050E4);
                            if ((iCharAt10 & 4096) != 0 || i86 > 17) {
                                iObjectFieldOffset2 = 1048575;
                                i23 = i22;
                                i24 = 0;
                            } else {
                                int i95 = i22 + 1;
                                int iCharAt12 = str.charAt(i22);
                                if (iCharAt12 >= 55296) {
                                    int i96 = iCharAt12 & 8191;
                                    int i97 = 13;
                                    while (true) {
                                        i25 = i95 + 1;
                                        cCharAt8 = str.charAt(i95);
                                        if (cCharAt8 < 55296) {
                                            break;
                                        }
                                        i96 |= (cCharAt8 & 8191) << i97;
                                        i97 += 13;
                                        i95 = i25;
                                    }
                                    iCharAt12 = i96 | (cCharAt8 << i97);
                                    i95 = i25;
                                }
                                int i98 = (iCharAt12 / 32) + (i68 * 2);
                                Object obj4 = objArr[i98];
                                if (obj4 instanceof Field) {
                                    fieldM10050E = (Field) obj4;
                                } else {
                                    fieldM10050E = qs2.m10050E(cls6, (String) obj4);
                                    objArr[i98] = fieldM10050E;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10050E);
                                i24 = iCharAt12 % 32;
                                i23 = i95;
                            }
                        }
                        i71 = i91;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10050E4);
                        if ((iCharAt10 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i23 = i22;
                            i24 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i23 = i22;
                            i24 = 0;
                        }
                    }
                    int i99 = i75 + 1;
                    iArr2[i75] = i82;
                    int i100 = i75 + 2;
                    int i101 = iObjectFieldOffset2;
                    iArr2[i99] = ((iCharAt10 & 256) != 0 ? 268435456 : 0) | ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i86 << 20) | iObjectFieldOffset;
                    i75 += 3;
                    iArr2[i100] = (i24 << 20) | i101;
                    concurrentHashMap2 = concurrentHashMap3;
                    length = i77;
                    i69 = i69;
                    cls6 = cls6;
                    ia5Var2 = ia5Var3;
                    i73 = i23;
                }
                concurrentHashMap = concurrentHashMap2;
                qs2 qs2Var = new qs2();
                qs2Var.f28751a = iArr2;
                qs2Var.f28752b = objArr2;
                qs2Var.f28753c = i35;
                qs2Var.f28754d = i12;
                qs2Var.f28756f = abstractC1277w2 instanceof vr1;
                qs2Var.f28757g = iArr;
                qs2Var.f28758h = iCharAt;
                qs2Var.f28759i = i69;
                qs2Var.f28760j = ia5Var2;
                qs2Var.f28755e = abstractC1277w2;
                VarHandle.storeStoreFence();
                gw3Var = qs2Var;
            }
            byte[] bArr = l62.f23817a;
            gw3 gw3Var2 = (gw3) concurrentHashMap.putIfAbsent(cls, gw3Var);
            return gw3Var2 != null ? gw3Var2 : gw3Var;
        } catch (Exception e) {
            xy4.m12785n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
