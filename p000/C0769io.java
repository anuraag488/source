package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0769io implements Collection {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0805jo f21602a;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f21602a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21602a.m12496a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21602a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0658fo(this.f21602a, (byte) 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0805jo c0805jo = this.f21602a;
        int iM12496a = c0805jo.m12496a(obj);
        if (iM12496a < 0) {
            return false;
        }
        c0805jo.m12501f(iM12496a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0805jo c0805jo = this.f21602a;
        int i = c0805jo.f34030c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0805jo.m12503i(i2))) {
                c0805jo.m12501f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0805jo c0805jo = this.f21602a;
        int i = c0805jo.f34030c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0805jo.m12503i(i2))) {
                c0805jo.m12501f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f21602a.f34030c;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0805jo c0805jo = this.f21602a;
        int i = c0805jo.f34030c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0805jo.m12503i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0805jo c0805jo = this.f21602a;
        int i = c0805jo.f34030c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0805jo.m12503i(i2);
        }
        return objArr;
    }
}
