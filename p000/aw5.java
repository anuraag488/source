package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class aw5 {

    /* JADX INFO: renamed from: a */
    public static final Class f14921a;

    /* JADX INFO: renamed from: b */
    public static final gb5 f14922b;

    static {
        Class<?> cls;
        Class cls2 = o36.f26319a;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f14921a = cls;
        f14922b = new gb5();
    }

    /* JADX INFO: renamed from: A */
    public static void m3329A(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yq5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                n83Var.m8621y(i << 3);
                n83Var.m8617u(iIntValue);
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
        }
        n83Var.m8621y(iNumberOfLeadingZeros);
        while (i2 < list.size()) {
            n83Var.m8617u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m3330B(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof mt5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8622z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
        }
        n83Var.m8621y(iNumberOfLeadingZeros);
        while (i2 < list.size()) {
            n83Var.m8595A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m3331C(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yq5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8612p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8613q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3332a(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof mt5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8614r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8615s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3333b(int i, List list, wd3 wd3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yq5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                n83Var.m8620x(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iM3875g = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM3875g += c75.m3875g((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2), 9, 352) >>> 6;
        }
        n83Var.m8621y(iM3875g);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            n83Var.m8621y((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3334c(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof mt5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                n83Var.m8622z(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2)) * 9)) >>> 6;
        }
        n83Var.m8621y(iNumberOfLeadingZeros);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            n83Var.m8595A((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3335d(int i, List list, wd3 wd3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yq5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8620x(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
        }
        n83Var.m8621y(iNumberOfLeadingZeros);
        while (i2 < list.size()) {
            n83Var.m8621y(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3336e(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof mt5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8622z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
        }
        n83Var.m8621y(iNumberOfLeadingZeros);
        while (i2 < list.size()) {
            n83Var.m8595A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3337f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static int m3338g(int i, iv5 iv5Var, zv5 zv5Var) {
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        return iNumberOfLeadingZeros + iNumberOfLeadingZeros + iv5Var.mo6948b(zv5Var);
    }

    /* JADX INFO: renamed from: h */
    public static int m3339h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof yq5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iNumberOfLeadingZeros = 0;
        for (int i = 0; i < size; i++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
        }
        return iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: i */
    public static int m3340i(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ((c75.m3875g(i << 3, 9, 352) >>> 6) + 4) * size;
    }

    /* JADX INFO: renamed from: j */
    public static int m3341j(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ((c75.m3875g(i << 3, 9, 352) >>> 6) + 8) * size;
    }

    /* JADX INFO: renamed from: k */
    public static int m3342k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof yq5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iNumberOfLeadingZeros = 0;
        for (int i = 0; i < size; i++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
        }
        return iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: l */
    public static int m3343l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof mt5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iNumberOfLeadingZeros = 0;
        for (int i = 0; i < size; i++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
        }
        return iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: m */
    public static int m3344m(int i, Object obj, zv5 zv5Var) {
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i << 3) * 9;
        int iMo6948b = ((iv5) obj).mo6948b(zv5Var);
        return ((352 - iNumberOfLeadingZeros) >>> 6) + (c75.m3875g(iMo6948b, 9, 352) >>> 6) + iMo6948b;
    }

    /* JADX INFO: renamed from: n */
    public static int m3345n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof yq5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM3875g = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM3875g += c75.m3875g((iIntValue >> 31) ^ (iIntValue + iIntValue), 9, 352) >>> 6;
        }
        return iM3875g;
    }

    /* JADX INFO: renamed from: o */
    public static int m3346o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof mt5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iNumberOfLeadingZeros = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue >> 63) ^ (jLongValue + jLongValue)) * 9)) >>> 6;
        }
        return iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: p */
    public static int m3347p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof yq5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iNumberOfLeadingZeros = 0;
        for (int i = 0; i < size; i++) {
            iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
        }
        return iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: q */
    public static int m3348q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof mt5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iNumberOfLeadingZeros = 0;
        for (int i = 0; i < size; i++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
        }
        return iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: r */
    public static Object m3349r(Object obj, int i, gr5 gr5Var, lp5 lp5Var, Object obj2, gb5 gb5Var) {
        if (lp5Var == null) {
            return obj2;
        }
        int size = gr5Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) gr5Var.get(i3);
            int iIntValue = num.intValue();
            if (lp5.m8073a(iIntValue)) {
                if (i3 != i2) {
                    gr5Var.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m3350s(obj, i, iIntValue, obj2, gb5Var);
            }
        }
        if (i2 != size) {
            gr5Var.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: s */
    public static Object m3350s(Object obj, int i, int i2, Object obj2, gb5 gb5Var) {
        if (obj2 == null) {
            gb5Var.getClass();
            obj2 = gb5.m5957k(obj);
        }
        gb5Var.getClass();
        ((ax5) obj2).m3362b(i << 3, Long.valueOf(i2));
        return obj2;
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
    /* JADX INFO: renamed from: t */
    public static void m3351t(Object obj, Object obj2) {
        ur1 ur1Var = (ur1) obj;
        ax5 ax5Var = ur1Var.unknownFields;
        ax5 ax5Var2 = ((ur1) obj2).unknownFields;
        ax5 ax5Var3 = ax5.f14932f;
        if (!ax5Var3.equals(ax5Var2)) {
            if (ax5Var3.equals(ax5Var)) {
                int i = ax5Var.f14933a + ax5Var2.f14933a;
                int[] iArrCopyOf = Arrays.copyOf(ax5Var.f14934b, i);
                System.arraycopy(ax5Var2.f14934b, 0, iArrCopyOf, ax5Var.f14933a, ax5Var2.f14933a);
                Object[] objArrCopyOf = Arrays.copyOf(ax5Var.f14935c, i);
                System.arraycopy(ax5Var2.f14935c, 0, objArrCopyOf, ax5Var.f14933a, ax5Var2.f14933a);
                ax5Var = new ax5(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ax5Var.getClass();
                if (!ax5Var2.equals(ax5Var3)) {
                    if (!ax5Var.f14937e) {
                        xy4.m12791t();
                        return;
                    }
                    int i2 = ax5Var.f14933a + ax5Var2.f14933a;
                    ax5Var.m3364d(i2);
                    System.arraycopy(ax5Var2.f14934b, 0, ax5Var.f14934b, ax5Var.f14933a, ax5Var2.f14933a);
                    System.arraycopy(ax5Var2.f14935c, 0, ax5Var.f14935c, ax5Var.f14933a, ax5Var2.f14933a);
                    ax5Var.f14933a = i2;
                }
            }
        }
        ur1Var.unknownFields = ax5Var;
    }

    /* JADX INFO: renamed from: u */
    public static void m3352u(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof k56) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                n83Var.m8621y(i << 3);
                n83Var.m8608l(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8608l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m3353v(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof on5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8614r(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8615s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m3354w(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yq5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                n83Var.m8621y(i << 3);
                n83Var.m8617u(iIntValue);
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
        }
        n83Var.m8621y(iNumberOfLeadingZeros);
        while (i2 < list.size()) {
            n83Var.m8617u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m3355x(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yq5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8612p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8613q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m3356y(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof mt5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8614r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8615s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m3357z(int i, List list, wd3 wd3Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) wd3Var.f33259b;
        if (list instanceof yp5) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                n83Var.m8612p(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        n83Var.m8621y(i3);
        while (i2 < list.size()) {
            n83Var.m8613q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }
}
