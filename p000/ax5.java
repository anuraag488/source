package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ax5 {

    /* JADX INFO: renamed from: f */
    public static final ax5 f14932f = new ax5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f14933a;

    /* JADX INFO: renamed from: b */
    public int[] f14934b;

    /* JADX INFO: renamed from: c */
    public Object[] f14935c;

    /* JADX INFO: renamed from: d */
    public int f14936d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f14937e;

    public ax5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f14933a = i;
        this.f14934b = iArr;
        this.f14935c = objArr;
        this.f14937e = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m3361a() {
        int iNumberOfLeadingZeros;
        int i = this.f14936d;
        if (i != -1) {
            return i;
        }
        int iM10848n = 0;
        for (int i2 = 0; i2 < this.f14933a; i2++) {
            int i3 = this.f14934b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(((Long) this.f14935c[i2]).longValue()) * 9)) >>> 6);
            } else if (i5 == 1) {
                ((Long) this.f14935c[i2]).getClass();
                iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6;
                    iM10848n = sk5.m10848n(iNumberOfLeadingZeros2, iNumberOfLeadingZeros2, ((ax5) this.f14935c[i2]).m3361a(), iM10848n);
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new ms5());
                    }
                    ((Integer) this.f14935c[i2]).getClass();
                    iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6) + 4;
                }
            } else {
                int i6 = i4 << 3;
                aj6 aj6Var = (aj6) this.f14935c[i2];
                int iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i6) * 9;
                int iMo3015d = aj6Var.mo3015d();
                iNumberOfLeadingZeros = ((352 - iNumberOfLeadingZeros3) >>> 6) + (c75.m3875g(iMo3015d, 9, 352) >>> 6) + iMo3015d;
            }
            iM10848n = iNumberOfLeadingZeros + iM10848n;
        }
        this.f14936d = iM10848n;
        return iM10848n;
    }

    /* JADX INFO: renamed from: b */
    public final void m3362b(int i, Object obj) {
        if (!this.f14937e) {
            xy4.m12791t();
            return;
        }
        m3364d(this.f14933a + 1);
        int[] iArr = this.f14934b;
        int i2 = this.f14933a;
        iArr[i2] = i;
        this.f14935c[i2] = obj;
        this.f14933a = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m3363c(wd3 wd3Var) throws za0 {
        n83 n83Var = (n83) wd3Var.f33259b;
        if (this.f14933a != 0) {
            for (int i = 0; i < this.f14933a; i++) {
                int i2 = this.f14934b[i];
                Object obj = this.f14935c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    n83Var.m8622z(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    n83Var.m8614r(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    n83Var.m8611o(i3, (aj6) obj);
                } else if (i4 == 3) {
                    n83Var.m8619w(i3, 3);
                    ((ax5) obj).m3363c(wd3Var);
                    n83Var.m8619w(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new ms5());
                    }
                    n83Var.m8612p(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3364d(int i) {
        int[] iArr = this.f14934b;
        if (i > iArr.length) {
            int i2 = this.f14933a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f14934b = Arrays.copyOf(iArr, i);
            this.f14935c = Arrays.copyOf(this.f14935c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ax5)) {
            ax5 ax5Var = (ax5) obj;
            int i = this.f14933a;
            if (i == ax5Var.f14933a) {
                int[] iArr = this.f14934b;
                int[] iArr2 = ax5Var.f14934b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f14935c;
                Object[] objArr2 = ax5Var.f14935c;
                int i3 = this.f14933a;
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
        int i = this.f14933a;
        int i2 = i + 527;
        int[] iArr = this.f14934b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f14935c;
        int i6 = this.f14933a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
