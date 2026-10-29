package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aq6 extends jm6 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f14789d;

    /* JADX INFO: renamed from: e */
    public static final aq6 f14790e;

    /* JADX INFO: renamed from: b */
    public Object[] f14791b;

    /* JADX INFO: renamed from: c */
    public int f14792c;

    static {
        Object[] objArr = new Object[0];
        f14789d = objArr;
        f14790e = new aq6(objArr, 0, false);
    }

    public aq6(Object[] objArr, int i, boolean z) {
        super(z);
        this.f14791b = objArr;
        this.f14792c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m7189a();
        if (i < 0 || i > (i2 = this.f14792c)) {
            xy4.m12792u(zi4.m13618r(i, this.f14792c, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f14791b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zi4.m13610j(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14791b, 0, objArr2, 0, i);
            System.arraycopy(this.f14791b, i, objArr2, i3, this.f14792c - i);
            this.f14791b = objArr2;
        }
        this.f14791b[i] = obj;
        this.f14792c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m3122b(int i) {
        if (i < 0 || i >= this.f14792c) {
            xy4.m12792u(zi4.m13618r(i, this.f14792c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3122b(i);
        return this.f14791b[i];
    }

    @Override // p000.qo6
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ qo6 mo3123i(int i) {
        if (i >= this.f14792c) {
            return new aq6(i == 0 ? f14789d : Arrays.copyOf(this.f14791b, i), this.f14792c, true);
        }
        ds3.m4665g();
        return null;
    }

    @Override // p000.jm6, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7189a();
        m3122b(i);
        Object[] objArr = this.f14791b;
        Object obj = objArr[i];
        int i2 = this.f14792c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f14792c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7189a();
        m3122b(i);
        Object[] objArr = this.f14791b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14792c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7189a();
        int i = this.f14792c;
        Object[] objArrCopyOf = this.f14791b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.f14791b, zi4.m13610j(length, 3, 2, 1, 10));
            this.f14791b = objArrCopyOf;
        }
        int i2 = this.f14792c;
        this.f14792c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
