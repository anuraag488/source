package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ck6 extends hf6 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f16092d;

    /* JADX INFO: renamed from: e */
    public static final ck6 f16093e;

    /* JADX INFO: renamed from: b */
    public Object[] f16094b;

    /* JADX INFO: renamed from: c */
    public int f16095c;

    static {
        Object[] objArr = new Object[0];
        f16092d = objArr;
        f16093e = new ck6(objArr, 0, false);
    }

    public ck6(Object[] objArr, int i, boolean z) {
        super(z);
        this.f16094b = objArr;
        this.f16095c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m6385a();
        if (i < 0 || i > (i2 = this.f16095c)) {
            xy4.m12792u(C1411zn.m13641c(this.f16095c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f16094b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16094b, 0, objArr2, 0, i);
            System.arraycopy(this.f16094b, i, objArr2, i3, this.f16095c - i);
            this.f16094b = objArr2;
        }
        this.f16094b[i] = obj;
        this.f16095c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m4037b(int i) {
        if (i < 0 || i >= this.f16095c) {
            xy4.m12792u(C1411zn.m13641c(this.f16095c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m4037b(i);
        return this.f16094b[i];
    }

    @Override // p000.mi6
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ mi6 mo4032o(int i) {
        if (i >= this.f16095c) {
            return new ck6(i == 0 ? f16092d : Arrays.copyOf(this.f16094b, i), this.f16095c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m6385a();
        m4037b(i);
        Object[] objArr = this.f16094b;
        Object obj = objArr[i];
        int i2 = this.f16095c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f16095c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m6385a();
        m4037b(i);
        Object[] objArr = this.f16094b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16095c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m6385a();
        int i = this.f16095c;
        Object[] objArrCopyOf = this.f16094b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.f16094b, zi4.m13610j(length, 3, 2, 1, 10));
            this.f16094b = objArrCopyOf;
        }
        int i2 = this.f16095c;
        this.f16095c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
