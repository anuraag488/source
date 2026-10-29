package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ma3 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24785a;

    /* JADX INFO: renamed from: b */
    public Iterator f24786b;

    public /* synthetic */ ma3(byte b) {
        this.f24785a = b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24785a) {
            case 0:
                return ((ka3) this.f24786b).f21204c;
            default:
                return this.f24786b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24785a) {
            case 0:
                return (Map.Entry) ((ka3) this.f24786b).next();
            default:
                return (vw4) this.f24786b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24785a) {
            case 0:
                ((ka3) this.f24786b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
