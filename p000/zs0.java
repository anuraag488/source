package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 {

    /* JADX INFO: renamed from: b */
    public static final zs0 f36338b;

    /* JADX INFO: renamed from: a */
    public final HashMap f36339a;

    static {
        zs0 zs0Var = new zs0(new LinkedHashMap());
        C0006a5.m57M(zs0Var);
        f36338b = zs0Var;
    }

    public zs0(zs0 zs0Var) {
        this.f36339a = new HashMap(zs0Var.f36339a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13736a(String str) {
        Object obj = this.f36339a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && zs0.class.equals(obj.getClass())) {
                HashMap map = ((zs0) obj).f36339a;
                HashMap map2 = this.f36339a;
                Set<String> setKeySet = map2.keySet();
                if (z62.m13387o(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = AbstractC0990oo.m9197R(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f36339a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return zi4.m13623w(new StringBuilder("Data {"), hb0.m6305Q0(this.f36339a.entrySet(), null, null, null, 0, new dh0((byte) 9), 31), "}");
    }

    public zs0(LinkedHashMap linkedHashMap) {
        this.f36339a = new HashMap(linkedHashMap);
    }
}
