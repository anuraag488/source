package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lq6 {

    /* JADX INFO: renamed from: a */
    public static final aj5 f24292a;

    static {
        int i = lm6.f24186a;
        f24292a = new aj5((byte) 29);
    }

    /* JADX INFO: renamed from: a */
    public static void m8074a(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof lo6)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    in6Var.m6844x(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            in6Var.m6843w(i, 2);
            int iM6825g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM6825g += in6.m6825g((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            in6Var.m6845y(iM6825g);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                in6Var.m6845y((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        lo6 lo6Var = (lo6) list;
        if (!z) {
            while (i2 < lo6Var.f24241c) {
                int iM8065b = lo6Var.m8065b(i2);
                in6Var.m6844x(i, (iM8065b >> 31) ^ (iM8065b + iM8065b));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6825g2 = 0;
        for (int i4 = 0; i4 < lo6Var.f24241c; i4++) {
            int iM8065b2 = lo6Var.m8065b(i4);
            iM6825g2 += in6.m6825g((iM8065b2 >> 31) ^ (iM8065b2 + iM8065b2));
        }
        in6Var.m6845y(iM6825g2);
        while (i2 < lo6Var.f24241c) {
            int iM8065b3 = lo6Var.m8065b(i2);
            in6Var.m6845y((iM8065b3 >> 31) ^ (iM8065b3 + iM8065b3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8075b(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof lp6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                in6Var.m6846z(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6826h = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM6826h += in6.m6826h((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        in6Var.m6845y(iM6826h);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            in6Var.m6827A((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8076c(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof lo6)) {
            if (!z) {
                while (i2 < list.size()) {
                    in6Var.m6844x(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            in6Var.m6843w(i, 2);
            int iM6825g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM6825g += in6.m6825g(((Integer) list.get(i3)).intValue());
            }
            in6Var.m6845y(iM6825g);
            while (i2 < list.size()) {
                in6Var.m6845y(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lo6 lo6Var = (lo6) list;
        if (!z) {
            while (i2 < lo6Var.f24241c) {
                in6Var.m6844x(i, lo6Var.m8065b(i2));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6825g2 = 0;
        for (int i4 = 0; i4 < lo6Var.f24241c; i4++) {
            iM6825g2 += in6.m6825g(lo6Var.m8065b(i4));
        }
        in6Var.m6845y(iM6825g2);
        while (i2 < lo6Var.f24241c) {
            in6Var.m6845y(lo6Var.m8065b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8077d(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof lp6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                in6Var.m6846z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6826h = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6826h += in6.m6826h(((Long) list.get(i3)).longValue());
        }
        in6Var.m6845y(iM6826h);
        while (i2 < list.size()) {
            in6Var.m6827A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8078e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m8079f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lo6)) {
            int iM6826h = 0;
            while (i < size) {
                iM6826h += in6.m6826h(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6826h;
        }
        lo6 lo6Var = (lo6) list;
        int iM6826h2 = 0;
        while (i < size) {
            iM6826h2 += in6.m6826h(lo6Var.m8065b(i));
            i++;
        }
        return iM6826h2;
    }

    /* JADX INFO: renamed from: g */
    public static int m8080g(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (in6.m6825g(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: h */
    public static int m8081h(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (in6.m6825g(i << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m8082i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lo6)) {
            int iM6826h = 0;
            while (i < size) {
                iM6826h += in6.m6826h(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6826h;
        }
        lo6 lo6Var = (lo6) list;
        int iM6826h2 = 0;
        while (i < size) {
            iM6826h2 += in6.m6826h(lo6Var.m8065b(i));
            i++;
        }
        return iM6826h2;
    }

    /* JADX INFO: renamed from: j */
    public static int m8083j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM6826h = 0;
        for (int i = 0; i < size; i++) {
            iM6826h += in6.m6826h(((Long) list.get(i)).longValue());
        }
        return iM6826h;
    }

    /* JADX INFO: renamed from: k */
    public static int m8084k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lo6)) {
            int iM6825g = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM6825g += in6.m6825g((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM6825g;
        }
        lo6 lo6Var = (lo6) list;
        int iM6825g2 = 0;
        while (i < size) {
            int iM8065b = lo6Var.m8065b(i);
            iM6825g2 += in6.m6825g((iM8065b >> 31) ^ (iM8065b + iM8065b));
            i++;
        }
        return iM6825g2;
    }

    /* JADX INFO: renamed from: l */
    public static int m8085l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM6826h = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM6826h += in6.m6826h((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM6826h;
    }

    /* JADX INFO: renamed from: m */
    public static int m8086m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lo6)) {
            int iM6825g = 0;
            while (i < size) {
                iM6825g += in6.m6825g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6825g;
        }
        lo6 lo6Var = (lo6) list;
        int iM6825g2 = 0;
        while (i < size) {
            iM6825g2 += in6.m6825g(lo6Var.m8065b(i));
            i++;
        }
        return iM6825g2;
    }

    /* JADX INFO: renamed from: n */
    public static int m8087n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM6826h = 0;
        for (int i = 0; i < size; i++) {
            iM6826h += in6.m6826h(((Long) list.get(i)).longValue());
        }
        return iM6826h;
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
    public static void m8088o(Object obj, Object obj2) {
        jo6 jo6Var = (jo6) obj;
        pq6 pq6Var = jo6Var.zzc;
        pq6 pq6Var2 = ((jo6) obj2).zzc;
        pq6 pq6Var3 = pq6.f27901e;
        if (!pq6Var3.equals(pq6Var2)) {
            if (pq6Var3.equals(pq6Var)) {
                pq6Var.getClass();
                pq6Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(pq6Var.f27902a, 0);
                System.arraycopy(pq6Var2.f27902a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(pq6Var.f27903b, 0);
                System.arraycopy(pq6Var2.f27903b, 0, objArrCopyOf, 0, 0);
                pq6Var = new pq6(iArrCopyOf, objArrCopyOf, true);
            } else {
                pq6Var.getClass();
                if (!pq6Var2.equals(pq6Var3)) {
                    if (!pq6Var.f27905d) {
                        xy4.m12791t();
                        return;
                    } else {
                        System.arraycopy(pq6Var2.f27902a, 0, pq6Var.f27902a, 0, 0);
                        System.arraycopy(pq6Var2.f27903b, 0, pq6Var.f27903b, 0, 0);
                    }
                }
            }
        }
        jo6Var.zzc = pq6Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m8089p(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof om6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                in6Var.m6830j(11);
                in6Var.m6833m(i << 3);
                byte[] bArr = in6Var.f21598b;
                int i3 = in6Var.f21600d;
                bArr[i3] = bBooleanValue;
                in6Var.f21600d = i3 + 1;
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            i4++;
        }
        in6Var.m6845y(i4);
        while (i2 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i2)).booleanValue();
            if (in6Var.f21600d == in6Var.f21599c) {
                in6Var.m6829i();
            }
            byte[] bArr2 = in6Var.f21598b;
            int i6 = in6Var.f21600d;
            bArr2[i6] = bBooleanValue2;
            in6Var.f21600d = i6 + 1;
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m8090q(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof ln6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                in6Var.m6838r(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        in6Var.m6845y(i3);
        while (i2 < list.size()) {
            in6Var.m6839s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m8091r(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof lo6)) {
            if (!z) {
                while (i2 < list.size()) {
                    in6Var.m6840t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            in6Var.m6843w(i, 2);
            int iM6826h = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM6826h += in6.m6826h(((Integer) list.get(i3)).intValue());
            }
            in6Var.m6845y(iM6826h);
            while (i2 < list.size()) {
                in6Var.m6841u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lo6 lo6Var = (lo6) list;
        if (!z) {
            while (i2 < lo6Var.f24241c) {
                in6Var.m6840t(i, lo6Var.m8065b(i2));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6826h2 = 0;
        for (int i4 = 0; i4 < lo6Var.f24241c; i4++) {
            iM6826h2 += in6.m6826h(lo6Var.m8065b(i4));
        }
        in6Var.m6845y(iM6826h2);
        while (i2 < lo6Var.f24241c) {
            in6Var.m6841u(lo6Var.m8065b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8092s(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof lo6)) {
            if (!z) {
                while (i2 < list.size()) {
                    in6Var.m6836p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            in6Var.m6843w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            in6Var.m6845y(i3);
            while (i2 < list.size()) {
                in6Var.m6837q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lo6 lo6Var = (lo6) list;
        if (!z) {
            while (i2 < lo6Var.f24241c) {
                in6Var.m6836p(i, lo6Var.m8065b(i2));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lo6Var.f24241c; i6++) {
            lo6Var.m8065b(i6);
            i5 += 4;
        }
        in6Var.m6845y(i5);
        while (i2 < lo6Var.f24241c) {
            in6Var.m6837q(lo6Var.m8065b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m8093t(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof lp6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                in6Var.m6838r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        in6Var.m6845y(i3);
        while (i2 < list.size()) {
            in6Var.m6839s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m8094u(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof do6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                in6Var.m6836p(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        in6Var.m6845y(i3);
        while (i2 < list.size()) {
            in6Var.m6837q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m8095v(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof lo6)) {
            if (!z) {
                while (i2 < list.size()) {
                    in6Var.m6840t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            in6Var.m6843w(i, 2);
            int iM6826h = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM6826h += in6.m6826h(((Integer) list.get(i3)).intValue());
            }
            in6Var.m6845y(iM6826h);
            while (i2 < list.size()) {
                in6Var.m6841u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lo6 lo6Var = (lo6) list;
        if (!z) {
            while (i2 < lo6Var.f24241c) {
                in6Var.m6840t(i, lo6Var.m8065b(i2));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6826h2 = 0;
        for (int i4 = 0; i4 < lo6Var.f24241c; i4++) {
            iM6826h2 += in6.m6826h(lo6Var.m8065b(i4));
        }
        in6Var.m6845y(iM6826h2);
        while (i2 < lo6Var.f24241c) {
            in6Var.m6841u(lo6Var.m8065b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m8096w(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof lp6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                in6Var.m6846z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int iM6826h = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6826h += in6.m6826h(((Long) list.get(i3)).longValue());
        }
        in6Var.m6845y(iM6826h);
        while (i2 < list.size()) {
            in6Var.m6827A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m8097x(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        int i2 = 0;
        if (!(list instanceof lo6)) {
            if (!z) {
                while (i2 < list.size()) {
                    in6Var.m6836p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            in6Var.m6843w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            in6Var.m6845y(i3);
            while (i2 < list.size()) {
                in6Var.m6837q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lo6 lo6Var = (lo6) list;
        if (!z) {
            while (i2 < lo6Var.f24241c) {
                in6Var.m6836p(i, lo6Var.m8065b(i2));
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lo6Var.f24241c; i6++) {
            lo6Var.m8065b(i6);
            i5 += 4;
        }
        in6Var.m6845y(i5);
        while (i2 < lo6Var.f24241c) {
            in6Var.m6837q(lo6Var.m8065b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m8098y(int i, List list, rr5 rr5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        in6 in6Var = (in6) rr5Var.f29555b;
        if (list instanceof lp6) {
            xy4.m12778e();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                in6Var.m6838r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        in6Var.m6843w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        in6Var.m6845y(i3);
        while (i2 < list.size()) {
            in6Var.m6839s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
