package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: n0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0929n0 implements Collection, cc2 {
    /* JADX INFO: renamed from: a */
    public abstract int mo103a();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (z62.m13387o(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo103a() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo103a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        C1127s c1127s = new C1127s((byte) 1);
        c1127s.f29778b = this;
        VarHandle.storeStoreFence();
        return hb0.m6305Q0(this, ", ", "[", "]", 0, c1127s, 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
