package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ge4 implements Collection, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19757a;

    /* JADX INFO: renamed from: b */
    public Object f19758b;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).m4773a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f19757a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f19757a) {
            case 0:
                ((dw2) this.f19758b).m4774b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).m4775c(obj);
            default:
                return ((lw2) this.f19758b).m8129d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f19757a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((dw2) this.f19758b).m4775c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((lw2) this.f19758b).m8129d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).f17461g == 0;
            default:
                return ((lw2) this.f19758b).m8134i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f19757a) {
            case 0:
                dw2 dw2Var = (dw2) this.f19758b;
                fw2 fw2Var = new fw2();
                fw2Var.f19354a = dw2Var;
                fw2Var.f19355b = dw2Var;
                VarHandle.storeStoreFence();
                return fw2Var.iterator();
            default:
                return d24.m4325z(new q91(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).m4780h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).m4780h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f19757a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).m4782j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f19757a) {
            case 0:
                return ((dw2) this.f19758b).f17461g;
            default:
                return ((lw2) this.f19758b).f24422e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f19757a) {
            case 0:
                break;
        }
        return zy5.m13859W(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f19757a) {
            case 0:
                break;
        }
        return zy5.m13860X(this, objArr);
    }
}
