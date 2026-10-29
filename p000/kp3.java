package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kp3 implements ListIterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23330a;

    /* JADX INFO: renamed from: b */
    public Object f23331b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23332c;

    public /* synthetic */ kp3(byte b) {
        this.f23330a = b;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f23330a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23330a) {
            case 0:
                return ((ListIterator) this.f23331b).hasPrevious();
            default:
                return ((ol3) this.f23331b).f26851a < ((xd4) this.f23332c).f34174d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f23330a) {
            case 0:
                return ((ListIterator) this.f23331b).hasNext();
            default:
                return ((ol3) this.f23331b).f26851a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f23330a) {
            case 0:
                return ((ListIterator) this.f23331b).previous();
            default:
                ol3 ol3Var = (ol3) this.f23331b;
                int i = ol3Var.f26851a + 1;
                xd4 xd4Var = (xd4) this.f23332c;
                zt5.m13767M(i, xd4Var.f34174d);
                ol3Var.f26851a = i;
                return xd4Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f23330a) {
            case 0:
                hq2 hq2Var = (hq2) this.f23332c;
                return kx5.m7689T(hq2Var) - ((ListIterator) this.f23331b).previousIndex();
            default:
                return ((ol3) this.f23331b).f26851a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f23330a) {
            case 0:
                return ((ListIterator) this.f23331b).next();
            default:
                ol3 ol3Var = (ol3) this.f23331b;
                int i = ol3Var.f26851a;
                xd4 xd4Var = (xd4) this.f23332c;
                zt5.m13767M(i, xd4Var.f34174d);
                ol3Var.f26851a = i - 1;
                return xd4Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f23330a) {
            case 0:
                hq2 hq2Var = (hq2) this.f23332c;
                return kx5.m7689T(hq2Var) - ((ListIterator) this.f23331b).nextIndex();
            default:
                return ((ol3) this.f23331b).f26851a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f23330a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f23330a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }
}
