package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class x12 extends o12 implements Set {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f33911c = 0;

    /* JADX INFO: renamed from: b */
    public transient u12 f33912b;

    /* JADX INFO: renamed from: m */
    public static int m12456m(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        C1077qn.m9987m("collection too large");
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static x12 m12457q(int i, Object... objArr) {
        if (i == 0) {
            return km3.f23235j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new z12(obj);
        }
        int iM12456m = m12456m(i);
        Object[] objArr2 = new Object[iM12456m];
        int i2 = iM12456m - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                xy4.m12782k(c75.m3877i(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM7371E = k43.m7371E(iHashCode);
            while (true) {
                int i6 = iM7371E & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM7371E++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new z12(obj4);
        }
        if (m12456m(i4) < iM12456m / 2) {
            return m12457q(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new km3(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: s */
    public static x12 m12458s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        if (!(objArr.length <= 2147483641)) {
            C1077qn.m9987m("the total number of elements must fit in an int");
            return null;
        }
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m12457q(length, objArr2);
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: a */
    public u12 mo6445a() {
        u12 u12Var = this.f33912b;
        if (u12Var != null) {
            return u12Var;
        }
        u12 u12VarMo6039r = mo6039r();
        this.f33912b = u12VarMo6039r;
        return u12VarMo6039r;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x12) && (this instanceof km3) && (((x12) obj) instanceof km3) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: r */
    public u12 mo6039r() {
        Object[] array = toArray(o12.f26283a);
        r12 r12Var = u12.f31590b;
        return u12.m11199m(array.length, array);
    }
}
