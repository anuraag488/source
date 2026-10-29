package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ga6 extends y36 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f19692d;

    /* JADX INFO: renamed from: e */
    public static final ga6 f19693e;

    /* JADX INFO: renamed from: b */
    public Object[] f19694b;

    /* JADX INFO: renamed from: c */
    public int f19695c;

    static {
        Object[] objArr = new Object[0];
        f19692d = objArr;
        f19693e = new ga6(objArr, 0, false);
    }

    public ga6(Object[] objArr, int i, boolean z) {
        super(z);
        this.f19694b = objArr;
        this.f19695c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m12817a();
        if (i < 0 || i > (i2 = this.f19695c)) {
            xy4.m12792u(zi4.m13618r(i, this.f19695c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f19694b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19694b, 0, objArr2, 0, i);
            System.arraycopy(this.f19694b, i, objArr2, i3, this.f19695c - i);
            this.f19694b = objArr2;
        }
        this.f19694b[i] = obj;
        this.f19695c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m5949b(int i) {
        if (i < 0 || i >= this.f19695c) {
            xy4.m12792u(zi4.m13618r(i, this.f19695c, "Index:", ", Size:"));
        }
    }

    @Override // p000.y36, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.f19695c;
            if (i == list.size()) {
                if (!(obj instanceof ga6)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.f19694b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                ga6 ga6Var = (ga6) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.f19694b[i3].equals(ga6Var.f19694b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m5949b(i);
        return this.f19694b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f19695c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f19694b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p000.f76
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ f76 mo5612i(int i) {
        if (i >= this.f19695c) {
            return new ga6(i == 0 ? f19692d : Arrays.copyOf(this.f19694b, i), this.f19695c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // p000.y36, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m12817a();
        m5949b(i);
        Object[] objArr = this.f19694b;
        Object obj = objArr[i];
        int i2 = this.f19695c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f19695c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m12817a();
        m5949b(i);
        Object[] objArr = this.f19694b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19695c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m12817a();
        int i = this.f19695c;
        Object[] objArrCopyOf = this.f19694b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.f19694b, zi4.m13610j(length, 3, 2, 1, 10));
            this.f19694b = objArrCopyOf;
        }
        int i2 = this.f19695c;
        this.f19695c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
