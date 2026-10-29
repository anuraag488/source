package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ui4 {

    /* JADX INFO: renamed from: f */
    public static final ti4 f31895f = new ti4();

    /* JADX INFO: renamed from: a */
    public final rv1 f31896a;

    /* JADX INFO: renamed from: b */
    public rv1 f31897b;

    /* JADX INFO: renamed from: c */
    public ArrayList f31898c;

    /* JADX INFO: renamed from: d */
    public ArrayList f31899d;

    /* JADX INFO: renamed from: e */
    public HashMap f31900e;

    public ui4(rv1 rv1Var) {
        this.f31896a = rv1Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m11561a() {
        ArrayList arrayList = this.f31899d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            rv1 rv1Var = this.f31896a;
            arrayList2.add(new rv1(AbstractC1356y5.m12899H(d, rv1Var.f29662c, rv1Var.f29663d)));
        }
        List listSingletonList = Collections.singletonList(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            mb0.m8260A0(arrayList3, (Iterable) it.next());
        }
        this.f31899d = arrayList3;
        return arrayList3;
    }

    /* JADX INFO: renamed from: b */
    public final List m11562b() {
        ArrayList arrayList = this.f31898c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(m11561a());
        arrayList2.add(this.f31896a);
        uc1 uc1Var = new uc1((byte) 5);
        uc1Var.f31781b = this;
        VarHandle.storeStoreFence();
        lb0.m7891z0(arrayList2, uc1Var);
        this.f31898c = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public final double m11563c(rv1 rv1Var) {
        double dDoubleValue = ((Number) ((HashMap) m11564d()).get(m11565e())).doubleValue() - ((Number) ((HashMap) m11564d()).get((rv1) m11562b().get(0))).doubleValue();
        double dDoubleValue2 = ((Number) ((HashMap) m11564d()).get(rv1Var)).doubleValue() - ((Number) ((HashMap) m11564d()).get((rv1) m11562b().get(0))).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    /* JADX INFO: renamed from: d */
    public final Map m11564d() {
        HashMap map = this.f31900e;
        if (map != null) {
            return map;
        }
        ArrayList arrayList = new ArrayList(m11561a());
        arrayList.add(this.f31896a);
        HashMap map2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rv1 rv1Var = (rv1) obj;
            map2.put(rv1Var, Double.valueOf(ti4.m11059a(rv1Var)));
        }
        this.f31900e = map2;
        return map2;
    }

    /* JADX INFO: renamed from: e */
    public final rv1 m11565e() {
        return (rv1) m11562b().get(m11562b().size() - 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui4) && z62.m13387o(this.f31896a, ((ui4) obj).f31896a);
    }

    public final int hashCode() {
        return this.f31896a.f29660a;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.f31896a + ")";
    }
}
