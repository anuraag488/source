package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ru4 implements Iterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte f29645d;

    /* JADX INFO: renamed from: a */
    public abstract byte mo1996a();

    @Override // java.util.Iterator, java.util.ListIterator
    public Object next() {
        return Byte.valueOf(mo1996a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f29645d) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
