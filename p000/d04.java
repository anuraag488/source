package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d04 extends s50 {

    /* JADX INFO: renamed from: e */
    public final transient byte[][] f16686e;

    /* JADX INFO: renamed from: f */
    public final transient int[] f16687f;

    public d04(byte[][] bArr, int[] iArr) {
        super(s50.f29911d.f29912a);
        this.f16686e = bArr;
        this.f16687f = iArr;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: b */
    public final int mo4261b() {
        return this.f16687f[this.f16686e.length - 1];
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: c */
    public final String mo4262c() {
        return m4273r().mo4262c();
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: d */
    public final int mo4263d(int i, byte[] bArr) {
        return m4273r().mo4263d(i, bArr);
    }

    @Override // p000.s50
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s50) {
            s50 s50Var = (s50) obj;
            if (s50Var.mo4261b() == mo4261b() && mo4268k(0, s50Var, mo4261b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: f */
    public final byte[] mo4264f() {
        return m4272q();
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: g */
    public final byte mo4265g(int i) {
        byte[][] bArr = this.f16686e;
        int length = bArr.length - 1;
        int[] iArr = this.f16687f;
        dt0.m4719u(iArr[length], i, 1L);
        int iM13666R = zp0.m13666R(this, i);
        return bArr[iM13666R][(i - (iM13666R == 0 ? 0 : iArr[iM13666R - 1])) + iArr[bArr.length + iM13666R]];
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: h */
    public final int mo4266h(int i, byte[] bArr) {
        return m4273r().mo4266h(i, bArr);
    }

    @Override // p000.s50
    public final int hashCode() {
        int i = this.f29913b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f16686e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f16687f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f29913b = i3;
        return i3;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: j */
    public final boolean mo4267j(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0 && i <= mo4261b() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM13666R = zp0.m13666R(this, i);
            while (i < i4) {
                int[] iArr = this.f16687f;
                int i5 = iM13666R == 0 ? 0 : iArr[iM13666R - 1];
                int i6 = iArr[iM13666R] - i5;
                byte[][] bArr2 = this.f16686e;
                int i7 = iArr[bArr2.length + iM13666R];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (dt0.m4714p(bArr2[iM13666R], (i - i5) + i7, bArr, i2, iMin)) {
                    i2 += iMin;
                    i += iMin;
                    iM13666R++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: k */
    public final boolean mo4268k(int i, s50 s50Var, int i2) {
        if (i >= 0 && i <= mo4261b() - i2) {
            int i3 = i2 + i;
            int iM13666R = zp0.m13666R(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f16687f;
                int i5 = iM13666R == 0 ? 0 : iArr[iM13666R - 1];
                int i6 = iArr[iM13666R] - i5;
                byte[][] bArr = this.f16686e;
                int i7 = iArr[bArr.length + iM13666R];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (s50Var.mo4267j(i4, (i - i5) + i7, iMin, bArr[iM13666R])) {
                    i4 += iMin;
                    i += iMin;
                    iM13666R++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: l */
    public final s50 mo4269l(int i, int i2) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > mo4261b()) {
            StringBuilder sbM3883o = c75.m3883o("endIndex=", i2, " > length(");
            sbM3883o.append(mo4261b());
            sbM3883o.append(')');
            throw new IllegalArgumentException(sbM3883o.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C1077qn.m9988n(zi4.m13618r(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == mo4261b()) {
            return this;
        }
        if (i == i2) {
            return s50.f29911d;
        }
        int iM13666R = zp0.m13666R(this, i);
        int iM13666R2 = zp0.m13666R(this, i2 - 1);
        byte[][] bArr = this.f16686e;
        byte[][] bArr2 = (byte[][]) AbstractC0990oo.m9205Z(bArr, iM13666R, iM13666R2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f16687f;
        if (iM13666R <= iM13666R2) {
            int i4 = iM13666R;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iM13666R2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM13666R != 0 ? iArr2[iM13666R - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new d04(bArr2, iArr);
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: n */
    public final s50 mo4270n() {
        return m4273r().mo4270n();
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: p */
    public final void mo4271p(w30 w30Var, int i) {
        int iM13666R = zp0.m13666R(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f16687f;
            int i3 = iM13666R == 0 ? 0 : iArr[iM13666R - 1];
            int i4 = iArr[iM13666R] - i3;
            byte[][] bArr = this.f16686e;
            int i5 = iArr[bArr.length + iM13666R];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            zz3 zz3Var = new zz3(bArr[iM13666R], i6, i6 + iMin, true);
            zz3 zz3Var2 = w30Var.f33055a;
            if (zz3Var2 == null) {
                zz3Var.f36510g = zz3Var;
                zz3Var.f36509f = zz3Var;
                w30Var.f33055a = zz3Var;
            } else {
                zz3Var2.f36510g.m13895b(zz3Var);
            }
            i2 += iMin;
            iM13666R++;
        }
        w30Var.f33056b += (long) i;
    }

    /* JADX INFO: renamed from: q */
    public final byte[] m4272q() {
        byte[] bArr = new byte[mo4261b()];
        byte[][] bArr2 = this.f16686e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f16687f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: r */
    public final s50 m4273r() {
        return new s50(m4272q());
    }

    @Override // p000.s50
    public final String toString() {
        return m4273r().toString();
    }
}
