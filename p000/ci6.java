package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ci6 extends hf6 implements RandomAccess, ii6, zj6 {

    /* JADX INFO: renamed from: d */
    public static final int[] f16052d;

    /* JADX INFO: renamed from: e */
    public static final ci6 f16053e;

    /* JADX INFO: renamed from: b */
    public int[] f16054b;

    /* JADX INFO: renamed from: c */
    public int f16055c;

    static {
        int[] iArr = new int[0];
        f16052d = iArr;
        f16053e = new ci6(iArr, 0, false);
    }

    public ci6(int[] iArr, int i, boolean z) {
        super(z);
        this.f16054b = iArr;
        this.f16055c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m6385a();
        if (i < 0 || i > (i2 = this.f16055c)) {
            xy4.m12792u(C1411zn.m13641c(this.f16055c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f16054b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16054b, 0, iArr2, 0, i);
            System.arraycopy(this.f16054b, i, iArr2, i3, this.f16055c - i);
            this.f16054b = iArr2;
        }
        this.f16054b[i] = iIntValue;
        this.f16055c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.hf6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m6385a();
        Charset charset = ni6.f25875a;
        collection.getClass();
        if (!(collection instanceof ci6)) {
            return super.addAll(collection);
        }
        ci6 ci6Var = (ci6) collection;
        int i = ci6Var.f16055c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16055c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.f16054b;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.f16054b = iArrCopyOf;
        }
        System.arraycopy(ci6Var.f16054b, 0, iArrCopyOf, this.f16055c, ci6Var.f16055c);
        this.f16055c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.mi6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ci6 mo4032o(int i) {
        if (i >= this.f16055c) {
            return new ci6(i == 0 ? f16052d : Arrays.copyOf(this.f16054b, i), this.f16055c, true);
        }
        ds3.m4665g();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m4029c(int i) {
        m4031e(i);
        return this.f16054b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m4030d(int i) {
        m6385a();
        int i2 = this.f16055c;
        int[] iArr = this.f16054b;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16054b, 0, iArr, 0, this.f16055c);
            this.f16054b = iArr;
        }
        int i3 = this.f16055c;
        this.f16055c = i3 + 1;
        iArr[i3] = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m4031e(int i) {
        if (i < 0 || i >= this.f16055c) {
            xy4.m12792u(C1411zn.m13641c(this.f16055c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci6)) {
            return super.equals(obj);
        }
        ci6 ci6Var = (ci6) obj;
        if (this.f16055c == ci6Var.f16055c) {
            int[] iArr = ci6Var.f16054b;
            for (int i = 0; i < this.f16055c; i++) {
                if (this.f16054b[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m4031e(i);
        return Integer.valueOf(this.f16054b[i]);
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16055c; i2++) {
            i = (i * 31) + this.f16054b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f16055c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16054b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m6385a();
        m4031e(i);
        int[] iArr = this.f16054b;
        int i2 = iArr[i];
        int i3 = this.f16055c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f16055c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m6385a();
        if (i2 < i) {
            xy4.m12792u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f16054b;
        System.arraycopy(iArr, i2, iArr, i, this.f16055c - i2);
        this.f16055c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m6385a();
        m4031e(i);
        int[] iArr = this.f16054b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16055c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m4030d(((Integer) obj).intValue());
        return true;
    }
}
