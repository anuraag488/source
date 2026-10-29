package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q52 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public int f28223a;

    /* JADX INFO: renamed from: b */
    public int f28224b;

    /* JADX INFO: renamed from: c */
    public boolean f28225c;

    /* JADX INFO: renamed from: d */
    public int f28226d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28225c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f28226d;
        if (i != this.f28224b) {
            this.f28226d = this.f28223a + i;
            return i;
        }
        if (this.f28225c) {
            this.f28225c = false;
            return i;
        }
        xy4.m12795x();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
