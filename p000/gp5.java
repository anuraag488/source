package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gp5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Iterator f20013a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20013a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new sq5((String) this.f20013a.next());
    }
}
