package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x52 {

    /* JADX INFO: renamed from: a */
    public int[] f34013a;

    /* JADX INFO: renamed from: b */
    public int f34014b;

    public x52() {
        this.f34013a = new int[10];
    }

    /* JADX INFO: renamed from: a */
    public int m12484a(int i) {
        int i2 = this.f34014b - 1;
        return i2 >= 0 ? this.f34013a[i2] : i;
    }

    /* JADX INFO: renamed from: b */
    public int m12485b() {
        int[] iArr = this.f34013a;
        int i = this.f34014b - 1;
        this.f34014b = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: c */
    public void m12486c(int i) {
        int[] iArrCopyOf = this.f34013a;
        if (this.f34014b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f34013a = iArrCopyOf;
        }
        int i2 = this.f34014b;
        this.f34014b = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: d */
    public void m12487d(int i, int i2, int i3) {
        int i4 = this.f34014b;
        int[] iArrCopyOf = this.f34013a;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f34013a = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f34014b = i5;
    }

    /* JADX INFO: renamed from: e */
    public void m12488e(int i, int i2, int i3, int i4) {
        int i5 = this.f34014b;
        int[] iArrCopyOf = this.f34013a;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f34013a = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f34014b = i6;
    }

    /* JADX INFO: renamed from: f */
    public void m12489f(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f34013a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m12490g(i3, i4);
                }
            }
            m12490g(i3 + 3, i2);
            m12489f(i, i3);
            m12489f(i3 + 6, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12490g(int i, int i2) {
        int[] iArr = this.f34013a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public x52(int i) {
        this.f34013a = new int[i];
    }
}
