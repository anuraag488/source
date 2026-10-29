package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: q1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1055q1 extends C1018p1 implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1129s1 f28135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055q1(AbstractC1129s1 abstractC1129s1, int i) {
        super(abstractC1129s1);
        this.f28135d = abstractC1129s1;
        int iMo103a = abstractC1129s1.mo103a();
        if (i < 0 || i > iMo103a) {
            xy4.m12792u(zi4.m13618r(i, iMo103a, "index: ", ", size: "));
            throw null;
        }
        this.f27269b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27269b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27269b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f27269b - 1;
        this.f27269b = i;
        return this.f28135d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27269b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
