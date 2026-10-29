package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ta3 extends AbstractC0003a2 {

    /* JADX INFO: renamed from: a */
    public final Object[] f31038a;

    /* JADX INFO: renamed from: b */
    public final Object[] f31039b;

    /* JADX INFO: renamed from: c */
    public final int f31040c;

    /* JADX INFO: renamed from: d */
    public final int f31041d;

    public ta3(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f31038a = objArr;
        this.f31039b = objArr2;
        this.f31040c = i;
        this.f31041d = i2;
        if (!(mo103a() > 32)) {
            kd3.m7502a("Trie-based persistent vector should have at least 33 elements, got " + mo103a());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: r */
    public static Object[] m11009r(Object[] objArr, int i, int i2, Object obj, C1392z4 c1392z4) {
        int iM11819C = vd6.m11819C(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM11819C == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0990oo.m9198S(iM11819C + 1, iM11819C, 31, objArr, objArrCopyOf);
            c1392z4.f35744a = objArr[31];
            objArrCopyOf[iM11819C] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        objArrCopyOf2[iM11819C] = m11009r((Object[]) objArr[iM11819C], i3, i2, obj, c1392z4);
        while (true) {
            iM11819C++;
            if (iM11819C >= 32 || objArrCopyOf2[iM11819C] == null) {
                break;
            }
            objArrCopyOf2[iM11819C] = m11009r((Object[]) objArr[iM11819C], i3, 0, c1392z4.f35744a, c1392z4);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: t */
    public static Object[] m11010t(Object[] objArr, int i, int i2, C1392z4 c1392z4) {
        Object[] objArrM11010t;
        int iM11819C = vd6.m11819C(i2, i);
        if (i == 5) {
            c1392z4.f35744a = objArr[iM11819C];
            objArrM11010t = null;
        } else {
            objArrM11010t = m11010t((Object[]) objArr[iM11819C], i - 5, i2, c1392z4);
        }
        if (objArrM11010t == null && iM11819C == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM11819C] = objArrM11010t;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: z */
    public static Object[] m11011z(Object[] objArr, int i, int i2, Object obj) {
        int iM11819C = vd6.m11819C(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM11819C] = obj;
            return objArrCopyOf;
        }
        objArrCopyOf[iM11819C] = m11011z((Object[]) objArrCopyOf[iM11819C], i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        return this.f31040c;
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: b */
    public final AbstractC0003a2 mo17b(int i, Object obj) {
        int i2 = this.f31040c;
        gq6.m6088m(i, i2);
        if (i == i2) {
            return mo18c(obj);
        }
        int iM11017y = m11017y();
        Object[] objArr = this.f31038a;
        if (i >= iM11017y) {
            return m11012s(objArr, i - iM11017y, obj);
        }
        C1392z4 c1392z4 = new C1392z4(null);
        return m11012s(m11009r(objArr, this.f31041d, i, obj, c1392z4), 0, c1392z4.f35744a);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: c */
    public final AbstractC0003a2 mo18c(Object obj) {
        int iM11017y = m11017y();
        int i = this.f31040c;
        int i2 = i - iM11017y;
        Object[] objArr = this.f31038a;
        Object[] objArr2 = this.f31039b;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new ta3(objArr, objArrCopyOf, i + 1, this.f31041d);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m11013u(objArr, objArr2, objArr3);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: e */
    public final ua3 mo20e() {
        return new ua3(this, this.f31038a, this.f31039b, this.f31041d);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        gq6.m6087l(i, mo103a());
        if (m11017y() <= i) {
            objArr = this.f31039b;
        } else {
            Object[] objArr2 = this.f31038a;
            for (int i2 = this.f31041d; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[vd6.m11819C(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: l */
    public final AbstractC0003a2 mo21l(C1389z1 c1389z1) {
        ua3 ua3Var = new ua3(this, this.f31038a, this.f31039b, this.f31041d);
        ua3Var.m11347G(c1389z1);
        return ua3Var.m11354c();
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f31040c;
        gq6.m6088m(i, i2);
        int i3 = (this.f31041d / 5) + 1;
        va3 va3Var = new va3(i, i2);
        va3Var.f32495c = this.f31039b;
        int i4 = (i2 - 1) & (-32);
        if (i > i4) {
            i = i4;
        }
        va3Var.f32496d = new yp4(this.f31038a, i, i4, i3);
        VarHandle.storeStoreFence();
        return va3Var;
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: m */
    public final AbstractC0003a2 mo22m(int i) {
        gq6.m6087l(i, mo103a());
        int iM11017y = m11017y();
        int i2 = this.f31041d;
        Object[] objArr = this.f31038a;
        return i >= iM11017y ? m11016x(objArr, iM11017y, i2, i - iM11017y) : m11016x(m11015w(objArr, i2, i, new C1392z4(this.f31039b[0])), iM11017y, i2, 0);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: q */
    public final AbstractC0003a2 mo23q(int i, Object obj) {
        int i2 = this.f31040c;
        gq6.m6087l(i, i2);
        int iM11017y = m11017y();
        Object[] objArr = this.f31038a;
        Object[] objArr2 = this.f31039b;
        int i3 = this.f31041d;
        if (iM11017y > i) {
            return new ta3(m11011z(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new ta3(objArr, objArrCopyOf, i2, i3);
    }

    /* JADX INFO: renamed from: s */
    public final ta3 m11012s(Object[] objArr, int i, Object obj) {
        int iM11017y = m11017y();
        int i2 = this.f31040c;
        int i3 = i2 - iM11017y;
        Object[] objArr2 = this.f31039b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC0990oo.m9198S(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new ta3(objArr, objArrCopyOf, i2 + 1, this.f31041d);
        }
        Object obj2 = objArr2[31];
        AbstractC0990oo.m9198S(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m11013u(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: u */
    public final ta3 m11013u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f31040c;
        int i2 = i >> 5;
        int i3 = this.f31041d;
        if (i2 <= (1 << i3)) {
            return new ta3(m11014v(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ta3(m11014v(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m11014v(int i, Object[] objArr, Object[] objArr2) {
        int iM11819C = vd6.m11819C(mo103a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM11819C] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM11819C] = m11014v(i - 5, (Object[]) objArrCopyOf[iM11819C], objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m11015w(Object[] objArr, int i, int i2, C1392z4 c1392z4) {
        int iM11819C = vd6.m11819C(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM11819C == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0990oo.m9198S(iM11819C, iM11819C + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c1392z4.f35744a;
            c1392z4.f35744a = objArr[iM11819C];
            return objArrCopyOf;
        }
        int iM11819C2 = objArr[31] == null ? vd6.m11819C(m11017y() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM11819C + 1;
        if (i4 <= iM11819C2) {
            while (true) {
                objArrCopyOf2[iM11819C2] = m11015w((Object[]) objArrCopyOf2[iM11819C2], i3, 0, c1392z4);
                if (iM11819C2 == i4) {
                    break;
                }
                iM11819C2--;
            }
        }
        objArrCopyOf2[iM11819C] = m11015w((Object[]) objArrCopyOf2[iM11819C], i3, i2, c1392z4);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC0003a2 m11016x(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f31040c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f31039b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC0990oo.m9198S(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new ta3(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new q84(objArr);
        }
        C1392z4 c1392z4 = new C1392z4(null);
        Object[] objArrM11010t = m11010t(objArr, i2, i - 1, c1392z4);
        Object[] objArr3 = (Object[]) c1392z4.f35744a;
        return objArrM11010t[1] == null ? new ta3((Object[]) objArrM11010t[0], objArr3, i, i2 - 5) : new ta3(objArrM11010t, objArr3, i, i2);
    }

    /* JADX INFO: renamed from: y */
    public final int m11017y() {
        return (this.f31040c - 1) & (-32);
    }
}
