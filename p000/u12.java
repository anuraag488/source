package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class u12 extends o12 implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final r12 f31590b;

    static {
        em3 em3Var = em3.f18259e;
        r12 r12Var = new r12(em3Var.size(), 0);
        r12Var.f28954g = em3Var;
        f31590b = r12Var;
    }

    /* JADX INFO: renamed from: m */
    public static em3 m11199m(int i, Object[] objArr) {
        return i == 0 ? em3.f18259e : new em3(i, objArr);
    }

    /* JADX INFO: renamed from: q */
    public static u12 m11200q(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        se0.m10730k(array.length, array);
        return m11199m(array.length, array);
    }

    /* JADX INFO: renamed from: s */
    public static em3 m11201s(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        se0.m10730k(2, objArr);
        return m11199m(2, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: b */
    public int mo5199b(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // p000.o12, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && qs5.m10116u(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (qs5.m10116u(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: l */
    public final ru4 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final r12 listIterator(int i) {
        dt0.m4720v(i, size());
        if (isEmpty()) {
            return f31590b;
        }
        r12 r12Var = new r12(size(), i);
        r12Var.f28954g = this;
        VarHandle.storeStoreFence();
        return r12Var;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public u12 subList(int i, int i2) {
        dt0.m4721w(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? em3.f18259e : new s12(this, i, i3);
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: a */
    public final u12 mo6445a() {
        return this;
    }
}
