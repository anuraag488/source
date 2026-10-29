package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ha3 implements Map, cc2 {

    /* JADX INFO: renamed from: c */
    public static final ha3 f20459c = new ha3(zp4.f36252e, 0);

    /* JADX INFO: renamed from: a */
    public final zp4 f20460a;

    /* JADX INFO: renamed from: b */
    public final int f20461b;

    public ha3(zp4 zp4Var, int i) {
        this.f20460a = zp4Var;
        this.f20461b = i;
    }

    /* JADX INFO: renamed from: a */
    public ja3 mo5945a() {
        return new ja3(this);
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ ja3 mo5946c() {
        return mo5945a();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f20460a.m13700d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (z62.m13387o(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final ha3 m6289d(Object obj, ql2 ql2Var) {
        li0 li0VarM13716u = this.f20460a.m13716u(obj != null ? obj.hashCode() : 0, 0, obj, ql2Var);
        return li0VarM13716u == null ? this : new ha3((zp4) li0VarM13716u.f24044c, this.f20461b + (li0VarM13716u.f24043b ? 1 : 0));
    }

    @Override // java.util.Map
    public final Set entrySet() {
        oa3 oa3Var = new oa3((byte) 0);
        oa3Var.f26500b = this;
        VarHandle.storeStoreFence();
        return oa3Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f20461b != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (z62.m13387o(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f20460a.m13703g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f20461b == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        oa3 oa3Var = new oa3((byte) 1);
        oa3Var.f26500b = this;
        VarHandle.storeStoreFence();
        return oa3Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20461b;
    }

    public final String toString() {
        Set setEntrySet = entrySet();
        C1127s c1127s = new C1127s((byte) 3);
        c1127s.f29778b = this;
        VarHandle.storeStoreFence();
        return hb0.m6305Q0(setEntrySet, ", ", "{", "}", 0, c1127s, 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        iq2 iq2Var = new iq2((byte) 1);
        iq2Var.f21635b = this;
        VarHandle.storeStoreFence();
        return iq2Var;
    }
}
