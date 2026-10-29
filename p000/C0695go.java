package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: go */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0695go implements Set {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0805jo f19987a;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f19987a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19987a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f19987a.m7193j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0805jo c0805jo = this.f19987a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c0805jo.f34030c == set.size() && c0805jo.m7193j(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0805jo c0805jo = this.f19987a;
        int iHashCode = 0;
        for (int i = c0805jo.f34030c - 1; i >= 0; i--) {
            Object objM12500e = c0805jo.m12500e(i);
            iHashCode += objM12500e == null ? 0 : objM12500e.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f19987a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0658fo(this.f19987a, (byte) 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0805jo c0805jo = this.f19987a;
        int iM12498c = c0805jo.m12498c(obj);
        if (iM12498c < 0) {
            return false;
        }
        c0805jo.m12501f(iM12498c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f19987a.m7194k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0805jo c0805jo = this.f19987a;
        int i = c0805jo.f34030c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0805jo.m12500e(i2))) {
                c0805jo.m12501f(i2);
            }
        }
        return i != c0805jo.f34030c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f19987a.f34030c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0805jo c0805jo = this.f19987a;
        int i = c0805jo.f34030c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0805jo.m12500e(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0805jo c0805jo = this.f19987a;
        int i = c0805jo.f34030c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0805jo.m12500e(i2);
        }
        return objArr;
    }
}
