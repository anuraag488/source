package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lo6 extends jm6 implements RandomAccess, oo6 {

    /* JADX INFO: renamed from: d */
    public static final int[] f24238d;

    /* JADX INFO: renamed from: e */
    public static final lo6 f24239e;

    /* JADX INFO: renamed from: b */
    public int[] f24240b;

    /* JADX INFO: renamed from: c */
    public int f24241c;

    static {
        int[] iArr = new int[0];
        f24238d = iArr;
        f24239e = new lo6(iArr, 0, false);
    }

    public lo6(int[] iArr, int i, boolean z) {
        super(z);
        this.f24240b = iArr;
        this.f24241c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m7189a();
        if (i < 0 || i > (i2 = this.f24241c)) {
            xy4.m12792u(zi4.m13618r(i, this.f24241c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f24240b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24240b, 0, iArr2, 0, i);
            System.arraycopy(this.f24240b, i, iArr2, i3, this.f24241c - i);
            this.f24240b = iArr2;
        }
        this.f24240b[i] = iIntValue;
        this.f24241c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.jm6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7189a();
        Charset charset = ro6.f29484a;
        collection.getClass();
        if (!(collection instanceof lo6)) {
            return super.addAll(collection);
        }
        lo6 lo6Var = (lo6) collection;
        int i = lo6Var.f24241c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f24241c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.f24240b;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.f24240b = iArrCopyOf;
        }
        System.arraycopy(lo6Var.f24240b, 0, iArrCopyOf, this.f24241c, lo6Var.f24241c);
        this.f24241c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m8065b(int i) {
        m8066c(i);
        return this.f24240b[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m8066c(int i) {
        if (i < 0 || i >= this.f24241c) {
            xy4.m12792u(zi4.m13618r(i, this.f24241c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.jm6, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo6)) {
            return super.equals(obj);
        }
        lo6 lo6Var = (lo6) obj;
        if (this.f24241c == lo6Var.f24241c) {
            int[] iArr = lo6Var.f24240b;
            for (int i = 0; i < this.f24241c; i++) {
                if (this.f24240b[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m8066c(i);
        return Integer.valueOf(this.f24240b[i]);
    }

    @Override // p000.jm6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f24241c; i2++) {
            i = (i * 31) + this.f24240b[i2];
        }
        return i;
    }

    @Override // p000.qo6
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ qo6 mo3123i(int i) {
        if (i >= this.f24241c) {
            return new lo6(i == 0 ? f24238d : Arrays.copyOf(this.f24240b, i), this.f24241c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f24241c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f24240b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.jm6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m7189a();
        m8066c(i);
        int[] iArr = this.f24240b;
        int i2 = iArr[i];
        int i3 = this.f24241c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f24241c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7189a();
        if (i2 < i) {
            xy4.m12792u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f24240b;
        System.arraycopy(iArr, i2, iArr, i, this.f24241c - i2);
        this.f24241c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m7189a();
        m8066c(i);
        int[] iArr = this.f24240b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24241c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m7189a();
        int i = this.f24241c;
        int[] iArr = this.f24240b;
        int length = iArr.length;
        if (i == length) {
            iArr = new int[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24240b, 0, iArr, 0, this.f24241c);
            this.f24240b = iArr;
        }
        int i2 = this.f24241c;
        this.f24241c = i2 + 1;
        iArr[i2] = iIntValue;
        return true;
    }
}
