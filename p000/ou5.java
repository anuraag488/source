package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ou5 implements zv5 {

    /* JADX INFO: renamed from: k */
    public static final int[] f27132k = new int[0];

    /* JADX INFO: renamed from: l */
    public static final Unsafe f27133l = rx5.m10486d();

    /* JADX INFO: renamed from: a */
    public int[] f27134a;

    /* JADX INFO: renamed from: b */
    public Object[] f27135b;

    /* JADX INFO: renamed from: c */
    public int f27136c;

    /* JADX INFO: renamed from: d */
    public int f27137d;

    /* JADX INFO: renamed from: e */
    public iv5 f27138e;

    /* JADX INFO: renamed from: f */
    public boolean f27139f;

    /* JADX INFO: renamed from: g */
    public int[] f27140g;

    /* JADX INFO: renamed from: h */
    public int f27141h;

    /* JADX INFO: renamed from: i */
    public int f27142i;

    /* JADX INFO: renamed from: j */
    public gb5 f27143j;

    /* JADX INFO: renamed from: n */
    public static boolean m9284n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ur1) {
            return ((ur1) obj).m11634g();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static int m9285p(long j, Object obj) {
        return ((Integer) rx5.m10485c(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: r */
    public static long m9286r(long j, Object obj) {
        return ((Long) rx5.m10485c(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: v */
    public static Field m9287v(Class cls, String str) {
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

    /* JADX INFO: renamed from: A */
    public final void m9288A(int i, xa0 xa0Var, Object obj) throws ms5 {
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            xa0Var.m12633u0(2);
            rx5.m10491i(j, obj, wa0Var.mo4134Y());
        } else if (!this.f27139f) {
            rx5.m10491i(j, obj, xa0Var.m12639y0());
        } else {
            xa0Var.m12633u0(2);
            rx5.m10491i(j, obj, wa0Var.mo4133X());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9289B(int i, Object obj) {
        int i2 = this.f27134a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        rx5.m10489g(j, (1 << (i2 >>> 20)) | rx5.m10483a(j, obj), obj);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[SYNTHETIC] */
    @Override // p000.zv5
    /* JADX INFO: renamed from: a */
    public final void mo9290a(Object obj) {
        if (m9284n(obj)) {
            if (obj instanceof ur1) {
                ur1 ur1Var = (ur1) obj;
                ur1Var.m11633f(Integer.MAX_VALUE);
                ur1Var.memoizedHashCode = 0;
                ur1Var.m11632d();
            }
            int[] iArr = this.f27134a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM9304q = m9304q(i);
                int i2 = 1048575 & iM9304q;
                int i3 = (iM9304q >>> 20) & 255;
                long j = i2;
                Unsafe unsafe = f27133l;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 17:
                                if (m9301l(i, obj)) {
                                    m9309x(i).mo9290a(unsafe.getObject(obj, j));
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
                                z06 z06Var = (z06) ((gr5) rx5.m10485c(j, obj));
                                if (z06Var.f35688a) {
                                    z06Var.f35688a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((wt5) object).f33725a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m9303o(iArr[i], i, obj)) {
                        m9309x(i).mo9290a(unsafe.getObject(obj, j));
                    }
                } else if (m9301l(i, obj)) {
                    m9309x(i).mo9290a(unsafe.getObject(obj, j));
                }
            }
            ax5 ax5Var = ((ur1) obj).unknownFields;
            if (ax5Var.f14937e) {
                ax5Var.f14937e = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // p000.zv5
    /* JADX INFO: renamed from: b */
    public final void mo9291b(Object obj, Object obj2) {
        Object obj3;
        if (!m9284n(obj)) {
            Objects.toString(obj);
            C1077qn.m9987m("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        byte[] bArr = kr5.f23354a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f27134a;
            if (i >= iArr.length) {
                aw5.m3351t(obj, obj2);
                return;
            }
            int iM9304q = m9304q(i);
            int i2 = iArr[i];
            long j = 1048575 & iM9304q;
            switch ((iM9304q >>> 20) & 255) {
                case 0:
                    if (!m9301l(i, obj2)) {
                        obj3 = obj;
                    } else {
                        bv4 bv4Var = rx5.f29719c;
                        obj3 = obj;
                        bv4Var.mo3738r(obj3, j, bv4Var.mo3731k(j, obj2));
                        m9289B(i, obj3);
                    }
                    break;
                case 1:
                    if (m9301l(i, obj2)) {
                        bv4 bv4Var2 = rx5.f29719c;
                        bv4Var2.mo3740t(obj, j, bv4Var2.mo3733m(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m9301l(i, obj2)) {
                        rx5.m10490h(obj, j, rx5.m10484b(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m9301l(i, obj2)) {
                        rx5.m10490h(obj, j, rx5.m10484b(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m9301l(i, obj2)) {
                        rx5.m10489g(j, rx5.m10483a(j, obj2), obj);
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m9301l(i, obj2)) {
                        rx5.m10490h(obj, j, rx5.m10484b(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m9301l(i, obj2)) {
                        rx5.m10489g(j, rx5.m10483a(j, obj2), obj);
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m9301l(i, obj2)) {
                        bv4 bv4Var3 = rx5.f29719c;
                        bv4Var3.mo3735o(j, obj, bv4Var3.mo3743w(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m9301l(i, obj2)) {
                        rx5.m10491i(j, obj, rx5.m10485c(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m9310y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m9301l(i, obj2)) {
                        rx5.m10491i(j, obj, rx5.m10485c(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m9301l(i, obj2)) {
                        rx5.m10489g(j, rx5.m10483a(j, obj2), obj);
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m9301l(i, obj2)) {
                        rx5.m10489g(j, rx5.m10483a(j, obj2), obj);
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m9301l(i, obj2)) {
                        rx5.m10489g(j, rx5.m10483a(j, obj2), obj);
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m9301l(i, obj2)) {
                        rx5.m10490h(obj, j, rx5.m10484b(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m9301l(i, obj2)) {
                        rx5.m10489g(j, rx5.m10483a(j, obj2), obj);
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m9301l(i, obj2)) {
                        rx5.m10490h(obj, j, rx5.m10484b(j, obj2));
                        m9289B(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m9310y(i, obj, obj2);
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
                    gr5 gr5VarM12430b = (gr5) rx5.m10485c(j, obj);
                    gr5 gr5Var = (gr5) rx5.m10485c(j, obj2);
                    int size = gr5VarM12430b.size();
                    int size2 = gr5Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((z06) gr5VarM12430b).f35688a) {
                            gr5VarM12430b = ((wv5) gr5VarM12430b).m12430b(size2 + size);
                        }
                        gr5VarM12430b.addAll(gr5Var);
                    }
                    if (size > 0) {
                        gr5Var = gr5VarM12430b;
                    }
                    rx5.m10491i(j, obj, gr5Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = aw5.f14921a;
                    rx5.m10491i(j, obj, bu5.m3693a(rx5.m10485c(j, obj), rx5.m10485c(j, obj2)));
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
                    if (m9303o(i2, i, obj2)) {
                        rx5.m10491i(j, obj, rx5.m10485c(j, obj2));
                        m9299j(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m9311z(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m9303o(i2, i, obj2)) {
                        rx5.m10491i(j, obj, rx5.m10485c(j, obj2));
                        m9299j(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m9311z(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p000.zv5
    /* JADX INFO: renamed from: c */
    public final void mo9292c(java.lang.Object r20, p000.xa0 r21, p000.no5 r22) {
        /*
            Method dump skipped, instruction units count: 2316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ou5.mo9292c(java.lang.Object, xa0, no5):void");
    }

    /* JADX WARN: Code duplicated, block: B:140:0x047b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e8  */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x06c5, code lost:
    
        if (m9302m(r1, r2, r3, r4, r5) != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x06c7, code lost:
    
        r0 = (p000.c75.m3875g(r11 << 3, 9, 352) >>> 6) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06da, code lost:
    
        if (m9302m(r1, r2, r3, r4, r5) != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06dc, code lost:
    
        r0 = (p000.c75.m3875g(r11 << 3, 9, 352) >>> 6) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0789, code lost:
    
        if (m9302m(r1, r2, r3, r4, r5) != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0791, code lost:
    
        if (m9302m(r1, r2, r3, r4, r5) != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x07df, code lost:
    
        if (m9302m(r1, r2, r3, r4, r5) != false) goto L235;
     */
    @Override // p000.zv5
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo9293d(ur1 ur1Var) {
        int i;
        int iM3875g;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int iM7341b;
        int iM3344m;
        int iNumberOfLeadingZeros4;
        int iNumberOfLeadingZeros5;
        int i2;
        int i3;
        int size;
        int i4;
        int iM3348q;
        int iNumberOfLeadingZeros6;
        int iM3875g2;
        int iM3875g3;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iNumberOfLeadingZeros9;
        int iM7341b2;
        int iNumberOfLeadingZeros10;
        int iNumberOfLeadingZeros11;
        int i5;
        int i6;
        ur1 ur1Var2 = ur1Var;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int size2 = 0;
        while (true) {
            int[] iArr = this.f27134a;
            if (i9 >= iArr.length) {
                return ur1Var2.unknownFields.m3361a() + size2;
            }
            int iM9304q = m9304q(i9);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i7;
            int i14 = (iM9304q >>> 20) & 255;
            Unsafe unsafe = f27133l;
            if (i14 <= 17) {
                if (i13 != i8) {
                    i10 = i13 == i7 ? 0 : unsafe.getInt(ur1Var2, i13);
                    i8 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i15 = iM9304q & i7;
            if (i14 >= tp5.f31315b.f31319a) {
                byte b = tp5.f31316c.f31319a;
            }
            long j = i15;
            switch (i14) {
                case 0:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        iM3875g = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 8;
                        size2 += iM3875g;
                    }
                    break;
                case 1:
                    break;
                case 2:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        long j2 = unsafe.getLong(ur1Var2, j);
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(j2);
                        i2 = (352 - iNumberOfLeadingZeros) >>> 6;
                        i3 = (640 - (iNumberOfLeadingZeros2 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 3:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        long j3 = unsafe.getLong(ur1Var2, j);
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(j3);
                        i2 = (352 - iNumberOfLeadingZeros) >>> 6;
                        i3 = (640 - (iNumberOfLeadingZeros2 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 4:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        int i16 = unsafe.getInt(ur1Var2, j);
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(i16);
                        i2 = (352 - iNumberOfLeadingZeros) >>> 6;
                        i3 = (640 - (iNumberOfLeadingZeros2 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        int iM3875g4 = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 1;
                        size2 += iM3875g4;
                    }
                    ur1Var2 = ur1Var;
                    break;
                case 8:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        int i17 = i11 << 3;
                        Object object = unsafe.getObject(ur1Var2, j);
                        if (object instanceof aj6) {
                            iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i17) * 9;
                            iM7341b = ((aj6) object).mo3015d();
                        } else {
                            iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i17) * 9;
                            iM7341b = jy5.m7341b((String) object);
                        }
                        iM3875g = ((352 - iNumberOfLeadingZeros3) >>> 6) + (c75.m3875g(iM7341b, 9, 352) >>> 6) + iM7341b;
                        size2 += iM3875g;
                    }
                    break;
                case 9:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        iM3344m = aw5.m3344m(i11, unsafe.getObject(ur1Var2, j), m9309x(i9));
                        size2 += iM3344m;
                    }
                    break;
                case 10:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        aj6 aj6Var = (aj6) unsafe.getObject(ur1Var2, j);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iM7341b = aj6Var.mo3015d();
                        iM3875g = ((352 - iNumberOfLeadingZeros3) >>> 6) + (c75.m3875g(iM7341b, 9, 352) >>> 6) + iM7341b;
                        size2 += iM3875g;
                    }
                    break;
                case 11:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        int i18 = unsafe.getInt(ur1Var2, j);
                        iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(i18);
                        i2 = (352 - iNumberOfLeadingZeros4) >>> 6;
                        i3 = (352 - (iNumberOfLeadingZeros5 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 12:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        int i19 = unsafe.getInt(ur1Var2, j);
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(i19);
                        i2 = (352 - iNumberOfLeadingZeros) >>> 6;
                        i3 = (640 - (iNumberOfLeadingZeros2 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        int i20 = unsafe.getInt(ur1Var2, j);
                        iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros((i20 >> 31) ^ (i20 + i20));
                        i2 = (352 - iNumberOfLeadingZeros4) >>> 6;
                        i3 = (352 - (iNumberOfLeadingZeros5 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 16:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        long j4 = unsafe.getLong(ur1Var2, j);
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros((j4 >> 63) ^ (j4 + j4));
                        i2 = (352 - iNumberOfLeadingZeros) >>> 6;
                        i3 = (640 - (iNumberOfLeadingZeros2 * 9)) >>> 6;
                        iM3875g = i2 + i3;
                        size2 += iM3875g;
                    }
                    break;
                case 17:
                    if (m9302m(ur1Var2, i9, i8, i10, i)) {
                        iM3344m = aw5.m3338g(i11, (iv5) unsafe.getObject(ur1Var2, j), m9309x(i9));
                        size2 += iM3344m;
                    }
                    break;
                case 18:
                    iM3344m = aw5.m3341j((List) unsafe.getObject(ur1Var2, j), i11);
                    size2 += iM3344m;
                    break;
                case 19:
                    iM3344m = aw5.m3340i((List) unsafe.getObject(ur1Var2, j), i11);
                    size2 += iM3344m;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(ur1Var2, j);
                    Class cls = aw5.f14921a;
                    size2 += list.size() == 0 ? 0 : (list.size() * (c75.m3875g(i11 << 3, 9, 352) >>> 6)) + aw5.m3343l(list);
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls2 = aw5.f14921a;
                    size = list2.size();
                    if (size == 0) {
                        iM3875g3 = 0;
                    } else {
                        i4 = i11 << 3;
                        iM3348q = aw5.m3348q(list2);
                        iM3875g3 = (size * (c75.m3875g(i4, 9, 352) >>> 6)) + iM3348q;
                    }
                    size2 += iM3875g3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls3 = aw5.f14921a;
                    size = list3.size();
                    if (size == 0) {
                        iM3875g3 = 0;
                    } else {
                        i4 = i11 << 3;
                        iM3348q = aw5.m3342k(list3);
                        iM3875g3 = (size * (c75.m3875g(i4, 9, 352) >>> 6)) + iM3348q;
                    }
                    size2 += iM3875g3;
                    break;
                case 23:
                    iM3344m = aw5.m3341j((List) unsafe.getObject(ur1Var2, j), i11);
                    size2 += iM3344m;
                    break;
                case 24:
                    iM3344m = aw5.m3340i((List) unsafe.getObject(ur1Var2, j), i11);
                    size2 += iM3344m;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls4 = aw5.f14921a;
                    int size3 = list4.size();
                    size2 += size3 == 0 ? 0 : ((c75.m3875g(i11 << 3, 9, 352) >>> 6) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls5 = aw5.f14921a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        iNumberOfLeadingZeros6 = ((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6) * size4;
                        if (list5 instanceof ft5) {
                            ft5 ft5Var = (ft5) list5;
                            for (int i21 = 0; i21 < size4; i21++) {
                                Object objM5804j = ft5Var.m5804j();
                                int iMo3015d = objM5804j instanceof aj6 ? ((aj6) objM5804j).mo3015d() : jy5.m7341b((String) objM5804j);
                                iNumberOfLeadingZeros6 = (c75.m3875g(iMo3015d, 9, 352) >>> 6) + iMo3015d + iNumberOfLeadingZeros6;
                            }
                        } else {
                            for (int i22 = 0; i22 < size4; i22++) {
                                Object obj = list5.get(i22);
                                int iMo3015d2 = obj instanceof aj6 ? ((aj6) obj).mo3015d() : jy5.m7341b((String) obj);
                                iNumberOfLeadingZeros6 = (c75.m3875g(iMo3015d2, 9, 352) >>> 6) + iMo3015d2 + iNumberOfLeadingZeros6;
                            }
                        }
                    }
                    size2 += iNumberOfLeadingZeros6;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(ur1Var2, j);
                    zv5 zv5VarM9309x = m9309x(i9);
                    Class cls6 = aw5.f14921a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM3875g2 = 0;
                    } else {
                        iM3875g2 = (c75.m3875g(i11 << 3, 9, 352) >>> 6) * size5;
                        for (int i23 = 0; i23 < size5; i23++) {
                            int iMo6948b = ((iv5) list6.get(i23)).mo6948b(zv5VarM9309x);
                            iM3875g2 += (c75.m3875g(iMo6948b, 9, 352) >>> 6) + iMo6948b;
                        }
                    }
                    size2 += iM3875g2;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls7 = aw5.f14921a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM3875g3 = 0;
                    } else {
                        iM3875g3 = size6 * (c75.m3875g(i11 << 3, 9, 352) >>> 6);
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iMo3015d3 = ((aj6) list7.get(i24)).mo3015d();
                            iM3875g3 += (c75.m3875g(iMo3015d3, 9, 352) >>> 6) + iMo3015d3;
                        }
                    }
                    size2 += iM3875g3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls8 = aw5.f14921a;
                    size = list8.size();
                    if (size == 0) {
                        iM3875g3 = 0;
                    } else {
                        i4 = i11 << 3;
                        iM3348q = aw5.m3347p(list8);
                        iM3875g3 = (size * (c75.m3875g(i4, 9, 352) >>> 6)) + iM3348q;
                    }
                    size2 += iM3875g3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls9 = aw5.f14921a;
                    size = list9.size();
                    if (size == 0) {
                        iM3875g3 = 0;
                    } else {
                        i4 = i11 << 3;
                        iM3348q = aw5.m3339h(list9);
                        iM3875g3 = (size * (c75.m3875g(i4, 9, 352) >>> 6)) + iM3348q;
                    }
                    size2 += iM3875g3;
                    break;
                case 31:
                    iM3344m = aw5.m3340i((List) unsafe.getObject(ur1Var2, j), i11);
                    size2 += iM3344m;
                    break;
                case 32:
                    iM3344m = aw5.m3341j((List) unsafe.getObject(ur1Var2, j), i11);
                    size2 += iM3344m;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls10 = aw5.f14921a;
                    size = list10.size();
                    if (size == 0) {
                        iM3875g3 = 0;
                    } else {
                        i4 = i11 << 3;
                        iM3348q = aw5.m3345n(list10);
                        iM3875g3 = (size * (c75.m3875g(i4, 9, 352) >>> 6)) + iM3348q;
                    }
                    size2 += iM3875g3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls11 = aw5.f14921a;
                    size = list11.size();
                    if (size == 0) {
                        iM3875g3 = 0;
                    } else {
                        i4 = i11 << 3;
                        iM3348q = aw5.m3346o(list11);
                        iM3875g3 = (size * (c75.m3875g(i4, 9, 352) >>> 6)) + iM3348q;
                    }
                    size2 += iM3875g3;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls12 = aw5.f14921a;
                    int size7 = list12.size() * 8;
                    if (size7 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size7) * 9)) >>> 6, size7, size2);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls13 = aw5.f14921a;
                    int size8 = list13.size() * 4;
                    if (size8 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size8) * 9)) >>> 6, size8, size2);
                    }
                    break;
                case 37:
                    int iM3343l = aw5.m3343l((List) unsafe.getObject(ur1Var2, j));
                    if (iM3343l > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3343l) * 9)) >>> 6, iM3343l, size2);
                    }
                    break;
                case 38:
                    int iM3348q2 = aw5.m3348q((List) unsafe.getObject(ur1Var2, j));
                    if (iM3348q2 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3348q2) * 9)) >>> 6, iM3348q2, size2);
                    }
                    break;
                case 39:
                    int iM3342k = aw5.m3342k((List) unsafe.getObject(ur1Var2, j));
                    if (iM3342k > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3342k) * 9)) >>> 6, iM3342k, size2);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls14 = aw5.f14921a;
                    int size9 = list14.size() * 8;
                    if (size9 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size9) * 9)) >>> 6, size9, size2);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls15 = aw5.f14921a;
                    int size10 = list15.size() * 4;
                    if (size10 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size10) * 9)) >>> 6, size10, size2);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls16 = aw5.f14921a;
                    int size11 = list16.size();
                    if (size11 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size11) * 9)) >>> 6, size11, size2);
                    }
                    break;
                case 43:
                    int iM3347p = aw5.m3347p((List) unsafe.getObject(ur1Var2, j));
                    if (iM3347p > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3347p) * 9)) >>> 6, iM3347p, size2);
                    }
                    break;
                case 44:
                    int iM3339h = aw5.m3339h((List) unsafe.getObject(ur1Var2, j));
                    if (iM3339h > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3339h) * 9)) >>> 6, iM3339h, size2);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls17 = aw5.f14921a;
                    int size12 = list17.size() * 4;
                    if (size12 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size12) * 9)) >>> 6, size12, size2);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(ur1Var2, j);
                    Class cls18 = aw5.f14921a;
                    int size13 = list18.size() * 8;
                    if (size13 > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(size13) * 9)) >>> 6, size13, size2);
                    }
                    break;
                case 47:
                    int iM3345n = aw5.m3345n((List) unsafe.getObject(ur1Var2, j));
                    if (iM3345n > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3345n) * 9)) >>> 6, iM3345n, size2);
                    }
                    break;
                case 48:
                    int iM3346o = aw5.m3346o((List) unsafe.getObject(ur1Var2, j));
                    if (iM3346o > 0) {
                        size2 = sk5.m10848n((352 - (Integer.numberOfLeadingZeros(i11 << 3) * 9)) >>> 6, (352 - (Integer.numberOfLeadingZeros(iM3346o) * 9)) >>> 6, iM3346o, size2);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(ur1Var2, j);
                    zv5 zv5VarM9309x2 = m9309x(i9);
                    Class cls19 = aw5.f14921a;
                    int size14 = list19.size();
                    if (size14 == 0) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        iNumberOfLeadingZeros6 = 0;
                        for (int i25 = 0; i25 < size14; i25++) {
                            iNumberOfLeadingZeros6 += aw5.m3338g(i11, (iv5) list19.get(i25), zv5VarM9309x2);
                        }
                    }
                    size2 += iNumberOfLeadingZeros6;
                    break;
                case 50:
                    int i26 = i9 / 3;
                    wt5 wt5Var = (wt5) unsafe.getObject(ur1Var2, j);
                    rt5 rt5Var = (rt5) this.f27135b[i26 + i26];
                    if (wt5Var.isEmpty()) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        iNumberOfLeadingZeros6 = 0;
                        for (Map.Entry entry : wt5Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            rt5Var.getClass();
                            int iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                            int iM10426a = rt5.m10426a(rt5Var.f29618a, key, value);
                            iNumberOfLeadingZeros6 += ((352 - iNumberOfLeadingZeros12) >>> 6) + (c75.m3875g(iM10426a, 9, 352) >>> 6) + iM10426a;
                        }
                    }
                    size2 += iNumberOfLeadingZeros6;
                    break;
                case 51:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 8;
                        size2 += iM3344m;
                    }
                    break;
                case 52:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 4;
                        size2 += iM3344m;
                    }
                    break;
                case 53:
                    if (m9303o(i11, i9, ur1Var2)) {
                        long jM9286r = m9286r(j, ur1Var2);
                        iNumberOfLeadingZeros7 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros8 = Long.numberOfLeadingZeros(jM9286r);
                        i5 = (352 - iNumberOfLeadingZeros7) >>> 6;
                        i6 = 640 - (iNumberOfLeadingZeros8 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 54:
                    if (m9303o(i11, i9, ur1Var2)) {
                        long jM9286r2 = m9286r(j, ur1Var2);
                        iNumberOfLeadingZeros7 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros8 = Long.numberOfLeadingZeros(jM9286r2);
                        i5 = (352 - iNumberOfLeadingZeros7) >>> 6;
                        i6 = 640 - (iNumberOfLeadingZeros8 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 55:
                    if (m9303o(i11, i9, ur1Var2)) {
                        int iM9285p = m9285p(j, ur1Var2);
                        iNumberOfLeadingZeros7 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros8 = Long.numberOfLeadingZeros(iM9285p);
                        i5 = (352 - iNumberOfLeadingZeros7) >>> 6;
                        i6 = 640 - (iNumberOfLeadingZeros8 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 56:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 8;
                        size2 += iM3344m;
                    }
                    break;
                case 57:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 4;
                        size2 += iM3344m;
                    }
                    break;
                case 58:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 1;
                        size2 += iM3344m;
                    }
                    break;
                case 59:
                    if (m9303o(i11, i9, ur1Var2)) {
                        int i27 = i11 << 3;
                        Object object2 = unsafe.getObject(ur1Var2, j);
                        if (object2 instanceof aj6) {
                            iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(i27) * 9;
                            iM7341b2 = ((aj6) object2).mo3015d();
                        } else {
                            iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(i27) * 9;
                            iM7341b2 = jy5.m7341b((String) object2);
                        }
                        iM3344m = ((352 - iNumberOfLeadingZeros9) >>> 6) + (c75.m3875g(iM7341b2, 9, 352) >>> 6) + iM7341b2;
                        size2 += iM3344m;
                    }
                    break;
                case 60:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = aw5.m3344m(i11, unsafe.getObject(ur1Var2, j), m9309x(i9));
                        size2 += iM3344m;
                    }
                    break;
                case 61:
                    if (m9303o(i11, i9, ur1Var2)) {
                        aj6 aj6Var2 = (aj6) unsafe.getObject(ur1Var2, j);
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iM7341b2 = aj6Var2.mo3015d();
                        iM3344m = ((352 - iNumberOfLeadingZeros9) >>> 6) + (c75.m3875g(iM7341b2, 9, 352) >>> 6) + iM7341b2;
                        size2 += iM3344m;
                    }
                    break;
                case 62:
                    if (m9303o(i11, i9, ur1Var2)) {
                        int iM9285p2 = m9285p(j, ur1Var2);
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iM9285p2);
                        i5 = (352 - iNumberOfLeadingZeros10) >>> 6;
                        i6 = 352 - (iNumberOfLeadingZeros11 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 63:
                    if (m9303o(i11, i9, ur1Var2)) {
                        int iM9285p3 = m9285p(j, ur1Var2);
                        iNumberOfLeadingZeros7 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros8 = Long.numberOfLeadingZeros(iM9285p3);
                        i5 = (352 - iNumberOfLeadingZeros7) >>> 6;
                        i6 = 640 - (iNumberOfLeadingZeros8 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 64:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 4;
                        size2 += iM3344m;
                    }
                    break;
                case 65:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = (c75.m3875g(i11 << 3, 9, 352) >>> 6) + 8;
                        size2 += iM3344m;
                    }
                    break;
                case 66:
                    if (m9303o(i11, i9, ur1Var2)) {
                        int iM9285p4 = m9285p(j, ur1Var2);
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros((iM9285p4 >> 31) ^ (iM9285p4 + iM9285p4));
                        i5 = (352 - iNumberOfLeadingZeros10) >>> 6;
                        i6 = 352 - (iNumberOfLeadingZeros11 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 67:
                    if (m9303o(i11, i9, ur1Var2)) {
                        long jM9286r3 = m9286r(j, ur1Var2);
                        iNumberOfLeadingZeros7 = Integer.numberOfLeadingZeros(i11 << 3) * 9;
                        iNumberOfLeadingZeros8 = Long.numberOfLeadingZeros((jM9286r3 >> 63) ^ (jM9286r3 + jM9286r3));
                        i5 = (352 - iNumberOfLeadingZeros7) >>> 6;
                        i6 = 640 - (iNumberOfLeadingZeros8 * 9);
                        iM3344m = i5 + (i6 >>> 6);
                        size2 += iM3344m;
                    }
                    break;
                case 68:
                    if (m9303o(i11, i9, ur1Var2)) {
                        iM3344m = aw5.m3338g(i11, (iv5) unsafe.getObject(ur1Var2, j), m9309x(i9));
                        size2 += iM3344m;
                    }
                    break;
            }
            i9 += 3;
            i7 = 1048575;
        }
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: e */
    public final boolean mo9294e(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.f27141h) {
            int i6 = this.f27140g[i3];
            int iM9304q = this.m9304q(i6);
            int[] iArr = this.f27134a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = f27133l.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            ou5 ou5Var = this;
            Object obj2 = obj;
            if ((268435456 & iM9304q) == 0 || ou5Var.m9302m(obj2, i6, i, i2, i9)) {
                int i10 = (iM9304q >>> 20) & 255;
                if (i10 != 9 && i10 != 17) {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (!ou5Var.m9303o(iArr[i6], i6, obj2) || ou5Var.m9309x(i6).mo9294e(rx5.m10485c(iM9304q & 1048575, obj2))) {
                                i3++;
                                this = ou5Var;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (i10 != 49) {
                            if (i10 != 50) {
                                continue;
                            } else {
                                wt5 wt5Var = (wt5) rx5.m10485c(iM9304q & 1048575, obj2);
                                if (wt5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i11 = i6 / 3;
                                    if (((dz5) ((rt5) ou5Var.f27135b[i11 + i11]).f29618a.f31429c).f17541a == gz5.f20229i) {
                                        zv5 zv5VarM11661a = null;
                                        for (Object obj3 : wt5Var.values()) {
                                            if (zv5VarM11661a == null) {
                                                zv5VarM11661a = uv5.f32208b.m11661a(((ur1) obj3).getClass());
                                            }
                                            if (!zv5VarM11661a.mo9294e(obj3)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i3++;
                            this = ou5Var;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) rx5.m10485c(iM9304q & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zv5 zv5VarM9309x = ou5Var.m9309x(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (zv5VarM9309x.mo9294e(list.get(i12))) {
                            }
                        }
                    }
                    i3++;
                    this = ou5Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!ou5Var.m9302m(obj2, i6, i, i2, i9) || ou5Var.m9309x(i6).mo9294e(rx5.m10485c(iM9304q & 1048575, obj2))) {
                    i3++;
                    this = ou5Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: f */
    public final int mo9295f(ur1 ur1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f27134a.length; i5 += 3) {
            int iM9304q = m9304q(i5);
            int i6 = (iM9304q >>> 20) & 255;
            if (i6 <= 50 || i6 >= 69) {
                long j = iM9304q & 1048575;
                int iHashCode2 = 37;
                switch (i6) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(rx5.f29719c.mo3731k(j, ur1Var));
                        byte[] bArr = kr5.f23354a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(rx5.f29719c.mo3733m(j, ur1Var));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = rx5.m10484b(j, ur1Var);
                        byte[] bArr2 = kr5.f23354a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = rx5.m10484b(j, ur1Var);
                        byte[] bArr3 = kr5.f23354a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10483a(j, ur1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = rx5.m10484b(j, ur1Var);
                        byte[] bArr4 = kr5.f23354a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10483a(j, ur1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zMo3743w = rx5.f29719c.mo3743w(j, ur1Var);
                        byte[] bArr5 = kr5.f23354a;
                        i3 = zMo3743w ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) rx5.m10485c(j, ur1Var)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM10485c = rx5.m10485c(j, ur1Var);
                        if (objM10485c != null) {
                            iHashCode2 = objM10485c.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10485c(j, ur1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10483a(j, ur1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10483a(j, ur1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10483a(j, ur1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = rx5.m10484b(j, ur1Var);
                        byte[] bArr6 = kr5.f23354a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10483a(j, ur1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = rx5.m10484b(j, ur1Var);
                        byte[] bArr7 = kr5.f23354a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM10485c2 = rx5.m10485c(j, ur1Var);
                        if (objM10485c2 != null) {
                            iHashCode2 = objM10485c2.hashCode();
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
                        iFloatToIntBits = rx5.m10485c(j, ur1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = rx5.m10485c(j, ur1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.f27142i;
        while (true) {
            int[] iArr = this.f27140g;
            if (i7 >= iArr.length) {
                return ur1Var.unknownFields.hashCode() + (iHashCode * 53);
            }
            int i8 = iArr[i7];
            if (!m9303o(0, i8, ur1Var)) {
                iHashCode = rx5.m10485c(m9304q(i8) & 1048575, ur1Var).hashCode() + (iHashCode * 53);
            }
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // p000.zv5
    /* JADX INFO: renamed from: g */
    public final boolean mo9296g(ur1 ur1Var, ur1 ur1Var2) {
        boolean zM3337f;
        int[] iArr = this.f27134a;
        for (int i = 0; i < iArr.length; i += 3) {
            int iM9304q = m9304q(i);
            int i2 = (iM9304q >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long j = iM9304q & 1048575;
                switch (i2) {
                    case 0:
                        if (m9300k(ur1Var, ur1Var2, i)) {
                            bv4 bv4Var = rx5.f29719c;
                            if (Double.doubleToLongBits(bv4Var.mo3731k(j, ur1Var)) == Double.doubleToLongBits(bv4Var.mo3731k(j, ur1Var2))) {
                                break;
                            }
                        }
                        return false;
                    case 1:
                        if (m9300k(ur1Var, ur1Var2, i)) {
                            bv4 bv4Var2 = rx5.f29719c;
                            if (Float.floatToIntBits(bv4Var2.mo3733m(j, ur1Var)) == Float.floatToIntBits(bv4Var2.mo3733m(j, ur1Var2))) {
                                break;
                            }
                        }
                        return false;
                    case 2:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10484b(j, ur1Var) != rx5.m10484b(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 3:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10484b(j, ur1Var) != rx5.m10484b(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 4:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10483a(j, ur1Var) != rx5.m10483a(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 5:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10484b(j, ur1Var) != rx5.m10484b(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 6:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10483a(j, ur1Var) != rx5.m10483a(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 7:
                        if (m9300k(ur1Var, ur1Var2, i)) {
                            bv4 bv4Var3 = rx5.f29719c;
                            if (bv4Var3.mo3743w(j, ur1Var) == bv4Var3.mo3743w(j, ur1Var2)) {
                                break;
                            }
                        }
                        return false;
                    case 8:
                        if (!m9300k(ur1Var, ur1Var2, i) || !aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2))) {
                            return false;
                        }
                        break;
                        break;
                    case 9:
                        if (!m9300k(ur1Var, ur1Var2, i) || !aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2))) {
                            return false;
                        }
                        break;
                        break;
                    case 10:
                        if (!m9300k(ur1Var, ur1Var2, i) || !aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2))) {
                            return false;
                        }
                        break;
                        break;
                    case 11:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10483a(j, ur1Var) != rx5.m10483a(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 12:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10483a(j, ur1Var) != rx5.m10483a(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 13:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10483a(j, ur1Var) != rx5.m10483a(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 14:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10484b(j, ur1Var) != rx5.m10484b(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 15:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10483a(j, ur1Var) != rx5.m10483a(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 16:
                        if (!m9300k(ur1Var, ur1Var2, i) || rx5.m10484b(j, ur1Var) != rx5.m10484b(j, ur1Var2)) {
                            return false;
                        }
                        break;
                        break;
                    case 17:
                        if (!m9300k(ur1Var, ur1Var2, i) || !aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2))) {
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
                        zM3337f = aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2));
                        if (!zM3337f) {
                            return false;
                        }
                        break;
                        break;
                    case 50:
                        zM3337f = aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2));
                        if (!zM3337f) {
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
                        if (rx5.m10483a(j2, ur1Var) == rx5.m10483a(j2, ur1Var2) && aw5.m3337f(rx5.m10485c(j, ur1Var), rx5.m10485c(j, ur1Var2))) {
                            break;
                        }
                        return false;
                    default:
                        continue;
                }
            }
        }
        int i3 = this.f27142i;
        while (true) {
            int[] iArr2 = this.f27140g;
            if (i3 < iArr2.length) {
                int i4 = iArr2[i3];
                long j3 = iArr[i4 + 2] & 1048575;
                if (rx5.m10483a(j3, ur1Var) != rx5.m10483a(j3, ur1Var2)) {
                    return false;
                }
                if (!m9303o(0, i4, ur1Var)) {
                    long jM9304q = m9304q(i4) & 1048575;
                    if (!aw5.m3337f(rx5.m10485c(jM9304q, ur1Var), rx5.m10485c(jM9304q, ur1Var2))) {
                    }
                }
                i3++;
            } else if (ur1Var.unknownFields.equals(ur1Var2.unknownFields)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: h */
    public final ur1 mo9297h() {
        return (ur1) ((ur1) this.f27138e).mo5307i(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.zv5
    /* JADX INFO: renamed from: i */
    public final void mo9298i(Object obj, wd3 wd3Var) throws za0 {
        int i;
        boolean z;
        boolean z2;
        ou5 ou5Var = this;
        n83 n83Var = (n83) wd3Var.f33259b;
        int[] iArr = ou5Var.f27134a;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iM9304q = ou5Var.m9304q(i4);
            int i6 = iArr[i4];
            int i7 = (iM9304q >>> 20) & 255;
            Unsafe unsafe = f27133l;
            if (i7 <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iM9304q & i2;
            switch (i7) {
                case 0:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8614r(i6, Double.doubleToRawLongBits(rx5.f29719c.mo3731k(j, obj)));
                    }
                    break;
                case 1:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8612p(i6, Float.floatToRawIntBits(rx5.f29719c.mo3733m(j, obj)));
                    }
                    break;
                case 2:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8622z(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8622z(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        n83Var.m8621y(i6 << 3);
                        n83Var.m8617u(i10);
                    }
                    break;
                case 5:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8614r(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8612p(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        boolean zMo3743w = rx5.f29719c.mo3743w(j, obj);
                        n83Var.m8621y(i6 << 3);
                        n83Var.m8608l(zMo3743w ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            n83Var.m8621y((i6 << 3) | 2);
                            n83Var.m8618v((String) object);
                        } else {
                            n83Var.m8611o(i6, (aj6) object);
                        }
                    }
                    break;
                case 9:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        wd3Var.m12239p(i6, unsafe.getObject(obj, j), ou5Var.m9309x(i4));
                    }
                    break;
                case 10:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8611o(i6, (aj6) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8620x(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        n83Var.m8621y(i6 << 3);
                        n83Var.m8617u(i11);
                    }
                    break;
                case 13:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8612p(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        n83Var.m8614r(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        n83Var.m8620x(i6, (i12 >> 31) ^ (i12 + i12));
                    }
                    break;
                case 16:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        n83Var.m8622z(i6, (j2 >> 63) ^ (j2 + j2));
                    }
                    break;
                case 17:
                    z = false;
                    if (ou5Var.m9302m(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        n83Var.m8619w(i6, 3);
                        ou5Var.m9309x(i4).mo9298i((iv5) object2, wd3Var);
                        n83Var.m8619w(i6, 4);
                    }
                    break;
                case 18:
                    z = false;
                    aw5.m3353v(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 19:
                    z = false;
                    aw5.m3357z(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 20:
                    z = false;
                    aw5.m3330B(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 21:
                    z = false;
                    aw5.m3336e(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 22:
                    z = false;
                    aw5.m3329A(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 23:
                    z = false;
                    aw5.m3356y(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 24:
                    z = false;
                    aw5.m3355x(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 25:
                    z = false;
                    aw5.m3352u(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 26:
                    int i13 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = aw5.f14921a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof ft5) {
                            ft5 ft5Var = (ft5) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object objM5804j = ft5Var.m5804j();
                                if (objM5804j instanceof String) {
                                    n83Var.m8621y((i13 << 3) | 2);
                                    n83Var.m8618v((String) objM5804j);
                                } else {
                                    n83Var.m8611o(i13, (aj6) objM5804j);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                String str = (String) list.get(i15);
                                n83Var.m8621y((i13 << 3) | 2);
                                n83Var.m8618v(str);
                            }
                        }
                    }
                    break;
                case 27:
                    int i16 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zv5 zv5VarM9309x = ou5Var.m9309x(i4);
                    Class cls2 = aw5.f14921a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            wd3Var.m12239p(i16, list2.get(i17), zv5VarM9309x);
                        }
                    }
                    break;
                case 28:
                    int i18 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = aw5.f14921a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            n83Var.m8611o(i18, (aj6) list3.get(i19));
                        }
                    }
                    break;
                case 29:
                    z2 = false;
                    aw5.m3335d(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 30:
                    z2 = false;
                    aw5.m3354w(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 31:
                    z2 = false;
                    aw5.m3331C(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 32:
                    z2 = false;
                    aw5.m3332a(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 33:
                    z2 = false;
                    aw5.m3333b(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 34:
                    z2 = false;
                    aw5.m3334c(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, false);
                    break;
                case 35:
                    aw5.m3353v(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 36:
                    aw5.m3357z(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 37:
                    aw5.m3330B(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 38:
                    aw5.m3336e(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 39:
                    aw5.m3329A(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 40:
                    aw5.m3356y(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 41:
                    aw5.m3355x(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 42:
                    aw5.m3352u(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 43:
                    aw5.m3335d(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 44:
                    aw5.m3354w(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 45:
                    aw5.m3331C(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 46:
                    aw5.m3332a(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 47:
                    aw5.m3333b(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 48:
                    aw5.m3334c(iArr[i4], (List) unsafe.getObject(obj, j), wd3Var, true);
                    break;
                case 49:
                    int i20 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zv5 zv5VarM9309x2 = ou5Var.m9309x(i4);
                    Class cls4 = aw5.f14921a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            iv5 iv5Var = (iv5) list4.get(i21);
                            n83Var.m8619w(i20, 3);
                            zv5VarM9309x2.mo9298i(iv5Var, wd3Var);
                            n83Var.m8619w(i20, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        int i22 = i4 / 3;
                        tt2 tt2Var = ((rt5) ou5Var.f27135b[i22 + i22]).f29618a;
                        for (Map.Entry entry : ((wt5) object3).entrySet()) {
                            n83Var.m8619w(i6, 2);
                            n83Var.m8621y(rt5.m10426a(tt2Var, entry.getKey(), entry.getValue()));
                            rt5.m10427b(n83Var, tt2Var, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8614r(i6, Double.doubleToRawLongBits(((Double) rx5.m10485c(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8612p(i6, Float.floatToRawIntBits(((Float) rx5.m10485c(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8622z(i6, m9286r(j, obj));
                    }
                    break;
                case 54:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8622z(i6, m9286r(j, obj));
                    }
                    break;
                case 55:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        int iM9285p = m9285p(j, obj);
                        n83Var.m8621y(i6 << 3);
                        n83Var.m8617u(iM9285p);
                    }
                    break;
                case 56:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8614r(i6, m9286r(j, obj));
                    }
                    break;
                case 57:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8612p(i6, m9285p(j, obj));
                    }
                    break;
                case 58:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        boolean zBooleanValue = ((Boolean) rx5.m10485c(j, obj)).booleanValue();
                        n83Var.m8621y(i6 << 3);
                        n83Var.m8608l(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            n83Var.m8621y((i6 << 3) | 2);
                            n83Var.m8618v((String) object4);
                        } else {
                            n83Var.m8611o(i6, (aj6) object4);
                        }
                    }
                    break;
                case 60:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        wd3Var.m12239p(i6, unsafe.getObject(obj, j), ou5Var.m9309x(i4));
                    }
                    break;
                case 61:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8611o(i6, (aj6) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8620x(i6, m9285p(j, obj));
                    }
                    break;
                case 63:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        int iM9285p2 = m9285p(j, obj);
                        n83Var.m8621y(i6 << 3);
                        n83Var.m8617u(iM9285p2);
                    }
                    break;
                case 64:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8612p(i6, m9285p(j, obj));
                    }
                    break;
                case 65:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        n83Var.m8614r(i6, m9286r(j, obj));
                    }
                    break;
                case 66:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        int iM9285p3 = m9285p(j, obj);
                        n83Var.m8620x(i6, (iM9285p3 >> 31) ^ (iM9285p3 + iM9285p3));
                    }
                    break;
                case 67:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        long jM9286r = m9286r(j, obj);
                        n83Var.m8622z(i6, (jM9286r >> 63) ^ (jM9286r + jM9286r));
                    }
                    break;
                case 68:
                    if (ou5Var.m9303o(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        n83Var.m8619w(i6, 3);
                        ou5Var.m9309x(i4).mo9298i((iv5) object5, wd3Var);
                        n83Var.m8619w(i6, 4);
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            ou5Var = this;
        }
        ((ur1) obj).unknownFields.m3363c(wd3Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m9299j(int i, int i2, Object obj) {
        rx5.m10489g(this.f27134a[i2 + 2] & 1048575, i, obj);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9300k(ur1 ur1Var, ur1 ur1Var2, int i) {
        return m9301l(i, ur1Var) == m9301l(i, ur1Var2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: l */
    public final boolean m9301l(int i, Object obj) {
        int i2 = this.f27134a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & rx5.m10483a(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM9304q = m9304q(i);
        long j2 = iM9304q & 1048575;
        switch ((iM9304q >>> 20) & 255) {
            case 0:
                if (Double.doubleToRawLongBits(rx5.f29719c.mo3731k(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(rx5.f29719c.mo3733m(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (rx5.m10484b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (rx5.m10484b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (rx5.m10483a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (rx5.m10484b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (rx5.m10483a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return rx5.f29719c.mo3743w(j2, obj);
            case 8:
                Object objM10485c = rx5.m10485c(j2, obj);
                if (objM10485c instanceof String) {
                    if (((String) objM10485c).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM10485c instanceof aj6)) {
                    ds3.m4665g();
                    return false;
                }
                if (aj6.f14569b.equals(objM10485c)) {
                    return false;
                }
                return true;
            case 9:
                if (rx5.m10485c(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (aj6.f14569b.equals(rx5.m10485c(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (rx5.m10483a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (rx5.m10483a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (rx5.m10483a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (rx5.m10484b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (rx5.m10483a(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (rx5.m10484b(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (rx5.m10485c(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                ds3.m4665g();
                return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9302m(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m9301l(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9303o(int i, int i2, Object obj) {
        return rx5.m10483a((long) (this.f27134a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: q */
    public final int m9304q(int i) {
        return this.f27134a[i + 1];
    }

    /* JADX INFO: renamed from: s */
    public final Object m9305s(Object obj, int i, Object obj2, gb5 gb5Var, Object obj3) {
        int i2 = this.f27134a[i];
        Object objM10485c = rx5.m10485c(m9304q(i) & 1048575, obj);
        if (objM10485c == null || m9308w(i) == null) {
            return obj2;
        }
        int i3 = i / 3;
        tt2 tt2Var = ((rt5) this.f27135b[i3 + i3]).f29618a;
        Iterator it = ((wt5) objM10485c).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!lp5.m8073a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    gb5Var.getClass();
                    obj2 = gb5.m5957k(obj3);
                }
                int iM10426a = rt5.m10426a(tt2Var, entry.getKey(), entry.getValue());
                qk6 qk6Var = aj6.f14569b;
                byte[] bArr = new byte[iM10426a];
                n83 n83Var = new n83(bArr, iM10426a, (byte) 4);
                try {
                    rt5.m10427b(n83Var, tt2Var, entry.getKey(), entry.getValue());
                    n83Var.m8596C();
                    ((ax5) obj2).m3362b((i2 << 3) | 2, new qk6(bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object m9306t(int i, Object obj) {
        zv5 zv5VarM9309x = m9309x(i);
        int iM9304q = m9304q(i) & 1048575;
        if (!m9301l(i, obj)) {
            return zv5VarM9309x.mo9297h();
        }
        Object object = f27133l.getObject(obj, iM9304q);
        if (m9284n(object)) {
            return object;
        }
        ur1 ur1VarMo9297h = zv5VarM9309x.mo9297h();
        if (object != null) {
            zv5VarM9309x.mo9291b(ur1VarMo9297h, object);
        }
        return ur1VarMo9297h;
    }

    /* JADX INFO: renamed from: u */
    public final Object m9307u(int i, int i2, Object obj) {
        zv5 zv5VarM9309x = m9309x(i2);
        if (!m9303o(i, i2, obj)) {
            return zv5VarM9309x.mo9297h();
        }
        Object object = f27133l.getObject(obj, m9304q(i2) & 1048575);
        if (m9284n(object)) {
            return object;
        }
        ur1 ur1VarMo9297h = zv5VarM9309x.mo9297h();
        if (object != null) {
            zv5VarM9309x.mo9291b(ur1VarMo9297h, object);
        }
        return ur1VarMo9297h;
    }

    /* JADX INFO: renamed from: w */
    public final lp5 m9308w(int i) {
        int i2 = i / 3;
        return (lp5) this.f27135b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: x */
    public final zv5 m9309x(int i) {
        Object[] objArr = this.f27135b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zv5 zv5Var = (zv5) objArr[i3];
        if (zv5Var != null) {
            return zv5Var;
        }
        zv5 zv5VarM11661a = uv5.f32208b.m11661a((Class) objArr[i3 + 1]);
        objArr[i3] = zv5VarM11661a;
        return zv5VarM11661a;
    }

    /* JADX INFO: renamed from: y */
    public final void m9310y(int i, Object obj, Object obj2) {
        if (m9301l(i, obj2)) {
            long jM9304q = m9304q(i) & 1048575;
            Unsafe unsafe = f27133l;
            Object object = unsafe.getObject(obj2, jM9304q);
            if (object == null) {
                qm5.m9914e(this.f27134a[i], obj2);
                return;
            }
            zv5 zv5VarM9309x = m9309x(i);
            if (!m9301l(i, obj)) {
                if (m9284n(object)) {
                    ur1 ur1VarMo9297h = zv5VarM9309x.mo9297h();
                    zv5VarM9309x.mo9291b(ur1VarMo9297h, object);
                    unsafe.putObject(obj, jM9304q, ur1VarMo9297h);
                } else {
                    unsafe.putObject(obj, jM9304q, object);
                }
                m9289B(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM9304q);
            if (!m9284n(object2)) {
                ur1 ur1VarMo9297h2 = zv5VarM9309x.mo9297h();
                zv5VarM9309x.mo9291b(ur1VarMo9297h2, object2);
                unsafe.putObject(obj, jM9304q, ur1VarMo9297h2);
                object2 = ur1VarMo9297h2;
            }
            zv5VarM9309x.mo9291b(object2, object);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9311z(int i, Object obj, Object obj2) {
        int[] iArr = this.f27134a;
        int i2 = iArr[i];
        if (m9303o(i2, i, obj2)) {
            long jM9304q = m9304q(i) & 1048575;
            Unsafe unsafe = f27133l;
            Object object = unsafe.getObject(obj2, jM9304q);
            if (object == null) {
                qm5.m9914e(iArr[i], obj2);
                return;
            }
            zv5 zv5VarM9309x = m9309x(i);
            if (!m9303o(i2, i, obj)) {
                if (m9284n(object)) {
                    ur1 ur1VarMo9297h = zv5VarM9309x.mo9297h();
                    zv5VarM9309x.mo9291b(ur1VarMo9297h, object);
                    unsafe.putObject(obj, jM9304q, ur1VarMo9297h);
                } else {
                    unsafe.putObject(obj, jM9304q, object);
                }
                m9299j(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM9304q);
            if (!m9284n(object2)) {
                ur1 ur1VarMo9297h2 = zv5VarM9309x.mo9297h();
                zv5VarM9309x.mo9291b(ur1VarMo9297h2, object2);
                unsafe.putObject(obj, jM9304q, ur1VarMo9297h2);
                object2 = ur1VarMo9297h2;
            }
            zv5VarM9309x.mo9291b(object2, object);
        }
    }
}
