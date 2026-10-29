package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hw5 extends ru4 {

    /* JADX INFO: renamed from: e */
    public Object f20905e;

    /* JADX INFO: renamed from: f */
    public boolean f20906f;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f20906f;
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f20906f) {
            xy4.m12795x();
            return null;
        }
        this.f20906f = true;
        return this.f20905e;
    }
}
