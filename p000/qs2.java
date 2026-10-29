package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 implements gw3 {

    /* JADX INFO: renamed from: k */
    public static final int[] f28749k = new int[0];

    /* JADX INFO: renamed from: l */
    public static final Unsafe f28750l = dv4.m4759i();

    /* JADX INFO: renamed from: a */
    public int[] f28751a;

    /* JADX INFO: renamed from: b */
    public Object[] f28752b;

    /* JADX INFO: renamed from: c */
    public int f28753c;

    /* JADX INFO: renamed from: d */
    public int f28754d;

    /* JADX INFO: renamed from: e */
    public AbstractC1277w1 f28755e;

    /* JADX INFO: renamed from: f */
    public boolean f28756f;

    /* JADX INFO: renamed from: g */
    public int[] f28757g;

    /* JADX INFO: renamed from: h */
    public int f28758h;

    /* JADX INFO: renamed from: i */
    public int f28759i;

    /* JADX INFO: renamed from: j */
    public ia5 f28760j;

    /* JADX INFO: renamed from: E */
    public static Field m10050E(Class cls, String str) {
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

    /* JADX INFO: renamed from: H */
    public static int m10051H(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m10052p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vr1) {
            return ((vr1) obj).m11980f();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static long m10053w(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: x */
    public static int m10054x(long j, Object obj) {
        return ((Integer) dv4.m4758h(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: y */
    public static long m10055y(long j, Object obj) {
        return ((Long) dv4.m4758h(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final void m10056A(Object obj, long j, xa0 xa0Var, gw3 gw3Var, rc1 rc1Var) throws i72 {
        int iMo11336u;
        List listM11051c = (j62) dv4.m4758h(j, obj);
        if (!((AbstractC0596e2) listM11051c).f17637a) {
            int size = listM11051c.size();
            listM11051c = ((th3) listM11051c).m11051c(size == 0 ? 10 : size * 2);
            dv4.m4765o(j, obj, listM11051c);
        }
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        int i = xa0Var.f34092b;
        if ((i & 7) != 3) {
            throw i72.m6684b();
        }
        do {
            vr1 vr1VarMo6182d = gw3Var.mo6182d();
            xa0Var.m12606h(vr1VarMo6182d, gw3Var, rc1Var);
            gw3Var.mo6180b(vr1VarMo6182d);
            listM11051c.add(vr1VarMo6182d);
            if (wa0Var.mo11313c() || xa0Var.f34094d != 0) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == i);
        xa0Var.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: B */
    public final void m10057B(Object obj, int i, xa0 xa0Var, gw3 gw3Var, rc1 rc1Var) throws i72 {
        int iMo11336u;
        long j = 1048575 & i;
        List listM11051c = (j62) dv4.m4758h(j, obj);
        if (!((AbstractC0596e2) listM11051c).f17637a) {
            int size = listM11051c.size();
            listM11051c = ((th3) listM11051c).m11051c(size == 0 ? 10 : size * 2);
            dv4.m4765o(j, obj, listM11051c);
        }
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        int i2 = xa0Var.f34092b;
        if ((i2 & 7) != 2) {
            throw i72.m6684b();
        }
        do {
            vr1 vr1VarMo6182d = gw3Var.mo6182d();
            xa0Var.m12610j(vr1VarMo6182d, gw3Var, rc1Var);
            gw3Var.mo6180b(vr1VarMo6182d);
            listM11051c.add(vr1VarMo6182d);
            if (wa0Var.mo11313c() || xa0Var.f34094d != 0) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == i2);
        xa0Var.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: C */
    public final void m10058C(int i, xa0 xa0Var, Object obj) {
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        if ((536870912 & i) != 0) {
            xa0Var.m12593W(2);
            dv4.m4765o(i & 1048575, obj, wa0Var.mo11335t());
        } else if (!this.f28756f) {
            dv4.m4765o(i & 1048575, obj, xa0Var.m12616m());
        } else {
            xa0Var.m12593W(2);
            dv4.m4765o(i & 1048575, obj, wa0Var.mo11334s());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m10059D(int i, xa0 xa0Var, Object obj) throws g72 {
        if ((536870912 & i) != 0) {
            long j = i & 1048575;
            j62 j62VarM11051c = (j62) dv4.m4758h(j, obj);
            if (!((AbstractC0596e2) j62VarM11051c).f17637a) {
                int size = j62VarM11051c.size();
                j62VarM11051c = ((th3) j62VarM11051c).m11051c(size != 0 ? size * 2 : 10);
                dv4.m4765o(j, obj, j62VarM11051c);
            }
            xa0Var.m12586P(j62VarM11051c, true);
            return;
        }
        long j2 = i & 1048575;
        j62 j62VarM11051c2 = (j62) dv4.m4758h(j2, obj);
        if (!((AbstractC0596e2) j62VarM11051c2).f17637a) {
            int size2 = j62VarM11051c2.size();
            j62VarM11051c2 = ((th3) j62VarM11051c2).m11051c(size2 != 0 ? size2 * 2 : 10);
            dv4.m4765o(j2, obj, j62VarM11051c2);
        }
        xa0Var.m12586P(j62VarM11051c2, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m10060F(int i, Object obj) {
        int i2 = this.f28751a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        dv4.m4763m(j, (1 << (i2 >>> 20)) | dv4.m4756f(j, obj), obj);
    }

    /* JADX INFO: renamed from: G */
    public final void m10061G(int i, int i2, Object obj) {
        dv4.m4763m(this.f28751a[i2 + 2] & 1048575, i, obj);
    }

    /* JADX INFO: renamed from: I */
    public final int m10062I(int i) {
        return this.f28751a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    @Override // p000.gw3
    /* JADX INFO: renamed from: a */
    public final void mo6179a(Object obj, Object obj2) {
        Object obj3;
        int[] iArr = this.f28751a;
        if (!m10052p(obj)) {
            wb1.m12195o(obj, "Mutating immutable message: ");
            return;
        }
        byte[] bArr = l62.f23817a;
        obj2.getClass();
        int i = 0;
        while (i < iArr.length) {
            int iM10062I = m10062I(i);
            long j = 1048575 & iM10062I;
            int i2 = iArr[i];
            switch (m10051H(iM10062I)) {
                case 0:
                    if (!m10067n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        bv4 bv4Var = dv4.f17431c;
                        obj3 = obj;
                        bv4Var.mo3320g(obj3, j, bv4Var.mo3317c(j, obj2));
                        m10060F(i, obj3);
                    }
                    break;
                case 1:
                    if (m10067n(i, obj2)) {
                        bv4 bv4Var2 = dv4.f17431c;
                        bv4Var2.mo3321h(obj, j, bv4Var2.mo3318d(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m10067n(i, obj2)) {
                        dv4.m4764n(obj, j, dv4.m4757g(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m10067n(i, obj2)) {
                        dv4.m4764n(obj, j, dv4.m4757g(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m10067n(i, obj2)) {
                        dv4.m4763m(j, dv4.m4756f(j, obj2), obj);
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m10067n(i, obj2)) {
                        dv4.m4764n(obj, j, dv4.m4757g(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m10067n(i, obj2)) {
                        dv4.m4763m(j, dv4.m4756f(j, obj2), obj);
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m10067n(i, obj2)) {
                        bv4 bv4Var3 = dv4.f17431c;
                        bv4Var3.mo3319e(j, obj, bv4Var3.mo3316a(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m10067n(i, obj2)) {
                        dv4.m4765o(j, obj, dv4.m4758h(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m10071s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m10067n(i, obj2)) {
                        dv4.m4765o(j, obj, dv4.m4758h(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m10067n(i, obj2)) {
                        dv4.m4763m(j, dv4.m4756f(j, obj2), obj);
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m10067n(i, obj2)) {
                        dv4.m4763m(j, dv4.m4756f(j, obj2), obj);
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m10067n(i, obj2)) {
                        dv4.m4763m(j, dv4.m4756f(j, obj2), obj);
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m10067n(i, obj2)) {
                        dv4.m4764n(obj, j, dv4.m4757g(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m10067n(i, obj2)) {
                        dv4.m4763m(j, dv4.m4756f(j, obj2), obj);
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m10067n(i, obj2)) {
                        dv4.m4764n(obj, j, dv4.m4757g(j, obj2));
                        m10060F(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m10071s(i, obj, obj2);
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
                    j62 j62VarM11051c = (j62) dv4.m4758h(j, obj);
                    j62 j62Var = (j62) dv4.m4758h(j, obj2);
                    int size = j62VarM11051c.size();
                    int size2 = j62Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0596e2) j62VarM11051c).f17637a) {
                            j62VarM11051c = ((th3) j62VarM11051c).m11051c(size2 + size);
                        }
                        j62VarM11051c.addAll(j62Var);
                    }
                    if (size > 0) {
                        j62Var = j62VarM11051c;
                    }
                    dv4.m4765o(j, obj, j62Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = kw3.f23562a;
                    yp2 yp2VarM13210b = (yp2) dv4.m4758h(j, obj);
                    yp2 yp2Var = (yp2) dv4.m4758h(j, obj2);
                    if (!yp2Var.isEmpty()) {
                        if (!yp2VarM13210b.f35446a) {
                            yp2VarM13210b = yp2VarM13210b.m13210b();
                        }
                        yp2VarM13210b.m13209a();
                        if (!yp2Var.isEmpty()) {
                            yp2VarM13210b.putAll(yp2Var);
                        }
                    }
                    dv4.m4765o(j, obj, yp2VarM13210b);
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
                    if (m10069q(i2, i, obj2)) {
                        dv4.m4765o(j, obj, dv4.m4758h(j, obj2));
                        m10061G(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m10072t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m10069q(i2, i, obj2)) {
                        dv4.m4765o(j, obj, dv4.m4758h(j, obj2));
                        m10061G(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m10072t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
        kw3.m7653k(this.f28760j, obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
    @Override // p000.gw3
    /* JADX INFO: renamed from: b */
    public final void mo6180b(Object obj) {
        int[] iArr = this.f28751a;
        if (m10052p(obj)) {
            if (obj instanceof vr1) {
                vr1 vr1Var = (vr1) obj;
                vr1Var.m11983k(Integer.MAX_VALUE);
                vr1Var.memoizedHashCode = 0;
                vr1Var.m11981g();
            }
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM10062I = m10062I(i);
                long j = 1048575 & iM10062I;
                int iM10051H = m10051H(iM10062I);
                Unsafe unsafe = f28750l;
                if (iM10051H != 9) {
                    if (iM10051H != 60 && iM10051H != 68) {
                        switch (iM10051H) {
                            case 17:
                                if (m10067n(i, obj)) {
                                    m10066m(i).mo6180b(unsafe.getObject(obj, j));
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
                                AbstractC0596e2 abstractC0596e2 = (AbstractC0596e2) ((j62) dv4.m4758h(j, obj));
                                if (abstractC0596e2.f17637a) {
                                    abstractC0596e2.f17637a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((yp2) object).f35446a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m10069q(iArr[i], i, obj)) {
                        m10066m(i).mo6180b(unsafe.getObject(obj, j));
                    }
                } else if (m10067n(i, obj)) {
                    m10066m(i).mo6180b(unsafe.getObject(obj, j));
                }
            }
            this.f28760j.getClass();
            ou4 ou4Var = ((vr1) obj).unknownFields;
            if (ou4Var.f27131e) {
                ou4Var.f27131e = false;
            }
        }
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: c */
    public final boolean mo6181c(Object obj) {
        int i;
        int i2;
        qs2 qs2Var;
        Object obj2;
        int[] iArr = this.f28751a;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.f28758h) {
            int i6 = this.f28757g[i4];
            int iM10062I = this.m10062I(i6);
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = f28750l.getInt(obj, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & iM10062I) != 0) {
                qs2Var = this;
                obj2 = obj;
                if (!qs2Var.m10068o(obj2, i6, i, i2, i9)) {
                }
                return false;
            }
            qs2Var = this;
            obj2 = obj;
            int iM10051H = m10051H(iM10062I);
            if (iM10051H == 9 || iM10051H == 17) {
                if (qs2Var.m10068o(obj2, i6, i, i2, i9) && !qs2Var.m10066m(i6).mo6181c(dv4.m4758h(iM10062I & 1048575, obj2))) {
                    return false;
                }
                i4++;
                this = qs2Var;
                obj = obj2;
                i3 = i;
                i5 = i2;
            } else {
                if (iM10051H != 27) {
                    if (iM10051H == 60 || iM10051H == 68) {
                        if (qs2Var.m10069q(iArr[i6], i6, obj2) && !qs2Var.m10066m(i6).mo6181c(dv4.m4758h(iM10062I & 1048575, obj2))) {
                            return false;
                        }
                        i4++;
                        this = qs2Var;
                        obj = obj2;
                        i3 = i;
                        i5 = i2;
                    } else if (iM10051H != 49) {
                        if (iM10051H != 50) {
                            continue;
                        } else {
                            yp2 yp2Var = (yp2) dv4.m4758h(iM10062I & 1048575, obj2);
                            if (!yp2Var.isEmpty() && ((u15) ((wp2) qs2Var.f28752b[(i6 / 3) * 2]).f33578a.f22482c).f31604a == v15.f32317i) {
                                gw3 gw3VarM10338a = null;
                                for (Object obj3 : yp2Var.values()) {
                                    if (gw3VarM10338a == null) {
                                        gw3VarM10338a = rh3.f29290c.m10338a(((vr1) obj3).getClass());
                                    }
                                    if (!gw3VarM10338a.mo6181c(obj3)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        i4++;
                        this = qs2Var;
                        obj = obj2;
                        i3 = i;
                        i5 = i2;
                    }
                }
                List list = (List) dv4.m4758h(iM10062I & 1048575, obj2);
                if (list.isEmpty()) {
                    continue;
                } else {
                    gw3 gw3VarM10066m = qs2Var.m10066m(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!gw3VarM10066m.mo6181c(list.get(i10))) {
                            return false;
                        }
                    }
                }
                i4++;
                this = qs2Var;
                obj = obj2;
                i3 = i;
                i5 = i2;
            }
        }
        return true;
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: d */
    public final vr1 mo6182d() {
        return ((vr1) this.f28755e).m11982i();
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: e */
    public final int mo6183e(vr1 vr1Var) {
        int i;
        int iM7835a;
        int length = this.f28751a.length;
        int iHashCode = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iM10062I = m10062I(i2);
            int iM10051H = m10051H(iM10062I);
            if (iM10051H <= 50 || iM10051H >= 69) {
                long j = 1048575 & iM10062I;
                int iHashCode2 = 37;
                switch (iM10051H) {
                    case 0:
                        i = iHashCode * 53;
                        iM7835a = l62.m7835a(Double.doubleToLongBits(dv4.f17431c.mo3317c(j, vr1Var)));
                        iHashCode = i + iM7835a;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iM7835a = Float.floatToIntBits(dv4.f17431c.mo3318d(j, vr1Var));
                        iHashCode = i + iM7835a;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        iM7835a = l62.m7835a(dv4.m4757g(j, vr1Var));
                        iHashCode = i + iM7835a;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        iM7835a = l62.m7835a(dv4.m4757g(j, vr1Var));
                        iHashCode = i + iM7835a;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4756f(j, vr1Var);
                        iHashCode = i + iM7835a;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        iM7835a = l62.m7835a(dv4.m4757g(j, vr1Var));
                        iHashCode = i + iM7835a;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4756f(j, vr1Var);
                        iHashCode = i + iM7835a;
                        break;
                    case 7:
                        int i3 = iHashCode * 53;
                        boolean zMo3316a = dv4.f17431c.mo3316a(j, vr1Var);
                        byte[] bArr = l62.f23817a;
                        iHashCode = i3 + (zMo3316a ? 1231 : 1237);
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iM7835a = ((String) dv4.m4758h(j, vr1Var)).hashCode();
                        iHashCode = i + iM7835a;
                        break;
                    case 9:
                        Object objM4758h = dv4.m4758h(j, vr1Var);
                        if (objM4758h != null) {
                            iHashCode2 = objM4758h.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4758h(j, vr1Var).hashCode();
                        iHashCode = i + iM7835a;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4756f(j, vr1Var);
                        iHashCode = i + iM7835a;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4756f(j, vr1Var);
                        iHashCode = i + iM7835a;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4756f(j, vr1Var);
                        iHashCode = i + iM7835a;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        iM7835a = l62.m7835a(dv4.m4757g(j, vr1Var));
                        iHashCode = i + iM7835a;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4756f(j, vr1Var);
                        iHashCode = i + iM7835a;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        iM7835a = l62.m7835a(dv4.m4757g(j, vr1Var));
                        iHashCode = i + iM7835a;
                        break;
                    case 17:
                        Object objM4758h2 = dv4.m4758h(j, vr1Var);
                        if (objM4758h2 != null) {
                            iHashCode2 = objM4758h2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
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
                        i = iHashCode * 53;
                        iM7835a = dv4.m4758h(j, vr1Var).hashCode();
                        iHashCode = i + iM7835a;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iM7835a = dv4.m4758h(j, vr1Var).hashCode();
                        iHashCode = i + iM7835a;
                        break;
                }
            }
        }
        int i4 = this.f28759i;
        while (true) {
            int[] iArr = this.f28757g;
            if (i4 >= iArr.length) {
                this.f28760j.getClass();
                return vr1Var.unknownFields.hashCode() + (iHashCode * 53);
            }
            int i5 = iArr[i4];
            if (!m10069q(0, i5, vr1Var)) {
                iHashCode = dv4.m4758h(m10062I(i5) & 1048575, vr1Var).hashCode() + (iHashCode * 53);
            }
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x07ce A[Catch: all -> 0x04bc, TryCatch #15 {all -> 0x04bc, blocks: (B:158:0x07c9, B:160:0x07ce, B:161:0x07d3, B:114:0x04b7, B:117:0x04bf, B:118:0x04d4, B:119:0x04e9, B:120:0x04fe, B:121:0x0513, B:122:0x0528, B:123:0x053d, B:124:0x0552, B:125:0x0567, B:126:0x058f, B:127:0x05af, B:128:0x05cf, B:129:0x05f0, B:130:0x0611, B:131:0x0634, B:132:0x0654, B:133:0x066d, B:134:0x0695, B:135:0x06a6, B:136:0x06c8, B:137:0x06e9, B:138:0x070a, B:139:0x072a, B:140:0x074a, B:141:0x0769, B:142:0x078b, B:148:0x07ad), top: B:191:0x07c9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x07dd A[LOOP:2: B:164:0x07db->B:165:0x07dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x07f4 A[LOOP:3: B:170:0x07f2->B:171:0x07f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:208:0x07d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // p000.gw3
    /* JADX INFO: renamed from: f */
    public final void mo6184f(Object obj, xa0 xa0Var, rc1 rc1Var) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        xa0 xa0Var2;
        rc1 rc1Var2;
        int i3;
        qs2 qs2Var = this;
        Object obj2 = obj;
        xa0 xa0Var3 = xa0Var;
        rc1 rc1Var3 = rc1Var;
        byte[] bArr = l62.f23817a;
        rc1Var3.getClass();
        if (!m10052p(obj2)) {
            wb1.m12195o(obj2, "Mutating immutable message: ");
            return;
        }
        ia5 ia5Var = qs2Var.f28760j;
        int[] iArr2 = qs2Var.f28757g;
        int i4 = qs2Var.f28759i;
        int i5 = qs2Var.f28758h;
        ou4 ou4VarM6714g = null;
        while (true) {
            try {
                int iM12598d = xa0Var3.m12598d();
                int iM10075z = qs2Var.m10075z(iM12598d);
                if (iM10075z >= 0) {
                    int iM10062I = qs2Var.m10062I(iM10075z);
                    try {
                        try {
                            int iM10051H = m10051H(iM10062I);
                            Unsafe unsafe = f28750l;
                            q50 q50Var = wl2.f33461a;
                            switch (iM10051H) {
                                case 0:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w = m10053w(iM10062I);
                                    xa0Var2.m12593W(1);
                                    try {
                                        try {
                                            dv4.f17431c.mo3320g(obj, jM10053w, ((wa0) xa0Var2.f34095e).mo11323h());
                                            obj2 = obj;
                                            qs2Var.m10060F(iM10075z, obj2);
                                        } catch (g72 unused) {
                                            obj2 = obj;
                                            try {
                                                ia5Var.getClass();
                                                if (ou4VarM6714g == null) {
                                                    ou4VarM6714g = ia5Var.m6714g(obj2);
                                                }
                                                if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                        i5++;
                                                    }
                                                    if (ou4VarM6714g == null) {
                                                        return;
                                                    }
                                                    ((vr1) obj2).unknownFields = ou4VarM6714g;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i2;
                                                while (i5 < i) {
                                                    qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                    i5++;
                                                }
                                                if (ou4VarM6714g != null) {
                                                    ia5Var.getClass();
                                                    ((vr1) obj2).unknownFields = ou4VarM6714g;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i = i2;
                                            while (i5 < i) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g != null) {
                                                ia5Var.getClass();
                                                ((vr1) obj2).unknownFields = ou4VarM6714g;
                                            }
                                            throw th;
                                        }
                                    } catch (g72 unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w2 = m10053w(iM10062I);
                                    xa0Var2.m12593W(5);
                                    dv4.f17431c.mo3321h(obj2, jM10053w2, ((wa0) xa0Var2.f34095e).mo11327l());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 2:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w3 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.m4764n(obj2, jM10053w3, ((wa0) xa0Var2.f34095e).mo11329n());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 3:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w4 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.m4764n(obj2, jM10053w4, ((wa0) xa0Var2.f34095e).mo11338w());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 4:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w5 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.m4763m(jM10053w5, ((wa0) xa0Var2.f34095e).mo11328m(), obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 5:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w6 = m10053w(iM10062I);
                                    xa0Var2.m12593W(1);
                                    dv4.m4764n(obj2, jM10053w6, ((wa0) xa0Var2.f34095e).mo11326k());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 6:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w7 = m10053w(iM10062I);
                                    xa0Var2.m12593W(5);
                                    dv4.m4763m(jM10053w7, ((wa0) xa0Var2.f34095e).mo11325j(), obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 7:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w8 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.f17431c.mo3319e(jM10053w8, obj2, ((wa0) xa0Var2.f34095e).mo11319f());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    qs2Var.m10058C(iM10062I, xa0Var2, obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 9:
                                    qs2Var = qs2Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    AbstractC1277w1 abstractC1277w1 = (AbstractC1277w1) qs2Var.m10073u(iM10075z, obj2);
                                    gw3 gw3VarM10066m = qs2Var.m10066m(iM10075z);
                                    xa0Var2.m12593W(2);
                                    xa0Var2.m12610j(abstractC1277w1, gw3VarM10066m, rc1Var2);
                                    unsafe.putObject(obj2, qs2Var.m10062I(iM10075z) & 1048575, abstractC1277w1);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 10:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    dv4.m4765o(m10053w(iM10062I), obj2, xa0Var2.m12616m());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 11:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w9 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.m4763m(jM10053w9, ((wa0) xa0Var2.f34095e).mo11337v(), obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 12:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12593W(0);
                                    int iMo11324i = ((wa0) xa0Var2.f34095e).mo11324i();
                                    qs2Var.m10065l(iM10075z);
                                    dv4.m4763m(m10053w(iM10062I), iMo11324i, obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 13:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w10 = m10053w(iM10062I);
                                    xa0Var2.m12593W(5);
                                    dv4.m4763m(jM10053w10, ((wa0) xa0Var2.f34095e).mo11330o(), obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w11 = m10053w(iM10062I);
                                    xa0Var2.m12593W(1);
                                    dv4.m4764n(obj2, jM10053w11, ((wa0) xa0Var2.f34095e).mo11331p());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 15:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w12 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.m4763m(jM10053w12, ((wa0) xa0Var2.f34095e).mo11332q(), obj2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 16:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    long jM10053w13 = m10053w(iM10062I);
                                    xa0Var2.m12593W(0);
                                    dv4.m4764n(obj2, jM10053w13, ((wa0) xa0Var2.f34095e).mo11333r());
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 17:
                                    qs2Var = qs2Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    AbstractC1277w1 abstractC1277w2 = (AbstractC1277w1) qs2Var.m10073u(iM10075z, obj2);
                                    gw3 gw3VarM10066m2 = qs2Var.m10066m(iM10075z);
                                    xa0Var2.m12593W(3);
                                    xa0Var2.m12606h(abstractC1277w2, gw3VarM10066m2, rc1Var2);
                                    unsafe.putObject(obj2, qs2Var.m10062I(iM10075z) & 1048575, abstractC1277w2);
                                    qs2Var.m10060F(iM10075z, obj2);
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 18:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12626r(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 19:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12566A(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12574E(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 21:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12591U(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12570C(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12638y(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12635w(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 25:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var2.m12614l(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 26:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    try {
                                        qs2Var.m10059D(iM10062I, xa0Var2, obj2);
                                    } catch (g72 unused3) {
                                        ia5Var.getClass();
                                        if (ou4VarM6714g == null) {
                                            ou4VarM6714g = ia5Var.m6714g(obj2);
                                        }
                                        if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g == null) {
                                                return;
                                            }
                                            ((vr1) obj2).unknownFields = ou4VarM6714g;
                                        }
                                    }
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 27:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        qs2Var.m10057B(obj2, iM10062I, xa0Var3, qs2Var.m10066m(iM10075z), rc1Var);
                                        xa0Var2 = xa0Var3;
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                    } catch (g72 unused4) {
                                        xa0Var2 = xa0Var3;
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                        ia5Var.getClass();
                                        if (ou4VarM6714g == null) {
                                            ou4VarM6714g = ia5Var.m6714g(obj2);
                                        }
                                        if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g == null) {
                                                return;
                                            }
                                            ((vr1) obj2).unknownFields = ou4VarM6714g;
                                        }
                                    }
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 28:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12622p(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 29:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12589S(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 30:
                                    iArr = iArr2;
                                    i2 = i4;
                                    j62 j62VarM9731j = q50Var.m9731j(m10053w(iM10062I), obj2);
                                    xa0Var3.m12630t(j62VarM9731j);
                                    qs2Var.m10065l(iM10075z);
                                    kw3.m7652j(obj2, iM12598d, j62VarM9731j, ou4VarM6714g, ia5Var);
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 31:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12577G(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 32:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12579I(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12581K(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12583M(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12626r(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12566A(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12574E(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12591U(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12570C(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12638y(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12635w(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12614l(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12589S(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i2 = i4;
                                    j62 j62VarM9731j2 = q50Var.m9731j(m10053w(iM10062I), obj2);
                                    xa0Var3.m12630t(j62VarM9731j2);
                                    qs2Var.m10065l(iM10075z);
                                    kw3.m7652j(obj2, iM12598d, j62VarM9731j2, ou4VarM6714g, ia5Var);
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12577G(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12579I(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 47:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12581K(q50Var.m9731j(m10053w(iM10062I), obj2));
                                    rc1Var2 = rc1Var;
                                    qs2Var = qs2Var;
                                    xa0Var2 = xa0Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 48:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        xa0Var3.m12583M(q50Var.m9731j(m10053w(iM10062I), obj2));
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                        xa0Var2 = xa0Var3;
                                    } catch (g72 unused5) {
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                        xa0Var2 = xa0Var3;
                                        ia5Var.getClass();
                                        if (ou4VarM6714g == null) {
                                            ou4VarM6714g = ia5Var.m6714g(obj2);
                                        }
                                        if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g == null) {
                                                return;
                                            }
                                            ((vr1) obj2).unknownFields = ou4VarM6714g;
                                        }
                                    }
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i2 = i4;
                                    obj2 = obj;
                                    try {
                                        qs2Var.m10056A(obj2, m10053w(iM10062I), xa0Var, qs2Var.m10066m(iM10075z), rc1Var);
                                        xa0Var3 = xa0Var;
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                        xa0Var2 = xa0Var3;
                                    } catch (g72 unused6) {
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                        xa0Var2 = xa0Var;
                                        ia5Var.getClass();
                                        if (ou4VarM6714g == null) {
                                            ou4VarM6714g = ia5Var.m6714g(obj2);
                                        }
                                        if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g == null) {
                                                return;
                                            }
                                            ((vr1) obj2).unknownFields = ou4VarM6714g;
                                        }
                                    }
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 50:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        qs2Var.m10070r(obj2, iM10075z, qs2Var.f28752b[(iM10075z / 3) * 2], rc1Var3, xa0Var3);
                                        obj2 = obj;
                                        xa0Var2 = xa0Var;
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                    } catch (g72 unused7) {
                                        obj2 = obj;
                                        xa0Var2 = xa0Var;
                                        rc1Var2 = rc1Var;
                                        qs2Var = qs2Var;
                                        ia5Var.getClass();
                                        if (ou4VarM6714g == null) {
                                            ou4VarM6714g = ia5Var.m6714g(obj2);
                                        }
                                        if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g == null) {
                                                return;
                                            }
                                            ((vr1) obj2).unknownFields = ou4VarM6714g;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        qs2Var = qs2Var;
                                        i = i2;
                                        while (i5 < i) {
                                            qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                            i5++;
                                        }
                                        if (ou4VarM6714g != null) {
                                            ia5Var.getClass();
                                            ((vr1) obj2).unknownFields = ou4VarM6714g;
                                        }
                                        throw th;
                                    }
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w14 = m10053w(iM10062I);
                                    xa0Var3.m12593W(1);
                                    dv4.m4765o(jM10053w14, obj2, Double.valueOf(((wa0) xa0Var3.f34095e).mo11323h()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w15 = m10053w(iM10062I);
                                    xa0Var3.m12593W(5);
                                    dv4.m4765o(jM10053w15, obj2, Float.valueOf(((wa0) xa0Var3.f34095e).mo11327l()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 53:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w16 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w16, obj2, Long.valueOf(((wa0) xa0Var3.f34095e).mo11329n()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w17 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w17, obj2, Long.valueOf(((wa0) xa0Var3.f34095e).mo11338w()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w18 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w18, obj2, Integer.valueOf(((wa0) xa0Var3.f34095e).mo11328m()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w19 = m10053w(iM10062I);
                                    xa0Var3.m12593W(1);
                                    dv4.m4765o(jM10053w19, obj2, Long.valueOf(((wa0) xa0Var3.f34095e).mo11326k()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w20 = m10053w(iM10062I);
                                    xa0Var3.m12593W(5);
                                    dv4.m4765o(jM10053w20, obj2, Integer.valueOf(((wa0) xa0Var3.f34095e).mo11325j()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w21 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w21, obj2, Boolean.valueOf(((wa0) xa0Var3.f34095e).mo11319f()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qs2Var.m10058C(iM10062I, xa0Var3, obj2);
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i2 = i4;
                                    AbstractC1277w1 abstractC1277w3 = (AbstractC1277w1) qs2Var.m10074v(iM12598d, iM10075z, obj2);
                                    gw3 gw3VarM10066m3 = qs2Var.m10066m(iM10075z);
                                    xa0Var3.m12593W(2);
                                    xa0Var3.m12610j(abstractC1277w3, gw3VarM10066m3, rc1Var3);
                                    unsafe.putObject(obj2, qs2Var.m10062I(iM10075z) & 1048575, abstractC1277w3);
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i2 = i4;
                                    dv4.m4765o(m10053w(iM10062I), obj2, xa0Var3.m12616m());
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w22 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w22, obj2, Integer.valueOf(((wa0) xa0Var3.f34095e).mo11337v()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xa0Var3.m12593W(0);
                                    int iMo11324i2 = ((wa0) xa0Var3.f34095e).mo11324i();
                                    qs2Var.m10065l(iM10075z);
                                    dv4.m4765o(m10053w(iM10062I), obj2, Integer.valueOf(iMo11324i2));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 64:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w23 = m10053w(iM10062I);
                                    xa0Var3.m12593W(5);
                                    dv4.m4765o(jM10053w23, obj2, Integer.valueOf(((wa0) xa0Var3.f34095e).mo11330o()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w24 = m10053w(iM10062I);
                                    xa0Var3.m12593W(1);
                                    dv4.m4765o(jM10053w24, obj2, Long.valueOf(((wa0) xa0Var3.f34095e).mo11331p()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 66:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w25 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w25, obj2, Integer.valueOf(((wa0) xa0Var3.f34095e).mo11332q()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM10053w26 = m10053w(iM10062I);
                                    xa0Var3.m12593W(0);
                                    dv4.m4765o(jM10053w26, obj2, Long.valueOf(((wa0) xa0Var3.f34095e).mo11333r()));
                                    qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                    xa0Var2 = xa0Var3;
                                    rc1Var2 = rc1Var3;
                                    xa0Var3 = xa0Var2;
                                    rc1Var3 = rc1Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qs2Var = qs2Var;
                                    break;
                                case 68:
                                    try {
                                        AbstractC1277w1 abstractC1277w4 = (AbstractC1277w1) qs2Var.m10074v(iM12598d, iM10075z, obj2);
                                        gw3 gw3VarM10066m4 = qs2Var.m10066m(iM10075z);
                                        xa0Var3.m12593W(3);
                                        xa0Var3.m12606h(abstractC1277w4, gw3VarM10066m4, rc1Var3);
                                        iArr = iArr2;
                                        i2 = i4;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, qs2Var.m10062I(iM10075z) & 1048575, abstractC1277w4);
                                                qs2Var.m10061G(iM12598d, iM10075z, obj2);
                                                xa0Var2 = xa0Var3;
                                                rc1Var2 = rc1Var3;
                                            } catch (g72 unused8) {
                                                xa0Var2 = xa0Var3;
                                                rc1Var2 = rc1Var3;
                                                ia5Var.getClass();
                                                if (ou4VarM6714g == null) {
                                                    ou4VarM6714g = ia5Var.m6714g(obj2);
                                                }
                                                if (!ia5Var.m6716i(0, xa0Var2, ou4VarM6714g)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                        i5++;
                                                    }
                                                    if (ou4VarM6714g == null) {
                                                        return;
                                                    }
                                                    ((vr1) obj2).unknownFields = ou4VarM6714g;
                                                }
                                            }
                                            xa0Var3 = xa0Var2;
                                            rc1Var3 = rc1Var2;
                                            iArr2 = iArr;
                                            i4 = i2;
                                            qs2Var = qs2Var;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            qs2Var = qs2Var;
                                            i = i2;
                                            while (i5 < i) {
                                                qs2Var.m10064k(iArr[i5], obj2, ou4VarM6714g);
                                                i5++;
                                            }
                                            if (ou4VarM6714g != null) {
                                                ia5Var.getClass();
                                                ((vr1) obj2).unknownFields = ou4VarM6714g;
                                            }
                                            throw th;
                                        }
                                    } catch (g72 unused9) {
                                        iArr = iArr2;
                                        i2 = i4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i2 = i4;
                                    }
                                    break;
                                default:
                                    if (ou4VarM6714g == null) {
                                        ou4VarM6714g = ia5Var.m6714g(obj2);
                                    }
                                    if (ia5Var.m6716i(0, xa0Var3, ou4VarM6714g)) {
                                        iArr = iArr2;
                                        i2 = i4;
                                        xa0Var2 = xa0Var3;
                                        rc1Var2 = rc1Var3;
                                        xa0Var3 = xa0Var2;
                                        rc1Var3 = rc1Var2;
                                        iArr2 = iArr;
                                        i4 = i2;
                                        qs2Var = qs2Var;
                                    } else {
                                        while (i5 < i4) {
                                            qs2Var.m10064k(iArr2[i5], obj2, ou4VarM6714g);
                                            i5++;
                                        }
                                        if (ou4VarM6714g == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (g72 unused10) {
                            iArr = iArr2;
                            i2 = i4;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        qs2Var = qs2Var;
                        iArr = iArr2;
                        i2 = i4;
                    }
                } else if (iM12598d == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        qs2Var.m10064k(iArr2[i5], obj2, ou4VarM6714g);
                        i5++;
                    }
                    if (ou4VarM6714g == null) {
                        return;
                    } else {
                        ia5Var.getClass();
                    }
                } else {
                    ia5Var.getClass();
                    if (ou4VarM6714g == null) {
                        ou4VarM6714g = ia5Var.m6714g(obj2);
                    }
                    if (!ia5Var.m6716i(0, xa0Var3, ou4VarM6714g)) {
                        while (i5 < i4) {
                            qs2Var.m10064k(iArr2[i5], obj2, ou4VarM6714g);
                            i5++;
                        }
                        if (ou4VarM6714g == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                qs2Var = qs2Var;
                iArr = iArr2;
                i = i4;
            }
        }
        ((vr1) obj2).unknownFields = ou4VarM6714g;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    @Override // p000.gw3
    /* JADX INFO: renamed from: g */
    public final int mo6185g(vr1 vr1Var) {
        int i;
        int iM10752h;
        int iM10752h2;
        int iM10752h3;
        int iM10754j;
        int iM10752h4;
        int iM10754j2;
        int iM10752h5;
        int iM10752h6;
        int iM10752h7;
        int iMo11979a;
        int iM10753i;
        int iM10751g;
        int iM10752h8;
        int iMo11979a2;
        int iM7645c;
        int iM10752h9;
        int size;
        int iM7651i;
        int iM10752h10;
        int iMo7750M;
        int iM10753i2;
        int iMo7750M2;
        int iM10753i3;
        int iM10752h11;
        int size2;
        int iM10752h12;
        int iM10753i4;
        int iMo11979a3;
        int iM10752h13;
        int iM10752h14;
        int iM10754j3;
        int iM10752h15;
        int iM10754j4;
        int i2;
        qs2 qs2Var = this;
        vr1 vr1Var2 = vr1Var;
        int[] iArr = qs2Var.f28751a;
        int i3 = 1048575;
        int i4 = 0;
        int iM10753i5 = 0;
        for (int i5 = 0; i5 < iArr.length; i5 += 3) {
            int iM10062I = qs2Var.m10062I(i5);
            int iM10051H = m10051H(iM10062I);
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            Unsafe unsafe = f28750l;
            if (iM10051H <= 17) {
                if (i8 != i3) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(vr1Var2, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM10062I & 1048575;
            if (iM10051H >= se1.f30208b.f30212a) {
                byte b = se1.f30209c.f30212a;
            }
            switch (iM10051H) {
                case 0:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h = C1145sh.m10752h(i6);
                        iM7645c = iM10752h + 8;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 1:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h2 = C1145sh.m10752h(i6);
                        iM10752h6 = iM10752h2 + 4;
                        iM10753i5 += iM10752h6;
                    }
                    qs2Var = this;
                    vr1Var2 = vr1Var;
                    break;
                case 2:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        long j2 = unsafe.getLong(vr1Var2, j);
                        iM10752h3 = C1145sh.m10752h(i6);
                        iM10754j = C1145sh.m10754j(j2);
                        iM10753i5 += iM10754j + iM10752h3;
                    }
                    qs2Var = this;
                    break;
                case 3:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        long j3 = unsafe.getLong(vr1Var2, j);
                        iM10752h3 = C1145sh.m10752h(i6);
                        iM10754j = C1145sh.m10754j(j3);
                        iM10753i5 += iM10754j + iM10752h3;
                    }
                    qs2Var = this;
                    break;
                case 4:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        int i9 = unsafe.getInt(vr1Var2, j);
                        iM10752h4 = C1145sh.m10752h(i6);
                        iM10754j2 = C1145sh.m10754j(i9);
                        iM10751g = iM10754j2 + iM10752h4;
                        iM10753i5 += iM10751g;
                    }
                    qs2Var = this;
                    break;
                case 5:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h5 = C1145sh.m10752h(i6);
                        iM10752h6 = iM10752h5 + 8;
                        iM10753i5 += iM10752h6;
                    }
                    qs2Var = this;
                    vr1Var2 = vr1Var;
                    break;
                case 6:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h2 = C1145sh.m10752h(i6);
                        iM10752h6 = iM10752h2 + 4;
                        iM10753i5 += iM10752h6;
                    }
                    qs2Var = this;
                    vr1Var2 = vr1Var;
                    break;
                case 7:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h6 = C1145sh.m10752h(i6) + 1;
                        iM10753i5 += iM10752h6;
                    }
                    qs2Var = this;
                    vr1Var2 = vr1Var;
                    break;
                case 8:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        Object object = unsafe.getObject(vr1Var2, j);
                        if (object instanceof n50) {
                            iM10753i5 = C1145sh.m10751g(i6, (n50) object) + iM10753i5;
                        } else {
                            int iM10752h16 = C1145sh.m10752h(i6);
                            int iMo7750M3 = wv4.f33788a.mo7750M((String) object);
                            iM10753i5 = C1145sh.m10753i(iMo7750M3) + iMo7750M3 + iM10752h16 + iM10753i5;
                        }
                    }
                    qs2Var = this;
                    break;
                case 9:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        Object object2 = unsafe.getObject(vr1Var2, j);
                        gw3 gw3VarM10066m = qs2Var.m10066m(i5);
                        Class cls = kw3.f23562a;
                        iM10752h7 = C1145sh.m10752h(i6);
                        iMo11979a = ((AbstractC1277w1) object2).mo11979a(gw3VarM10066m);
                        iM10753i = C1145sh.m10753i(iMo11979a);
                        i2 = iM10753i + iMo11979a + iM10752h7;
                        iM10753i5 += i2;
                    }
                    break;
                case 10:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10751g = C1145sh.m10751g(i6, (n50) unsafe.getObject(vr1Var2, j));
                        iM10753i5 += iM10751g;
                    }
                    qs2Var = this;
                    break;
                case 11:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        int i10 = unsafe.getInt(vr1Var2, j);
                        iM10752h4 = C1145sh.m10752h(i6);
                        iM10754j2 = C1145sh.m10753i(i10);
                        iM10751g = iM10754j2 + iM10752h4;
                        iM10753i5 += iM10751g;
                    }
                    qs2Var = this;
                    break;
                case 12:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        int i11 = unsafe.getInt(vr1Var2, j);
                        iM10752h4 = C1145sh.m10752h(i6);
                        iM10754j2 = C1145sh.m10754j(i11);
                        iM10751g = iM10754j2 + iM10752h4;
                        iM10753i5 += iM10751g;
                    }
                    qs2Var = this;
                    break;
                case 13:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h2 = C1145sh.m10752h(i6);
                        iM10752h6 = iM10752h2 + 4;
                        iM10753i5 += iM10752h6;
                    }
                    qs2Var = this;
                    vr1Var2 = vr1Var;
                    break;
                case 14:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        iM10752h5 = C1145sh.m10752h(i6);
                        iM10752h6 = iM10752h5 + 8;
                        iM10753i5 += iM10752h6;
                    }
                    qs2Var = this;
                    vr1Var2 = vr1Var;
                    break;
                case 15:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        int i12 = unsafe.getInt(vr1Var2, j);
                        iM10752h4 = C1145sh.m10752h(i6);
                        iM10754j2 = C1145sh.m10753i((i12 >> 31) ^ (i12 << 1));
                        iM10751g = iM10754j2 + iM10752h4;
                        iM10753i5 += iM10751g;
                    }
                    qs2Var = this;
                    break;
                case 16:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        long j4 = unsafe.getLong(vr1Var2, j);
                        iM10752h3 = C1145sh.m10752h(i6);
                        iM10754j = C1145sh.m10754j((j4 << 1) ^ (j4 >> 63));
                        iM10753i5 += iM10754j + iM10752h3;
                    }
                    qs2Var = this;
                    break;
                case 17:
                    if (qs2Var.m10068o(vr1Var2, i5, i3, i4, i)) {
                        AbstractC1277w1 abstractC1277w1 = (AbstractC1277w1) unsafe.getObject(vr1Var2, j);
                        gw3 gw3VarM10066m2 = qs2Var.m10066m(i5);
                        Class cls2 = kw3.f23562a;
                        iM10752h8 = C1145sh.m10752h(i6) * 2;
                        iMo11979a2 = abstractC1277w1.mo11979a(gw3VarM10066m2);
                        iM7645c = iMo11979a2 + iM10752h8;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 18:
                    iM7645c = kw3.m7645c((List) unsafe.getObject(vr1Var2, j), i6);
                    iM10753i5 += iM7645c;
                    break;
                case 19:
                    iM7645c = kw3.m7644b((List) unsafe.getObject(vr1Var2, j), i6);
                    iM10753i5 += iM7645c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(vr1Var2, j);
                    Class cls3 = kw3.f23562a;
                    if (list.size() == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM10752h9 = (C1145sh.m10752h(i6) * list.size()) + kw3.m7647e(list);
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls4 = kw3.f23562a;
                    size = list2.size();
                    if (size == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM7651i = kw3.m7651i(list2);
                        iM10752h10 = C1145sh.m10752h(i6);
                        iM10752h9 = (iM10752h10 * size) + iM7651i;
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls5 = kw3.f23562a;
                    size = list3.size();
                    if (size == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM7651i = kw3.m7646d(list3);
                        iM10752h10 = C1145sh.m10752h(i6);
                        iM10752h9 = (iM10752h10 * size) + iM7651i;
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 23:
                    iM7645c = kw3.m7645c((List) unsafe.getObject(vr1Var2, j), i6);
                    iM10753i5 += iM7645c;
                    break;
                case 24:
                    iM7645c = kw3.m7644b((List) unsafe.getObject(vr1Var2, j), i6);
                    iM10753i5 += iM7645c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls6 = kw3.f23562a;
                    int size3 = list4.size();
                    iM10753i5 += size3 == 0 ? 0 : (C1145sh.m10752h(i6) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls7 = kw3.f23562a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM10752h9 = C1145sh.m10752h(i6) * size4;
                        if (list5 instanceof zi2) {
                            zi2 zi2Var = (zi2) list5;
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object objM13596k = zi2Var.m13596k();
                                if (objM13596k instanceof n50) {
                                    iMo7750M2 = ((n50) objM13596k).size();
                                    iM10753i3 = C1145sh.m10753i(iMo7750M2);
                                } else {
                                    iMo7750M2 = wv4.f33788a.mo7750M((String) objM13596k);
                                    iM10753i3 = C1145sh.m10753i(iMo7750M2);
                                }
                                iM10752h9 = iM10753i3 + iMo7750M2 + iM10752h9;
                            }
                        } else {
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object obj = list5.get(i14);
                                if (obj instanceof n50) {
                                    iMo7750M = ((n50) obj).size();
                                    iM10753i2 = C1145sh.m10753i(iMo7750M);
                                } else {
                                    iMo7750M = wv4.f33788a.mo7750M((String) obj);
                                    iM10753i2 = C1145sh.m10753i(iMo7750M);
                                }
                                iM10752h9 = iM10753i2 + iMo7750M + iM10752h9;
                            }
                        }
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(vr1Var2, j);
                    gw3 gw3VarM10066m3 = qs2Var.m10066m(i5);
                    Class cls8 = kw3.f23562a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM10752h11 = 0;
                    } else {
                        iM10752h11 = C1145sh.m10752h(i6) * size5;
                        for (int i15 = 0; i15 < size5; i15++) {
                            int iMo11979a4 = ((AbstractC1277w1) list6.get(i15)).mo11979a(gw3VarM10066m3);
                            iM10752h11 += C1145sh.m10753i(iMo11979a4) + iMo11979a4;
                        }
                    }
                    iM10753i5 += iM10752h11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls9 = kw3.f23562a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM10752h9 = C1145sh.m10752h(i6) * size6;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int size7 = ((n50) list7.get(i16)).size();
                            iM10752h9 += C1145sh.m10753i(size7) + size7;
                        }
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls10 = kw3.f23562a;
                    size = list8.size();
                    if (size == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM7651i = kw3.m7650h(list8);
                        iM10752h10 = C1145sh.m10752h(i6);
                        iM10752h9 = (iM10752h10 * size) + iM7651i;
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls11 = kw3.f23562a;
                    size = list9.size();
                    if (size == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM7651i = kw3.m7643a(list9);
                        iM10752h10 = C1145sh.m10752h(i6);
                        iM10752h9 = (iM10752h10 * size) + iM7651i;
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 31:
                    iM7645c = kw3.m7644b((List) unsafe.getObject(vr1Var2, j), i6);
                    iM10753i5 += iM7645c;
                    break;
                case 32:
                    iM7645c = kw3.m7645c((List) unsafe.getObject(vr1Var2, j), i6);
                    iM10753i5 += iM7645c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls12 = kw3.f23562a;
                    size = list10.size();
                    if (size == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM7651i = kw3.m7648f(list10);
                        iM10752h10 = C1145sh.m10752h(i6);
                        iM10752h9 = (iM10752h10 * size) + iM7651i;
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls13 = kw3.f23562a;
                    size = list11.size();
                    if (size == 0) {
                        iM10752h9 = 0;
                    } else {
                        iM7651i = kw3.m7649g(list11);
                        iM10752h10 = C1145sh.m10752h(i6);
                        iM10752h9 = (iM10752h10 * size) + iM7651i;
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls14 = kw3.f23562a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls15 = kw3.f23562a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 37:
                    size2 = kw3.m7647e((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 38:
                    size2 = kw3.m7651i((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 39:
                    size2 = kw3.m7646d((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls16 = kw3.f23562a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls17 = kw3.f23562a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls18 = kw3.f23562a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 43:
                    size2 = kw3.m7650h((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 44:
                    size2 = kw3.m7643a((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls19 = kw3.f23562a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(vr1Var2, j);
                    Class cls20 = kw3.f23562a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 47:
                    size2 = kw3.m7648f((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 48:
                    size2 = kw3.m7649g((List) unsafe.getObject(vr1Var2, j));
                    if (size2 > 0) {
                        iM10752h12 = C1145sh.m10752h(i6);
                        iM10753i4 = C1145sh.m10753i(size2);
                        iM10753i5 += iM10753i4 + iM10752h12 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(vr1Var2, j);
                    gw3 gw3VarM10066m4 = qs2Var.m10066m(i5);
                    Class cls21 = kw3.f23562a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        iMo11979a3 = 0;
                    } else {
                        iMo11979a3 = 0;
                        for (int i17 = 0; i17 < size8; i17++) {
                            iMo11979a3 += ((AbstractC1277w1) list19.get(i17)).mo11979a(gw3VarM10066m4) + (C1145sh.m10752h(i6) * 2);
                        }
                    }
                    iM10753i5 += iMo11979a3;
                    break;
                case 50:
                    yp2 yp2Var = (yp2) unsafe.getObject(vr1Var2, j);
                    wp2 wp2Var = (wp2) qs2Var.f28752b[(i5 / 3) * 2];
                    if (yp2Var.isEmpty()) {
                        iM10752h9 = 0;
                    } else {
                        iM10752h9 = 0;
                        for (Map.Entry entry : yp2Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            wp2Var.getClass();
                            int iM10752h17 = C1145sh.m10752h(i6);
                            int iM12352a = wp2.m12352a(wp2Var.f33578a, key, value);
                            iM10752h9 += C1145sh.m10753i(iM12352a) + iM12352a + iM10752h17;
                        }
                    }
                    iM10753i5 += iM10752h9;
                    break;
                case 51:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM10752h = C1145sh.m10752h(i6);
                        iM7645c = iM10752h + 8;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 52:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM10752h13 = C1145sh.m10752h(i6);
                        iM7645c = iM10752h13 + 4;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 53:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        long jM10055y = m10055y(j, vr1Var2);
                        iM10752h14 = C1145sh.m10752h(i6);
                        iM10754j3 = C1145sh.m10754j(jM10055y);
                        i2 = iM10754j3 + iM10752h14;
                        iM10753i5 += i2;
                    }
                    break;
                case 54:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        long jM10055y2 = m10055y(j, vr1Var2);
                        iM10752h14 = C1145sh.m10752h(i6);
                        iM10754j3 = C1145sh.m10754j(jM10055y2);
                        i2 = iM10754j3 + iM10752h14;
                        iM10753i5 += i2;
                    }
                    break;
                case 55:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        int iM10054x = m10054x(j, vr1Var2);
                        iM10752h15 = C1145sh.m10752h(i6);
                        iM10754j4 = C1145sh.m10754j(iM10054x);
                        iM7645c = iM10754j4 + iM10752h15;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 56:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM10752h = C1145sh.m10752h(i6);
                        iM7645c = iM10752h + 8;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 57:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM10752h13 = C1145sh.m10752h(i6);
                        iM7645c = iM10752h13 + 4;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 58:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM7645c = C1145sh.m10752h(i6) + 1;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 59:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        Object object3 = unsafe.getObject(vr1Var2, j);
                        if (object3 instanceof n50) {
                            iM10753i5 = C1145sh.m10751g(i6, (n50) object3) + iM10753i5;
                        } else {
                            int iM10752h18 = C1145sh.m10752h(i6);
                            int iMo7750M4 = wv4.f33788a.mo7750M((String) object3);
                            iM10753i5 = C1145sh.m10753i(iMo7750M4) + iMo7750M4 + iM10752h18 + iM10753i5;
                        }
                    }
                    break;
                case 60:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        Object object4 = unsafe.getObject(vr1Var2, j);
                        gw3 gw3VarM10066m5 = qs2Var.m10066m(i5);
                        Class cls22 = kw3.f23562a;
                        iM10752h7 = C1145sh.m10752h(i6);
                        iMo11979a = ((AbstractC1277w1) object4).mo11979a(gw3VarM10066m5);
                        iM10753i = C1145sh.m10753i(iMo11979a);
                        i2 = iM10753i + iMo11979a + iM10752h7;
                        iM10753i5 += i2;
                    }
                    break;
                case 61:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM7645c = C1145sh.m10751g(i6, (n50) unsafe.getObject(vr1Var2, j));
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 62:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        int iM10054x2 = m10054x(j, vr1Var2);
                        iM10752h15 = C1145sh.m10752h(i6);
                        iM10754j4 = C1145sh.m10753i(iM10054x2);
                        iM7645c = iM10754j4 + iM10752h15;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 63:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        int iM10054x3 = m10054x(j, vr1Var2);
                        iM10752h15 = C1145sh.m10752h(i6);
                        iM10754j4 = C1145sh.m10754j(iM10054x3);
                        iM7645c = iM10754j4 + iM10752h15;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 64:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM10752h13 = C1145sh.m10752h(i6);
                        iM7645c = iM10752h13 + 4;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 65:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        iM10752h = C1145sh.m10752h(i6);
                        iM7645c = iM10752h + 8;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 66:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        int iM10054x4 = m10054x(j, vr1Var2);
                        iM10752h15 = C1145sh.m10752h(i6);
                        iM10754j4 = C1145sh.m10753i((iM10054x4 >> 31) ^ (iM10054x4 << 1));
                        iM7645c = iM10754j4 + iM10752h15;
                        iM10753i5 += iM7645c;
                    }
                    break;
                case 67:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        long jM10055y3 = m10055y(j, vr1Var2);
                        iM10752h14 = C1145sh.m10752h(i6);
                        iM10754j3 = C1145sh.m10754j((jM10055y3 << 1) ^ (jM10055y3 >> 63));
                        i2 = iM10754j3 + iM10752h14;
                        iM10753i5 += i2;
                    }
                    break;
                case 68:
                    if (qs2Var.m10069q(i6, i5, vr1Var2)) {
                        AbstractC1277w1 abstractC1277w2 = (AbstractC1277w1) unsafe.getObject(vr1Var2, j);
                        gw3 gw3VarM10066m6 = qs2Var.m10066m(i5);
                        Class cls23 = kw3.f23562a;
                        iM10752h8 = C1145sh.m10752h(i6) * 2;
                        iMo11979a2 = abstractC1277w2.mo11979a(gw3VarM10066m6);
                        iM7645c = iMo11979a2 + iM10752h8;
                        iM10753i5 += iM7645c;
                    }
                    break;
            }
        }
        qs2Var.f28760j.getClass();
        return vr1Var2.unknownFields.m9281b() + iM10753i5;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    @Override // p000.gw3
    /* JADX INFO: renamed from: h */
    public final boolean mo6186h(vr1 vr1Var, vr1 vr1Var2) {
        ia5 ia5Var = this.f28760j;
        int[] iArr = this.f28751a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM7654l = true;
            if (i < length) {
                int iM10062I = m10062I(i);
                int iM10051H = m10051H(iM10062I);
                if (iM10051H <= 50 || iM10051H >= 69) {
                    long j = iM10062I & 1048575;
                    switch (iM10051H) {
                        case 0:
                            if (!m10063j(vr1Var, vr1Var2, i)) {
                                zM7654l = false;
                            } else {
                                bv4 bv4Var = dv4.f17431c;
                                if (Double.doubleToLongBits(bv4Var.mo3317c(j, vr1Var)) != Double.doubleToLongBits(bv4Var.mo3317c(j, vr1Var2))) {
                                    zM7654l = false;
                                }
                            }
                            break;
                        case 1:
                            if (!m10063j(vr1Var, vr1Var2, i)) {
                                zM7654l = false;
                            } else {
                                bv4 bv4Var2 = dv4.f17431c;
                                if (Float.floatToIntBits(bv4Var2.mo3318d(j, vr1Var)) != Float.floatToIntBits(bv4Var2.mo3318d(j, vr1Var2))) {
                                    zM7654l = false;
                                }
                            }
                            break;
                        case 2:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4757g(j, vr1Var) != dv4.m4757g(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 3:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4757g(j, vr1Var) != dv4.m4757g(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 4:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4756f(j, vr1Var) != dv4.m4756f(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 5:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4757g(j, vr1Var) != dv4.m4757g(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 6:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4756f(j, vr1Var) != dv4.m4756f(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 7:
                            if (!m10063j(vr1Var, vr1Var2, i)) {
                                zM7654l = false;
                            } else {
                                bv4 bv4Var3 = dv4.f17431c;
                                if (bv4Var3.mo3316a(j, vr1Var) != bv4Var3.mo3316a(j, vr1Var2)) {
                                    zM7654l = false;
                                }
                            }
                            break;
                        case 8:
                            if (!m10063j(vr1Var, vr1Var2, i) || !kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2))) {
                                zM7654l = false;
                            }
                            break;
                        case 9:
                            if (!m10063j(vr1Var, vr1Var2, i) || !kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2))) {
                                zM7654l = false;
                            }
                            break;
                        case 10:
                            if (!m10063j(vr1Var, vr1Var2, i) || !kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2))) {
                                zM7654l = false;
                            }
                            break;
                        case 11:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4756f(j, vr1Var) != dv4.m4756f(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 12:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4756f(j, vr1Var) != dv4.m4756f(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 13:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4756f(j, vr1Var) != dv4.m4756f(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 14:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4757g(j, vr1Var) != dv4.m4757g(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 15:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4756f(j, vr1Var) != dv4.m4756f(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 16:
                            if (!m10063j(vr1Var, vr1Var2, i) || dv4.m4757g(j, vr1Var) != dv4.m4757g(j, vr1Var2)) {
                                zM7654l = false;
                            }
                            break;
                        case 17:
                            if (!m10063j(vr1Var, vr1Var2, i) || !kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2))) {
                                zM7654l = false;
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
                            zM7654l = kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2));
                            break;
                        case 50:
                            zM7654l = kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2));
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
                            long j2 = 1048575 & iArr[i + 2];
                            if (dv4.m4756f(j2, vr1Var) != dv4.m4756f(j2, vr1Var2) || !kw3.m7654l(dv4.m4758h(j, vr1Var), dv4.m4758h(j, vr1Var2))) {
                                zM7654l = false;
                            }
                            break;
                    }
                    if (!zM7654l) {
                    }
                }
                i += 3;
            } else {
                int i2 = this.f28759i;
                while (true) {
                    int[] iArr2 = this.f28757g;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (dv4.m4756f(j3, vr1Var) != dv4.m4756f(j3, vr1Var2)) {
                            return false;
                        }
                        if (!m10069q(0, i3, vr1Var)) {
                            long jM10062I = m10062I(i3) & 1048575;
                            if (!kw3.m7654l(dv4.m4758h(jM10062I, vr1Var), dv4.m4758h(jM10062I, vr1Var2))) {
                            }
                        }
                        i2++;
                    } else {
                        ia5Var.getClass();
                        ou4 ou4Var = vr1Var.unknownFields;
                        ia5Var.getClass();
                        if (ou4Var.equals(vr1Var2.unknownFields)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.gw3
    /* JADX INFO: renamed from: i */
    public final void mo6187i(Object obj, js1 js1Var) throws IOException {
        int i;
        int i2;
        boolean z;
        qs2 qs2Var = this;
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        int[] iArr = qs2Var.f28751a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iM10062I = qs2Var.m10062I(i5);
            int i7 = iArr[i5];
            int iM10051H = m10051H(iM10062I);
            Unsafe unsafe = f28750l;
            if (iM10051H <= 17) {
                int i8 = iArr[i5 + 2];
                i = 1;
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iM10062I & i3;
            switch (iM10051H) {
                case 0:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        double dMo3317c = dv4.f17431c.mo3317c(j, obj);
                        c1145sh.getClass();
                        c1145sh.m10783x(i7, Double.doubleToRawLongBits(dMo3317c));
                    }
                    break;
                case 1:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        float fMo3318d = dv4.f17431c.mo3318d(j, obj);
                        c1145sh.getClass();
                        c1145sh.m10781v(i7, Float.floatToRawIntBits(fMo3318d));
                    }
                    qs2Var = this;
                    break;
                case 2:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10762H(i7, unsafe.getLong(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 3:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10762H(i7, unsafe.getLong(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 4:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10785z(i7, unsafe.getInt(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 5:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10783x(i7, unsafe.getLong(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 6:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10781v(i7, unsafe.getInt(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 7:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10778s(i7, dv4.f17431c.mo3316a(j, obj));
                    }
                    qs2Var = this;
                    break;
                case 8:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c1145sh.m10757C(i7, (String) object);
                        } else {
                            c1145sh.m10779t(i7, (n50) object);
                        }
                    }
                    qs2Var = this;
                    break;
                case 9:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        js1Var.m7282s(i7, unsafe.getObject(obj, j), qs2Var.m10066m(i5));
                    }
                    break;
                case 10:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10779t(i7, (n50) unsafe.getObject(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 11:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10760F(i7, unsafe.getInt(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 12:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10785z(i7, unsafe.getInt(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 13:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10781v(i7, unsafe.getInt(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 14:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        c1145sh.m10783x(i7, unsafe.getLong(obj, j));
                    }
                    qs2Var = this;
                    break;
                case 15:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        c1145sh.m10760F(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    qs2Var = this;
                    break;
                case 16:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        c1145sh.m10762H(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    qs2Var = this;
                    break;
                case 17:
                    if (qs2Var.m10068o(obj, i5, i4, i6, i2)) {
                        Object object2 = unsafe.getObject(obj, j);
                        c1145sh.m10759E(i7, 3);
                        qs2Var.m10066m(i5).mo6187i((AbstractC1277w1) object2, js1Var);
                        c1145sh.m10759E(i7, 4);
                    }
                    break;
                case 18:
                    kw3.m7656n(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 19:
                    kw3.m7660r(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 20:
                    kw3.m7662t(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 21:
                    kw3.m7668z(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 22:
                    kw3.m7661s(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 23:
                    kw3.m7659q(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 24:
                    kw3.m7658p(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 25:
                    kw3.m7655m(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = kw3.f23562a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zi2) {
                            zi2 zi2Var = (zi2) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objM13596k = zi2Var.m13596k();
                                if (objM13596k instanceof String) {
                                    c1145sh.m10757C(i11, (String) objM13596k);
                                } else {
                                    c1145sh.m10779t(i11, (n50) objM13596k);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                c1145sh.m10757C(i11, (String) list.get(i13));
                            }
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    gw3 gw3VarM10066m = qs2Var.m10066m(i5);
                    Class cls2 = kw3.f23562a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            js1Var.m7282s(i14, list2.get(i15), gw3VarM10066m);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = kw3.f23562a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            c1145sh.m10779t(i16, (n50) list3.get(i17));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    kw3.m7667y(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 30:
                    z = false;
                    kw3.m7657o(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 31:
                    z = false;
                    kw3.m7663u(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 32:
                    z = false;
                    kw3.m7664v(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 33:
                    z = false;
                    kw3.m7665w(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 34:
                    z = false;
                    kw3.m7666x(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, false);
                    break;
                case 35:
                    kw3.m7656n(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 36:
                    kw3.m7660r(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 37:
                    kw3.m7662t(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 38:
                    kw3.m7668z(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 39:
                    kw3.m7661s(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 40:
                    kw3.m7659q(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 41:
                    kw3.m7658p(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 42:
                    kw3.m7655m(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 43:
                    kw3.m7667y(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 44:
                    kw3.m7657o(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 45:
                    kw3.m7663u(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 46:
                    kw3.m7664v(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 47:
                    kw3.m7665w(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, i);
                    break;
                case 48:
                    kw3.m7666x(iArr[i5], (List) unsafe.getObject(obj, j), js1Var, true);
                    break;
                case 49:
                    int i18 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    gw3 gw3VarM10066m2 = qs2Var.m10066m(i5);
                    Class cls4 = kw3.f23562a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            AbstractC1277w1 abstractC1277w1 = (AbstractC1277w1) list4.get(i19);
                            c1145sh.m10759E(i18, 3);
                            gw3VarM10066m2.mo6187i(abstractC1277w1, js1Var);
                            c1145sh.m10759E(i18, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        int i20 = 2;
                        jp0 jp0Var = ((wp2) qs2Var.f28752b[(i5 / 3) * 2]).f33578a;
                        c1145sh.getClass();
                        for (Map.Entry entry : ((yp2) object3).entrySet()) {
                            c1145sh.m10759E(i7, i20);
                            c1145sh.m10761G(wp2.m12352a(jp0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            qe1.m9866b(c1145sh, (u15) jp0Var.f22481b, i, key);
                            qe1.m9866b(c1145sh, (u15) jp0Var.f22482c, 2, value);
                            i20 = 2;
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        double dDoubleValue = ((Double) dv4.m4758h(j, obj)).doubleValue();
                        c1145sh.getClass();
                        c1145sh.m10783x(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        float fFloatValue = ((Float) dv4.m4758h(j, obj)).floatValue();
                        c1145sh.getClass();
                        c1145sh.m10781v(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10762H(i7, m10055y(j, obj));
                    }
                    break;
                case 54:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10762H(i7, m10055y(j, obj));
                    }
                    break;
                case 55:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10785z(i7, m10054x(j, obj));
                    }
                    break;
                case 56:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10783x(i7, m10055y(j, obj));
                    }
                    break;
                case 57:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10781v(i7, m10054x(j, obj));
                    }
                    break;
                case 58:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10778s(i7, ((Boolean) dv4.m4758h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            c1145sh.m10757C(i7, (String) object4);
                        } else {
                            c1145sh.m10779t(i7, (n50) object4);
                        }
                    }
                    break;
                case 60:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        js1Var.m7282s(i7, unsafe.getObject(obj, j), qs2Var.m10066m(i5));
                    }
                    break;
                case 61:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10779t(i7, (n50) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10760F(i7, m10054x(j, obj));
                    }
                    break;
                case 63:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10785z(i7, m10054x(j, obj));
                    }
                    break;
                case 64:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10781v(i7, m10054x(j, obj));
                    }
                    break;
                case 65:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        c1145sh.m10783x(i7, m10055y(j, obj));
                    }
                    break;
                case 66:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        int iM10054x = m10054x(j, obj);
                        c1145sh.m10760F(i7, (iM10054x >> 31) ^ (iM10054x << 1));
                    }
                    break;
                case 67:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        long jM10055y = m10055y(j, obj);
                        c1145sh.m10762H(i7, (jM10055y >> 63) ^ (jM10055y << i));
                    }
                    break;
                case 68:
                    if (qs2Var.m10069q(i7, i5, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        c1145sh.m10759E(i7, 3);
                        qs2Var.m10066m(i5).mo6187i((AbstractC1277w1) object5, js1Var);
                        c1145sh.m10759E(i7, 4);
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        qs2Var.f28760j.getClass();
        ((vr1) obj).unknownFields.m9283d(js1Var);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10063j(vr1 vr1Var, vr1 vr1Var2, int i) {
        return m10067n(i, vr1Var) == m10067n(i, vr1Var2);
    }

    /* JADX INFO: renamed from: k */
    public final void m10064k(int i, Object obj, Object obj2) {
        int i2 = this.f28751a[i];
        if (dv4.m4758h(m10062I(i) & 1048575, obj) == null) {
            return;
        }
        m10065l(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m10065l(int i) {
        if (this.f28752b[((i / 3) * 2) + 1] == null) {
            return;
        }
        xy4.m12778e();
    }

    /* JADX INFO: renamed from: m */
    public final gw3 m10066m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f28752b;
        gw3 gw3Var = (gw3) objArr[i2];
        if (gw3Var != null) {
            return gw3Var;
        }
        gw3 gw3VarM10338a = rh3.f29290c.m10338a((Class) objArr[i2 + 1]);
        objArr[i2] = gw3VarM10338a;
        return gw3VarM10338a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    /* JADX INFO: renamed from: n */
    public final boolean m10067n(int i, Object obj) {
        int i2 = this.f28751a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & dv4.m4756f(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM10062I = m10062I(i);
        long j2 = iM10062I & 1048575;
        switch (m10051H(iM10062I)) {
            case 0:
                if (Double.doubleToRawLongBits(dv4.f17431c.mo3317c(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(dv4.f17431c.mo3318d(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (dv4.m4757g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (dv4.m4757g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (dv4.m4756f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (dv4.m4757g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (dv4.m4756f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return dv4.f17431c.mo3316a(j2, obj);
            case 8:
                Object objM4758h = dv4.m4758h(j2, obj);
                if (objM4758h instanceof String) {
                    return !((String) objM4758h).isEmpty();
                }
                if (objM4758h instanceof n50) {
                    return !n50.f25466b.equals(objM4758h);
                }
                ds3.m4665g();
                return false;
            case 9:
                if (dv4.m4758h(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !n50.f25466b.equals(dv4.m4758h(j2, obj));
            case 11:
                if (dv4.m4756f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (dv4.m4756f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (dv4.m4756f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (dv4.m4757g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (dv4.m4756f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (dv4.m4757g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (dv4.m4758h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                ds3.m4665g();
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10068o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m10067n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10069q(int i, int i2, Object obj) {
        return dv4.m4756f((long) (this.f28751a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: r */
    public final void m10070r(Object obj, int i, Object obj2, rc1 rc1Var, xa0 xa0Var) {
        long jM10062I = m10062I(i) & 1048575;
        Object objM4758h = dv4.m4758h(jM10062I, obj);
        if (objM4758h == null) {
            objM4758h = yp2.f35445b.m13210b();
            dv4.m4765o(jM10062I, obj, objM4758h);
        } else if (!((yp2) objM4758h).f35446a) {
            yp2 yp2VarM13210b = yp2.f35445b.m13210b();
            yp2 yp2Var = (yp2) objM4758h;
            if (!yp2Var.isEmpty()) {
                yp2 yp2VarM13210b2 = !yp2VarM13210b.f35446a ? yp2VarM13210b.m13210b() : yp2VarM13210b;
                yp2VarM13210b2.m13209a();
                if (!yp2Var.isEmpty()) {
                    yp2VarM13210b2.putAll(yp2Var);
                }
            }
            dv4.m4765o(jM10062I, obj, yp2VarM13210b);
            objM4758h = yp2VarM13210b;
        }
        yp2 yp2Var2 = (yp2) objM4758h;
        jp0 jp0Var = ((wp2) obj2).f33578a;
        xa0Var.m12593W(2);
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        int iMo11317e = wa0Var.mo11317e(wa0Var.mo11337v());
        jp0Var.getClass();
        ge3 ge3Var = (ge3) jp0Var.f22483d;
        Object objM12632u = "";
        Object objM12632u2 = ge3Var;
        while (true) {
            try {
                int iM12598d = xa0Var.m12598d();
                if (iM12598d == Integer.MAX_VALUE || wa0Var.mo11313c()) {
                    break;
                }
                if (iM12598d == 1) {
                    objM12632u = xa0Var.m12632u((u15) jp0Var.f22481b, null, null);
                } else if (iM12598d != 2) {
                    try {
                        if (!xa0Var.m12594X()) {
                            throw new i72("Unable to parse map entry.");
                        }
                    } catch (g72 e) {
                        if (!xa0Var.m12594X()) {
                            throw new i72("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM12632u2 = xa0Var.m12632u((u15) jp0Var.f22482c, ge3Var.getClass(), rc1Var);
                }
            } catch (Throwable th) {
                wa0Var.mo11315d(iMo11317e);
                throw th;
            }
        }
        yp2Var2.put(objM12632u, objM12632u2);
        wa0Var.mo11315d(iMo11317e);
    }

    /* JADX INFO: renamed from: s */
    public final void m10071s(int i, Object obj, Object obj2) {
        if (m10067n(i, obj2)) {
            long jM10062I = m10062I(i) & 1048575;
            Unsafe unsafe = f28750l;
            Object object = unsafe.getObject(obj2, jM10062I);
            if (object == null) {
                qm5.m9914e(this.f28751a[i], obj2);
                return;
            }
            gw3 gw3VarM10066m = m10066m(i);
            if (!m10067n(i, obj)) {
                if (m10052p(object)) {
                    vr1 vr1VarMo6182d = gw3VarM10066m.mo6182d();
                    gw3VarM10066m.mo6179a(vr1VarMo6182d, object);
                    unsafe.putObject(obj, jM10062I, vr1VarMo6182d);
                } else {
                    unsafe.putObject(obj, jM10062I, object);
                }
                m10060F(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM10062I);
            if (!m10052p(object2)) {
                vr1 vr1VarMo6182d2 = gw3VarM10066m.mo6182d();
                gw3VarM10066m.mo6179a(vr1VarMo6182d2, object2);
                unsafe.putObject(obj, jM10062I, vr1VarMo6182d2);
                object2 = vr1VarMo6182d2;
            }
            gw3VarM10066m.mo6179a(object2, object);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m10072t(int i, Object obj, Object obj2) {
        int[] iArr = this.f28751a;
        int i2 = iArr[i];
        if (m10069q(i2, i, obj2)) {
            long jM10062I = m10062I(i) & 1048575;
            Unsafe unsafe = f28750l;
            Object object = unsafe.getObject(obj2, jM10062I);
            if (object == null) {
                qm5.m9914e(iArr[i], obj2);
                return;
            }
            gw3 gw3VarM10066m = m10066m(i);
            if (!m10069q(i2, i, obj)) {
                if (m10052p(object)) {
                    vr1 vr1VarMo6182d = gw3VarM10066m.mo6182d();
                    gw3VarM10066m.mo6179a(vr1VarMo6182d, object);
                    unsafe.putObject(obj, jM10062I, vr1VarMo6182d);
                } else {
                    unsafe.putObject(obj, jM10062I, object);
                }
                m10061G(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM10062I);
            if (!m10052p(object2)) {
                vr1 vr1VarMo6182d2 = gw3VarM10066m.mo6182d();
                gw3VarM10066m.mo6179a(vr1VarMo6182d2, object2);
                unsafe.putObject(obj, jM10062I, vr1VarMo6182d2);
                object2 = vr1VarMo6182d2;
            }
            gw3VarM10066m.mo6179a(object2, object);
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m10073u(int i, Object obj) {
        gw3 gw3VarM10066m = m10066m(i);
        long jM10062I = m10062I(i) & 1048575;
        if (!m10067n(i, obj)) {
            return gw3VarM10066m.mo6182d();
        }
        Object object = f28750l.getObject(obj, jM10062I);
        if (m10052p(object)) {
            return object;
        }
        vr1 vr1VarMo6182d = gw3VarM10066m.mo6182d();
        if (object != null) {
            gw3VarM10066m.mo6179a(vr1VarMo6182d, object);
        }
        return vr1VarMo6182d;
    }

    /* JADX INFO: renamed from: v */
    public final Object m10074v(int i, int i2, Object obj) {
        gw3 gw3VarM10066m = m10066m(i2);
        if (!m10069q(i, i2, obj)) {
            return gw3VarM10066m.mo6182d();
        }
        Object object = f28750l.getObject(obj, m10062I(i2) & 1048575);
        if (m10052p(object)) {
            return object;
        }
        vr1 vr1VarMo6182d = gw3VarM10066m.mo6182d();
        if (object != null) {
            gw3VarM10066m.mo6179a(vr1VarMo6182d, object);
        }
        return vr1VarMo6182d;
    }

    /* JADX INFO: renamed from: z */
    public final int m10075z(int i) {
        if (i < this.f28753c || i > this.f28754d) {
            return -1;
        }
        int[] iArr = this.f28751a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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
}
