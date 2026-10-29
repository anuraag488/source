package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bo5 extends ru4 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public int f15468e;

    /* JADX INFO: renamed from: f */
    public int f15469f;

    /* JADX INFO: renamed from: g */
    public final vo5 f15470g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo5(vo5 vo5Var, int i) {
        super((byte) 2);
        int size = vo5Var.size();
        if (i < 0 || i > size) {
            xy4.m12792u(xz5.m12806g(i, "index", size));
            throw null;
        }
        this.f15468e = size;
        this.f15469f = i;
        this.f15470g = vo5Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m3645b(int i) {
        return this.f15470g.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15469f < this.f15468e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15469f > 0;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f15469f;
        this.f15469f = i + 1;
        return m3645b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15469f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f15469f - 1;
        this.f15469f = i;
        return m3645b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15469f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
