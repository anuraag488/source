package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bk6 {

    /* JADX INFO: renamed from: c */
    public static final bk6 f15375c;

    /* JADX INFO: renamed from: a */
    public ar3 f15376a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f15377b;

    static {
        bk6 bk6Var = new bk6();
        bk6Var.f15377b = new ConcurrentHashMap();
        nj6[] nj6VarArr = {ia5.f21206B, ar3.f14811i};
        rr5 rr5Var = new rr5((byte) 13);
        rr5Var.f29555b = nj6VarArr;
        VarHandle.storeStoreFence();
        ar3 ar3Var = new ar3((byte) 4);
        Charset charset = ni6.f25875a;
        ar3Var.f14813b = rr5Var;
        VarHandle.storeStoreFence();
        bk6Var.f15376a = ar3Var;
        VarHandle.storeStoreFence();
        f15375c = bk6Var;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:202:0x0447  */
    /* JADX WARN: Code duplicated, block: B:205:0x0452  */
    /* JADX WARN: Code duplicated, block: B:208:0x0462  */
    /* JADX INFO: renamed from: a */
    public final gk6 m3613a(Class cls) {
        gk6 gk6Var;
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int iCharAt4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        yj5 yj5Var;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldM11908u;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        Field fieldM11908u2;
        Field fieldM11908u3;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        int i31;
        char cCharAt12;
        int i32;
        int i33;
        char cCharAt13;
        Charset charset = ni6.f25875a;
        if (cls == null) {
            xy4.m12782k("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f15377b;
        gk6 gk6Var2 = (gk6) concurrentHashMap.get(cls);
        if (gk6Var2 != null) {
            return gk6Var2;
        }
        ar3 ar3Var = this.f15376a;
        ar3Var.getClass();
        yj5 yj5Var2 = jk6.f22377a;
        zh6.class.isAssignableFrom(cls);
        ek6 ek6VarMo6712c = ((rr5) ar3Var.f14813b).mo6712c(cls);
        if ((ek6VarMo6712c.f18194d & 2) == 2) {
            yj5 yj5Var3 = jk6.f22377a;
            int i34 = dh6.f17072a;
            ef6 ef6Var = ek6VarMo6712c.f18191a;
            wj6 wj6Var = new wj6();
            wj6Var.f33441b = yj5Var3;
            wj6Var.f33440a = ef6Var;
            VarHandle.storeStoreFence();
            gk6Var = wj6Var;
        } else {
            int i35 = yj6.f35293a;
            int i36 = xi6.f34309a;
            yj5 yj5Var4 = jk6.f22377a;
            if (ek6VarMo6712c.m5160a() - 1 != 1) {
                int i37 = dh6.f17072a;
            }
            int i38 = lj6.f24090a;
            int[] iArr2 = vj6.f32685j;
            if (!(ek6VarMo6712c instanceof ek6)) {
                xy4.m12778e();
                return null;
            }
            ef6 ef6Var2 = ek6VarMo6712c.f18191a;
            String str = ek6VarMo6712c.f18192b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i39 = 1;
                while (true) {
                    i = i39 + 1;
                    if (str.charAt(i39) < 55296) {
                        break;
                    }
                    i39 = i;
                }
            } else {
                i = 1;
            }
            int i40 = i + 1;
            int iCharAt5 = str.charAt(i);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i33 = i40 + 1;
                    cCharAt13 = str.charAt(i40);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt13 & 8191) << i42;
                    i42 += 13;
                    i40 = i33;
                }
                iCharAt5 = i41 | (cCharAt13 << i42);
                i40 = i33;
            }
            if (iCharAt5 == 0) {
                iCharAt4 = 0;
                i7 = 0;
                iCharAt = 0;
                iCharAt2 = 0;
                iCharAt3 = 0;
                i8 = 0;
                iArr = vj6.f32685j;
                i6 = 0;
            } else {
                int i43 = i40 + 1;
                int iCharAt6 = str.charAt(i40);
                if (iCharAt6 >= 55296) {
                    int i44 = iCharAt6 & 8191;
                    int i45 = 13;
                    while (true) {
                        i16 = i43 + 1;
                        cCharAt8 = str.charAt(i43);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i44 |= (cCharAt8 & 8191) << i45;
                        i45 += 13;
                        i43 = i16;
                    }
                    iCharAt6 = i44 | (cCharAt8 << i45);
                    i43 = i16;
                }
                int i46 = i43 + 1;
                int iCharAt7 = str.charAt(i43);
                if (iCharAt7 >= 55296) {
                    int i47 = iCharAt7 & 8191;
                    int i48 = 13;
                    while (true) {
                        i15 = i46 + 1;
                        cCharAt7 = str.charAt(i46);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i47 |= (cCharAt7 & 8191) << i48;
                        i48 += 13;
                        i46 = i15;
                    }
                    iCharAt7 = i47 | (cCharAt7 << i48);
                    i46 = i15;
                }
                int i49 = i46 + 1;
                iCharAt = str.charAt(i46);
                if (iCharAt >= 55296) {
                    int i50 = iCharAt & 8191;
                    int i51 = 13;
                    while (true) {
                        i14 = i49 + 1;
                        cCharAt6 = str.charAt(i49);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt6 & 8191) << i51;
                        i51 += 13;
                        i49 = i14;
                    }
                    iCharAt = i50 | (cCharAt6 << i51);
                    i49 = i14;
                }
                int i52 = i49 + 1;
                iCharAt2 = str.charAt(i49);
                if (iCharAt2 >= 55296) {
                    int i53 = iCharAt2 & 8191;
                    int i54 = 13;
                    while (true) {
                        i13 = i52 + 1;
                        cCharAt5 = str.charAt(i52);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt5 & 8191) << i54;
                        i54 += 13;
                        i52 = i13;
                    }
                    iCharAt2 = i53 | (cCharAt5 << i54);
                    i52 = i13;
                }
                int i55 = i52 + 1;
                iCharAt3 = str.charAt(i52);
                if (iCharAt3 >= 55296) {
                    int i56 = iCharAt3 & 8191;
                    int i57 = i55;
                    int i58 = 13;
                    while (true) {
                        i12 = i57 + 1;
                        cCharAt4 = str.charAt(i57);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i56 |= (cCharAt4 & 8191) << i58;
                        i58 += 13;
                        i57 = i12;
                    }
                    iCharAt3 = i56 | (cCharAt4 << i58);
                    i2 = i12;
                } else {
                    i2 = i55;
                }
                int i59 = i2 + 1;
                int iCharAt8 = str.charAt(i2);
                if (iCharAt8 >= 55296) {
                    int i60 = iCharAt8 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i11 = i61 + 1;
                        cCharAt3 = str.charAt(i61);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i60 |= (cCharAt3 & 8191) << i62;
                        i62 += 13;
                        i61 = i11;
                    }
                    iCharAt8 = i60 | (cCharAt3 << i62);
                    i3 = i11;
                } else {
                    i3 = i59;
                }
                int i63 = i3 + 1;
                int iCharAt9 = str.charAt(i3);
                if (iCharAt9 >= 55296) {
                    int i64 = iCharAt9 & 8191;
                    int i65 = i63;
                    int i66 = 13;
                    while (true) {
                        i10 = i65 + 1;
                        cCharAt2 = str.charAt(i65);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i64 |= (cCharAt2 & 8191) << i66;
                        i66 += 13;
                        i65 = i10;
                    }
                    iCharAt9 = i64 | (cCharAt2 << i66);
                    i4 = i10;
                } else {
                    i4 = i63;
                }
                int i67 = i4 + 1;
                iCharAt4 = str.charAt(i4);
                if (iCharAt4 >= 55296) {
                    int i68 = iCharAt4 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i9 = i69 + 1;
                        cCharAt = str.charAt(i69);
                        i5 = iCharAt8;
                        if (cCharAt < 55296) {
                            break;
                        }
                        i68 |= (cCharAt & 8191) << i70;
                        i70 += 13;
                        i69 = i9;
                        iCharAt8 = i5;
                    }
                    iCharAt4 = i68 | (cCharAt << i70);
                    i67 = i9;
                } else {
                    i5 = iCharAt8;
                }
                iArr = new int[iCharAt4 + i5 + iCharAt9];
                i6 = iCharAt6 + iCharAt6 + iCharAt7;
                i7 = iCharAt6;
                i40 = i67;
                i8 = i5;
            }
            Unsafe unsafe = vj6.f32686k;
            int i71 = i40;
            Object[] objArr = ek6VarMo6712c.f18193c;
            Class<?> cls2 = ef6Var2.getClass();
            int i72 = i7;
            int i73 = iCharAt4 + i8;
            int i74 = i6;
            int i75 = iCharAt3 + iCharAt3;
            int i76 = 3;
            int[] iArr3 = new int[iCharAt3 * 3];
            Object[] objArr2 = new Object[i75];
            int i77 = iCharAt4;
            int i78 = i73;
            int i79 = i71;
            int i80 = 0;
            int i81 = 0;
            while (i79 < length) {
                int i82 = i79 + 1;
                int iCharAt10 = str.charAt(i79);
                int i83 = length;
                if (iCharAt10 >= 55296) {
                    int i84 = iCharAt10 & 8191;
                    int i85 = i82;
                    int i86 = 13;
                    while (true) {
                        i31 = i85 + 1;
                        cCharAt12 = str.charAt(i85);
                        i32 = i84;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i84 = i32 | ((cCharAt12 & 8191) << i86);
                        i86 += 13;
                        i85 = i31;
                    }
                    iCharAt10 = i32 | (cCharAt12 << i86);
                    i17 = i31;
                } else {
                    i17 = i82;
                }
                int i87 = i17 + 1;
                int iCharAt11 = str.charAt(i17);
                int i88 = iCharAt10;
                if (iCharAt11 >= 55296) {
                    int i89 = iCharAt11 & 8191;
                    int i90 = i87;
                    int i91 = 13;
                    while (true) {
                        i29 = i90 + 1;
                        cCharAt11 = str.charAt(i90);
                        i30 = i89;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i89 = i30 | ((cCharAt11 & 8191) << i91);
                        i91 += 13;
                        i90 = i29;
                    }
                    iCharAt11 = i30 | (cCharAt11 << i91);
                    i18 = i29;
                } else {
                    i18 = i87;
                }
                ek6 ek6Var = ek6VarMo6712c;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i81] = i80;
                    i81++;
                }
                int i92 = iCharAt11 & 255;
                ef6 ef6Var3 = ef6Var2;
                int i93 = iCharAt11 & 2048;
                if (i92 >= 51) {
                    int i94 = i18 + 1;
                    int iCharAt12 = str.charAt(i18);
                    if (iCharAt12 >= 55296) {
                        int i95 = iCharAt12 & 8191;
                        int i96 = i94;
                        int i97 = 13;
                        while (true) {
                            i27 = i96 + 1;
                            cCharAt10 = str.charAt(i96);
                            i28 = i95;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i95 = i28 | ((cCharAt10 & 8191) << i97);
                            i97 += 13;
                            i96 = i27;
                        }
                        iCharAt12 = i28 | (cCharAt10 << i97);
                        i25 = i27;
                    } else {
                        i25 = i94;
                    }
                    int i98 = iCharAt12;
                    int i99 = i92 - 51;
                    int i100 = i25;
                    if (i99 == 9 || i99 == 17) {
                        objArr2[sk5.m10849o(i80, i76, 1)] = objArr[i74];
                        i26 = i93;
                        i74++;
                    } else if (i99 != 12) {
                        i26 = i93;
                    } else if (ek6Var.m5160a() == 1 || i93 != 0) {
                        objArr2[sk5.m10849o(i80, i76, 1)] = objArr[i74];
                        i74++;
                        i26 = i93;
                    } else {
                        i26 = 0;
                    }
                    int i101 = i98 + i98;
                    Object obj = objArr[i101];
                    int i102 = i26;
                    if (obj instanceof Field) {
                        fieldM11908u2 = (Field) obj;
                    } else {
                        fieldM11908u2 = vj6.m11908u(cls2, (String) obj);
                        objArr[i101] = fieldM11908u2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM11908u2);
                    int i103 = i101 + 1;
                    Object obj2 = objArr[i103];
                    if (obj2 instanceof Field) {
                        fieldM11908u3 = (Field) obj2;
                    } else {
                        fieldM11908u3 = vj6.m11908u(cls2, (String) obj2);
                        objArr[i103] = fieldM11908u3;
                    }
                    i73 = i73;
                    objArr2 = objArr2;
                    i19 = i100;
                    i21 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11908u3);
                    i22 = iObjectFieldOffset3;
                    i93 = i102;
                    yj5Var = yj5Var4;
                    iArr = iArr;
                } else {
                    int i104 = i74 + 1;
                    Field fieldM11908u4 = vj6.m11908u(cls2, (String) objArr[i74]);
                    yj5Var = yj5Var4;
                    if (i92 == 9 || i92 == 17) {
                        objArr2[sk5.m10849o(i80, 3, 1)] = fieldM11908u4.getType();
                    } else {
                        if (i92 != 27) {
                            if (i92 == 49) {
                                i74 += 2;
                                i23 = 3;
                                i24 = 1;
                            } else if (i92 == 12 || i92 == 30 || i92 == 44) {
                                i73 = i73;
                                if (ek6Var.m5160a() == 1 || i93 != 0) {
                                    i74 += 2;
                                    objArr2[sk5.m10849o(i80, 3, 1)] = objArr[i104];
                                    objArr2 = objArr2;
                                } else {
                                    objArr2 = objArr2;
                                    i74 = i104;
                                    i93 = 0;
                                }
                            } else if (i92 == 50) {
                                int i105 = i74 + 2;
                                i77++;
                                iArr[i77] = i80;
                                int i106 = i80 / 3;
                                int i107 = i106 + i106;
                                objArr2[i107] = objArr[i104];
                                if (i93 != 0) {
                                    i74 += 3;
                                    objArr2[i107 + 1] = objArr[i105];
                                } else {
                                    i74 = i105;
                                    i93 = 0;
                                }
                                i73 = i73;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11908u4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt11 & 4096) != 0 || i92 > 17) {
                                i19 = i18;
                                i20 = 0;
                            } else {
                                int i108 = i18 + 1;
                                int iCharAt13 = str.charAt(i18);
                                if (iCharAt13 >= 55296) {
                                    int i109 = iCharAt13 & 8191;
                                    int i110 = 13;
                                    while (true) {
                                        i19 = i108 + 1;
                                        cCharAt9 = str.charAt(i108);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i109 |= (cCharAt9 & 8191) << i110;
                                        i110 += 13;
                                        i108 = i19;
                                    }
                                    iCharAt13 = i109 | (cCharAt9 << i110);
                                } else {
                                    i19 = i108;
                                }
                                int i111 = (iCharAt13 / 32) + i72 + i72;
                                Object obj3 = objArr[i111];
                                if (obj3 instanceof Field) {
                                    fieldM11908u = (Field) obj3;
                                } else {
                                    fieldM11908u = vj6.m11908u(cls2, (String) obj3);
                                    objArr[i111] = fieldM11908u;
                                }
                                i20 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11908u);
                            }
                            if (i92 >= 18 || i92 > 49) {
                                i21 = i20;
                                i22 = iObjectFieldOffset;
                            } else {
                                iArr[i78] = iObjectFieldOffset;
                                i21 = i20;
                                i22 = iObjectFieldOffset;
                                i78++;
                            }
                        } else {
                            i23 = 3;
                            i24 = 1;
                            i74 += 2;
                        }
                        objArr2[sk5.m10849o(i80, i23, i24)] = objArr[i104];
                        objArr2 = objArr2;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11908u4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0) {
                            i19 = i18;
                            i20 = 0;
                        } else {
                            i19 = i18;
                            i20 = 0;
                        }
                        if (i92 >= 18) {
                            i21 = i20;
                            i22 = iObjectFieldOffset;
                        } else {
                            i21 = i20;
                            i22 = iObjectFieldOffset;
                        }
                    }
                    objArr2 = objArr2;
                    i74 = i104;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11908u4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i19 = i18;
                        i20 = 0;
                    } else {
                        i19 = i18;
                        i20 = 0;
                    }
                    if (i92 >= 18) {
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    } else {
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    }
                }
                int i112 = i80 + 1;
                iArr3[i80] = i88;
                int i113 = i80 + 2;
                iArr3[i112] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i93 != 0 ? Integer.MIN_VALUE : 0) | (i92 << 20) | i22;
                i80 += 3;
                iArr3[i113] = (i21 << 20) | iObjectFieldOffset2;
                iArr = iArr;
                objArr2 = objArr2;
                ek6VarMo6712c = ek6Var;
                length = i83;
                ef6Var2 = ef6Var3;
                yj5Var4 = yj5Var;
                i73 = i73;
                i79 = i19;
                i76 = 3;
            }
            vj6 vj6Var = new vj6();
            vj6Var.f32687a = iArr3;
            vj6Var.f32688b = objArr2;
            vj6Var.f32689c = iCharAt;
            vj6Var.f32690d = iCharAt2;
            vj6Var.f32692f = iArr;
            vj6Var.f32693g = iCharAt4;
            vj6Var.f32694h = i73;
            vj6Var.f32695i = yj5Var4;
            vj6Var.f32691e = ef6Var2;
            VarHandle.storeStoreFence();
            gk6Var = vj6Var;
        }
        Charset charset2 = ni6.f25875a;
        gk6 gk6Var3 = (gk6) concurrentHashMap.putIfAbsent(cls, gk6Var);
        return gk6Var3 != null ? gk6Var3 : gk6Var;
    }
}
