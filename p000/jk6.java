package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jk6 {

    /* JADX INFO: renamed from: a */
    public static final yj5 f22377a;

    static {
        bk6 bk6Var = bk6.f15375c;
        f22377a = new yj5((byte) 28);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7138a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    /* JADX INFO: renamed from: b */
    public static void m7139b(Object obj, Object obj2) {
        zh6 zh6Var = (zh6) obj;
        el6 el6Var = zh6Var.zzc;
        el6 el6Var2 = ((zh6) obj2).zzc;
        el6 el6Var3 = el6.f18242f;
        if (!el6Var3.equals(el6Var2)) {
            if (el6Var3.equals(el6Var)) {
                int i = el6Var.f18243a + el6Var2.f18243a;
                int[] iArrCopyOf = Arrays.copyOf(el6Var.f18244b, i);
                System.arraycopy(el6Var2.f18244b, 0, iArrCopyOf, el6Var.f18243a, el6Var2.f18243a);
                Object[] objArrCopyOf = Arrays.copyOf(el6Var.f18245c, i);
                System.arraycopy(el6Var2.f18245c, 0, objArrCopyOf, el6Var.f18243a, el6Var2.f18243a);
                el6Var = new el6(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                el6Var.getClass();
                if (!el6Var2.equals(el6Var3)) {
                    if (!el6Var.f18247e) {
                        xy4.m12791t();
                        return;
                    }
                    int i2 = el6Var.f18243a + el6Var2.f18243a;
                    el6Var.m5197e(i2);
                    System.arraycopy(el6Var2.f18244b, 0, el6Var.f18244b, el6Var.f18243a, el6Var2.f18243a);
                    System.arraycopy(el6Var2.f18245c, 0, el6Var.f18245c, el6Var.f18243a, el6Var2.f18243a);
                    el6Var.f18243a = i2;
                }
            }
        }
        zh6Var.zzc = el6Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m7140c(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        if (list instanceof xg6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ng6Var.m8719h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        ng6Var.m8724m(i3);
        while (i2 < list.size()) {
            ng6Var.m8727p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7141d(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        if (list instanceof mh6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ng6Var.m8717f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        ng6Var.m8724m(i3);
        while (i2 < list.size()) {
            ng6Var.m8725n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7142e(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof yi6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8718g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8711a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8711a += ng6.m8711a(((Long) list.get(i3)).longValue());
            }
            ng6Var.m8724m(iM8711a);
            while (i2 < list.size()) {
                ng6Var.m8726o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yi6 yi6Var = (yi6) list;
        if (!z) {
            while (i2 < yi6Var.f35250c) {
                ng6Var.m8718g(i, yi6Var.m13141b(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8711a2 = 0;
        for (int i4 = 0; i4 < yi6Var.f35250c; i4++) {
            iM8711a2 += ng6.m8711a(yi6Var.m13141b(i4));
        }
        ng6Var.m8724m(iM8711a2);
        while (i2 < yi6Var.f35250c) {
            ng6Var.m8726o(yi6Var.m13141b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7143f(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof yi6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8718g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8711a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8711a += ng6.m8711a(((Long) list.get(i3)).longValue());
            }
            ng6Var.m8724m(iM8711a);
            while (i2 < list.size()) {
                ng6Var.m8726o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yi6 yi6Var = (yi6) list;
        if (!z) {
            while (i2 < yi6Var.f35250c) {
                ng6Var.m8718g(i, yi6Var.m13141b(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8711a2 = 0;
        for (int i4 = 0; i4 < yi6Var.f35250c; i4++) {
            iM8711a2 += ng6.m8711a(yi6Var.m13141b(i4));
        }
        ng6Var.m8724m(iM8711a2);
        while (i2 < yi6Var.f35250c) {
            ng6Var.m8726o(yi6Var.m13141b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7144g(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof yi6)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ng6Var.m8718g(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8711a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM8711a += ng6.m8711a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            ng6Var.m8724m(iM8711a);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                ng6Var.m8726o((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        yi6 yi6Var = (yi6) list;
        if (!z) {
            while (i2 < yi6Var.f35250c) {
                long jM13141b = yi6Var.m13141b(i2);
                ng6Var.m8718g(i, (jM13141b >> 63) ^ (jM13141b + jM13141b));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8711a2 = 0;
        for (int i4 = 0; i4 < yi6Var.f35250c; i4++) {
            long jM13141b2 = yi6Var.m13141b(i4);
            iM8711a2 += ng6.m8711a((jM13141b2 >> 63) ^ (jM13141b2 + jM13141b2));
        }
        ng6Var.m8724m(iM8711a2);
        while (i2 < yi6Var.f35250c) {
            long jM13141b3 = yi6Var.m13141b(i2);
            ng6Var.m8726o((jM13141b3 >> 63) ^ (jM13141b3 + jM13141b3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m7145h(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof yi6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8719h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ng6Var.m8724m(i3);
            while (i2 < list.size()) {
                ng6Var.m8727p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yi6 yi6Var = (yi6) list;
        if (!z) {
            while (i2 < yi6Var.f35250c) {
                ng6Var.m8719h(i, yi6Var.m13141b(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < yi6Var.f35250c; i6++) {
            yi6Var.m13141b(i6);
            i5 += 8;
        }
        ng6Var.m8724m(i5);
        while (i2 < yi6Var.f35250c) {
            ng6Var.m8727p(yi6Var.m13141b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7146i(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof yi6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8719h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ng6Var.m8724m(i3);
            while (i2 < list.size()) {
                ng6Var.m8727p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yi6 yi6Var = (yi6) list;
        if (!z) {
            while (i2 < yi6Var.f35250c) {
                ng6Var.m8719h(i, yi6Var.m13141b(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < yi6Var.f35250c; i6++) {
            yi6Var.m13141b(i6);
            i5 += 8;
        }
        ng6Var.m8724m(i5);
        while (i2 < yi6Var.f35250c) {
            ng6Var.m8727p(yi6Var.m13141b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m7147j(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof ci6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8715d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8711a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8711a += ng6.m8711a(((Integer) list.get(i3)).intValue());
            }
            ng6Var.m8724m(iM8711a);
            while (i2 < list.size()) {
                ng6Var.m8723l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ci6 ci6Var = (ci6) list;
        if (!z) {
            while (i2 < ci6Var.f16055c) {
                ng6Var.m8715d(i, ci6Var.m4029c(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8711a2 = 0;
        for (int i4 = 0; i4 < ci6Var.f16055c; i4++) {
            iM8711a2 += ng6.m8711a(ci6Var.m4029c(i4));
        }
        ng6Var.m8724m(iM8711a2);
        while (i2 < ci6Var.f16055c) {
            ng6Var.m8723l(ci6Var.m4029c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m7148k(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof ci6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8716e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8713s = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8713s += ng6.m8713s(((Integer) list.get(i3)).intValue());
            }
            ng6Var.m8724m(iM8713s);
            while (i2 < list.size()) {
                ng6Var.m8724m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ci6 ci6Var = (ci6) list;
        if (!z) {
            while (i2 < ci6Var.f16055c) {
                ng6Var.m8716e(i, ci6Var.m4029c(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8713s2 = 0;
        for (int i4 = 0; i4 < ci6Var.f16055c; i4++) {
            iM8713s2 += ng6.m8713s(ci6Var.m4029c(i4));
        }
        ng6Var.m8724m(iM8713s2);
        while (i2 < ci6Var.f16055c) {
            ng6Var.m8724m(ci6Var.m4029c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m7149l(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof ci6)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ng6Var.m8716e(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8713s = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM8713s += ng6.m8713s((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            ng6Var.m8724m(iM8713s);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                ng6Var.m8724m((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        ci6 ci6Var = (ci6) list;
        if (!z) {
            while (i2 < ci6Var.f16055c) {
                int iM4029c = ci6Var.m4029c(i2);
                ng6Var.m8716e(i, (iM4029c >> 31) ^ (iM4029c + iM4029c));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8713s2 = 0;
        for (int i4 = 0; i4 < ci6Var.f16055c; i4++) {
            int iM4029c2 = ci6Var.m4029c(i4);
            iM8713s2 += ng6.m8713s((iM4029c2 >> 31) ^ (iM4029c2 + iM4029c2));
        }
        ng6Var.m8724m(iM8713s2);
        while (i2 < ci6Var.f16055c) {
            int iM4029c3 = ci6Var.m4029c(i2);
            ng6Var.m8724m((iM4029c3 >> 31) ^ (iM4029c3 + iM4029c3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m7150m(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof ci6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8717f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ng6Var.m8724m(i3);
            while (i2 < list.size()) {
                ng6Var.m8725n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ci6 ci6Var = (ci6) list;
        if (!z) {
            while (i2 < ci6Var.f16055c) {
                ng6Var.m8717f(i, ci6Var.m4029c(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ci6Var.f16055c; i6++) {
            ci6Var.m4029c(i6);
            i5 += 4;
        }
        ng6Var.m8724m(i5);
        while (i2 < ci6Var.f16055c) {
            ng6Var.m8725n(ci6Var.m4029c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m7151n(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof ci6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8717f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ng6Var.m8724m(i3);
            while (i2 < list.size()) {
                ng6Var.m8725n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ci6 ci6Var = (ci6) list;
        if (!z) {
            while (i2 < ci6Var.f16055c) {
                ng6Var.m8717f(i, ci6Var.m4029c(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ci6Var.f16055c; i6++) {
            ci6Var.m4029c(i6);
            i5 += 4;
        }
        ng6Var.m8724m(i5);
        while (i2 < ci6Var.f16055c) {
            ng6Var.m8725n(ci6Var.m4029c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7152o(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        int i2 = 0;
        if (!(list instanceof ci6)) {
            if (!z) {
                while (i2 < list.size()) {
                    ng6Var.m8715d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ng6Var.m8714c(i, 2);
            int iM8711a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8711a += ng6.m8711a(((Integer) list.get(i3)).intValue());
            }
            ng6Var.m8724m(iM8711a);
            while (i2 < list.size()) {
                ng6Var.m8723l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ci6 ci6Var = (ci6) list;
        if (!z) {
            while (i2 < ci6Var.f16055c) {
                ng6Var.m8715d(i, ci6Var.m4029c(i2));
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int iM8711a2 = 0;
        for (int i4 = 0; i4 < ci6Var.f16055c; i4++) {
            iM8711a2 += ng6.m8711a(ci6Var.m4029c(i4));
        }
        ng6Var.m8724m(iM8711a2);
        while (i2 < ci6Var.f16055c) {
            ng6Var.m8723l(ci6Var.m4029c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m7153p(int i, List list, bt5 bt5Var, boolean z) throws za0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        ng6 ng6Var = (ng6) bt5Var.f15596b;
        if (list instanceof pf6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                ng6Var.m8724m(i << 3);
                ng6Var.m8722k(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        ng6Var.m8714c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        ng6Var.m8724m(i3);
        while (i2 < list.size()) {
            ng6Var.m8722k(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m7154q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yi6)) {
            int iM8711a = 0;
            while (i < size) {
                iM8711a += ng6.m8711a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM8711a;
        }
        yi6 yi6Var = (yi6) list;
        int iM8711a2 = 0;
        while (i < size) {
            iM8711a2 += ng6.m8711a(yi6Var.m13141b(i));
            i++;
        }
        return iM8711a2;
    }

    /* JADX INFO: renamed from: r */
    public static int m7155r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yi6)) {
            int iM8711a = 0;
            while (i < size) {
                iM8711a += ng6.m8711a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM8711a;
        }
        yi6 yi6Var = (yi6) list;
        int iM8711a2 = 0;
        while (i < size) {
            iM8711a2 += ng6.m8711a(yi6Var.m13141b(i));
            i++;
        }
        return iM8711a2;
    }

    /* JADX INFO: renamed from: s */
    public static int m7156s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yi6)) {
            int iM8711a = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM8711a += ng6.m8711a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM8711a;
        }
        yi6 yi6Var = (yi6) list;
        int iM8711a2 = 0;
        while (i < size) {
            long jM13141b = yi6Var.m13141b(i);
            iM8711a2 += ng6.m8711a((jM13141b >> 63) ^ (jM13141b + jM13141b));
            i++;
        }
        return iM8711a2;
    }

    /* JADX INFO: renamed from: t */
    public static int m7157t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ci6)) {
            int iM8711a = 0;
            while (i < size) {
                iM8711a += ng6.m8711a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8711a;
        }
        ci6 ci6Var = (ci6) list;
        int iM8711a2 = 0;
        while (i < size) {
            iM8711a2 += ng6.m8711a(ci6Var.m4029c(i));
            i++;
        }
        return iM8711a2;
    }

    /* JADX INFO: renamed from: u */
    public static int m7158u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ci6)) {
            int iM8711a = 0;
            while (i < size) {
                iM8711a += ng6.m8711a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8711a;
        }
        ci6 ci6Var = (ci6) list;
        int iM8711a2 = 0;
        while (i < size) {
            iM8711a2 += ng6.m8711a(ci6Var.m4029c(i));
            i++;
        }
        return iM8711a2;
    }

    /* JADX INFO: renamed from: v */
    public static int m7159v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ci6)) {
            int iM8713s = 0;
            while (i < size) {
                iM8713s += ng6.m8713s(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8713s;
        }
        ci6 ci6Var = (ci6) list;
        int iM8713s2 = 0;
        while (i < size) {
            iM8713s2 += ng6.m8713s(ci6Var.m4029c(i));
            i++;
        }
        return iM8713s2;
    }

    /* JADX INFO: renamed from: w */
    public static int m7160w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ci6)) {
            int iM8713s = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM8713s += ng6.m8713s((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM8713s;
        }
        ci6 ci6Var = (ci6) list;
        int iM8713s2 = 0;
        while (i < size) {
            int iM4029c = ci6Var.m4029c(i);
            iM8713s2 += ng6.m8713s((iM4029c >> 31) ^ (iM4029c + iM4029c));
            i++;
        }
        return iM8713s2;
    }

    /* JADX INFO: renamed from: x */
    public static int m7161x(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ng6.m8713s(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: y */
    public static int m7162y(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ng6.m8713s(i << 3) + 8) * size;
    }
}
