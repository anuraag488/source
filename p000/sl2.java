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
public final class sl2 extends AbstractC1315x1 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public static final sl2 f30372d;

    /* JADX INFO: renamed from: a */
    public Object[] f30373a;

    /* JADX INFO: renamed from: b */
    public int f30374b;

    /* JADX INFO: renamed from: c */
    public boolean f30375c;

    static {
        sl2 sl2Var = new sl2(0);
        sl2Var.f30375c = true;
        f30372d = sl2Var;
    }

    public sl2(int i) {
        if (i >= 0) {
            this.f30373a = new Object[i];
        } else {
            C1077qn.m9987m("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: a */
    public final int mo3088a() {
        return this.f30374b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m10865l();
        int i2 = this.f30374b;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m10866m(i, 1);
        this.f30373a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m10865l();
        int i2 = this.f30374b;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        m10863d(i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: b */
    public final Object mo3089b(int i) {
        m10865l();
        int i2 = this.f30374b;
        if (i >= 0 && i < i2) {
            return m10867q(i);
        }
        xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m10865l();
        m10868r(0, this.f30374b);
    }

    /* JADX INFO: renamed from: d */
    public final void m10863d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m10866m(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f30373a[i + i3] = it.next();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10864e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m10866m(i, 1);
        this.f30373a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f30373a;
            int i = this.f30374b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (z62.m13387o(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f30374b;
        if (i >= 0 && i < i2) {
            return this.f30373a[i];
        }
        xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f30373a;
        int i = this.f30374b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f30374b; i++) {
            if (z62.m13387o(this.f30373a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f30374b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m10865l() {
        if (this.f30375c) {
            xy4.m12791t();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f30374b - 1; i >= 0; i--) {
            if (z62.m13387o(this.f30373a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f30374b;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        ow1 ow1Var = new ow1((byte) 2);
        ow1Var.f27163e = this;
        ow1Var.f27160b = i;
        ow1Var.f27161c = -1;
        ow1Var.f27162d = ((AbstractList) this).modCount;
        VarHandle.storeStoreFence();
        return ow1Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m10866m(int i, int i2) {
        int i3 = this.f30374b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.f30373a;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.f30373a = objArrCopyOf;
        }
        AbstractC0990oo.m9198S(i + i2, i, this.f30374b, objArrCopyOf, objArrCopyOf);
        this.f30374b += i2;
    }

    /* JADX INFO: renamed from: q */
    public final Object m10867q(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f30373a;
        Object obj = objArr[i];
        AbstractC0990oo.m9198S(i, i + 1, this.f30374b, objArr, objArr);
        Object[] objArr2 = this.f30373a;
        int i2 = this.f30374b;
        objArr2[i2 - 1] = null;
        this.f30374b = i2 - 1;
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public final void m10868r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f30373a;
        AbstractC0990oo.m9198S(i, i + i2, this.f30374b, objArr, objArr);
        Object[] objArr2 = this.f30373a;
        int i3 = this.f30374b;
        oh6.m9077B(objArr2, i3 - i2, i3);
        this.f30374b -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m10865l();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo3089b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m10865l();
        return m10869s(0, this.f30374b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m10865l();
        return m10869s(0, this.f30374b, collection, true) > 0;
    }

    /* JADX INFO: renamed from: s */
    public final int m10869s(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f30373a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f30373a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC0990oo.m9198S(i + i4, i2 + i, this.f30374b, objArr, objArr);
        Object[] objArr3 = this.f30373a;
        int i7 = this.f30374b;
        oh6.m9077B(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f30374b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m10865l();
        int i2 = this.f30374b;
        if (i < 0 || i >= i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f30373a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        qq2.m10026j(i, i2, this.f30374b);
        return new rl2(this.f30373a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f30374b;
        Object[] objArr2 = this.f30373a;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
        }
        AbstractC0990oo.m9198S(0, 0, i, objArr2, objArr);
        int i2 = this.f30374b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return oh6.m9080E(this.f30373a, 0, this.f30374b, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0990oo.m9205Z(this.f30373a, 0, this.f30374b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10865l();
        int size = collection.size();
        m10863d(this.f30374b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10865l();
        int i = this.f30374b;
        ((AbstractList) this).modCount++;
        m10866m(i, 1);
        this.f30373a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
