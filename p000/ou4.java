package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ou4 {

    /* JADX INFO: renamed from: f */
    public static final ou4 f27126f = new ou4(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f27127a;

    /* JADX INFO: renamed from: b */
    public int[] f27128b;

    /* JADX INFO: renamed from: c */
    public Object[] f27129c;

    /* JADX INFO: renamed from: d */
    public int f27130d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f27131e;

    public ou4(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f27127a = i;
        this.f27128b = iArr;
        this.f27129c = objArr;
        this.f27131e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m9280a(int i) {
        int[] iArr = this.f27128b;
        if (i > iArr.length) {
            int i2 = this.f27127a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f27128b = Arrays.copyOf(iArr, i);
            this.f27129c = Arrays.copyOf(this.f27129c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m9281b() {
        int iM10752h;
        int iM10754j;
        int iM10752h2;
        int i = this.f27130d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27127a; i3++) {
            int i4 = this.f27128b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f27129c[i3]).getClass();
                    iM10752h2 = C1145sh.m10752h(i5) + 8;
                } else if (i6 == 2) {
                    iM10752h2 = C1145sh.m10751g(i5, (n50) this.f27129c[i3]);
                } else if (i6 == 3) {
                    iM10752h = C1145sh.m10752h(i5) * 2;
                    iM10754j = ((ou4) this.f27129c[i3]).m9281b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(i72.m6684b());
                    }
                    ((Integer) this.f27129c[i3]).getClass();
                    iM10752h2 = C1145sh.m10752h(i5) + 4;
                }
                i2 = iM10752h2 + i2;
            } else {
                long jLongValue = ((Long) this.f27129c[i3]).longValue();
                iM10752h = C1145sh.m10752h(i5);
                iM10754j = C1145sh.m10754j(jLongValue);
            }
            i2 = iM10754j + iM10752h + i2;
        }
        this.f27130d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m9282c(int i, Object obj) {
        if (!this.f27131e) {
            xy4.m12791t();
            return;
        }
        m9280a(this.f27127a + 1);
        int[] iArr = this.f27128b;
        int i2 = this.f27127a;
        iArr[i2] = i;
        this.f27129c[i2] = obj;
        this.f27127a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m9283d(js1 js1Var) {
        C1145sh c1145sh = (C1145sh) js1Var.f22555a;
        if (this.f27127a == 0) {
            return;
        }
        for (int i = 0; i < this.f27127a; i++) {
            int i2 = this.f27128b[i];
            Object obj = this.f27129c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c1145sh.m10762H(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c1145sh.m10783x(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c1145sh.m10779t(i3, (n50) obj);
            } else if (i4 == 3) {
                c1145sh.m10759E(i3, 3);
                ((ou4) obj).m9283d(js1Var);
                c1145sh.m10759E(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(i72.m6684b());
                }
                c1145sh.m10781v(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ou4)) {
            return false;
        }
        ou4 ou4Var = (ou4) obj;
        int i = this.f27127a;
        if (i == ou4Var.f27127a) {
            int[] iArr = this.f27128b;
            int[] iArr2 = ou4Var.f27128b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f27129c;
            Object[] objArr2 = ou4Var.f27129c;
            int i3 = this.f27127a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f27127a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f27128b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f27129c;
        int i6 = this.f27127a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
