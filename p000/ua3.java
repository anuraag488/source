package p000;

import java.lang.invoke.VarHandle;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ua3 extends AbstractC1315x1 implements Collection, dc2 {

    /* JADX INFO: renamed from: a */
    public AbstractC0003a2 f31751a;

    /* JADX INFO: renamed from: b */
    public Object[] f31752b;

    /* JADX INFO: renamed from: c */
    public Object[] f31753c;

    /* JADX INFO: renamed from: d */
    public int f31754d;

    /* JADX INFO: renamed from: e */
    public q50 f31755e = new q50(13);

    /* JADX INFO: renamed from: f */
    public Object[] f31756f;

    /* JADX INFO: renamed from: g */
    public Object[] f31757g;

    /* JADX INFO: renamed from: h */
    public int f31758h;

    public ua3(AbstractC0003a2 abstractC0003a2, Object[] objArr, Object[] objArr2, int i) {
        this.f31751a = abstractC0003a2;
        this.f31752b = objArr;
        this.f31753c = objArr2;
        this.f31754d = i;
        this.f31756f = objArr;
        this.f31757g = objArr2;
        this.f31758h = abstractC0003a2.mo103a();
    }

    /* JADX INFO: renamed from: d */
    public static void m11340d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object[] m11341A(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            kd3.m7502a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            kd3.m7502a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM11361t = m11361t(objArr);
        int iM11819C = vd6.m11819C(i, i2);
        int i3 = i2 - 5;
        objArrM11361t[iM11819C] = m11341A((Object[]) objArrM11361t[iM11819C], i, i3, it);
        while (true) {
            iM11819C++;
            if (iM11819C >= 32 || !it.hasNext()) {
                break;
            }
            objArrM11361t[iM11819C] = m11341A((Object[]) objArrM11361t[iM11819C], 0, i3, it);
        }
        return objArrM11361t;
    }

    /* JADX INFO: renamed from: B */
    public final Object[] m11342B(Object[] objArr, int i, Object[][] objArr2) {
        C1018p1 c1018p1M13010K = y70.m13010K(objArr2);
        int i2 = i >> 5;
        int i3 = this.f31754d;
        Object[] objArrM11341A = i2 < (1 << i3) ? m11341A(objArr, i, i3, c1018p1M13010K) : m11361t(objArr);
        while (c1018p1M13010K.hasNext()) {
            this.f31754d += 5;
            objArrM11341A = m11364w(objArrM11341A);
            int i4 = this.f31754d;
            m11341A(objArrM11341A, 1 << i4, i4, c1018p1M13010K);
        }
        return objArrM11341A;
    }

    /* JADX INFO: renamed from: C */
    public final void m11343C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f31758h;
        int i2 = i >> 5;
        int i3 = this.f31754d;
        if (i2 > (1 << i3)) {
            this.f31756f = m11344D(this.f31754d + 5, m11364w(objArr), objArr2);
            this.f31757g = objArr3;
            this.f31754d += 5;
            this.f31758h++;
            return;
        }
        if (objArr == null) {
            this.f31756f = objArr2;
            this.f31757g = objArr3;
            this.f31758h = i + 1;
        } else {
            this.f31756f = m11344D(i3, objArr, objArr2);
            this.f31757g = objArr3;
            this.f31758h++;
        }
    }

    /* JADX INFO: renamed from: D */
    public final Object[] m11344D(int i, Object[] objArr, Object[] objArr2) {
        int iM11819C = vd6.m11819C(mo3088a() - 1, i);
        Object[] objArrM11361t = m11361t(objArr);
        if (i == 5) {
            objArrM11361t[iM11819C] = objArr2;
            return objArrM11361t;
        }
        objArrM11361t[iM11819C] = m11344D(i - 5, (Object[]) objArrM11361t[iM11819C], objArr2);
        return objArrM11361t;
    }

    /* JADX INFO: renamed from: E */
    public final int m11345E(yp1 yp1Var, Object[] objArr, int i, int i2, C1392z4 c1392z4, ArrayList arrayList, ArrayList arrayList2) {
        if (m11359r(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) c1392z4.f35744a;
        Object[] objArrM11363v = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) yp1Var.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrM11363v = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m11363v();
                    i2 = 0;
                }
                objArrM11363v[i2] = obj;
                i2++;
            }
        }
        c1392z4.f35744a = objArrM11363v;
        if (objArr2 != objArrM11363v) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: F */
    public final int m11346F(yp1 yp1Var, Object[] objArr, int i, C1392z4 c1392z4) {
        Object[] objArrM11361t = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) yp1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM11361t = m11361t(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM11361t[i2] = obj;
                i2++;
            }
        }
        c1392z4.f35744a = objArrM11361t;
        return i2;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m11347G(yp1 yp1Var) {
        int i;
        yp1 yp1Var2 = yp1Var;
        int iM11353M = m11353M();
        Object[] objArrM11365x = null;
        C1392z4 c1392z4 = new C1392z4(null);
        boolean z = false;
        if (this.f31756f == null) {
            int iM11346F = m11346F(yp1Var2, this.f31757g, iM11353M, c1392z4);
            Object obj = c1392z4.f35744a;
            if (iM11346F == iM11353M) {
                iM11346F = iM11353M;
            } else {
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM11346F, iM11353M, (Object) null);
                this.f31757g = objArr;
                this.f31758h -= iM11353M - iM11346F;
            }
            if (iM11346F != iM11353M) {
                z = true;
            }
        } else {
            AbstractC1166t1 abstractC1166t1M11360s = m11360s(0);
            int iM11346F2 = 32;
            while (iM11346F2 == 32 && abstractC1166t1M11360s.hasNext()) {
                iM11346F2 = m11346F(yp1Var2, (Object[]) abstractC1166t1M11360s.next(), 32, c1392z4);
            }
            if (iM11346F2 == 32) {
                int iM11346F3 = m11346F(yp1Var2, this.f31757g, iM11353M, c1392z4);
                Object obj2 = c1392z4.f35744a;
                if (iM11346F3 == iM11353M) {
                    iM11346F3 = iM11353M;
                } else {
                    Object[] objArr2 = (Object[]) obj2;
                    Arrays.fill(objArr2, iM11346F3, iM11353M, (Object) null);
                    this.f31757g = objArr2;
                    this.f31758h -= iM11353M - iM11346F3;
                }
                if (iM11346F3 == 0) {
                    m11367z(this.f31756f, this.f31758h, this.f31754d);
                }
                if (iM11346F3 != iM11353M) {
                }
            } else {
                int i2 = (abstractC1166t1M11360s.f30715a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM11345E = iM11346F2;
                while (abstractC1166t1M11360s.hasNext()) {
                    iM11345E = m11345E(yp1Var2, (Object[]) abstractC1166t1M11360s.next(), 32, iM11345E, c1392z4, arrayList2, arrayList);
                    yp1Var2 = yp1Var;
                }
                int iM11345E2 = m11345E(yp1Var, this.f31757g, iM11353M, iM11345E, c1392z4, arrayList2, arrayList);
                Object[] objArr3 = (Object[]) c1392z4.f35744a;
                Arrays.fill(objArr3, iM11345E2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM11341A = this.f31756f;
                if (!zIsEmpty) {
                    objArrM11341A = m11341A(objArrM11341A, i2, this.f31754d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    kd3.m7502a("invalid size");
                }
                if (size == 0) {
                    this.f31754d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f31754d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f31754d = i - 5;
                        objArrM11341A = objArrM11341A[0];
                    }
                    objArrM11365x = m11365x(objArrM11341A, i3, i);
                }
                this.f31756f = objArrM11365x;
                this.f31757g = objArr3;
                this.f31758h = size + iM11345E2;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: H */
    public final Object[] m11348H(Object[] objArr, int i, int i2, C1392z4 c1392z4) {
        int iM11819C = vd6.m11819C(i2, i);
        if (i == 0) {
            Object obj = objArr[iM11819C];
            Object[] objArrM11361t = m11361t(objArr);
            int i3 = iM11819C + 1;
            System.arraycopy(objArr, i3, objArrM11361t, iM11819C, 32 - i3);
            objArrM11361t[31] = c1392z4.f35744a;
            c1392z4.f35744a = obj;
            return objArrM11361t;
        }
        int iM11819C2 = objArr[31] == null ? vd6.m11819C(m11350J() - 1, i) : 31;
        Object[] objArrM11361t2 = m11361t(objArr);
        int i4 = i - 5;
        int i5 = iM11819C + 1;
        if (i5 <= iM11819C2) {
            while (true) {
                objArrM11361t2[iM11819C2] = m11348H((Object[]) objArrM11361t2[iM11819C2], i4, 0, c1392z4);
                if (iM11819C2 == i5) {
                    break;
                }
                iM11819C2--;
            }
        }
        objArrM11361t2[iM11819C] = m11348H((Object[]) objArrM11361t2[iM11819C], i4, i2, c1392z4);
        return objArrM11361t2;
    }

    /* JADX INFO: renamed from: I */
    public final Object m11349I(Object[] objArr, int i, int i2, int i3) {
        int iMo3088a = mo3088a() - i;
        Object[] objArr2 = this.f31757g;
        if (iMo3088a == 1) {
            Object obj = objArr2[0];
            m11367z(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM11361t = m11361t(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrM11361t, i3, iMo3088a - i4);
        objArrM11361t[iMo3088a - 1] = null;
        this.f31756f = objArr;
        this.f31757g = objArrM11361t;
        this.f31758h = (i + iMo3088a) - 1;
        this.f31754d = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: J */
    public final int m11350J() {
        int i = this.f31758h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: K */
    public final Object[] m11351K(Object[] objArr, int i, int i2, Object obj, C1392z4 c1392z4) {
        int iM11819C = vd6.m11819C(i2, i);
        Object[] objArrM11361t = m11361t(objArr);
        if (i != 0) {
            objArrM11361t[iM11819C] = m11351K((Object[]) objArrM11361t[iM11819C], i - 5, i2, obj, c1392z4);
            return objArrM11361t;
        }
        if (objArrM11361t != objArr) {
            ((AbstractList) this).modCount++;
        }
        c1392z4.f35744a = objArrM11361t[iM11819C];
        objArrM11361t[iM11819C] = obj;
        return objArrM11361t;
    }

    /* JADX INFO: renamed from: L */
    public final void m11352L(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM11363v;
        if (i3 < 1) {
            kd3.m7502a("requires at least one nullBuffer");
        }
        Object[] objArrM11361t = m11361t(objArr);
        objArr2[0] = objArrM11361t;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC0990oo.m9198S(size + 1, i4, i2, objArrM11361t, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM11363v = objArrM11361t;
            } else {
                objArrM11363v = m11363v();
                i3--;
                objArr2[i3] = objArrM11363v;
            }
            int i7 = i2 - i6;
            AbstractC0990oo.m9198S(0, i7, i2, objArrM11361t, objArr3);
            AbstractC0990oo.m9198S(size + 1, i4, i7, objArrM11361t, objArrM11363v);
            objArr3 = objArrM11363v;
        }
        Iterator it = collection.iterator();
        m11340d(objArrM11361t, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM11363v2 = m11363v();
            m11340d(objArrM11363v2, 0, it);
            objArr2[i8] = objArrM11363v2;
        }
        m11340d(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: M */
    public final int m11353M() {
        int i = this.f31758h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: a */
    public final int mo3088a() {
        return this.f31758h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        gq6.m6088m(i, mo3088a());
        if (i == mo3088a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM11350J = m11350J();
        if (i >= iM11350J) {
            m11358q(this.f31756f, i - iM11350J, obj);
        } else {
            C1392z4 c1392z4 = new C1392z4(null);
            m11358q(m11357m(this.f31756f, this.f31754d, i, obj, c1392z4), 0, c1392z4.f35744a);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM11363v;
        gq6.m6088m(i, this.f31758h);
        if (i == this.f31758h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f31758h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f31757g;
            Object[] objArrM11361t = m11361t(objArr);
            System.arraycopy(objArr, i3, objArrM11361t, size2 + 1, m11353M() - i3);
            m11340d(objArrM11361t, i3, collection.iterator());
            this.f31757g = objArrM11361t;
            this.f31758h = collection.size() + this.f31758h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM11353M = m11353M();
        int size3 = collection.size() + this.f31758h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m11350J()) {
            objArrM11363v = m11363v();
            collection2 = collection;
            m11352L(collection2, i, this.f31757g, iM11353M, objArr2, size, objArrM11363v);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f31757g;
            if (size3 > iM11353M) {
                int i4 = size3 - iM11353M;
                Object[] objArrM11362u = m11362u(i4, objArr3);
                m11356l(collection2, i, i4, objArr2, size, objArrM11362u);
                objArr2 = objArr2;
                objArrM11363v = objArrM11362u;
            } else {
                objArrM11363v = m11363v();
                int i5 = iM11353M - size3;
                System.arraycopy(objArr3, i5, objArrM11363v, 0, iM11353M - i5);
                int i6 = 32 - i5;
                Object[] objArrM11362u2 = m11362u(i6, this.f31757g);
                int i7 = size - 1;
                objArr2[i7] = objArrM11362u2;
                m11356l(collection2, i, i6, objArr2, i7, objArrM11362u2);
                collection2 = collection2;
            }
        }
        this.f31756f = m11342B(this.f31756f, i2, objArr2);
        this.f31757g = objArrM11363v;
        this.f31758h = collection2.size() + this.f31758h;
        return true;
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: b */
    public final Object mo3089b(int i) {
        gq6.m6087l(i, mo3088a());
        ((AbstractList) this).modCount++;
        int iM11350J = m11350J();
        if (i >= iM11350J) {
            return m11349I(this.f31756f, iM11350J, this.f31754d, i - iM11350J);
        }
        C1392z4 c1392z4 = new C1392z4(this.f31757g[0]);
        m11349I(m11348H(this.f31756f, this.f31754d, i, c1392z4), iM11350J, this.f31754d, 0);
        return c1392z4.f35744a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0003a2 m11354c() {
        AbstractC0003a2 ta3Var;
        Object[] objArr = this.f31756f;
        if (objArr == this.f31752b && this.f31757g == this.f31753c) {
            ta3Var = this.f31751a;
        } else {
            this.f31755e = new q50((byte) 13);
            this.f31752b = objArr;
            Object[] objArr2 = this.f31757g;
            this.f31753c = objArr2;
            if (objArr == null) {
                ta3Var = objArr2.length == 0 ? q84.f28304b : new q84(Arrays.copyOf(objArr2, this.f31758h));
            } else {
                ta3Var = new ta3(objArr, objArr2, this.f31758h, this.f31754d);
            }
        }
        this.f31751a = ta3Var;
        return ta3Var;
    }

    /* JADX INFO: renamed from: e */
    public final int m11355e() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        gq6.m6087l(i, mo3088a());
        if (m11350J() <= i) {
            objArr = this.f31757g;
        } else {
            Object[] objArr2 = this.f31756f;
            for (int i2 = this.f31754d; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[vd6.m11819C(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m11356l(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f31756f == null) {
            C1077qn.m9989o("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC1166t1 abstractC1166t1M11360s = m11360s(m11350J() >> 5);
        int i5 = i3;
        Object[] objArrM11362u = objArr2;
        while (abstractC1166t1M11360s.f30715a - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC1166t1M11360s.previous();
            AbstractC0990oo.m9198S(0, 32 - i2, 32, objArr3, objArrM11362u);
            objArrM11362u = m11362u(i2, objArr3);
            i5--;
            objArr[i5] = objArrM11362u;
        }
        Object[] objArr4 = (Object[]) abstractC1166t1M11360s.previous();
        int iM11350J = i3 - (((m11350J() >> 5) - 1) - i4);
        if (iM11350J < i3) {
            objArr2 = objArr[iM11350J];
        }
        m11352L(collection, i, objArr4, 32, objArr, iM11350J, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        gq6.m6088m(i, this.f31758h);
        wa3 wa3Var = new wa3(i, this.f31758h);
        wa3Var.f33193c = this;
        wa3Var.f33194d = ((AbstractList) this).modCount;
        wa3Var.f33196f = -1;
        wa3Var.m12188b();
        VarHandle.storeStoreFence();
        return wa3Var;
    }

    /* JADX INFO: renamed from: m */
    public final Object[] m11357m(Object[] objArr, int i, int i2, Object obj, C1392z4 c1392z4) {
        Object obj2;
        int iM11819C = vd6.m11819C(i2, i);
        if (i == 0) {
            c1392z4.f35744a = objArr[31];
            Object[] objArrM11361t = m11361t(objArr);
            System.arraycopy(objArr, iM11819C, objArrM11361t, iM11819C + 1, 31 - iM11819C);
            objArrM11361t[iM11819C] = obj;
            return objArrM11361t;
        }
        Object[] objArrM11361t2 = m11361t(objArr);
        int i3 = i - 5;
        objArrM11361t2[iM11819C] = m11357m((Object[]) objArrM11361t2[iM11819C], i3, i2, obj, c1392z4);
        while (true) {
            iM11819C++;
            if (iM11819C >= 32 || (obj2 = objArrM11361t2[iM11819C]) == null) {
                break;
            }
            objArrM11361t2[iM11819C] = m11357m((Object[]) obj2, i3, 0, c1392z4.f35744a, c1392z4);
        }
        return objArrM11361t2;
    }

    /* JADX INFO: renamed from: q */
    public final void m11358q(Object[] objArr, int i, Object obj) {
        int iM11353M = m11353M();
        Object[] objArrM11361t = m11361t(this.f31757g);
        Object[] objArr2 = this.f31757g;
        if (iM11353M >= 32) {
            Object obj2 = objArr2[31];
            AbstractC0990oo.m9198S(i + 1, i, 31, objArr2, objArrM11361t);
            objArrM11361t[i] = obj;
            m11343C(objArr, objArrM11361t, m11364w(obj2));
            return;
        }
        AbstractC0990oo.m9198S(i + 1, i, iM11353M, objArr2, objArrM11361t);
        objArrM11361t[i] = obj;
        this.f31756f = objArr;
        this.f31757g = objArrM11361t;
        this.f31758h++;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11359r(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f31755e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        C1389z1 c1389z1 = new C1389z1((byte) 1);
        c1389z1.f35690b = collection;
        VarHandle.storeStoreFence();
        return m11347G(c1389z1);
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC1166t1 m11360s(int i) {
        Object[] objArr = this.f31756f;
        if (objArr == null) {
            C1077qn.m9989o("Invalid root");
            return null;
        }
        int iM11350J = m11350J() >> 5;
        gq6.m6088m(i, iM11350J);
        int i2 = this.f31754d;
        if (i2 != 0) {
            return new yp4(objArr, i, iM11350J, i2 / 5);
        }
        byte b = 1;
        x30 x30Var = new x30(i, b, b);
        x30Var.f33952d = objArr;
        VarHandle.storeStoreFence();
        return x30Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        gq6.m6087l(i, mo3088a());
        if (m11350J() > i) {
            C1392z4 c1392z4 = new C1392z4(null);
            this.f31756f = m11351K(this.f31756f, this.f31754d, i, obj, c1392z4);
            return c1392z4.f35744a;
        }
        Object[] objArrM11361t = m11361t(this.f31757g);
        if (objArrM11361t != this.f31757g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM11361t[i2];
        objArrM11361t[i2] = obj;
        this.f31757g = objArrM11361t;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m11361t(Object[] objArr) {
        if (objArr == null) {
            return m11363v();
        }
        if (m11359r(objArr)) {
            return objArr;
        }
        Object[] objArrM11363v = m11363v();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0990oo.m9201V(0, length, 6, objArr, objArrM11363v);
        return objArrM11363v;
    }

    /* JADX INFO: renamed from: u */
    public final Object[] m11362u(int i, Object[] objArr) {
        if (m11359r(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrM11363v = m11363v();
        System.arraycopy(objArr, 0, objArrM11363v, i, 32 - i);
        return objArrM11363v;
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m11363v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f31755e;
        return objArr;
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m11364w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f31755e;
        return objArr;
    }

    /* JADX INFO: renamed from: x */
    public final Object[] m11365x(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            kd3.m7502a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM11819C = vd6.m11819C(i, i2);
        Object objM11365x = m11365x((Object[]) objArr[iM11819C], i, i2 - 5);
        if (iM11819C < 31) {
            int i3 = iM11819C + 1;
            if (objArr[i3] != null) {
                if (m11359r(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM11363v = m11363v();
                System.arraycopy(objArr, 0, objArrM11363v, 0, i3);
                objArr = objArrM11363v;
            }
        }
        if (objM11365x == objArr[iM11819C]) {
            return objArr;
        }
        Object[] objArrM11361t = m11361t(objArr);
        objArrM11361t[iM11819C] = objM11365x;
        return objArrM11361t;
    }

    /* JADX INFO: renamed from: y */
    public final Object[] m11366y(Object[] objArr, int i, int i2, C1392z4 c1392z4) {
        Object[] objArrM11366y;
        int iM11819C = vd6.m11819C(i2 - 1, i);
        if (i == 5) {
            c1392z4.f35744a = objArr[iM11819C];
            objArrM11366y = null;
        } else {
            objArrM11366y = m11366y((Object[]) objArr[iM11819C], i - 5, i2, c1392z4);
        }
        if (objArrM11366y == null && iM11819C == 0) {
            return null;
        }
        Object[] objArrM11361t = m11361t(objArr);
        objArrM11361t[iM11819C] = objArrM11366y;
        return objArrM11361t;
    }

    /* JADX INFO: renamed from: z */
    public final void m11367z(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f31756f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f31757g = objArr;
            this.f31758h = i;
            this.f31754d = i2;
            return;
        }
        C1392z4 c1392z4 = new C1392z4(null);
        Object[] objArrM11366y = m11366y(objArr, i2, i, c1392z4);
        this.f31757g = (Object[]) c1392z4.f35744a;
        this.f31758h = i;
        if (objArrM11366y[1] == null) {
            this.f31756f = (Object[]) objArrM11366y[0];
            this.f31754d = i2 - 5;
        } else {
            this.f31756f = objArrM11366y;
            this.f31754d = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM11353M = m11353M();
        if (iM11353M < 32) {
            Object[] objArrM11361t = m11361t(this.f31757g);
            objArrM11361t[iM11353M] = obj;
            this.f31757g = objArrM11361t;
            this.f31758h = mo3088a() + 1;
        } else {
            m11343C(this.f31756f, this.f31757g, m11364w(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM11353M = m11353M();
        Iterator it = collection.iterator();
        if (32 - iM11353M >= collection.size()) {
            Object[] objArrM11361t = m11361t(this.f31757g);
            m11340d(objArrM11361t, iM11353M, it);
            this.f31757g = objArrM11361t;
            this.f31758h = collection.size() + this.f31758h;
            return true;
        }
        int size = ((collection.size() + iM11353M) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM11361t2 = m11361t(this.f31757g);
        m11340d(objArrM11361t2, iM11353M, it);
        objArr[0] = objArrM11361t2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM11363v = m11363v();
            m11340d(objArrM11363v, 0, it);
            objArr[i] = objArrM11363v;
        }
        this.f31756f = m11342B(this.f31756f, m11350J(), objArr);
        Object[] objArrM11363v2 = m11363v();
        m11340d(objArrM11363v2, 0, it);
        this.f31757g = objArrM11363v2;
        this.f31758h = collection.size() + this.f31758h;
        return true;
    }
}
