package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wo4 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public Iterator f33562a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xr1 f33563b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33562a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f33563b.f34561b.invoke(this.f33562a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
