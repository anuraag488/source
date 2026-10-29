package p000;

/* JADX INFO: renamed from: un */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1225un implements InterfaceC1188tn, InterfaceC1299wn {

    /* JADX INFO: renamed from: a */
    public final float f32007a;

    /* JADX INFO: renamed from: b */
    public final boolean f32008b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1262vn f32009c;

    /* JADX INFO: renamed from: d */
    public final float f32010d;

    public C1225un(float f, boolean z, InterfaceC1262vn interfaceC1262vn) {
        this.f32007a = f;
        this.f32008b = z;
        this.f32009c = interfaceC1262vn;
        this.f32010d = f;
    }

    @Override // p000.InterfaceC1188tn, p000.InterfaceC1299wn
    /* JADX INFO: renamed from: a */
    public final float mo11068a() {
        return this.f32010d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225un)) {
            return false;
        }
        C1225un c1225un = (C1225un) obj;
        return p11.m9352c(this.f32007a, c1225un.f32007a) && this.f32008b == c1225un.f32008b && this.f32009c.equals(c1225un.f32009c);
    }

    @Override // p000.InterfaceC1188tn
    /* JADX INFO: renamed from: g */
    public final void mo10373g(ky0 ky0Var, int i, int[] iArr, df2 df2Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo3579U = ky0Var.mo3579U(this.f32007a);
        boolean z = this.f32008b && df2Var == df2.f17012b;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo3579U, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iMo3579U, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int iMo5865j = this.f32009c.mo5865j(i2, df2Var);
            if (z) {
                iMo5865j -= i2;
            }
            if (iMo5865j != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iMo5865j;
                }
            }
        }
    }

    @Override // p000.InterfaceC1299wn
    /* JADX INFO: renamed from: h */
    public final void mo10874h(ky0 ky0Var, int i, int[] iArr, int[] iArr2) {
        mo10373g(ky0Var, i, iArr, df2.f17011a, iArr2);
    }

    public final int hashCode() {
        return this.f32009c.hashCode() + zi4.m13611k(Float.hashCode(this.f32007a) * 31, 31, this.f32008b);
    }

    public final String toString() {
        return (this.f32008b ? "" : "Absolute") + "Arrangement#spacedAligned(" + p11.m9353d(this.f32007a) + ", " + this.f32009c + ")";
    }
}
