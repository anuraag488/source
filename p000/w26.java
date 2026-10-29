package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w26 extends ru4 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public int f33051e;

    /* JADX INFO: renamed from: f */
    public int f33052f;

    /* JADX INFO: renamed from: g */
    public final d36 f33053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w26(d36 d36Var, int i) {
        super((byte) 5);
        int size = d36Var.size();
        if (i < 0 || i > size) {
            xy4.m12792u(k26.m7364f(i, "index", size));
            throw null;
        }
        this.f33051e = size;
        this.f33052f = i;
        this.f33053g = d36Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m12044b(int i) {
        return this.f33053g.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33052f < this.f33051e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33052f > 0;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f33052f;
        this.f33052f = i + 1;
        return m12044b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33052f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f33052f - 1;
        this.f33052f = i;
        return m12044b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33052f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
