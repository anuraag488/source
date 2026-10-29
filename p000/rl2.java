package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rl2 extends AbstractC1315x1 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public Object[] f29391a;

    /* JADX INFO: renamed from: b */
    public final int f29392b;

    /* JADX INFO: renamed from: c */
    public int f29393c;

    /* JADX INFO: renamed from: d */
    public final rl2 f29394d;

    /* JADX INFO: renamed from: e */
    public final sl2 f29395e;

    public rl2(Object[] objArr, int i, int i2, rl2 rl2Var, sl2 sl2Var) {
        this.f29391a = objArr;
        this.f29392b = i;
        this.f29393c = i2;
        this.f29394d = rl2Var;
        this.f29395e = sl2Var;
        ((AbstractList) this).modCount = ((AbstractList) sl2Var).modCount;
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: a */
    public final int mo3088a() {
        m10356l();
        return this.f29393c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m10357m();
        m10356l();
        int i2 = this.f29393c;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
        } else {
            m10355e(this.f29392b + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m10357m();
        m10356l();
        int i2 = this.f29393c;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        m10354d(this.f29392b + i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: b */
    public final Object mo3089b(int i) {
        m10357m();
        m10356l();
        int i2 = this.f29393c;
        if (i >= 0 && i < i2) {
            return m10358q(this.f29392b + i);
        }
        xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m10357m();
        m10356l();
        m10359r(this.f29392b, this.f29393c);
    }

    /* JADX INFO: renamed from: d */
    public final void m10354d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        sl2 sl2Var = this.f29395e;
        rl2 rl2Var = this.f29394d;
        if (rl2Var != null) {
            rl2Var.m10354d(i, collection, i2);
        } else {
            sl2 sl2Var2 = sl2.f30372d;
            sl2Var.m10863d(i, collection, i2);
        }
        this.f29391a = sl2Var.f30373a;
        this.f29393c += i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m10355e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        sl2 sl2Var = this.f29395e;
        rl2 rl2Var = this.f29394d;
        if (rl2Var != null) {
            rl2Var.m10355e(i, obj);
        } else {
            sl2 sl2Var2 = sl2.f30372d;
            sl2Var.m10864e(i, obj);
        }
        this.f29391a = sl2Var.f30373a;
        this.f29393c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m10356l();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f29391a;
            int i = this.f29393c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (z62.m13387o(objArr[this.f29392b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10356l();
        int i2 = this.f29393c;
        if (i >= 0 && i < i2) {
            return this.f29391a[this.f29392b + i];
        }
        xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m10356l();
        Object[] objArr = this.f29391a;
        int i = this.f29393c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f29392b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m10356l();
        for (int i = 0; i < this.f29393c; i++) {
            if (z62.m13387o(this.f29391a[this.f29392b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m10356l();
        return this.f29393c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m10356l() {
        if (((AbstractList) this.f29395e).modCount == ((AbstractList) this).modCount) {
            return;
        }
        C1077qn.m9983c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m10356l();
        for (int i = this.f29393c - 1; i >= 0; i--) {
            if (z62.m13387o(this.f29391a[this.f29392b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m10356l();
        int i2 = this.f29393c;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        ow1 ow1Var = new ow1((byte) 1);
        ow1Var.f27163e = this;
        ow1Var.f27160b = i;
        ow1Var.f27161c = -1;
        ow1Var.f27162d = ((AbstractList) this).modCount;
        VarHandle.storeStoreFence();
        return ow1Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m10357m() {
        if (this.f29395e.f30375c) {
            xy4.m12791t();
        }
    }

    /* JADX INFO: renamed from: q */
    public final Object m10358q(int i) {
        Object objM10867q;
        ((AbstractList) this).modCount++;
        rl2 rl2Var = this.f29394d;
        if (rl2Var != null) {
            objM10867q = rl2Var.m10358q(i);
        } else {
            sl2 sl2Var = sl2.f30372d;
            objM10867q = this.f29395e.m10867q(i);
        }
        this.f29393c--;
        return objM10867q;
    }

    /* JADX INFO: renamed from: r */
    public final void m10359r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        rl2 rl2Var = this.f29394d;
        if (rl2Var != null) {
            rl2Var.m10359r(i, i2);
        } else {
            sl2 sl2Var = sl2.f30372d;
            this.f29395e.m10868r(i, i2);
        }
        this.f29393c -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m10357m();
        m10356l();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo3089b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m10357m();
        m10356l();
        return m10360s(this.f29392b, this.f29393c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m10357m();
        m10356l();
        return m10360s(this.f29392b, this.f29393c, collection, true) > 0;
    }

    /* JADX INFO: renamed from: s */
    public final int m10360s(int i, int i2, Collection collection, boolean z) {
        int iM10869s;
        rl2 rl2Var = this.f29394d;
        if (rl2Var != null) {
            iM10869s = rl2Var.m10360s(i, i2, collection, z);
        } else {
            sl2 sl2Var = sl2.f30372d;
            iM10869s = this.f29395e.m10869s(i, i2, collection, z);
        }
        if (iM10869s > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f29393c -= iM10869s;
        return iM10869s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m10357m();
        m10356l();
        int i2 = this.f29393c;
        if (i < 0 || i >= i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f29391a;
        int i3 = this.f29392b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        qq2.m10026j(i, i2, this.f29393c);
        return new rl2(this.f29391a, this.f29392b + i, i2 - i, this, this.f29395e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m10356l();
        int length = objArr.length;
        int i = this.f29393c;
        Object[] objArr2 = this.f29391a;
        int i2 = this.f29392b;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        AbstractC0990oo.m9198S(0, i2, i + i2, objArr2, objArr);
        int i3 = this.f29393c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m10356l();
        return oh6.m9080E(this.f29391a, this.f29392b, this.f29393c, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10357m();
        m10356l();
        m10355e(this.f29392b + this.f29393c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m10356l();
        Object[] objArr = this.f29391a;
        int i = this.f29393c;
        int i2 = this.f29392b;
        return AbstractC0990oo.m9205Z(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10357m();
        m10356l();
        int size = collection.size();
        m10354d(this.f29392b + this.f29393c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
