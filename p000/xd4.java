package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xd4 implements List, dc2 {

    /* JADX INFO: renamed from: a */
    public final w94 f34171a;

    /* JADX INFO: renamed from: b */
    public final int f34172b;

    /* JADX INFO: renamed from: c */
    public int f34173c;

    /* JADX INFO: renamed from: d */
    public int f34174d;

    public xd4(w94 w94Var, int i, int i2) {
        this.f34171a = w94Var;
        this.f34172b = i;
        this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
        this.f34174d = i2 - i;
    }

    /* JADX INFO: renamed from: a */
    public final void m12672a() {
        if (((dc4) k94.m7449f(this.f34171a.f33182a)).f16983e == this.f34173c) {
            return;
        }
        C1077qn.m9983c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m12672a();
        int i = this.f34172b + this.f34174d;
        w94 w94Var = this.f34171a;
        w94Var.add(i, obj);
        this.f34174d++;
        this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m12672a();
        int i2 = i + this.f34172b;
        w94 w94Var = this.f34171a;
        boolean zAddAll = w94Var.addAll(i2, collection);
        if (zAddAll) {
            this.f34174d = collection.size() + this.f34174d;
            this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f34174d > 0) {
            m12672a();
            int i = this.f34174d;
            int i2 = this.f34172b;
            w94 w94Var = this.f34171a;
            w94Var.m12170c(i2, i + i2);
            this.f34174d = 0;
            this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m12672a();
        zt5.m13767M(i, this.f34174d);
        return this.f34171a.get(this.f34172b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m12672a();
        int i = this.f34174d;
        int i2 = this.f34172b;
        Iterator it = sc6.m10660c0(i2, i + i2).iterator();
        do {
            q52 q52Var = (q52) it;
            if (!q52Var.f28225c) {
                return -1;
            }
            iNextInt = q52Var.nextInt();
        } while (!z62.m13387o(obj, this.f34171a.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f34174d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m12672a();
        int i = this.f34174d;
        int i2 = this.f34172b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (z62.m13387o(obj, this.f34171a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m12672a();
        ol3 ol3Var = new ol3();
        ol3Var.f26851a = i - 1;
        kp3 kp3Var = new kp3((byte) 1);
        kp3Var.f23331b = ol3Var;
        kp3Var.f23332c = this;
        VarHandle.storeStoreFence();
        return kp3Var;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m12672a();
        int i2 = this.f34172b + i;
        w94 w94Var = this.f34171a;
        Object objRemove = w94Var.remove(i2);
        this.f34174d--;
        this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC0003a2 abstractC0003a2;
        e94 e94VarM7451h;
        boolean zM13780k;
        m12672a();
        w94 w94Var = this.f34171a;
        int i2 = this.f34172b;
        int i3 = this.f34174d + i2;
        int size = w94Var.size();
        do {
            synchronized (zt5.f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(w94Var.f33182a);
                i = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            ua3 ua3VarMo20e = abstractC0003a2.mo20e();
            ua3VarMo20e.subList(i2, i3).retainAll(collection);
            AbstractC0003a2 abstractC0003a2M11354c = ua3VarMo20e.m11354c();
            if (z62.m13387o(abstractC0003a2M11354c, abstractC0003a2)) {
                break;
            }
            dc4 dc4Var2 = w94Var.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = zt5.m13780k((dc4) k94.m7466w(dc4Var2, w94Var, e94VarM7451h), i, abstractC0003a2M11354c, true);
            }
            k94.m7455l(e94VarM7451h, w94Var);
        } while (!zM13780k);
        int size2 = size - w94Var.size();
        if (size2 > 0) {
            this.f34173c = ((dc4) k94.m7449f(this.f34171a.f33182a)).f16983e;
            this.f34174d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zt5.m13767M(i, this.f34174d);
        m12672a();
        int i2 = i + this.f34172b;
        w94 w94Var = this.f34171a;
        Object obj2 = w94Var.set(i2, obj);
        this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f34174d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f34174d) {
            kd3.m7502a("fromIndex or toIndex are out of bounds");
        }
        m12672a();
        int i3 = this.f34172b;
        return new xd4(this.f34171a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zy5.m13859W(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zy5.m13860X(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m12672a();
        int i2 = this.f34172b + i;
        w94 w94Var = this.f34171a;
        w94Var.add(i2, obj);
        this.f34174d++;
        this.f34173c = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f34174d, collection);
    }
}
