package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lo2 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public boolean f24227a;

    /* JADX INFO: renamed from: b */
    public long f24228b;

    /* JADX INFO: renamed from: c */
    public boolean f24229c;

    /* JADX INFO: renamed from: d */
    public long f24230d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24229c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f24230d;
        if (j != this.f24228b) {
            this.f24230d = (this.f24227a ? 1L : 0L) + j;
        } else {
            if (!this.f24229c) {
                xy4.m12795x();
                return null;
            }
            this.f24229c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
