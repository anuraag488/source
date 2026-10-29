package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f41 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18742a;

    /* JADX INFO: renamed from: b */
    public Iterator f18743b;

    /* JADX INFO: renamed from: c */
    public int f18744c;

    public /* synthetic */ f41(byte b) {
        this.f18742a = b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18742a) {
            case 0:
                Iterator it = this.f18743b;
                while (this.f18744c > 0 && it.hasNext()) {
                    it.next();
                    this.f18744c--;
                }
                return it.hasNext();
            default:
                return this.f18743b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18742a) {
            case 0:
                Iterator it = this.f18743b;
                while (this.f18744c > 0 && it.hasNext()) {
                    it.next();
                    this.f18744c--;
                }
                return it.next();
            default:
                int i = this.f18744c;
                this.f18744c = i + 1;
                if (i >= 0) {
                    return new m22(i, this.f18743b.next());
                }
                kx5.m7735t0();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18742a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
