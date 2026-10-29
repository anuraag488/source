package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j06 extends ru4 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public int f21935e;

    /* JADX INFO: renamed from: f */
    public int f21936f;

    /* JADX INFO: renamed from: g */
    public final n06 f21937g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j06(n06 n06Var, int i) {
        super((byte) 4);
        int size = n06Var.size();
        xz5.m12801b(i, size);
        this.f21935e = size;
        this.f21936f = i;
        this.f21937g = n06Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m6977b(int i) {
        return this.f21937g.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21936f < this.f21935e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21936f > 0;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f21936f;
        this.f21936f = i + 1;
        return m6977b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21936f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f21936f - 1;
        this.f21936f = i;
        return m6977b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21936f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
