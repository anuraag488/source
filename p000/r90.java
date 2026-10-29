package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r90 implements p90 {

    /* JADX INFO: renamed from: b */
    public static final Map f29100b;

    /* JADX INFO: renamed from: a */
    public Class f29101a;

    static {
        List listM7694Y = kx5.m7694Y(wp1.class, yp1.class, mq1.class, nq1.class, oq1.class, pq1.class, qq1.class, rq1.class, sq1.class, tq1.class, xp1.class, zp1.class, aq1.class, bq1.class, cq1.class, dq1.class, eq1.class, fq1.class, gq1.class, hq1.class, jq1.class, kq1.class, lq1.class);
        ArrayList arrayList = new ArrayList(ib0.m6717y0(listM7694Y, 10));
        int i = 0;
        for (Object obj : listM7694Y) {
            int i2 = i + 1;
            if (i < 0) {
                kx5.m7735t0();
                throw null;
            }
            arrayList.add(new l73((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f29100b = eq2.m5277P(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final String m10248a() {
        String strM10819o;
        Class cls = this.f29101a;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM10819o2 = sj3.m10819o(cls.getName());
            return strM10819o2 == null ? cls.getCanonicalName() : strM10819o2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM10819o = sj3.m10819o(componentType.getName())) != null) {
            strConcat = strM10819o.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX INFO: renamed from: b */
    public final String m10249b() {
        String strM10798G;
        Class cls = this.f29101a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM10798G2 = sj3.m10798G(cls.getName());
                return strM10798G2 == null ? cls.getSimpleName() : strM10798G2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM10798G = sj3.m10798G(componentType.getName())) != null) {
                strConcat = strM10798G.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            String str = enclosingMethod.getName() + '$';
            int iM6343i0 = hd4.m6343i0(simpleName, str, 0, false, 6);
            if (iM6343i0 != -1) {
                return simpleName.substring(str.length() + iM6343i0, simpleName.length());
            }
        } else {
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                String str2 = enclosingConstructor.getName() + '$';
                int iM6343i1 = hd4.m6343i0(simpleName, str2, 0, false, 6);
                if (iM6343i1 != -1) {
                    return simpleName.substring(str2.length() + iM6343i1, simpleName.length());
                }
            } else {
                int iM6342h0 = hd4.m6342h0(simpleName, '$', 0, 6);
                if (iM6342h0 != -1) {
                    return simpleName.substring(iM6342h0 + 1, simpleName.length());
                }
            }
        }
        return simpleName;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10250c(Object obj) {
        Class clsM9114t = this.f29101a;
        Integer num = (Integer) f29100b.get(clsM9114t);
        if (num != null) {
            return as4.m3228G(num.intValue(), obj);
        }
        if (clsM9114t.isPrimitive()) {
            clsM9114t = oh6.m9114t(rl3.m10361a(clsM9114t));
        }
        return clsM9114t.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r90) && oh6.m9114t(this).equals(oh6.m9114t((r90) obj));
    }

    public final int hashCode() {
        return oh6.m9114t(this).hashCode();
    }

    public final String toString() {
        return this.f29101a.toString() + " (Kotlin reflection is not available)";
    }
}
