package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra6 {

    /* JADX INFO: renamed from: a */
    public static final pj5 f29122a;

    static {
        int i = a46.f101a;
        f29122a = new pj5((byte) 27);
    }

    /* JADX INFO: renamed from: a */
    public static void m10259a(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof u66)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    n83Var.m8620x(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            n83Var.m8619w(i, 2);
            int iM8593B = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM8593B += n83.m8593B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            n83Var.m8621y(iM8593B);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                n83Var.m8621y((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        u66 u66Var = (u66) list;
        if (!z) {
            while (i2 < u66Var.f31686c) {
                int iM11265b = u66Var.m11265b(i2);
                n83Var.m8620x(i, (iM11265b >> 31) ^ (iM11265b + iM11265b));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iM8593B2 = 0;
        for (int i4 = 0; i4 < u66Var.f31686c; i4++) {
            int iM11265b2 = u66Var.m11265b(i4);
            iM8593B2 += n83.m8593B((iM11265b2 >> 31) ^ (iM11265b2 + iM11265b2));
        }
        n83Var.m8621y(iM8593B2);
        while (i2 < u66Var.f31686c) {
            int iM11265b3 = u66Var.m11265b(i2);
            n83Var.m8621y((iM11265b3 >> 31) ^ (iM11265b3 + iM11265b3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10260b(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof x86) {
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
        int iM8594D = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM8594D += n83.m8594D((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        n83Var.m8621y(iM8594D);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            n83Var.m8595A((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10261c(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof u66)) {
            if (!z) {
                while (i2 < list.size()) {
                    n83Var.m8620x(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            n83Var.m8619w(i, 2);
            int iM8593B = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8593B += n83.m8593B(((Integer) list.get(i3)).intValue());
            }
            n83Var.m8621y(iM8593B);
            while (i2 < list.size()) {
                n83Var.m8621y(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u66 u66Var = (u66) list;
        if (!z) {
            while (i2 < u66Var.f31686c) {
                n83Var.m8620x(i, u66Var.m11265b(i2));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iM8593B2 = 0;
        for (int i4 = 0; i4 < u66Var.f31686c; i4++) {
            iM8593B2 += n83.m8593B(u66Var.m11265b(i4));
        }
        n83Var.m8621y(iM8593B2);
        while (i2 < u66Var.f31686c) {
            n83Var.m8621y(u66Var.m11265b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10262d(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof x86) {
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
        int iM8594D = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM8594D += n83.m8594D(((Long) list.get(i3)).longValue());
        }
        n83Var.m8621y(iM8594D);
        while (i2 < list.size()) {
            n83Var.m8595A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10263e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m10264f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u66)) {
            int iM8594D = 0;
            while (i < size) {
                iM8594D += n83.m8594D(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8594D;
        }
        u66 u66Var = (u66) list;
        int iM8594D2 = 0;
        while (i < size) {
            iM8594D2 += n83.m8594D(u66Var.m11265b(i));
            i++;
        }
        return iM8594D2;
    }

    /* JADX INFO: renamed from: g */
    public static int m10265g(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n83.m8593B(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: h */
    public static int m10266h(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n83.m8593B(i << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m10267i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u66)) {
            int iM8594D = 0;
            while (i < size) {
                iM8594D += n83.m8594D(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8594D;
        }
        u66 u66Var = (u66) list;
        int iM8594D2 = 0;
        while (i < size) {
            iM8594D2 += n83.m8594D(u66Var.m11265b(i));
            i++;
        }
        return iM8594D2;
    }

    /* JADX INFO: renamed from: j */
    public static int m10268j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x86) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM8594D = 0;
        for (int i = 0; i < size; i++) {
            iM8594D += n83.m8594D(((Long) list.get(i)).longValue());
        }
        return iM8594D;
    }

    /* JADX INFO: renamed from: k */
    public static int m10269k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u66)) {
            int iM8593B = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM8593B += n83.m8593B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM8593B;
        }
        u66 u66Var = (u66) list;
        int iM8593B2 = 0;
        while (i < size) {
            int iM11265b = u66Var.m11265b(i);
            iM8593B2 += n83.m8593B((iM11265b >> 31) ^ (iM11265b + iM11265b));
            i++;
        }
        return iM8593B2;
    }

    /* JADX INFO: renamed from: l */
    public static int m10270l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x86) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM8594D = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM8594D += n83.m8594D((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM8594D;
    }

    /* JADX INFO: renamed from: m */
    public static int m10271m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u66)) {
            int iM8593B = 0;
            while (i < size) {
                iM8593B += n83.m8593B(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8593B;
        }
        u66 u66Var = (u66) list;
        int iM8593B2 = 0;
        while (i < size) {
            iM8593B2 += n83.m8593B(u66Var.m11265b(i));
            i++;
        }
        return iM8593B2;
    }

    /* JADX INFO: renamed from: n */
    public static int m10272n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x86) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM8594D = 0;
        for (int i = 0; i < size; i++) {
            iM8594D += n83.m8594D(((Long) list.get(i)).longValue());
        }
        return iM8594D;
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
    /* JADX INFO: renamed from: o */
    public static void m10273o(Object obj, Object obj2) {
        s66 s66Var = (s66) obj;
        mb6 mb6Var = s66Var.zzc;
        mb6 mb6Var2 = ((s66) obj2).zzc;
        mb6 mb6Var3 = mb6.f24801f;
        if (!mb6Var3.equals(mb6Var2)) {
            if (mb6Var3.equals(mb6Var)) {
                int i = mb6Var.f24802a + mb6Var2.f24802a;
                int[] iArrCopyOf = Arrays.copyOf(mb6Var.f24803b, i);
                System.arraycopy(mb6Var2.f24803b, 0, iArrCopyOf, mb6Var.f24802a, mb6Var2.f24802a);
                Object[] objArrCopyOf = Arrays.copyOf(mb6Var.f24804c, i);
                System.arraycopy(mb6Var2.f24804c, 0, objArrCopyOf, mb6Var.f24802a, mb6Var2.f24802a);
                mb6Var = new mb6(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                mb6Var.getClass();
                if (!mb6Var2.equals(mb6Var3)) {
                    if (!mb6Var.f24806e) {
                        xy4.m12791t();
                        return;
                    }
                    int i2 = mb6Var.f24802a + mb6Var2.f24802a;
                    mb6Var.m8271e(i2);
                    System.arraycopy(mb6Var2.f24803b, 0, mb6Var.f24803b, mb6Var.f24802a, mb6Var2.f24802a);
                    System.arraycopy(mb6Var2.f24804c, 0, mb6Var.f24804c, mb6Var.f24802a, mb6Var2.f24802a);
                    mb6Var.f24802a = i2;
                }
            }
        }
        s66Var.zzc = mb6Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m10274p(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof g46) {
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

    /* JADX INFO: renamed from: q */
    public static void m10275q(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof h56) {
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

    /* JADX INFO: renamed from: r */
    public static void m10276r(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof u66)) {
            if (!z) {
                while (i2 < list.size()) {
                    n83Var.m8616t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            n83Var.m8619w(i, 2);
            int iM8594D = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8594D += n83.m8594D(((Integer) list.get(i3)).intValue());
            }
            n83Var.m8621y(iM8594D);
            while (i2 < list.size()) {
                n83Var.m8617u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u66 u66Var = (u66) list;
        if (!z) {
            while (i2 < u66Var.f31686c) {
                n83Var.m8616t(i, u66Var.m11265b(i2));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iM8594D2 = 0;
        for (int i4 = 0; i4 < u66Var.f31686c; i4++) {
            iM8594D2 += n83.m8594D(u66Var.m11265b(i4));
        }
        n83Var.m8621y(iM8594D2);
        while (i2 < u66Var.f31686c) {
            n83Var.m8617u(u66Var.m11265b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m10277s(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof u66)) {
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
            return;
        }
        u66 u66Var = (u66) list;
        if (!z) {
            while (i2 < u66Var.f31686c) {
                n83Var.m8612p(i, u66Var.m11265b(i2));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u66Var.f31686c; i6++) {
            u66Var.m11265b(i6);
            i5 += 4;
        }
        n83Var.m8621y(i5);
        while (i2 < u66Var.f31686c) {
            n83Var.m8613q(u66Var.m11265b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m10278t(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof x86) {
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

    /* JADX INFO: renamed from: u */
    public static void m10279u(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof i66) {
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

    /* JADX INFO: renamed from: v */
    public static void m10280v(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof u66)) {
            if (!z) {
                while (i2 < list.size()) {
                    n83Var.m8616t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            n83Var.m8619w(i, 2);
            int iM8594D = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8594D += n83.m8594D(((Integer) list.get(i3)).intValue());
            }
            n83Var.m8621y(iM8594D);
            while (i2 < list.size()) {
                n83Var.m8617u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u66 u66Var = (u66) list;
        if (!z) {
            while (i2 < u66Var.f31686c) {
                n83Var.m8616t(i, u66Var.m11265b(i2));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int iM8594D2 = 0;
        for (int i4 = 0; i4 < u66Var.f31686c; i4++) {
            iM8594D2 += n83.m8594D(u66Var.m11265b(i4));
        }
        n83Var.m8621y(iM8594D2);
        while (i2 < u66Var.f31686c) {
            n83Var.m8617u(u66Var.m11265b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m10281w(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof x86) {
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
        int iM8594D = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM8594D += n83.m8594D(((Long) list.get(i3)).longValue());
        }
        n83Var.m8621y(iM8594D);
        while (i2 < list.size()) {
            n83Var.m8595A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m10282x(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof u66)) {
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
            return;
        }
        u66 u66Var = (u66) list;
        if (!z) {
            while (i2 < u66Var.f31686c) {
                n83Var.m8612p(i, u66Var.m11265b(i2));
                i2++;
            }
            return;
        }
        n83Var.m8619w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u66Var.f31686c; i6++) {
            u66Var.m11265b(i6);
            i5 += 4;
        }
        n83Var.m8621y(i5);
        while (i2 < u66Var.f31686c) {
            n83Var.m8613q(u66Var.m11265b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m10283y(int i, List list, rr5 rr5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        n83 n83Var = (n83) rr5Var.f29555b;
        if (list instanceof x86) {
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
}
