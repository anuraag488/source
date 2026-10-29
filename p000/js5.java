package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class js5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Iterator f22596a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22596a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f22596a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
