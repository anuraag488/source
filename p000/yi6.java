package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yi6 extends hf6 implements RandomAccess, li6, zj6 {

    /* JADX INFO: renamed from: d */
    public static final long[] f35247d;

    /* JADX INFO: renamed from: e */
    public static final yi6 f35248e;

    /* JADX INFO: renamed from: b */
    public long[] f35249b;

    /* JADX INFO: renamed from: c */
    public int f35250c;

    static {
        long[] jArr = new long[0];
        f35247d = jArr;
        f35248e = new yi6(jArr, 0, false);
    }

    public yi6(long[] jArr, int i, boolean z) {
        super(z);
        this.f35249b = jArr;
        this.f35250c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m6385a();
        if (i < 0 || i > (i2 = this.f35250c)) {
            xy4.m12792u(C1411zn.m13641c(this.f35250c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f35249b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f35249b, 0, jArr2, 0, i);
            System.arraycopy(this.f35249b, i, jArr2, i3, this.f35250c - i);
            this.f35249b = jArr2;
        }
        this.f35249b[i] = jLongValue;
        this.f35250c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.hf6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m6385a();
        Charset charset = ni6.f25875a;
        collection.getClass();
        if (!(collection instanceof yi6)) {
            return super.addAll(collection);
        }
        yi6 yi6Var = (yi6) collection;
        int i = yi6Var.f35250c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35250c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.f35249b;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
            this.f35249b = jArrCopyOf;
        }
        System.arraycopy(yi6Var.f35249b, 0, jArrCopyOf, this.f35250c, yi6Var.f35250c);
        this.f35250c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m13141b(int i) {
        m13144e(i);
        return this.f35249b[i];
    }

    @Override // p000.mi6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final yi6 mo4032o(int i) {
        if (i >= this.f35250c) {
            return new yi6(i == 0 ? f35247d : Arrays.copyOf(this.f35249b, i), this.f35250c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m13143d(long j) {
        m6385a();
        int i = this.f35250c;
        long[] jArr = this.f35249b;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f35249b, 0, jArr, 0, this.f35250c);
            this.f35249b = jArr;
        }
        int i2 = this.f35250c;
        this.f35250c = i2 + 1;
        jArr[i2] = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m13144e(int i) {
        if (i < 0 || i >= this.f35250c) {
            xy4.m12792u(C1411zn.m13641c(this.f35250c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi6)) {
            return super.equals(obj);
        }
        yi6 yi6Var = (yi6) obj;
        if (this.f35250c == yi6Var.f35250c) {
            long[] jArr = yi6Var.f35249b;
            for (int i = 0; i < this.f35250c; i++) {
                if (this.f35249b[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m13144e(i);
        return Long.valueOf(this.f35249b[i]);
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35250c; i2++) {
            long j = this.f35249b[i2];
            Charset charset = ni6.f25875a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f35250c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f35249b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.hf6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m6385a();
        m13144e(i);
        long[] jArr = this.f35249b;
        long j = jArr[i];
        int i2 = this.f35250c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f35250c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m6385a();
        if (i2 < i) {
            xy4.m12792u("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f35249b;
        System.arraycopy(jArr, i2, jArr, i, this.f35250c - i2);
        this.f35250c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m6385a();
        m13144e(i);
        long[] jArr = this.f35249b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35250c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m13143d(((Long) obj).longValue());
        return true;
    }
}
