package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wv5 extends z06 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f33789d;

    /* JADX INFO: renamed from: e */
    public static final wv5 f33790e;

    /* JADX INFO: renamed from: b */
    public Object[] f33791b;

    /* JADX INFO: renamed from: c */
    public int f33792c;

    static {
        Object[] objArr = new Object[0];
        f33789d = objArr;
        f33790e = new wv5(objArr, 0, false);
    }

    public wv5(Object[] objArr, int i, boolean z) {
        this.f35688a = z;
        this.f33791b = objArr;
        this.f33792c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m13288a();
        if (i < 0 || i > (i2 = this.f33792c)) {
            xd2.m12665l(this.f33792c, c75.m3883o("Index:", i, ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f33791b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f33791b, 0, objArr2, 0, i);
            System.arraycopy(this.f33791b, i, objArr2, i3, this.f33792c - i);
            this.f33791b = objArr2;
        }
        this.f33791b[i] = obj;
        this.f33792c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ wv5 m12430b(int i) {
        if (i >= this.f33792c) {
            return new wv5(i == 0 ? f33789d : Arrays.copyOf(this.f33791b, i), this.f33792c, true);
        }
        ds3.m4665g();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m12431c(int i) {
        if (i < 0 || i >= this.f33792c) {
            xd2.m12665l(this.f33792c, c75.m3883o("Index:", i, ", Size:"));
        }
    }

    @Override // p000.z06, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.f33792c;
            if (i == list.size()) {
                if (!(obj instanceof wv5)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.f33791b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                wv5 wv5Var = (wv5) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.f33791b[i3].equals(wv5Var.f33791b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m12431c(i);
        return this.f33791b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f33792c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f33791b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p000.z06, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m13288a();
        m12431c(i);
        Object[] objArr = this.f33791b;
        Object obj = objArr[i];
        int i2 = this.f33792c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f33792c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m13288a();
        m12431c(i);
        Object[] objArr = this.f33791b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33792c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13288a();
        int i = this.f33792c;
        Object[] objArrCopyOf = this.f33791b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.f33791b, zi4.m13610j(length, 3, 2, 1, 10));
            this.f33791b = objArrCopyOf;
        }
        int i2 = this.f33792c;
        this.f33792c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
