package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class el6 {

    /* JADX INFO: renamed from: f */
    public static final el6 f18242f = new el6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f18243a;

    /* JADX INFO: renamed from: b */
    public int[] f18244b;

    /* JADX INFO: renamed from: c */
    public Object[] f18245c;

    /* JADX INFO: renamed from: d */
    public int f18246d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f18247e;

    public el6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f18243a = i;
        this.f18244b = iArr;
        this.f18245c = objArr;
        this.f18247e = z;
    }

    /* JADX INFO: renamed from: a */
    public static el6 m5193a() {
        return new el6(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    public final void m5194b(bt5 bt5Var) {
        if (this.f18243a != 0) {
            for (int i = 0; i < this.f18243a; i++) {
                int i2 = this.f18244b[i];
                Object obj = this.f18245c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((ng6) bt5Var.f15596b).m8718g(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((ng6) bt5Var.f15596b).m8719h(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((ng6) bt5Var.f15596b).m8720i(i4, (ig6) obj);
                } else if (i3 == 3) {
                    ((ng6) bt5Var.f15596b).m8714c(i4, 3);
                    ((el6) obj).m5194b(bt5Var);
                    ((ng6) bt5Var.f15596b).m8714c(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new pi6());
                    }
                    ((ng6) bt5Var.f15596b).m8717f(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m5195c() {
        int iM8713s;
        int iM8711a;
        int iM8713s2;
        int i = this.f18246d;
        if (i != -1) {
            return i;
        }
        int iM10846l = 0;
        for (int i2 = 0; i2 < this.f18243a; i2++) {
            int i3 = this.f18244b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        ig6 ig6Var = (ig6) this.f18245c[i2];
                        int iM8713s3 = ng6.m8713s(i6);
                        int iMo3593d = ig6Var.mo3593d();
                        iM10846l = sk5.m10846l(iMo3593d, iMo3593d, iM8713s3, iM10846l);
                    } else if (i5 == 3) {
                        int iM8713s4 = ng6.m8713s(i4 << 3);
                        iM8713s = iM8713s4 + iM8713s4;
                        iM8711a = ((el6) this.f18245c[i2]).m5195c();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new pi6());
                        }
                        ((Integer) this.f18245c[i2]).getClass();
                        iM8713s2 = ng6.m8713s(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f18245c[i2]).getClass();
                    iM8713s2 = ng6.m8713s(i4 << 3) + 8;
                }
                iM10846l = iM8713s2 + iM10846l;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f18245c[i2]).longValue();
                iM8713s = ng6.m8713s(i7);
                iM8711a = ng6.m8711a(jLongValue);
            }
            iM10846l = iM8711a + iM8713s + iM10846l;
        }
        this.f18246d = iM10846l;
        return iM10846l;
    }

    /* JADX INFO: renamed from: d */
    public final void m5196d(int i, Object obj) {
        if (!this.f18247e) {
            xy4.m12791t();
            return;
        }
        m5197e(this.f18243a + 1);
        int[] iArr = this.f18244b;
        int i2 = this.f18243a;
        iArr[i2] = i;
        this.f18245c[i2] = obj;
        this.f18243a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m5197e(int i) {
        int[] iArr = this.f18244b;
        if (i > iArr.length) {
            int i2 = this.f18243a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f18244b = Arrays.copyOf(iArr, i);
            this.f18245c = Arrays.copyOf(this.f18245c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof el6)) {
            el6 el6Var = (el6) obj;
            int i = this.f18243a;
            if (i == el6Var.f18243a) {
                int[] iArr = this.f18244b;
                int[] iArr2 = el6Var.f18244b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f18245c;
                Object[] objArr2 = el6Var.f18245c;
                int i3 = this.f18243a;
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
        int i = this.f18243a;
        int i2 = i + 527;
        int[] iArr = this.f18244b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f18245c;
        int i6 = this.f18243a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
