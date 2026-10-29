package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class th3 extends AbstractC0596e2 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f31169d;

    /* JADX INFO: renamed from: e */
    public static final th3 f31170e;

    /* JADX INFO: renamed from: b */
    public Object[] f31171b;

    /* JADX INFO: renamed from: c */
    public int f31172c;

    static {
        Object[] objArr = new Object[0];
        f31169d = objArr;
        f31170e = new th3(objArr, 0, false);
    }

    public th3(Object[] objArr, int i, boolean z) {
        this.f17637a = z;
        this.f31171b = objArr;
        this.f31172c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m4902a();
        if (i < 0 || i > (i2 = this.f31172c)) {
            xd2.m12665l(this.f31172c, c75.m3883o("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f31171b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[zi4.m13610j(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f31171b, 0, objArr2, 0, i);
            System.arraycopy(this.f31171b, i, objArr2, i + 1, this.f31172c - i);
            this.f31171b = objArr2;
        }
        this.f31171b[i] = obj;
        this.f31172c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m11050b(int i) {
        if (i < 0 || i >= this.f31172c) {
            xd2.m12665l(this.f31172c, c75.m3883o("Index:", i, ", Size:"));
        }
    }

    /* JADX INFO: renamed from: c */
    public final th3 m11051c(int i) {
        if (i >= this.f31172c) {
            return new th3(i == 0 ? f31169d : Arrays.copyOf(this.f31171b, i), this.f31172c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // p000.AbstractC0596e2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.f31172c;
            if (i == list.size()) {
                if (!(obj instanceof th3)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.f31171b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                th3 th3Var = (th3) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.f31171b[i3].equals(th3Var.f31171b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m11050b(i);
        return this.f31171b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f31172c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f31171b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p000.AbstractC0596e2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m4902a();
        m11050b(i);
        Object[] objArr = this.f31171b;
        Object obj = objArr[i];
        int i2 = this.f31172c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f31172c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4902a();
        m11050b(i);
        Object[] objArr = this.f31171b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31172c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4902a();
        int i = this.f31172c;
        Object[] objArrCopyOf = this.f31171b;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(this.f31171b, zi4.m13610j(objArrCopyOf.length, 3, 2, 1, 10));
            this.f31171b = objArrCopyOf;
        }
        int i2 = this.f31172c;
        this.f31172c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
