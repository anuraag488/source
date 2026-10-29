package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dq2 implements Map, cc2 {

    /* JADX INFO: renamed from: a */
    public lw2 f17278a;

    /* JADX INFO: renamed from: b */
    public r91 f17279b;

    /* JADX INFO: renamed from: c */
    public r91 f17280c;

    /* JADX INFO: renamed from: d */
    public ge4 f17281d;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f17278a.m8128c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f17278a.m8129d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        r91 r91Var = this.f17279b;
        if (r91Var != null) {
            return r91Var;
        }
        lw2 lw2Var = this.f17278a;
        r91 r91Var2 = new r91((byte) 0);
        r91Var2.f29103b = lw2Var;
        VarHandle.storeStoreFence();
        this.f17279b = r91Var2;
        return r91Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dq2.class != obj.getClass()) {
            return false;
        }
        return this.f17278a.equals(((dq2) obj).f17278a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f17278a.m8132g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f17278a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f17278a.m8134i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        r91 r91Var = this.f17280c;
        if (r91Var != null) {
            return r91Var;
        }
        lw2 lw2Var = this.f17278a;
        r91 r91Var2 = new r91((byte) 1);
        r91Var2.f29103b = lw2Var;
        VarHandle.storeStoreFence();
        this.f17280c = r91Var2;
        return r91Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f17278a.f24422e;
    }

    public final String toString() {
        return this.f17278a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ge4 ge4Var = this.f17281d;
        if (ge4Var != null) {
            return ge4Var;
        }
        lw2 lw2Var = this.f17278a;
        ge4 ge4Var2 = new ge4((byte) 1);
        ge4Var2.f19758b = lw2Var;
        VarHandle.storeStoreFence();
        this.f17281d = ge4Var2;
        return ge4Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
