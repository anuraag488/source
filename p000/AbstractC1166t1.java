package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: t1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1166t1 implements ListIterator, cc2 {

    /* JADX INFO: renamed from: a */
    public int f30715a;

    /* JADX INFO: renamed from: b */
    public int f30716b;

    public AbstractC1166t1(int i, int i2) {
        this.f30715a = i;
        this.f30716b = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f30715a < this.f30716b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30715a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30715a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30715a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
