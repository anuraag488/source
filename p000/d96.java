package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d96 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final d96 f16877b;

    /* JADX INFO: renamed from: a */
    public boolean f16878a = true;

    static {
        d96 d96Var = new d96();
        f16877b = d96Var;
        d96Var.f16878a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m4411a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof xd6)) {
                return obj.hashCode();
            }
            xy4.m12791t();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM7045a = j76.m7045a(length, 0, length, bArr);
        if (iM7045a == 0) {
            return 1;
        }
        return iM7045a;
    }

    /* JADX INFO: renamed from: b */
    public final void m4412b() {
        if (this.f16878a) {
            return;
        }
        xy4.m12791t();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4412b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM4411a = 0;
        for (Map.Entry entry : entrySet()) {
            iM4411a += m4411a(entry.getValue()) ^ m4411a(entry.getKey());
        }
        return iM4411a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4412b();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4412b();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4412b();
        return super.remove(obj);
    }
}
