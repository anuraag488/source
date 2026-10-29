package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mb6 {

    /* JADX INFO: renamed from: f */
    public static final mb6 f24801f = new mb6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f24802a;

    /* JADX INFO: renamed from: b */
    public int[] f24803b;

    /* JADX INFO: renamed from: c */
    public Object[] f24804c;

    /* JADX INFO: renamed from: d */
    public int f24805d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f24806e;

    public mb6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f24802a = i;
        this.f24803b = iArr;
        this.f24804c = objArr;
        this.f24806e = z;
    }

    /* JADX INFO: renamed from: b */
    public static mb6 m8267b() {
        return new mb6(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m8268a() {
        int iM8593B;
        int iM8594D;
        int iM8593B2;
        int i = this.f24805d;
        if (i != -1) {
            return i;
        }
        int iM10843i = 0;
        for (int i2 = 0; i2 < this.f24802a; i2++) {
            int i3 = this.f24803b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        r46 r46Var = (r46) this.f24804c[i2];
                        int iM8593B3 = n83.m8593B(i6);
                        int iMo8519d = r46Var.mo8519d();
                        iM10843i = sk5.m10843i(iMo8519d, iMo8519d, iM8593B3, iM10843i);
                    } else if (i5 == 3) {
                        int iM8593B4 = n83.m8593B(i4 << 3);
                        iM8593B = iM8593B4 + iM8593B4;
                        iM8594D = ((mb6) this.f24804c[i2]).m8268a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new d86());
                        }
                        ((Integer) this.f24804c[i2]).getClass();
                        iM8593B2 = n83.m8593B(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f24804c[i2]).getClass();
                    iM8593B2 = n83.m8593B(i4 << 3) + 8;
                }
                iM10843i = iM8593B2 + iM10843i;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f24804c[i2]).longValue();
                iM8593B = n83.m8593B(i7);
                iM8594D = n83.m8594D(jLongValue);
            }
            iM10843i = iM8594D + iM8593B + iM10843i;
        }
        this.f24805d = iM10843i;
        return iM10843i;
    }

    /* JADX INFO: renamed from: c */
    public final void m8269c(int i, Object obj) {
        if (!this.f24806e) {
            xy4.m12791t();
            return;
        }
        m8271e(this.f24802a + 1);
        int[] iArr = this.f24803b;
        int i2 = this.f24802a;
        iArr[i2] = i;
        this.f24804c[i2] = obj;
        this.f24802a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8270d(rr5 rr5Var) throws za0 {
        n83 n83Var = (n83) rr5Var.f29555b;
        if (this.f24802a != 0) {
            for (int i = 0; i < this.f24802a; i++) {
                int i2 = this.f24803b[i];
                Object obj = this.f24804c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    n83Var.m8622z(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    n83Var.m8614r(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    n83Var.m8610n(i3, (r46) obj);
                } else if (i4 == 3) {
                    n83Var.m8619w(i3, 3);
                    ((mb6) obj).m8270d(rr5Var);
                    n83Var.m8619w(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new d86());
                    }
                    n83Var.m8612p(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8271e(int i) {
        int[] iArr = this.f24803b;
        if (i > iArr.length) {
            int i2 = this.f24802a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f24803b = Arrays.copyOf(iArr, i);
            this.f24804c = Arrays.copyOf(this.f24804c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof mb6)) {
            mb6 mb6Var = (mb6) obj;
            int i = this.f24802a;
            if (i == mb6Var.f24802a) {
                int[] iArr = this.f24803b;
                int[] iArr2 = mb6Var.f24803b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f24804c;
                Object[] objArr2 = mb6Var.f24804c;
                int i3 = this.f24802a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24802a;
        int i2 = i + 527;
        int[] iArr = this.f24803b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f24804c;
        int i6 = this.f24802a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
