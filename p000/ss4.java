package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ss4 implements Collection, cc2 {

    /* JADX INFO: renamed from: a */
    public int[] f30546a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof rs4)) {
            return false;
        }
        return AbstractC0990oo.m9196Q(this.f30546a, ((rs4) obj).f29588a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int[] iArr = this.f30546a;
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof rs4) || !AbstractC0990oo.m9196Q(iArr, ((rs4) obj).f29588a)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof ss4) && this.f30546a.equals(((ss4) obj).f30546a);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f30546a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f30546a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int[] iArr = this.f30546a;
        C1018p1 c1018p1 = new C1018p1((byte) 4);
        c1018p1.f27270c = iArr;
        VarHandle.storeStoreFence();
        return c1018p1;
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
    public final int size() {
        return this.f30546a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f30546a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }
}
