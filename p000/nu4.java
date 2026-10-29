package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nu4 {

    /* JADX INFO: renamed from: f */
    public static final nu4 f26097f = new nu4(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f26098a;

    /* JADX INFO: renamed from: b */
    public int[] f26099b;

    /* JADX INFO: renamed from: c */
    public Object[] f26100c;

    /* JADX INFO: renamed from: d */
    public int f26101d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f26102e;

    public nu4(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f26098a = i;
        this.f26099b = iArr;
        this.f26100c = objArr;
        this.f26102e = z;
    }

    /* JADX INFO: renamed from: c */
    public static nu4 m8851c() {
        return new nu4(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m8852a(int i) {
        int[] iArr = this.f26099b;
        if (i > iArr.length) {
            int i2 = this.f26098a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f26099b = Arrays.copyOf(iArr, i);
            this.f26100c = Arrays.copyOf(this.f26100c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m8853b() {
        int iM13059e;
        int iM13061g;
        int iM13059e2;
        int i = this.f26101d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26098a; i3++) {
            int i4 = this.f26099b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f26100c[i3]).getClass();
                    iM13059e2 = ya0.m13059e(i5) + 8;
                } else if (i6 == 2) {
                    iM13059e2 = ya0.m13055a(i5, (t50) this.f26100c[i3]);
                } else if (i6 == 3) {
                    iM13059e = ya0.m13059e(i5) * 2;
                    iM13061g = ((nu4) this.f26100c[i3]).m8853b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(h72.m6265b());
                    }
                    ((Integer) this.f26100c[i3]).getClass();
                    iM13059e2 = ya0.m13059e(i5) + 4;
                }
                i2 = iM13059e2 + i2;
            } else {
                long jLongValue = ((Long) this.f26100c[i3]).longValue();
                iM13059e = ya0.m13059e(i5);
                iM13061g = ya0.m13061g(jLongValue);
            }
            i2 = iM13061g + iM13059e + i2;
        }
        this.f26101d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m8854d(int i, Object obj) {
        if (!this.f26102e) {
            xy4.m12791t();
            return;
        }
        m8852a(this.f26098a + 1);
        int[] iArr = this.f26099b;
        int i2 = this.f26098a;
        iArr[i2] = i;
        this.f26100c[i2] = obj;
        this.f26098a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m8855e(ar3 ar3Var) {
        if (this.f26098a == 0) {
            return;
        }
        ar3Var.getClass();
        ya0 ya0Var = (ya0) ar3Var.f14813b;
        for (int i = 0; i < this.f26098a; i++) {
            int i2 = this.f26099b[i];
            Object obj = this.f26100c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ya0Var.m13078x(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ya0Var.m13069o(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ya0Var.m13066l(i3, (t50) obj);
            } else if (i4 == 3) {
                ya0Var.m13075u(i3, 3);
                ((nu4) obj).m8855e(ar3Var);
                ya0Var.m13075u(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(h72.m6265b());
                }
                ya0Var.m13067m(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nu4)) {
            return false;
        }
        nu4 nu4Var = (nu4) obj;
        int i = this.f26098a;
        if (i == nu4Var.f26098a) {
            int[] iArr = this.f26099b;
            int[] iArr2 = nu4Var.f26099b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f26100c;
            Object[] objArr2 = nu4Var.f26100c;
            int i3 = this.f26098a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26098a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f26099b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f26100c;
        int i6 = this.f26098a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
