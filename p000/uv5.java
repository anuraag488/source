package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uv5 {

    /* JADX INFO: renamed from: b */
    public static final uv5 f32208b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f32209a;

    static {
        uv5 uv5Var = new uv5();
        uv5Var.f32209a = new ConcurrentHashMap();
        byte[] bArr = kr5.f23354a;
        VarHandle.storeStoreFence();
        f32208b = uv5Var;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0429  */
    /* JADX WARN: Code duplicated, block: B:213:0x047d  */
    /* JADX INFO: renamed from: a */
    public final zv5 m11661a(Class cls) {
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
        int[] iArr;
        int i11;
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
        zv5 zv5Var;
        int i21;
        int i22;
        int[] iArr2;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i23;
        int i24;
        int i25;
        Field fieldM9287v;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int i30;
        Field fieldM9287v2;
        Field fieldM9287v3;
        int i31;
        char cCharAt9;
        int i32;
        char cCharAt10;
        int i33;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.f32209a;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zv5) obj;
        }
        Class cls2 = aw5.f14921a;
        if (!ur1.class.isAssignableFrom(cls)) {
            Class cls3 = o36.f26319a;
            Class cls4 = aw5.f14921a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                C1077qn.m9987m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        Class cls5 = o36.f26319a;
        if (!ur1.class.isAssignableFrom(cls)) {
            C1077qn.m9987m("Full runtime messages are not supported by this schema factory: ".concat(cls.getName()));
            return null;
        }
        if (!ur1.class.isAssignableFrom(cls)) {
            C1077qn.m9987m("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            int i37 = 3;
            xv5 xv5Var = (xv5) ur1.m11627c(cls.asSubclass(ur1.class)).mo5307i(3);
            int iCharAt2 = 0;
            if ((xv5Var.f34651d & 2) == 2) {
                gb5 gb5Var = aw5.f14922b;
                iv5 iv5Var = xv5Var.f34648a;
                pu5 pu5Var = new pu5();
                pu5Var.f28014b = gb5Var;
                pu5Var.f28013a = iv5Var;
                VarHandle.storeStoreFence();
                zv5Var = pu5Var;
            } else {
                gb5 gb5Var2 = aw5.f14922b;
                Unsafe unsafe = ou5.f27133l;
                if (unsafe == null) {
                    throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(xv5Var instanceof xv5)) {
                    xy4.m12778e();
                    return null;
                }
                iv5 iv5Var2 = xv5Var.f34648a;
                String str = xv5Var.f34649b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i38 = 1;
                    while (true) {
                        i = i38 + 1;
                        if (str.charAt(i38) < 55296) {
                            break;
                        }
                        i38 = i;
                    }
                } else {
                    i = 1;
                }
                int i39 = i + 1;
                int iCharAt3 = str.charAt(i);
                if (iCharAt3 >= 55296) {
                    int i40 = iCharAt3 & 8191;
                    int i41 = 13;
                    while (true) {
                        i36 = i39 + 1;
                        cCharAt12 = str.charAt(i39);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i40 |= (cCharAt12 & 8191) << i41;
                        i41 += 13;
                        i39 = i36;
                    }
                    iCharAt3 = i40 | (cCharAt12 << i41);
                    i39 = i36;
                }
                if (iCharAt3 == 0) {
                    i37 = 3;
                    i7 = 0;
                    iCharAt = 0;
                    i12 = 0;
                    i10 = 0;
                    i9 = 0;
                    i8 = i39;
                    iArr = ou5.f27132k;
                    i11 = 0;
                } else {
                    int i42 = i39 + 1;
                    int iCharAt4 = str.charAt(i39);
                    if (iCharAt4 >= 55296) {
                        int i43 = iCharAt4 & 8191;
                        int i44 = 13;
                        while (true) {
                            i20 = i42 + 1;
                            cCharAt7 = str.charAt(i42);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i43 |= (cCharAt7 & 8191) << i44;
                            i44 += 13;
                            i42 = i20;
                        }
                        iCharAt4 = i43 | (cCharAt7 << i44);
                        i42 = i20;
                    }
                    int i45 = i42 + 1;
                    int iCharAt5 = str.charAt(i42);
                    if (iCharAt5 >= 55296) {
                        int i46 = iCharAt5 & 8191;
                        int i47 = 13;
                        while (true) {
                            i19 = i45 + 1;
                            cCharAt6 = str.charAt(i45);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i46 |= (cCharAt6 & 8191) << i47;
                            i47 += 13;
                            i45 = i19;
                        }
                        iCharAt5 = i46 | (cCharAt6 << i47);
                        i45 = i19;
                    }
                    int i48 = i45 + 1;
                    int iCharAt6 = str.charAt(i45);
                    if (iCharAt6 >= 55296) {
                        int i49 = iCharAt6 & 8191;
                        int i50 = i48;
                        int i51 = 13;
                        while (true) {
                            i18 = i50 + 1;
                            cCharAt5 = str.charAt(i50);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i49 |= (cCharAt5 & 8191) << i51;
                            i51 += 13;
                            i50 = i18;
                        }
                        iCharAt6 = i49 | (cCharAt5 << i51);
                        i2 = i18;
                    } else {
                        i2 = i48;
                    }
                    int i52 = i2 + 1;
                    iCharAt2 = str.charAt(i2);
                    if (iCharAt2 >= 55296) {
                        int i53 = iCharAt2 & 8191;
                        int i54 = i52;
                        int i55 = 13;
                        while (true) {
                            i17 = i54 + 1;
                            cCharAt4 = str.charAt(i54);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i53 |= (cCharAt4 & 8191) << i55;
                            i55 += 13;
                            i54 = i17;
                        }
                        iCharAt2 = i53 | (cCharAt4 << i55);
                        i3 = i17;
                    } else {
                        i3 = i52;
                    }
                    int i56 = i3 + 1;
                    int iCharAt7 = str.charAt(i3);
                    if (iCharAt7 >= 55296) {
                        int i57 = iCharAt7 & 8191;
                        int i58 = i56;
                        int i59 = 13;
                        while (true) {
                            i16 = i58 + 1;
                            cCharAt3 = str.charAt(i58);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i57 |= (cCharAt3 & 8191) << i59;
                            i59 += 13;
                            i58 = i16;
                        }
                        iCharAt7 = i57 | (cCharAt3 << i59);
                        i4 = i16;
                    } else {
                        i4 = i56;
                    }
                    int i60 = i4 + 1;
                    int iCharAt8 = str.charAt(i4);
                    if (iCharAt8 >= 55296) {
                        int i61 = iCharAt8 & 8191;
                        int i62 = i60;
                        int i63 = 13;
                        while (true) {
                            i15 = i62 + 1;
                            cCharAt2 = str.charAt(i62);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i61 |= (cCharAt2 & 8191) << i63;
                            i63 += 13;
                            i62 = i15;
                        }
                        iCharAt8 = i61 | (cCharAt2 << i63);
                        i5 = i15;
                    } else {
                        i5 = i60;
                    }
                    int i64 = i5 + 1;
                    if (str.charAt(i5) >= 55296) {
                        do {
                            i14 = i64;
                            i64 = i14 + 1;
                        } while (str.charAt(i14) >= 55296);
                    }
                    int i65 = i64;
                    int i66 = i65 + 1;
                    iCharAt = str.charAt(i65);
                    if (iCharAt >= 55296) {
                        int i67 = iCharAt & 8191;
                        int i68 = i66;
                        int i69 = 13;
                        while (true) {
                            i13 = i68 + 1;
                            cCharAt = str.charAt(i68);
                            i6 = iCharAt8;
                            if (cCharAt < 55296) {
                                break;
                            }
                            i67 |= (cCharAt & 8191) << i69;
                            i69 += 13;
                            i68 = i13;
                            iCharAt8 = i6;
                        }
                        iCharAt = i67 | (cCharAt << i69);
                        i66 = i13;
                    } else {
                        i6 = iCharAt8;
                    }
                    i7 = iCharAt6;
                    i8 = i66;
                    i9 = i6;
                    i10 = iCharAt7;
                    iArr = new int[iCharAt + i6 + iCharAt4];
                    i11 = iCharAt4 + iCharAt4 + iCharAt5;
                    i12 = iCharAt4;
                }
                Object[] objArr = xv5Var.f34650c;
                Class<?> cls6 = iv5Var2.getClass();
                int i70 = iCharAt + i9;
                int i71 = i12;
                int i72 = i10 + i10;
                int[] iArr3 = new int[i10 * 3];
                Object[] objArr2 = new Object[i72];
                int i73 = i8;
                int i74 = i11;
                int i75 = i73;
                int i76 = iCharAt;
                int i77 = i70;
                int i78 = 0;
                int i79 = 0;
                while (i75 < length) {
                    int i80 = i75 + 1;
                    int iCharAt9 = str.charAt(i75);
                    int i81 = length;
                    if (iCharAt9 >= 55296) {
                        int i82 = iCharAt9 & 8191;
                        int i83 = i80;
                        int i84 = 13;
                        while (true) {
                            i34 = i83 + 1;
                            cCharAt11 = str.charAt(i83);
                            i35 = i82;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i82 = i35 | ((cCharAt11 & 8191) << i84);
                            i84 += 13;
                            i83 = i34;
                        }
                        iCharAt9 = i35 | (cCharAt11 << i84);
                        i21 = i34;
                    } else {
                        i21 = i80;
                    }
                    int i85 = i21 + 1;
                    int iCharAt10 = str.charAt(i21);
                    int i86 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i87 = iCharAt10 & 8191;
                        int i88 = i85;
                        int i89 = 13;
                        while (true) {
                            i32 = i88 + 1;
                            cCharAt10 = str.charAt(i88);
                            i33 = i87;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i87 = i33 | ((cCharAt10 & 8191) << i89);
                            i89 += 13;
                            i88 = i32;
                        }
                        iCharAt10 = i33 | (cCharAt10 << i89);
                        i22 = i32;
                    } else {
                        i22 = i85;
                    }
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i79] = i78;
                        i79++;
                    }
                    int i90 = iCharAt10 & 255;
                    gb5 gb5Var3 = gb5Var2;
                    int i91 = iCharAt10 & 2048;
                    if (i90 >= 51) {
                        int i92 = i22 + 1;
                        int iCharAt11 = str.charAt(i22);
                        char c = 55296;
                        if (iCharAt11 >= 55296) {
                            int i93 = iCharAt11 & 8191;
                            int i94 = i92;
                            int i95 = 13;
                            while (true) {
                                i31 = i94 + 1;
                                cCharAt9 = str.charAt(i94);
                                if (cCharAt9 < c) {
                                    break;
                                }
                                i93 |= (cCharAt9 & 8191) << i95;
                                i95 += 13;
                                i94 = i31;
                                c = 55296;
                            }
                            iCharAt11 = i93 | (cCharAt9 << i95);
                            i29 = i31;
                        } else {
                            i29 = i92;
                        }
                        int i96 = i29;
                        int i97 = i90 - 51;
                        int i98 = iCharAt11;
                        if (i97 == 9 || i97 == 17) {
                            objArr2[sk5.m10849o(i78, i37, 1)] = objArr[i74];
                            i30 = i91;
                            i74++;
                        } else if (i97 != 12) {
                            i30 = i91;
                        } else if (xv5Var.m12767a() == 1 || i91 != 0) {
                            objArr2[sk5.m10849o(i78, i37, 1)] = objArr[i74];
                            i74++;
                            i30 = i91;
                        } else {
                            i30 = 0;
                        }
                        int i99 = i98 + i98;
                        int i100 = i30;
                        Object obj2 = objArr[i99];
                        if (obj2 instanceof Field) {
                            fieldM9287v2 = (Field) obj2;
                        } else {
                            fieldM9287v2 = ou5.m9287v(cls6, (String) obj2);
                            objArr[i99] = fieldM9287v2;
                            iArr[i77] = i78;
                            i77++;
                        }
                        iArr2 = iArr;
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM9287v2);
                        int i101 = i99 + 1;
                        Object obj3 = objArr[i101];
                        if (obj3 instanceof Field) {
                            fieldM9287v3 = (Field) obj3;
                        } else {
                            fieldM9287v3 = ou5.m9287v(cls6, (String) obj3);
                            objArr[i101] = fieldM9287v3;
                        }
                        i70 = i70;
                        iObjectFieldOffset = iObjectFieldOffset3;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9287v3);
                        objArr2 = objArr2;
                        i24 = i100;
                        i23 = i96;
                        i25 = 0;
                    } else {
                        iArr2 = iArr;
                        int i102 = i74 + 1;
                        Field fieldM9287v4 = ou5.m9287v(cls6, (String) objArr[i74]);
                        if (i90 == 9 || i90 == 17) {
                            objArr2[sk5.m10849o(i78, 3, 1)] = fieldM9287v4.getType();
                        } else {
                            if (i90 != 27) {
                                if (i90 == 49) {
                                    i74 += 2;
                                    i27 = 3;
                                    i28 = 1;
                                } else if (i90 == 12 || i90 == 30 || i90 == 44) {
                                    i70 = i70;
                                    if (xv5Var.m12767a() == 1 || i91 != 0) {
                                        i74 += 2;
                                        objArr2[sk5.m10849o(i78, 3, 1)] = objArr[i102];
                                        objArr2 = objArr2;
                                    } else {
                                        objArr2 = objArr2;
                                        i74 = i102;
                                        i91 = 0;
                                    }
                                } else if (i90 == 50) {
                                    int i103 = i74 + 2;
                                    i76++;
                                    iArr2[i76] = i78;
                                    int i104 = i78 / 3;
                                    int i105 = i104 + i104;
                                    objArr2[i105] = objArr[i102];
                                    if (i91 != 0) {
                                        i74 += 3;
                                        objArr2[i105 + 1] = objArr[i103];
                                    } else {
                                        i74 = i103;
                                        i91 = 0;
                                    }
                                    i70 = i70;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9287v4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & 4096) != 0 || i90 > 17) {
                                    i23 = i22;
                                    i24 = i91;
                                    i25 = 0;
                                } else {
                                    i23 = i22 + 1;
                                    int iCharAt12 = str.charAt(i22);
                                    if (iCharAt12 >= 55296) {
                                        int i106 = iCharAt12 & 8191;
                                        int i107 = 13;
                                        while (true) {
                                            i26 = i23 + 1;
                                            cCharAt8 = str.charAt(i23);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i106 |= (cCharAt8 & 8191) << i107;
                                            i107 += 13;
                                            i23 = i26;
                                        }
                                        iCharAt12 = i106 | (cCharAt8 << i107);
                                        i23 = i26;
                                    }
                                    int i108 = (iCharAt12 / 32) + i71 + i71;
                                    Object obj4 = objArr[i108];
                                    if (obj4 instanceof Field) {
                                        fieldM9287v = (Field) obj4;
                                    } else {
                                        fieldM9287v = ou5.m9287v(cls6, (String) obj4);
                                        objArr[i108] = fieldM9287v;
                                    }
                                    i25 = iCharAt12 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9287v);
                                    i24 = i91;
                                }
                            } else {
                                i27 = 3;
                                i28 = 1;
                                i74 += 2;
                            }
                            objArr2[sk5.m10849o(i78, i27, i28)] = objArr[i102];
                            objArr2 = objArr2;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9287v4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0) {
                                i23 = i22;
                                i24 = i91;
                                i25 = 0;
                            } else {
                                i23 = i22;
                                i24 = i91;
                                i25 = 0;
                            }
                        }
                        objArr2 = objArr2;
                        i74 = i102;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9287v4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                            i23 = i22;
                            i24 = i91;
                            i25 = 0;
                        } else {
                            i23 = i22;
                            i24 = i91;
                            i25 = 0;
                        }
                    }
                    int i109 = i78 + 1;
                    iArr3[i78] = i86;
                    int i110 = i78 + 2;
                    iArr3[i109] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i24 != 0 ? Integer.MIN_VALUE : 0) | (i90 << 20) | iObjectFieldOffset;
                    i78 += 3;
                    iArr3[i110] = (i25 << 20) | iObjectFieldOffset2;
                    i75 = i23;
                    objArr2 = objArr2;
                    gb5Var2 = gb5Var3;
                    length = i81;
                    i70 = i70;
                    iArr = iArr2;
                    i37 = 3;
                }
                ou5 ou5Var = new ou5();
                ou5Var.f27134a = iArr3;
                ou5Var.f27135b = objArr2;
                ou5Var.f27136c = i7;
                ou5Var.f27137d = iCharAt2;
                ou5Var.f27139f = iv5Var2 instanceof ur1;
                ou5Var.f27140g = iArr;
                ou5Var.f27141h = iCharAt;
                ou5Var.f27142i = i70;
                ou5Var.f27143j = gb5Var2;
                ou5Var.f27138e = iv5Var2;
                VarHandle.storeStoreFence();
                zv5Var = ou5Var;
            }
            byte[] bArr = kr5.f23354a;
            zv5 zv5Var2 = (zv5) concurrentHashMap.putIfAbsent(cls, zv5Var);
            return zv5Var2 != null ? zv5Var2 : zv5Var;
        } catch (Exception e) {
            xy4.m12785n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
