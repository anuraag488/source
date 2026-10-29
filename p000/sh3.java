package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sh3 extends AbstractC0560d2 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f30274d;

    /* JADX INFO: renamed from: e */
    public static final sh3 f30275e;

    /* JADX INFO: renamed from: b */
    public Object[] f30276b;

    /* JADX INFO: renamed from: c */
    public int f30277c;

    static {
        Object[] objArr = new Object[0];
        f30274d = objArr;
        f30275e = new sh3(objArr, 0, false);
    }

    public sh3(Object[] objArr, int i, boolean z) {
        this.f16738a = z;
        this.f30276b = objArr;
        this.f30277c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m4281a();
        if (i < 0 || i > (i2 = this.f30277c)) {
            xd2.m12665l(this.f30277c, c75.m3883o("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f30276b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[zi4.m13610j(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f30276b, 0, objArr2, 0, i);
            System.arraycopy(this.f30276b, i, objArr2, i + 1, this.f30277c - i);
            this.f30276b = objArr2;
        }
        this.f30276b[i] = obj;
        this.f30277c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m10786b(int i) {
        if (i < 0 || i >= this.f30277c) {
            xd2.m12665l(this.f30277c, c75.m3883o("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10786b(i);
        return this.f30276b[i];
    }

    @Override // p000.i62
    /* JADX INFO: renamed from: n */
    public final i62 mo6682n(int i) {
        if (i >= this.f30277c) {
            return new sh3(i == 0 ? f30274d : Arrays.copyOf(this.f30276b, i), this.f30277c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // p000.AbstractC0560d2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m4281a();
        m10786b(i);
        Object[] objArr = this.f30276b;
        Object obj = objArr[i];
        int i2 = this.f30277c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f30277c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4281a();
        m10786b(i);
        Object[] objArr = this.f30276b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30277c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4281a();
        int i = this.f30277c;
        Object[] objArrCopyOf = this.f30276b;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(this.f30276b, zi4.m13610j(objArrCopyOf.length, 3, 2, 1, 10));
            this.f30276b = objArrCopyOf;
        }
        int i2 = this.f30277c;
        this.f30277c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
