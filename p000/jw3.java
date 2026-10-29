package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jw3 {

    /* JADX INFO: renamed from: a */
    public static final Class f22700a;

    /* JADX INFO: renamed from: b */
    public static final pu4 f22701b;

    /* JADX INFO: renamed from: c */
    public static final pu4 f22702c;

    static {
        Class<?> cls;
        Class<?> cls2;
        ph3 ph3Var = ph3.f27607c;
        pu4 pu4Var = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f22700a = cls;
        try {
            ph3 ph3Var2 = ph3.f27607c;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                pu4Var = (pu4) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f22701b = pu4Var;
        f22702c = new pu4();
    }

    /* JADX INFO: renamed from: a */
    public static int m7303a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f52)) {
            int iM13061g = 0;
            while (i < size) {
                iM13061g += ya0.m13061g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13061g;
        }
        f52 f52Var = (f52) list;
        int iM13061g2 = 0;
        while (i < size) {
            iM13061g2 += ya0.m13061g(f52Var.m5561c(i));
            i++;
        }
        return iM13061g2;
    }

    /* JADX INFO: renamed from: b */
    public static int m7304b(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ya0.m13059e(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m7305c(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ya0.m13059e(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m7306d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f52)) {
            int iM13061g = 0;
            while (i < size) {
                iM13061g += ya0.m13061g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13061g;
        }
        f52 f52Var = (f52) list;
        int iM13061g2 = 0;
        while (i < size) {
            iM13061g2 += ya0.m13061g(f52Var.m5561c(i));
            i++;
        }
        return iM13061g2;
    }

    /* JADX INFO: renamed from: e */
    public static int m7307e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ao2)) {
            int iM13061g = 0;
            while (i < size) {
                iM13061g += ya0.m13061g(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13061g;
        }
        ao2 ao2Var = (ao2) list;
        int iM13061g2 = 0;
        while (i < size) {
            iM13061g2 += ya0.m13061g(ao2Var.m3099c(i));
            i++;
        }
        return iM13061g2;
    }

    /* JADX INFO: renamed from: f */
    public static int m7308f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f52)) {
            int iM13056b = 0;
            while (i < size) {
                iM13056b += ya0.m13056b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13056b;
        }
        f52 f52Var = (f52) list;
        int iM13056b2 = 0;
        while (i < size) {
            iM13056b2 += ya0.m13056b(f52Var.m5561c(i));
            i++;
        }
        return iM13056b2;
    }

    /* JADX INFO: renamed from: g */
    public static int m7309g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ao2)) {
            int iM13057c = 0;
            while (i < size) {
                iM13057c += ya0.m13057c(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13057c;
        }
        ao2 ao2Var = (ao2) list;
        int iM13057c2 = 0;
        while (i < size) {
            iM13057c2 += ya0.m13057c(ao2Var.m3099c(i));
            i++;
        }
        return iM13057c2;
    }

    /* JADX INFO: renamed from: h */
    public static int m7310h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f52)) {
            int iM13060f = 0;
            while (i < size) {
                iM13060f += ya0.m13060f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13060f;
        }
        f52 f52Var = (f52) list;
        int iM13060f2 = 0;
        while (i < size) {
            iM13060f2 += ya0.m13060f(f52Var.m5561c(i));
            i++;
        }
        return iM13060f2;
    }

    /* JADX INFO: renamed from: i */
    public static int m7311i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ao2)) {
            int iM13061g = 0;
            while (i < size) {
                iM13061g += ya0.m13061g(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13061g;
        }
        ao2 ao2Var = (ao2) list;
        int iM13061g2 = 0;
        while (i < size) {
            iM13061g2 += ya0.m13061g(ao2Var.m3099c(i));
            i++;
        }
        return iM13061g2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public static void m7313k(pu4 pu4Var, Object obj, Object obj2) {
        pu4Var.getClass();
        tr1 tr1Var = (tr1) obj;
        nu4 nu4Var = tr1Var.unknownFields;
        nu4 nu4Var2 = ((tr1) obj2).unknownFields;
        nu4 nu4Var3 = nu4.f26097f;
        if (!nu4Var3.equals(nu4Var2)) {
            if (nu4Var3.equals(nu4Var)) {
                int i = nu4Var.f26098a + nu4Var2.f26098a;
                int[] iArrCopyOf = Arrays.copyOf(nu4Var.f26099b, i);
                System.arraycopy(nu4Var2.f26099b, 0, iArrCopyOf, nu4Var.f26098a, nu4Var2.f26098a);
                Object[] objArrCopyOf = Arrays.copyOf(nu4Var.f26100c, i);
                System.arraycopy(nu4Var2.f26100c, 0, objArrCopyOf, nu4Var.f26098a, nu4Var2.f26098a);
                nu4Var = new nu4(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                nu4Var.getClass();
                if (!nu4Var2.equals(nu4Var3)) {
                    if (!nu4Var.f26102e) {
                        xy4.m12791t();
                        return;
                    }
                    int i2 = nu4Var.f26098a + nu4Var2.f26098a;
                    nu4Var.m8852a(i2);
                    System.arraycopy(nu4Var2.f26099b, 0, nu4Var.f26099b, nu4Var.f26098a, nu4Var2.f26098a);
                    System.arraycopy(nu4Var2.f26100c, 0, nu4Var.f26100c, nu4Var.f26098a, nu4Var2.f26098a);
                    nu4Var.f26098a = i2;
                }
            }
        }
        tr1Var.unknownFields = nu4Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7314l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m7315m(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof x00;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (z2) {
            if (z) {
                ya0Var.m13075u(i, 2);
                ya0Var.m13077w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                ya0Var.m13065k(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        ya0Var.m13077w(i3);
        while (i2 < list.size()) {
            ya0Var.m13064j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m7316n(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f11;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                    ya0Var.getClass();
                    ya0Var.m13069o(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            ya0Var.m13077w(i3);
            while (i2 < list.size()) {
                ya0Var.m13070p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        f11 f11Var = (f11) list;
        if (!z) {
            while (i2 < 0) {
                f11Var.m5444c(i2);
                double d = f11Var.f18648b[i2];
                ya0Var.getClass();
                ya0Var.m13069o(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            f11Var.m5444c(i6);
            double d2 = f11Var.f18648b[i6];
            i5 += 8;
        }
        ya0Var.m13077w(i5);
        while (i2 < 0) {
            f11Var.m5444c(i2);
            ya0Var.m13070p(Double.doubleToRawLongBits(f11Var.f18648b[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7317o(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f52;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13071q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13061g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13061g += ya0.m13061g(((Integer) list.get(i3)).intValue());
            }
            ya0Var.m13077w(iM13061g);
            while (i2 < list.size()) {
                ya0Var.m13072r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f52 f52Var = (f52) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13071q(i, f52Var.m5561c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13061g2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13061g2 += ya0.m13061g(f52Var.m5561c(i4));
        }
        ya0Var.m13077w(iM13061g2);
        while (i2 < 0) {
            ya0Var.m13072r(f52Var.m5561c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m7318p(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f52;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13067m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ya0Var.m13077w(i3);
            while (i2 < list.size()) {
                ya0Var.m13068n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f52 f52Var = (f52) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13067m(i, f52Var.m5561c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            f52Var.m5561c(i6);
            i5 += 4;
        }
        ya0Var.m13077w(i5);
        while (i2 < 0) {
            ya0Var.m13068n(f52Var.m5561c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m7319q(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ao2;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13069o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ya0Var.m13077w(i3);
            while (i2 < list.size()) {
                ya0Var.m13070p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ao2 ao2Var = (ao2) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13069o(i, ao2Var.m3099c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            ao2Var.m3099c(i6);
            i5 += 8;
        }
        ya0Var.m13077w(i5);
        while (i2 < 0) {
            ya0Var.m13070p(ao2Var.m3099c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m7320r(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof fi1;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    ya0Var.getClass();
                    ya0Var.m13067m(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            ya0Var.m13077w(i3);
            while (i2 < list.size()) {
                ya0Var.m13068n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        fi1 fi1Var = (fi1) list;
        if (!z) {
            while (i2 < 0) {
                fi1Var.m5714c(i2);
                float f = fi1Var.f19014b[i2];
                ya0Var.getClass();
                ya0Var.m13067m(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            fi1Var.m5714c(i6);
            float f2 = fi1Var.f19014b[i6];
            i5 += 4;
        }
        ya0Var.m13077w(i5);
        while (i2 < 0) {
            fi1Var.m5714c(i2);
            ya0Var.m13068n(Float.floatToRawIntBits(fi1Var.f19014b[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m7321s(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f52;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13071q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13061g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13061g += ya0.m13061g(((Integer) list.get(i3)).intValue());
            }
            ya0Var.m13077w(iM13061g);
            while (i2 < list.size()) {
                ya0Var.m13072r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f52 f52Var = (f52) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13071q(i, f52Var.m5561c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13061g2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13061g2 += ya0.m13061g(f52Var.m5561c(i4));
        }
        ya0Var.m13077w(iM13061g2);
        while (i2 < 0) {
            ya0Var.m13072r(f52Var.m5561c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m7322t(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ao2;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13078x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13061g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13061g += ya0.m13061g(((Long) list.get(i3)).longValue());
            }
            ya0Var.m13077w(iM13061g);
            while (i2 < list.size()) {
                ya0Var.m13079y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ao2 ao2Var = (ao2) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13078x(i, ao2Var.m3099c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13061g2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13061g2 += ya0.m13061g(ao2Var.m3099c(i4));
        }
        ya0Var.m13077w(iM13061g2);
        while (i2 < 0) {
            ya0Var.m13079y(ao2Var.m3099c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m7323u(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f52;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13067m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ya0Var.m13077w(i3);
            while (i2 < list.size()) {
                ya0Var.m13068n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f52 f52Var = (f52) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13067m(i, f52Var.m5561c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            f52Var.m5561c(i6);
            i5 += 4;
        }
        ya0Var.m13077w(i5);
        while (i2 < 0) {
            ya0Var.m13068n(f52Var.m5561c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m7324v(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ao2;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13069o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ya0Var.m13077w(i3);
            while (i2 < list.size()) {
                ya0Var.m13070p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ao2 ao2Var = (ao2) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13069o(i, ao2Var.m3099c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            ao2Var.m3099c(i6);
            i5 += 8;
        }
        ya0Var.m13077w(i5);
        while (i2 < 0) {
            ya0Var.m13070p(ao2Var.m3099c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m7325w(int i, List list, ar3 ar3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f52;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ya0Var.m13076v(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13056b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13056b += ya0.m13056b(((Integer) list.get(i3)).intValue());
            }
            ya0Var.m13077w(iM13056b);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                ya0Var.m13077w((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        f52 f52Var = (f52) list;
        if (!z) {
            while (i2 < 0) {
                int iM5561c = f52Var.m5561c(i2);
                ya0Var.m13076v(i, (iM5561c >> 31) ^ (iM5561c << 1));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13056b2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13056b2 += ya0.m13056b(f52Var.m5561c(i4));
        }
        ya0Var.m13077w(iM13056b2);
        while (i2 < 0) {
            int iM5561c2 = f52Var.m5561c(i2);
            ya0Var.m13077w((iM5561c2 >> 31) ^ (iM5561c2 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m7326x(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ao2;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ya0Var.m13078x(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13057c = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13057c += ya0.m13057c(((Long) list.get(i3)).longValue());
            }
            ya0Var.m13077w(iM13057c);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                ya0Var.m13079y((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        ao2 ao2Var = (ao2) list;
        if (!z) {
            while (i2 < 0) {
                long jM3099c = ao2Var.m3099c(i2);
                ya0Var.m13078x(i, (jM3099c >> 63) ^ (jM3099c << 1));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13057c2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13057c2 += ya0.m13057c(ao2Var.m3099c(i4));
        }
        ya0Var.m13077w(iM13057c2);
        while (i2 < 0) {
            long jM3099c2 = ao2Var.m3099c(i2);
            ya0Var.m13079y((jM3099c2 >> 63) ^ (jM3099c2 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m7327y(int i, List list, ar3 ar3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f52;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13076v(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13060f = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13060f += ya0.m13060f(((Integer) list.get(i3)).intValue());
            }
            ya0Var.m13077w(iM13060f);
            while (i2 < list.size()) {
                ya0Var.m13077w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f52 f52Var = (f52) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13076v(i, f52Var.m5561c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13060f2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13060f2 += ya0.m13060f(f52Var.m5561c(i4));
        }
        ya0Var.m13077w(iM13060f2);
        while (i2 < 0) {
            ya0Var.m13077w(f52Var.m5561c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m7328z(int i, List list, ar3 ar3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ao2;
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ya0Var.m13078x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ya0Var.m13075u(i, 2);
            int iM13061g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM13061g += ya0.m13061g(((Long) list.get(i3)).longValue());
            }
            ya0Var.m13077w(iM13061g);
            while (i2 < list.size()) {
                ya0Var.m13079y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ao2 ao2Var = (ao2) list;
        if (!z) {
            while (i2 < 0) {
                ya0Var.m13078x(i, ao2Var.m3099c(i2));
                i2++;
            }
            return;
        }
        ya0Var.m13075u(i, 2);
        int iM13061g2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM13061g2 += ya0.m13061g(ao2Var.m3099c(i4));
        }
        ya0Var.m13077w(iM13061g2);
        while (i2 < 0) {
            ya0Var.m13079y(ao2Var.m3099c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m7312j(Object obj, int i, i62 i62Var, Object obj2, pu4 pu4Var) {
        return obj2;
    }
}
