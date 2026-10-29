package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0819k1 extends ru4 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public final int f22805e;

    /* JADX INFO: renamed from: f */
    public int f22806f;

    public AbstractC0819k1(int i, int i2) {
        super((byte) 0);
        dt0.m4720v(i2, i);
        this.f22805e = i;
        this.f22806f = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo7355b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f22806f < this.f22805e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22806f > 0;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f22806f;
        this.f22806f = i + 1;
        return mo7355b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22806f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f22806f - 1;
        this.f22806f = i;
        return mo7355b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22806f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
