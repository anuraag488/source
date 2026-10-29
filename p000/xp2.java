package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final xp2 f34514b;

    /* JADX INFO: renamed from: a */
    public boolean f34515a = true;

    static {
        xp2 xp2Var = new xp2();
        f34514b = xp2Var;
        xp2Var.f34515a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m12726a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof h62)) {
                return obj.hashCode();
            }
            xy4.m12791t();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = k62.f22939a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m12727b() {
        if (this.f34515a) {
            return;
        }
        xy4.m12791t();
    }

    /* JADX INFO: renamed from: c */
    public final xp2 m12728c() {
        if (isEmpty()) {
            return new xp2();
        }
        xp2 xp2Var = new xp2(this);
        xp2Var.f34515a = true;
        return xp2Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m12727b();
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
        int iM12726a = 0;
        for (Map.Entry entry : entrySet()) {
            iM12726a += m12726a(entry.getValue()) ^ m12726a(entry.getKey());
        }
        return iM12726a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m12727b();
        Charset charset = k62.f22939a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m12727b();
        for (Object obj : map.keySet()) {
            Charset charset = k62.f22939a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m12727b();
        return super.remove(obj);
    }
}
