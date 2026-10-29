package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kj6 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final kj6 f23184b;

    /* JADX INFO: renamed from: a */
    public boolean f23185a = true;

    static {
        kj6 kj6Var = new kj6();
        f23184b = kj6Var;
        kj6Var.f23185a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m7527b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof fi6)) {
                return obj.hashCode();
            }
            xy4.m12791t();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = ni6.f25875a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final kj6 m7528a() {
        if (isEmpty()) {
            return new kj6();
        }
        kj6 kj6Var = new kj6(this);
        kj6Var.f23185a = true;
        return kj6Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m7529c() {
        if (this.f23185a) {
            return;
        }
        xy4.m12791t();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m7529c();
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
        int iM7527b = 0;
        for (Map.Entry entry : entrySet()) {
            iM7527b += m7527b(entry.getValue()) ^ m7527b(entry.getKey());
        }
        return iM7527b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m7529c();
        Charset charset = ni6.f25875a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m7529c();
        for (Object obj : map.keySet()) {
            Charset charset = ni6.f25875a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m7529c();
        return super.remove(obj);
    }
}
