package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u66 extends y36 implements RandomAccess, c76 {

    /* JADX INFO: renamed from: d */
    public static final int[] f31683d;

    /* JADX INFO: renamed from: e */
    public static final u66 f31684e;

    /* JADX INFO: renamed from: b */
    public int[] f31685b;

    /* JADX INFO: renamed from: c */
    public int f31686c;

    static {
        int[] iArr = new int[0];
        f31683d = iArr;
        f31684e = new u66(iArr, 0, false);
    }

    public u66(int[] iArr, int i, boolean z) {
        super(z);
        this.f31685b = iArr;
        this.f31686c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m12817a();
        if (i < 0 || i > (i2 = this.f31686c)) {
            xy4.m12792u(zi4.m13618r(i, this.f31686c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f31685b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f31685b, 0, iArr2, 0, i);
            System.arraycopy(this.f31685b, i, iArr2, i3, this.f31686c - i);
            this.f31685b = iArr2;
        }
        this.f31685b[i] = iIntValue;
        this.f31686c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.y36, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m12817a();
        collection.getClass();
        if (!(collection instanceof u66)) {
            return super.addAll(collection);
        }
        u66 u66Var = (u66) collection;
        int i = u66Var.f31686c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31686c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.f31685b;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.f31685b = iArrCopyOf;
        }
        System.arraycopy(u66Var.f31685b, 0, iArrCopyOf, this.f31686c, u66Var.f31686c);
        this.f31686c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m11265b(int i) {
        m11268e(i);
        return this.f31685b[i];
    }

    @Override // p000.f76
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final u66 mo5612i(int i) {
        if (i >= this.f31686c) {
            return new u66(i == 0 ? f31683d : Arrays.copyOf(this.f31685b, i), this.f31686c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11267d(int i) {
        m12817a();
        int i2 = this.f31686c;
        int[] iArr = this.f31685b;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f31685b, 0, iArr, 0, this.f31686c);
            this.f31685b = iArr;
        }
        int i3 = this.f31686c;
        this.f31686c = i3 + 1;
        iArr[i3] = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m11268e(int i) {
        if (i < 0 || i >= this.f31686c) {
            xy4.m12792u(zi4.m13618r(i, this.f31686c, "Index:", ", Size:"));
        }
    }

    @Override // p000.y36, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u66)) {
            return super.equals(obj);
        }
        u66 u66Var = (u66) obj;
        if (this.f31686c == u66Var.f31686c) {
            int[] iArr = u66Var.f31685b;
            for (int i = 0; i < this.f31686c; i++) {
                if (this.f31685b[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m11268e(i);
        return Integer.valueOf(this.f31685b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31686c; i2++) {
            i = (i * 31) + this.f31685b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f31686c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31685b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.y36, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m12817a();
        m11268e(i);
        int[] iArr = this.f31685b;
        int i2 = iArr[i];
        int i3 = this.f31686c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f31686c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m12817a();
        if (i2 < i) {
            xy4.m12792u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f31685b;
        System.arraycopy(iArr, i2, iArr, i, this.f31686c - i2);
        this.f31686c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m12817a();
        m11268e(i);
        int[] iArr = this.f31685b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31686c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m11267d(((Integer) obj).intValue());
        return true;
    }
}
