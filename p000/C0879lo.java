package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0879lo implements Collection, Set, dc2, gc2 {

    /* JADX INFO: renamed from: a */
    public int[] f24217a = qq2.f28685d;

    /* JADX INFO: renamed from: b */
    public Object[] f24218b = qq2.f28687f;

    /* JADX INFO: renamed from: c */
    public int f24219c;

    public C0879lo(int i) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM7620u;
        int i2 = this.f24219c;
        if (obj == null) {
            iM7620u = ks5.m7620u(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM7620u = ks5.m7620u(this, obj, iHashCode);
        }
        if (iM7620u >= 0) {
            return false;
        }
        int i3 = ~iM7620u;
        int[] iArr = this.f24217a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f24218b;
            int[] iArr2 = new int[i4];
            this.f24217a = iArr2;
            this.f24218b = new Object[i4];
            if (i2 != this.f24219c) {
                C1077qn.m9983c();
                return false;
            }
            if (iArr2.length != 0) {
                AbstractC0990oo.m9204Y(iArr, iArr2, 0, iArr.length, 6);
                AbstractC0990oo.m9201V(0, objArr.length, 6, objArr, this.f24218b);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f24217a;
            int i5 = i3 + 1;
            AbstractC0990oo.m9199T(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f24218b;
            AbstractC0990oo.m9198S(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f24219c;
        if (i2 == i6) {
            int[] iArr4 = this.f24217a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f24218b[i3] = obj;
                this.f24219c = i6 + 1;
                return true;
            }
        }
        C1077qn.m9983c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f24219c;
        int i = this.f24219c;
        int[] iArr = this.f24217a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f24218b;
            int[] iArr2 = new int[size];
            this.f24217a = iArr2;
            this.f24218b = new Object[size];
            if (i > 0) {
                AbstractC0990oo.m9204Y(iArr, iArr2, 0, i, 6);
                AbstractC0990oo.m9201V(0, this.f24219c, 6, objArr, this.f24218b);
            }
        }
        if (this.f24219c != i) {
            C1077qn.m9983c();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public final Object m8043b(int i) {
        int i2 = this.f24219c;
        Object[] objArr = this.f24218b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f24217a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0990oo.m9199T(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.f24218b;
                AbstractC0990oo.m9198S(i, i4, i2, objArr2, objArr2);
            }
            this.f24218b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f24217a = iArr2;
            this.f24218b = new Object[i5];
            if (i > 0) {
                AbstractC0990oo.m9204Y(iArr, iArr2, 0, i, 6);
                AbstractC0990oo.m9201V(0, i, 6, objArr, this.f24218b);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0990oo.m9199T(iArr, this.f24217a, i, i6, i2);
                AbstractC0990oo.m9198S(i, i6, i2, objArr, this.f24218b);
            }
        }
        if (i2 == this.f24219c) {
            this.f24219c = i3;
            return obj;
        }
        C1077qn.m9983c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f24219c;
        if (i != 0) {
            this.f24217a = qq2.f28685d;
            this.f24218b = qq2.f28687f;
            i = 0;
            this.f24219c = 0;
        }
        if (i == 0) {
            return;
        }
        C1077qn.m9983c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? ks5.m7620u(this, null, 0) : ks5.m7620u(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f24219c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f24219c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f24218b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f24217a;
        int i = this.f24219c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f24219c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0658fo(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM7620u = obj == null ? ks5.m7620u(this, null, 0) : ks5.m7620u(this, obj, obj.hashCode());
        if (iM7620u < 0) {
            return false;
        }
        m8043b(iM7620u);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f24219c - 1; -1 < i; i--) {
            if (!hb0.m6294F0(collection, this.f24218b[i])) {
                m8043b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f24219c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f24219c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0990oo.m9198S(0, 0, this.f24219c, this.f24218b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f24219c * 14);
        sb.append('{');
        int i = this.f24219c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f24218b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0990oo.m9205Z(this.f24218b, 0, this.f24219c);
    }
}
