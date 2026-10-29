package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class af0 extends AbstractSet implements Serializable {

    /* JADX INFO: renamed from: a */
    public transient Object f14429a;

    /* JADX INFO: renamed from: b */
    public transient int[] f14430b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f14431c;

    /* JADX INFO: renamed from: d */
    public transient int f14432d;

    /* JADX INFO: renamed from: e */
    public transient int f14433e;

    /* JADX INFO: renamed from: a */
    public static af0 m2953a() {
        af0 af0Var = new af0();
        af0Var.f14432d = C0638f5.m5536g(3, 1);
        return af0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        char c = 31;
        if (m2955c()) {
            dt0.m4722x("Arrays already allocated", m2955c());
            int i = this.f14432d;
            int iM10719e0 = se0.m10719e0(i);
            this.f14429a = se0.m10735p(iM10719e0);
            this.f14432d = se0.m10699L(this.f14432d, 32 - Integer.numberOfLeadingZeros(iM10719e0 - 1), 31);
            this.f14430b = new int[i];
            this.f14431c = new Object[i];
        }
        Set setM2954b = m2954b();
        if (setM2954b != null) {
            return setM2954b.add(obj);
        }
        int[] iArrM2957e = m2957e();
        Object[] objArrM2956d = m2956d();
        int i2 = this.f14433e;
        int i3 = i2 + 1;
        int iM7372F = k43.m7372F(obj);
        int iM2958g = (1 << (this.f14432d & 31)) - 1;
        int i4 = iM7372F & iM2958g;
        Object obj2 = this.f14429a;
        Objects.requireNonNull(obj2);
        int iM10715c0 = se0.m10715c0(i4, obj2);
        if (iM10715c0 != 0) {
            int i5 = ~iM2958g;
            int i6 = iM7372F & i5;
            int i7 = 0;
            while (true) {
                int i8 = iM10715c0 - 1;
                int i9 = iArrM2957e[i8];
                char c2 = c;
                if ((i9 & i5) == i6 && qs5.m10116u(obj, objArrM2956d[i8])) {
                    return false;
                }
                int i10 = i9 & iM2958g;
                i7++;
                if (i10 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iM2958g) {
                            iArrM2957e[i8] = se0.m10699L(i9, i3, iM2958g);
                            break;
                        }
                        iM2958g = m2958g(iM2958g, se0.m10701N(iM2958g), iM7372F, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.f14432d & 31), 1.0f);
                    int i11 = isEmpty() ? -1 : 0;
                    while (i11 >= 0) {
                        linkedHashSet.add(m2956d()[i11]);
                        i11++;
                        if (i11 >= this.f14433e) {
                            i11 = -1;
                        }
                    }
                    this.f14429a = linkedHashSet;
                    this.f14430b = null;
                    this.f14431c = null;
                    this.f14432d += 32;
                    return linkedHashSet.add(obj);
                }
                iM10715c0 = i10;
                c = c2;
            }
        } else if (i3 > iM2958g) {
            iM2958g = m2958g(iM2958g, se0.m10701N(iM2958g), iM7372F, i2);
        } else {
            Object obj3 = this.f14429a;
            Objects.requireNonNull(obj3);
            se0.m10717d0(i4, i3, obj3);
        }
        int length = m2957e().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f14430b = Arrays.copyOf(m2957e(), iMin);
            this.f14431c = Arrays.copyOf(m2956d(), iMin);
        }
        m2957e()[i2] = se0.m10699L(iM7372F, 0, iM2958g);
        m2956d()[i2] = obj;
        this.f14433e = i3;
        this.f14432d += 32;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Set m2954b() {
        Object obj = this.f14429a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2955c() {
        return this.f14429a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (m2955c()) {
            return;
        }
        this.f14432d += 32;
        Set setM2954b = m2954b();
        if (setM2954b != null) {
            this.f14432d = C0638f5.m5536g(size(), 3);
            setM2954b.clear();
            this.f14429a = null;
            this.f14433e = 0;
            return;
        }
        Arrays.fill(m2956d(), 0, this.f14433e, (Object) null);
        Object obj = this.f14429a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m2957e(), 0, this.f14433e, 0);
        this.f14433e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (m2955c()) {
            return false;
        }
        Set setM2954b = m2954b();
        if (setM2954b != null) {
            return setM2954b.contains(obj);
        }
        int iM7372F = k43.m7372F(obj);
        int i = (1 << (this.f14432d & 31)) - 1;
        Object obj2 = this.f14429a;
        Objects.requireNonNull(obj2);
        int iM10715c0 = se0.m10715c0(iM7372F & i, obj2);
        if (iM10715c0 == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iM7372F & i2;
        do {
            int i4 = iM10715c0 - 1;
            int i5 = m2957e()[i4];
            if ((i5 & i2) == i3 && qs5.m10116u(obj, m2956d()[i4])) {
                return true;
            }
            iM10715c0 = i5 & i;
        } while (iM10715c0 != 0);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Object[] m2956d() {
        Object[] objArr = this.f14431c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: e */
    public final int[] m2957e() {
        int[] iArr = this.f14430b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: g */
    public final int m2958g(int i, int i2, int i3, int i4) {
        Object objM10735p = se0.m10735p(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            se0.m10717d0(i3 & i5, i4 + 1, objM10735p);
        }
        Object obj = this.f14429a;
        Objects.requireNonNull(obj);
        int[] iArrM2957e = m2957e();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM10715c0 = se0.m10715c0(i6, obj);
            while (iM10715c0 != 0) {
                int i7 = iM10715c0 - 1;
                int i8 = iArrM2957e[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM10715c1 = se0.m10715c0(i10, objM10735p);
                se0.m10717d0(i10, iM10715c0, objM10735p);
                iArrM2957e[i7] = se0.m10699L(i9, iM10715c1, i5);
                iM10715c0 = i8 & i;
            }
        }
        this.f14429a = objM10735p;
        this.f14432d = se0.m10699L(this.f14432d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setM2954b = m2954b();
        if (setM2954b != null) {
            return setM2954b.iterator();
        }
        ze0 ze0Var = new ze0();
        ze0Var.f36012d = this;
        ze0Var.f36009a = this.f14432d;
        ze0Var.f36010b = isEmpty() ? -1 : 0;
        ze0Var.f36011c = -1;
        VarHandle.storeStoreFence();
        return ze0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!m2955c()) {
            Set setM2954b = m2954b();
            if (setM2954b != null) {
                return setM2954b.remove(obj);
            }
            int i3 = (1 << (this.f14432d & 31)) - 1;
            Object obj2 = this.f14429a;
            Objects.requireNonNull(obj2);
            int iM10707V = se0.m10707V(obj, null, i3, obj2, m2957e(), m2956d(), null);
            if (iM10707V != -1) {
                Object obj3 = this.f14429a;
                Objects.requireNonNull(obj3);
                int[] iArrM2957e = m2957e();
                Object[] objArrM2956d = m2956d();
                int size = size();
                int i4 = size - 1;
                if (iM10707V < i4) {
                    Object obj4 = objArrM2956d[i4];
                    objArrM2956d[iM10707V] = obj4;
                    objArrM2956d[i4] = null;
                    iArrM2957e[iM10707V] = iArrM2957e[i4];
                    iArrM2957e[i4] = 0;
                    int iM7372F = k43.m7372F(obj4) & i3;
                    int iM10715c0 = se0.m10715c0(iM7372F, obj3);
                    if (iM10715c0 == size) {
                        se0.m10717d0(iM7372F, iM10707V + 1, obj3);
                    } else {
                        while (true) {
                            i = iM10715c0 - 1;
                            i2 = iArrM2957e[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            iM10715c0 = i5;
                        }
                        iArrM2957e[i] = se0.m10699L(i2, iM10707V + 1, i3);
                    }
                } else {
                    objArrM2956d[iM10707V] = null;
                    iArrM2957e[iM10707V] = 0;
                }
                this.f14433e--;
                this.f14432d += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setM2954b = m2954b();
        return setM2954b != null ? setM2954b.size() : this.f14433e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (m2955c()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setM2954b = m2954b();
        if (setM2954b != null) {
            return setM2954b.toArray(objArr);
        }
        Object[] objArrM2956d = m2956d();
        int i = this.f14433e;
        dt0.m4721w(0, i, objArrM2956d.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrM2956d, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (m2955c()) {
            return new Object[0];
        }
        Set setM2954b = m2954b();
        return setM2954b != null ? setM2954b.toArray() : Arrays.copyOf(m2956d(), this.f14433e);
    }
}
