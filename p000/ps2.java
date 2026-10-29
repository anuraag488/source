package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ps2 implements fw3 {

    /* JADX INFO: renamed from: n */
    public static final int[] f27932n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f27933o;

    /* JADX INFO: renamed from: a */
    public int[] f27934a;

    /* JADX INFO: renamed from: b */
    public Object[] f27935b;

    /* JADX INFO: renamed from: c */
    public int f27936c;

    /* JADX INFO: renamed from: d */
    public int f27937d;

    /* JADX INFO: renamed from: e */
    public AbstractC1240v1 f27938e;

    /* JADX INFO: renamed from: f */
    public boolean f27939f;

    /* JADX INFO: renamed from: g */
    public int[] f27940g;

    /* JADX INFO: renamed from: h */
    public int f27941h;

    /* JADX INFO: renamed from: i */
    public int f27942i;

    /* JADX INFO: renamed from: j */
    public t03 f27943j;

    /* JADX INFO: renamed from: k */
    public ul2 f27944k;

    /* JADX INFO: renamed from: l */
    public pu4 f27945l;

    /* JADX INFO: renamed from: m */
    public zp2 f27946m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f27933o = unsafe;
    }

    /* JADX INFO: renamed from: A */
    public static long m9632A(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: B */
    public static int m9633B(long j, Object obj) {
        return ((Integer) cv4.m4183j(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: C */
    public static long m9634C(long j, Object obj) {
        return ((Long) cv4.m4183j(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: I */
    public static Field m9635I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM10844j = sk5.m10844j("Field ", str, " for ");
            sbM10844j.append(cls.getName());
            sbM10844j.append(" not found. Known fields are ");
            xy4.m12786o(sbM10844j, Arrays.toString(declaredFields), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: O */
    public static int m9636O(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: l */
    public static void m9637l(Object obj) {
        if (m9638s(obj)) {
            return;
        }
        wb1.m12195o(obj, "Mutating immutable message: ");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9638s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof tr1) {
            return ((tr1) obj).m11107o();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0274  */
    /* JADX WARN: Code duplicated, block: B:126:0x027a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x0295  */
    /* JADX WARN: Code duplicated, block: B:168:0x034b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0395  */
    /* JADX WARN: Code duplicated, block: B:186:0x039f  */
    /* JADX INFO: renamed from: z */
    public static ps2 m9639z(qj3 qj3Var, t03 t03Var, ul2 ul2Var, pu4 pu4Var, sc1 sc1Var, zp2 zp2Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int i2;
        int[] iArr;
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        int i6;
        char cCharAt4;
        int i7;
        char cCharAt5;
        int i8;
        char cCharAt6;
        int i9;
        char cCharAt7;
        int i10;
        char cCharAt8;
        int i11;
        int i12;
        int i13;
        int i14;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i15;
        int i16;
        int iObjectFieldOffset3;
        Field fieldM9635I;
        char cCharAt9;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj;
        Field fieldM9635I2;
        int i21;
        Object obj2;
        Field fieldM9635I3;
        int i22;
        char cCharAt10;
        int i23;
        int i24;
        char cCharAt11;
        int i25;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        if (!(qj3Var instanceof qj3)) {
            xy4.m12778e();
            return null;
        }
        AbstractC1240v1 abstractC1240v1 = qj3Var.f28526a;
        String str = qj3Var.f28527b;
        int length = str.length();
        int i28 = 0;
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt6 = str.charAt(i);
        if (iCharAt6 >= 55296) {
            int i31 = iCharAt6 & 8191;
            int i32 = 13;
            while (true) {
                i27 = i30 + 1;
                cCharAt13 = str.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i27;
            }
            iCharAt6 = i31 | (cCharAt13 << i32);
            i30 = i27;
        }
        if (iCharAt6 == 0) {
            iArr = f27932n;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            i2 = 0;
            iCharAt5 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt7 = str.charAt(i30);
            if (iCharAt7 >= 55296) {
                int i34 = iCharAt7 & 8191;
                int i35 = 13;
                while (true) {
                    i10 = i33 + 1;
                    cCharAt8 = str.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i10;
                }
                iCharAt7 = i34 | (cCharAt8 << i35);
                i33 = i10;
            }
            int i36 = i33 + 1;
            int iCharAt8 = str.charAt(i33);
            if (iCharAt8 >= 55296) {
                int i37 = iCharAt8 & 8191;
                int i38 = 13;
                while (true) {
                    i9 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i9;
                }
                iCharAt8 = i37 | (cCharAt7 << i38);
                i36 = i9;
            }
            int i39 = i36 + 1;
            iCharAt = str.charAt(i36);
            if (iCharAt >= 55296) {
                int i40 = iCharAt & 8191;
                int i41 = 13;
                while (true) {
                    i8 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i8;
                }
                iCharAt = i40 | (cCharAt6 << i41);
                i39 = i8;
            }
            int i42 = i39 + 1;
            iCharAt2 = str.charAt(i39);
            if (iCharAt2 >= 55296) {
                int i43 = iCharAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i7 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i7;
                }
                iCharAt2 = i43 | (cCharAt5 << i44);
                i42 = i7;
            }
            int i45 = i42 + 1;
            iCharAt3 = str.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i6 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i6;
                }
                iCharAt3 = i46 | (cCharAt4 << i47);
                i45 = i6;
            }
            int i48 = i45 + 1;
            iCharAt4 = str.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i5 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i5;
                }
                iCharAt4 = i49 | (cCharAt3 << i50);
                i48 = i5;
            }
            int i51 = i48 + 1;
            int iCharAt9 = str.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i4 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i4;
                }
                iCharAt9 = i52 | (cCharAt2 << i53);
                i51 = i4;
            }
            int i54 = i51 + 1;
            iCharAt5 = str.charAt(i51);
            if (iCharAt5 >= 55296) {
                int i55 = iCharAt5 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i3 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i56 = i3;
                }
                iCharAt5 = i55 | (cCharAt << i57);
                i54 = i3;
            }
            int[] iArr2 = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i2 = (iCharAt7 * 2) + iCharAt8;
            iArr = iArr2;
            i28 = iCharAt7;
            i30 = i54;
        }
        Object[] objArr = qj3Var.f28528c;
        Class<?> cls = abstractC1240v1.getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr2 = new Object[iCharAt3 * 2];
        int i58 = iCharAt4 + iCharAt5;
        int i59 = i58;
        int i60 = iCharAt5;
        int i61 = 0;
        int i62 = 0;
        while (i30 < length) {
            int i63 = i30 + 1;
            int iCharAt10 = str.charAt(i30);
            if (iCharAt10 >= 55296) {
                int i64 = iCharAt10 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i26 = i65 + 1;
                    cCharAt12 = str.charAt(i65);
                    i11 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt12 & 8191) << i66;
                    i66 += 13;
                    i65 = i26;
                    length = i11;
                }
                iCharAt10 = i64 | (cCharAt12 << i66);
                i12 = i26;
            } else {
                i11 = length;
                i12 = i63;
            }
            int i67 = i12 + 1;
            int iCharAt11 = str.charAt(i12);
            if (iCharAt11 >= 55296) {
                int i68 = iCharAt11 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i24 = i69 + 1;
                    cCharAt11 = str.charAt(i69);
                    i25 = i68;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i68 = i25 | ((cCharAt11 & 8191) << i70);
                    i70 += 13;
                    i69 = i24;
                }
                iCharAt11 = i25 | (cCharAt11 << i70);
                i13 = i24;
            } else {
                i13 = i67;
            }
            int i71 = i28;
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i61] = i62;
                i61++;
            }
            Object[] objArr3 = objArr;
            Unsafe unsafe = f27933o;
            if (i72 >= 51) {
                int i74 = i13 + 1;
                int iCharAt12 = str.charAt(i13);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i22 = i76 + 1;
                        cCharAt10 = str.charAt(i76);
                        i23 = i75;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i75 = i23 | ((cCharAt10 & 8191) << i77);
                        i77 += 13;
                        i76 = i22;
                    }
                    iCharAt12 = i23 | (cCharAt10 << i77);
                    i18 = i22;
                } else {
                    i18 = i74;
                }
                int i78 = iCharAt12;
                int i79 = i72 - 51;
                int i80 = i18;
                if (i79 == 9 || i79 == 17) {
                    i19 = i2 + 1;
                    objArr2[((i62 / 3) * 2) + 1] = objArr3[i2];
                } else {
                    if (i79 == 12 && (d55.m4358c(qj3Var.m9893a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i19 = i2 + 1;
                        objArr2[((i62 / 3) * 2) + 1] = objArr3[i2];
                    }
                    i20 = i78 * 2;
                    obj = objArr3[i20];
                    if (obj instanceof Field) {
                        fieldM9635I2 = (Field) obj;
                    } else {
                        fieldM9635I2 = m9635I(cls, (String) obj);
                        objArr3[i20] = fieldM9635I2;
                    }
                    int i81 = i2;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM9635I2);
                    i21 = i20 + 1;
                    obj2 = objArr3[i21];
                    if (obj2 instanceof Field) {
                        fieldM9635I3 = (Field) obj2;
                    } else {
                        fieldM9635I3 = m9635I(cls, (String) obj2);
                        objArr3[i21] = fieldM9635I3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9635I3);
                    iCharAt5 = iCharAt5;
                    i2 = i81;
                    i15 = i80;
                    i16 = 0;
                }
                i2 = i19;
                i20 = i78 * 2;
                obj = objArr3[i20];
                if (obj instanceof Field) {
                    fieldM9635I2 = (Field) obj;
                } else {
                    fieldM9635I2 = m9635I(cls, (String) obj);
                    objArr3[i20] = fieldM9635I2;
                }
                int i82 = i2;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM9635I2);
                i21 = i20 + 1;
                obj2 = objArr3[i21];
                if (obj2 instanceof Field) {
                    fieldM9635I3 = (Field) obj2;
                } else {
                    fieldM9635I3 = m9635I(cls, (String) obj2);
                    objArr3[i21] = fieldM9635I3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9635I3);
                iCharAt5 = iCharAt5;
                i2 = i82;
                i15 = i80;
                i16 = 0;
            } else {
                int i83 = i2 + 1;
                Field fieldM9635I4 = m9635I(cls, (String) objArr3[i2]);
                if (i72 == 9 || i72 == 17) {
                    objArr2[((i62 / 3) * 2) + 1] = fieldM9635I4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i17 = i2 + 2;
                        objArr2[((i62 / 3) * 2) + 1] = objArr3[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        int i84 = i2;
                        if (qj3Var.m9893a() == 1 || (iCharAt11 & 2048) != 0) {
                            i17 = i84 + 2;
                            objArr2[((i62 / 3) * 2) + 1] = objArr3[i83];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9635I4);
                        if ((iCharAt11 & 4096) != 0 || i72 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i15 = i13;
                            i16 = 0;
                        } else {
                            int i85 = i13 + 1;
                            int iCharAt13 = str.charAt(i13);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i15 = i85 + 1;
                                    cCharAt9 = str.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i15;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i15 = i85;
                            }
                            int i88 = (iCharAt13 / 32) + (i71 * 2);
                            Object obj3 = objArr3[i88];
                            if (obj3 instanceof Field) {
                                fieldM9635I = (Field) obj3;
                            } else {
                                fieldM9635I = m9635I(cls, (String) obj3);
                                objArr3[i88] = fieldM9635I;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9635I);
                            i16 = iCharAt13 % 32;
                        }
                        if (i72 >= 18 && i72 <= 49) {
                            iArr[i59] = iObjectFieldOffset;
                            i59++;
                        }
                        i2 = i14;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                    } else {
                        if (i72 == 50) {
                            int i89 = i60 + 1;
                            iArr[i60] = i62;
                            int i90 = (i62 / 3) * 2;
                            int i91 = i2 + 2;
                            objArr2[i90] = objArr3[i83];
                            if ((iCharAt11 & 2048) != 0) {
                                i14 = i2 + 3;
                                objArr2[i90 + 1] = objArr3[i91];
                            } else {
                                i14 = i91;
                            }
                            i60 = i89;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9635I4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i15 = i13;
                            i16 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i15 = i13;
                            i16 = 0;
                        }
                        if (i72 >= 18) {
                            iArr[i59] = iObjectFieldOffset;
                            i59++;
                        }
                        i2 = i14;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                    }
                    i14 = i17;
                    iCharAt5 = iCharAt5;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9635I4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i13;
                        i16 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i13;
                        i16 = 0;
                    }
                    if (i72 >= 18) {
                        iArr[i59] = iObjectFieldOffset;
                        i59++;
                    }
                    i2 = i14;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                }
                iCharAt5 = iCharAt5;
                i14 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9635I4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i13;
                    i16 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i13;
                    i16 = 0;
                }
                if (i72 >= 18) {
                    iArr[i59] = iObjectFieldOffset;
                    i59++;
                }
                i2 = i14;
                iObjectFieldOffset3 = iObjectFieldOffset;
            }
            int i92 = i62 + 1;
            iArr3[i62] = i73;
            int i93 = i62 + 2;
            String str2 = str;
            iArr3[i92] = ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i72 << 20) | iObjectFieldOffset3;
            i62 += 3;
            iArr3[i93] = (i16 << 20) | iObjectFieldOffset2;
            iCharAt5 = iCharAt5;
            str = str2;
            i28 = i71;
            length = i11;
            i30 = i15;
            objArr = objArr3;
            i58 = i58;
        }
        ps2 ps2Var = new ps2();
        ps2Var.f27934a = iArr3;
        ps2Var.f27935b = objArr2;
        ps2Var.f27936c = iCharAt;
        ps2Var.f27937d = iCharAt2;
        ps2Var.f27939f = abstractC1240v1 instanceof tr1;
        ps2Var.f27940g = iArr;
        ps2Var.f27941h = iCharAt5;
        ps2Var.f27942i = i58;
        ps2Var.f27943j = t03Var;
        ps2Var.f27944k = ul2Var;
        ps2Var.f27945l = pu4Var;
        ps2Var.f27938e = abstractC1240v1;
        ps2Var.f27946m = zp2Var;
        VarHandle.storeStoreFence();
        return ps2Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: D */
    public final int m9640D(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, p000.C1411zn r41) {
        /*
            Method dump skipped, instruction units count: 3718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ps2.m9640D(java.lang.Object, byte[], int, int, int, zn):int");
    }

    /* JADX INFO: renamed from: E */
    public final void m9641E(Object obj, long j, xa0 xa0Var, fw3 fw3Var, qc1 qc1Var) throws f72 {
        int iM11007m;
        this.f27944k.getClass();
        i62 i62VarM11582a = ul2.m11582a(j, obj);
        ta0 ta0Var = (ta0) xa0Var.f34095e;
        int i = xa0Var.f34092b;
        if ((i & 7) != 3) {
            throw h72.m6265b();
        }
        do {
            Object objMo5831d = fw3Var.mo5831d();
            xa0Var.m12604g(objMo5831d, fw3Var, qc1Var);
            fw3Var.mo5829b(objMo5831d);
            i62VarM11582a.add(objMo5831d);
            if (ta0Var.m10999d() || xa0Var.f34094d != 0) {
                return;
            } else {
                iM11007m = ta0Var.m11007m();
            }
        } while (iM11007m == i);
        xa0Var.f34094d = iM11007m;
    }

    /* JADX INFO: renamed from: F */
    public final void m9642F(Object obj, int i, xa0 xa0Var, fw3 fw3Var, qc1 qc1Var) throws h72 {
        int iM11007m;
        this.f27944k.getClass();
        i62 i62VarM11582a = ul2.m11582a(i & 1048575, obj);
        ta0 ta0Var = (ta0) xa0Var.f34095e;
        int i2 = xa0Var.f34092b;
        if ((i2 & 7) != 2) {
            throw h72.m6265b();
        }
        do {
            Object objMo5831d = fw3Var.mo5831d();
            xa0Var.m12608i(objMo5831d, fw3Var, qc1Var);
            fw3Var.mo5829b(objMo5831d);
            i62VarM11582a.add(objMo5831d);
            if (ta0Var.m10999d() || xa0Var.f34094d != 0) {
                return;
            } else {
                iM11007m = ta0Var.m11007m();
            }
        } while (iM11007m == i2);
        xa0Var.f34094d = iM11007m;
    }

    /* JADX INFO: renamed from: G */
    public final void m9643G(int i, xa0 xa0Var, Object obj) {
        if ((536870912 & i) != 0) {
            cv4.m4190q(i & 1048575, obj, xa0Var.m12587Q());
        } else if (this.f27939f) {
            cv4.m4190q(i & 1048575, obj, xa0Var.m12584N());
        } else {
            cv4.m4190q(i & 1048575, obj, xa0Var.m12618n());
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m9644H(int i, xa0 xa0Var, Object obj) throws f72 {
        boolean z = (536870912 & i) != 0;
        ul2 ul2Var = this.f27944k;
        if (z) {
            ul2Var.getClass();
            xa0Var.m12585O(ul2.m11582a(i & 1048575, obj), true);
        } else {
            ul2Var.getClass();
            xa0Var.m12585O(ul2.m11582a(i & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m9645J(int i, Object obj) {
        int i2 = this.f27934a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        cv4.m4188o(j, (1 << (i2 >>> 20)) | cv4.m4181h(j, obj), obj);
    }

    /* JADX INFO: renamed from: K */
    public final void m9646K(int i, int i2, Object obj) {
        cv4.m4188o(this.f27934a[i2 + 2] & 1048575, i, obj);
    }

    /* JADX INFO: renamed from: L */
    public final int m9647L(int i, int i2) {
        int[] iArr = this.f27934a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final void m9648M(int i, Object obj, Object obj2) {
        f27933o.putObject(obj, m9650P(i) & 1048575, obj2);
        m9645J(i, obj);
    }

    /* JADX INFO: renamed from: N */
    public final void m9649N(int i, int i2, Object obj, Object obj2) {
        f27933o.putObject(obj, m9650P(i2) & 1048575, obj2);
        m9646K(i, i2, obj);
    }

    /* JADX INFO: renamed from: P */
    public final int m9650P(int i) {
        return this.f27934a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.fw3
    /* JADX INFO: renamed from: a */
    public final void mo5828a(Object obj, Object obj2) {
        Object obj3;
        int[] iArr = this.f27934a;
        m9637l(obj);
        obj2.getClass();
        int i = 0;
        while (i < iArr.length) {
            int iM9650P = m9650P(i);
            long j = 1048575 & iM9650P;
            int i2 = iArr[i];
            switch (m9636O(iM9650P)) {
                case 0:
                    if (!m9656q(i, obj2)) {
                        obj3 = obj;
                    } else {
                        bv4 bv4Var = cv4.f16512c;
                        obj3 = obj;
                        bv4Var.mo3320g(obj3, j, bv4Var.mo3317c(j, obj2));
                        m9645J(i, obj3);
                    }
                    break;
                case 1:
                    if (m9656q(i, obj2)) {
                        bv4 bv4Var2 = cv4.f16512c;
                        bv4Var2.mo3321h(obj, j, bv4Var2.mo3318d(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m9656q(i, obj2)) {
                        cv4.m4189p(obj, j, cv4.m4182i(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m9656q(i, obj2)) {
                        cv4.m4189p(obj, j, cv4.m4182i(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m9656q(i, obj2)) {
                        cv4.m4188o(j, cv4.m4181h(j, obj2), obj);
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m9656q(i, obj2)) {
                        cv4.m4189p(obj, j, cv4.m4182i(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m9656q(i, obj2)) {
                        cv4.m4188o(j, cv4.m4181h(j, obj2), obj);
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m9656q(i, obj2)) {
                        bv4 bv4Var3 = cv4.f16512c;
                        bv4Var3.mo3319e(j, obj, bv4Var3.mo3316a(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m9656q(i, obj2)) {
                        cv4.m4190q(j, obj, cv4.m4183j(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m9660v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m9656q(i, obj2)) {
                        cv4.m4190q(j, obj, cv4.m4183j(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m9656q(i, obj2)) {
                        cv4.m4188o(j, cv4.m4181h(j, obj2), obj);
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m9656q(i, obj2)) {
                        cv4.m4188o(j, cv4.m4181h(j, obj2), obj);
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m9656q(i, obj2)) {
                        cv4.m4188o(j, cv4.m4181h(j, obj2), obj);
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m9656q(i, obj2)) {
                        cv4.m4189p(obj, j, cv4.m4182i(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m9656q(i, obj2)) {
                        cv4.m4188o(j, cv4.m4181h(j, obj2), obj);
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m9656q(i, obj2)) {
                        cv4.m4189p(obj, j, cv4.m4182i(j, obj2));
                        m9645J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m9660v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f27944k.getClass();
                    i62 i62VarMo6682n = (i62) cv4.m4183j(j, obj);
                    i62 i62Var = (i62) cv4.m4183j(j, obj2);
                    int size = i62VarMo6682n.size();
                    int size2 = i62Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0560d2) i62VarMo6682n).f16738a) {
                            i62VarMo6682n = i62VarMo6682n.mo6682n(size2 + size);
                        }
                        i62VarMo6682n.addAll(i62Var);
                    }
                    if (size > 0) {
                        i62Var = i62VarMo6682n;
                    }
                    cv4.m4190q(j, obj, i62Var);
                    obj3 = obj;
                    break;
                case 50:
                    zp2 zp2Var = this.f27946m;
                    Class cls = jw3.f22700a;
                    Object objM4183j = cv4.m4183j(j, obj);
                    Object objM4183j2 = cv4.m4183j(j, obj2);
                    zp2Var.getClass();
                    cv4.m4190q(j, obj, zp2.m13695a(objM4183j, objM4183j2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m9658t(i2, i, obj2)) {
                        cv4.m4190q(j, obj, cv4.m4183j(j, obj2));
                        m9646K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m9661w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m9658t(i2, i, obj2)) {
                        cv4.m4190q(j, obj, cv4.m4183j(j, obj2));
                        m9646K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m9661w(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
        jw3.m7313k(this.f27945l, obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // p000.fw3
    /* JADX INFO: renamed from: b */
    public final void mo5829b(Object obj) {
        int[] iArr = this.f27934a;
        if (m9638s(obj)) {
            if (obj instanceof tr1) {
                tr1 tr1Var = (tr1) obj;
                tr1Var.m11111w(Integer.MAX_VALUE);
                tr1Var.memoizedHashCode = 0;
                tr1Var.m11108p();
            }
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM9650P = m9650P(i);
                long j = 1048575 & iM9650P;
                int iM9636O = m9636O(iM9650P);
                Unsafe unsafe = f27933o;
                if (iM9636O != 9) {
                    if (iM9636O != 60 && iM9636O != 68) {
                        switch (iM9636O) {
                            case 17:
                                if (m9656q(i, obj)) {
                                    m9655p(i).mo5829b(unsafe.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f27944k.getClass();
                                AbstractC0560d2 abstractC0560d2 = (AbstractC0560d2) ((i62) cv4.m4183j(j, obj));
                                if (abstractC0560d2.f16738a) {
                                    abstractC0560d2.f16738a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f27946m.getClass();
                                    ((xp2) object).f34515a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m9658t(iArr[i], i, obj)) {
                        m9655p(i).mo5829b(unsafe.getObject(obj, j));
                    }
                } else if (m9656q(i, obj)) {
                    m9655p(i).mo5829b(unsafe.getObject(obj, j));
                }
            }
            this.f27945l.getClass();
            nu4 nu4Var = ((tr1) obj).unknownFields;
            if (nu4Var.f26102e) {
                nu4Var.f26102e = false;
            }
        }
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: c */
    public final boolean mo5830c(Object obj) {
        int i;
        int i2;
        int[] iArr = this.f27934a;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f27941h) {
            int i6 = this.f27940g[i5];
            int i7 = iArr[i6];
            int iM9650P = m9650P(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f27933o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM9650P) == 0 || m9657r(obj, i6, i, i2, i10)) {
                int iM9636O = m9636O(iM9650P);
                if (iM9636O != 9 && iM9636O != 17) {
                    if (iM9636O != 27) {
                        if (iM9636O == 60 || iM9636O == 68) {
                            if (!m9658t(i7, i6, obj) || m9655p(i6).mo5830c(cv4.m4183j(iM9650P & 1048575, obj))) {
                            }
                        } else if (iM9636O != 49) {
                            if (iM9636O != 50) {
                                continue;
                            } else {
                                zp2 zp2Var = this.f27946m;
                                Object objM4183j = cv4.m4183j(iM9650P & 1048575, obj);
                                zp2Var.getClass();
                                if (!((xp2) objM4183j).isEmpty()) {
                                    c75.m3884p(m9654o(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) cv4.m4183j(iM9650P & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        fw3 fw3VarM9655p = m9655p(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (fw3VarM9655p.mo5830c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!m9657r(obj, i6, i, i2, i10) || m9655p(i6).mo5830c(cv4.m4183j(iM9650P & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: d */
    public final Object mo5831d() {
        t03 t03Var = this.f27943j;
        AbstractC1240v1 abstractC1240v1 = this.f27938e;
        t03Var.getClass();
        return ((tr1) abstractC1240v1).m11110s();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.fw3
    /* JADX INFO: renamed from: e */
    public final void mo5832e(Object obj, ar3 ar3Var) throws za0 {
        char c;
        int i;
        boolean z;
        ps2 ps2Var = this;
        ar3Var.getClass();
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int[] iArr = ps2Var.f27934a;
        int length = iArr.length;
        int i2 = 1048575;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM9650P = ps2Var.m9650P(i4);
            int i5 = iArr[i4];
            int iM9636O = m9636O(iM9650P);
            Unsafe unsafe = f27933o;
            if (iM9636O <= 17) {
                int i6 = iArr[i4 + 2];
                c = 1;
                int i7 = i6 & 1048575;
                if (i7 != i2) {
                    i3 = i7 == 1048575 ? 0 : unsafe.getInt(obj, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                c = 1;
                i = 0;
            }
            long j = iM9650P & 1048575;
            switch (iM9636O) {
                case 0:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        double dMo3317c = cv4.f16512c.mo3317c(j, obj);
                        ya0Var.getClass();
                        ya0Var.m13069o(i5, Double.doubleToRawLongBits(dMo3317c));
                    }
                    break;
                case 1:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        float fMo3318d = cv4.f16512c.mo3318d(j, obj);
                        ya0Var.getClass();
                        ya0Var.m13067m(i5, Float.floatToRawIntBits(fMo3318d));
                    }
                    ps2Var = this;
                    break;
                case 2:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13078x(i5, unsafe.getLong(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 3:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13078x(i5, unsafe.getLong(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 4:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13071q(i5, unsafe.getInt(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 5:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13069o(i5, unsafe.getLong(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 6:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13067m(i5, unsafe.getInt(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 7:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13065k(i5, cv4.f16512c.mo3316a(j, obj));
                    }
                    ps2Var = this;
                    break;
                case 8:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ya0Var.m13074t(i5, (String) object);
                        } else {
                            ya0Var.m13066l(i5, (t50) object);
                        }
                    }
                    ps2Var = this;
                    break;
                case 9:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ar3Var.m3133D(i5, unsafe.getObject(obj, j), ps2Var.m9655p(i4));
                    }
                    break;
                case 10:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13066l(i5, (t50) unsafe.getObject(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 11:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13076v(i5, unsafe.getInt(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 12:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13071q(i5, unsafe.getInt(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 13:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13067m(i5, unsafe.getInt(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 14:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ya0Var.m13069o(i5, unsafe.getLong(obj, j));
                    }
                    ps2Var = this;
                    break;
                case 15:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        int i8 = unsafe.getInt(obj, j);
                        ya0Var.m13076v(i5, (i8 >> 31) ^ (i8 << 1));
                    }
                    ps2Var = this;
                    break;
                case 16:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ya0Var.m13078x(i5, (j2 << 1) ^ (j2 >> 63));
                    }
                    ps2Var = this;
                    break;
                case 17:
                    if (ps2Var.m9657r(obj, i4, i2, i3, i)) {
                        ar3Var.m3132C(i5, unsafe.getObject(obj, j), ps2Var.m9655p(i4));
                    }
                    break;
                case 18:
                    jw3.m7316n(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 19:
                    jw3.m7320r(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 20:
                    jw3.m7322t(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 21:
                    jw3.m7328z(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 22:
                    jw3.m7321s(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 23:
                    jw3.m7319q(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 24:
                    jw3.m7318p(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 25:
                    jw3.m7315m(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 26:
                    int i9 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = jw3.f22700a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof yi2) {
                            yi2 yi2Var = (yi2) list;
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                Object objM13126k = yi2Var.m13126k();
                                if (objM13126k instanceof String) {
                                    ya0Var.m13074t(i9, (String) objM13126k);
                                } else {
                                    ya0Var.m13066l(i9, (t50) objM13126k);
                                }
                            }
                        } else {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                ya0Var.m13074t(i9, (String) list.get(i11));
                            }
                        }
                    }
                    break;
                case 27:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    fw3 fw3VarM9655p = ps2Var.m9655p(i4);
                    Class cls2 = jw3.f22700a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ar3Var.m3133D(i12, list2.get(i13), fw3VarM9655p);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = jw3.f22700a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            ya0Var.m13066l(i14, (t50) list3.get(i15));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    jw3.m7327y(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 30:
                    z = false;
                    jw3.m7317o(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 31:
                    z = false;
                    jw3.m7323u(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 32:
                    z = false;
                    jw3.m7324v(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 33:
                    z = false;
                    jw3.m7325w(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 34:
                    z = false;
                    jw3.m7326x(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, false);
                    break;
                case 35:
                    jw3.m7316n(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 36:
                    jw3.m7320r(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 37:
                    jw3.m7322t(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 38:
                    jw3.m7328z(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 39:
                    jw3.m7321s(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 40:
                    jw3.m7319q(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 41:
                    jw3.m7318p(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 42:
                    jw3.m7315m(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 43:
                    jw3.m7327y(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 44:
                    jw3.m7317o(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 45:
                    jw3.m7323u(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 46:
                    jw3.m7324v(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 47:
                    jw3.m7325w(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 48:
                    jw3.m7326x(iArr[i4], (List) unsafe.getObject(obj, j), ar3Var, c);
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    fw3 fw3VarM9655p2 = ps2Var.m9655p(i4);
                    Class cls4 = jw3.f22700a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            ar3Var.m3132C(i16, list4.get(i17), fw3VarM9655p2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        zp2 zp2Var = ps2Var.f27946m;
                        Object objM9654o = ps2Var.m9654o(i4);
                        zp2Var.getClass();
                        c75.m3884p(objM9654o);
                        throw null;
                    }
                    break;
                case 51:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        double dDoubleValue = ((Double) cv4.m4183j(j, obj)).doubleValue();
                        ya0Var.getClass();
                        ya0Var.m13069o(i5, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        float fFloatValue = ((Float) cv4.m4183j(j, obj)).floatValue();
                        ya0Var.getClass();
                        ya0Var.m13067m(i5, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13078x(i5, m9634C(j, obj));
                    }
                    break;
                case 54:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13078x(i5, m9634C(j, obj));
                    }
                    break;
                case 55:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13071q(i5, m9633B(j, obj));
                    }
                    break;
                case 56:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13069o(i5, m9634C(j, obj));
                    }
                    break;
                case 57:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13067m(i5, m9633B(j, obj));
                    }
                    break;
                case 58:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13065k(i5, ((Boolean) cv4.m4183j(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ya0Var.m13074t(i5, (String) object2);
                        } else {
                            ya0Var.m13066l(i5, (t50) object2);
                        }
                    }
                    break;
                case 60:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ar3Var.m3133D(i5, unsafe.getObject(obj, j), ps2Var.m9655p(i4));
                    }
                    break;
                case 61:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13066l(i5, (t50) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13076v(i5, m9633B(j, obj));
                    }
                    break;
                case 63:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13071q(i5, m9633B(j, obj));
                    }
                    break;
                case 64:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13067m(i5, m9633B(j, obj));
                    }
                    break;
                case 65:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ya0Var.m13069o(i5, m9634C(j, obj));
                    }
                    break;
                case 66:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        int iM9633B = m9633B(j, obj);
                        ya0Var.m13076v(i5, (iM9633B >> 31) ^ (iM9633B << 1));
                    }
                    break;
                case 67:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        long jM9634C = m9634C(j, obj);
                        ya0Var.m13078x(i5, (jM9634C << c) ^ (jM9634C >> 63));
                    }
                    break;
                case 68:
                    if (ps2Var.m9658t(i5, i4, obj)) {
                        ar3Var.m3132C(i5, unsafe.getObject(obj, j), ps2Var.m9655p(i4));
                    }
                    break;
                default:
                    break;
            }
        }
        ps2Var.f27945l.getClass();
        ((tr1) obj).unknownFields.m8855e(ar3Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.fw3
    /* JADX INFO: renamed from: f */
    public final int mo5833f(tr1 tr1Var) {
        int i;
        int iM7409b;
        int i2;
        int[] iArr = this.f27934a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM9650P = m9650P(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM9650P;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m9636O(iM9650P)) {
                case 0:
                    i = i3 * 53;
                    iM7409b = k62.m7409b(Double.doubleToLongBits(cv4.f16512c.mo3317c(j, tr1Var)));
                    i3 = iM7409b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM7409b = Float.floatToIntBits(cv4.f16512c.mo3318d(j, tr1Var));
                    i3 = iM7409b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM7409b = k62.m7409b(cv4.m4182i(j, tr1Var));
                    i3 = iM7409b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM7409b = k62.m7409b(cv4.m4182i(j, tr1Var));
                    i3 = iM7409b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM7409b = cv4.m4181h(j, tr1Var);
                    i3 = iM7409b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM7409b = k62.m7409b(cv4.m4182i(j, tr1Var));
                    i3 = iM7409b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM7409b = cv4.m4181h(j, tr1Var);
                    i3 = iM7409b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo3316a = cv4.f16512c.mo3316a(j, tr1Var);
                    Charset charset = k62.f22939a;
                    if (zMo3316a) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM7409b = ((String) cv4.m4183j(j, tr1Var)).hashCode();
                    i3 = iM7409b + i;
                    break;
                case 9:
                    Object objM4183j = cv4.m4183j(j, tr1Var);
                    if (objM4183j != null) {
                        iHashCode = objM4183j.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM7409b = cv4.m4183j(j, tr1Var).hashCode();
                    i3 = iM7409b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM7409b = cv4.m4181h(j, tr1Var);
                    i3 = iM7409b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM7409b = cv4.m4181h(j, tr1Var);
                    i3 = iM7409b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM7409b = cv4.m4181h(j, tr1Var);
                    i3 = iM7409b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM7409b = k62.m7409b(cv4.m4182i(j, tr1Var));
                    i3 = iM7409b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM7409b = cv4.m4181h(j, tr1Var);
                    i3 = iM7409b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM7409b = k62.m7409b(cv4.m4182i(j, tr1Var));
                    i3 = iM7409b + i;
                    break;
                case 17:
                    Object objM4183j2 = cv4.m4183j(j, tr1Var);
                    if (objM4183j2 != null) {
                        iHashCode = objM4183j2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iM7409b = cv4.m4183j(j, tr1Var).hashCode();
                    i3 = iM7409b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM7409b = cv4.m4183j(j, tr1Var).hashCode();
                    i3 = iM7409b + i;
                    break;
                case 51:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = k62.m7409b(Double.doubleToLongBits(((Double) cv4.m4183j(j, tr1Var)).doubleValue()));
                        i3 = iM7409b + i;
                    }
                    break;
                case 52:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = Float.floatToIntBits(((Float) cv4.m4183j(j, tr1Var)).floatValue());
                        i3 = iM7409b + i;
                    }
                    break;
                case 53:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = k62.m7409b(m9634C(j, tr1Var));
                        i3 = iM7409b + i;
                    }
                    break;
                case 54:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = k62.m7409b(m9634C(j, tr1Var));
                        i3 = iM7409b + i;
                    }
                    break;
                case 55:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = m9633B(j, tr1Var);
                        i3 = iM7409b + i;
                    }
                    break;
                case 56:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = k62.m7409b(m9634C(j, tr1Var));
                        i3 = iM7409b + i;
                    }
                    break;
                case 57:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = m9633B(j, tr1Var);
                        i3 = iM7409b + i;
                    }
                    break;
                case 58:
                    if (m9658t(i5, i4, tr1Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) cv4.m4183j(j, tr1Var)).booleanValue();
                        Charset charset2 = k62.f22939a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = ((String) cv4.m4183j(j, tr1Var)).hashCode();
                        i3 = iM7409b + i;
                    }
                    break;
                case 60:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = cv4.m4183j(j, tr1Var).hashCode();
                        i3 = iM7409b + i;
                    }
                    break;
                case 61:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = cv4.m4183j(j, tr1Var).hashCode();
                        i3 = iM7409b + i;
                    }
                    break;
                case 62:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = m9633B(j, tr1Var);
                        i3 = iM7409b + i;
                    }
                    break;
                case 63:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = m9633B(j, tr1Var);
                        i3 = iM7409b + i;
                    }
                    break;
                case 64:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = m9633B(j, tr1Var);
                        i3 = iM7409b + i;
                    }
                    break;
                case 65:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = k62.m7409b(m9634C(j, tr1Var));
                        i3 = iM7409b + i;
                    }
                    break;
                case 66:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = m9633B(j, tr1Var);
                        i3 = iM7409b + i;
                    }
                    break;
                case 67:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = k62.m7409b(m9634C(j, tr1Var));
                        i3 = iM7409b + i;
                    }
                    break;
                case 68:
                    if (m9658t(i5, i4, tr1Var)) {
                        i = i3 * 53;
                        iM7409b = cv4.m4183j(j, tr1Var).hashCode();
                        i3 = iM7409b + i;
                    }
                    break;
            }
        }
        this.f27945l.getClass();
        return tr1Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x07c0 A[Catch: all -> 0x04c9, TryCatch #7 {all -> 0x04c9, blocks: (B:149:0x07bb, B:151:0x07c0, B:152:0x07c5, B:106:0x04c4, B:109:0x04cc, B:110:0x04e3, B:111:0x04fa, B:112:0x0511, B:113:0x0528, B:114:0x053f, B:115:0x0556, B:116:0x056d, B:117:0x0584, B:118:0x05a1, B:119:0x05c3, B:120:0x05e5, B:121:0x0603, B:122:0x0622, B:123:0x0643, B:124:0x0661, B:125:0x0678, B:126:0x0695, B:127:0x06a4, B:128:0x06c4, B:129:0x06e3, B:130:0x0701, B:131:0x071f, B:132:0x073d, B:133:0x075b, B:134:0x0780, B:140:0x07a3), top: B:178:0x07bb }] */
    /* JADX WARN: Code duplicated, block: B:156:0x07cf A[LOOP:2: B:155:0x07cd->B:156:0x07cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x07e9 A[LOOP:3: B:162:0x07e7->B:163:0x07e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:198:0x07cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    @Override // p000.fw3
    /* JADX INFO: renamed from: g */
    public final void mo5834g(Object obj, xa0 xa0Var, qc1 qc1Var) throws Throwable {
        ps2 ps2Var;
        int i;
        int i2;
        ul2 ul2Var;
        qc1 qc1Var2;
        xa0 xa0Var2;
        int i3;
        ps2 ps2Var2 = this;
        Object obj2 = obj;
        xa0 xa0Var3 = xa0Var;
        qc1 qc1Var3 = qc1Var;
        qc1Var3.getClass();
        m9637l(obj2);
        pu4 pu4Var = ps2Var2.f27945l;
        int[] iArr = ps2Var2.f27940g;
        int i4 = ps2Var2.f27942i;
        int i5 = ps2Var2.f27941h;
        ul2 ul2Var2 = ps2Var2.f27944k;
        nu4 nu4VarM9678a = null;
        while (true) {
            try {
                int iM12598d = xa0Var3.m12598d();
                int iM9647L = (iM12598d < ps2Var2.f27936c || iM12598d > ps2Var2.f27937d) ? -1 : ps2Var2.m9647L(iM12598d, 0);
                if (iM9647L >= 0) {
                    int iM9650P = ps2Var2.m9650P(iM9647L);
                    try {
                        switch (m9636O(iM9650P)) {
                            case 0:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A = m9632A(iM9650P);
                                xa0Var2.m12593W(1);
                                try {
                                    try {
                                        cv4.f16512c.mo3320g(obj, jM9632A, Double.longBitsToDouble(((ta0) xa0Var2.f34095e).m11003i()));
                                        obj2 = obj;
                                        ps2Var.m9645J(iM9647L, obj2);
                                    } catch (f72 unused) {
                                        obj2 = obj;
                                        try {
                                            pu4Var.getClass();
                                            if (nu4VarM9678a == null) {
                                                nu4VarM9678a = pu4.m9678a(obj2);
                                            }
                                            if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                                for (i3 = i; i3 < i4; i3++) {
                                                    ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                                }
                                                if (nu4VarM9678a == null) {
                                                    return;
                                                }
                                                ((tr1) obj2).unknownFields = nu4VarM9678a;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            for (i2 = i; i2 < i4; i2++) {
                                                ps2Var.m9652m(iArr[i2], obj2, nu4VarM9678a);
                                            }
                                            if (nu4VarM9678a != null) {
                                                pu4Var.getClass();
                                                ((tr1) obj2).unknownFields = nu4VarM9678a;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj;
                                        while (i2 < i4) {
                                            ps2Var.m9652m(iArr[i2], obj2, nu4VarM9678a);
                                        }
                                        if (nu4VarM9678a != null) {
                                            pu4Var.getClass();
                                            ((tr1) obj2).unknownFields = nu4VarM9678a;
                                        }
                                        throw th;
                                    }
                                } catch (f72 unused2) {
                                    obj2 = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                }
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 1:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A2 = m9632A(iM9650P);
                                xa0Var2.m12593W(5);
                                cv4.f16512c.mo3321h(obj2, jM9632A2, Float.intBitsToFloat(((ta0) xa0Var2.f34095e).m11002h()));
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 2:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A3 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.m4189p(obj2, jM9632A3, ((ta0) xa0Var2.f34095e).m11005k());
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 3:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A4 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.m4189p(obj2, jM9632A4, ((ta0) xa0Var2.f34095e).m11005k());
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 4:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A5 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.m4188o(jM9632A5, ((ta0) xa0Var2.f34095e).m11004j(), obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 5:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A6 = m9632A(iM9650P);
                                xa0Var2.m12593W(1);
                                cv4.m4189p(obj2, jM9632A6, ((ta0) xa0Var2.f34095e).m11003i());
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 6:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A7 = m9632A(iM9650P);
                                xa0Var2.m12593W(5);
                                cv4.m4188o(jM9632A7, ((ta0) xa0Var2.f34095e).m11002h(), obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 7:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A8 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.f16512c.mo3319e(jM9632A8, obj2, ((ta0) xa0Var2.f34095e).m11001g());
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 8:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var.m9643G(iM9650P, xa0Var2, obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 9:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                AbstractC1240v1 abstractC1240v1 = (AbstractC1240v1) ps2Var.m9662x(iM9647L, obj2);
                                fw3 fw3VarM9655p = ps2Var.m9655p(iM9647L);
                                xa0Var2.m12593W(2);
                                xa0Var2.m12608i(abstractC1240v1, fw3VarM9655p, qc1Var2);
                                ps2Var.m9648M(iM9647L, obj2, abstractC1240v1);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 10:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                cv4.m4190q(m9632A(iM9650P), obj2, xa0Var2.m12618n());
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 11:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A9 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.m4188o(jM9632A9, ((ta0) xa0Var2.f34095e).m11004j(), obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 12:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                xa0Var2.m12593W(0);
                                int iM11004j = ((ta0) xa0Var2.f34095e).m11004j();
                                ps2Var.m9653n(iM9647L);
                                cv4.m4188o(m9632A(iM9650P), iM11004j, obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 13:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A10 = m9632A(iM9650P);
                                xa0Var2.m12593W(5);
                                cv4.m4188o(jM9632A10, ((ta0) xa0Var2.f34095e).m11002h(), obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 14:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A11 = m9632A(iM9650P);
                                xa0Var2.m12593W(1);
                                cv4.m4189p(obj2, jM9632A11, ((ta0) xa0Var2.f34095e).m11003i());
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 15:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A12 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.m4188o(jM9632A12, ta0.m10995a(((ta0) xa0Var2.f34095e).m11004j()), obj2);
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 16:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A13 = m9632A(iM9650P);
                                xa0Var2.m12593W(0);
                                cv4.m4189p(obj2, jM9632A13, ta0.m10996b(((ta0) xa0Var2.f34095e).m11005k()));
                                ps2Var.m9645J(iM9647L, obj2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 17:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                AbstractC1240v1 abstractC1240v2 = (AbstractC1240v1) ps2Var.m9662x(iM9647L, obj2);
                                fw3 fw3VarM9655p2 = ps2Var.m9655p(iM9647L);
                                xa0Var2.m12593W(3);
                                xa0Var2.m12604g(abstractC1240v2, fw3VarM9655p2, qc1Var2);
                                ps2Var.m9648M(iM9647L, obj2, abstractC1240v2);
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 18:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A14 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12624q(ul2.m11582a(jM9632A14, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 19:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A15 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12640z(ul2.m11582a(jM9632A15, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 20:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A16 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12572D(ul2.m11582a(jM9632A16, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 21:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A17 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12590T(ul2.m11582a(jM9632A17, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 22:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A18 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12568B(ul2.m11582a(jM9632A18, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 23:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A19 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12636x(ul2.m11582a(jM9632A19, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 24:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A20 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12634v(ul2.m11582a(jM9632A20, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 25:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                long jM9632A21 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var2.m12612k(ul2.m11582a(jM9632A21, obj2));
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 26:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                try {
                                    ps2Var.m9644H(iM9650P, xa0Var2, obj2);
                                } catch (f72 unused3) {
                                    pu4Var.getClass();
                                    if (nu4VarM9678a == null) {
                                        nu4VarM9678a = pu4.m9678a(obj2);
                                    }
                                    if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                        while (i3 < i4) {
                                            ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                        }
                                        if (nu4VarM9678a == null) {
                                            return;
                                        }
                                        ((tr1) obj2).unknownFields = nu4VarM9678a;
                                    }
                                }
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 27:
                                i = i5;
                                ul2Var = ul2Var2;
                                ps2Var2.m9642F(obj2, iM9650P, xa0Var3, ps2Var2.m9655p(iM9647L), qc1Var);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 28:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A22 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12620o(ul2.m11582a(jM9632A22, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 29:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A23 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12588R(ul2.m11582a(jM9632A23, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 30:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A24 = m9632A(iM9650P);
                                ul2Var.getClass();
                                i62 i62VarM11582a = ul2.m11582a(jM9632A24, obj2);
                                xa0Var3.m12628s(i62VarM11582a);
                                ps2Var2.m9653n(iM9647L);
                                jw3.m7312j(obj2, iM12598d, i62VarM11582a, nu4VarM9678a, pu4Var);
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 31:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A25 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12576F(ul2.m11582a(jM9632A25, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 32:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A26 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12578H(ul2.m11582a(jM9632A26, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 33:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A27 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12580J(ul2.m11582a(jM9632A27, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 34:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A28 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12582L(ul2.m11582a(jM9632A28, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 35:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A29 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12624q(ul2.m11582a(jM9632A29, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 36:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A30 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12640z(ul2.m11582a(jM9632A30, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 37:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A31 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12572D(ul2.m11582a(jM9632A31, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 38:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A32 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12590T(ul2.m11582a(jM9632A32, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 39:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A33 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12568B(ul2.m11582a(jM9632A33, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 40:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A34 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12636x(ul2.m11582a(jM9632A34, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 41:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A35 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12634v(ul2.m11582a(jM9632A35, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 42:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A36 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12612k(ul2.m11582a(jM9632A36, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 43:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A37 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12588R(ul2.m11582a(jM9632A37, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 44:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A38 = m9632A(iM9650P);
                                ul2Var.getClass();
                                i62 i62VarM11582a2 = ul2.m11582a(jM9632A38, obj2);
                                xa0Var3.m12628s(i62VarM11582a2);
                                ps2Var2.m9653n(iM9647L);
                                jw3.m7312j(obj2, iM12598d, i62VarM11582a2, nu4VarM9678a, pu4Var);
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 45:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A39 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12576F(ul2.m11582a(jM9632A39, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 46:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A40 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12578H(ul2.m11582a(jM9632A40, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 47:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A41 = m9632A(iM9650P);
                                ul2Var.getClass();
                                xa0Var3.m12580J(ul2.m11582a(jM9632A41, obj2));
                                qc1Var2 = qc1Var;
                                ps2Var = ps2Var2;
                                xa0Var2 = xa0Var3;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 48:
                                i = i5;
                                ul2Var = ul2Var2;
                                try {
                                    long jM9632A42 = m9632A(iM9650P);
                                    ul2Var.getClass();
                                    xa0Var3.m12582L(ul2.m11582a(jM9632A42, obj2));
                                    qc1Var2 = qc1Var;
                                    ps2Var = ps2Var2;
                                    xa0Var2 = xa0Var3;
                                } catch (f72 unused4) {
                                    qc1Var2 = qc1Var;
                                    ps2Var = ps2Var2;
                                    xa0Var2 = xa0Var3;
                                    pu4Var.getClass();
                                    if (nu4VarM9678a == null) {
                                        nu4VarM9678a = pu4.m9678a(obj2);
                                    }
                                    if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                        while (i3 < i4) {
                                            ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                        }
                                        if (nu4VarM9678a == null) {
                                            return;
                                        }
                                        ((tr1) obj2).unknownFields = nu4VarM9678a;
                                    }
                                }
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 49:
                                i = i5;
                                ul2Var = ul2Var2;
                                try {
                                    try {
                                        ps2Var2.m9641E(obj2, m9632A(iM9650P), xa0Var, ps2Var2.m9655p(iM9647L), qc1Var);
                                        xa0Var3 = xa0Var;
                                        qc1Var2 = qc1Var;
                                        ps2Var = ps2Var2;
                                        xa0Var2 = xa0Var3;
                                    } catch (f72 unused5) {
                                        qc1Var2 = qc1Var;
                                        ps2Var = ps2Var2;
                                        xa0Var2 = xa0Var;
                                        pu4Var.getClass();
                                        if (nu4VarM9678a == null) {
                                            nu4VarM9678a = pu4.m9678a(obj2);
                                        }
                                        if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                            while (i3 < i4) {
                                                ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                            }
                                            if (nu4VarM9678a == null) {
                                                return;
                                            }
                                            ((tr1) obj2).unknownFields = nu4VarM9678a;
                                        }
                                    }
                                } catch (f72 unused6) {
                                    xa0Var2 = xa0Var;
                                    qc1Var2 = qc1Var;
                                    ps2Var = ps2Var2;
                                    pu4Var.getClass();
                                    if (nu4VarM9678a == null) {
                                        nu4VarM9678a = pu4.m9678a(obj2);
                                    }
                                    if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                        while (i3 < i4) {
                                            ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                        }
                                        if (nu4VarM9678a == null) {
                                            return;
                                        }
                                        ((tr1) obj2).unknownFields = nu4VarM9678a;
                                    }
                                    ps2Var2 = ps2Var;
                                    xa0Var3 = xa0Var2;
                                    qc1Var3 = qc1Var2;
                                    i5 = i;
                                    ul2Var2 = ul2Var;
                                    break;
                                }
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 50:
                                i = i5;
                                ul2Var = ul2Var2;
                                ps2Var2.m9659u(iM9647L, obj2, ps2Var2.m9654o(iM9647L));
                                throw null;
                            case 51:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A43 = m9632A(iM9650P);
                                xa0Var3.m12593W(1);
                                cv4.m4190q(jM9632A43, obj2, Double.valueOf(Double.longBitsToDouble(((ta0) xa0Var3.f34095e).m11003i())));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 52:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A44 = m9632A(iM9650P);
                                xa0Var3.m12593W(5);
                                cv4.m4190q(jM9632A44, obj2, Float.valueOf(Float.intBitsToFloat(((ta0) xa0Var3.f34095e).m11002h())));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 53:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A45 = m9632A(iM9650P);
                                xa0Var3.m12593W(0);
                                cv4.m4190q(jM9632A45, obj2, Long.valueOf(((ta0) xa0Var3.f34095e).m11005k()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 54:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A46 = m9632A(iM9650P);
                                xa0Var3.m12593W(0);
                                cv4.m4190q(jM9632A46, obj2, Long.valueOf(((ta0) xa0Var3.f34095e).m11005k()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 55:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A47 = m9632A(iM9650P);
                                xa0Var3.m12593W(0);
                                cv4.m4190q(jM9632A47, obj2, Integer.valueOf(((ta0) xa0Var3.f34095e).m11004j()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 56:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A48 = m9632A(iM9650P);
                                xa0Var3.m12593W(1);
                                cv4.m4190q(jM9632A48, obj2, Long.valueOf(((ta0) xa0Var3.f34095e).m11003i()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 57:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A49 = m9632A(iM9650P);
                                xa0Var3.m12593W(5);
                                cv4.m4190q(jM9632A49, obj2, Integer.valueOf(((ta0) xa0Var3.f34095e).m11002h()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 58:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A50 = m9632A(iM9650P);
                                xa0Var3.m12593W(0);
                                cv4.m4190q(jM9632A50, obj2, Boolean.valueOf(((ta0) xa0Var3.f34095e).m11001g()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 59:
                                i = i5;
                                ul2Var = ul2Var2;
                                ps2Var2.m9643G(iM9650P, xa0Var3, obj2);
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 60:
                                i = i5;
                                ul2Var = ul2Var2;
                                AbstractC1240v1 abstractC1240v3 = (AbstractC1240v1) ps2Var2.m9663y(iM12598d, iM9647L, obj2);
                                fw3 fw3VarM9655p3 = ps2Var2.m9655p(iM9647L);
                                xa0Var3.m12593W(2);
                                xa0Var3.m12608i(abstractC1240v3, fw3VarM9655p3, qc1Var3);
                                ps2Var2.m9649N(iM12598d, iM9647L, obj2, abstractC1240v3);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 61:
                                i = i5;
                                ul2Var = ul2Var2;
                                cv4.m4190q(m9632A(iM9650P), obj2, xa0Var3.m12618n());
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 62:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A51 = m9632A(iM9650P);
                                xa0Var3.m12593W(0);
                                cv4.m4190q(jM9632A51, obj2, Integer.valueOf(((ta0) xa0Var3.f34095e).m11004j()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 63:
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var3.m12593W(0);
                                int iM11004j2 = ((ta0) xa0Var3.f34095e).m11004j();
                                ps2Var2.m9653n(iM9647L);
                                cv4.m4190q(m9632A(iM9650P), obj2, Integer.valueOf(iM11004j2));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 64:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A52 = m9632A(iM9650P);
                                xa0Var3.m12593W(5);
                                cv4.m4190q(jM9632A52, obj2, Integer.valueOf(((ta0) xa0Var3.f34095e).m11002h()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 65:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A53 = m9632A(iM9650P);
                                xa0Var3.m12593W(1);
                                cv4.m4190q(jM9632A53, obj2, Long.valueOf(((ta0) xa0Var3.f34095e).m11003i()));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 66:
                                i = i5;
                                ul2Var = ul2Var2;
                                long jM9632A54 = m9632A(iM9650P);
                                xa0Var3.m12593W(0);
                                cv4.m4190q(jM9632A54, obj2, Integer.valueOf(ta0.m10995a(((ta0) xa0Var3.f34095e).m11004j())));
                                ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 67:
                                i = i5;
                                ul2Var = ul2Var2;
                                try {
                                    try {
                                        long jM9632A55 = m9632A(iM9650P);
                                        xa0Var3.m12593W(0);
                                        cv4.m4190q(jM9632A55, obj2, Long.valueOf(ta0.m10996b(((ta0) xa0Var3.f34095e).m11005k())));
                                        ps2Var2.m9646K(iM12598d, iM9647L, obj2);
                                        xa0Var2 = xa0Var3;
                                        qc1Var2 = qc1Var3;
                                        ps2Var = ps2Var2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        ps2Var = ps2Var2;
                                        while (i2 < i4) {
                                            ps2Var.m9652m(iArr[i2], obj2, nu4VarM9678a);
                                        }
                                        if (nu4VarM9678a != null) {
                                            pu4Var.getClass();
                                            ((tr1) obj2).unknownFields = nu4VarM9678a;
                                        }
                                        throw th;
                                    }
                                } catch (f72 unused7) {
                                    xa0Var2 = xa0Var3;
                                    qc1Var2 = qc1Var3;
                                    ps2Var = ps2Var2;
                                    pu4Var.getClass();
                                    if (nu4VarM9678a == null) {
                                        nu4VarM9678a = pu4.m9678a(obj2);
                                    }
                                    if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                        while (i3 < i4) {
                                            ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                        }
                                        if (nu4VarM9678a == null) {
                                            return;
                                        }
                                        ((tr1) obj2).unknownFields = nu4VarM9678a;
                                    }
                                }
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            case 68:
                                AbstractC1240v1 abstractC1240v4 = (AbstractC1240v1) ps2Var2.m9663y(iM12598d, iM9647L, obj2);
                                fw3 fw3VarM9655p4 = ps2Var2.m9655p(iM9647L);
                                xa0Var3.m12593W(3);
                                xa0Var3.m12604g(abstractC1240v4, fw3VarM9655p4, qc1Var3);
                                ps2Var2.m9649N(iM12598d, iM9647L, obj2, abstractC1240v4);
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                            default:
                                if (nu4VarM9678a == null) {
                                    try {
                                        pu4Var.getClass();
                                        nu4VarM9678a = pu4.m9678a(obj2);
                                    } catch (f72 unused8) {
                                        i = i5;
                                        ul2Var = ul2Var2;
                                        xa0Var2 = xa0Var3;
                                        qc1Var2 = qc1Var3;
                                        ps2Var = ps2Var2;
                                        pu4Var.getClass();
                                        if (nu4VarM9678a == null) {
                                            nu4VarM9678a = pu4.m9678a(obj2);
                                        }
                                        if (!pu4.m9679b(0, xa0Var2, nu4VarM9678a)) {
                                            while (i3 < i4) {
                                                ps2Var.m9652m(iArr[i3], obj2, nu4VarM9678a);
                                            }
                                            if (nu4VarM9678a == null) {
                                                return;
                                            }
                                            ((tr1) obj2).unknownFields = nu4VarM9678a;
                                        }
                                    }
                                }
                                pu4Var.getClass();
                                if (!pu4.m9679b(0, xa0Var3, nu4VarM9678a)) {
                                    while (i5 < i4) {
                                        ps2Var2.m9652m(iArr[i5], obj2, nu4VarM9678a);
                                        i5++;
                                    }
                                    if (nu4VarM9678a == null) {
                                        return;
                                    }
                                }
                                i = i5;
                                ul2Var = ul2Var2;
                                xa0Var2 = xa0Var3;
                                qc1Var2 = qc1Var3;
                                ps2Var = ps2Var2;
                                ps2Var2 = ps2Var;
                                xa0Var3 = xa0Var2;
                                qc1Var3 = qc1Var2;
                                i5 = i;
                                ul2Var2 = ul2Var;
                                break;
                        }
                    } catch (f72 unused9) {
                        i = i5;
                        ul2Var = ul2Var2;
                    }
                } else if (iM12598d == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        ps2Var2.m9652m(iArr[i5], obj2, nu4VarM9678a);
                        i5++;
                    }
                    if (nu4VarM9678a == null) {
                        return;
                    } else {
                        pu4Var.getClass();
                    }
                } else {
                    pu4Var.getClass();
                    if (nu4VarM9678a == null) {
                        nu4VarM9678a = pu4.m9678a(obj2);
                    }
                    if (!pu4.m9679b(0, xa0Var3, nu4VarM9678a)) {
                        while (i5 < i4) {
                            ps2Var2.m9652m(iArr[i5], obj2, nu4VarM9678a);
                            i5++;
                        }
                        if (nu4VarM9678a == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                ps2Var = ps2Var2;
                i = i5;
            }
        }
        ((tr1) obj2).unknownFields = nu4VarM9678a;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0370  */
    @Override // p000.fw3
    /* JADX INFO: renamed from: h */
    public final int mo5835h(tr1 tr1Var) {
        int i;
        int iM13059e;
        int iM13059e2;
        int iM13059e3;
        int iM13061g;
        int iM13059e4;
        int iM13061g2;
        int iM13059e5;
        int iM13059e6;
        int iM13059e7;
        int iMo11101b;
        int iM13060f;
        int iM13055a;
        int iM13059e8;
        int iMo11101b2;
        int iM7305c;
        int iM13059e9;
        int size;
        int iM7311i;
        int iM13059e10;
        int iM13059e11;
        int size2;
        int iM13059e12;
        int iM13060f2;
        int iMo11101b3;
        int iM13059e13;
        int iM13059e14;
        int iM13061g3;
        int iM13059e15;
        int iM13061g4;
        int i2;
        ps2 ps2Var = this;
        tr1 tr1Var2 = tr1Var;
        int[] iArr = ps2Var.f27934a;
        int i3 = 1048575;
        int i4 = 0;
        int iM13055a2 = 0;
        for (int i5 = 0; i5 < iArr.length; i5 += 3) {
            int iM9650P = ps2Var.m9650P(i5);
            int iM9636O = m9636O(iM9650P);
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            Unsafe unsafe = f27933o;
            if (iM9636O <= 17) {
                if (i8 != i3) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(tr1Var2, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM9650P & 1048575;
            if (iM9636O >= re1.f29204b.f29208a) {
                byte b = re1.f29205c.f29208a;
            }
            switch (iM9636O) {
                case 0:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e = ya0.m13059e(i6);
                        iM7305c = iM13059e + 8;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 1:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e2 = ya0.m13059e(i6);
                        iM13059e6 = iM13059e2 + 4;
                        iM13055a2 += iM13059e6;
                    }
                    ps2Var = this;
                    tr1Var2 = tr1Var;
                    break;
                case 2:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        long j2 = unsafe.getLong(tr1Var2, j);
                        iM13059e3 = ya0.m13059e(i6);
                        iM13061g = ya0.m13061g(j2);
                        iM13055a2 += iM13061g + iM13059e3;
                    }
                    ps2Var = this;
                    break;
                case 3:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        long j3 = unsafe.getLong(tr1Var2, j);
                        iM13059e3 = ya0.m13059e(i6);
                        iM13061g = ya0.m13061g(j3);
                        iM13055a2 += iM13061g + iM13059e3;
                    }
                    ps2Var = this;
                    break;
                case 4:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        int i9 = unsafe.getInt(tr1Var2, j);
                        iM13059e4 = ya0.m13059e(i6);
                        iM13061g2 = ya0.m13061g(i9);
                        iM13055a = iM13061g2 + iM13059e4;
                        iM13055a2 += iM13055a;
                    }
                    ps2Var = this;
                    break;
                case 5:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e5 = ya0.m13059e(i6);
                        iM13059e6 = iM13059e5 + 8;
                        iM13055a2 += iM13059e6;
                    }
                    ps2Var = this;
                    tr1Var2 = tr1Var;
                    break;
                case 6:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e2 = ya0.m13059e(i6);
                        iM13059e6 = iM13059e2 + 4;
                        iM13055a2 += iM13059e6;
                    }
                    ps2Var = this;
                    tr1Var2 = tr1Var;
                    break;
                case 7:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e6 = ya0.m13059e(i6) + 1;
                        iM13055a2 += iM13059e6;
                    }
                    ps2Var = this;
                    tr1Var2 = tr1Var;
                    break;
                case 8:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        Object object = unsafe.getObject(tr1Var2, j);
                        iM13055a2 = (object instanceof t50 ? ya0.m13055a(i6, (t50) object) : ya0.m13058d((String) object) + ya0.m13059e(i6)) + iM13055a2;
                    }
                    ps2Var = this;
                    break;
                case 9:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        Object object2 = unsafe.getObject(tr1Var2, j);
                        fw3 fw3VarM9655p = ps2Var.m9655p(i5);
                        Class cls = jw3.f22700a;
                        iM13059e7 = ya0.m13059e(i6);
                        iMo11101b = ((AbstractC1240v1) object2).mo11101b(fw3VarM9655p);
                        iM13060f = ya0.m13060f(iMo11101b);
                        i2 = iM13060f + iMo11101b + iM13059e7;
                        iM13055a2 += i2;
                    }
                    break;
                case 10:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13055a = ya0.m13055a(i6, (t50) unsafe.getObject(tr1Var2, j));
                        iM13055a2 += iM13055a;
                    }
                    ps2Var = this;
                    break;
                case 11:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        int i10 = unsafe.getInt(tr1Var2, j);
                        iM13059e4 = ya0.m13059e(i6);
                        iM13061g2 = ya0.m13060f(i10);
                        iM13055a = iM13061g2 + iM13059e4;
                        iM13055a2 += iM13055a;
                    }
                    ps2Var = this;
                    break;
                case 12:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        int i11 = unsafe.getInt(tr1Var2, j);
                        iM13059e4 = ya0.m13059e(i6);
                        iM13061g2 = ya0.m13061g(i11);
                        iM13055a = iM13061g2 + iM13059e4;
                        iM13055a2 += iM13055a;
                    }
                    ps2Var = this;
                    break;
                case 13:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e2 = ya0.m13059e(i6);
                        iM13059e6 = iM13059e2 + 4;
                        iM13055a2 += iM13059e6;
                    }
                    ps2Var = this;
                    tr1Var2 = tr1Var;
                    break;
                case 14:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        iM13059e5 = ya0.m13059e(i6);
                        iM13059e6 = iM13059e5 + 8;
                        iM13055a2 += iM13059e6;
                    }
                    ps2Var = this;
                    tr1Var2 = tr1Var;
                    break;
                case 15:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        int i12 = unsafe.getInt(tr1Var2, j);
                        iM13059e4 = ya0.m13059e(i6);
                        iM13061g2 = ya0.m13056b(i12);
                        iM13055a = iM13061g2 + iM13059e4;
                        iM13055a2 += iM13055a;
                    }
                    ps2Var = this;
                    break;
                case 16:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        long j4 = unsafe.getLong(tr1Var2, j);
                        iM13059e3 = ya0.m13059e(i6);
                        iM13061g = ya0.m13057c(j4);
                        iM13055a2 += iM13061g + iM13059e3;
                    }
                    ps2Var = this;
                    break;
                case 17:
                    if (ps2Var.m9657r(tr1Var2, i5, i3, i4, i)) {
                        AbstractC1240v1 abstractC1240v1 = (AbstractC1240v1) unsafe.getObject(tr1Var2, j);
                        fw3 fw3VarM9655p2 = ps2Var.m9655p(i5);
                        iM13059e8 = ya0.m13059e(i6) * 2;
                        iMo11101b2 = abstractC1240v1.mo11101b(fw3VarM9655p2);
                        iM7305c = iMo11101b2 + iM13059e8;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 18:
                    iM7305c = jw3.m7305c((List) unsafe.getObject(tr1Var2, j), i6);
                    iM13055a2 += iM7305c;
                    break;
                case 19:
                    iM7305c = jw3.m7304b((List) unsafe.getObject(tr1Var2, j), i6);
                    iM13055a2 += iM7305c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(tr1Var2, j);
                    Class cls2 = jw3.f22700a;
                    if (list.size() == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM13059e9 = (ya0.m13059e(i6) * list.size()) + jw3.m7307e(list);
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls3 = jw3.f22700a;
                    size = list2.size();
                    if (size == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM7311i = jw3.m7311i(list2);
                        iM13059e10 = ya0.m13059e(i6);
                        iM13059e9 = (iM13059e10 * size) + iM7311i;
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls4 = jw3.f22700a;
                    size = list3.size();
                    if (size == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM7311i = jw3.m7306d(list3);
                        iM13059e10 = ya0.m13059e(i6);
                        iM13059e9 = (iM13059e10 * size) + iM7311i;
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 23:
                    iM7305c = jw3.m7305c((List) unsafe.getObject(tr1Var2, j), i6);
                    iM13055a2 += iM7305c;
                    break;
                case 24:
                    iM7305c = jw3.m7304b((List) unsafe.getObject(tr1Var2, j), i6);
                    iM13055a2 += iM7305c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls5 = jw3.f22700a;
                    int size3 = list4.size();
                    iM13055a2 += size3 == 0 ? 0 : (ya0.m13059e(i6) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls6 = jw3.f22700a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM13059e9 = ya0.m13059e(i6) * size4;
                        if (list5 instanceof yi2) {
                            yi2 yi2Var = (yi2) list5;
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object objM13126k = yi2Var.m13126k();
                                if (objM13126k instanceof t50) {
                                    int size5 = ((t50) objM13126k).size();
                                    iM13059e9 = ya0.m13060f(size5) + size5 + iM13059e9;
                                } else {
                                    iM13059e9 = ya0.m13058d((String) objM13126k) + iM13059e9;
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object obj = list5.get(i14);
                                if (obj instanceof t50) {
                                    int size6 = ((t50) obj).size();
                                    iM13059e9 = ya0.m13060f(size6) + size6 + iM13059e9;
                                } else {
                                    iM13059e9 = ya0.m13058d((String) obj) + iM13059e9;
                                }
                            }
                        }
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(tr1Var2, j);
                    fw3 fw3VarM9655p3 = ps2Var.m9655p(i5);
                    Class cls7 = jw3.f22700a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iM13059e11 = 0;
                    } else {
                        iM13059e11 = ya0.m13059e(i6) * size7;
                        for (int i15 = 0; i15 < size7; i15++) {
                            int iMo11101b4 = ((AbstractC1240v1) list6.get(i15)).mo11101b(fw3VarM9655p3);
                            iM13059e11 += ya0.m13060f(iMo11101b4) + iMo11101b4;
                        }
                    }
                    iM13055a2 += iM13059e11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls8 = jw3.f22700a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM13059e9 = ya0.m13059e(i6) * size8;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int size9 = ((t50) list7.get(i16)).size();
                            iM13059e9 += ya0.m13060f(size9) + size9;
                        }
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls9 = jw3.f22700a;
                    size = list8.size();
                    if (size == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM7311i = jw3.m7310h(list8);
                        iM13059e10 = ya0.m13059e(i6);
                        iM13059e9 = (iM13059e10 * size) + iM7311i;
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls10 = jw3.f22700a;
                    size = list9.size();
                    if (size == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM7311i = jw3.m7303a(list9);
                        iM13059e10 = ya0.m13059e(i6);
                        iM13059e9 = (iM13059e10 * size) + iM7311i;
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 31:
                    iM7305c = jw3.m7304b((List) unsafe.getObject(tr1Var2, j), i6);
                    iM13055a2 += iM7305c;
                    break;
                case 32:
                    iM7305c = jw3.m7305c((List) unsafe.getObject(tr1Var2, j), i6);
                    iM13055a2 += iM7305c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls11 = jw3.f22700a;
                    size = list10.size();
                    if (size == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM7311i = jw3.m7308f(list10);
                        iM13059e10 = ya0.m13059e(i6);
                        iM13059e9 = (iM13059e10 * size) + iM7311i;
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls12 = jw3.f22700a;
                    size = list11.size();
                    if (size == 0) {
                        iM13059e9 = 0;
                    } else {
                        iM7311i = jw3.m7309g(list11);
                        iM13059e10 = ya0.m13059e(i6);
                        iM13059e9 = (iM13059e10 * size) + iM7311i;
                    }
                    iM13055a2 += iM13059e9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls13 = jw3.f22700a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls14 = jw3.f22700a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 37:
                    size2 = jw3.m7307e((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 38:
                    size2 = jw3.m7311i((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 39:
                    size2 = jw3.m7306d((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls15 = jw3.f22700a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls16 = jw3.f22700a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls17 = jw3.f22700a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 43:
                    size2 = jw3.m7310h((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 44:
                    size2 = jw3.m7303a((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls18 = jw3.f22700a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(tr1Var2, j);
                    Class cls19 = jw3.f22700a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 47:
                    size2 = jw3.m7308f((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 48:
                    size2 = jw3.m7309g((List) unsafe.getObject(tr1Var2, j));
                    if (size2 > 0) {
                        iM13059e12 = ya0.m13059e(i6);
                        iM13060f2 = ya0.m13060f(size2);
                        iM13055a2 += iM13060f2 + iM13059e12 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(tr1Var2, j);
                    fw3 fw3VarM9655p4 = ps2Var.m9655p(i5);
                    Class cls20 = jw3.f22700a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iMo11101b3 = 0;
                    } else {
                        iMo11101b3 = 0;
                        for (int i17 = 0; i17 < size10; i17++) {
                            iMo11101b3 += ((AbstractC1240v1) list19.get(i17)).mo11101b(fw3VarM9655p4) + (ya0.m13059e(i6) * 2);
                        }
                    }
                    iM13055a2 += iMo11101b3;
                    break;
                case 50:
                    zp2 zp2Var = ps2Var.f27946m;
                    Object object3 = unsafe.getObject(tr1Var2, j);
                    Object objM9654o = ps2Var.m9654o(i5);
                    zp2Var.getClass();
                    xp2 xp2Var = (xp2) object3;
                    if (objM9654o != null) {
                        xy4.m12778e();
                        return 0;
                    }
                    if (xp2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = xp2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    break;
                case 51:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM13059e = ya0.m13059e(i6);
                        iM7305c = iM13059e + 8;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 52:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM13059e13 = ya0.m13059e(i6);
                        iM7305c = iM13059e13 + 4;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 53:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        long jM9634C = m9634C(j, tr1Var2);
                        iM13059e14 = ya0.m13059e(i6);
                        iM13061g3 = ya0.m13061g(jM9634C);
                        i2 = iM13061g3 + iM13059e14;
                        iM13055a2 += i2;
                    }
                    break;
                case 54:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        long jM9634C2 = m9634C(j, tr1Var2);
                        iM13059e14 = ya0.m13059e(i6);
                        iM13061g3 = ya0.m13061g(jM9634C2);
                        i2 = iM13061g3 + iM13059e14;
                        iM13055a2 += i2;
                    }
                    break;
                case 55:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        int iM9633B = m9633B(j, tr1Var2);
                        iM13059e15 = ya0.m13059e(i6);
                        iM13061g4 = ya0.m13061g(iM9633B);
                        iM7305c = iM13061g4 + iM13059e15;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 56:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM13059e = ya0.m13059e(i6);
                        iM7305c = iM13059e + 8;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 57:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM13059e13 = ya0.m13059e(i6);
                        iM7305c = iM13059e13 + 4;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 58:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM7305c = ya0.m13059e(i6) + 1;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 59:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        Object object4 = unsafe.getObject(tr1Var2, j);
                        iM13055a2 = (object4 instanceof t50 ? ya0.m13055a(i6, (t50) object4) : ya0.m13058d((String) object4) + ya0.m13059e(i6)) + iM13055a2;
                    }
                    break;
                case 60:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        Object object5 = unsafe.getObject(tr1Var2, j);
                        fw3 fw3VarM9655p5 = ps2Var.m9655p(i5);
                        Class cls21 = jw3.f22700a;
                        iM13059e7 = ya0.m13059e(i6);
                        iMo11101b = ((AbstractC1240v1) object5).mo11101b(fw3VarM9655p5);
                        iM13060f = ya0.m13060f(iMo11101b);
                        i2 = iM13060f + iMo11101b + iM13059e7;
                        iM13055a2 += i2;
                    }
                    break;
                case 61:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM7305c = ya0.m13055a(i6, (t50) unsafe.getObject(tr1Var2, j));
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 62:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        int iM9633B2 = m9633B(j, tr1Var2);
                        iM13059e15 = ya0.m13059e(i6);
                        iM13061g4 = ya0.m13060f(iM9633B2);
                        iM7305c = iM13061g4 + iM13059e15;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 63:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        int iM9633B3 = m9633B(j, tr1Var2);
                        iM13059e15 = ya0.m13059e(i6);
                        iM13061g4 = ya0.m13061g(iM9633B3);
                        iM7305c = iM13061g4 + iM13059e15;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 64:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM13059e13 = ya0.m13059e(i6);
                        iM7305c = iM13059e13 + 4;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 65:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        iM13059e = ya0.m13059e(i6);
                        iM7305c = iM13059e + 8;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 66:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        int iM9633B4 = m9633B(j, tr1Var2);
                        iM13059e15 = ya0.m13059e(i6);
                        iM13061g4 = ya0.m13056b(iM9633B4);
                        iM7305c = iM13061g4 + iM13059e15;
                        iM13055a2 += iM7305c;
                    }
                    break;
                case 67:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        long jM9634C3 = m9634C(j, tr1Var2);
                        iM13059e14 = ya0.m13059e(i6);
                        iM13061g3 = ya0.m13057c(jM9634C3);
                        i2 = iM13061g3 + iM13059e14;
                        iM13055a2 += i2;
                    }
                    break;
                case 68:
                    if (ps2Var.m9658t(i6, i5, tr1Var2)) {
                        AbstractC1240v1 abstractC1240v2 = (AbstractC1240v1) unsafe.getObject(tr1Var2, j);
                        fw3 fw3VarM9655p6 = ps2Var.m9655p(i5);
                        iM13059e8 = ya0.m13059e(i6) * 2;
                        iMo11101b2 = abstractC1240v2.mo11101b(fw3VarM9655p6);
                        iM7305c = iMo11101b2 + iM13059e8;
                        iM13055a2 += iM7305c;
                    }
                    break;
                default:
                    break;
            }
        }
        ps2Var.f27945l.getClass();
        return tr1Var2.unknownFields.m8853b() + iM13055a2;
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: i */
    public final void mo5836i(Object obj, byte[] bArr, int i, int i2, C1411zn c1411zn) {
        m9640D(obj, bArr, i, i2, 0, c1411zn);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.fw3
    /* JADX INFO: renamed from: j */
    public final boolean mo5837j(tr1 tr1Var, tr1 tr1Var2) {
        pu4 pu4Var = this.f27945l;
        int[] iArr = this.f27934a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM7314l = true;
            if (i < length) {
                int iM9650P = m9650P(i);
                long j = iM9650P & 1048575;
                switch (m9636O(iM9650P)) {
                    case 0:
                        if (!m9651k(tr1Var, tr1Var2, i)) {
                            zM7314l = false;
                        } else {
                            bv4 bv4Var = cv4.f16512c;
                            if (Double.doubleToLongBits(bv4Var.mo3317c(j, tr1Var)) != Double.doubleToLongBits(bv4Var.mo3317c(j, tr1Var2))) {
                                zM7314l = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m9651k(tr1Var, tr1Var2, i)) {
                            zM7314l = false;
                        } else {
                            bv4 bv4Var2 = cv4.f16512c;
                            if (Float.floatToIntBits(bv4Var2.mo3318d(j, tr1Var)) != Float.floatToIntBits(bv4Var2.mo3318d(j, tr1Var2))) {
                                zM7314l = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4182i(j, tr1Var) != cv4.m4182i(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 3:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4182i(j, tr1Var) != cv4.m4182i(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 4:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4181h(j, tr1Var) != cv4.m4181h(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 5:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4182i(j, tr1Var) != cv4.m4182i(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 6:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4181h(j, tr1Var) != cv4.m4181h(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 7:
                        if (!m9651k(tr1Var, tr1Var2, i)) {
                            zM7314l = false;
                        } else {
                            bv4 bv4Var3 = cv4.f16512c;
                            if (bv4Var3.mo3316a(j, tr1Var) != bv4Var3.mo3316a(j, tr1Var2)) {
                                zM7314l = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m9651k(tr1Var, tr1Var2, i) || !jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2))) {
                            zM7314l = false;
                        }
                        break;
                    case 9:
                        if (!m9651k(tr1Var, tr1Var2, i) || !jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2))) {
                            zM7314l = false;
                        }
                        break;
                    case 10:
                        if (!m9651k(tr1Var, tr1Var2, i) || !jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2))) {
                            zM7314l = false;
                        }
                        break;
                    case 11:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4181h(j, tr1Var) != cv4.m4181h(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 12:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4181h(j, tr1Var) != cv4.m4181h(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 13:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4181h(j, tr1Var) != cv4.m4181h(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 14:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4182i(j, tr1Var) != cv4.m4182i(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 15:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4181h(j, tr1Var) != cv4.m4181h(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 16:
                        if (!m9651k(tr1Var, tr1Var2, i) || cv4.m4182i(j, tr1Var) != cv4.m4182i(j, tr1Var2)) {
                            zM7314l = false;
                        }
                        break;
                    case 17:
                        if (!m9651k(tr1Var, tr1Var2, i) || !jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2))) {
                            zM7314l = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zM7314l = jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2));
                        break;
                    case 50:
                        zM7314l = jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (cv4.m4181h(j2, tr1Var) != cv4.m4181h(j2, tr1Var2) || !jw3.m7314l(cv4.m4183j(j, tr1Var), cv4.m4183j(j, tr1Var2))) {
                            zM7314l = false;
                        }
                        break;
                }
                if (zM7314l) {
                    i += 3;
                }
            } else {
                pu4Var.getClass();
                if (tr1Var.unknownFields.equals(tr1Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9651k(tr1 tr1Var, tr1 tr1Var2, int i) {
        return m9656q(i, tr1Var) == m9656q(i, tr1Var2);
    }

    /* JADX INFO: renamed from: m */
    public final void m9652m(int i, Object obj, Object obj2) {
        int i2 = this.f27934a[i];
        if (cv4.m4183j(m9650P(i) & 1048575, obj) == null) {
            return;
        }
        m9653n(i);
    }

    /* JADX INFO: renamed from: n */
    public final void m9653n(int i) {
        if (this.f27935b[((i / 3) * 2) + 1] == null) {
            return;
        }
        xy4.m12778e();
    }

    /* JADX INFO: renamed from: o */
    public final Object m9654o(int i) {
        return this.f27935b[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: p */
    public final fw3 m9655p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f27935b;
        fw3 fw3Var = (fw3) objArr[i2];
        if (fw3Var != null) {
            return fw3Var;
        }
        fw3 fw3VarM9531a = ph3.f27607c.m9531a((Class) objArr[i2 + 1]);
        objArr[i2] = fw3VarM9531a;
        return fw3VarM9531a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    /* JADX INFO: renamed from: q */
    public final boolean m9656q(int i, Object obj) {
        int i2 = this.f27934a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & cv4.m4181h(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM9650P = m9650P(i);
        long j2 = iM9650P & 1048575;
        switch (m9636O(iM9650P)) {
            case 0:
                if (Double.doubleToRawLongBits(cv4.f16512c.mo3317c(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(cv4.f16512c.mo3318d(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (cv4.m4182i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (cv4.m4182i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (cv4.m4181h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (cv4.m4182i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (cv4.m4181h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return cv4.f16512c.mo3316a(j2, obj);
            case 8:
                Object objM4183j = cv4.m4183j(j2, obj);
                if (objM4183j instanceof String) {
                    return !((String) objM4183j).isEmpty();
                }
                if (objM4183j instanceof t50) {
                    return !t50.f30782b.equals(objM4183j);
                }
                ds3.m4665g();
                return false;
            case 9:
                if (cv4.m4183j(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !t50.f30782b.equals(cv4.m4183j(j2, obj));
            case 11:
                if (cv4.m4181h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (cv4.m4181h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (cv4.m4181h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (cv4.m4182i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (cv4.m4181h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (cv4.m4182i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (cv4.m4183j(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                ds3.m4665g();
                return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9657r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m9656q(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9658t(int i, int i2, Object obj) {
        return cv4.m4181h((long) (this.f27934a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: u */
    public final void m9659u(int i, Object obj, Object obj2) {
        long jM9650P = m9650P(i) & 1048575;
        Object objM4183j = cv4.m4183j(jM9650P, obj);
        zp2 zp2Var = this.f27946m;
        if (objM4183j != null) {
            zp2Var.getClass();
            if (!((xp2) objM4183j).f34515a) {
                Object objM12728c = xp2.f34514b.m12728c();
                zp2.m13695a(objM12728c, objM4183j);
                cv4.m4190q(jM9650P, obj, objM12728c);
                objM4183j = objM12728c;
            }
        } else {
            zp2Var.getClass();
            objM4183j = xp2.f34514b.m12728c();
            cv4.m4190q(jM9650P, obj, objM4183j);
        }
        zp2Var.getClass();
        c75.m3884p(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final void m9660v(int i, Object obj, Object obj2) {
        if (m9656q(i, obj2)) {
            long jM9650P = m9650P(i) & 1048575;
            Unsafe unsafe = f27933o;
            Object object = unsafe.getObject(obj2, jM9650P);
            if (object == null) {
                qm5.m9914e(this.f27934a[i], obj2);
                return;
            }
            fw3 fw3VarM9655p = m9655p(i);
            if (!m9656q(i, obj)) {
                if (m9638s(object)) {
                    Object objMo5831d = fw3VarM9655p.mo5831d();
                    fw3VarM9655p.mo5828a(objMo5831d, object);
                    unsafe.putObject(obj, jM9650P, objMo5831d);
                } else {
                    unsafe.putObject(obj, jM9650P, object);
                }
                m9645J(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM9650P);
            if (!m9638s(object2)) {
                Object objMo5831d2 = fw3VarM9655p.mo5831d();
                fw3VarM9655p.mo5828a(objMo5831d2, object2);
                unsafe.putObject(obj, jM9650P, objMo5831d2);
                object2 = objMo5831d2;
            }
            fw3VarM9655p.mo5828a(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9661w(int i, Object obj, Object obj2) {
        int[] iArr = this.f27934a;
        int i2 = iArr[i];
        if (m9658t(i2, i, obj2)) {
            long jM9650P = m9650P(i) & 1048575;
            Unsafe unsafe = f27933o;
            Object object = unsafe.getObject(obj2, jM9650P);
            if (object == null) {
                qm5.m9914e(iArr[i], obj2);
                return;
            }
            fw3 fw3VarM9655p = m9655p(i);
            if (!m9658t(i2, i, obj)) {
                if (m9638s(object)) {
                    Object objMo5831d = fw3VarM9655p.mo5831d();
                    fw3VarM9655p.mo5828a(objMo5831d, object);
                    unsafe.putObject(obj, jM9650P, objMo5831d);
                } else {
                    unsafe.putObject(obj, jM9650P, object);
                }
                m9646K(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM9650P);
            if (!m9638s(object2)) {
                Object objMo5831d2 = fw3VarM9655p.mo5831d();
                fw3VarM9655p.mo5828a(objMo5831d2, object2);
                unsafe.putObject(obj, jM9650P, objMo5831d2);
                object2 = objMo5831d2;
            }
            fw3VarM9655p.mo5828a(object2, object);
        }
    }

    /* JADX INFO: renamed from: x */
    public final Object m9662x(int i, Object obj) {
        fw3 fw3VarM9655p = m9655p(i);
        long jM9650P = m9650P(i) & 1048575;
        if (!m9656q(i, obj)) {
            return fw3VarM9655p.mo5831d();
        }
        Object object = f27933o.getObject(obj, jM9650P);
        if (m9638s(object)) {
            return object;
        }
        Object objMo5831d = fw3VarM9655p.mo5831d();
        if (object != null) {
            fw3VarM9655p.mo5828a(objMo5831d, object);
        }
        return objMo5831d;
    }

    /* JADX INFO: renamed from: y */
    public final Object m9663y(int i, int i2, Object obj) {
        fw3 fw3VarM9655p = m9655p(i2);
        if (!m9658t(i, i2, obj)) {
            return fw3VarM9655p.mo5831d();
        }
        Object object = f27933o.getObject(obj, m9650P(i2) & 1048575);
        if (m9638s(object)) {
            return object;
        }
        Object objMo5831d = fw3VarM9655p.mo5831d();
        if (object != null) {
            fw3VarM9655p.mo5828a(objMo5831d, object);
        }
        return objMo5831d;
    }
}
