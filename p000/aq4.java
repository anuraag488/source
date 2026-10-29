package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq4 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public Object[] f14778a = zp4.f36252e.f36256d;

    /* JADX INFO: renamed from: b */
    public int f14779b;

    /* JADX INFO: renamed from: c */
    public int f14780c;

    /* JADX INFO: renamed from: a */
    public final void m3115a(Object[] objArr, int i, int i2) {
        this.f14778a = objArr;
        this.f14779b = i;
        this.f14780c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14780c < this.f14779b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
