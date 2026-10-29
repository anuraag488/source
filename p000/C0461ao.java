package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ao */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0461ao extends AbstractC1315x1 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f14716d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f14717a;

    /* JADX INFO: renamed from: b */
    public Object[] f14718b;

    /* JADX INFO: renamed from: c */
    public int f14719c;

    public C0461ao(int i) {
        this.f14718b = new Object[256];
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: a */
    public final int mo3088a() {
        return this.f14719c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f14719c;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m3097s();
        m3091d(this.f14719c + 1);
        int iM3096r = m3096r(this.f14717a + i);
        int i3 = this.f14719c;
        int i4 = (i3 + 1) >> 1;
        int i5 = this.f14717a;
        if (i < i4) {
            int length = iM3096r == 0 ? this.f14718b.length - 1 : iM3096r - 1;
            int length2 = i5 == 0 ? this.f14718b.length - 1 : i5 - 1;
            Object[] objArr = this.f14718b;
            if (length >= i5) {
                objArr[length2] = objArr[i5];
                AbstractC0990oo.m9198S(i5, i5 + 1, length + 1, objArr, objArr);
            } else {
                AbstractC0990oo.m9198S(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.f14718b;
                objArr2[objArr2.length - 1] = objArr2[0];
                AbstractC0990oo.m9198S(0, 1, length + 1, objArr2, objArr2);
            }
            this.f14718b[length] = obj;
            this.f14717a = length2;
        } else {
            int iM3096r2 = m3096r(i3 + i5);
            Object[] objArr3 = this.f14718b;
            if (iM3096r < iM3096r2) {
                AbstractC0990oo.m9198S(iM3096r + 1, iM3096r, iM3096r2, objArr3, objArr3);
            } else {
                AbstractC0990oo.m9198S(1, 0, iM3096r2, objArr3, objArr3);
                Object[] objArr4 = this.f14718b;
                objArr4[0] = objArr4[objArr4.length - 1];
                AbstractC0990oo.m9198S(iM3096r + 1, iM3096r, objArr4.length - 1, objArr4, objArr4);
            }
            this.f14718b[iM3096r] = obj;
        }
        this.f14719c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f14719c;
        if (i < 0 || i > i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f14719c) {
            return addAll(collection);
        }
        m3097s();
        m3091d(collection.size() + this.f14719c);
        int iM3096r = m3096r(this.f14719c + this.f14717a);
        int iM3096r2 = m3096r(this.f14717a + i);
        int size = collection.size();
        if (i >= ((this.f14719c + 1) >> 1)) {
            int i3 = iM3096r2 + size;
            Object[] objArr = this.f14718b;
            if (iM3096r2 < iM3096r) {
                int i4 = size + iM3096r;
                if (i4 <= objArr.length) {
                    AbstractC0990oo.m9198S(i3, iM3096r2, iM3096r, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    AbstractC0990oo.m9198S(i3 - objArr.length, iM3096r2, iM3096r, objArr, objArr);
                } else {
                    int length = iM3096r - (i4 - objArr.length);
                    AbstractC0990oo.m9198S(0, length, iM3096r, objArr, objArr);
                    Object[] objArr2 = this.f14718b;
                    AbstractC0990oo.m9198S(i3, iM3096r2, length, objArr2, objArr2);
                }
            } else {
                AbstractC0990oo.m9198S(size, 0, iM3096r, objArr, objArr);
                Object[] objArr3 = this.f14718b;
                if (i3 >= objArr3.length) {
                    AbstractC0990oo.m9198S(i3 - objArr3.length, iM3096r2, objArr3.length, objArr3, objArr3);
                } else {
                    AbstractC0990oo.m9198S(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f14718b;
                    AbstractC0990oo.m9198S(i3, iM3096r2, objArr4.length - size, objArr4, objArr4);
                }
            }
            m3090c(iM3096r2, collection);
            return true;
        }
        int i5 = this.f14717a;
        int length2 = i5 - size;
        Object[] objArr5 = this.f14718b;
        if (iM3096r2 < i5) {
            AbstractC0990oo.m9198S(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f14718b;
            if (size >= iM3096r2) {
                AbstractC0990oo.m9198S(objArr6.length - size, 0, iM3096r2, objArr6, objArr6);
            } else {
                AbstractC0990oo.m9198S(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f14718b;
                AbstractC0990oo.m9198S(0, size, iM3096r2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC0990oo.m9198S(length2, i5, iM3096r2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iM3096r2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC0990oo.m9198S(length2, i5, iM3096r2, objArr5, objArr5);
            } else {
                AbstractC0990oo.m9198S(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f14718b;
                AbstractC0990oo.m9198S(0, this.f14717a + length3, iM3096r2, objArr8, objArr8);
            }
        }
        this.f14717a = length2;
        m3090c(m3094m(iM3096r2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m3097s();
        m3091d(this.f14719c + 1);
        int length = this.f14717a;
        if (length == 0) {
            length = this.f14718b.length;
        }
        int i = length - 1;
        this.f14717a = i;
        this.f14718b[i] = obj;
        this.f14719c++;
    }

    public final void addLast(Object obj) {
        m3097s();
        m3091d(this.f14719c + 1);
        this.f14718b[m3096r(this.f14719c + this.f14717a)] = obj;
        this.f14719c++;
    }

    @Override // p000.AbstractC1315x1
    /* JADX INFO: renamed from: b */
    public final Object mo3089b(int i) {
        int i2 = this.f14719c;
        if (i < 0 || i >= i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == kx5.m7689T(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m3097s();
        int iM3096r = m3096r(this.f14717a + i);
        Object[] objArr = this.f14718b;
        Object obj = objArr[iM3096r];
        int i3 = this.f14719c >> 1;
        int i4 = this.f14717a;
        if (i < i3) {
            if (iM3096r >= i4) {
                AbstractC0990oo.m9198S(i4 + 1, i4, iM3096r, objArr, objArr);
            } else {
                AbstractC0990oo.m9198S(1, 0, iM3096r, objArr, objArr);
                Object[] objArr2 = this.f14718b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f14717a;
                AbstractC0990oo.m9198S(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f14718b;
            int i6 = this.f14717a;
            objArr3[i6] = null;
            this.f14717a = m3092e(i6);
        } else {
            int iM3096r2 = m3096r(kx5.m7689T(this) + i4);
            Object[] objArr4 = this.f14718b;
            if (iM3096r <= iM3096r2) {
                AbstractC0990oo.m9198S(iM3096r, iM3096r + 1, iM3096r2 + 1, objArr4, objArr4);
            } else {
                AbstractC0990oo.m9198S(iM3096r, iM3096r + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f14718b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0990oo.m9198S(0, 1, iM3096r2 + 1, objArr5, objArr5);
            }
            this.f14718b[iM3096r2] = null;
        }
        this.f14719c--;
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m3090c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f14718b.length;
        while (i < length && it.hasNext()) {
            this.f14718b[i] = it.next();
            i++;
        }
        int i2 = this.f14717a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f14718b[i3] = it.next();
        }
        this.f14719c = collection.size() + this.f14719c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m3097s();
            m3095q(this.f14717a, m3096r(this.f14719c + this.f14717a));
        }
        this.f14717a = 0;
        this.f14719c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m3091d(int i) {
        if (i < 0) {
            C1077qn.m9989o("Deque is too big.");
            return;
        }
        Object[] objArr = this.f14718b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f14716d) {
            if (i < 10) {
                i = 10;
            }
            this.f14718b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0990oo.m9198S(0, this.f14717a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f14718b;
        int length2 = objArr3.length;
        int i3 = this.f14717a;
        AbstractC0990oo.m9198S(length2 - i3, 0, i3, objArr3, objArr2);
        this.f14717a = 0;
        this.f14718b = objArr2;
    }

    /* JADX INFO: renamed from: e */
    public final int m3092e(int i) {
        if (i == this.f14718b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f14718b[this.f14717a];
        }
        ds3.m4667k("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f14719c;
        if (i >= 0 && i < i2) {
            return this.f14718b[m3096r(this.f14717a + i)];
        }
        xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM3096r = m3096r(this.f14719c + this.f14717a);
        int length = this.f14717a;
        if (length < iM3096r) {
            while (length < iM3096r) {
                if (z62.m13387o(obj, this.f14718b[length])) {
                    i = this.f14717a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f14717a) < iM3096r) {
            return -1;
        }
        int length2 = this.f14718b.length;
        while (length < length2) {
            if (z62.m13387o(obj, this.f14718b[length])) {
                i = this.f14717a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM3096r; i2++) {
            if (z62.m13387o(obj, this.f14718b[i2])) {
                length = i2 + this.f14718b.length;
                i = this.f14717a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo3088a() == 0;
    }

    /* JADX INFO: renamed from: l */
    public final Object m3093l() {
        if (isEmpty()) {
            return null;
        }
        return this.f14718b[m3096r(kx5.m7689T(this) + this.f14717a)];
    }

    public final Object last() {
        if (isEmpty()) {
            ds3.m4667k("ArrayDeque is empty.");
            return null;
        }
        return this.f14718b[m3096r(kx5.m7689T(this) + this.f14717a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iM3096r = m3096r(this.f14719c + this.f14717a);
        int i2 = this.f14717a;
        if (i2 < iM3096r) {
            length = iM3096r - 1;
            if (i2 <= length) {
                while (!z62.m13387o(obj, this.f14718b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f14717a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f14717a >= iM3096r) {
            do {
                iM3096r--;
                objArr = this.f14718b;
                if (-1 >= iM3096r) {
                    length = objArr.length - 1;
                    int i3 = this.f14717a;
                    if (i3 <= length) {
                        while (!z62.m13387o(obj, this.f14718b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f14717a;
                    }
                }
                return length - i;
            } while (!z62.m13387o(obj, objArr[iM3096r]));
            length = iM3096r + this.f14718b.length;
            i = this.f14717a;
            return length - i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final int m3094m(int i) {
        return i < 0 ? i + this.f14718b.length : i;
    }

    /* JADX INFO: renamed from: q */
    public final void m3095q(int i, int i2) {
        Object[] objArr = this.f14718b;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.f14718b, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m3096r(int i) {
        Object[] objArr = this.f14718b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo3089b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM3096r;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f14718b.length != 0) {
            int iM3096r2 = m3096r(this.f14719c + this.f14717a);
            int i = this.f14717a;
            if (i < iM3096r2) {
                iM3096r = i;
                while (true) {
                    objArr = this.f14718b;
                    if (i >= iM3096r2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f14718b[iM3096r] = obj;
                        iM3096r++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM3096r, iM3096r2, (Object) null);
            } else {
                int length = this.f14718b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f14718b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f14718b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM3096r = m3096r(i2);
                for (int i3 = 0; i3 < iM3096r2; i3++) {
                    Object[] objArr3 = this.f14718b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f14718b[iM3096r] = obj3;
                        iM3096r = m3092e(iM3096r);
                    }
                }
                z = z2;
            }
            if (z) {
                m3097s();
                this.f14719c = m3094m(iM3096r - this.f14717a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            ds3.m4667k("ArrayDeque is empty.");
            return null;
        }
        m3097s();
        Object[] objArr = this.f14718b;
        int i = this.f14717a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f14717a = m3092e(i);
        this.f14719c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            ds3.m4667k("ArrayDeque is empty.");
            return null;
        }
        m3097s();
        int iM3096r = m3096r(kx5.m7689T(this) + this.f14717a);
        Object[] objArr = this.f14718b;
        Object obj = objArr[iM3096r];
        objArr[iM3096r] = null;
        this.f14719c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        qq2.m10026j(i, i2, this.f14719c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f14719c) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo3089b(i);
            return;
        }
        m3097s();
        int i4 = this.f14719c - i2;
        int i5 = this.f14717a;
        int i6 = this.f14717a;
        if (i < i4) {
            int iM3096r = m3096r((i - 1) + i5);
            int iM3096r2 = m3096r((i2 - 1) + i6);
            while (i > 0) {
                int i7 = iM3096r + 1;
                int iMin = Math.min(i, Math.min(i7, iM3096r2 + 1));
                Object[] objArr = this.f14718b;
                int i8 = iM3096r2 - iMin;
                int i9 = iM3096r - iMin;
                AbstractC0990oo.m9198S(i8 + 1, i9 + 1, i7, objArr, objArr);
                iM3096r = m3094m(i9);
                iM3096r2 = m3094m(i8);
                i -= iMin;
            }
            int iM3096r3 = m3096r(this.f14717a + i3);
            m3095q(this.f14717a, iM3096r3);
            this.f14717a = iM3096r3;
        } else {
            int iM3096r4 = m3096r(i5 + i2);
            int iM3096r5 = m3096r(i6 + i);
            int i10 = this.f14719c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f14718b;
                i2 = Math.min(i10, Math.min(objArr2.length - iM3096r4, objArr2.length - iM3096r5));
                Object[] objArr3 = this.f14718b;
                int i11 = iM3096r4 + i2;
                AbstractC0990oo.m9198S(iM3096r5, iM3096r4, i11, objArr3, objArr3);
                iM3096r4 = m3096r(i11);
                iM3096r5 = m3096r(iM3096r5 + i2);
            }
            int iM3096r6 = m3096r(this.f14719c + this.f14717a);
            m3095q(m3094m(iM3096r6 - i3), iM3096r6);
        }
        this.f14719c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM3096r;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f14718b.length != 0) {
            int iM3096r2 = m3096r(this.f14719c + this.f14717a);
            int i = this.f14717a;
            if (i < iM3096r2) {
                iM3096r = i;
                while (true) {
                    objArr = this.f14718b;
                    if (i >= iM3096r2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f14718b[iM3096r] = obj;
                        iM3096r++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM3096r, iM3096r2, (Object) null);
            } else {
                int length = this.f14718b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f14718b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f14718b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM3096r = m3096r(i2);
                for (int i3 = 0; i3 < iM3096r2; i3++) {
                    Object[] objArr3 = this.f14718b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f14718b[iM3096r] = obj3;
                        iM3096r = m3092e(iM3096r);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m3097s();
                this.f14719c = m3094m(iM3096r - this.f14717a);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: s */
    public final void m3097s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f14719c;
        if (i < 0 || i >= i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        int iM3096r = m3096r(this.f14717a + i);
        Object[] objArr = this.f14718b;
        Object obj2 = objArr[iM3096r];
        objArr[iM3096r] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f14719c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM3096r = m3096r(this.f14719c + this.f14717a);
        int i2 = this.f14717a;
        if (i2 < iM3096r) {
            AbstractC0990oo.m9201V(i2, iM3096r, 2, this.f14718b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f14718b;
            AbstractC0990oo.m9198S(0, this.f14717a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f14718b;
            AbstractC0990oo.m9198S(objArr3.length - this.f14717a, 0, iM3096r, objArr3, objArr);
        }
        int i3 = this.f14719c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C0461ao() {
        this.f14718b = f14716d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo3088a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m3097s();
        m3091d(collection.size() + this.f14719c);
        m3090c(m3096r(this.f14719c + this.f14717a), collection);
        return true;
    }
}
