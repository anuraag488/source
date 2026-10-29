package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zp6 {

    /* JADX INFO: renamed from: c */
    public static final zp6 f36259c;

    /* JADX INFO: renamed from: a */
    public js1 f36260a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f36261b;

    static {
        zp6 zp6Var = new zp6();
        zp6Var.f36261b = new ConcurrentHashMap();
        int i = lm6.f24186a;
        up6[] up6VarArr = {wv1.f33758G, js1.f22554d};
        rr5 rr5Var = new rr5((byte) 17);
        rr5Var.f29555b = up6VarArr;
        VarHandle.storeStoreFence();
        js1 js1Var = new js1();
        Charset charset = ro6.f29484a;
        js1Var.f22555a = rr5Var;
        VarHandle.storeStoreFence();
        zp6Var.f36260a = js1Var;
        VarHandle.storeStoreFence();
        f36259c = zp6Var;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:202:0x03fa  */
    /* JADX INFO: renamed from: a */
    public final kq6 m13720a(Class cls) {
        ConcurrentHashMap concurrentHashMap;
        kq6 kq6Var;
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        int i10;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        int i14;
        bq6 bq6Var;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i15;
        int i16;
        int iObjectFieldOffset3;
        int i17;
        Field fieldM12359p;
        int i18;
        char cCharAt7;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldM12359p2;
        Field fieldM12359p3;
        int i23;
        char cCharAt8;
        int i24;
        char cCharAt9;
        int i25;
        int i26;
        char cCharAt10;
        int i27;
        int i28;
        char cCharAt11;
        Charset charset = ro6.f29484a;
        if (cls == null) {
            xy4.m12782k("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = this.f36261b;
        kq6 kq6Var2 = (kq6) concurrentHashMap2.get(cls);
        if (kq6Var2 != null) {
            return kq6Var2;
        }
        js1 js1Var = this.f36260a;
        js1Var.getClass();
        aj5 aj5Var = lq6.f24292a;
        if (!jo6.class.isAssignableFrom(cls)) {
            int i29 = lm6.f24186a;
        }
        bq6 bq6VarMo10415b = ((rr5) js1Var.f22555a).mo10415b(cls);
        int iCharAt3 = 0;
        if ((bq6VarMo10415b.f15512d & 2) == 2) {
            concurrentHashMap = concurrentHashMap2;
            int i30 = lm6.f24186a;
            aj5 aj5Var2 = lq6.f24292a;
            int i31 = xn6.f34473a;
            hm6 hm6Var = bq6VarMo10415b.f15509a;
            xp6 xp6Var = new xp6();
            xp6Var.f34524b = aj5Var2;
            xp6Var.f34523a = hm6Var;
            VarHandle.storeStoreFence();
            kq6Var = xp6Var;
        } else {
            int i32 = lm6.f24186a;
            int i33 = yp6.f35450a;
            int i34 = kp6.f23333a;
            aj5 aj5Var3 = lq6.f24292a;
            if (bq6VarMo10415b.m3661a() - 1 != 1) {
                int i35 = xn6.f34473a;
            }
            int i36 = tp6.f31320a;
            int[] iArr2 = wp6.f33586g;
            if (!(bq6VarMo10415b instanceof bq6)) {
                xy4.m12778e();
                return null;
            }
            hm6 hm6Var2 = bq6VarMo10415b.f15509a;
            String str = bq6VarMo10415b.f15510b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i37 = 1;
                while (true) {
                    i = i37 + 1;
                    if (str.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i;
                }
            } else {
                i = 1;
            }
            int i38 = i + 1;
            int iCharAt4 = str.charAt(i);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i28 = i38 + 1;
                    cCharAt11 = str.charAt(i38);
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt11 & 8191) << i40;
                    i40 += 13;
                    i38 = i28;
                }
                iCharAt4 = i39 | (cCharAt11 << i40);
                i38 = i28;
            }
            if (iCharAt4 == 0) {
                iCharAt = 0;
                iCharAt2 = 0;
                i3 = 0;
                iArr = wp6.f33586g;
                i4 = 0;
            } else {
                int i41 = i38 + 1;
                int iCharAt5 = str.charAt(i38);
                if (iCharAt5 >= 55296) {
                    int i42 = iCharAt5 & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        cCharAt6 = str.charAt(i41);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt6 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    iCharAt5 = i42 | (cCharAt6 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int iCharAt6 = str.charAt(i41);
                if (iCharAt6 >= 55296) {
                    int i45 = iCharAt6 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        cCharAt5 = str.charAt(i44);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt5 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    iCharAt6 = i45 | (cCharAt5 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                if (str.charAt(i44) >= 55296) {
                    while (true) {
                        i10 = i47 + 1;
                        if (str.charAt(i47) < 55296) {
                            break;
                        }
                        i47 = i10;
                    }
                    i47 = i10;
                }
                int i48 = i47 + 1;
                if (str.charAt(i47) >= 55296) {
                    while (true) {
                        i9 = i48 + 1;
                        if (str.charAt(i48) < 55296) {
                            break;
                        }
                        i48 = i9;
                    }
                    i48 = i9;
                }
                int i49 = i48 + 1;
                iCharAt = str.charAt(i48);
                if (iCharAt >= 55296) {
                    int i50 = iCharAt & 8191;
                    int i51 = 13;
                    while (true) {
                        i8 = i49 + 1;
                        cCharAt4 = str.charAt(i49);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt4 & 8191) << i51;
                        i51 += 13;
                        i49 = i8;
                    }
                    iCharAt = i50 | (cCharAt4 << i51);
                    i49 = i8;
                }
                int i52 = i49 + 1;
                iCharAt2 = str.charAt(i49);
                if (iCharAt2 >= 55296) {
                    int i53 = iCharAt2 & 8191;
                    int i54 = 13;
                    while (true) {
                        i7 = i52 + 1;
                        cCharAt3 = str.charAt(i52);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt3 & 8191) << i54;
                        i54 += 13;
                        i52 = i7;
                    }
                    iCharAt2 = i53 | (cCharAt3 << i54);
                    i52 = i7;
                }
                int i55 = i52 + 1;
                int iCharAt7 = str.charAt(i52);
                if (iCharAt7 >= 55296) {
                    int i56 = iCharAt7 & 8191;
                    int i57 = i55;
                    int i58 = 13;
                    while (true) {
                        i6 = i57 + 1;
                        cCharAt2 = str.charAt(i57);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i56 |= (cCharAt2 & 8191) << i58;
                        i58 += 13;
                        i57 = i6;
                    }
                    iCharAt7 = i56 | (cCharAt2 << i58);
                    i2 = i6;
                } else {
                    i2 = i55;
                }
                int i59 = i2 + 1;
                iCharAt3 = str.charAt(i2);
                if (iCharAt3 >= 55296) {
                    int i60 = iCharAt3 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i5 = i61 + 1;
                        cCharAt = str.charAt(i61);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i60 |= (cCharAt & 8191) << i62;
                        i62 += 13;
                        i61 = i5;
                    }
                    iCharAt3 = i60 | (cCharAt << i62);
                    i59 = i5;
                }
                int i63 = iCharAt3 + iCharAt2 + iCharAt7;
                i3 = iCharAt5 + iCharAt5 + iCharAt6;
                iArr = new int[i63];
                i4 = iCharAt5;
                i38 = i59;
            }
            Unsafe unsafe = wp6.f33587h;
            Object[] objArr = bq6VarMo10415b.f15511c;
            int i64 = i38;
            Class<?> cls2 = hm6Var2.getClass();
            int i65 = iCharAt + iCharAt;
            int i66 = i4;
            int[] iArr3 = new int[iCharAt * 3];
            Object[] objArr2 = new Object[i65];
            int i67 = i3;
            int i68 = iCharAt2 + iCharAt3;
            int i69 = i64;
            int i70 = i67;
            int i71 = iCharAt3;
            int i72 = 0;
            int i73 = 0;
            while (i69 < length) {
                int i74 = i69 + 1;
                int iCharAt8 = str.charAt(i69);
                int i75 = length;
                if (iCharAt8 >= 55296) {
                    int i76 = iCharAt8 & 8191;
                    int i77 = i74;
                    int i78 = 13;
                    while (true) {
                        i26 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        i27 = i76;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 = i27 | ((cCharAt10 & 8191) << i78);
                        i78 += 13;
                        i77 = i26;
                    }
                    iCharAt8 = i27 | (cCharAt10 << i78);
                    i13 = i26;
                } else {
                    i13 = i74;
                }
                int i79 = i13 + 1;
                int iCharAt9 = str.charAt(i13);
                int i80 = iCharAt8;
                if (iCharAt9 >= 55296) {
                    int i81 = iCharAt9 & 8191;
                    int i82 = i79;
                    int i83 = 13;
                    while (true) {
                        i24 = i82 + 1;
                        cCharAt9 = str.charAt(i82);
                        i25 = i81;
                        if (cCharAt9 < 55296) {
                            break;
                        }
                        i81 = i25 | ((cCharAt9 & 8191) << i83);
                        i83 += 13;
                        i82 = i24;
                    }
                    iCharAt9 = i25 | (cCharAt9 << i83);
                    i14 = i24;
                } else {
                    i14 = i79;
                }
                int i84 = i68;
                if ((iCharAt9 & 1024) != 0) {
                    iArr[i73] = i72;
                    i73++;
                }
                int i85 = iCharAt9 & 255;
                int i86 = iCharAt9 & 2048;
                if (i85 >= 51) {
                    int i87 = i14 + 1;
                    int iCharAt10 = str.charAt(i14);
                    char c = 55296;
                    if (iCharAt10 >= 55296) {
                        int i88 = iCharAt10 & 8191;
                        int i89 = i87;
                        int i90 = 13;
                        while (true) {
                            i23 = i89 + 1;
                            cCharAt8 = str.charAt(i89);
                            if (cCharAt8 < c) {
                                break;
                            }
                            i88 |= (cCharAt8 & 8191) << i90;
                            i90 += 13;
                            i89 = i23;
                            c = 55296;
                        }
                        iCharAt10 = i88 | (cCharAt8 << i90);
                        i21 = i23;
                    } else {
                        i21 = i87;
                    }
                    int i91 = i21;
                    int i92 = i85 - 51;
                    int i93 = iCharAt10;
                    if (i92 == 9 || i92 == 17) {
                        objArr2[sk5.m10849o(i72, 3, 1)] = objArr[i70];
                        i22 = i86;
                        i70++;
                    } else if (i92 != 12) {
                        i22 = i86;
                    } else if (bq6VarMo10415b.m3661a() == 1 || i86 != 0) {
                        objArr2[sk5.m10849o(i72, 3, 1)] = objArr[i70];
                        i70++;
                        i22 = i86;
                    } else {
                        i22 = 0;
                    }
                    int i94 = i93 + i93;
                    i86 = i22;
                    Object obj = objArr[i94];
                    if (obj instanceof Field) {
                        fieldM12359p2 = (Field) obj;
                    } else {
                        fieldM12359p2 = wp6.m12359p(cls2, (String) obj);
                        objArr[i94] = fieldM12359p2;
                    }
                    bq6Var = bq6VarMo10415b;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM12359p2);
                    int i95 = i94 + 1;
                    Object obj2 = objArr[i95];
                    if (obj2 instanceof Field) {
                        fieldM12359p3 = (Field) obj2;
                    } else {
                        fieldM12359p3 = wp6.m12359p(cls2, (String) obj2);
                        objArr[i95] = fieldM12359p3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM12359p3);
                    i15 = i91;
                    i17 = iObjectFieldOffset4;
                    i16 = 0;
                    concurrentHashMap2 = concurrentHashMap2;
                } else {
                    bq6Var = bq6VarMo10415b;
                    int i96 = i70 + 1;
                    Field fieldM12359p4 = wp6.m12359p(cls2, (String) objArr[i70]);
                    if (i85 == 9 || i85 == 17) {
                        objArr2[sk5.m10849o(i72, 3, 1)] = fieldM12359p4.getType();
                    } else {
                        if (i85 != 27) {
                            if (i85 == 49) {
                                i70 += 2;
                                i19 = 3;
                                i20 = 1;
                            } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                                concurrentHashMap2 = concurrentHashMap2;
                                if (bq6Var.m3661a() == 1 || i86 != 0) {
                                    i70 += 2;
                                    objArr2[sk5.m10849o(i72, 3, 1)] = objArr[i96];
                                } else {
                                    i70 = i96;
                                    i86 = 0;
                                }
                            } else if (i85 == 50) {
                                int i97 = i70 + 2;
                                i71++;
                                iArr[i71] = i72;
                                int i98 = i72 / 3;
                                int i99 = i98 + i98;
                                objArr2[i99] = objArr[i96];
                                if (i86 != 0) {
                                    i70 += 3;
                                    objArr2[i99 + 1] = objArr[i97];
                                } else {
                                    i70 = i97;
                                    i86 = 0;
                                }
                                concurrentHashMap2 = concurrentHashMap2;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12359p4);
                            if ((iCharAt9 & 4096) != 0 || i85 > 17) {
                                iObjectFieldOffset2 = 1048575;
                                i15 = i14;
                                i16 = 0;
                            } else {
                                int i100 = i14 + 1;
                                int iCharAt11 = str.charAt(i14);
                                if (iCharAt11 >= 55296) {
                                    int i101 = iCharAt11 & 8191;
                                    int i102 = 13;
                                    while (true) {
                                        i18 = i100 + 1;
                                        cCharAt7 = str.charAt(i100);
                                        if (cCharAt7 < 55296) {
                                            break;
                                        }
                                        i101 |= (cCharAt7 & 8191) << i102;
                                        i102 += 13;
                                        i100 = i18;
                                    }
                                    iCharAt11 = i101 | (cCharAt7 << i102);
                                    i100 = i18;
                                }
                                int i103 = (iCharAt11 / 32) + i66 + i66;
                                Object obj3 = objArr[i103];
                                if (obj3 instanceof Field) {
                                    fieldM12359p = (Field) obj3;
                                } else {
                                    fieldM12359p = wp6.m12359p(cls2, (String) obj3);
                                    objArr[i103] = fieldM12359p;
                                }
                                i15 = i100;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM12359p);
                                i16 = iCharAt11 % 32;
                            }
                            if (i85 >= 18 && i85 <= 49) {
                                iArr[i84] = iObjectFieldOffset;
                                i84++;
                            }
                            iObjectFieldOffset3 = iObjectFieldOffset2;
                            i17 = iObjectFieldOffset;
                        } else {
                            i19 = 3;
                            i20 = 1;
                            i70 += 2;
                        }
                        objArr2[sk5.m10849o(i72, i19, i20)] = objArr[i96];
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12359p4);
                        if ((iCharAt9 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i15 = i14;
                            i16 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i15 = i14;
                            i16 = 0;
                        }
                        if (i85 >= 18) {
                            iArr[i84] = iObjectFieldOffset;
                            i84++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                        i17 = iObjectFieldOffset;
                    }
                    i70 = i96;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12359p4);
                    if ((iCharAt9 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i14;
                        i16 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i14;
                        i16 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i84] = iObjectFieldOffset;
                        i84++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i17 = iObjectFieldOffset;
                }
                int i104 = i72 + 1;
                iArr3[i72] = i80;
                int i105 = i72 + 2;
                iArr3[i104] = ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 256) != 0 ? 268435456 : 0) | (i86 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | i17;
                i72 += 3;
                iArr3[i105] = (i16 << 20) | iObjectFieldOffset3;
                i69 = i15;
                i68 = i84;
                length = i75;
                concurrentHashMap2 = concurrentHashMap2;
                bq6VarMo10415b = bq6Var;
            }
            concurrentHashMap = concurrentHashMap2;
            wp6 wp6Var = new wp6();
            wp6Var.f33588a = iArr3;
            wp6Var.f33589b = objArr2;
            wp6Var.f33591d = iArr;
            wp6Var.f33592e = iCharAt3;
            wp6Var.f33593f = aj5Var3;
            wp6Var.f33590c = hm6Var2;
            VarHandle.storeStoreFence();
            kq6Var = wp6Var;
        }
        kq6 kq6Var3 = (kq6) concurrentHashMap.putIfAbsent(cls, kq6Var);
        return kq6Var3 != null ? kq6Var3 : kq6Var;
    }
}
