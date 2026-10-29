package p000;

import java.io.IOException;
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
public final class wp6 implements kq6 {

    /* JADX INFO: renamed from: g */
    public static final int[] f33586g = new int[0];

    /* JADX INFO: renamed from: h */
    public static final Unsafe f33587h;

    /* JADX INFO: renamed from: a */
    public int[] f33588a;

    /* JADX INFO: renamed from: b */
    public Object[] f33589b;

    /* JADX INFO: renamed from: c */
    public hm6 f33590c;

    /* JADX INFO: renamed from: d */
    public int[] f33591d;

    /* JADX INFO: renamed from: e */
    public int f33592e;

    /* JADX INFO: renamed from: f */
    public aj5 f33593f;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 8));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f33587h = unsafe;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12355i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof jo6) {
            return ((jo6) obj).m7199f();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static int m12356k(long j, Object obj) {
        return ((Integer) rq6.m10407g(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: l */
    public static int m12357l(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: n */
    public static long m12358n(long j, Object obj) {
        return ((Long) rq6.m10407g(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: p */
    public static Field m12359p(Class cls, String str) {
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

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // p000.kq6
    /* JADX INFO: renamed from: a */
    public final void mo7578a(Object obj) {
        if (m12355i(obj)) {
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                jo6Var.m7198e();
                jo6Var.zza = 0;
                jo6Var.m7201k();
            }
            int[] iArr = this.f33588a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM12361m = m12361m(i);
                int i2 = 1048575 & iM12361m;
                int iM12357l = m12357l(iM12361m);
                long j = i2;
                Unsafe unsafe = f33587h;
                if (iM12357l != 9) {
                    if (iM12357l != 60 && iM12357l != 68) {
                        switch (iM12357l) {
                            case 17:
                                if (m12367u(i, obj)) {
                                    m12362o(i).mo7578a(unsafe.getObject(obj, j));
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
                                jm6 jm6Var = (jm6) ((qo6) rq6.m10407g(j, obj));
                                if (jm6Var.f22436a) {
                                    jm6Var.f22436a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((rp6) object).f29519a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m12360j(iArr[i], i, obj)) {
                        m12362o(i).mo7578a(unsafe.getObject(obj, j));
                    }
                } else if (m12367u(i, obj)) {
                    m12362o(i).mo7578a(unsafe.getObject(obj, j));
                }
            }
            this.f33593f.getClass();
            pq6 pq6Var = ((jo6) obj).zzc;
            if (pq6Var.f27905d) {
                pq6Var.f27905d = false;
            }
        }
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: b */
    public final void mo7579b(Object obj, Object obj2) {
        Object obj3;
        int[] iArr = this.f33588a;
        if (!m12355i(obj)) {
            C1077qn.m9987m("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (i < iArr.length) {
            int iM12361m = m12361m(i);
            int i2 = iM12361m & 1048575;
            int iM12357l = m12357l(iM12361m);
            int i3 = iArr[i];
            long j = i2;
            switch (iM12357l) {
                case 0:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        bv4 bv4Var = rq6.f29536c;
                        bv4Var.mo3739s(obj3, j, bv4Var.mo3731k(j, obj2));
                        m12365s(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        bv4 bv4Var2 = rq6.f29536c;
                        bv4Var2.mo3742v(obj3, j, bv4Var2.mo3733m(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.f29536c.f15653b.putLong(obj3, j, rq6.m10406f(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.f29536c.f15653b.putLong(obj3, j, rq6.m10406f(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10408h(j, rq6.m10405e(j, obj2), obj3);
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.f29536c.f15653b.putLong(obj3, j, rq6.m10406f(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10408h(j, rq6.m10405e(j, obj2), obj3);
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        bv4 bv4Var3 = rq6.f29536c;
                        bv4Var3.mo3735o(j, obj3, bv4Var3.mo3745y(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10409i(j, obj3, rq6.m10407g(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    m12363q(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10409i(j, obj3, rq6.m10407g(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10408h(j, rq6.m10405e(j, obj2), obj3);
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10408h(j, rq6.m10405e(j, obj2), obj3);
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10408h(j, rq6.m10405e(j, obj2), obj3);
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.f29536c.f15653b.putLong(obj3, j, rq6.m10406f(j, obj2));
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (m12367u(i, obj2)) {
                        rq6.m10408h(j, rq6.m10405e(j, obj2), obj3);
                        m12365s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (m12367u(i, obj2)) {
                        obj3 = obj;
                        rq6.f29536c.f15653b.putLong(obj3, j, rq6.m10406f(j, obj2));
                        m12365s(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    m12363q(i, obj, obj2);
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
                    qo6 qo6VarMo3123i = (qo6) rq6.m10407g(j, obj);
                    qo6 qo6Var = (qo6) rq6.m10407g(j, obj2);
                    int size = qo6VarMo3123i.size();
                    int size2 = qo6Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((jm6) qo6VarMo3123i).f22436a) {
                            qo6VarMo3123i = qo6VarMo3123i.mo3123i(size2 + size);
                        }
                        qo6VarMo3123i.addAll(qo6Var);
                    }
                    if (size > 0) {
                        qo6Var = qo6VarMo3123i;
                    }
                    rq6.m10409i(j, obj, qo6Var);
                    break;
                case 50:
                    aj5 aj5Var = lq6.f24292a;
                    rp6 rp6Var = (rp6) rq6.m10407g(j, obj);
                    rp6 rp6Var2 = (rp6) rq6.m10407g(j, obj2);
                    if (!rp6Var2.isEmpty()) {
                        if (!rp6Var.f29519a) {
                            if (rp6Var.isEmpty()) {
                                rp6Var = new rp6();
                            } else {
                                rp6 rp6Var3 = new rp6(rp6Var);
                                rp6Var3.f29519a = true;
                                rp6Var = rp6Var3;
                            }
                        }
                        rp6Var.m10390a();
                        if (!rp6Var2.isEmpty()) {
                            rp6Var.putAll(rp6Var2);
                        }
                    }
                    rq6.m10409i(j, obj, rp6Var);
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
                    if (m12360j(i3, i, obj2)) {
                        rq6.m10409i(j, obj, rq6.m10407g(j, obj2));
                        rq6.m10408h(iArr[i + 2] & 1048575, i3, obj);
                    }
                    break;
                case 60:
                    m12364r(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m12360j(i3, i, obj2)) {
                        rq6.m10409i(j, obj, rq6.m10407g(j, obj2));
                        rq6.m10408h(iArr[i + 2] & 1048575, i3, obj);
                    }
                    break;
                case 68:
                    m12364r(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        lq6.m8088o(obj, obj2);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: c */
    public final boolean mo7580c(jo6 jo6Var, jo6 jo6Var2) {
        boolean zM8078e;
        int[] iArr = this.f33588a;
        for (int i = 0; i < iArr.length; i += 3) {
            int iM12361m = m12361m(i);
            long j = iM12361m & 1048575;
            switch (m12357l(iM12361m)) {
                case 0:
                    if (m12366t(jo6Var, jo6Var2, i)) {
                        bv4 bv4Var = rq6.f29536c;
                        if (Double.doubleToLongBits(bv4Var.mo3731k(j, jo6Var)) == Double.doubleToLongBits(bv4Var.mo3731k(j, jo6Var2))) {
                            continue;
                            break;
                        }
                    }
                case 1:
                    if (m12366t(jo6Var, jo6Var2, i)) {
                        bv4 bv4Var2 = rq6.f29536c;
                        if (Float.floatToIntBits(bv4Var2.mo3733m(j, jo6Var)) == Float.floatToIntBits(bv4Var2.mo3733m(j, jo6Var2))) {
                            continue;
                            break;
                        }
                    }
                case 2:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10406f(j, jo6Var) == rq6.m10406f(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 3:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10406f(j, jo6Var) == rq6.m10406f(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 4:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10405e(j, jo6Var) == rq6.m10405e(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 5:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10406f(j, jo6Var) == rq6.m10406f(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 6:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10405e(j, jo6Var) == rq6.m10405e(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 7:
                    if (m12366t(jo6Var, jo6Var2, i)) {
                        bv4 bv4Var3 = rq6.f29536c;
                        if (bv4Var3.mo3745y(j, jo6Var) == bv4Var3.mo3745y(j, jo6Var2)) {
                            continue;
                            break;
                        }
                    }
                case 8:
                    if (m12366t(jo6Var, jo6Var2, i) && lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 9:
                    if (m12366t(jo6Var, jo6Var2, i) && lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 10:
                    if (m12366t(jo6Var, jo6Var2, i) && lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 11:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10405e(j, jo6Var) == rq6.m10405e(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 12:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10405e(j, jo6Var) == rq6.m10405e(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 13:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10405e(j, jo6Var) == rq6.m10405e(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 14:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10406f(j, jo6Var) == rq6.m10406f(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 15:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10405e(j, jo6Var) == rq6.m10405e(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 16:
                    if (m12366t(jo6Var, jo6Var2, i) && rq6.m10406f(j, jo6Var) == rq6.m10406f(j, jo6Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 17:
                    if (m12366t(jo6Var, jo6Var2, i) && lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2))) {
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
                    zM8078e = lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2));
                    break;
                case 50:
                    zM8078e = lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2));
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
                    if (rq6.m10405e(j2, jo6Var) == rq6.m10405e(j2, jo6Var2) && lq6.m8078e(rq6.m10407g(j, jo6Var), rq6.m10407g(j, jo6Var2))) {
                        continue;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            if (zM8078e) {
            }
        }
        return jo6Var.zzc.equals(jo6Var2.zzc);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: d */
    public final boolean mo7581d(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f33592e) {
            int[] iArr = this.f33591d;
            int[] iArr2 = this.f33588a;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int iM12361m = m12361m(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f33587h.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iM12361m) == 0 || m12368v(obj, i6, i, i2, i10)) {
                int iM12357l = m12357l(iM12361m);
                if (iM12357l != 9 && iM12357l != 17) {
                    if (iM12357l != 27) {
                        if (iM12357l == 60 || iM12357l == 68) {
                            if (!m12360j(i7, i6, obj) || m12362o(i6).mo7581d(rq6.m10407g(iM12361m & 1048575, obj))) {
                                i4++;
                                i5 = i;
                                i3 = i2;
                            }
                        } else if (iM12357l != 49) {
                            if (iM12357l != 50) {
                                continue;
                            } else {
                                rp6 rp6Var = (rp6) rq6.m10407g(iM12361m & 1048575, obj);
                                if (rp6Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i12 = i6 / 3;
                                    if (((uq6) ((qp6) this.f33589b[i12 + i12]).f28678a.f27897c).f32112a == ar6.f14835i) {
                                        kq6 kq6VarM13720a = null;
                                        for (Object obj2 : rp6Var.values()) {
                                            if (kq6VarM13720a == null) {
                                                kq6VarM13720a = zp6.f36259c.m13720a(obj2.getClass());
                                            }
                                            if (!kq6VarM13720a.mo7581d(obj2)) {
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
                    List list = (List) rq6.m10407g(iM12361m & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        kq6 kq6VarM12362o = m12362o(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (kq6VarM12362o.mo7581d(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!m12368v(obj, i6, i, i2, i10) || m12362o(i6).mo7581d(rq6.m10407g(iM12361m & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0355  */
    /* JADX WARN: Code duplicated, block: B:130:0x0363  */
    /* JADX WARN: Code duplicated, block: B:131:0x0375  */
    /* JADX WARN: Code duplicated, block: B:132:0x0386  */
    /* JADX WARN: Code duplicated, block: B:134:0x038f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0398  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:145:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:150:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:151:0x0400  */
    /* JADX WARN: Code duplicated, block: B:152:0x0406  */
    /* JADX WARN: Code duplicated, block: B:153:0x0412  */
    /* JADX WARN: Code duplicated, block: B:154:0x041d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0428  */
    /* JADX WARN: Code duplicated, block: B:156:0x042f  */
    /* JADX WARN: Code duplicated, block: B:212:0x060c A[PHI: r21 r22
  0x060c: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:276:0x07d9, B:272:0x07b9, B:246:0x0714, B:232:0x06ab, B:228:0x068b, B:224:0x066d, B:217:0x062d, B:211:0x060a] A[DONT_GENERATE, DONT_INLINE]
  0x060c: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:276:0x07d9, B:272:0x07b9, B:246:0x0714, B:232:0x06ab, B:228:0x068b, B:224:0x066d, B:217:0x062d, B:211:0x060a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:266:0x077b A[PHI: r21 r22
  0x077b: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:280:0x07f9, B:265:0x0779] A[DONT_GENERATE, DONT_INLINE]
  0x077b: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:280:0x07f9, B:265:0x0779] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:327:0x0945  */
    /* JADX WARN: Code duplicated, block: B:330:0x0950  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:355:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    @Override // p000.kq6
    /* JADX INFO: renamed from: e */
    public final int mo7582e(hm6 hm6Var) {
        int i;
        int i2;
        int iM6825g;
        int iM6826h;
        int i3;
        int i4;
        int iM6825g2;
        int iMo11067d;
        int i5;
        int iM6825g3;
        int iMo6450c;
        int iM8081h;
        int i6;
        int i7;
        int iM6825g4;
        int size;
        int iM8087n;
        int iM6825g5;
        int iM6825g6;
        int iM6825g7;
        int size2;
        int iM6825g8;
        int iMo6450c2;
        int iM10850p;
        int iM6826h2;
        int iMo11067d2;
        int iM6825g9;
        int iM6825g10;
        int i8;
        int iM6825g11;
        int iM6826h3;
        int iMo11067d3;
        int iM6825g12;
        int iM6825g13;
        int iM6826h4;
        int iM6825g14;
        int iMo11067d4;
        int iM12356k;
        int iM6825g15;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int iM10850p2 = 0;
        while (true) {
            int[] iArr = this.f33588a;
            if (i11 >= iArr.length) {
                pq6 pq6Var = ((jo6) hm6Var).zzc;
                int i13 = pq6Var.f27904c;
                if (i13 == -1) {
                    pq6Var.f27904c = 0;
                    i = 0;
                } else {
                    i = i13;
                }
                return i + iM10850p2;
            }
            int iM12361m = m12361m(i11);
            int iM12357l = m12357l(iM12361m);
            int i14 = iArr[i11];
            int i15 = iArr[i11 + 2];
            int i16 = i15 & i9;
            int i17 = 1;
            Unsafe unsafe = f33587h;
            if (iM12357l <= 17) {
                if (i16 != i10) {
                    i12 = i16 == i9 ? 0 : unsafe.getInt(hm6Var, i16);
                    i10 = i16;
                }
                i2 = 1 << (i15 >>> 20);
            } else {
                i2 = 0;
            }
            int i18 = iM12361m & i9;
            if (iM12357l >= bo6.f15471b.f15475a) {
                byte b = bo6.f15472c.f15475a;
            }
            long j = i18;
            int i19 = 4;
            int i20 = 8;
            switch (iM12357l) {
                case 0:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 8;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 1:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 4;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 2:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        long j2 = unsafe.getLong(hm6Var, j);
                        iM6825g = in6.m6825g(i14 << 3);
                        iM6826h = in6.m6826h(j2);
                        iMo6450c = iM6826h + iM6825g;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 3:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        long j3 = unsafe.getLong(hm6Var, j);
                        iM6825g = in6.m6825g(i14 << 3);
                        iM6826h = in6.m6826h(j3);
                        iMo6450c = iM6826h + iM6825g;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 4:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        long j4 = unsafe.getInt(hm6Var, j);
                        iM6825g = in6.m6825g(i14 << 3);
                        iM6826h = in6.m6826h(j4);
                        iMo6450c = iM6826h + iM6825g;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 5:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 8;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 6:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 4;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 7:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 1;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 8:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        int i21 = i14 << 3;
                        Object object = unsafe.getObject(hm6Var, j);
                        if (object instanceof ym6) {
                            iM6825g2 = in6.m6825g(i21);
                            iMo11067d = ((ym6) object).mo11067d();
                            iM10850p2 = sk5.m10850p(iMo11067d, iMo11067d, iM6825g2, iM10850p2);
                        } else {
                            iM6825g = in6.m6825g(i21);
                            iM6826h = in6.m6824f((String) object);
                            iMo6450c = iM6826h + iM6825g;
                            iM10850p2 += iMo6450c;
                        }
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 9:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        Object object2 = unsafe.getObject(hm6Var, j);
                        kq6 kq6VarM12362o = m12362o(i11);
                        aj5 aj5Var = lq6.f24292a;
                        int iM6825g16 = in6.m6825g(i14 << 3);
                        int iMo6450c3 = ((hm6) object2).mo6450c(kq6VarM12362o);
                        iM10850p2 = sk5.m10850p(iMo6450c3, iMo6450c3, iM6825g16, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 10:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        ym6 ym6Var = (ym6) unsafe.getObject(hm6Var, j);
                        iM6825g2 = in6.m6825g(i14 << 3);
                        iMo11067d = ym6Var.mo11067d();
                        iM10850p2 = sk5.m10850p(iMo11067d, iMo11067d, iM6825g2, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 11:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i5 = unsafe.getInt(hm6Var, j);
                        iM6825g3 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10847m(i5, iM6825g3, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 12:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        long j5 = unsafe.getInt(hm6Var, j);
                        iM6825g = in6.m6825g(i14 << 3);
                        iM6826h = in6.m6826h(j5);
                        iMo6450c = iM6826h + iM6825g;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 13:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 4;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 14:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        i3 = i14 << 3;
                        i4 = 8;
                        iM10850p2 = sk5.m10847m(i3, i4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 15:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        int i22 = unsafe.getInt(hm6Var, j);
                        iM6825g3 = in6.m6825g(i14 << 3);
                        i5 = (i22 >> 31) ^ (i22 + i22);
                        iM10850p2 = sk5.m10847m(i5, iM6825g3, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 16:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        long j6 = unsafe.getLong(hm6Var, j);
                        iM6825g = in6.m6825g(i14 << 3);
                        iM6826h = in6.m6826h((j6 >> 63) ^ (j6 + j6));
                        iMo6450c = iM6826h + iM6825g;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 17:
                    if (m12368v(hm6Var, i11, i10, i12, i2)) {
                        hm6 hm6Var2 = (hm6) unsafe.getObject(hm6Var, j);
                        kq6 kq6VarM12362o2 = m12362o(i11);
                        aj5 aj5Var2 = lq6.f24292a;
                        int iM6825g17 = in6.m6825g(i14 << 3);
                        iMo6450c = hm6Var2.mo6450c(kq6VarM12362o2) + iM6825g17 + iM6825g17;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 18:
                    iM8081h = lq6.m8081h((List) unsafe.getObject(hm6Var, j), i14);
                    iM10850p2 += iM8081h;
                    i10 = i10;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 19:
                    iM8081h = lq6.m8080g((List) unsafe.getObject(hm6Var, j), i14);
                    iM10850p2 += iM8081h;
                    i10 = i10;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 20:
                    i6 = i10;
                    i7 = i12;
                    List list = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var3 = lq6.f24292a;
                    if (list.size() == 0) {
                        iM6825g4 = 0;
                    } else {
                        iM6825g4 = (in6.m6825g(i14 << 3) * list.size()) + lq6.m8083j(list);
                    }
                    iM10850p2 += iM6825g4;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 21:
                    i6 = i10;
                    i7 = i12;
                    List list2 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var4 = lq6.f24292a;
                    size = list2.size();
                    if (size == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM8087n = lq6.m8087n(list2);
                        iM6825g5 = in6.m6825g(i14 << 3);
                        iM6825g6 = (iM6825g5 * size) + iM8087n;
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 22:
                    i6 = i10;
                    i7 = i12;
                    List list3 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var5 = lq6.f24292a;
                    size = list3.size();
                    if (size == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM8087n = lq6.m8082i(list3);
                        iM6825g5 = in6.m6825g(i14 << 3);
                        iM6825g6 = (iM6825g5 * size) + iM8087n;
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 23:
                    iM8081h = lq6.m8081h((List) unsafe.getObject(hm6Var, j), i14);
                    iM10850p2 += iM8081h;
                    i10 = i10;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 24:
                    iM8081h = lq6.m8080g((List) unsafe.getObject(hm6Var, j), i14);
                    iM10850p2 += iM8081h;
                    i10 = i10;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 25:
                    i6 = i10;
                    i7 = i12;
                    List list4 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var6 = lq6.f24292a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM6825g4 = 0;
                    } else {
                        iM6825g4 = (in6.m6825g(i14 << 3) + 1) * size3;
                    }
                    iM10850p2 += iM6825g4;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 26:
                    i6 = i10;
                    i7 = i12;
                    List list5 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var7 = lq6.f24292a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM6825g6 = in6.m6825g(i14 << 3) * size4;
                        if (list5 instanceof hp6) {
                            hp6 hp6Var = (hp6) list5;
                            for (int i23 = 0; i23 < size4; i23++) {
                                Object objM6472f = hp6Var.m6472f();
                                if (objM6472f instanceof ym6) {
                                    int iMo11067d5 = ((ym6) objM6472f).mo11067d();
                                    iM6825g6 = sk5.m10847m(iMo11067d5, iMo11067d5, iM6825g6);
                                } else {
                                    iM6825g6 = in6.m6824f((String) objM6472f) + iM6825g6;
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object obj = list5.get(i24);
                                if (obj instanceof ym6) {
                                    int iMo11067d6 = ((ym6) obj).mo11067d();
                                    iM6825g6 = sk5.m10847m(iMo11067d6, iMo11067d6, iM6825g6);
                                } else {
                                    iM6825g6 = in6.m6824f((String) obj) + iM6825g6;
                                }
                            }
                        }
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 27:
                    i6 = i10;
                    i7 = i12;
                    List list6 = (List) unsafe.getObject(hm6Var, j);
                    kq6 kq6VarM12362o3 = m12362o(i11);
                    aj5 aj5Var8 = lq6.f24292a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM6825g7 = 0;
                    } else {
                        iM6825g7 = in6.m6825g(i14 << 3) * size5;
                        for (int i25 = 0; i25 < size5; i25++) {
                            int iMo6450c4 = ((hm6) list6.get(i25)).mo6450c(kq6VarM12362o3);
                            iM6825g7 = sk5.m10847m(iMo6450c4, iMo6450c4, iM6825g7);
                        }
                    }
                    iM10850p2 += iM6825g7;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 28:
                    i6 = i10;
                    i7 = i12;
                    List list7 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var9 = lq6.f24292a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM6825g6 = in6.m6825g(i14 << 3) * size6;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int iMo11067d7 = ((ym6) list7.get(i26)).mo11067d();
                            iM6825g6 = sk5.m10847m(iMo11067d7, iMo11067d7, iM6825g6);
                        }
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 29:
                    i6 = i10;
                    i7 = i12;
                    List list8 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var10 = lq6.f24292a;
                    size = list8.size();
                    if (size == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM8087n = lq6.m8086m(list8);
                        iM6825g5 = in6.m6825g(i14 << 3);
                        iM6825g6 = (iM6825g5 * size) + iM8087n;
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 30:
                    i6 = i10;
                    i7 = i12;
                    List list9 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var11 = lq6.f24292a;
                    size = list9.size();
                    if (size == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM8087n = lq6.m8079f(list9);
                        iM6825g5 = in6.m6825g(i14 << 3);
                        iM6825g6 = (iM6825g5 * size) + iM8087n;
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 31:
                    iM8081h = lq6.m8080g((List) unsafe.getObject(hm6Var, j), i14);
                    iM10850p2 += iM8081h;
                    i10 = i10;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 32:
                    iM8081h = lq6.m8081h((List) unsafe.getObject(hm6Var, j), i14);
                    iM10850p2 += iM8081h;
                    i10 = i10;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 33:
                    i6 = i10;
                    i7 = i12;
                    List list10 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var12 = lq6.f24292a;
                    size = list10.size();
                    if (size == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM8087n = lq6.m8084k(list10);
                        iM6825g5 = in6.m6825g(i14 << 3);
                        iM6825g6 = (iM6825g5 * size) + iM8087n;
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 34:
                    i6 = i10;
                    i7 = i12;
                    List list11 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var13 = lq6.f24292a;
                    size = list11.size();
                    if (size == 0) {
                        iM6825g6 = 0;
                    } else {
                        iM8087n = lq6.m8085l(list11);
                        iM6825g5 = in6.m6825g(i14 << 3);
                        iM6825g6 = (iM6825g5 * size) + iM8087n;
                    }
                    iM10850p2 += iM6825g6;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 35:
                    i6 = i10;
                    i7 = i12;
                    List list12 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var14 = lq6.f24292a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 36:
                    i6 = i10;
                    i7 = i12;
                    List list13 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var15 = lq6.f24292a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 37:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8083j((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 38:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8087n((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 39:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8082i((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 40:
                    i6 = i10;
                    i7 = i12;
                    List list14 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var16 = lq6.f24292a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 41:
                    i6 = i10;
                    i7 = i12;
                    List list15 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var17 = lq6.f24292a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 42:
                    i6 = i10;
                    i7 = i12;
                    List list16 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var18 = lq6.f24292a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 43:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8086m((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 44:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8079f((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 45:
                    i6 = i10;
                    i7 = i12;
                    List list17 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var19 = lq6.f24292a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 46:
                    i6 = i10;
                    i7 = i12;
                    List list18 = (List) unsafe.getObject(hm6Var, j);
                    aj5 aj5Var20 = lq6.f24292a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 47:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8084k((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 48:
                    i6 = i10;
                    i7 = i12;
                    size2 = lq6.m8085l((List) unsafe.getObject(hm6Var, j));
                    if (size2 > 0) {
                        iM6825g8 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10850p(size2, iM6825g8, size2, iM10850p2);
                    }
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 49:
                    i6 = i10;
                    i7 = i12;
                    List list19 = (List) unsafe.getObject(hm6Var, j);
                    kq6 kq6VarM12362o4 = m12362o(i11);
                    aj5 aj5Var21 = lq6.f24292a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iMo6450c2 = 0;
                    } else {
                        iMo6450c2 = 0;
                        for (int i27 = 0; i27 < size7; i27++) {
                            hm6 hm6Var3 = (hm6) list19.get(i27);
                            int iM6825g18 = in6.m6825g(i14 << 3);
                            iMo6450c2 += hm6Var3.mo6450c(kq6VarM12362o4) + iM6825g18 + iM6825g18;
                        }
                    }
                    iM10850p2 += iMo6450c2;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 50:
                    int i28 = i11 / 3;
                    rp6 rp6Var = (rp6) unsafe.getObject(hm6Var, j);
                    qp6 qp6Var = (qp6) this.f33589b[i28 + i28];
                    if (rp6Var.isEmpty()) {
                        iM10850p = 0;
                    } else {
                        Iterator it = rp6Var.entrySet().iterator();
                        iM10850p = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            pq3 pq3Var = qp6Var.f28678a;
                            int i29 = i17;
                            int iM6825g19 = in6.m6825g(i14 << 3);
                            int i30 = i19;
                            uq6 uq6Var = (uq6) pq3Var.f27896b;
                            uq6 uq6Var2 = (uq6) pq3Var.f27897c;
                            int i31 = ao6.f14752c;
                            int iM6825g20 = in6.m6825g(i20);
                            int i32 = i20;
                            uq6 uq6Var3 = uq6.f32110e;
                            if (uq6Var == uq6Var3) {
                                iM6825g20 += iM6825g20;
                            }
                            ar6 ar6Var = ar6.f14827a;
                            int i33 = i10;
                            switch (uq6Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iM6826h2 = i32;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i34 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i34, i34, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i35 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i35, i35, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i36 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i36, i36, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i37 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i37, i37, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i38 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i38, i38, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i39 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i39, i39, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i310 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i310, i310, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311, i311, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i312 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i312, i312, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i313 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i313, i313, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i314 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i314, i314, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i315 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i315, i315, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i316 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i316, i316, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i317 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i317, i317, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i318 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i318, i318, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i319 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i319, i319, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            int i3110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3110, i3110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue + jLongValue) ^ (jLongValue >> 63));
                                            int i3111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111, i3111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iM6826h2 = i30;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3112, i3112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3113, i3113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3114, i3114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3115, i3115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3116, i3116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3117, i3117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3118, i3118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3119, i3119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31110, i31110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111, i31111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31112, i31112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31113, i31113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i31114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31114, i31114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31115, i31115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31116, i31116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31117, i31117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            int i31118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31118, i31118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
                                            int i31119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31119, i31119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = in6.m6826h(((Long) key).longValue());
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311110, i311110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111, i311111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311112, i311112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311113, i311113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311114, i311114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311115, i311115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311116, i311116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311117, i311117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311118, i311118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311119, i311119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111110, i3111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111, i3111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111112, i3111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111113, i3111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111114, i3111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111115, i3111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            int i3111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111116, i3111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                                            int i3111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111117, i3111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = in6.m6826h(((Long) key).longValue());
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111118, i3111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111119, i3111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111110, i31111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111, i31111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111112, i31111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111113, i31111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111114, i31111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i31111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111115, i31111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111116, i31111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111117, i31111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111118, i31111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111119, i31111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i311111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111110, i311111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111, i311111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111112, i311111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111113, i311111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            int i311111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111114, i311111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue4 + jLongValue4) ^ (jLongValue4 >> 63));
                                            int i311111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111115, i311111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = in6.m6826h(((Integer) key).intValue());
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111116, i311111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111117, i311111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111118, i311111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111119, i311111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111110, i3111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111, i3111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111112, i3111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111113, i3111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i3111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111114, i3111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i3111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111115, i3111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111116, i3111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111117, i3111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111118, i3111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111119, i3111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111110, i31111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111, i31111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            int i31111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111112, i31111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue5 + jLongValue5) ^ (jLongValue5 >> 63));
                                            int i31111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111113, i31111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iM6826h2 = i32;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111114, i31111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111115, i31111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111116, i31111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111117, i31111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111118, i31111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111119, i31111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111110, i311111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111, i311111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111112, i311111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111113, i311111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i311111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111114, i311111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i311111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111115, i311111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i311111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111116, i311111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111117, i311111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111118, i311111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111119, i311111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            int i3111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111110, i3111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue6 + jLongValue6) ^ (jLongValue6 >> 63));
                                            int i3111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111, i3111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iM6826h2 = i30;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111112, i3111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111113, i3111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111114, i3111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111115, i3111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111116, i3111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111117, i3111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111118, i3111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111119, i3111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111110, i31111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111, i31111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111112, i31111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111113, i31111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i31111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111114, i31111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111115, i31111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111116, i31111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111117, i31111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            int i31111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111118, i31111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue7 + jLongValue7) ^ (jLongValue7 >> 63));
                                            int i31111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111119, i31111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    i12 = i12;
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iM6826h2 = i29;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111110, i311111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111, i311111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111112, i311111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111113, i311111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111114, i311111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111115, i311111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111116, i311111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111117, i311111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111118, i311111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111119, i311111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111110, i3111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111, i3111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111112, i3111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111113, i3111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111114, i3111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111115, i3111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            int i3111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111116, i3111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue8 + jLongValue8) ^ (jLongValue8 >> 63));
                                            int i3111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111117, i3111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    i12 = i12;
                                    it = it;
                                    if (key instanceof ym6) {
                                        iMo11067d2 = ((ym6) key).mo11067d();
                                        iM6825g9 = in6.m6825g(iMo11067d2);
                                        iM6826h2 = iMo11067d2 + iM6825g9;
                                    } else {
                                        iM6826h2 = in6.m6824f((String) key);
                                    }
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111118, i3111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111119, i3111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111110, i31111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111, i31111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111112, i31111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111113, i31111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111114, i31111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i31111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111115, i31111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111116, i31111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111117, i31111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111118, i31111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111119, i31111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i311111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111110, i311111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111, i311111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111112, i311111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111113, i311111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            int i311111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111114, i311111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue9 + jLongValue9) ^ (jLongValue9 >> 63));
                                            int i311111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111115, i311111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = ((hm6) key).mo6451d();
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111116, i311111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111117, i311111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111118, i311111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111119, i311111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111110, i3111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111, i3111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111112, i3111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111113, i3111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i3111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111114, i3111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i3111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111115, i3111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111116, i3111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111117, i3111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111118, i3111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111119, i3111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111110, i31111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111, i31111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            int i31111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111112, i31111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue10 + jLongValue10) ^ (jLongValue10 >> 63));
                                            int i31111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111113, i31111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    i12 = i12;
                                    it = it;
                                    iMo11067d2 = ((hm6) key).mo6451d();
                                    iM6825g9 = in6.m6825g(iMo11067d2);
                                    iM6826h2 = iMo11067d2 + iM6825g9;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111114, i31111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111115, i31111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111116, i31111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111117, i31111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111118, i31111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111119, i31111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111110, i311111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111, i311111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111112, i311111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111113, i311111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i311111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111114, i311111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i311111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111115, i311111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i311111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111116, i311111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111117, i311111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111118, i311111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111119, i311111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            int i3111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111110, i3111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue11 + jLongValue11) ^ (jLongValue11 >> 63));
                                            int i3111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111, i3111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    i12 = i12;
                                    it = it;
                                    if (key instanceof ym6) {
                                        iMo11067d2 = ((ym6) key).mo11067d();
                                        iM6825g9 = in6.m6825g(iMo11067d2);
                                    } else {
                                        iMo11067d2 = ((byte[]) key).length;
                                        iM6825g9 = in6.m6825g(iMo11067d2);
                                    }
                                    iM6826h2 = iMo11067d2 + iM6825g9;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111112, i3111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111113, i3111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111114, i3111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111115, i3111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111116, i3111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111117, i3111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111118, i3111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111119, i3111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111110, i31111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111, i31111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111112, i31111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111113, i31111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i31111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111114, i31111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111115, i31111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111116, i31111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111117, i31111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            int i31111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111118, i31111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue12 + jLongValue12) ^ (jLongValue12 >> 63));
                                            int i31111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111119, i31111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = in6.m6825g(((Integer) key).intValue());
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111110, i311111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111, i311111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111112, i311111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111113, i311111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111114, i311111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111115, i311111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111116, i311111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111117, i311111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111118, i311111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111119, i311111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111110, i3111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111, i3111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111112, i3111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111113, i3111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111114, i3111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111115, i3111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            int i3111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111116, i3111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue13 + jLongValue13) ^ (jLongValue13 >> 63));
                                            int i3111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111117, i3111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = in6.m6826h(((Integer) key).intValue());
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111118, i3111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111119, i3111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111110, i31111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111, i31111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111112, i31111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111113, i31111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111114, i31111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i31111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111115, i31111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111116, i31111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111117, i31111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111118, i31111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111119, i31111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i311111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111110, i311111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111, i311111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111112, i311111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111113, i311111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            int i311111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111114, i311111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue14 + jLongValue14) ^ (jLongValue14 >> 63));
                                            int i311111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111115, i311111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iM6826h2 = i30;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111116, i311111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111117, i311111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111118, i311111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111119, i311111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111110, i3111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111, i3111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111112, i3111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111113, i3111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i3111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111114, i3111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i3111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111115, i3111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111116, i3111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111117, i3111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111118, i3111111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111119, i3111111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111110, i31111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111, i31111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            int i31111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111112, i31111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue15 + jLongValue15) ^ (jLongValue15 >> 63));
                                            int i31111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111113, i31111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iM6826h2 = i32;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111114, i31111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111115, i31111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111116, i31111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i31111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111117, i31111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111118, i31111111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111119, i31111111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111110, i311111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111, i311111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111112, i311111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111113, i311111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i311111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111114, i311111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i311111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111115, i311111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i311111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111116, i311111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111117, i311111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111118, i311111111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111119, i311111111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            int i3111111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111110, i3111111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue16 + jLongValue16) ^ (jLongValue16 >> 63));
                                            int i3111111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111, i3111111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iM6825g10 = in6.m6825g((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = iM6825g10;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111112, i3111111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111113, i3111111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3111111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111114, i3111111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i3111111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111115, i3111111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111116, i3111111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111117, i3111111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111118, i3111111111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i3111111111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111119, i3111111111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i31111111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111110, i31111111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i31111111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111111, i31111111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111112, i31111111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i31111111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111113, i31111111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i31111111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111114, i31111111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i31111111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111115, i31111111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i31111111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111116, i31111111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i31111111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111117, i31111111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            int i31111111111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111118, i31111111111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue17 + jLongValue17) ^ (jLongValue17 >> 63));
                                            int i31111111111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i31111111111111111111111111111119, i31111111111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iM6825g10 = in6.m6826h((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                                    i12 = i12;
                                    it = it;
                                    iM6826h2 = iM6825g10;
                                    i8 = iM6826h2 + iM6825g20;
                                    iM6825g11 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g11 += iM6825g11;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111110, i311111111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111111, i311111111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 2:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111112, i311111111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 3:
                                            iM6826h3 = in6.m6826h(((Long) value).longValue());
                                            int i311111111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111113, i311111111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 4:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i311111111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111114, i311111111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i311111111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111115, i311111111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i311111111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111116, i311111111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h3 = i29;
                                            int i311111111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111117, i311111111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                                iM6826h3 = iMo11067d3 + iM6825g12;
                                            } else {
                                                iM6826h3 = in6.m6824f((String) value);
                                            }
                                            int i311111111111111111111111111111118 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111118, i311111111111111111111111111111118, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 9:
                                            iM6826h3 = ((hm6) value).mo6451d();
                                            int i311111111111111111111111111111119 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i311111111111111111111111111111119, i311111111111111111111111111111119, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 10:
                                            iMo11067d3 = ((hm6) value).mo6451d();
                                            iM6825g12 = in6.m6825g(iMo11067d3);
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111111111111111111110 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111110, i3111111111111111111111111111111110, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d3 = ((ym6) value).mo11067d();
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            } else {
                                                iMo11067d3 = ((byte[]) value).length;
                                                iM6825g12 = in6.m6825g(iMo11067d3);
                                            }
                                            iM6826h3 = iMo11067d3 + iM6825g12;
                                            int i3111111111111111111111111111111111 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111111, i3111111111111111111111111111111111, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 12:
                                            iM6826h3 = in6.m6825g(((Integer) value).intValue());
                                            int i3111111111111111111111111111111112 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111112, i3111111111111111111111111111111112, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 13:
                                            iM6826h3 = in6.m6826h(((Integer) value).intValue());
                                            int i3111111111111111111111111111111113 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111113, i3111111111111111111111111111111113, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h3 = i30;
                                            int i3111111111111111111111111111111114 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111114, i3111111111111111111111111111111114, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h3 = i32;
                                            int i3111111111111111111111111111111115 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111115, i3111111111111111111111111111111115, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iM6826h3 = in6.m6825g((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            int i3111111111111111111111111111111116 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111116, i3111111111111111111111111111111116, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iM6826h3 = in6.m6826h((jLongValue19 + jLongValue19) ^ (jLongValue19 >> 63));
                                            int i3111111111111111111111111111111117 = iM6826h3 + iM6825g11 + i8;
                                            iM10850p = sk5.m10850p(i3111111111111111111111111111111117, i3111111111111111111111111111111117, iM6825g19, iM10850p);
                                            i19 = i30;
                                            i17 = i29;
                                            i20 = i32;
                                            i10 = i33;
                                            i12 = i12;
                                            it = it;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i6 = i10;
                    i7 = i12;
                    iM10850p2 += iM10850p;
                    i10 = i6;
                    i12 = i7;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 51:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 8, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 52:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 53:
                    if (m12360j(i14, i11, hm6Var)) {
                        long jM12358n = m12358n(j, hm6Var);
                        iM6825g13 = in6.m6825g(i14 << 3);
                        iM6826h4 = in6.m6826h(jM12358n);
                        iM10850p2 += iM6826h4 + iM6825g13;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 54:
                    if (m12360j(i14, i11, hm6Var)) {
                        long jM12358n2 = m12358n(j, hm6Var);
                        iM6825g13 = in6.m6825g(i14 << 3);
                        iM6826h4 = in6.m6826h(jM12358n2);
                        iM10850p2 += iM6826h4 + iM6825g13;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 55:
                    if (m12360j(i14, i11, hm6Var)) {
                        long jM12356k = m12356k(j, hm6Var);
                        iM6825g13 = in6.m6825g(i14 << 3);
                        iM6826h4 = in6.m6826h(jM12356k);
                        iM10850p2 += iM6826h4 + iM6825g13;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 56:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 8, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 57:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 58:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 1, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 59:
                    if (m12360j(i14, i11, hm6Var)) {
                        int i40 = i14 << 3;
                        Object object3 = unsafe.getObject(hm6Var, j);
                        if (object3 instanceof ym6) {
                            iM6825g14 = in6.m6825g(i40);
                            iMo11067d4 = ((ym6) object3).mo11067d();
                            iM10850p2 = sk5.m10850p(iMo11067d4, iMo11067d4, iM6825g14, iM10850p2);
                        } else {
                            iM6825g13 = in6.m6825g(i40);
                            iM6826h4 = in6.m6824f((String) object3);
                            iM10850p2 += iM6826h4 + iM6825g13;
                        }
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 60:
                    if (m12360j(i14, i11, hm6Var)) {
                        Object object4 = unsafe.getObject(hm6Var, j);
                        kq6 kq6VarM12362o5 = m12362o(i11);
                        aj5 aj5Var22 = lq6.f24292a;
                        int iM6825g21 = in6.m6825g(i14 << 3);
                        int iMo6450c5 = ((hm6) object4).mo6450c(kq6VarM12362o5);
                        iM10850p2 = sk5.m10850p(iMo6450c5, iMo6450c5, iM6825g21, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 61:
                    if (m12360j(i14, i11, hm6Var)) {
                        ym6 ym6Var2 = (ym6) unsafe.getObject(hm6Var, j);
                        iM6825g14 = in6.m6825g(i14 << 3);
                        iMo11067d4 = ym6Var2.mo11067d();
                        iM10850p2 = sk5.m10850p(iMo11067d4, iMo11067d4, iM6825g14, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 62:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM12356k = m12356k(j, hm6Var);
                        iM6825g15 = in6.m6825g(i14 << 3);
                        iM10850p2 = sk5.m10847m(iM12356k, iM6825g15, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 63:
                    if (m12360j(i14, i11, hm6Var)) {
                        long jM12356k2 = m12356k(j, hm6Var);
                        iM6825g13 = in6.m6825g(i14 << 3);
                        iM6826h4 = in6.m6826h(jM12356k2);
                        iM10850p2 += iM6826h4 + iM6825g13;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 64:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 4, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 65:
                    if (m12360j(i14, i11, hm6Var)) {
                        iM10850p2 = sk5.m10847m(i14 << 3, 8, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 66:
                    if (m12360j(i14, i11, hm6Var)) {
                        int iM12356k2 = m12356k(j, hm6Var);
                        iM6825g15 = in6.m6825g(i14 << 3);
                        iM12356k = (iM12356k2 >> 31) ^ (iM12356k2 + iM12356k2);
                        iM10850p2 = sk5.m10847m(iM12356k, iM6825g15, iM10850p2);
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 67:
                    if (m12360j(i14, i11, hm6Var)) {
                        long jM12358n3 = m12358n(j, hm6Var);
                        iM6825g13 = in6.m6825g(i14 << 3);
                        iM6826h4 = in6.m6826h((jM12358n3 >> 63) ^ (jM12358n3 + jM12358n3));
                        iM10850p2 += iM6826h4 + iM6825g13;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 68:
                    if (m12360j(i14, i11, hm6Var)) {
                        hm6 hm6Var4 = (hm6) unsafe.getObject(hm6Var, j);
                        kq6 kq6VarM12362o6 = m12362o(i11);
                        aj5 aj5Var23 = lq6.f24292a;
                        int iM6825g22 = in6.m6825g(i14 << 3);
                        iMo6450c = hm6Var4.mo6450c(kq6VarM12362o6) + iM6825g22 + iM6825g22;
                        iM10850p2 += iMo6450c;
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                default:
                    i11 += 3;
                    i9 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x030b  */
    /* JADX WARN: Code duplicated, block: B:122:0x031d  */
    /* JADX WARN: Code duplicated, block: B:123:0x032e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0337  */
    /* JADX WARN: Code duplicated, block: B:127:0x033f  */
    /* JADX WARN: Code duplicated, block: B:128:0x034c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0358  */
    /* JADX WARN: Code duplicated, block: B:131:0x035c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0369  */
    /* JADX WARN: Code duplicated, block: B:134:0x0371  */
    /* JADX WARN: Code duplicated, block: B:135:0x037c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0383  */
    /* JADX WARN: Code duplicated, block: B:138:0x0387  */
    /* JADX WARN: Code duplicated, block: B:139:0x0392  */
    /* JADX WARN: Code duplicated, block: B:140:0x0399  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:146:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:284:0x0305 A[SYNTHETIC] */
    @Override // p000.kq6
    /* JADX INFO: renamed from: f */
    public final void mo7583f(Object obj, rr5 rr5Var) throws IOException {
        int i;
        int i2;
        int i3;
        boolean z;
        int iM6826h;
        int iMo11067d;
        int iM6825g;
        int i4;
        int iM6825g2;
        int iM6826h2;
        int iMo11067d2;
        int iM6825g3;
        wp6 wp6Var = this;
        in6 in6Var = (in6) rr5Var.f29555b;
        int[] iArr = wp6Var.f33588a;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr.length) {
            int iM12361m = wp6Var.m12361m(i7);
            int iM12357l = m12357l(iM12361m);
            int i9 = iArr[i7];
            Unsafe unsafe = f33587h;
            if (iM12357l <= 17) {
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
            long j = iM12361m & i5;
            int i12 = 1;
            int i13 = 2;
            switch (iM12357l) {
                case 0:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6838r(i9, Double.doubleToRawLongBits(rq6.f29536c.mo3731k(j, obj)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 1:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6836p(i9, Float.floatToRawIntBits(rq6.f29536c.mo3733m(j, obj)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 2:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6846z(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 3:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6846z(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 4:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6840t(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 5:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6838r(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 6:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6836p(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 7:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        byte bMo3745y = rq6.f29536c.mo3745y(j, obj);
                        in6Var.m6830j(11);
                        in6Var.m6833m(i9 << 3);
                        byte[] bArr = in6Var.f21598b;
                        int i14 = in6Var.f21600d;
                        bArr[i14] = bMo3745y;
                        in6Var.f21600d = i14 + 1;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 8:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            in6Var.m6845y((i9 << 3) | 2);
                            in6Var.m6842v((String) object);
                        } else {
                            in6Var.m6845y((i9 << 3) | 2);
                            in6Var.m6835o((ym6) object);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 9:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        rr5Var.m10419i(i9, unsafe.getObject(obj, j), wp6Var.m12362o(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 10:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        ym6 ym6Var = (ym6) unsafe.getObject(obj, j);
                        in6Var.m6845y((i9 << 3) | 2);
                        in6Var.m6835o(ym6Var);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 11:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6844x(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 12:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6840t(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 13:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6836p(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 14:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        in6Var.m6838r(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 15:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(obj, j);
                        in6Var.m6844x(i9, (i15 >> 31) ^ (i15 + i15));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 16:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        in6Var.m6846z(i9, (j2 >> 63) ^ (j2 + j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 17:
                    if (wp6Var.m12368v(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        in6Var.m6843w(i9, 3);
                        wp6Var.m12362o(i7).mo7583f((hm6) object2, rr5Var);
                        in6Var.m6843w(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 18:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8090q(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 19:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8094u(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 20:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8096w(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 21:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8077d(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 22:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8095v(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 23:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8093t(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 24:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8092s(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 25:
                    i6 = i6;
                    i8 = i8;
                    lq6.m8089p(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 26:
                    i2 = i6;
                    i3 = i8;
                    int i16 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    aj5 aj5Var = lq6.f24292a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof hp6) {
                            hp6 hp6Var = (hp6) list;
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                Object objM6472f = hp6Var.m6472f();
                                if (objM6472f instanceof String) {
                                    in6Var.m6845y((i16 << 3) | 2);
                                    in6Var.m6842v((String) objM6472f);
                                } else {
                                    in6Var.m6845y((i16 << 3) | 2);
                                    in6Var.m6835o((ym6) objM6472f);
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < list.size(); i18++) {
                                String str = (String) list.get(i18);
                                in6Var.m6845y((i16 << 3) | 2);
                                in6Var.m6842v(str);
                            }
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 27:
                    i2 = i6;
                    i3 = i8;
                    int i19 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    kq6 kq6VarM12362o = wp6Var.m12362o(i7);
                    aj5 aj5Var2 = lq6.f24292a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            rr5Var.m10419i(i19, list2.get(i20), kq6VarM12362o);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 28:
                    i2 = i6;
                    i3 = i8;
                    int i21 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    aj5 aj5Var3 = lq6.f24292a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i22 = 0; i22 < list3.size(); i22++) {
                            ym6 ym6Var2 = (ym6) list3.get(i22);
                            in6Var.m6845y((i21 << 3) | 2);
                            in6Var.m6835o(ym6Var2);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 29:
                    z = false;
                    lq6.m8076c(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 30:
                    z = false;
                    lq6.m8091r(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 31:
                    z = false;
                    lq6.m8097x(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 32:
                    z = false;
                    lq6.m8098y(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 33:
                    z = false;
                    lq6.m8074a(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 34:
                    z = false;
                    lq6.m8075b(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 35:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8090q(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 36:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8094u(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 37:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8096w(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 38:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8077d(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 39:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8095v(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 40:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8093t(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 41:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8092s(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 42:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8089p(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 43:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8076c(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 44:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8091r(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 45:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8097x(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 46:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8098y(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 47:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8074a(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 48:
                    i2 = i6;
                    i3 = i8;
                    lq6.m8075b(iArr[i7], (List) unsafe.getObject(obj, j), rr5Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 49:
                    i2 = i6;
                    i3 = i8;
                    int i23 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    kq6 kq6VarM12362o2 = wp6Var.m12362o(i7);
                    aj5 aj5Var4 = lq6.f24292a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            hm6 hm6Var = (hm6) list4.get(i24);
                            in6Var.m6843w(i23, 3);
                            kq6VarM12362o2.mo7583f(hm6Var, rr5Var);
                            in6Var.m6843w(i23, 4);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        int i25 = i7 / 3;
                        pq3 pq3Var = ((qp6) wp6Var.f33589b[i25 + i25]).f28678a;
                        for (Map.Entry entry : ((rp6) object3).entrySet()) {
                            in6Var.m6843w(i9, i13);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            uq6 uq6Var = (uq6) pq3Var.f27896b;
                            uq6 uq6Var2 = (uq6) pq3Var.f27897c;
                            int i26 = ao6.f14752c;
                            int iM6825g4 = in6.m6825g(8);
                            int i27 = i6;
                            uq6 uq6Var3 = uq6.f32110e;
                            if (uq6Var == uq6Var3) {
                                iM6825g4 += iM6825g4;
                            }
                            ar6 ar6Var = ar6.f14827a;
                            int i28 = i8;
                            switch (uq6Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iM6826h = 8;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key2);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value2);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key3);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value3);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key4);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value4);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key5);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value5);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key6);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value6);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key7);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value7);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key8);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value8);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key9);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value9);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key10);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value10);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key12);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value12);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key13);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value13);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key14);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value14);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key15);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value15);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key16);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value16);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key17);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value17);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key18);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value18);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue + jLongValue) ^ (jLongValue >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key19);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value19);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iM6826h = 4;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    iM6826h = in6.m6826h(((Long) key).longValue());
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    iM6826h = in6.m6826h(((Long) key).longValue());
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue4 + jLongValue4) ^ (jLongValue4 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    iM6826h = in6.m6826h(((Integer) key).intValue());
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue5 + jLongValue5) ^ (jLongValue5 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iM6826h = 8;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue6 + jLongValue6) ^ (jLongValue6 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iM6826h = 4;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue7 + jLongValue7) ^ (jLongValue7 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iM6826h = i12;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue8 + jLongValue8) ^ (jLongValue8 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    if (key instanceof ym6) {
                                        iMo11067d = ((ym6) key).mo11067d();
                                        iM6825g = in6.m6825g(iMo11067d);
                                        iM6826h = iMo11067d + iM6825g;
                                    } else {
                                        iM6826h = in6.m6824f((String) key);
                                    }
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue9 + jLongValue9) ^ (jLongValue9 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iM6826h = ((hm6) key).mo6451d();
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue10 + jLongValue10) ^ (jLongValue10 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    iMo11067d = ((hm6) key).mo6451d();
                                    iM6825g = in6.m6825g(iMo11067d);
                                    iM6826h = iMo11067d + iM6825g;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue11 + jLongValue11) ^ (jLongValue11 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    if (key instanceof ym6) {
                                        iMo11067d = ((ym6) key).mo11067d();
                                        iM6825g = in6.m6825g(iMo11067d);
                                    } else {
                                        iMo11067d = ((byte[]) key).length;
                                        iM6825g = in6.m6825g(iMo11067d);
                                    }
                                    iM6826h = iMo11067d + iM6825g;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue12 + jLongValue12) ^ (jLongValue12 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    iM6826h = in6.m6825g(((Integer) key).intValue());
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue13 + jLongValue13) ^ (jLongValue13 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    iM6826h = in6.m6826h(((Integer) key).intValue());
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue14 + jLongValue14) ^ (jLongValue14 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iM6826h = 4;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue15 + jLongValue15) ^ (jLongValue15 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iM6826h = 8;
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue16 + jLongValue16) ^ (jLongValue16 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iM6826h = in6.m6825g((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue17 + jLongValue17) ^ (jLongValue17 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iM6826h = in6.m6826h((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                                    i4 = iM6826h + iM6825g4;
                                    iM6825g2 = in6.m6825g(16);
                                    if (uq6Var2 == uq6Var3) {
                                        iM6825g2 += iM6825g2;
                                    }
                                    switch (uq6Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key1111111111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value1111111111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 3:
                                            iM6826h2 = in6.m6826h(((Long) value).longValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 4:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iM6826h2 = i12;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                                iM6826h2 = iMo11067d2 + iM6825g3;
                                            } else {
                                                iM6826h2 = in6.m6824f((String) value);
                                            }
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111116);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111116);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 9:
                                            iM6826h2 = ((hm6) value).mo6451d();
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111117);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111117);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 10:
                                            iMo11067d2 = ((hm6) value).mo6451d();
                                            iM6825g3 = in6.m6825g(iMo11067d2);
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111118);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111118);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof ym6) {
                                                iMo11067d2 = ((ym6) value).mo11067d();
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            } else {
                                                iMo11067d2 = ((byte[]) value).length;
                                                iM6825g3 = in6.m6825g(iMo11067d2);
                                            }
                                            iM6826h2 = iMo11067d2 + iM6825g3;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key11111111111111111111111111111119);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value11111111111111111111111111111119);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 12:
                                            iM6826h2 = in6.m6825g(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111110);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111110);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 13:
                                            iM6826h2 = in6.m6826h(((Integer) value).intValue());
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111111);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111111);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6826h2 = 4;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111112);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111112);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6826h2 = 8;
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111113);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111113);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iM6826h2 = in6.m6825g((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111114);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111114);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iM6826h2 = in6.m6826h((jLongValue19 + jLongValue19) ^ (jLongValue19 >> 63));
                                            in6Var.m6845y(iM6826h2 + iM6825g2 + i4);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            ao6.m3101b(in6Var, (uq6) pq3Var.f27896b, i12, key111111111111111111111111111111115);
                                            ao6.m3101b(in6Var, uq6Var2, 2, value111111111111111111111111111111115);
                                            i13 = 2;
                                            i6 = i27;
                                            i8 = i28;
                                            i12 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 51:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6838r(i9, Double.doubleToRawLongBits(((Double) rq6.m10407g(j, obj)).doubleValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 52:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6836p(i9, Float.floatToRawIntBits(((Float) rq6.m10407g(j, obj)).floatValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 53:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6846z(i9, m12358n(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 54:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6846z(i9, m12358n(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 55:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6840t(i9, m12356k(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 56:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6838r(i9, m12358n(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 57:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6836p(i9, m12356k(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 58:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        byte bBooleanValue = ((Boolean) rq6.m10407g(j, obj)).booleanValue();
                        in6Var.m6830j(11);
                        in6Var.m6833m(i9 << 3);
                        byte[] bArr2 = in6Var.f21598b;
                        int i29 = in6Var.f21600d;
                        bArr2[i29] = bBooleanValue;
                        in6Var.f21600d = i29 + 1;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 59:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            in6Var.m6845y(2 | (i9 << 3));
                            in6Var.m6842v((String) object4);
                        } else {
                            in6Var.m6845y(2 | (i9 << 3));
                            in6Var.m6835o((ym6) object4);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 60:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        rr5Var.m10419i(i9, unsafe.getObject(obj, j), wp6Var.m12362o(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 61:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        ym6 ym6Var3 = (ym6) unsafe.getObject(obj, j);
                        in6Var.m6845y(2 | (i9 << 3));
                        in6Var.m6835o(ym6Var3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 62:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6844x(i9, m12356k(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 63:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6840t(i9, m12356k(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 64:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6836p(i9, m12356k(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 65:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        in6Var.m6838r(i9, m12358n(j, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 66:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        int iM12356k = m12356k(j, obj);
                        in6Var.m6844x(i9, (iM12356k >> 31) ^ (iM12356k + iM12356k));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 67:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        long jM12358n = m12358n(j, obj);
                        in6Var.m6846z(i9, (jM12358n >> 63) ^ (jM12358n + jM12358n));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                case 68:
                    if (wp6Var.m12360j(i9, i7, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        in6Var.m6843w(i9, 3);
                        wp6Var.m12362o(i7).mo7583f((hm6) object5, rr5Var);
                        in6Var.m6843w(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    wp6Var = this;
                    break;
            }
        }
        pq6 pq6Var = ((jo6) obj).zzc;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.kq6
    /* JADX INFO: renamed from: g */
    public final int mo7584g(jo6 jo6Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f33588a;
            if (i5 >= iArr.length) {
                jo6Var.zzc.getClass();
                return (i6 * 53) + 506991;
            }
            int iM12361m = m12361m(i5);
            int i7 = 1048575 & iM12361m;
            int iM12357l = m12357l(iM12361m);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iM12357l) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(rq6.f29536c.mo3731k(j, jo6Var));
                    Charset charset = ro6.f29484a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(rq6.f29536c.mo3733m(j, jo6Var));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = rq6.m10406f(j, jo6Var);
                    Charset charset2 = ro6.f29484a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = rq6.m10406f(j, jo6Var);
                    Charset charset3 = ro6.f29484a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10405e(j, jo6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = rq6.m10406f(j, jo6Var);
                    Charset charset4 = ro6.f29484a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10405e(j, jo6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zMo3745y = rq6.f29536c.mo3745y(j, jo6Var);
                    Charset charset5 = ro6.f29484a;
                    if (zMo3745y) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) rq6.m10407g(j, jo6Var)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objM10407g = rq6.m10407g(j, jo6Var);
                    if (objM10407g != null) {
                        iHashCode = objM10407g.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10407g(j, jo6Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10405e(j, jo6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10405e(j, jo6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10405e(j, jo6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = rq6.m10406f(j, jo6Var);
                    Charset charset6 = ro6.f29484a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10405e(j, jo6Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = rq6.m10406f(j, jo6Var);
                    Charset charset7 = ro6.f29484a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objM10407g2 = rq6.m10407g(j, jo6Var);
                    if (objM10407g2 != null) {
                        iHashCode = objM10407g2.hashCode();
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
                    iFloatToIntBits = rq6.m10407g(j, jo6Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = rq6.m10407g(j, jo6Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (m12360j(i8, i5, jo6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) rq6.m10407g(j, jo6Var)).doubleValue());
                        Charset charset8 = ro6.f29484a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) rq6.m10407g(j, jo6Var)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (m12360j(i8, i5, jo6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m12358n(j, jo6Var);
                        Charset charset9 = ro6.f29484a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (m12360j(i8, i5, jo6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m12358n(j, jo6Var);
                        Charset charset10 = ro6.f29484a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m12356k(j, jo6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (m12360j(i8, i5, jo6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m12358n(j, jo6Var);
                        Charset charset11 = ro6.f29484a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m12356k(j, jo6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (m12360j(i8, i5, jo6Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) rq6.m10407g(j, jo6Var)).booleanValue();
                        Charset charset12 = ro6.f29484a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) rq6.m10407g(j, jo6Var)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = rq6.m10407g(j, jo6Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = rq6.m10407g(j, jo6Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m12356k(j, jo6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m12356k(j, jo6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m12356k(j, jo6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (m12360j(i8, i5, jo6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m12358n(j, jo6Var);
                        Charset charset13 = ro6.f29484a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m12356k(j, jo6Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (m12360j(i8, i5, jo6Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m12358n(j, jo6Var);
                        Charset charset14 = ro6.f29484a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (m12360j(i8, i5, jo6Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = rq6.m10407g(j, jo6Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: h */
    public final jo6 mo7585h() {
        return (jo6) ((jo6) this.f33590c).mo205g(4);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12360j(int i, int i2, Object obj) {
        return rq6.m10405e((long) (this.f33588a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: m */
    public final int m12361m(int i) {
        return this.f33588a[i + 1];
    }

    /* JADX INFO: renamed from: o */
    public final kq6 m12362o(int i) {
        Object[] objArr = this.f33589b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        kq6 kq6Var = (kq6) objArr[i3];
        if (kq6Var != null) {
            return kq6Var;
        }
        kq6 kq6VarM13720a = zp6.f36259c.m13720a((Class) objArr[i3 + 1]);
        objArr[i3] = kq6VarM13720a;
        return kq6VarM13720a;
    }

    /* JADX INFO: renamed from: q */
    public final void m12363q(int i, Object obj, Object obj2) {
        if (m12367u(i, obj2)) {
            long jM12361m = m12361m(i) & 1048575;
            Unsafe unsafe = f33587h;
            Object object = unsafe.getObject(obj2, jM12361m);
            if (object == null) {
                qm5.m9915f(obj2, this.f33588a[i]);
                return;
            }
            kq6 kq6VarM12362o = m12362o(i);
            if (!m12367u(i, obj)) {
                if (m12355i(object)) {
                    jo6 jo6VarMo7585h = kq6VarM12362o.mo7585h();
                    kq6VarM12362o.mo7579b(jo6VarMo7585h, object);
                    unsafe.putObject(obj, jM12361m, jo6VarMo7585h);
                } else {
                    unsafe.putObject(obj, jM12361m, object);
                }
                m12365s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM12361m);
            if (!m12355i(object2)) {
                jo6 jo6VarMo7585h2 = kq6VarM12362o.mo7585h();
                kq6VarM12362o.mo7579b(jo6VarMo7585h2, object2);
                unsafe.putObject(obj, jM12361m, jo6VarMo7585h2);
                object2 = jo6VarMo7585h2;
            }
            kq6VarM12362o.mo7579b(object2, object);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m12364r(int i, Object obj, Object obj2) {
        int[] iArr = this.f33588a;
        int i2 = iArr[i];
        if (m12360j(i2, i, obj2)) {
            long jM12361m = m12361m(i) & 1048575;
            Unsafe unsafe = f33587h;
            Object object = unsafe.getObject(obj2, jM12361m);
            if (object == null) {
                qm5.m9915f(obj2, iArr[i]);
                return;
            }
            kq6 kq6VarM12362o = m12362o(i);
            if (!m12360j(i2, i, obj)) {
                if (m12355i(object)) {
                    jo6 jo6VarMo7585h = kq6VarM12362o.mo7585h();
                    kq6VarM12362o.mo7579b(jo6VarMo7585h, object);
                    unsafe.putObject(obj, jM12361m, jo6VarMo7585h);
                } else {
                    unsafe.putObject(obj, jM12361m, object);
                }
                rq6.m10408h(iArr[i + 2] & 1048575, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM12361m);
            if (!m12355i(object2)) {
                jo6 jo6VarMo7585h2 = kq6VarM12362o.mo7585h();
                kq6VarM12362o.mo7579b(jo6VarMo7585h2, object2);
                unsafe.putObject(obj, jM12361m, jo6VarMo7585h2);
                object2 = jo6VarMo7585h2;
            }
            kq6VarM12362o.mo7579b(object2, object);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12365s(int i, Object obj) {
        int i2 = this.f33588a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        rq6.m10408h(j, (1 << (i2 >>> 20)) | rq6.m10405e(j, obj), obj);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m12366t(jo6 jo6Var, jo6 jo6Var2, int i) {
        return m12367u(i, jo6Var) == m12367u(i, jo6Var2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: u */
    public final boolean m12367u(int i, Object obj) {
        int i2 = this.f33588a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & rq6.m10405e(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM12361m = m12361m(i);
        long j2 = iM12361m & 1048575;
        switch (m12357l(iM12361m)) {
            case 0:
                if (Double.doubleToRawLongBits(rq6.f29536c.mo3731k(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(rq6.f29536c.mo3733m(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (rq6.m10406f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (rq6.m10406f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (rq6.m10405e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (rq6.m10406f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (rq6.m10405e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return rq6.f29536c.mo3745y(j2, obj);
            case 8:
                Object objM10407g = rq6.m10407g(j2, obj);
                if (objM10407g instanceof String) {
                    if (((String) objM10407g).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM10407g instanceof ym6)) {
                    ds3.m4665g();
                    return false;
                }
                if (ym6.f35338c.equals(objM10407g)) {
                    return false;
                }
                return true;
            case 9:
                if (rq6.m10407g(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (ym6.f35338c.equals(rq6.m10407g(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (rq6.m10405e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (rq6.m10405e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (rq6.m10405e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (rq6.m10406f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (rq6.m10405e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (rq6.m10406f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (rq6.m10407g(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                ds3.m4665g();
                return false;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m12368v(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m12367u(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
