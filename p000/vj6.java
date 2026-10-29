package p000;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vj6 implements gk6 {

    /* JADX INFO: renamed from: j */
    public static final int[] f32685j = new int[0];

    /* JADX INFO: renamed from: k */
    public static final Unsafe f32686k;

    /* JADX INFO: renamed from: a */
    public int[] f32687a;

    /* JADX INFO: renamed from: b */
    public Object[] f32688b;

    /* JADX INFO: renamed from: c */
    public int f32689c;

    /* JADX INFO: renamed from: d */
    public int f32690d;

    /* JADX INFO: renamed from: e */
    public ef6 f32691e;

    /* JADX INFO: renamed from: f */
    public int[] f32692f;

    /* JADX INFO: renamed from: g */
    public int f32693g;

    /* JADX INFO: renamed from: h */
    public int f32694h;

    /* JADX INFO: renamed from: i */
    public yj5 f32695i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f32686k = unsafe;
    }

    /* JADX INFO: renamed from: C */
    public static int m11903C(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11904j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zh6) {
            return ((zh6) obj).m13566d();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static int m11905k(long j, Object obj) {
        return ((Integer) ml6.m8352h(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: l */
    public static long m11906l(long j, Object obj) {
        return ((Long) ml6.m8352h(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: s */
    public static final int m11907s(byte[] bArr, int i, int i2, tl6 tl6Var, Class cls, C1411zn c1411zn) throws qi6 {
        tl6 tl6Var2 = tl6.f31231c;
        switch (tl6Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                c1411zn.f36192c = Double.valueOf(Double.longBitsToDouble(hv5.m6513f(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                c1411zn.f36192c = Float.valueOf(Float.intBitsToFloat(hv5.m6512e(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iM6510c = hv5.m6510c(bArr, i, c1411zn);
                c1411zn.f36192c = Long.valueOf(c1411zn.f36191b);
                return iM6510c;
            case 4:
            case 12:
            case 13:
                int iM6508a = hv5.m6508a(bArr, i, c1411zn);
                c1411zn.f36192c = Integer.valueOf(c1411zn.f36190a);
                return iM6508a;
            case 5:
            case 15:
                int i5 = i + 8;
                c1411zn.f36192c = Long.valueOf(hv5.m6513f(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                c1411zn.f36192c = Integer.valueOf(hv5.m6512e(i, bArr));
                return i6;
            case 7:
                int iM6510c2 = hv5.m6510c(bArr, i, c1411zn);
                c1411zn.f36192c = Boolean.valueOf(c1411zn.f36191b != 0);
                return iM6510c2;
            case 8:
                return hv5.m6514g(bArr, i, c1411zn);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                gk6 gk6VarM3613a = bk6.f15375c.m3613a(cls);
                zh6 zh6VarMo6028f = gk6VarM3613a.mo6028f();
                int iM6516i = hv5.m6516i(zh6VarMo6028f, gk6VarM3613a, bArr, i, i2, c1411zn);
                gk6VarM3613a.mo6025c(zh6VarMo6028f);
                c1411zn.f36192c = zh6VarMo6028f;
                return iM6516i;
            case 11:
                return hv5.m6515h(bArr, i, c1411zn);
            case 16:
                int iM6508a2 = hv5.m6508a(bArr, i, c1411zn);
                c1411zn.f36192c = Integer.valueOf(jv5.m7300b(c1411zn.f36190a));
                return iM6508a2;
            case 17:
                int iM6510c3 = hv5.m6510c(bArr, i, c1411zn);
                c1411zn.f36192c = Long.valueOf(jv5.m7301c(c1411zn.f36191b));
                return iM6510c3;
        }
    }

    /* JADX INFO: renamed from: u */
    public static Field m11908u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            zi4.m13599B(sb, "Field ", str, " for ", name);
            xy4.m12785n(zi4.m13623w(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object m11909A(int i, int i2, Object obj) {
        gk6 gk6VarM11920x = m11920x(i2);
        if (!m11915q(i, i2, obj)) {
            return gk6VarM11920x.mo6028f();
        }
        Object object = f32686k.getObject(obj, m11910B(i2) & 1048575);
        if (m11904j(object)) {
            return object;
        }
        zh6 zh6VarMo6028f = gk6VarM11920x.mo6028f();
        if (object != null) {
            gk6VarM11920x.mo6031i(zh6VarMo6028f, object);
        }
        return zh6VarMo6028f;
    }

    /* JADX INFO: renamed from: B */
    public final int m11910B(int i) {
        return this.f32687a[i + 1];
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: a */
    public final void mo6023a(Object obj, bt5 bt5Var) throws za0 {
        int i;
        vj6 vj6Var = this;
        int[] iArr = vj6Var.f32687a;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < iArr.length) {
            int iM11910B = vj6Var.m11910B(i3);
            int iM11903C = m11903C(iM11910B);
            int i6 = iArr[i3];
            Unsafe unsafe = f32686k;
            if (iM11903C <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM11910B & i2;
            int i9 = 2;
            switch (iM11903C) {
                case 0:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8719h(i6, Double.doubleToRawLongBits(ml6.f25012c.mo3741u(j, obj)));
                    }
                    break;
                case 1:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8717f(i6, Float.floatToRawIntBits(ml6.f25012c.mo3736p(j, obj)));
                    }
                    break;
                case 2:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8718g(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8718g(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8715d(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8719h(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8717f(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        boolean zMo3734n = ml6.f25012c.mo3734n(j, obj);
                        ng6 ng6Var = (ng6) bt5Var.f15596b;
                        ng6Var.m8724m(i6 << 3);
                        ng6Var.m8722k(zMo3734n ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ng6 ng6Var2 = (ng6) bt5Var.f15596b;
                            ng6Var2.m8724m((i6 << 3) | 2);
                            ng6Var2.m8729r((String) object);
                        } else {
                            ((ng6) bt5Var.f15596b).m8720i(i6, (ig6) object);
                        }
                    }
                    break;
                case 9:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        bt5Var.m3682j(i6, unsafe.getObject(obj, j), vj6Var.m11920x(i3));
                    }
                    break;
                case 10:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8720i(i6, (ig6) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8716e(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8715d(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8717f(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        ((ng6) bt5Var.f15596b).m8719h(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((ng6) bt5Var.f15596b).m8716e(i6, (i10 >> 31) ^ (i10 + i10));
                    }
                    break;
                case 16:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((ng6) bt5Var.f15596b).m8718g(i6, (j2 >> 63) ^ (j2 + j2));
                    }
                    break;
                case 17:
                    if (vj6Var.m11912n(obj, i3, i5, i4, i)) {
                        bt5Var.m3683k(i6, unsafe.getObject(obj, j), vj6Var.m11920x(i3));
                    }
                    break;
                case 18:
                    jk6.m7140c(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 19:
                    jk6.m7141d(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 20:
                    jk6.m7142e(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 21:
                    jk6.m7143f(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 22:
                    jk6.m7147j(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 23:
                    jk6.m7145h(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 24:
                    jk6.m7150m(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 25:
                    jk6.m7153p(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 26:
                    int i11 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    yj5 yj5Var = jk6.f22377a;
                    if (list != null && !list.isEmpty()) {
                        ng6 ng6Var3 = (ng6) bt5Var.f15596b;
                        if (list instanceof ui6) {
                            ui6 ui6Var = (ui6) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objM11567h = ui6Var.m11567h();
                                if (objM11567h instanceof String) {
                                    ng6Var3.m8724m((i11 << 3) | 2);
                                    ng6Var3.m8729r((String) objM11567h);
                                } else {
                                    ng6Var3.m8720i(i11, (ig6) objM11567h);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                String str = (String) list.get(i13);
                                ng6Var3.m8724m((i11 << 3) | 2);
                                ng6Var3.m8729r(str);
                            }
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    gk6 gk6VarM11920x = vj6Var.m11920x(i3);
                    yj5 yj5Var2 = jk6.f22377a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            bt5Var.m3682j(i14, list2.get(i15), gk6VarM11920x);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    yj5 yj5Var3 = jk6.f22377a;
                    if (list3 != null && !list3.isEmpty()) {
                        bt5Var.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            ((ng6) bt5Var.f15596b).m8720i(i16, (ig6) list3.get(i17));
                        }
                    }
                    break;
                case 29:
                    jk6.m7148k(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 30:
                    jk6.m7152o(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 31:
                    jk6.m7151n(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 32:
                    jk6.m7146i(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 33:
                    jk6.m7149l(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 34:
                    jk6.m7144g(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, false);
                    break;
                case 35:
                    jk6.m7140c(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 36:
                    jk6.m7141d(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 37:
                    jk6.m7142e(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 38:
                    jk6.m7143f(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 39:
                    jk6.m7147j(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 40:
                    jk6.m7145h(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 41:
                    jk6.m7150m(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 42:
                    jk6.m7153p(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 43:
                    jk6.m7148k(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 44:
                    jk6.m7152o(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 45:
                    jk6.m7151n(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 46:
                    jk6.m7146i(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 47:
                    jk6.m7149l(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 48:
                    jk6.m7144g(iArr[i3], (List) unsafe.getObject(obj, j), bt5Var, true);
                    break;
                case 49:
                    int i18 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    gk6 gk6VarM11920x2 = vj6Var.m11920x(i3);
                    yj5 yj5Var4 = jk6.f22377a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            bt5Var.m3683k(i18, list4.get(i19), gk6VarM11920x2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i20 = i3 / 3;
                        pq3 pq3Var = ((ij6) vj6Var.f32688b[i20 + i20]).f21499a;
                        bt5Var.getClass();
                        for (Map.Entry entry : ((kj6) object2).entrySet()) {
                            ng6 ng6Var4 = (ng6) bt5Var.f15596b;
                            ng6Var4.m8714c(i6, i9);
                            ng6Var4.m8724m(ij6.m6816c(pq3Var, entry.getKey(), entry.getValue()));
                            ij6.m6815b(ng6Var4, pq3Var, entry.getKey(), entry.getValue());
                            i9 = i9;
                        }
                    }
                    break;
                case 51:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8719h(i6, Double.doubleToRawLongBits(((Double) ml6.m8352h(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8717f(i6, Float.floatToRawIntBits(((Float) ml6.m8352h(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8718g(i6, m11906l(j, obj));
                    }
                    break;
                case 54:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8718g(i6, m11906l(j, obj));
                    }
                    break;
                case 55:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8715d(i6, m11905k(j, obj));
                    }
                    break;
                case 56:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8719h(i6, m11906l(j, obj));
                    }
                    break;
                case 57:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8717f(i6, m11905k(j, obj));
                    }
                    break;
                case 58:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        boolean zBooleanValue = ((Boolean) ml6.m8352h(j, obj)).booleanValue();
                        ng6 ng6Var5 = (ng6) bt5Var.f15596b;
                        ng6Var5.m8724m(i6 << 3);
                        ng6Var5.m8722k(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ng6 ng6Var6 = (ng6) bt5Var.f15596b;
                            ng6Var6.m8724m(2 | (i6 << 3));
                            ng6Var6.m8729r((String) object3);
                        } else {
                            ((ng6) bt5Var.f15596b).m8720i(i6, (ig6) object3);
                        }
                    }
                    break;
                case 60:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        bt5Var.m3682j(i6, unsafe.getObject(obj, j), vj6Var.m11920x(i3));
                    }
                    break;
                case 61:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8720i(i6, (ig6) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8716e(i6, m11905k(j, obj));
                    }
                    break;
                case 63:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8715d(i6, m11905k(j, obj));
                    }
                    break;
                case 64:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8717f(i6, m11905k(j, obj));
                    }
                    break;
                case 65:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        ((ng6) bt5Var.f15596b).m8719h(i6, m11906l(j, obj));
                    }
                    break;
                case 66:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        int iM11905k = m11905k(j, obj);
                        ((ng6) bt5Var.f15596b).m8716e(i6, (iM11905k >> 31) ^ (iM11905k + iM11905k));
                    }
                    break;
                case 67:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        long jM11906l = m11906l(j, obj);
                        ((ng6) bt5Var.f15596b).m8718g(i6, (jM11906l >> 63) ^ (jM11906l + jM11906l));
                    }
                    break;
                case 68:
                    if (vj6Var.m11915q(i6, i3, obj)) {
                        bt5Var.m3683k(i6, unsafe.getObject(obj, j), vj6Var.m11920x(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
            vj6Var = this;
        }
        ((zh6) obj).zzc.m5194b(bt5Var);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: b */
    public final boolean mo6024b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f32693g) {
            int[] iArr = this.f32692f;
            int[] iArr2 = this.f32687a;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int iM11910B = m11910B(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f32686k.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iM11910B) == 0 || m11912n(obj, i6, i, i2, i10)) {
                int iM11903C = m11903C(iM11910B);
                if (iM11903C != 9 && iM11903C != 17) {
                    if (iM11903C != 27) {
                        if (iM11903C == 60 || iM11903C == 68) {
                            if (!m11915q(i7, i6, obj) || m11920x(i6).mo6024b(ml6.m8352h(iM11910B & 1048575, obj))) {
                                i4++;
                                i5 = i;
                                i3 = i2;
                            }
                        } else if (iM11903C != 49) {
                            if (iM11903C != 50) {
                                continue;
                            } else {
                                kj6 kj6Var = (kj6) ml6.m8352h(iM11910B & 1048575, obj);
                                if (kj6Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i12 = i6 / 3;
                                    if (((tl6) ((ij6) this.f32688b[i12 + i12]).f21499a.f27897c).f31234a == ul6.f31987i) {
                                        gk6 gk6VarM3613a = null;
                                        for (Object obj2 : kj6Var.values()) {
                                            if (gk6VarM3613a == null) {
                                                gk6VarM3613a = bk6.f15375c.m3613a(obj2.getClass());
                                            }
                                            if (!gk6VarM3613a.mo6024b(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i4++;
                            i5 = i;
                            i3 = i2;
                        }
                    }
                    List list = (List) ml6.m8352h(iM11910B & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        gk6 gk6VarM11920x = m11920x(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (gk6VarM11920x.mo6024b(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!m11912n(obj, i6, i, i2, i10) || m11920x(i6).mo6024b(ml6.m8352h(iM11910B & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // p000.gk6
    /* JADX INFO: renamed from: c */
    public final void mo6025c(Object obj) {
        if (m11904j(obj)) {
            if (obj instanceof zh6) {
                zh6 zh6Var = (zh6) obj;
                zh6Var.m13570h();
                zh6Var.zza = 0;
                zh6Var.m13567e();
            }
            int[] iArr = this.f32687a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM11910B = m11910B(i);
                int i2 = 1048575 & iM11910B;
                int iM11903C = m11903C(iM11910B);
                long j = i2;
                Unsafe unsafe = f32686k;
                if (iM11903C != 9) {
                    if (iM11903C != 60 && iM11903C != 68) {
                        switch (iM11903C) {
                            case 17:
                                if (m11913o(i, obj)) {
                                    m11920x(i).mo6025c(unsafe.getObject(obj, j));
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
                                hf6 hf6Var = (hf6) ((mi6) ml6.m8352h(j, obj));
                                if (hf6Var.f20538a) {
                                    hf6Var.f20538a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((kj6) object).f23185a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m11915q(iArr[i], i, obj)) {
                        m11920x(i).mo6025c(unsafe.getObject(obj, j));
                    }
                } else if (m11913o(i, obj)) {
                    m11920x(i).mo6025c(unsafe.getObject(obj, j));
                }
            }
            this.f32695i.getClass();
            el6 el6Var = ((zh6) obj).zzc;
            if (el6Var.f18247e) {
                el6Var.f18247e = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:227:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:230:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4  */
    @Override // p000.gk6
    /* JADX INFO: renamed from: d */
    public final int mo6026d(ef6 ef6Var) {
        int i;
        int iM8713s;
        int iM8711a;
        int iM8713s2;
        int iMo3593d;
        int iM8713s3;
        int iMo5119b;
        int i2;
        int iM8713s4;
        int iM7162y;
        int i3;
        int iMo5119b2;
        int iM8713s5;
        int size;
        int iM7155r;
        int iM8713s6;
        int iM8713s7;
        int iM8713s8;
        int size2;
        int iM8713s9;
        int iMo5119b3;
        int iM8713s10;
        int iM8711a2;
        int iM8713s11;
        int iMo3593d2;
        int iM11905k;
        int iM8713s12;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM10845k = 0;
        while (true) {
            int[] iArr = this.f32687a;
            if (i6 >= iArr.length) {
                return ((zh6) ef6Var).zzc.m5195c() + iM10845k;
            }
            int iM11910B = m11910B(i6);
            int iM11903C = m11903C(iM11910B);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            Unsafe unsafe = f32686k;
            if (iM11903C <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(ef6Var, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM11910B & i4;
            if (iM11903C >= jh6.f22284b.f22288a) {
                byte b = jh6.f22285c.f22288a;
            }
            long j = i11;
            switch (iM11903C) {
                case 0:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 8, iM10845k);
                    }
                    break;
                case 1:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 4, iM10845k);
                    }
                    break;
                case 2:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(ef6Var, j);
                        iM8713s = ng6.m8713s(i8 << 3);
                        iM8711a = ng6.m8711a(j2);
                        iM7162y = iM8711a + iM8713s;
                        iM10845k += iM7162y;
                    }
                    break;
                case 3:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(ef6Var, j);
                        iM8713s = ng6.m8713s(i8 << 3);
                        iM8711a = ng6.m8711a(j3);
                        iM7162y = iM8711a + iM8713s;
                        iM10845k += iM7162y;
                    }
                    break;
                case 4:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(ef6Var, j);
                        iM8713s = ng6.m8713s(i8 << 3);
                        iM8711a = ng6.m8711a(j4);
                        iM7162y = iM8711a + iM8713s;
                        iM10845k += iM7162y;
                    }
                    break;
                case 5:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 8, iM10845k);
                    }
                    break;
                case 6:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 4, iM10845k);
                    }
                    break;
                case 7:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 1, iM10845k);
                    }
                    break;
                case 8:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(ef6Var, j);
                        if (object instanceof ig6) {
                            iM8713s2 = ng6.m8713s(i12);
                            iMo3593d = ((ig6) object).mo3593d();
                            iM10845k = sk5.m10846l(iMo3593d, iMo3593d, iM8713s2, iM10845k);
                        } else {
                            iM8713s = ng6.m8713s(i12);
                            iM8711a = ng6.m8712b((String) object);
                            iM7162y = iM8711a + iM8713s;
                            iM10845k += iM7162y;
                        }
                    }
                    break;
                case 9:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(ef6Var, j);
                        gk6 gk6VarM11920x = m11920x(i6);
                        yj5 yj5Var = jk6.f22377a;
                        iM8713s3 = ng6.m8713s(i8 << 3);
                        iMo5119b = ((ef6) object2).mo5119b(gk6VarM11920x);
                        iM10845k = sk5.m10846l(iMo5119b, iMo5119b, iM8713s3, iM10845k);
                    }
                    break;
                case 10:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        ig6 ig6Var = (ig6) unsafe.getObject(ef6Var, j);
                        iM8713s2 = ng6.m8713s(i8 << 3);
                        iMo3593d = ig6Var.mo3593d();
                        iM10845k = sk5.m10846l(iMo3593d, iMo3593d, iM8713s2, iM10845k);
                    }
                    break;
                case 11:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(ef6Var, j);
                        iM8713s4 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10845k(i2, iM8713s4, iM10845k);
                    }
                    break;
                case 12:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(ef6Var, j);
                        iM8713s = ng6.m8713s(i8 << 3);
                        iM8711a = ng6.m8711a(j5);
                        iM7162y = iM8711a + iM8713s;
                        iM10845k += iM7162y;
                    }
                    break;
                case 13:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 4, iM10845k);
                    }
                    break;
                case 14:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        iM10845k = sk5.m10845k(i8 << 3, 8, iM10845k);
                    }
                    break;
                case 15:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(ef6Var, j);
                        iM8713s4 = ng6.m8713s(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iM10845k = sk5.m10845k(i2, iM8713s4, iM10845k);
                    }
                    break;
                case 16:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(ef6Var, j);
                        iM8713s = ng6.m8713s(i8 << 3);
                        iM8711a = ng6.m8711a((j6 >> 63) ^ (j6 + j6));
                        iM7162y = iM8711a + iM8713s;
                        iM10845k += iM7162y;
                    }
                    break;
                case 17:
                    if (m11912n(ef6Var, i6, i5, i7, i)) {
                        ef6 ef6Var2 = (ef6) unsafe.getObject(ef6Var, j);
                        gk6 gk6VarM11920x2 = m11920x(i6);
                        int iM8713s13 = ng6.m8713s(i8 << 3);
                        i3 = iM8713s13 + iM8713s13;
                        iMo5119b2 = ef6Var2.mo5119b(gk6VarM11920x2);
                        iM7162y = iMo5119b2 + i3;
                        iM10845k += iM7162y;
                    }
                    break;
                case 18:
                    iM7162y = jk6.m7162y((List) unsafe.getObject(ef6Var, j), i8);
                    iM10845k += iM7162y;
                    break;
                case 19:
                    iM7162y = jk6.m7161x((List) unsafe.getObject(ef6Var, j), i8);
                    iM10845k += iM7162y;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var2 = jk6.f22377a;
                    if (list.size() == 0) {
                        iM8713s5 = 0;
                    } else {
                        iM8713s5 = (ng6.m8713s(i8 << 3) * list.size()) + jk6.m7154q(list);
                    }
                    iM10845k += iM8713s5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var3 = jk6.f22377a;
                    size = list2.size();
                    if (size == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM7155r = jk6.m7155r(list2);
                        iM8713s6 = ng6.m8713s(i8 << 3);
                        iM8713s7 = (iM8713s6 * size) + iM7155r;
                    }
                    iM10845k += iM8713s7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var4 = jk6.f22377a;
                    size = list3.size();
                    if (size == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM7155r = jk6.m7158u(list3);
                        iM8713s6 = ng6.m8713s(i8 << 3);
                        iM8713s7 = (iM8713s6 * size) + iM7155r;
                    }
                    iM10845k += iM8713s7;
                    break;
                case 23:
                    iM7162y = jk6.m7162y((List) unsafe.getObject(ef6Var, j), i8);
                    iM10845k += iM7162y;
                    break;
                case 24:
                    iM7162y = jk6.m7161x((List) unsafe.getObject(ef6Var, j), i8);
                    iM10845k += iM7162y;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var5 = jk6.f22377a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM8713s5 = 0;
                    } else {
                        iM8713s5 = (ng6.m8713s(i8 << 3) + 1) * size3;
                    }
                    iM10845k += iM8713s5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var6 = jk6.f22377a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM8713s7 = ng6.m8713s(i8 << 3) * size4;
                        if (list5 instanceof ui6) {
                            ui6 ui6Var = (ui6) list5;
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object objM11567h = ui6Var.m11567h();
                                if (objM11567h instanceof ig6) {
                                    int iMo3593d3 = ((ig6) objM11567h).mo3593d();
                                    iM8713s7 = sk5.m10845k(iMo3593d3, iMo3593d3, iM8713s7);
                                } else {
                                    iM8713s7 = ng6.m8712b((String) objM11567h) + iM8713s7;
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object obj = list5.get(i15);
                                if (obj instanceof ig6) {
                                    int iMo3593d4 = ((ig6) obj).mo3593d();
                                    iM8713s7 = sk5.m10845k(iMo3593d4, iMo3593d4, iM8713s7);
                                } else {
                                    iM8713s7 = ng6.m8712b((String) obj) + iM8713s7;
                                }
                            }
                        }
                    }
                    iM10845k += iM8713s7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(ef6Var, j);
                    gk6 gk6VarM11920x3 = m11920x(i6);
                    yj5 yj5Var7 = jk6.f22377a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM8713s8 = 0;
                    } else {
                        iM8713s8 = ng6.m8713s(i8 << 3) * size5;
                        for (int i16 = 0; i16 < size5; i16++) {
                            int iMo5119b4 = ((ef6) list6.get(i16)).mo5119b(gk6VarM11920x3);
                            iM8713s8 = sk5.m10845k(iMo5119b4, iMo5119b4, iM8713s8);
                        }
                    }
                    iM10845k += iM8713s8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var8 = jk6.f22377a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM8713s7 = ng6.m8713s(i8 << 3) * size6;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int iMo3593d5 = ((ig6) list7.get(i17)).mo3593d();
                            iM8713s7 = sk5.m10845k(iMo3593d5, iMo3593d5, iM8713s7);
                        }
                    }
                    iM10845k += iM8713s7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var9 = jk6.f22377a;
                    size = list8.size();
                    if (size == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM7155r = jk6.m7159v(list8);
                        iM8713s6 = ng6.m8713s(i8 << 3);
                        iM8713s7 = (iM8713s6 * size) + iM7155r;
                    }
                    iM10845k += iM8713s7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var10 = jk6.f22377a;
                    size = list9.size();
                    if (size == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM7155r = jk6.m7157t(list9);
                        iM8713s6 = ng6.m8713s(i8 << 3);
                        iM8713s7 = (iM8713s6 * size) + iM7155r;
                    }
                    iM10845k += iM8713s7;
                    break;
                case 31:
                    iM7162y = jk6.m7161x((List) unsafe.getObject(ef6Var, j), i8);
                    iM10845k += iM7162y;
                    break;
                case 32:
                    iM7162y = jk6.m7162y((List) unsafe.getObject(ef6Var, j), i8);
                    iM10845k += iM7162y;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var11 = jk6.f22377a;
                    size = list10.size();
                    if (size == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM7155r = jk6.m7160w(list10);
                        iM8713s6 = ng6.m8713s(i8 << 3);
                        iM8713s7 = (iM8713s6 * size) + iM7155r;
                    }
                    iM10845k += iM8713s7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var12 = jk6.f22377a;
                    size = list11.size();
                    if (size == 0) {
                        iM8713s7 = 0;
                    } else {
                        iM7155r = jk6.m7156s(list11);
                        iM8713s6 = ng6.m8713s(i8 << 3);
                        iM8713s7 = (iM8713s6 * size) + iM7155r;
                    }
                    iM10845k += iM8713s7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var13 = jk6.f22377a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var14 = jk6.f22377a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 37:
                    size2 = jk6.m7154q((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 38:
                    size2 = jk6.m7155r((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 39:
                    size2 = jk6.m7158u((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var15 = jk6.f22377a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var16 = jk6.f22377a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var17 = jk6.f22377a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 43:
                    size2 = jk6.m7159v((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 44:
                    size2 = jk6.m7157t((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var18 = jk6.f22377a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(ef6Var, j);
                    yj5 yj5Var19 = jk6.f22377a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 47:
                    size2 = jk6.m7160w((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 48:
                    size2 = jk6.m7156s((List) unsafe.getObject(ef6Var, j));
                    if (size2 > 0) {
                        iM8713s9 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10846l(size2, iM8713s9, size2, iM10845k);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(ef6Var, j);
                    gk6 gk6VarM11920x4 = m11920x(i6);
                    yj5 yj5Var20 = jk6.f22377a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iMo5119b3 = 0;
                    } else {
                        iMo5119b3 = 0;
                        for (int i18 = 0; i18 < size7; i18++) {
                            ef6 ef6Var3 = (ef6) list19.get(i18);
                            int iM8713s14 = ng6.m8713s(i8 << 3);
                            iMo5119b3 += ef6Var3.mo5119b(gk6VarM11920x4) + iM8713s14 + iM8713s14;
                        }
                    }
                    iM10845k += iMo5119b3;
                    break;
                case 50:
                    int i19 = i6 / 3;
                    kj6 kj6Var = (kj6) unsafe.getObject(ef6Var, j);
                    ij6 ij6Var = (ij6) this.f32688b[i19 + i19];
                    if (kj6Var.isEmpty()) {
                        iM8713s7 = 0;
                    } else {
                        iM8713s7 = 0;
                        for (Map.Entry entry : kj6Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            pq3 pq3Var = ij6Var.f21499a;
                            int iM8713s15 = ng6.m8713s(i8 << 3);
                            int iM6816c = ij6.m6816c(pq3Var, key, value);
                            iM8713s7 = sk5.m10846l(iM6816c, iM6816c, iM8713s15, iM8713s7);
                        }
                    }
                    iM10845k += iM8713s7;
                    break;
                case 51:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 8, iM10845k);
                    }
                    break;
                case 52:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 4, iM10845k);
                    }
                    break;
                case 53:
                    if (m11915q(i8, i6, ef6Var)) {
                        long jM11906l = m11906l(j, ef6Var);
                        iM8713s10 = ng6.m8713s(i8 << 3);
                        iM8711a2 = ng6.m8711a(jM11906l);
                        iM10845k += iM8711a2 + iM8713s10;
                    }
                    break;
                case 54:
                    if (m11915q(i8, i6, ef6Var)) {
                        long jM11906l2 = m11906l(j, ef6Var);
                        iM8713s10 = ng6.m8713s(i8 << 3);
                        iM8711a2 = ng6.m8711a(jM11906l2);
                        iM10845k += iM8711a2 + iM8713s10;
                    }
                    break;
                case 55:
                    if (m11915q(i8, i6, ef6Var)) {
                        long jM11905k = m11905k(j, ef6Var);
                        iM8713s10 = ng6.m8713s(i8 << 3);
                        iM8711a2 = ng6.m8711a(jM11905k);
                        iM10845k += iM8711a2 + iM8713s10;
                    }
                    break;
                case 56:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 8, iM10845k);
                    }
                    break;
                case 57:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 4, iM10845k);
                    }
                    break;
                case 58:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 1, iM10845k);
                    }
                    break;
                case 59:
                    if (m11915q(i8, i6, ef6Var)) {
                        int i20 = i8 << 3;
                        Object object3 = unsafe.getObject(ef6Var, j);
                        if (object3 instanceof ig6) {
                            iM8713s11 = ng6.m8713s(i20);
                            iMo3593d2 = ((ig6) object3).mo3593d();
                            iM10845k = sk5.m10846l(iMo3593d2, iMo3593d2, iM8713s11, iM10845k);
                        } else {
                            iM8713s10 = ng6.m8713s(i20);
                            iM8711a2 = ng6.m8712b((String) object3);
                            iM10845k += iM8711a2 + iM8713s10;
                        }
                    }
                    break;
                case 60:
                    if (m11915q(i8, i6, ef6Var)) {
                        Object object4 = unsafe.getObject(ef6Var, j);
                        gk6 gk6VarM11920x5 = m11920x(i6);
                        yj5 yj5Var21 = jk6.f22377a;
                        iM8713s3 = ng6.m8713s(i8 << 3);
                        iMo5119b = ((ef6) object4).mo5119b(gk6VarM11920x5);
                        iM10845k = sk5.m10846l(iMo5119b, iMo5119b, iM8713s3, iM10845k);
                    }
                    break;
                case 61:
                    if (m11915q(i8, i6, ef6Var)) {
                        ig6 ig6Var2 = (ig6) unsafe.getObject(ef6Var, j);
                        iM8713s11 = ng6.m8713s(i8 << 3);
                        iMo3593d2 = ig6Var2.mo3593d();
                        iM10845k = sk5.m10846l(iMo3593d2, iMo3593d2, iM8713s11, iM10845k);
                    }
                    break;
                case 62:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM11905k = m11905k(j, ef6Var);
                        iM8713s12 = ng6.m8713s(i8 << 3);
                        iM10845k = sk5.m10845k(iM11905k, iM8713s12, iM10845k);
                    }
                    break;
                case 63:
                    if (m11915q(i8, i6, ef6Var)) {
                        long jM11905k2 = m11905k(j, ef6Var);
                        iM8713s10 = ng6.m8713s(i8 << 3);
                        iM8711a2 = ng6.m8711a(jM11905k2);
                        iM10845k += iM8711a2 + iM8713s10;
                    }
                    break;
                case 64:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 4, iM10845k);
                    }
                    break;
                case 65:
                    if (m11915q(i8, i6, ef6Var)) {
                        iM10845k = sk5.m10845k(i8 << 3, 8, iM10845k);
                    }
                    break;
                case 66:
                    if (m11915q(i8, i6, ef6Var)) {
                        int iM11905k2 = m11905k(j, ef6Var);
                        iM8713s12 = ng6.m8713s(i8 << 3);
                        iM11905k = (iM11905k2 >> 31) ^ (iM11905k2 + iM11905k2);
                        iM10845k = sk5.m10845k(iM11905k, iM8713s12, iM10845k);
                    }
                    break;
                case 67:
                    if (m11915q(i8, i6, ef6Var)) {
                        long jM11906l3 = m11906l(j, ef6Var);
                        iM8713s10 = ng6.m8713s(i8 << 3);
                        iM8711a2 = ng6.m8711a((jM11906l3 >> 63) ^ (jM11906l3 + jM11906l3));
                        iM10845k += iM8711a2 + iM8713s10;
                    }
                    break;
                case 68:
                    if (m11915q(i8, i6, ef6Var)) {
                        ef6 ef6Var4 = (ef6) unsafe.getObject(ef6Var, j);
                        gk6 gk6VarM11920x6 = m11920x(i6);
                        int iM8713s16 = ng6.m8713s(i8 << 3);
                        i3 = iM8713s16 + iM8713s16;
                        iMo5119b2 = ef6Var4.mo5119b(gk6VarM11920x6);
                        iM7162y = iMo5119b2 + i3;
                        iM10845k += iM7162y;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: e */
    public final boolean mo6027e(zh6 zh6Var, zh6 zh6Var2) {
        boolean zM7138a;
        int[] iArr = this.f32687a;
        for (int i = 0; i < iArr.length; i += 3) {
            int iM11910B = m11910B(i);
            long j = iM11910B & 1048575;
            switch (m11903C(iM11910B)) {
                case 0:
                    if (m11911m(zh6Var, zh6Var2, i)) {
                        bv4 bv4Var = ml6.f25012c;
                        if (Double.doubleToLongBits(bv4Var.mo3741u(j, zh6Var)) == Double.doubleToLongBits(bv4Var.mo3741u(j, zh6Var2))) {
                            continue;
                            break;
                        }
                    }
                case 1:
                    if (m11911m(zh6Var, zh6Var2, i)) {
                        bv4 bv4Var2 = ml6.f25012c;
                        if (Float.floatToIntBits(bv4Var2.mo3736p(j, zh6Var)) == Float.floatToIntBits(bv4Var2.mo3736p(j, zh6Var2))) {
                            continue;
                            break;
                        }
                    }
                case 2:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8351g(j, zh6Var) == ml6.m8351g(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 3:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8351g(j, zh6Var) == ml6.m8351g(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 4:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8349e(j, zh6Var) == ml6.m8349e(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 5:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8351g(j, zh6Var) == ml6.m8351g(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 6:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8349e(j, zh6Var) == ml6.m8349e(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 7:
                    if (m11911m(zh6Var, zh6Var2, i)) {
                        bv4 bv4Var3 = ml6.f25012c;
                        if (bv4Var3.mo3734n(j, zh6Var) == bv4Var3.mo3734n(j, zh6Var2)) {
                            continue;
                            break;
                        }
                    }
                case 8:
                    if (m11911m(zh6Var, zh6Var2, i) && jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 9:
                    if (m11911m(zh6Var, zh6Var2, i) && jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 10:
                    if (m11911m(zh6Var, zh6Var2, i) && jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 11:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8349e(j, zh6Var) == ml6.m8349e(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 12:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8349e(j, zh6Var) == ml6.m8349e(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 13:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8349e(j, zh6Var) == ml6.m8349e(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 14:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8351g(j, zh6Var) == ml6.m8351g(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 15:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8349e(j, zh6Var) == ml6.m8349e(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 16:
                    if (m11911m(zh6Var, zh6Var2, i) && ml6.m8351g(j, zh6Var) == ml6.m8351g(j, zh6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 17:
                    if (m11911m(zh6Var, zh6Var2, i) && jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2))) {
                        continue;
                        break;
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
                    zM7138a = jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2));
                    break;
                case 50:
                    zM7138a = jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2));
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
                    if (ml6.m8349e(j2, zh6Var) == ml6.m8349e(j2, zh6Var2) && jk6.m7138a(ml6.m8352h(j, zh6Var), ml6.m8352h(j, zh6Var2))) {
                        continue;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            if (zM7138a) {
            }
        }
        return zh6Var.zzc.equals(zh6Var2.zzc);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: f */
    public final zh6 mo6028f() {
        return (zh6) ((zh6) this.f32691e).mo97n(4);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.gk6
    /* JADX INFO: renamed from: g */
    public final int mo6029g(zh6 zh6Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f32687a;
            if (i5 >= iArr.length) {
                return zh6Var.zzc.hashCode() + (i6 * 53);
            }
            int iM11910B = m11910B(i5);
            int i7 = 1048575 & iM11910B;
            int iM11903C = m11903C(iM11910B);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iM11903C) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(ml6.f25012c.mo3741u(j, zh6Var));
                    Charset charset = ni6.f25875a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(ml6.f25012c.mo3736p(j, zh6Var));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = ml6.m8351g(j, zh6Var);
                    Charset charset2 = ni6.f25875a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = ml6.m8351g(j, zh6Var);
                    Charset charset3 = ni6.f25875a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8349e(j, zh6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = ml6.m8351g(j, zh6Var);
                    Charset charset4 = ni6.f25875a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8349e(j, zh6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zMo3734n = ml6.f25012c.mo3734n(j, zh6Var);
                    Charset charset5 = ni6.f25875a;
                    if (zMo3734n) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) ml6.m8352h(j, zh6Var)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objM8352h = ml6.m8352h(j, zh6Var);
                    if (objM8352h != null) {
                        iHashCode = objM8352h.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8352h(j, zh6Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8349e(j, zh6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8349e(j, zh6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8349e(j, zh6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = ml6.m8351g(j, zh6Var);
                    Charset charset6 = ni6.f25875a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8349e(j, zh6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = ml6.m8351g(j, zh6Var);
                    Charset charset7 = ni6.f25875a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objM8352h2 = ml6.m8352h(j, zh6Var);
                    if (objM8352h2 != null) {
                        iHashCode = objM8352h2.hashCode();
                    }
                    i6 = i4 + iHashCode;
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
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8352h(j, zh6Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = ml6.m8352h(j, zh6Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (m11915q(i8, i5, zh6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) ml6.m8352h(j, zh6Var)).doubleValue());
                        Charset charset8 = ni6.f25875a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) ml6.m8352h(j, zh6Var)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (m11915q(i8, i5, zh6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m11906l(j, zh6Var);
                        Charset charset9 = ni6.f25875a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (m11915q(i8, i5, zh6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m11906l(j, zh6Var);
                        Charset charset10 = ni6.f25875a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m11905k(j, zh6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (m11915q(i8, i5, zh6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m11906l(j, zh6Var);
                        Charset charset11 = ni6.f25875a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m11905k(j, zh6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (m11915q(i8, i5, zh6Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) ml6.m8352h(j, zh6Var)).booleanValue();
                        Charset charset12 = ni6.f25875a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) ml6.m8352h(j, zh6Var)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ml6.m8352h(j, zh6Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ml6.m8352h(j, zh6Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m11905k(j, zh6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m11905k(j, zh6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m11905k(j, zh6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (m11915q(i8, i5, zh6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m11906l(j, zh6Var);
                        Charset charset13 = ni6.f25875a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m11905k(j, zh6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (m11915q(i8, i5, zh6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m11906l(j, zh6Var);
                        Charset charset14 = ni6.f25875a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (m11915q(i8, i5, zh6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ml6.m8352h(j, zh6Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: h */
    public final void mo6030h(Object obj, byte[] bArr, int i, int i2, C1411zn c1411zn) {
        m11917t(obj, bArr, i, i2, 0, c1411zn);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: i */
    public final void mo6031i(Object obj, Object obj2) {
        Object obj3;
        int[] iArr = this.f32687a;
        if (!m11904j(obj)) {
            C1077qn.m9987m("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (i < iArr.length) {
            int iM11910B = m11910B(i);
            int i2 = iM11910B & 1048575;
            int iM11903C = m11903C(iM11910B);
            int i3 = iArr[i];
            long j = i2;
            switch (iM11903C) {
                case 0:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        bv4 bv4Var = ml6.f25012c;
                        bv4Var.mo3744x(obj3, j, bv4Var.mo3741u(j, obj2));
                        m11914p(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        bv4 bv4Var2 = ml6.f25012c;
                        bv4Var2.mo3740t(obj3, j, bv4Var2.mo3736p(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.f25012c.f15653b.putLong(obj3, j, ml6.m8351g(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.f25012c.f15653b.putLong(obj3, j, ml6.m8351g(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8350f(j, ml6.m8349e(j, obj2), obj3);
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.f25012c.f15653b.putLong(obj3, j, ml6.m8351g(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8350f(j, ml6.m8349e(j, obj2), obj3);
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        bv4 bv4Var3 = ml6.f25012c;
                        bv4Var3.mo3735o(j, obj3, bv4Var3.mo3734n(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8353i(j, obj3, ml6.m8352h(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    m11918v(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8353i(j, obj3, ml6.m8352h(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8350f(j, ml6.m8349e(j, obj2), obj3);
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8350f(j, ml6.m8349e(j, obj2), obj3);
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8350f(j, ml6.m8349e(j, obj2), obj3);
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.f25012c.f15653b.putLong(obj3, j, ml6.m8351g(j, obj2));
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (m11913o(i, obj2)) {
                        ml6.m8350f(j, ml6.m8349e(j, obj2), obj3);
                        m11914p(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (m11913o(i, obj2)) {
                        obj3 = obj;
                        ml6.f25012c.f15653b.putLong(obj3, j, ml6.m8351g(j, obj2));
                        m11914p(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    m11918v(i, obj, obj2);
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
                    mi6 mi6VarMo4032o = (mi6) ml6.m8352h(j, obj);
                    mi6 mi6Var = (mi6) ml6.m8352h(j, obj2);
                    int size = mi6VarMo4032o.size();
                    int size2 = mi6Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((hf6) mi6VarMo4032o).f20538a) {
                            mi6VarMo4032o = mi6VarMo4032o.mo4032o(size2 + size);
                        }
                        mi6VarMo4032o.addAll(mi6Var);
                    }
                    if (size > 0) {
                        mi6Var = mi6VarMo4032o;
                    }
                    ml6.m8353i(j, obj, mi6Var);
                    break;
                case 50:
                    yj5 yj5Var = jk6.f22377a;
                    ml6.m8353i(j, obj, sx5.m10946b(ml6.m8352h(j, obj), ml6.m8352h(j, obj2)));
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
                    if (m11915q(i3, i, obj2)) {
                        ml6.m8353i(j, obj, ml6.m8352h(j, obj2));
                        ml6.m8350f(iArr[i + 2] & 1048575, i3, obj);
                    }
                    break;
                case 60:
                    m11919w(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m11915q(i3, i, obj2)) {
                        ml6.m8353i(j, obj, ml6.m8352h(j, obj2));
                        ml6.m8350f(iArr[i + 2] & 1048575, i3, obj);
                    }
                    break;
                case 68:
                    m11919w(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        jk6.m7139b(obj, obj2);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11911m(zh6 zh6Var, zh6 zh6Var2, int i) {
        return m11913o(i, zh6Var) == m11913o(i, zh6Var2);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11912n(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m11913o(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: o */
    public final boolean m11913o(int i, Object obj) {
        int i2 = this.f32687a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & ml6.m8349e(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM11910B = m11910B(i);
        long j2 = iM11910B & 1048575;
        switch (m11903C(iM11910B)) {
            case 0:
                if (Double.doubleToRawLongBits(ml6.f25012c.mo3741u(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(ml6.f25012c.mo3736p(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (ml6.m8351g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (ml6.m8351g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (ml6.m8349e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (ml6.m8351g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (ml6.m8349e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return ml6.f25012c.mo3734n(j2, obj);
            case 8:
                Object objM8352h = ml6.m8352h(j2, obj);
                if (objM8352h instanceof String) {
                    if (((String) objM8352h).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM8352h instanceof ig6)) {
                    ds3.m4665g();
                    return false;
                }
                if (ig6.f21412c.equals(objM8352h)) {
                    return false;
                }
                return true;
            case 9:
                if (ml6.m8352h(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (ig6.f21412c.equals(ml6.m8352h(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (ml6.m8349e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (ml6.m8349e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (ml6.m8349e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (ml6.m8351g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (ml6.m8349e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (ml6.m8351g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (ml6.m8352h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                ds3.m4665g();
                return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11914p(int i, Object obj) {
        int i2 = this.f32687a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ml6.m8350f(j, (1 << (i2 >>> 20)) | ml6.m8349e(j, obj), obj);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11915q(int i, int i2, Object obj) {
        return ml6.m8349e((long) (this.f32687a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: r */
    public final int m11916r(int i, int i2) {
        int[] iArr = this.f32687a;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: t */
    public final int m11917t(java.lang.Object r43, byte[] r44, int r45, int r46, int r47, p000.C1411zn r48) {
        /*
            Method dump skipped, instruction units count: 4338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vj6.m11917t(java.lang.Object, byte[], int, int, int, zn):int");
    }

    /* JADX INFO: renamed from: v */
    public final void m11918v(int i, Object obj, Object obj2) {
        if (m11913o(i, obj2)) {
            long jM11910B = m11910B(i) & 1048575;
            Unsafe unsafe = f32686k;
            Object object = unsafe.getObject(obj2, jM11910B);
            if (object == null) {
                int i2 = this.f32687a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            gk6 gk6VarM11920x = m11920x(i);
            if (!m11913o(i, obj)) {
                if (m11904j(object)) {
                    zh6 zh6VarMo6028f = gk6VarM11920x.mo6028f();
                    gk6VarM11920x.mo6031i(zh6VarMo6028f, object);
                    unsafe.putObject(obj, jM11910B, zh6VarMo6028f);
                } else {
                    unsafe.putObject(obj, jM11910B, object);
                }
                m11914p(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM11910B);
            if (!m11904j(object2)) {
                zh6 zh6VarMo6028f2 = gk6VarM11920x.mo6028f();
                gk6VarM11920x.mo6031i(zh6VarMo6028f2, object2);
                unsafe.putObject(obj, jM11910B, zh6VarMo6028f2);
                object2 = zh6VarMo6028f2;
            }
            gk6VarM11920x.mo6031i(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11919w(int i, Object obj, Object obj2) {
        int[] iArr = this.f32687a;
        int i2 = iArr[i];
        if (m11915q(i2, i, obj2)) {
            long jM11910B = m11910B(i) & 1048575;
            Unsafe unsafe = f32686k;
            Object object = unsafe.getObject(obj2, jM11910B);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            gk6 gk6VarM11920x = m11920x(i);
            if (!m11915q(i2, i, obj)) {
                if (m11904j(object)) {
                    zh6 zh6VarMo6028f = gk6VarM11920x.mo6028f();
                    gk6VarM11920x.mo6031i(zh6VarMo6028f, object);
                    unsafe.putObject(obj, jM11910B, zh6VarMo6028f);
                } else {
                    unsafe.putObject(obj, jM11910B, object);
                }
                ml6.m8350f(iArr[i + 2] & 1048575, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM11910B);
            if (!m11904j(object2)) {
                zh6 zh6VarMo6028f2 = gk6VarM11920x.mo6028f();
                gk6VarM11920x.mo6031i(zh6VarMo6028f2, object2);
                unsafe.putObject(obj, jM11910B, zh6VarMo6028f2);
                object2 = zh6VarMo6028f2;
            }
            gk6VarM11920x.mo6031i(object2, object);
        }
    }

    /* JADX INFO: renamed from: x */
    public final gk6 m11920x(int i) {
        Object[] objArr = this.f32688b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        gk6 gk6Var = (gk6) objArr[i3];
        if (gk6Var != null) {
            return gk6Var;
        }
        gk6 gk6VarM3613a = bk6.f15375c.m3613a((Class) objArr[i3 + 1]);
        objArr[i3] = gk6VarM3613a;
        return gk6VarM3613a;
    }

    /* JADX INFO: renamed from: y */
    public final m46 m11921y(int i) {
        int i2 = i / 3;
        return (m46) this.f32688b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: z */
    public final Object m11922z(int i, Object obj) {
        gk6 gk6VarM11920x = m11920x(i);
        int iM11910B = m11910B(i) & 1048575;
        if (!m11913o(i, obj)) {
            return gk6VarM11920x.mo6028f();
        }
        Object object = f32686k.getObject(obj, iM11910B);
        if (m11904j(object)) {
            return object;
        }
        zh6 zh6VarMo6028f = gk6VarM11920x.mo6028f();
        if (object != null) {
            gk6VarM11920x.mo6031i(zh6VarMo6028f, object);
        }
        return zh6VarMo6028f;
    }
}
