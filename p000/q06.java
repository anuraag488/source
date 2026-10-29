package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q06 extends ru4 {

    /* JADX INFO: renamed from: e */
    public Object f28133e;

    /* JADX INFO: renamed from: f */
    public boolean f28134f;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f28134f;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f28134f) {
            xy4.m12795x();
            return null;
        }
        this.f28134f = true;
        return this.f28133e;
    }
}
