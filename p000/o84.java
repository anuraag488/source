package p000;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o84 {
    /* JADX INFO: renamed from: a */
    public static final m84 m8980a(m84 m84Var) {
        if (!(m84Var instanceof m84)) {
            m84Var = null;
        }
        if (m84Var != null) {
            return m84Var;
        }
        qi0.m9890b("Inconsistent composition");
        xy4.m12794w();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final int m8981b(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: renamed from: c */
    public static final int m8982c(ArrayList arrayList, int i, int i2) {
        int iM8983d = m8983d(arrayList, i, i2);
        return iM8983d >= 0 ? iM8983d : -(iM8983d + 1);
    }

    /* JADX INFO: renamed from: d */
    public static final int m8983d(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((cr1) arrayList.get(i4)).f16390a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM13393u = z62.m13393u(i5, i);
            if (iM13393u < 0) {
                i3 = i4 + 1;
            } else {
                if (iM13393u <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final int m8984e(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: f */
    public static final void m8985f() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: g */
    public static final void m8986g(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
