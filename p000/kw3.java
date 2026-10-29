package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kw3 {

    /* JADX INFO: renamed from: a */
    public static final Class f23562a;

    /* JADX INFO: renamed from: b */
    public static final ia5 f23563b;

    static {
        Class<?> cls;
        Class cls2 = AbstractC1176tb.f31045a;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f23562a = cls;
        f23563b = new ia5((byte) 15);
    }

    /* JADX INFO: renamed from: a */
    public static int m7643a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g52) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM10754j = 0;
        for (int i = 0; i < size; i++) {
            iM10754j += C1145sh.m10754j(((Integer) list.get(i)).intValue());
        }
        return iM10754j;
    }

    /* JADX INFO: renamed from: b */
    public static int m7644b(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1145sh.m10752h(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m7645c(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1145sh.m10752h(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m7646d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g52) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM10754j = 0;
        for (int i = 0; i < size; i++) {
            iM10754j += C1145sh.m10754j(((Integer) list.get(i)).intValue());
        }
        return iM10754j;
    }

    /* JADX INFO: renamed from: e */
    public static int m7647e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bo2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM10754j = 0;
        for (int i = 0; i < size; i++) {
            iM10754j += C1145sh.m10754j(((Long) list.get(i)).longValue());
        }
        return iM10754j;
    }

    /* JADX INFO: renamed from: f */
    public static int m7648f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof g52)) {
                int iM10753i = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iM10753i += C1145sh.m10753i((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iM10753i;
            }
            c75.m3884p(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m7649g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof bo2)) {
                int iM10754j = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iM10754j += C1145sh.m10754j((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iM10754j;
            }
            c75.m3884p(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m7650h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g52) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM10753i = 0;
        for (int i = 0; i < size; i++) {
            iM10753i += C1145sh.m10753i(((Integer) list.get(i)).intValue());
        }
        return iM10753i;
    }

    /* JADX INFO: renamed from: i */
    public static int m7651i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bo2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM10754j = 0;
        for (int i = 0; i < size; i++) {
            iM10754j += C1145sh.m10754j(((Long) list.get(i)).longValue());
        }
        return iM10754j;
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
    public static void m7653k(ia5 ia5Var, Object obj, Object obj2) {
        ia5Var.getClass();
        vr1 vr1Var = (vr1) obj;
        ou4 ou4Var = vr1Var.unknownFields;
        ou4 ou4Var2 = ((vr1) obj2).unknownFields;
        ou4 ou4Var3 = ou4.f27126f;
        if (!ou4Var3.equals(ou4Var2)) {
            if (ou4Var3.equals(ou4Var)) {
                int i = ou4Var.f27127a + ou4Var2.f27127a;
                int[] iArrCopyOf = Arrays.copyOf(ou4Var.f27128b, i);
                System.arraycopy(ou4Var2.f27128b, 0, iArrCopyOf, ou4Var.f27127a, ou4Var2.f27127a);
                Object[] objArrCopyOf = Arrays.copyOf(ou4Var.f27129c, i);
                System.arraycopy(ou4Var2.f27129c, 0, objArrCopyOf, ou4Var.f27127a, ou4Var2.f27127a);
                ou4Var = new ou4(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ou4Var.getClass();
                if (!ou4Var2.equals(ou4Var3)) {
                    if (!ou4Var.f27131e) {
                        xy4.m12791t();
                        return;
                    }
                    int i2 = ou4Var.f27127a + ou4Var2.f27127a;
                    ou4Var.m9280a(i2);
                    System.arraycopy(ou4Var2.f27128b, 0, ou4Var.f27128b, ou4Var.f27127a, ou4Var2.f27127a);
                    System.arraycopy(ou4Var2.f27129c, 0, ou4Var.f27129c, ou4Var.f27127a, ou4Var2.f27127a);
                    ou4Var.f27127a = i2;
                }
            }
        }
        vr1Var.unknownFields = ou4Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7654l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m7655m(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof y00) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10778s(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10776q(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m7656n(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g11) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c1145sh.getClass();
                c1145sh.m10783x(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10784y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7657o(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g52) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10785z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10754j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM10754j += C1145sh.m10754j(((Integer) list.get(i3)).intValue());
        }
        c1145sh.m10761G(iM10754j);
        while (i2 < list.size()) {
            c1145sh.m10755A(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m7658p(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g52) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10781v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10782w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m7659q(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof bo2) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10783x(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10784y(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m7660r(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof gi1) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c1145sh.getClass();
                c1145sh.m10781v(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10782w(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m7661s(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g52) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10785z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10754j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM10754j += C1145sh.m10754j(((Integer) list.get(i3)).intValue());
        }
        c1145sh.m10761G(iM10754j);
        while (i2 < list.size()) {
            c1145sh.m10755A(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m7662t(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof bo2) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10762H(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10754j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM10754j += C1145sh.m10754j(((Long) list.get(i3)).longValue());
        }
        c1145sh.m10761G(iM10754j);
        while (i2 < list.size()) {
            c1145sh.m10763I(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m7663u(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g52) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10781v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10782w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m7664v(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof bo2) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10783x(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c1145sh.m10761G(i3);
        while (i2 < list.size()) {
            c1145sh.m10784y(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m7665w(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g52) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1145sh.m10760F(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10753i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM10753i += C1145sh.m10753i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1145sh.m10761G(iM10753i);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c1145sh.m10761G((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m7666x(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof bo2) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1145sh.m10762H(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10754j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM10754j += C1145sh.m10754j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1145sh.m10761G(iM10754j);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c1145sh.m10763I((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m7667y(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof g52) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10760F(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10753i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM10753i += C1145sh.m10753i(((Integer) list.get(i3)).intValue());
        }
        c1145sh.m10761G(iM10753i);
        while (i2 < list.size()) {
            c1145sh.m10761G(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m7668z(int i, List list, js1 js1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (list instanceof bo2) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1145sh.m10762H(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1145sh.m10759E(i, 2);
        int iM10754j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM10754j += C1145sh.m10754j(((Long) list.get(i3)).longValue());
        }
        c1145sh.m10761G(iM10754j);
        while (i2 < list.size()) {
            c1145sh.m10763I(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m7652j(Object obj, int i, j62 j62Var, Object obj2, ia5 ia5Var) {
        return obj2;
    }
}
