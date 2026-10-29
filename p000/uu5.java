package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uu5 extends ru4 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public int f32193e;

    /* JADX INFO: renamed from: f */
    public int f32194f;

    /* JADX INFO: renamed from: g */
    public final sv5 f32195g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu5(sv5 sv5Var, int i) {
        super((byte) 3);
        int size = sv5Var.size();
        nt5.m8847c(i, size);
        this.f32193e = size;
        this.f32194f = i;
        this.f32195g = sv5Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m11650b(int i) {
        return this.f32195g.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f32194f < this.f32193e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32194f > 0;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f32194f;
        this.f32194f = i + 1;
        return m11650b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32194f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f32194f - 1;
        this.f32194f = i;
        return m11650b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32194f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
