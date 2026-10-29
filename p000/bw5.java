package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bw5 extends su5 implements Set {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f15662c = 0;

    /* JADX INFO: renamed from: b */
    public transient sv5 f15663b;

    /* JADX INFO: renamed from: l */
    public static int m3749l(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        C1077qn.m9987m("collection too large");
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static bw5 m3750q(int i, Object... objArr) {
        if (i == 0) {
            return cx5.f16587j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new hx5(obj);
        }
        int iM3749l = m3749l(i);
        Object[] objArr2 = new Object[iM3749l];
        int i2 = iM3749l - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                xy4.m12782k(c75.m3877i(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM8113a = lu5.m8113a(iHashCode);
            while (true) {
                int i6 = iM8113a & i2;
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
                iM8113a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new hx5(obj4);
        }
        if (m3749l(i4) < iM3749l / 2) {
            return m3750q(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new cx5(i3, i2, i4, objArr, objArr2);
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: d */
    public sv5 mo3751d() {
        sv5 sv5Var = this.f15663b;
        if (sv5Var != null) {
            return sv5Var;
        }
        sv5 sv5VarMo3752m = mo3752m();
        this.f15663b = sv5VarMo3752m;
        return sv5VarMo3752m;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bw5) && (this instanceof cx5) && (((bw5) obj) instanceof cx5) && ((cx5) this).f16589e != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: m */
    public sv5 mo3752m() {
        Object[] array = toArray(su5.f30573a);
        uu5 uu5Var = sv5.f30597b;
        return sv5.m10928m(array.length, array);
    }
}
