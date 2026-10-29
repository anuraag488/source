package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qw1 implements List, cc2 {

    /* JADX INFO: renamed from: a */
    public final cw2 f28847a = new cw2(16);

    /* JADX INFO: renamed from: b */
    public final rv2 f28848b = new rv2(16);

    /* JADX INFO: renamed from: c */
    public int f28849c = -1;

    /* JADX INFO: renamed from: a */
    public final long m10143a() {
        long jM63a = C0006a5.m63a(Float.POSITIVE_INFINITY, false, false);
        int i = this.f28849c + 1;
        int iM7689T = kx5.m7689T(this);
        if (i > iM7689T) {
            return jM63a;
        }
        while (i >= 0) {
            rv2 rv2Var = this.f28848b;
            if (i >= rv2Var.f29665b) {
                break;
            }
            long j = rv2Var.f29664a[i];
            if (zp0.m13684p(j, jM63a) < 0) {
                jM63a = j;
            }
            if ((zp0.m13650A(jM63a) < 0.0f && zp0.m13655F(jM63a)) || i == iM7689T) {
                return jM63a;
            }
            i++;
        }
        kx5.m7733s0("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public final void m10144b(int i, int i2) {
        rv2 rv2Var;
        int i3;
        if (i >= i2) {
            return;
        }
        this.f28847a.m4212m(i, i2);
        if (i < 0 || i > (i3 = (rv2Var = this.f28848b).f29665b) || i2 < 0 || i2 > i3) {
            kx5.m7733s0("Index must be between 0 and size");
            throw null;
        }
        if (i2 < i) {
            kx5.m7731r0("The end index must be < start index");
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = rv2Var.f29664a;
                AbstractC0990oo.m9200U(jArr, jArr, i, i2, i3);
            }
            rv2Var.f29665b -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f28849c = -1;
        this.f28847a.m4203d();
        this.f28848b.f29665b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof mt2) && indexOf((mt2) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((mt2) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (mt2) this.f28847a.m4206g(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof mt2)) {
            return -1;
        }
        mt2 mt2Var = (mt2) obj;
        int iM7689T = kx5.m7689T(this);
        if (iM7689T < 0) {
            return -1;
        }
        int i = 0;
        while (!z62.m13387o(this.f28847a.m4206g(i), mt2Var)) {
            if (i == iM7689T) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f28847a.m4208i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ow1(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof mt2) {
            mt2 mt2Var = (mt2) obj;
            for (int iM7689T = kx5.m7689T(this); -1 < iM7689T; iM7689T--) {
                if (z62.m13387o(this.f28847a.m4206g(iM7689T), mt2Var)) {
                    return iM7689T;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ow1(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f28847a.f16533b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new pw1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ow1(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
