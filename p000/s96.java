package p000;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s96 implements na6 {

    /* JADX INFO: renamed from: i */
    public static final int[] f30016i = new int[0];

    /* JADX INFO: renamed from: j */
    public static final Unsafe f30017j = vb6.m11793d();

    /* JADX INFO: renamed from: a */
    public int[] f30018a;

    /* JADX INFO: renamed from: b */
    public Object[] f30019b;

    /* JADX INFO: renamed from: c */
    public int f30020c;

    /* JADX INFO: renamed from: d */
    public int f30021d;

    /* JADX INFO: renamed from: e */
    public u36 f30022e;

    /* JADX INFO: renamed from: f */
    public int[] f30023f;

    /* JADX INFO: renamed from: g */
    public int f30024g;

    /* JADX INFO: renamed from: h */
    public int f30025h;

    /* JADX INFO: renamed from: B */
    public static Field m10567B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            xy4.m12786o(zi4.m13625y("Field ", str, " for ", cls.getName(), " not found. Known fields are "), Arrays.toString(declaredFields), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m10568p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof s66) {
            return ((s66) obj).m10541h();
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static int m10569s(long j, Object obj) {
        return ((Integer) vb6.m11792c(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: u */
    public static int m10570u(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: w */
    public static long m10571w(long j, Object obj) {
        return ((Long) vb6.m11792c(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final Object m10572A(int i, int i2, Object obj) {
        na6 na6VarM10584y = m10584y(i2);
        if (!m10579q(i, i2, obj)) {
            return na6VarM10584y.mo8654a();
        }
        Object object = f30017j.getObject(obj, m10582v(i2) & 1048575);
        if (m10568p(object)) {
            return object;
        }
        s66 s66VarMo8654a = na6VarM10584y.mo8654a();
        if (object != null) {
            na6VarM10584y.mo8659f(s66VarMo8654a, object);
        }
        return s66VarMo8654a;
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: a */
    public final s66 mo8654a() {
        return ((s66) this.f30022e).m10544n();
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: b */
    public final boolean mo8655b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.f30024g) {
            int i6 = this.f30023f[i3];
            int iM10582v = this.m10582v(i6);
            int[] iArr = this.f30018a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = f30017j.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            s96 s96Var = this;
            Object obj2 = obj;
            if ((268435456 & iM10582v) == 0 || s96Var.m10578o(obj2, i6, i, i2, i9)) {
                int iM10570u = m10570u(iM10582v);
                if (iM10570u != 9 && iM10570u != 17) {
                    if (iM10570u != 27) {
                        if (iM10570u == 60 || iM10570u == 68) {
                            if (!s96Var.m10579q(iArr[i6], i6, obj2) || s96Var.m10584y(i6).mo8655b(vb6.m11792c(iM10582v & 1048575, obj2))) {
                            }
                        } else if (iM10570u != 49) {
                            if (iM10570u == 50 && !((d96) vb6.m11792c(iM10582v & 1048575, obj2)).isEmpty()) {
                                int i10 = i6 / 3;
                                throw zi4.m13616p(s96Var.f30019b[i10 + i10]);
                            }
                        }
                        i3++;
                        this = s96Var;
                        obj = obj2;
                        i5 = i;
                        i4 = i2;
                    }
                    List list = (List) vb6.m11792c(iM10582v & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        na6 na6VarM10584y = s96Var.m10584y(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (na6VarM10584y.mo8655b(list.get(i11))) {
                            }
                        }
                    }
                    i3++;
                    this = s96Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!s96Var.m10578o(obj2, i6, i, i2, i9) || s96Var.m10584y(i6).mo8655b(vb6.m11792c(iM10582v & 1048575, obj2))) {
                    i3++;
                    this = s96Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // p000.na6
    /* JADX INFO: renamed from: c */
    public final void mo8656c(Object obj) {
        if (m10568p(obj)) {
            if (obj instanceof s66) {
                s66 s66Var = (s66) obj;
                s66Var.m10540g();
                s66Var.zza = 0;
                s66Var.m10539e();
            }
            int[] iArr = this.f30018a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM10582v = m10582v(i);
                int i2 = 1048575 & iM10582v;
                int iM10570u = m10570u(iM10582v);
                long j = i2;
                Unsafe unsafe = f30017j;
                if (iM10570u != 9) {
                    if (iM10570u != 60 && iM10570u != 68) {
                        switch (iM10570u) {
                            case 17:
                                if (m10577n(i, obj)) {
                                    m10584y(i).mo8656c(unsafe.getObject(obj, j));
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
                                y36 y36Var = (y36) ((f76) vb6.m11792c(j, obj));
                                if (y36Var.f34844a) {
                                    y36Var.f34844a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((d96) object).f16878a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m10579q(iArr[i], i, obj)) {
                        m10584y(i).mo8656c(unsafe.getObject(obj, j));
                    }
                } else if (m10577n(i, obj)) {
                    m10584y(i).mo8656c(unsafe.getObject(obj, j));
                }
            }
            mb6 mb6Var = ((s66) obj).zzc;
            if (mb6Var.f24806e) {
                mb6Var.f24806e = false;
            }
        }
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: d */
    public final int mo8657d(s66 s66Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f30018a.length; i5 += 3) {
            int iM10582v = m10582v(i5);
            int iM10570u = m10570u(iM10582v);
            if (iM10570u <= 50 || iM10570u >= 69) {
                long j = iM10582v & 1048575;
                int iHashCode2 = 37;
                switch (iM10570u) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(vb6.f32513c.mo3731k(j, s66Var));
                        byte[] bArr = j76.f22079a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(vb6.f32513c.mo3733m(j, s66Var));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = vb6.m11791b(j, s66Var);
                        byte[] bArr2 = j76.f22079a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = vb6.m11791b(j, s66Var);
                        byte[] bArr3 = j76.f22079a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11790a(j, s66Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = vb6.m11791b(j, s66Var);
                        byte[] bArr4 = j76.f22079a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11790a(j, s66Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zMo3743w = vb6.f32513c.mo3743w(j, s66Var);
                        byte[] bArr5 = j76.f22079a;
                        i3 = zMo3743w ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) vb6.m11792c(j, s66Var)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM11792c = vb6.m11792c(j, s66Var);
                        if (objM11792c != null) {
                            iHashCode2 = objM11792c.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11792c(j, s66Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11790a(j, s66Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11790a(j, s66Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11790a(j, s66Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = vb6.m11791b(j, s66Var);
                        byte[] bArr6 = j76.f22079a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11790a(j, s66Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = vb6.m11791b(j, s66Var);
                        byte[] bArr7 = j76.f22079a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM11792c2 = vb6.m11792c(j, s66Var);
                        if (objM11792c2 != null) {
                            iHashCode2 = objM11792c2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11792c(j, s66Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = vb6.m11792c(j, s66Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.f30025h;
        while (true) {
            int[] iArr = this.f30023f;
            if (i6 >= iArr.length) {
                return s66Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!m10579q(0, i7, s66Var)) {
                iHashCode = vb6.m11792c(m10582v(i7) & 1048575, s66Var).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // p000.na6
    /* JADX INFO: renamed from: e */
    public final boolean mo8658e(s66 s66Var, s66 s66Var2) {
        boolean zM10263e;
        int[] iArr = this.f30018a;
        for (int i = 0; i < iArr.length; i += 3) {
            int iM10582v = m10582v(i);
            int iM10570u = m10570u(iM10582v);
            if (iM10570u <= 50 || iM10570u >= 69) {
                long j = iM10582v & 1048575;
                switch (iM10570u) {
                    case 0:
                        if (m10576m(s66Var, s66Var2, i)) {
                            bv4 bv4Var = vb6.f32513c;
                            if (Double.doubleToLongBits(bv4Var.mo3731k(j, s66Var)) == Double.doubleToLongBits(bv4Var.mo3731k(j, s66Var2))) {
                                break;
                            }
                        }
                        return false;
                    case 1:
                        if (m10576m(s66Var, s66Var2, i)) {
                            bv4 bv4Var2 = vb6.f32513c;
                            if (Float.floatToIntBits(bv4Var2.mo3733m(j, s66Var)) == Float.floatToIntBits(bv4Var2.mo3733m(j, s66Var2))) {
                                break;
                            }
                        }
                        return false;
                    case 2:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11791b(j, s66Var) != vb6.m11791b(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 3:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11791b(j, s66Var) != vb6.m11791b(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 4:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11790a(j, s66Var) != vb6.m11790a(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 5:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11791b(j, s66Var) != vb6.m11791b(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 6:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11790a(j, s66Var) != vb6.m11790a(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 7:
                        if (m10576m(s66Var, s66Var2, i)) {
                            bv4 bv4Var3 = vb6.f32513c;
                            if (bv4Var3.mo3743w(j, s66Var) == bv4Var3.mo3743w(j, s66Var2)) {
                                break;
                            }
                        }
                        return false;
                    case 8:
                        if (!m10576m(s66Var, s66Var2, i) || !ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2))) {
                            return false;
                        }
                        break;
                        break;
                    case 9:
                        if (!m10576m(s66Var, s66Var2, i) || !ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2))) {
                            return false;
                        }
                        break;
                        break;
                    case 10:
                        if (!m10576m(s66Var, s66Var2, i) || !ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2))) {
                            return false;
                        }
                        break;
                        break;
                    case 11:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11790a(j, s66Var) != vb6.m11790a(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 12:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11790a(j, s66Var) != vb6.m11790a(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 13:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11790a(j, s66Var) != vb6.m11790a(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 14:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11791b(j, s66Var) != vb6.m11791b(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 15:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11790a(j, s66Var) != vb6.m11790a(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 16:
                        if (!m10576m(s66Var, s66Var2, i) || vb6.m11791b(j, s66Var) != vb6.m11791b(j, s66Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 17:
                        if (!m10576m(s66Var, s66Var2, i) || !ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2))) {
                            return false;
                        }
                        break;
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
                        zM10263e = ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2));
                        if (!zM10263e) {
                            return false;
                        }
                        break;
                        break;
                    case 50:
                        zM10263e = ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2));
                        if (!zM10263e) {
                            return false;
                        }
                        break;
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
                        if (vb6.m11790a(j2, s66Var) == vb6.m11790a(j2, s66Var2) && ra6.m10263e(vb6.m11792c(j, s66Var), vb6.m11792c(j, s66Var2))) {
                            break;
                        }
                        return false;
                    default:
                        continue;
                }
            }
        }
        int i2 = this.f30025h;
        while (true) {
            int[] iArr2 = this.f30023f;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                long j3 = iArr[i3 + 2] & 1048575;
                if (vb6.m11790a(j3, s66Var) != vb6.m11790a(j3, s66Var2)) {
                    return false;
                }
                if (!m10579q(0, i3, s66Var)) {
                    long jM10582v = m10582v(i3) & 1048575;
                    if (!ra6.m10263e(vb6.m11792c(jM10582v, s66Var), vb6.m11792c(jM10582v, s66Var2))) {
                    }
                }
                i2++;
            } else if (s66Var.zzc.equals(s66Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: f */
    public final void mo8659f(Object obj, Object obj2) {
        Object obj3;
        int[] iArr = this.f30018a;
        if (!m10568p(obj)) {
            C1077qn.m9987m("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (i < iArr.length) {
            int iM10582v = m10582v(i);
            int i2 = iM10582v & 1048575;
            int iM10570u = m10570u(iM10582v);
            int i3 = iArr[i];
            long j = i2;
            switch (iM10570u) {
                case 0:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        bv4 bv4Var = vb6.f32513c;
                        bv4Var.mo3738r(obj3, j, bv4Var.mo3731k(j, obj2));
                        m10575l(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        bv4 bv4Var2 = vb6.f32513c;
                        bv4Var2.mo3740t(obj3, j, bv4Var2.mo3733m(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.f32513c.f15653b.putLong(obj3, j, vb6.m11791b(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.f32513c.f15653b.putLong(obj3, j, vb6.m11791b(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11796g(j, vb6.m11790a(j, obj2), obj3);
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.f32513c.f15653b.putLong(obj3, j, vb6.m11791b(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11796g(j, vb6.m11790a(j, obj2), obj3);
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        bv4 bv4Var3 = vb6.f32513c;
                        bv4Var3.mo3735o(j, obj3, bv4Var3.mo3743w(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11797h(j, obj3, vb6.m11792c(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    m10573j(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11797h(j, obj3, vb6.m11792c(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11796g(j, vb6.m11790a(j, obj2), obj3);
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11796g(j, vb6.m11790a(j, obj2), obj3);
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11796g(j, vb6.m11790a(j, obj2), obj3);
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.f32513c.f15653b.putLong(obj3, j, vb6.m11791b(j, obj2));
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (m10577n(i, obj2)) {
                        vb6.m11796g(j, vb6.m11790a(j, obj2), obj3);
                        m10575l(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (m10577n(i, obj2)) {
                        obj3 = obj;
                        vb6.f32513c.f15653b.putLong(obj3, j, vb6.m11791b(j, obj2));
                        m10575l(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    m10573j(i, obj, obj2);
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
                    f76 f76VarMo5612i = (f76) vb6.m11792c(j, obj);
                    f76 f76Var = (f76) vb6.m11792c(j, obj2);
                    int size = f76VarMo5612i.size();
                    int size2 = f76Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((y36) f76VarMo5612i).f34844a) {
                            f76VarMo5612i = f76VarMo5612i.mo5612i(size2 + size);
                        }
                        f76VarMo5612i.addAll(f76Var);
                    }
                    if (size > 0) {
                        f76Var = f76VarMo5612i;
                    }
                    vb6.m11797h(j, obj, f76Var);
                    break;
                case 50:
                    pj5 pj5Var = ra6.f29122a;
                    vb6.m11797h(j, obj, e96.m5028a(vb6.m11792c(j, obj), vb6.m11792c(j, obj2)));
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
                    if (m10579q(i3, i, obj2)) {
                        vb6.m11797h(j, obj, vb6.m11792c(j, obj2));
                        vb6.m11796g(iArr[i + 2] & 1048575, i3, obj);
                    }
                    break;
                case 60:
                    m10574k(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m10579q(i3, i, obj2)) {
                        vb6.m11797h(j, obj, vb6.m11792c(j, obj2));
                        vb6.m11796g(iArr[i + 2] & 1048575, i3, obj);
                    }
                    break;
                case 68:
                    m10574k(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        ra6.m10273o(obj, obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.na6
    /* JADX INFO: renamed from: g */
    public final void mo8660g(Object obj, rr5 rr5Var) throws za0 {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        s96 s96Var = this;
        n83 n83Var = (n83) rr5Var.f29555b;
        int[] iArr = s96Var.f30018a;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr.length) {
            int iM10582v = s96Var.m10582v(i7);
            int iM10570u = m10570u(iM10582v);
            int i9 = iArr[i7];
            Unsafe unsafe = f30017j;
            if (iM10570u <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iM10582v & i5;
            char c = 3;
            switch (iM10570u) {
                case 0:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8614r(i9, Double.doubleToRawLongBits(vb6.f32513c.mo3731k(j, obj)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 1:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8612p(i9, Float.floatToRawIntBits(vb6.f32513c.mo3733m(j, obj)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 2:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8622z(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 3:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8622z(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 4:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8616t(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 5:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8614r(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 6:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8612p(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 7:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        boolean zMo3743w = vb6.f32513c.mo3743w(j, obj);
                        n83Var.m8621y(i9 << 3);
                        n83Var.m8608l(zMo3743w ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 8:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            String str = (String) object;
                            n83Var.m8621y((i9 << 3) | 2);
                            byte[] bArr = (byte[]) n83Var.f25535e;
                            int i12 = n83Var.f25533c;
                            try {
                                int iM8593B = n83.m8593B(str.length() * 3);
                                int iM8593B2 = n83.m8593B(str.length());
                                if (iM8593B2 == iM8593B) {
                                    int i13 = i12 + iM8593B2;
                                    n83Var.f25533c = i13;
                                    int iM6751a = ic6.m6751a(str, bArr, i13, bArr.length - i13);
                                    n83Var.f25533c = i12;
                                    n83Var.m8621y((iM6751a - i12) - iM8593B2);
                                    n83Var.f25533c = iM6751a;
                                } else {
                                    int i14 = ic6.f21259a;
                                    n83Var.m8621y(lu5.m8114b(str));
                                    int i15 = n83Var.f25533c;
                                    n83Var.f25533c = ic6.m6751a(str, bArr, i15, bArr.length - i15);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new za0("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                            }
                        } else {
                            n83Var.m8610n(i9, (r46) object);
                        }
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 9:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        rr5Var.m10420k(i9, unsafe.getObject(obj, j), s96Var.m10584y(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 10:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8610n(i9, (r46) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 11:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8620x(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 12:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8616t(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 13:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8612p(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 14:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        n83Var.m8614r(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 15:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(obj, j);
                        n83Var.m8620x(i9, (i16 >> 31) ^ (i16 + i16));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 16:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        n83Var.m8622z(i9, (j2 >> 63) ^ (j2 + j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 17:
                    if (s96Var.m10578o(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        n83Var.m8619w(i9, 3);
                        s96Var.m10584y(i7).mo8660g((u36) object2, rr5Var);
                        n83Var.m8619w(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 18:
                    i2 = i7;
                    ra6.m10275q(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 19:
                    i2 = i7;
                    ra6.m10279u(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 20:
                    i2 = i7;
                    ra6.m10281w(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 21:
                    i2 = i7;
                    ra6.m10262d(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 22:
                    i2 = i7;
                    ra6.m10280v(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 23:
                    i2 = i7;
                    ra6.m10278t(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 24:
                    i2 = i7;
                    ra6.m10277s(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 25:
                    i2 = i7;
                    ra6.m10274p(iArr[i2], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 26:
                    int i17 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    pj5 pj5Var = ra6.f29122a;
                    if (list != null && !list.isEmpty()) {
                        byte[] bArr2 = (byte[]) n83Var.f25535e;
                        if (list instanceof m86) {
                            m86 m86Var = (m86) list;
                            int i18 = 0;
                            while (i18 < list.size()) {
                                Object objM8234f = m86Var.m8234f();
                                char c2 = c;
                                if (objM8234f instanceof String) {
                                    String str2 = (String) objM8234f;
                                    n83Var.m8621y((i17 << 3) | 2);
                                    int i19 = n83Var.f25533c;
                                    try {
                                        int iM8593B3 = n83.m8593B(str2.length() * 3);
                                        i4 = i7;
                                        int iM8593B4 = n83.m8593B(str2.length());
                                        if (iM8593B4 == iM8593B3) {
                                            int i20 = i19 + iM8593B4;
                                            n83Var.f25533c = i20;
                                            int iM6751a2 = ic6.m6751a(str2, bArr2, i20, bArr2.length - i20);
                                            n83Var.f25533c = i19;
                                            n83Var.m8621y((iM6751a2 - i19) - iM8593B4);
                                            n83Var.f25533c = iM6751a2;
                                        } else {
                                            int i21 = ic6.f21259a;
                                            n83Var.m8621y(lu5.m8114b(str2));
                                            int i22 = n83Var.f25533c;
                                            n83Var.f25533c = ic6.m6751a(str2, bArr2, i22, bArr2.length - i22);
                                        }
                                    } catch (IndexOutOfBoundsException e2) {
                                        throw new za0("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                                    }
                                } else {
                                    i4 = i7;
                                    n83Var.m8610n(i17, (r46) objM8234f);
                                }
                                i18++;
                                c = c2;
                                i7 = i4;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                String str3 = (String) list.get(i23);
                                n83Var.m8621y((i17 << 3) | 2);
                                int i24 = n83Var.f25533c;
                                try {
                                    int iM8593B5 = n83.m8593B(str3.length() * 3);
                                    int iM8593B6 = n83.m8593B(str3.length());
                                    if (iM8593B6 == iM8593B5) {
                                        int i25 = i24 + iM8593B6;
                                        n83Var.f25533c = i25;
                                        int iM6751a3 = ic6.m6751a(str3, bArr2, i25, bArr2.length - i25);
                                        n83Var.f25533c = i24;
                                        n83Var.m8621y((iM6751a3 - i24) - iM8593B6);
                                        n83Var.f25533c = iM6751a3;
                                    } else {
                                        int i26 = ic6.f21259a;
                                        n83Var.m8621y(lu5.m8114b(str3));
                                        int i27 = n83Var.f25533c;
                                        n83Var.f25533c = ic6.m6751a(str3, bArr2, i27, bArr2.length - i27);
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new za0("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
                                }
                            }
                        }
                        i7 = i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 27:
                    int i28 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    na6 na6VarM10584y = s96Var.m10584y(i7);
                    pj5 pj5Var2 = ra6.f29122a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i29 = 0; i29 < list2.size(); i29++) {
                            rr5Var.m10420k(i28, list2.get(i29), na6VarM10584y);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 28:
                    int i30 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    pj5 pj5Var3 = ra6.f29122a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i31 = 0; i31 < list3.size(); i31++) {
                            n83Var.m8610n(i30, (r46) list3.get(i31));
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 29:
                    z = false;
                    ra6.m10261c(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 30:
                    z = false;
                    ra6.m10276r(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 31:
                    z = false;
                    ra6.m10282x(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 32:
                    z = false;
                    ra6.m10283y(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 33:
                    z = false;
                    ra6.m10259a(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 34:
                    z = false;
                    ra6.m10260b(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 35:
                    ra6.m10275q(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 36:
                    ra6.m10279u(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 37:
                    ra6.m10281w(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 38:
                    ra6.m10262d(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 39:
                    ra6.m10280v(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 40:
                    ra6.m10278t(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 41:
                    ra6.m10277s(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 42:
                    ra6.m10274p(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 43:
                    ra6.m10261c(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 44:
                    ra6.m10276r(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 45:
                    ra6.m10282x(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 46:
                    ra6.m10283y(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 47:
                    ra6.m10259a(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 48:
                    ra6.m10260b(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 49:
                    int i32 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    na6 na6VarM10584y2 = s96Var.m10584y(i7);
                    pj5 pj5Var4 = ra6.f29122a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i33 = 0; i33 < list4.size(); i33++) {
                            u36 u36Var = (u36) list4.get(i33);
                            n83Var.m8619w(i32, 3);
                            na6VarM10584y2.mo8660g(u36Var, rr5Var);
                            n83Var.m8619w(i32, 4);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i34 = i7 / 3;
                        throw zi4.m13616p(s96Var.f30019b[i34 + i34]);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 51:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8614r(i9, Double.doubleToRawLongBits(((Double) vb6.m11792c(j, obj)).doubleValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 52:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8612p(i9, Float.floatToRawIntBits(((Float) vb6.m11792c(j, obj)).floatValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 53:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8622z(i9, m10571w(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 54:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8622z(i9, m10571w(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 55:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8616t(i9, m10569s(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 56:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8614r(i9, m10571w(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 57:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8612p(i9, m10569s(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 58:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        boolean zBooleanValue = ((Boolean) vb6.m11792c(j, obj)).booleanValue();
                        n83Var.m8621y(i9 << 3);
                        n83Var.m8608l(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 59:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            String str4 = (String) object3;
                            n83Var.m8621y((i9 << 3) | 2);
                            byte[] bArr3 = (byte[]) n83Var.f25535e;
                            int i35 = n83Var.f25533c;
                            try {
                                int iM8593B7 = n83.m8593B(str4.length() * 3);
                                int iM8593B8 = n83.m8593B(str4.length());
                                if (iM8593B8 == iM8593B7) {
                                    int i36 = i35 + iM8593B8;
                                    n83Var.f25533c = i36;
                                    int iM6751a4 = ic6.m6751a(str4, bArr3, i36, bArr3.length - i36);
                                    n83Var.f25533c = i35;
                                    n83Var.m8621y((iM6751a4 - i35) - iM8593B8);
                                    n83Var.f25533c = iM6751a4;
                                } else {
                                    int i37 = ic6.f21259a;
                                    n83Var.m8621y(lu5.m8114b(str4));
                                    int i38 = n83Var.f25533c;
                                    n83Var.f25533c = ic6.m6751a(str4, bArr3, i38, bArr3.length - i38);
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                throw new za0("CodedOutputStream was writing to a flat byte array and ran out of space.", e4);
                            }
                        } else {
                            n83Var.m8610n(i9, (r46) object3);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 60:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        rr5Var.m10420k(i9, unsafe.getObject(obj, j), s96Var.m10584y(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 61:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8610n(i9, (r46) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 62:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8620x(i9, m10569s(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 63:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8616t(i9, m10569s(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 64:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8612p(i9, m10569s(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 65:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        n83Var.m8614r(i9, m10571w(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 66:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        int iM10569s = m10569s(j, obj);
                        n83Var.m8620x(i9, (iM10569s >> 31) ^ (iM10569s + iM10569s));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 67:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        long jM10571w = m10571w(j, obj);
                        n83Var.m8622z(i9, (jM10571w >> 63) ^ (jM10571w + jM10571w));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                case 68:
                    if (s96Var.m10579q(i9, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        n83Var.m8619w(i9, 3);
                        s96Var.m10584y(i7).mo8660g((u36) object4, rr5Var);
                        n83Var.m8619w(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    s96Var = this;
                    break;
            }
        }
        ((s66) obj).zzc.m8270d(rr5Var);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0363  */
    /* JADX WARN: Code duplicated, block: B:201:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:233:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:236:0x05af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // p000.na6
    /* JADX INFO: renamed from: h */
    public final int mo8661h(u36 u36Var) {
        int i;
        int iM8593B;
        int iM8594D;
        int iM8593B2;
        int iM8114b;
        int iM8593B3;
        int iMo10537c;
        int i2;
        int iM8593B4;
        int iM10266h;
        int i3;
        int iMo10537c2;
        int iM8593B5;
        int size;
        int iM10272n;
        int iM8593B6;
        int iM8593B7;
        int iM8114b2;
        int iM8114b3;
        int iM8593B8;
        int size2;
        int iM8593B9;
        int iMo10537c3;
        int iM8593B10;
        int iM8594D2;
        int iM10569s;
        int iM8593B11;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM10842h = 0;
        while (true) {
            int[] iArr = this.f30018a;
            if (i6 >= iArr.length) {
                return ((s66) u36Var).zzc.m8268a() + iM10842h;
            }
            int iM10582v = m10582v(i6);
            int iM10570u = m10570u(iM10582v);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            Unsafe unsafe = f30017j;
            if (iM10570u <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(u36Var, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM10582v & i4;
            if (iM10570u >= f66.f18792b.f18796a) {
                byte b = f66.f18793c.f18796a;
            }
            long j = i11;
            switch (iM10570u) {
                case 0:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 8, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 1:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 2:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(u36Var, j);
                        iM8593B = n83.m8593B(i8 << 3);
                        iM8594D = n83.m8594D(j2);
                        iM10266h = iM8594D + iM8593B;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 3:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(u36Var, j);
                        iM8593B = n83.m8593B(i8 << 3);
                        iM8594D = n83.m8594D(j3);
                        iM10266h = iM8594D + iM8593B;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 4:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(u36Var, j);
                        iM8593B = n83.m8593B(i8 << 3);
                        iM8594D = n83.m8594D(j4);
                        iM10266h = iM8594D + iM8593B;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 5:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 8, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 6:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 7:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 1, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 8:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(u36Var, j);
                        if (object instanceof r46) {
                            iM8593B2 = n83.m8593B(i12);
                            iM8114b = ((r46) object).mo8519d();
                        } else {
                            iM8593B2 = n83.m8593B(i12);
                            int i13 = ic6.f21259a;
                            iM8114b = lu5.m8114b((String) object);
                        }
                        iM10842h = sk5.m10843i(iM8114b, iM8114b, iM8593B2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 9:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(u36Var, j);
                        na6 na6VarM10584y = m10584y(i6);
                        pj5 pj5Var = ra6.f29122a;
                        iM8593B3 = n83.m8593B(i8 << 3);
                        iMo10537c = ((u36) object2).mo10537c(na6VarM10584y);
                        iM10842h = sk5.m10843i(iMo10537c, iMo10537c, iM8593B3, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 10:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        r46 r46Var = (r46) unsafe.getObject(u36Var, j);
                        iM8593B2 = n83.m8593B(i8 << 3);
                        iM8114b = r46Var.mo8519d();
                        iM10842h = sk5.m10843i(iM8114b, iM8114b, iM8593B2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 11:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(u36Var, j);
                        iM8593B4 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10842h(i2, iM8593B4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 12:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(u36Var, j);
                        iM8593B = n83.m8593B(i8 << 3);
                        iM8594D = n83.m8594D(j5);
                        iM10266h = iM8594D + iM8593B;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 13:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 14:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        iM10842h = sk5.m10842h(i8 << 3, 8, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 15:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(u36Var, j);
                        iM8593B4 = n83.m8593B(i8 << 3);
                        i2 = (i14 >> 31) ^ (i14 + i14);
                        iM10842h = sk5.m10842h(i2, iM8593B4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 16:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(u36Var, j);
                        iM8593B = n83.m8593B(i8 << 3);
                        iM8594D = n83.m8594D((j6 >> 63) ^ (j6 + j6));
                        iM10266h = iM8594D + iM8593B;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 17:
                    if (m10578o(u36Var, i6, i5, i7, i)) {
                        u36 u36Var2 = (u36) unsafe.getObject(u36Var, j);
                        na6 na6VarM10584y2 = m10584y(i6);
                        pj5 pj5Var2 = ra6.f29122a;
                        int iM8593B12 = n83.m8593B(i8 << 3);
                        i3 = iM8593B12 + iM8593B12;
                        iMo10537c2 = u36Var2.mo10537c(na6VarM10584y2);
                        iM10266h = iMo10537c2 + i3;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 18:
                    iM10266h = ra6.m10266h((List) unsafe.getObject(u36Var, j), i8);
                    iM10842h += iM10266h;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 19:
                    iM10266h = ra6.m10265g((List) unsafe.getObject(u36Var, j), i8);
                    iM10842h += iM10266h;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var3 = ra6.f29122a;
                    if (list.size() == 0) {
                        iM8593B5 = 0;
                    } else {
                        iM8593B5 = (n83.m8593B(i8 << 3) * list.size()) + ra6.m10268j(list);
                    }
                    iM10842h += iM8593B5;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var4 = ra6.f29122a;
                    size = list2.size();
                    if (size == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM10272n = ra6.m10272n(list2);
                        iM8593B6 = n83.m8593B(i8 << 3);
                        iM8593B7 = (iM8593B6 * size) + iM10272n;
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var5 = ra6.f29122a;
                    size = list3.size();
                    if (size == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM10272n = ra6.m10267i(list3);
                        iM8593B6 = n83.m8593B(i8 << 3);
                        iM8593B7 = (iM8593B6 * size) + iM10272n;
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 23:
                    iM10266h = ra6.m10266h((List) unsafe.getObject(u36Var, j), i8);
                    iM10842h += iM10266h;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 24:
                    iM10266h = ra6.m10265g((List) unsafe.getObject(u36Var, j), i8);
                    iM10842h += iM10266h;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var6 = ra6.f29122a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM8593B5 = 0;
                    } else {
                        iM8593B5 = (n83.m8593B(i8 << 3) + 1) * size3;
                    }
                    iM10842h += iM8593B5;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var7 = ra6.f29122a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM8593B7 = n83.m8593B(i8 << 3) * size4;
                        if (list5 instanceof m86) {
                            m86 m86Var = (m86) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object objM8234f = m86Var.m8234f();
                                if (objM8234f instanceof r46) {
                                    iM8114b3 = ((r46) objM8234f).mo8519d();
                                } else {
                                    int i16 = ic6.f21259a;
                                    iM8114b3 = lu5.m8114b((String) objM8234f);
                                }
                                iM8593B7 = sk5.m10842h(iM8114b3, iM8114b3, iM8593B7);
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof r46) {
                                    iM8114b2 = ((r46) obj).mo8519d();
                                } else {
                                    int i18 = ic6.f21259a;
                                    iM8114b2 = lu5.m8114b((String) obj);
                                }
                                iM8593B7 = sk5.m10842h(iM8114b2, iM8114b2, iM8593B7);
                            }
                        }
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(u36Var, j);
                    na6 na6VarM10584y3 = m10584y(i6);
                    pj5 pj5Var8 = ra6.f29122a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM8593B8 = 0;
                    } else {
                        iM8593B8 = n83.m8593B(i8 << 3) * size5;
                        for (int i19 = 0; i19 < size5; i19++) {
                            int iMo10537c4 = ((u36) list6.get(i19)).mo10537c(na6VarM10584y3);
                            iM8593B8 = sk5.m10842h(iMo10537c4, iMo10537c4, iM8593B8);
                        }
                    }
                    iM10842h += iM8593B8;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var9 = ra6.f29122a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM8593B7 = n83.m8593B(i8 << 3) * size6;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int iMo8519d = ((r46) list7.get(i20)).mo8519d();
                            iM8593B7 = sk5.m10842h(iMo8519d, iMo8519d, iM8593B7);
                        }
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var10 = ra6.f29122a;
                    size = list8.size();
                    if (size == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM10272n = ra6.m10271m(list8);
                        iM8593B6 = n83.m8593B(i8 << 3);
                        iM8593B7 = (iM8593B6 * size) + iM10272n;
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var11 = ra6.f29122a;
                    size = list9.size();
                    if (size == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM10272n = ra6.m10264f(list9);
                        iM8593B6 = n83.m8593B(i8 << 3);
                        iM8593B7 = (iM8593B6 * size) + iM10272n;
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 31:
                    iM10266h = ra6.m10265g((List) unsafe.getObject(u36Var, j), i8);
                    iM10842h += iM10266h;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 32:
                    iM10266h = ra6.m10266h((List) unsafe.getObject(u36Var, j), i8);
                    iM10842h += iM10266h;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var12 = ra6.f29122a;
                    size = list10.size();
                    if (size == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM10272n = ra6.m10269k(list10);
                        iM8593B6 = n83.m8593B(i8 << 3);
                        iM8593B7 = (iM8593B6 * size) + iM10272n;
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var13 = ra6.f29122a;
                    size = list11.size();
                    if (size == 0) {
                        iM8593B7 = 0;
                    } else {
                        iM10272n = ra6.m10270l(list11);
                        iM8593B6 = n83.m8593B(i8 << 3);
                        iM8593B7 = (iM8593B6 * size) + iM10272n;
                    }
                    iM10842h += iM8593B7;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var14 = ra6.f29122a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var15 = ra6.f29122a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 37:
                    size2 = ra6.m10268j((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 38:
                    size2 = ra6.m10272n((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 39:
                    size2 = ra6.m10267i((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var16 = ra6.f29122a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var17 = ra6.f29122a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var18 = ra6.f29122a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 43:
                    size2 = ra6.m10271m((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 44:
                    size2 = ra6.m10264f((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var19 = ra6.f29122a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(u36Var, j);
                    pj5 pj5Var20 = ra6.f29122a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 47:
                    size2 = ra6.m10269k((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 48:
                    size2 = ra6.m10270l((List) unsafe.getObject(u36Var, j));
                    if (size2 > 0) {
                        iM8593B9 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10843i(size2, iM8593B9, size2, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(u36Var, j);
                    na6 na6VarM10584y4 = m10584y(i6);
                    pj5 pj5Var21 = ra6.f29122a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iMo10537c3 = 0;
                    } else {
                        iMo10537c3 = 0;
                        for (int i21 = 0; i21 < size7; i21++) {
                            u36 u36Var3 = (u36) list19.get(i21);
                            int iM8593B13 = n83.m8593B(i8 << 3);
                            iMo10537c3 += u36Var3.mo10537c(na6VarM10584y4) + iM8593B13 + iM8593B13;
                        }
                    }
                    iM10842h += iMo10537c3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 50:
                    int i22 = i6 / 3;
                    d96 d96Var = (d96) unsafe.getObject(u36Var, j);
                    if (this.f30019b[i22 + i22] != null) {
                        xy4.m12778e();
                        return 0;
                    }
                    if (d96Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = d96Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 51:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 8, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 52:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 53:
                    if (m10579q(i8, i6, u36Var)) {
                        long jM10571w = m10571w(j, u36Var);
                        iM8593B10 = n83.m8593B(i8 << 3);
                        iM8594D2 = n83.m8594D(jM10571w);
                        iM10842h += iM8594D2 + iM8593B10;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 54:
                    if (m10579q(i8, i6, u36Var)) {
                        long jM10571w2 = m10571w(j, u36Var);
                        iM8593B10 = n83.m8593B(i8 << 3);
                        iM8594D2 = n83.m8594D(jM10571w2);
                        iM10842h += iM8594D2 + iM8593B10;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 55:
                    if (m10579q(i8, i6, u36Var)) {
                        long jM10569s = m10569s(j, u36Var);
                        iM8593B10 = n83.m8593B(i8 << 3);
                        iM8594D2 = n83.m8594D(jM10569s);
                        iM10842h += iM8594D2 + iM8593B10;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 56:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 8, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 57:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 58:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 1, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 59:
                    if (m10579q(i8, i6, u36Var)) {
                        int i23 = i8 << 3;
                        Object object3 = unsafe.getObject(u36Var, j);
                        if (object3 instanceof r46) {
                            iM8593B3 = n83.m8593B(i23);
                            iMo10537c = ((r46) object3).mo8519d();
                        } else {
                            iM8593B3 = n83.m8593B(i23);
                            int i24 = ic6.f21259a;
                            iMo10537c = lu5.m8114b((String) object3);
                        }
                        iM10842h = sk5.m10843i(iMo10537c, iMo10537c, iM8593B3, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 60:
                    if (m10579q(i8, i6, u36Var)) {
                        Object object4 = unsafe.getObject(u36Var, j);
                        na6 na6VarM10584y5 = m10584y(i6);
                        pj5 pj5Var22 = ra6.f29122a;
                        iM8593B3 = n83.m8593B(i8 << 3);
                        iMo10537c = ((u36) object4).mo10537c(na6VarM10584y5);
                        iM10842h = sk5.m10843i(iMo10537c, iMo10537c, iM8593B3, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 61:
                    if (m10579q(i8, i6, u36Var)) {
                        r46 r46Var2 = (r46) unsafe.getObject(u36Var, j);
                        iM8593B3 = n83.m8593B(i8 << 3);
                        iMo10537c = r46Var2.mo8519d();
                        iM10842h = sk5.m10843i(iMo10537c, iMo10537c, iM8593B3, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 62:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10569s = m10569s(j, u36Var);
                        iM8593B11 = n83.m8593B(i8 << 3);
                        iM10842h = sk5.m10842h(iM10569s, iM8593B11, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 63:
                    if (m10579q(i8, i6, u36Var)) {
                        long jM10569s2 = m10569s(j, u36Var);
                        iM8593B10 = n83.m8593B(i8 << 3);
                        iM8594D2 = n83.m8594D(jM10569s2);
                        iM10842h += iM8594D2 + iM8593B10;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 64:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 4, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 65:
                    if (m10579q(i8, i6, u36Var)) {
                        iM10842h = sk5.m10842h(i8 << 3, 8, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 66:
                    if (m10579q(i8, i6, u36Var)) {
                        int iM10569s2 = m10569s(j, u36Var);
                        iM8593B11 = n83.m8593B(i8 << 3);
                        iM10569s = (iM10569s2 >> 31) ^ (iM10569s2 + iM10569s2);
                        iM10842h = sk5.m10842h(iM10569s, iM8593B11, iM10842h);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 67:
                    if (m10579q(i8, i6, u36Var)) {
                        long jM10571w3 = m10571w(j, u36Var);
                        iM8593B10 = n83.m8593B(i8 << 3);
                        iM8594D2 = n83.m8594D((jM10571w3 >> 63) ^ (jM10571w3 + jM10571w3));
                        iM10842h += iM8594D2 + iM8593B10;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 68:
                    if (m10579q(i8, i6, u36Var)) {
                        u36 u36Var4 = (u36) unsafe.getObject(u36Var, j);
                        na6 na6VarM10584y6 = m10584y(i6);
                        pj5 pj5Var23 = ra6.f29122a;
                        int iM8593B14 = n83.m8593B(i8 << 3);
                        i3 = iM8593B14 + iM8593B14;
                        iMo10537c2 = u36Var4.mo10537c(na6VarM10584y6);
                        iM10266h = iMo10537c2 + i3;
                        iM10842h += iM10266h;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                default:
                    i6 += 3;
                    i4 = 1048575;
                    break;
            }
        }
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: i */
    public final void mo8662i(Object obj, byte[] bArr, int i, int i2, C1411zn c1411zn) {
        m10580r(obj, bArr, i, i2, 0, c1411zn);
    }

    /* JADX INFO: renamed from: j */
    public final void m10573j(int i, Object obj, Object obj2) {
        if (m10577n(i, obj2)) {
            long jM10582v = m10582v(i) & 1048575;
            Unsafe unsafe = f30017j;
            Object object = unsafe.getObject(obj2, jM10582v);
            if (object == null) {
                qm5.m9915f(obj2, this.f30018a[i]);
                return;
            }
            na6 na6VarM10584y = m10584y(i);
            if (!m10577n(i, obj)) {
                if (m10568p(object)) {
                    s66 s66VarMo8654a = na6VarM10584y.mo8654a();
                    na6VarM10584y.mo8659f(s66VarMo8654a, object);
                    unsafe.putObject(obj, jM10582v, s66VarMo8654a);
                } else {
                    unsafe.putObject(obj, jM10582v, object);
                }
                m10575l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM10582v);
            if (!m10568p(object2)) {
                s66 s66VarMo8654a2 = na6VarM10584y.mo8654a();
                na6VarM10584y.mo8659f(s66VarMo8654a2, object2);
                unsafe.putObject(obj, jM10582v, s66VarMo8654a2);
                object2 = s66VarMo8654a2;
            }
            na6VarM10584y.mo8659f(object2, object);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10574k(int i, Object obj, Object obj2) {
        int[] iArr = this.f30018a;
        int i2 = iArr[i];
        if (m10579q(i2, i, obj2)) {
            long jM10582v = m10582v(i) & 1048575;
            Unsafe unsafe = f30017j;
            Object object = unsafe.getObject(obj2, jM10582v);
            if (object == null) {
                qm5.m9915f(obj2, iArr[i]);
                return;
            }
            na6 na6VarM10584y = m10584y(i);
            if (!m10579q(i2, i, obj)) {
                if (m10568p(object)) {
                    s66 s66VarMo8654a = na6VarM10584y.mo8654a();
                    na6VarM10584y.mo8659f(s66VarMo8654a, object);
                    unsafe.putObject(obj, jM10582v, s66VarMo8654a);
                } else {
                    unsafe.putObject(obj, jM10582v, object);
                }
                vb6.m11796g(iArr[i + 2] & 1048575, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM10582v);
            if (!m10568p(object2)) {
                s66 s66VarMo8654a2 = na6VarM10584y.mo8654a();
                na6VarM10584y.mo8659f(s66VarMo8654a2, object2);
                unsafe.putObject(obj, jM10582v, s66VarMo8654a2);
                object2 = s66VarMo8654a2;
            }
            na6VarM10584y.mo8659f(object2, object);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10575l(int i, Object obj) {
        int i2 = this.f30018a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        vb6.m11796g(j, (1 << (i2 >>> 20)) | vb6.m11790a(j, obj), obj);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10576m(s66 s66Var, s66 s66Var2, int i) {
        return m10577n(i, s66Var) == m10577n(i, s66Var2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: n */
    public final boolean m10577n(int i, Object obj) {
        int i2 = this.f30018a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & vb6.m11790a(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM10582v = m10582v(i);
        long j2 = iM10582v & 1048575;
        switch (m10570u(iM10582v)) {
            case 0:
                if (Double.doubleToRawLongBits(vb6.f32513c.mo3731k(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(vb6.f32513c.mo3733m(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (vb6.m11791b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (vb6.m11791b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (vb6.m11790a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (vb6.m11791b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (vb6.m11790a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return vb6.f32513c.mo3743w(j2, obj);
            case 8:
                Object objM11792c = vb6.m11792c(j2, obj);
                if (objM11792c instanceof String) {
                    if (((String) objM11792c).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM11792c instanceof r46)) {
                    ds3.m4665g();
                    return false;
                }
                if (r46.f29010b.equals(objM11792c)) {
                    return false;
                }
                return true;
            case 9:
                if (vb6.m11792c(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (r46.f29010b.equals(vb6.m11792c(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (vb6.m11790a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (vb6.m11790a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (vb6.m11790a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (vb6.m11791b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (vb6.m11790a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (vb6.m11791b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (vb6.m11792c(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                ds3.m4665g();
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10578o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m10577n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10579q(int i, int i2, Object obj) {
        return vb6.m11790a((long) (this.f30018a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x033e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0340  */
    /* JADX WARN: Code duplicated, block: B:130:0x0341 A[PHI: r8
  0x0341: PHI (r8v90 byte) = (r8v89 byte), (r8v93 byte) binds: [B:127:0x033c, B:129:0x0340] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x0347  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:563:0x0e0d A[PHI: r3 r4 r5 r11 r13 r31
  0x0e0d: PHI (r3v44 mb6) = 
  (r3v19 mb6)
  (r3v20 mb6)
  (r3v21 mb6)
  (r3v22 mb6)
  (r3v23 mb6)
  (r3v24 mb6)
  (r3v25 mb6)
  (r3v26 mb6)
  (r3v31 mb6)
  (r3v36 mb6)
  (r3v45 mb6)
 binds: [B:561:0x0df6, B:558:0x0dd1, B:555:0x0db0, B:552:0x0d8f, B:549:0x0d6e, B:546:0x0d4c, B:539:0x0d21, B:525:0x0cdd, B:519:0x0c87, B:499:0x0bfa, B:489:0x0b81] A[DONT_GENERATE, DONT_INLINE]
  0x0e0d: PHI (r4v33 zn) = 
  (r4v15 zn)
  (r4v16 zn)
  (r4v17 zn)
  (r4v18 zn)
  (r4v19 zn)
  (r4v20 zn)
  (r4v21 zn)
  (r4v22 zn)
  (r4v25 zn)
  (r4v27 zn)
  (r4v34 zn)
 binds: [B:561:0x0df6, B:558:0x0dd1, B:555:0x0db0, B:552:0x0d8f, B:549:0x0d6e, B:546:0x0d4c, B:539:0x0d21, B:525:0x0cdd, B:519:0x0c87, B:499:0x0bfa, B:489:0x0b81] A[DONT_GENERATE, DONT_INLINE]
  0x0e0d: PHI (r5v43 byte[]) = 
  (r5v11 byte[])
  (r5v12 byte[])
  (r5v13 byte[])
  (r5v14 byte[])
  (r5v15 byte[])
  (r5v16 byte[])
  (r5v17 byte[])
  (r5v18 byte[])
  (r5v24 byte[])
  (r5v30 byte[])
  (r40v0 byte[] A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
 binds: [B:561:0x0df6, B:558:0x0dd1, B:555:0x0db0, B:552:0x0d8f, B:549:0x0d6e, B:546:0x0d4c, B:539:0x0d21, B:525:0x0cdd, B:519:0x0c87, B:499:0x0bfa, B:489:0x0b81] A[DONT_GENERATE, DONT_INLINE]
  0x0e0d: PHI (r11v34 int) = 
  (r11v12 int)
  (r11v13 int)
  (r11v14 int)
  (r11v15 int)
  (r11v16 int)
  (r11v17 int)
  (r11v18 int)
  (r11v19 int)
  (r11v21 int)
  (r11v25 int)
  (r11v35 int)
 binds: [B:561:0x0df6, B:558:0x0dd1, B:555:0x0db0, B:552:0x0d8f, B:549:0x0d6e, B:546:0x0d4c, B:539:0x0d21, B:525:0x0cdd, B:519:0x0c87, B:499:0x0bfa, B:489:0x0b81] A[DONT_GENERATE, DONT_INLINE]
  0x0e0d: PHI (r13v35 int) = 
  (r13v8 int)
  (r13v9 int)
  (r13v10 int)
  (r13v11 int)
  (r13v12 int)
  (r13v13 int)
  (r13v14 int)
  (r13v15 int)
  (r13v19 int)
  (r13v26 int)
  (r4v14 int)
 binds: [B:561:0x0df6, B:558:0x0dd1, B:555:0x0db0, B:552:0x0d8f, B:549:0x0d6e, B:546:0x0d4c, B:539:0x0d21, B:525:0x0cdd, B:519:0x0c87, B:499:0x0bfa, B:489:0x0b81] A[DONT_GENERATE, DONT_INLINE]
  0x0e0d: PHI (r31v21 int) = 
  (r31v0 int)
  (r31v1 int)
  (r31v2 int)
  (r31v3 int)
  (r31v4 int)
  (r31v5 int)
  (r31v6 int)
  (r31v7 int)
  (r31v10 int)
  (r31v14 int)
  (r31v22 int)
 binds: [B:561:0x0df6, B:558:0x0dd1, B:555:0x0db0, B:552:0x0d8f, B:549:0x0d6e, B:546:0x0d4c, B:539:0x0d21, B:525:0x0cdd, B:519:0x0c87, B:499:0x0bfa, B:489:0x0b81] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:565:0x0e10  */
    /* JADX WARN: Code duplicated, block: B:567:0x0e27  */
    /* JADX WARN: Code duplicated, block: B:653:0x0aea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0aff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0360 A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final int m10580r(Object obj, byte[] bArr, int i, int i2, int i3, C1411zn c1411zn) {
        Unsafe unsafe;
        Object obj2;
        int i4;
        int iM10581t;
        mb6 mb6Var;
        int i5;
        int i6;
        int i7;
        C1411zn c1411zn2;
        int iM4346g;
        int i8;
        int i9;
        mb6 mb6Var2;
        int i10;
        char c;
        int i11;
        byte[] bArr2;
        C1411zn c1411zn3;
        mb6 mb6Var3;
        int iM4340a;
        int iM4347h;
        d96 d96Var;
        Unsafe unsafe2;
        int i12;
        char c2;
        int i13;
        int i14;
        int iM4347h2;
        int iM4345f;
        int i15;
        String str;
        int i16;
        mb6 mb6Var4;
        int i17;
        int i18;
        int iM4349j;
        f76 f76Var;
        int i19;
        mb6 mb6Var5;
        int i20;
        mb6 mb6VarM8267b;
        int i21;
        int i22;
        byte[] bArr3;
        int i23;
        C1411zn c1411zn4;
        int iM4350k;
        Object obj3;
        Unsafe unsafe3;
        Unsafe unsafe4;
        Object obj4;
        byte[] bArr4;
        C1411zn c1411zn5;
        int i24;
        C1411zn c1411zn6;
        Unsafe unsafe5;
        byte[] bArr5;
        int iM4347h3;
        int i25;
        byte b;
        int i26;
        int i27;
        byte b2;
        int iM4340a2;
        s96 s96Var = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i2 = i2;
        C1411zn c1411zn7 = c1411zn;
        Object[] objArr = s96Var.f30019b;
        int[] iArr = s96Var.f30018a;
        int i28 = s96Var.f30021d;
        if (!m10568p(obj5)) {
            C1077qn.m9987m("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int iM4344e = i;
        int i29 = -1;
        int i30 = 0;
        int i31 = 1048575;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        while (true) {
            Unsafe unsafe6 = f30017j;
            if (iM4344e < i2) {
                int iM4348i = iM4344e + 1;
                int i35 = bArr6[iM4344e];
                if (i35 < 0) {
                    iM4348i = d46.m4348i(i35, bArr6, iM4348i, c1411zn7);
                    i35 = c1411zn7.f36190a;
                }
                int i36 = iM4348i;
                int i37 = i35;
                i29 = (i37 == true ? 1 : 0) >>> 3;
                int i38 = s96Var.f30020c;
                if (i29 > i29) {
                    int i39 = i30 / 3;
                    if (i29 < i38 || i29 > i28) {
                        iM10581t = -1;
                    } else {
                        iM10581t = s96Var.m10581t(i29, i39);
                    }
                } else if (i29 < i38 || i29 > i28) {
                    iM10581t = -1;
                } else {
                    iM10581t = s96Var.m10581t(i29, 0);
                }
                mb6 mb6Var6 = mb6.f24801f;
                if (iM10581t == -1) {
                    bArr = bArr;
                    mb6Var = mb6Var6;
                    objArr = objArr;
                    iArr = iArr;
                    i28 = i28;
                    i5 = i29;
                    i4 = i37 == true ? 1 : 0;
                    i6 = 0;
                    unsafe = unsafe6;
                    obj2 = obj5;
                    i7 = i36;
                    c1411zn2 = c1411zn7;
                } else {
                    int i40 = (i37 == true ? 1 : 0) & 7;
                    int i41 = iArr[iM10581t + 1];
                    int iM10570u = m10570u(i41);
                    objArr = objArr;
                    iArr = iArr;
                    long j = i41 & i34;
                    Unsafe unsafe7 = f30017j;
                    String str2 = "";
                    if (iM10570u <= 17) {
                        int i42 = iArr[iM10581t + 2];
                        int i43 = 1 << (i42 >>> 20);
                        i31 = i42 & i34;
                        if (i31 != i31) {
                            int i44 = i34;
                            if (i31 != i44) {
                                unsafe6.putInt(obj5, i31, i32);
                                i44 = 1048575;
                            }
                            i32 = i31 == i44 ? 0 : unsafe6.getInt(obj5, i31);
                        } else {
                            i31 = i31;
                        }
                        switch (iM10570u) {
                            case 0:
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                bArr3 = bArr;
                                i23 = i37 == true ? 1 : 0;
                                c1411zn4 = c1411zn;
                                if (i40 == 1) {
                                    iM4350k = i7 + 8;
                                    i32 |= i43;
                                    vb6.f32513c.mo3738r(obj5, j, Double.longBitsToDouble(d46.m4353n(i7, bArr3)));
                                    iM4344e = iM4350k;
                                    bArr6 = bArr3;
                                    i30 = i6;
                                    c1411zn7 = c1411zn4;
                                    i33 = i23;
                                    i31 = i8;
                                    i28 = i28;
                                } else {
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 1:
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                bArr3 = bArr;
                                i23 = i37 == true ? 1 : 0;
                                c1411zn4 = c1411zn;
                                if (i40 == 5) {
                                    i32 |= i43;
                                    vb6.f32513c.mo3740t(obj5, j, Float.intBitsToFloat(d46.m4342c(i7, bArr3)));
                                    iM4344e = i7 + 4;
                                    bArr6 = bArr3;
                                    i30 = i6;
                                    c1411zn7 = c1411zn4;
                                    i33 = i23;
                                    i31 = i8;
                                    i28 = i28;
                                } else {
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 2:
                            case 3:
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                bArr3 = bArr;
                                i23 = i37 == true ? 1 : 0;
                                c1411zn4 = c1411zn;
                                if (i40 == 0) {
                                    i32 |= i43;
                                    iM4350k = d46.m4350k(bArr3, i7, c1411zn4);
                                    unsafe6.putLong(obj5, j, c1411zn4.f36191b);
                                    iM4344e = iM4350k;
                                    bArr6 = bArr3;
                                    i30 = i6;
                                    c1411zn7 = c1411zn4;
                                    i33 = i23;
                                    i31 = i8;
                                    i28 = i28;
                                } else {
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 4:
                            case 11:
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                bArr3 = bArr;
                                i23 = i37 == true ? 1 : 0;
                                c1411zn4 = c1411zn;
                                if (i40 == 0) {
                                    i32 |= i43;
                                    int iM4347h4 = d46.m4347h(bArr3, i7, c1411zn4);
                                    unsafe6.putInt(obj5, j, c1411zn4.f36190a);
                                    iM4344e = iM4347h4;
                                    bArr6 = bArr3;
                                    i30 = i6;
                                    c1411zn7 = c1411zn4;
                                    i33 = i23;
                                    i31 = i8;
                                    i2 = i2;
                                } else {
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 5:
                            case 14:
                                obj3 = obj5;
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                unsafe3 = unsafe6;
                                i23 = i37 == true ? 1 : 0;
                                if (i40 == 1) {
                                    iM4350k = i7 + 8;
                                    i32 |= i43;
                                    c1411zn4 = c1411zn;
                                    bArr3 = bArr;
                                    obj5 = obj3;
                                    unsafe3.putLong(obj5, j, d46.m4353n(i7, bArr));
                                    iM4344e = iM4350k;
                                    bArr6 = bArr3;
                                    i30 = i6;
                                    c1411zn7 = c1411zn4;
                                    i33 = i23;
                                    i31 = i8;
                                    i28 = i28;
                                } else {
                                    bArr3 = bArr;
                                    c1411zn4 = c1411zn;
                                    unsafe6 = unsafe3;
                                    obj5 = obj3;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 6:
                            case 13:
                                c1411zn6 = c1411zn;
                                obj3 = obj5;
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                unsafe5 = unsafe6;
                                i23 = i37 == true ? 1 : 0;
                                bArr5 = bArr;
                                if (i40 == 5) {
                                    i32 |= i43;
                                    unsafe5.putInt(obj3, j, d46.m4342c(i7, bArr5));
                                    bArr6 = bArr5;
                                    iM4344e = i7 + 4;
                                    obj5 = obj3;
                                    i30 = i6;
                                    i29 = i29;
                                    i33 = i23 == true ? 1 : 0;
                                    objArr = objArr;
                                    iArr = iArr;
                                    i31 = i8;
                                    c1411zn7 = c1411zn6;
                                    i2 = i2;
                                } else {
                                    bArr3 = bArr5;
                                    unsafe6 = unsafe5;
                                    c1411zn4 = c1411zn6;
                                    obj5 = obj3;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 7:
                                c1411zn6 = c1411zn;
                                obj3 = obj5;
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                unsafe5 = unsafe6;
                                i23 = i37 == true ? 1 : 0;
                                bArr5 = bArr;
                                if (i40 == 0) {
                                    i32 |= i43;
                                    int iM4350k2 = d46.m4350k(bArr5, i7, c1411zn6);
                                    vb6.f32513c.mo3735o(j, obj3, c1411zn6.f36191b != 0);
                                    bArr6 = bArr5;
                                    iM4344e = iM4350k2;
                                    c1411zn7 = c1411zn6;
                                    obj5 = obj3;
                                    i30 = i6;
                                    i33 = i23;
                                    i31 = i8;
                                    i2 = i2;
                                } else {
                                    bArr3 = bArr5;
                                    unsafe6 = unsafe5;
                                    c1411zn4 = c1411zn6;
                                    obj5 = obj3;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 8:
                                c1411zn6 = c1411zn;
                                obj3 = obj5;
                                i6 = iM10581t;
                                i8 = i31;
                                i7 = i36;
                                i34 = 1048575;
                                unsafe5 = unsafe6;
                                bArr5 = bArr;
                                if (i40 == 2) {
                                    if ((i41 & 536870912) != 0) {
                                        int i45 = i32 | i43;
                                        int iM4347h5 = d46.m4347h(bArr5, i7, c1411zn6);
                                        int i46 = c1411zn6.f36190a;
                                        if (i46 < 0) {
                                            qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i46 == 0) {
                                            c1411zn6.f36192c = "";
                                            i25 = i45;
                                            i23 = i37 == true ? 1 : 0;
                                        } else {
                                            int i47 = ic6.f21259a;
                                            int length = bArr5.length;
                                            if ((iM4347h5 | i46 | ((length - iM4347h5) - i46)) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM4347h5), Integer.valueOf(i46)));
                                            }
                                            int i48 = iM4347h5 + i46;
                                            char[] cArr = new char[i46];
                                            int i49 = 0;
                                            while (true) {
                                                i25 = i45;
                                                if (iM4347h5 < i48 && (b2 = bArr5[iM4347h5]) >= 0) {
                                                    iM4347h5++;
                                                    cArr[i49] = (char) b2;
                                                    i45 = i25;
                                                    i49++;
                                                }
                                            }
                                            while (iM4347h5 < i48) {
                                                int i50 = iM4347h5 + 1;
                                                int i51 = iM4347h5;
                                                byte b3 = bArr5[i51];
                                                if (b3 >= 0) {
                                                    int i52 = i49 + 1;
                                                    cArr[i49] = (char) b3;
                                                    iM4347h5 = i50;
                                                    while (true) {
                                                        i49 = i52;
                                                        if (iM4347h5 >= i48 || (b = bArr5[iM4347h5]) < 0) {
                                                        }
                                                        iM4347h5++;
                                                        i52 = i49 + 1;
                                                        cArr[i49] = (char) b;
                                                    }
                                                } else {
                                                    byte b4 = i37 == true ? 1 : 0;
                                                    if (b3 >= -32) {
                                                        i27 = i48;
                                                        if (b3 >= -16) {
                                                            if (i50 >= i27 - 2) {
                                                                qm5.m9917h("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            byte b5 = bArr5[i50];
                                                            int i53 = i51 + 3;
                                                            byte b6 = bArr5[i51 + 2];
                                                            i26 = i51 + 4;
                                                            byte b7 = bArr5[i53];
                                                            if (!bu5.m3694b(b5)) {
                                                                if ((((b5 + 112) + (b3 << 28)) >> 30) == 0 && !bu5.m3694b(b6) && !bu5.m3694b(b7)) {
                                                                    int i54 = ((b6 & 63) << 6) | ((b5 & 63) << 12) | ((b3 & 7) << 18) | (b7 & 63);
                                                                    cArr[i49] = (char) ((i54 >>> 10) + 55232);
                                                                    cArr[i49 + 1] = (char) ((i54 & 1023) + 56320);
                                                                    i49 += 2;
                                                                }
                                                            }
                                                            qm5.m9917h("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        if (i50 >= i27 - 1) {
                                                            qm5.m9917h("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        int i55 = i49 + 1;
                                                        int i56 = i51 + 2;
                                                        byte b8 = bArr5[i50];
                                                        int i57 = i51 + 3;
                                                        byte b9 = bArr5[i56];
                                                        if (!bu5.m3694b(b8)) {
                                                            if (b3 != -32) {
                                                                if (b3 != -19) {
                                                                    if (!bu5.m3694b(b9)) {
                                                                        cArr[i49] = (char) (((b3 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                                                                        iM4347h5 = i57;
                                                                        i48 = i27;
                                                                        i37 = b4 == true ? 1 : 0;
                                                                        i49 = i55;
                                                                    }
                                                                } else if (b8 < -96) {
                                                                    b3 = -19;
                                                                    if (!bu5.m3694b(b9)) {
                                                                        cArr[i49] = (char) (((b3 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                                                                        iM4347h5 = i57;
                                                                        i48 = i27;
                                                                        i37 = b4 == true ? 1 : 0;
                                                                        i49 = i55;
                                                                    }
                                                                }
                                                            } else if (b8 >= -96) {
                                                                b3 = -32;
                                                                if (b3 != -19) {
                                                                    if (!bu5.m3694b(b9)) {
                                                                        cArr[i49] = (char) (((b3 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                                                                        iM4347h5 = i57;
                                                                        i48 = i27;
                                                                        i37 = b4 == true ? 1 : 0;
                                                                        i49 = i55;
                                                                    }
                                                                } else if (b8 < -96) {
                                                                    b3 = -19;
                                                                    if (!bu5.m3694b(b9)) {
                                                                        cArr[i49] = (char) (((b3 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                                                                        iM4347h5 = i57;
                                                                        i48 = i27;
                                                                        i37 = b4 == true ? 1 : 0;
                                                                        i49 = i55;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        qm5.m9917h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (i50 >= i48) {
                                                        qm5.m9917h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    int i58 = i49 + 1;
                                                    i26 = i51 + 2;
                                                    byte b10 = bArr5[i50];
                                                    i27 = i48;
                                                    if (b3 < -62 || bu5.m3694b(b10)) {
                                                        qm5.m9917h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    cArr[i49] = (char) (((b3 & 31) << 6) | (b10 & 63));
                                                    i49 = i58;
                                                    iM4347h5 = i26;
                                                    i48 = i27;
                                                    i37 = b4 == true ? 1 : 0;
                                                }
                                                break;
                                            }
                                            int i59 = i48;
                                            i23 = i37 == true ? 1 : 0;
                                            String str3 = new String(cArr, 0, i49);
                                            c1411zn6.f36192c = str3;
                                            str2 = str3;
                                            iM4347h5 = i59;
                                        }
                                        i32 = i25;
                                        iM4347h3 = iM4347h5;
                                    } else {
                                        i23 = i37 == true ? 1 : 0;
                                        iM4347h3 = d46.m4347h(bArr5, i7, c1411zn6);
                                        int i60 = c1411zn6.f36190a;
                                        if (i60 < 0) {
                                            qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        int i61 = i32 | i43;
                                        if (i60 == 0) {
                                            c1411zn6.f36192c = "";
                                        } else {
                                            str2 = new String(bArr5, iM4347h3, i60, StandardCharsets.UTF_8);
                                            c1411zn6.f36192c = str2;
                                            iM4347h3 += i60;
                                        }
                                        i32 = i61;
                                    }
                                    unsafe5.putObject(obj3, j, str2);
                                    bArr6 = bArr5;
                                    c1411zn7 = c1411zn6;
                                    iM4344e = iM4347h3;
                                    obj5 = obj3;
                                    i30 = i6;
                                    i33 = i23;
                                    i31 = i8;
                                    i2 = i2;
                                } else {
                                    i23 = i37 == true ? 1 : 0;
                                    bArr3 = bArr5;
                                    unsafe6 = unsafe5;
                                    c1411zn4 = c1411zn6;
                                    obj5 = obj3;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 9:
                                Object obj6 = obj5;
                                unsafe3 = unsafe6;
                                i6 = iM10581t;
                                i34 = 1048575;
                                if (i40 == 2) {
                                    i32 |= i43;
                                    Object objM10585z = s96Var.m10585z(i6, obj6);
                                    iM4344e = d46.m4352m(objM10585z, s96Var.m10584y(i6), bArr, i36, i2, c1411zn);
                                    unsafe7.putObject(obj, s96Var.m10582v(i6) & 1048575, objM10585z);
                                    s96Var.m10575l(i6, obj);
                                    bArr6 = bArr;
                                    c1411zn7 = c1411zn;
                                    obj5 = obj;
                                    i30 = i6;
                                    i29 = i29;
                                    i33 = i37 == true ? 1 : 0;
                                    i2 = i2;
                                } else {
                                    obj3 = obj6;
                                    i7 = i36;
                                    i8 = i31;
                                    i23 = i37 == true ? 1 : 0;
                                    c1411zn4 = c1411zn;
                                    bArr3 = bArr;
                                    unsafe6 = unsafe3;
                                    obj5 = obj3;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 10:
                                Object obj7 = obj5;
                                unsafe4 = unsafe6;
                                obj4 = obj7;
                                bArr4 = bArr;
                                c1411zn5 = c1411zn;
                                i6 = iM10581t;
                                i24 = i36;
                                i34 = 1048575;
                                if (i40 == 2) {
                                    i32 |= i43;
                                    iM4340a2 = d46.m4340a(bArr4, i24, c1411zn5);
                                    unsafe4.putObject(obj4, j, c1411zn5.f36192c);
                                    obj5 = obj4;
                                    iM4344e = iM4340a2;
                                    bArr6 = bArr4;
                                    i30 = i6;
                                    c1411zn7 = c1411zn5;
                                    i29 = i29;
                                    i33 = i37 == true ? 1 : 0;
                                    i2 = i2;
                                } else {
                                    Unsafe unsafe8 = unsafe4;
                                    obj5 = obj4;
                                    unsafe6 = unsafe8;
                                    i8 = i31;
                                    i23 = i37 == true ? 1 : 0;
                                    bArr3 = bArr4;
                                    c1411zn4 = c1411zn5;
                                    i7 = i24;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 12:
                                Object obj8 = obj5;
                                unsafe4 = unsafe6;
                                obj4 = obj8;
                                bArr4 = bArr;
                                c1411zn5 = c1411zn;
                                i6 = iM10581t;
                                i24 = i36;
                                i34 = 1048575;
                                if (i40 == 0) {
                                    int iM4347h6 = d46.m4347h(bArr4, i24, c1411zn5);
                                    int i62 = c1411zn5.f36190a;
                                    e36 e36VarM10583x = s96Var.m10583x(i6);
                                    if ((i41 & Integer.MIN_VALUE) == 0 || e36VarM10583x == null || e36VarM10583x.m4916a(i62)) {
                                        i32 |= i43;
                                        unsafe4.putInt(obj4, j, i62);
                                    } else {
                                        s66 s66Var = (s66) obj4;
                                        mb6 mb6VarM8267b2 = s66Var.zzc;
                                        if (mb6VarM8267b2 == mb6Var6) {
                                            mb6VarM8267b2 = mb6.m8267b();
                                            s66Var.zzc = mb6VarM8267b2;
                                        }
                                        mb6VarM8267b2.m8269c(i37 == true ? 1 : 0, Long.valueOf(i62));
                                    }
                                    obj5 = obj4;
                                    iM4344e = iM4347h6;
                                    bArr6 = bArr4;
                                    i30 = i6;
                                    c1411zn7 = c1411zn5;
                                    i29 = i29;
                                    i33 = i37 == true ? 1 : 0;
                                    i28 = i28;
                                } else {
                                    Unsafe unsafe9 = unsafe4;
                                    obj5 = obj4;
                                    unsafe6 = unsafe9;
                                    i8 = i31;
                                    i23 = i37 == true ? 1 : 0;
                                    bArr3 = bArr4;
                                    c1411zn4 = c1411zn5;
                                    i7 = i24;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 15:
                                Object obj9 = obj5;
                                unsafe4 = unsafe6;
                                obj4 = obj9;
                                bArr4 = bArr;
                                c1411zn5 = c1411zn;
                                i6 = iM10581t;
                                i24 = i36;
                                i34 = 1048575;
                                if (i40 == 0) {
                                    i32 |= i43;
                                    iM4340a2 = d46.m4347h(bArr4, i24, c1411zn5);
                                    unsafe4.putInt(obj4, j, z46.m13335a(c1411zn5.f36190a));
                                    obj5 = obj4;
                                    iM4344e = iM4340a2;
                                    bArr6 = bArr4;
                                    i30 = i6;
                                    c1411zn7 = c1411zn5;
                                    i29 = i29;
                                    i33 = i37 == true ? 1 : 0;
                                    i2 = i2;
                                } else {
                                    Unsafe unsafe10 = unsafe4;
                                    obj5 = obj4;
                                    unsafe6 = unsafe10;
                                    i8 = i31;
                                    i23 = i37 == true ? 1 : 0;
                                    bArr3 = bArr4;
                                    c1411zn4 = c1411zn5;
                                    i7 = i24;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                i6 = iM10581t;
                                i34 = 1048575;
                                if (i40 == 0) {
                                    i32 |= i43;
                                    int iM4350k3 = d46.m4350k(bArr4, i36, c1411zn);
                                    long j2 = c1411zn.f36191b;
                                    obj5 = obj;
                                    c1411zn5 = c1411zn;
                                    unsafe6.putLong(obj5, j, (j2 >>> 1) ^ (-(j2 & 1)));
                                    iM4344e = iM4350k3;
                                    bArr6 = bArr4;
                                    i30 = i6;
                                    c1411zn7 = c1411zn5;
                                    i29 = i29;
                                    i33 = i37 == true ? 1 : 0;
                                    i28 = i28;
                                } else {
                                    obj5 = obj5;
                                    unsafe6 = unsafe6;
                                    i7 = i36;
                                    i8 = i31;
                                    i23 = i37 == true ? 1 : 0;
                                    c1411zn4 = c1411zn;
                                    bArr3 = bArr4;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                            default:
                                if (i40 == 3) {
                                    i32 |= i43;
                                    Object objM10585z2 = s96Var.m10585z(iM10581t, obj5);
                                    int i63 = iM10581t;
                                    iM4344e = d46.m4351l(objM10585z2, s96Var.m10584y(iM10581t), bArr, i36, i2, (i29 << 3) | 4, c1411zn);
                                    i34 = 1048575;
                                    unsafe7.putObject(obj5, s96Var.m10582v(i63) & 1048575, objM10585z2);
                                    s96Var.m10575l(i63, obj5);
                                    i2 = i2;
                                    c1411zn7 = c1411zn;
                                    bArr6 = bArr;
                                    i30 = i63;
                                    i29 = i29;
                                    i33 = i37 == true ? 1 : 0;
                                    i28 = i28;
                                } else {
                                    i6 = iM10581t;
                                    i34 = 1048575;
                                    i8 = i31;
                                    i7 = i36;
                                    bArr3 = bArr;
                                    i23 = i37 == true ? 1 : 0;
                                    c1411zn4 = c1411zn;
                                    mb6Var = mb6Var6;
                                    bArr = bArr3;
                                    i5 = i29;
                                    c1411zn2 = c1411zn4;
                                    i4 = i23;
                                    i31 = i8;
                                    unsafe = unsafe6;
                                    obj2 = obj5;
                                }
                                break;
                        }
                    } else {
                        i28 = i28;
                        i6 = iM10581t;
                        i8 = i31;
                        if (iM10570u != 27) {
                            obj2 = obj5;
                            i9 = i36;
                            if (iM10570u <= 49) {
                                long j3 = i41;
                                f76 f76VarMo5612i = (f76) unsafe6.getObject(obj2, j);
                                if (!((y36) f76VarMo5612i).f34844a) {
                                    int size = f76VarMo5612i.size();
                                    f76VarMo5612i = f76VarMo5612i.mo5612i(size + size);
                                    unsafe6.putObject(obj2, j, f76VarMo5612i);
                                }
                                String str4 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                switch (iM10570u) {
                                    case 18:
                                    case 35:
                                        mb6Var6 = mb6Var6;
                                        i4 = i37 == true ? 1 : 0;
                                        unsafe2 = unsafe6;
                                        i12 = i29;
                                        c2 = 3;
                                        if (i40 == 2) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        if (i40 == 1) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        iM4347h2 = i9;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                        break;
                                    case 19:
                                    case 36:
                                        mb6Var6 = mb6Var6;
                                        i4 = i37 == true ? 1 : 0;
                                        unsafe2 = unsafe6;
                                        i12 = i29;
                                        c2 = 3;
                                        if (i40 == 2) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        if (i40 == 5) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        iM4347h2 = i9;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        mb6Var6 = mb6Var6;
                                        i4 = i37 == true ? 1 : 0;
                                        unsafe2 = unsafe6;
                                        i12 = i29;
                                        c2 = 3;
                                        if (i40 == 2) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        if (i40 == 0) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        iM4347h2 = i9;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe2 = unsafe6;
                                        f76 f76Var2 = f76VarMo5612i;
                                        i12 = i29;
                                        i13 = i37 == true ? 1 : 0;
                                        c2 = 3;
                                        mb6Var6 = mb6Var6;
                                        i14 = i9;
                                        if (i40 != 2) {
                                            if (i40 == 0) {
                                                int iM4349j2 = d46.m4349j(i13 == true ? 1 : 0, bArr, i14, i2, f76Var2, c1411zn);
                                                i4 = i13 == true ? 1 : 0;
                                                i9 = i14;
                                                iM4347h2 = iM4349j2;
                                            }
                                            i9 = i14;
                                            i4 = i13;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        } else {
                                            iM4345f = d46.m4345f(bArr, i14, f76Var2, c1411zn);
                                            iM4347h2 = iM4345f;
                                            i9 = i14;
                                            i4 = i13;
                                        }
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe2 = unsafe6;
                                        i12 = i29;
                                        i13 = i37 == true ? 1 : 0;
                                        c2 = 3;
                                        mb6Var6 = mb6Var6;
                                        i14 = i9;
                                        if (i40 == 2) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        if (i40 == 1) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        i9 = i14;
                                        i4 = i13;
                                        iM4347h2 = i9;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe2 = unsafe6;
                                        f76 f76Var3 = f76VarMo5612i;
                                        i12 = i29;
                                        i13 = i37 == true ? 1 : 0;
                                        mb6 mb6Var7 = mb6Var6;
                                        i14 = i9;
                                        if (i40 != 2) {
                                            mb6Var6 = mb6Var7;
                                            c2 = 3;
                                            if (i40 == 5) {
                                                iM4347h2 = i14 + 4;
                                                u66 u66Var = (u66) f76Var3;
                                                u66Var.m11267d(d46.m4342c(i14, bArr));
                                                while (iM4347h2 < i2) {
                                                    int iM4347h7 = d46.m4347h(bArr, iM4347h2, c1411zn);
                                                    if (i13 == c1411zn.f36190a) {
                                                        u66Var.m11267d(d46.m4342c(iM4347h7, bArr));
                                                        iM4347h2 = iM4347h7 + 4;
                                                    }
                                                }
                                            }
                                            i9 = i14;
                                            i4 = i13;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        } else {
                                            u66 u66Var2 = (u66) f76Var3;
                                            int iM4347h8 = d46.m4347h(bArr, i14, c1411zn);
                                            int i64 = c1411zn.f36190a;
                                            if (i64 < 0) {
                                                qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i64 > bArr.length - iM4347h8) {
                                                qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i65 = iM4347h8 + i64;
                                            int i66 = u66Var2.f31686c + (i64 >> 2);
                                            int length2 = u66Var2.f31685b.length;
                                            if (i66 <= length2) {
                                                i15 = iM4347h8;
                                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                mb6Var6 = mb6Var7;
                                                c2 = 3;
                                            } else if (length2 != 0) {
                                                while (length2 < i66) {
                                                    length2 = zi4.m13610j(length2, 3, 2, 1, 10);
                                                    str4 = str4;
                                                    iM4347h8 = iM4347h8;
                                                    mb6Var7 = mb6Var7;
                                                }
                                                i15 = iM4347h8;
                                                str = str4;
                                                mb6Var6 = mb6Var7;
                                                c2 = 3;
                                                u66Var2.f31685b = Arrays.copyOf(u66Var2.f31685b, length2);
                                            } else {
                                                i15 = iM4347h8;
                                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                mb6Var6 = mb6Var7;
                                                c2 = 3;
                                                u66Var2.f31685b = new int[Math.max(i66, 10)];
                                            }
                                            iM4345f = i15;
                                            while (iM4345f < i65) {
                                                u66Var2.m11267d(d46.m4342c(iM4345f, bArr));
                                                iM4345f += 4;
                                            }
                                            if (iM4345f != i65) {
                                                qm5.m9917h(str);
                                                return 0;
                                            }
                                            iM4347h2 = iM4345f;
                                        }
                                        i9 = i14;
                                        i4 = i13;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe2 = unsafe6;
                                        i12 = i29;
                                        i16 = i37 == true ? 1 : 0;
                                        mb6Var4 = mb6Var6;
                                        i17 = i9;
                                        if (i40 == 2) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        if (i40 == 0) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        i9 = i17;
                                        i4 = i16;
                                        mb6Var6 = mb6Var4;
                                        c2 = 3;
                                        iM4347h2 = i9;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                        break;
                                    case 26:
                                        unsafe2 = unsafe6;
                                        f76 f76Var4 = f76VarMo5612i;
                                        i12 = i29;
                                        i16 = i37 == true ? 1 : 0;
                                        mb6Var4 = mb6Var6;
                                        i17 = i9;
                                        if (i40 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                iM4347h2 = d46.m4347h(bArr, i17, c1411zn);
                                                int i67 = c1411zn.f36190a;
                                                if (i67 < 0) {
                                                    qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i67 == 0) {
                                                    f76Var4.add("");
                                                } else {
                                                    f76Var4.add(new String(bArr, iM4347h2, i67, StandardCharsets.UTF_8));
                                                    iM4347h2 += i67;
                                                }
                                                while (iM4347h2 < i2) {
                                                    int iM4347h9 = d46.m4347h(bArr, iM4347h2, c1411zn);
                                                    if (i16 == c1411zn.f36190a) {
                                                        iM4347h2 = d46.m4347h(bArr, iM4347h9, c1411zn);
                                                        int i68 = c1411zn.f36190a;
                                                        if (i68 < 0) {
                                                            qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i68 == 0) {
                                                            f76Var4.add("");
                                                        } else {
                                                            f76Var4.add(new String(bArr, iM4347h2, i68, StandardCharsets.UTF_8));
                                                            iM4347h2 += i68;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iM4347h2 = d46.m4347h(bArr, i17, c1411zn);
                                                int i69 = c1411zn.f36190a;
                                                if (i69 < 0) {
                                                    qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i69 == 0) {
                                                    f76Var4.add("");
                                                } else {
                                                    int i70 = iM4347h2 + i69;
                                                    if (!ic6.m6752b(bArr, iM4347h2, i70)) {
                                                        qm5.m9917h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    f76Var4.add(new String(bArr, iM4347h2, i69, StandardCharsets.UTF_8));
                                                    iM4347h2 = i70;
                                                }
                                                while (iM4347h2 < i2) {
                                                    int iM4347h10 = d46.m4347h(bArr, iM4347h2, c1411zn);
                                                    if (i16 == c1411zn.f36190a) {
                                                        iM4347h2 = d46.m4347h(bArr, iM4347h10, c1411zn);
                                                        int i71 = c1411zn.f36190a;
                                                        if (i71 < 0) {
                                                            qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i71 == 0) {
                                                            f76Var4.add("");
                                                        } else {
                                                            int i72 = iM4347h2 + i71;
                                                            if (!ic6.m6752b(bArr, iM4347h2, i72)) {
                                                                qm5.m9917h("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            f76Var4.add(new String(bArr, iM4347h2, i71, StandardCharsets.UTF_8));
                                                            iM4347h2 = i72;
                                                        }
                                                    }
                                                }
                                            }
                                            i9 = i17;
                                            i4 = i16 == true ? 1 : 0;
                                            mb6Var6 = mb6Var4;
                                            c2 = 3;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        } else {
                                            i9 = i17;
                                            i4 = i16;
                                            mb6Var6 = mb6Var4;
                                            c2 = 3;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        }
                                        break;
                                    case 27:
                                        unsafe2 = unsafe6;
                                        f76 f76Var5 = f76VarMo5612i;
                                        i12 = i29;
                                        if (i40 == 2) {
                                            int iM4344e2 = d46.m4344e(s96Var.m10584y(i6), i37 == true ? 1 : 0, bArr, i9, i2, f76Var5, c1411zn);
                                            mb6Var6 = mb6Var6;
                                            c2 = 3;
                                            i4 = i37 == true ? 1 : 0;
                                            iM4347h2 = iM4344e2;
                                        } else {
                                            i9 = i9;
                                            mb6Var6 = mb6Var6;
                                            c2 = 3;
                                            i4 = i37 == true ? 1 : 0;
                                            iM4347h2 = i9;
                                        }
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                    case 28:
                                        unsafe2 = unsafe6;
                                        f76 f76Var6 = f76VarMo5612i;
                                        i12 = i29;
                                        mb6Var4 = mb6Var6;
                                        if (i40 == 2) {
                                            int iM4347h11 = d46.m4347h(bArr, i9, c1411zn);
                                            int i73 = c1411zn.f36190a;
                                            if (i73 < 0) {
                                                qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i73 > bArr.length - iM4347h11) {
                                                qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i73 == 0) {
                                                f76Var6.add(r46.f29010b);
                                            } else {
                                                f76Var6.add(r46.m10202r(bArr, iM4347h11, i73));
                                                iM4347h11 += i73;
                                            }
                                            while (iM4347h11 < i2) {
                                                int iM4347h12 = d46.m4347h(bArr, iM4347h11, c1411zn);
                                                if (i37 != c1411zn.f36190a) {
                                                    i4 = i37 == true ? 1 : 0;
                                                    iM4347h2 = iM4347h11;
                                                    mb6Var6 = mb6Var4;
                                                    c2 = 3;
                                                    if (iM4347h2 != i9) {
                                                        i9 = i9;
                                                        bArr6 = bArr;
                                                        i2 = i2;
                                                        c1411zn7 = c1411zn;
                                                        iM4344e = iM4347h2;
                                                        i33 = i4 == true ? 1 : 0;
                                                        i30 = i6;
                                                        obj5 = obj2;
                                                        i31 = i8;
                                                        i29 = i12;
                                                        i28 = i28;
                                                    } else {
                                                        i9 = i9;
                                                        bArr = bArr;
                                                        c1411zn2 = c1411zn;
                                                        i7 = iM4347h2;
                                                        mb6Var = mb6Var6;
                                                        i31 = i8;
                                                        i5 = i12;
                                                        unsafe = unsafe2;
                                                    }
                                                    break;
                                                } else {
                                                    iM4347h11 = d46.m4347h(bArr, iM4347h12, c1411zn);
                                                    int i74 = c1411zn.f36190a;
                                                    if (i74 < 0) {
                                                        qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i74 > bArr.length - iM4347h11) {
                                                        qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i74 == 0) {
                                                        f76Var6.add(r46.f29010b);
                                                    } else {
                                                        f76Var6.add(r46.m10202r(bArr, iM4347h11, i74));
                                                        iM4347h11 += i74;
                                                    }
                                                }
                                            }
                                            i4 = i37 == true ? 1 : 0;
                                            iM4347h2 = iM4347h11;
                                            mb6Var6 = mb6Var4;
                                            c2 = 3;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        } else {
                                            i4 = i37 == true ? 1 : 0;
                                            mb6Var6 = mb6Var4;
                                            c2 = 3;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i40 == 2) {
                                            iM4349j = d46.m4345f(bArr, i9, f76VarMo5612i, c1411zn);
                                            f76Var = f76VarMo5612i;
                                            i9 = i9;
                                            i18 = i37 == true ? 1 : 0;
                                        } else if (i40 != 0) {
                                            unsafe2 = unsafe6;
                                            i12 = i29;
                                            mb6Var6 = mb6Var6;
                                            i4 = i37 == true ? 1 : 0;
                                            i9 = i9;
                                            c2 = 3;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        } else {
                                            f76 f76Var7 = f76VarMo5612i;
                                            i18 = i37 == true ? 1 : 0;
                                            iM4349j = d46.m4349j(i18 == true ? 1 : 0, bArr, i9, i2, f76Var7, c1411zn);
                                            f76Var = f76Var7;
                                            i9 = i9;
                                        }
                                        e36 e36VarM10583x2 = s96Var.m10583x(i6);
                                        pj5 pj5Var = ra6.f29122a;
                                        if (e36VarM10583x2 != null) {
                                            int size2 = f76Var.size();
                                            i19 = iM4349j;
                                            mb6 mb6Var8 = null;
                                            int i75 = 0;
                                            int i76 = 0;
                                            while (i75 < size2) {
                                                int i77 = i29;
                                                Integer num = (Integer) f76Var.get(i75);
                                                Unsafe unsafe11 = unsafe6;
                                                int iIntValue = num.intValue();
                                                if (e36VarM10583x2.m4916a(iIntValue)) {
                                                    if (i75 != i76) {
                                                        f76Var.set(i76, num);
                                                    }
                                                    i76++;
                                                    i20 = i75;
                                                    mb6VarM8267b = mb6Var8;
                                                } else {
                                                    if (mb6Var8 == null) {
                                                        s66 s66Var2 = (s66) obj2;
                                                        i20 = i75;
                                                        mb6VarM8267b = s66Var2.zzc;
                                                        if (mb6VarM8267b == mb6Var6) {
                                                            mb6VarM8267b = mb6.m8267b();
                                                            s66Var2.zzc = mb6VarM8267b;
                                                        }
                                                    } else {
                                                        i20 = i75;
                                                        mb6VarM8267b = mb6Var8;
                                                    }
                                                    mb6VarM8267b.m8269c(i77 << 3, Long.valueOf(iIntValue));
                                                }
                                                e36VarM10583x2 = e36VarM10583x2;
                                                unsafe6 = unsafe11;
                                                mb6Var8 = mb6VarM8267b;
                                                i75 = i20 + 1;
                                                mb6Var6 = mb6Var6;
                                                i29 = i77;
                                            }
                                            unsafe2 = unsafe6;
                                            i12 = i29;
                                            mb6Var5 = mb6Var6;
                                            if (i76 != size2) {
                                                f76Var.subList(i76, size2).clear();
                                            }
                                        } else {
                                            i19 = iM4349j;
                                            unsafe2 = unsafe6;
                                            i12 = i29;
                                            mb6Var5 = mb6Var6;
                                        }
                                        i4 = i18;
                                        mb6Var6 = mb6Var5;
                                        iM4347h2 = i19;
                                        c2 = 3;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i21 = i9;
                                        i22 = i37 == true ? 1 : 0;
                                        if (i40 == 2) {
                                            u66 u66Var3 = (u66) f76VarMo5612i;
                                            iM4347h2 = d46.m4347h(bArr, i21, c1411zn);
                                            int i78 = c1411zn.f36190a;
                                            if (i78 < 0) {
                                                qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i78 > bArr.length - iM4347h2) {
                                                qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i79 = i78 + iM4347h2;
                                            while (iM4347h2 < i79) {
                                                iM4347h2 = d46.m4347h(bArr, iM4347h2, c1411zn);
                                                u66Var3.m11267d(z46.m13335a(c1411zn.f36190a));
                                            }
                                            if (iM4347h2 != i79) {
                                                qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else if (i40 != 0) {
                                            unsafe2 = unsafe6;
                                            i4 = i22;
                                            i9 = i21;
                                            i12 = i29;
                                            c2 = 3;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                            break;
                                        } else {
                                            u66 u66Var4 = (u66) f76VarMo5612i;
                                            iM4347h2 = d46.m4347h(bArr, i21, c1411zn);
                                            u66Var4.m11267d(z46.m13335a(c1411zn.f36190a));
                                            while (iM4347h2 < i2) {
                                                int iM4347h13 = d46.m4347h(bArr, iM4347h2, c1411zn);
                                                if (i22 == c1411zn.f36190a) {
                                                    iM4347h2 = d46.m4347h(bArr, iM4347h13, c1411zn);
                                                    u66Var4.m11267d(z46.m13335a(c1411zn.f36190a));
                                                }
                                            }
                                        }
                                        unsafe2 = unsafe6;
                                        i4 = i22;
                                        i9 = i21;
                                        i12 = i29;
                                        c2 = 3;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i21 = i9;
                                        i22 = i37 == true ? 1 : 0;
                                        if (i40 == 2) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        if (i40 == 0) {
                                            xy4.m12778e();
                                            return 0;
                                        }
                                        unsafe2 = unsafe6;
                                        i4 = i22;
                                        i9 = i21;
                                        i12 = i29;
                                        c2 = 3;
                                        iM4347h2 = i9;
                                        if (iM4347h2 != i9) {
                                            i9 = i9;
                                            bArr6 = bArr;
                                            i2 = i2;
                                            c1411zn7 = c1411zn;
                                            iM4344e = iM4347h2;
                                            i33 = i4 == true ? 1 : 0;
                                            i30 = i6;
                                            obj5 = obj2;
                                            i31 = i8;
                                            i29 = i12;
                                            i28 = i28;
                                        } else {
                                            i9 = i9;
                                            bArr = bArr;
                                            c1411zn2 = c1411zn;
                                            i7 = iM4347h2;
                                            mb6Var = mb6Var6;
                                            i31 = i8;
                                            i5 = i12;
                                            unsafe = unsafe2;
                                        }
                                        break;
                                        break;
                                    default:
                                        if (i40 == 3) {
                                            int i80 = ((i37 == true ? 1 : 0) & (-8)) | 4;
                                            na6 na6VarM10584y = s96Var.m10584y(i6);
                                            s66 s66VarMo8654a = na6VarM10584y.mo8654a();
                                            i22 = i37 == true ? 1 : 0;
                                            int iM4351l = d46.m4351l(s66VarMo8654a, na6VarM10584y, bArr, i9, i2, i80, c1411zn);
                                            int i81 = i80;
                                            C1411zn c1411zn8 = c1411zn;
                                            na6VarM10584y.mo8656c(s66VarMo8654a);
                                            c1411zn8.f36192c = s66VarMo8654a;
                                            f76VarMo5612i.add(s66VarMo8654a);
                                            int i82 = iM4351l;
                                            while (true) {
                                                if (i82 < i2) {
                                                    int i83 = i9;
                                                    int iM4347h14 = d46.m4347h(bArr, i82, c1411zn8);
                                                    if (i22 == c1411zn8.f36190a) {
                                                        int i84 = i81;
                                                        s66 s66VarMo8654a2 = na6VarM10584y.mo8654a();
                                                        int iM4351l2 = d46.m4351l(s66VarMo8654a2, na6VarM10584y, bArr, iM4347h14, i2, i84, c1411zn);
                                                        i81 = i84;
                                                        c1411zn8 = c1411zn;
                                                        na6VarM10584y.mo8656c(s66VarMo8654a2);
                                                        c1411zn8.f36192c = s66VarMo8654a2;
                                                        f76VarMo5612i.add(s66VarMo8654a2);
                                                        i82 = iM4351l2;
                                                        i9 = i83;
                                                    } else {
                                                        i21 = i83;
                                                    }
                                                } else {
                                                    i21 = i9;
                                                }
                                            }
                                            iM4347h2 = i82;
                                            unsafe2 = unsafe6;
                                            i4 = i22;
                                            i9 = i21;
                                            i12 = i29;
                                            c2 = 3;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        } else {
                                            mb6Var6 = mb6Var6;
                                            i4 = i37 == true ? 1 : 0;
                                            unsafe2 = unsafe6;
                                            i12 = i29;
                                            c2 = 3;
                                            iM4347h2 = i9;
                                            if (iM4347h2 != i9) {
                                                i9 = i9;
                                                bArr6 = bArr;
                                                i2 = i2;
                                                c1411zn7 = c1411zn;
                                                iM4344e = iM4347h2;
                                                i33 = i4 == true ? 1 : 0;
                                                i30 = i6;
                                                obj5 = obj2;
                                                i31 = i8;
                                                i29 = i12;
                                                i28 = i28;
                                            } else {
                                                i9 = i9;
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i7 = iM4347h2;
                                                mb6Var = mb6Var6;
                                                i31 = i8;
                                                i5 = i12;
                                                unsafe = unsafe2;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                mb6Var2 = mb6Var6;
                                i10 = i29;
                                c = 3;
                                i4 = i37 == true ? 1 : 0;
                                if (iM10570u != 50) {
                                    unsafe = unsafe6;
                                    int i85 = i6 + 2;
                                    long j4 = iArr[i85] & i34;
                                    switch (iM10570u) {
                                        case 51:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 1) {
                                                iM4346g = i9 + 8;
                                                unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(d46.m4353n(i9, bArr))));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 52:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 5) {
                                                iM4346g = i9 + 4;
                                                unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(d46.m4342c(i9, bArr))));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 0) {
                                                iM4346g = d46.m4350k(bArr, i9, c1411zn2);
                                                unsafe.putObject(obj2, j, Long.valueOf(c1411zn2.f36191b));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 0) {
                                                iM4346g = d46.m4347h(bArr, i9, c1411zn2);
                                                unsafe.putObject(obj2, j, Integer.valueOf(c1411zn2.f36190a));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 1) {
                                                iM4346g = i9 + 8;
                                                unsafe.putObject(obj2, j, Long.valueOf(d46.m4353n(i9, bArr)));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 5) {
                                                iM4346g = i9 + 4;
                                                unsafe.putObject(obj2, j, Integer.valueOf(d46.m4342c(i9, bArr)));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 58:
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 0) {
                                                iM4346g = d46.m4350k(bArr, i9, c1411zn2);
                                                unsafe.putObject(obj2, j, Boolean.valueOf(c1411zn2.f36191b != 0));
                                                unsafe.putInt(obj2, j4, i5);
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 59:
                                            mb6Var = mb6Var2;
                                            bArr = bArr;
                                            i9 = i9;
                                            i11 = i6;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            if (i40 == 2) {
                                                int iM4347h15 = d46.m4347h(bArr, i9, c1411zn2);
                                                int i86 = c1411zn2.f36190a;
                                                if (i86 == 0) {
                                                    unsafe.putObject(obj2, j, "");
                                                } else {
                                                    int i87 = iM4347h15 + i86;
                                                    if ((i41 & 536870912) != 0 && !ic6.m6752b(bArr, iM4347h15, i87)) {
                                                        qm5.m9917h("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j, new String(bArr, iM4347h15, i86, StandardCharsets.UTF_8));
                                                    iM4347h15 = i87;
                                                }
                                                unsafe.putInt(obj2, j4, i5);
                                                iM4346g = iM4347h15;
                                            } else {
                                                iM4346g = i9;
                                            }
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 60:
                                            i5 = i10;
                                            if (i40 == 2) {
                                                Object objM10572A = s96Var.m10572A(i5, i6, obj2);
                                                int iM4352m = d46.m4352m(objM10572A, s96Var.m10584y(i6), bArr, i9, i2, c1411zn);
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                unsafe7.putObject(obj2, s96Var.m10582v(i6) & i34, objM10572A);
                                                vb6.m11796g(iArr[i85] & i34, i5, obj2);
                                                iM4346g = iM4352m;
                                                i9 = i9;
                                                i11 = i6;
                                                mb6Var = mb6Var2;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            } else {
                                                bArr = bArr;
                                                c1411zn2 = c1411zn;
                                                i9 = i9;
                                                i11 = i6;
                                                mb6Var = mb6Var2;
                                                iM4346g = i9;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            }
                                            break;
                                        case 61:
                                            bArr2 = bArr;
                                            c1411zn3 = c1411zn;
                                            mb6Var3 = mb6Var2;
                                            i5 = i10;
                                            if (i40 == 2) {
                                                iM4340a = d46.m4340a(bArr2, i9, c1411zn3);
                                                unsafe.putObject(obj2, j, c1411zn3.f36192c);
                                                unsafe.putInt(obj2, j4, i5);
                                                iM4346g = iM4340a;
                                                i11 = i6;
                                                bArr = bArr2;
                                                mb6Var = mb6Var3;
                                                i9 = i9;
                                                c1411zn2 = c1411zn3;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            } else {
                                                bArr = bArr2;
                                                i11 = i6;
                                                mb6Var = mb6Var3;
                                                i9 = i9;
                                                c1411zn2 = c1411zn3;
                                                iM4346g = i9;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr2 = bArr;
                                            c1411zn3 = c1411zn;
                                            i11 = i6;
                                            i5 = i10;
                                            if (i40 == 0) {
                                                iM4340a = d46.m4347h(bArr2, i9, c1411zn3);
                                                int i88 = c1411zn3.f36190a;
                                                i6 = i11;
                                                e36 e36VarM10583x3 = s96Var.m10583x(i6);
                                                if (e36VarM10583x3 == null || e36VarM10583x3.m4916a(i88)) {
                                                    mb6Var3 = mb6Var2;
                                                    unsafe.putObject(obj2, j, Integer.valueOf(i88));
                                                    unsafe.putInt(obj2, j4, i5);
                                                } else {
                                                    s66 s66Var3 = (s66) obj2;
                                                    mb6 mb6VarM8267b3 = s66Var3.zzc;
                                                    mb6Var3 = mb6Var2;
                                                    if (mb6VarM8267b3 == mb6Var3) {
                                                        mb6VarM8267b3 = mb6.m8267b();
                                                        s66Var3.zzc = mb6VarM8267b3;
                                                    }
                                                    mb6VarM8267b3.m8269c(i4 == true ? 1 : 0, Long.valueOf(i88));
                                                }
                                                iM4346g = iM4340a;
                                                i11 = i6;
                                                bArr = bArr2;
                                                mb6Var = mb6Var3;
                                                i9 = i9;
                                                c1411zn2 = c1411zn3;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            }
                                            bArr = bArr2;
                                            i9 = i9;
                                            c1411zn2 = c1411zn3;
                                            mb6Var = mb6Var2;
                                            iM4346g = i9;
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 66:
                                            bArr2 = bArr;
                                            c1411zn3 = c1411zn;
                                            i11 = i6;
                                            i5 = i10;
                                            if (i40 == 0) {
                                                iM4347h = d46.m4347h(bArr2, i9, c1411zn3);
                                                unsafe.putObject(obj2, j, Integer.valueOf(z46.m13335a(c1411zn3.f36190a)));
                                                unsafe.putInt(obj2, j4, i5);
                                                i9 = i9;
                                                iM4346g = iM4347h;
                                                c1411zn2 = c1411zn3;
                                                bArr = bArr2;
                                                mb6Var = mb6Var2;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            }
                                            bArr = bArr2;
                                            i9 = i9;
                                            c1411zn2 = c1411zn3;
                                            mb6Var = mb6Var2;
                                            iM4346g = i9;
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 67:
                                            bArr2 = bArr;
                                            c1411zn3 = c1411zn;
                                            i11 = i6;
                                            i5 = i10;
                                            if (i40 == 0) {
                                                iM4347h = d46.m4350k(bArr2, i9, c1411zn3);
                                                long j5 = c1411zn3.f36191b;
                                                unsafe.putObject(obj2, j, Long.valueOf((j5 >>> 1) ^ (-(j5 & 1))));
                                                unsafe.putInt(obj2, j4, i5);
                                                i9 = i9;
                                                iM4346g = iM4347h;
                                                c1411zn2 = c1411zn3;
                                                bArr = bArr2;
                                                mb6Var = mb6Var2;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            }
                                            bArr = bArr2;
                                            i9 = i9;
                                            c1411zn2 = c1411zn3;
                                            mb6Var = mb6Var2;
                                            iM4346g = i9;
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                        case 68:
                                            if (i40 == 3) {
                                                int i89 = ((i4 == true ? 1 : 0) & (-8)) | 4;
                                                Object objM10572A2 = s96Var.m10572A(i10, i6, obj2);
                                                int iM4351l3 = d46.m4351l(objM10572A2, s96Var.m10584y(i6), bArr, i9, i2, i89, c1411zn);
                                                i11 = i6;
                                                unsafe7.putObject(obj2, s96Var.m10582v(i6) & i34, objM10572A2);
                                                vb6.m11796g(iArr[i85] & i34, i10, obj2);
                                                iM4346g = iM4351l3;
                                                bArr = bArr;
                                                i9 = i9;
                                                c1411zn2 = c1411zn;
                                                i5 = i10;
                                                mb6Var = mb6Var2;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            } else {
                                                i11 = i6;
                                                mb6Var = mb6Var2;
                                                i5 = i10;
                                                c1411zn2 = c1411zn;
                                                iM4346g = i9;
                                                if (iM4346g != i9) {
                                                    c1411zn7 = c1411zn2;
                                                    bArr6 = bArr;
                                                    i33 = i4 == true ? 1 : 0;
                                                    i29 = i5;
                                                    obj5 = obj2;
                                                    objArr = objArr;
                                                    iArr = iArr;
                                                    i31 = i8;
                                                    i30 = i11;
                                                    i28 = i28;
                                                    i2 = i2;
                                                } else {
                                                    i7 = iM4346g;
                                                    i31 = i8;
                                                    i6 = i11;
                                                }
                                            }
                                            break;
                                        default:
                                            i11 = i6;
                                            mb6Var = mb6Var2;
                                            i5 = i10;
                                            c1411zn2 = c1411zn;
                                            iM4346g = i9;
                                            if (iM4346g != i9) {
                                                c1411zn7 = c1411zn2;
                                                bArr6 = bArr;
                                                i33 = i4 == true ? 1 : 0;
                                                i29 = i5;
                                                obj5 = obj2;
                                                objArr = objArr;
                                                iArr = iArr;
                                                i31 = i8;
                                                i30 = i11;
                                                i28 = i28;
                                                i2 = i2;
                                            } else {
                                                i7 = iM4346g;
                                                i31 = i8;
                                                i6 = i11;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i40 == 2) {
                                        int i90 = i6 / 3;
                                        Object obj10 = objArr[i90 + i90];
                                        Object object = unsafe6.getObject(obj2, j);
                                        if (!((d96) object).f16878a) {
                                            d96 d96Var2 = d96.f16877b;
                                            if (d96Var2.isEmpty()) {
                                                d96Var = new d96();
                                            } else {
                                                d96 d96Var3 = new d96(d96Var2);
                                                d96Var3.f16878a = true;
                                                d96Var = d96Var3;
                                            }
                                            e96.m5028a(d96Var, object);
                                            unsafe6.putObject(obj2, j, d96Var);
                                        }
                                        throw zi4.m13616p(obj10);
                                    }
                                    unsafe = unsafe6;
                                }
                                iM4344e = iM4346g;
                                s96Var = this;
                            }
                        } else if (i40 == 2) {
                            f76 f76VarMo5612i2 = (f76) unsafe6.getObject(obj5, j);
                            if (!((y36) f76VarMo5612i2).f34844a) {
                                int size3 = f76VarMo5612i2.size();
                                f76VarMo5612i2 = f76VarMo5612i2.mo5612i(size3 == 0 ? 10 : size3 + size3);
                                unsafe6.putObject(obj5, j, f76VarMo5612i2);
                            }
                            f76 f76Var8 = f76VarMo5612i2;
                            bArr6 = bArr;
                            i2 = i2;
                            iM4344e = d46.m4344e(s96Var.m10584y(i6), i37 == true ? 1 : 0, bArr6, i36, i2, f76Var8, c1411zn);
                            c1411zn7 = c1411zn;
                            i33 = i37 == true ? 1 : 0;
                            i30 = i6;
                            obj5 = obj5;
                            i31 = i8;
                            i28 = i28;
                        } else {
                            obj2 = obj5;
                            mb6Var2 = mb6Var6;
                            i4 = i37 == true ? 1 : 0;
                            i10 = i29;
                            i9 = i36;
                            c = 3;
                            unsafe = unsafe6;
                        }
                        bArr = bArr;
                        i7 = i9;
                        mb6Var = mb6Var2;
                        i31 = i8;
                        i5 = i10;
                        c1411zn2 = c1411zn;
                    }
                }
                if (i4 != i3 || i3 == 0) {
                    s66 s66Var4 = (s66) obj2;
                    mb6 mb6VarM8267b4 = s66Var4.zzc;
                    if (mb6VarM8267b4 == mb6Var) {
                        mb6VarM8267b4 = mb6.m8267b();
                        s66Var4.zzc = mb6VarM8267b4;
                    }
                    mb6 mb6Var9 = mb6VarM8267b4;
                    byte b11 = i4 == true ? 1 : 0;
                    iM4346g = d46.m4346g(b11 == true ? 1 : 0, bArr, i7, i2, mb6Var9, c1411zn2);
                    bArr6 = bArr;
                    c1411zn7 = c1411zn;
                    i33 = b11 == true ? 1 : 0;
                    i2 = i2;
                    i29 = i5;
                    i30 = i6;
                    obj5 = obj2;
                    objArr = objArr;
                    iArr = iArr;
                    i28 = i28;
                    iM4344e = iM4346g;
                    s96Var = this;
                } else {
                    i2 = i2;
                    iM4344e = i7;
                }
            } else {
                i3 = i3;
                unsafe = unsafe6;
                obj2 = obj5;
                objArr = objArr;
                iArr = iArr;
                i4 = i33;
            }
        }
        int i91 = i32;
        if (i31 != i34) {
            unsafe.putInt(obj2, i31, i91);
        }
        for (int i92 = this.f30024g; i92 < this.f30025h; i92++) {
            int i93 = this.f30023f[i92];
            int i94 = iArr[i93];
            Object objM11792c = vb6.m11792c(m10582v(i93) & 1048575, obj2);
            if (objM11792c != null && m10583x(i93) != null) {
                int i95 = i93 / 3;
                throw zi4.m13616p(objArr[i95 + i95]);
            }
        }
        if (i3 == 0) {
            if (iM4344e != i2) {
                qm5.m9917h("Failed to parse the message.");
                return 0;
            }
        } else if (iM4344e > i2 || i4 != i3) {
            qm5.m9917h("Failed to parse the message.");
            return 0;
        }
        return iM4344e;
    }

    /* JADX INFO: renamed from: t */
    public final int m10581t(int i, int i2) {
        int[] iArr = this.f30018a;
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

    /* JADX INFO: renamed from: v */
    public final int m10582v(int i) {
        return this.f30018a[i + 1];
    }

    /* JADX INFO: renamed from: x */
    public final e36 m10583x(int i) {
        int i2 = i / 3;
        return (e36) this.f30019b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: y */
    public final na6 m10584y(int i) {
        Object[] objArr = this.f30019b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        na6 na6Var = (na6) objArr[i3];
        if (na6Var != null) {
            return na6Var;
        }
        na6 na6VarM4415a = da6.f16886b.m4415a((Class) objArr[i3 + 1]);
        objArr[i3] = na6VarM4415a;
        return na6VarM4415a;
    }

    /* JADX INFO: renamed from: z */
    public final Object m10585z(int i, Object obj) {
        na6 na6VarM10584y = m10584y(i);
        int iM10582v = m10582v(i) & 1048575;
        if (!m10577n(i, obj)) {
            return na6VarM10584y.mo8654a();
        }
        Object object = f30017j.getObject(obj, iM10582v);
        if (m10568p(object)) {
            return object;
        }
        s66 s66VarMo8654a = na6VarM10584y.mo8654a();
        if (object != null) {
            na6VarM10584y.mo8659f(s66VarMo8654a, object);
        }
        return s66VarMo8654a;
    }
}
