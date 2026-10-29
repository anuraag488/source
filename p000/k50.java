package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k50 extends n50 {

    /* JADX INFO: renamed from: d */
    public final byte[] f22894d;

    /* JADX INFO: renamed from: e */
    public final int f22895e;

    /* JADX INFO: renamed from: f */
    public final int f22896f;

    public k50(byte[] bArr, int i, int i2) {
        n50.m8524a(i, i + i2, bArr.length);
        this.f22894d = bArr;
        this.f22895e = i;
        this.f22896f = i2;
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: c */
    public final void mo7401c(int i, byte[] bArr) {
        System.arraycopy(this.f22894d, this.f22895e, bArr, 0, i);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: d */
    public final boolean mo7402d(n50 n50Var) {
        boolean z = n50Var instanceof p50;
        if (!z && !(n50Var instanceof k50)) {
            return n50Var.mo7402d(this);
        }
        int size = n50Var.size();
        int i = this.f22896f;
        if (i > size) {
            qm5.m9911b(i);
            return false;
        }
        if (i > n50Var.size()) {
            StringBuilder sbM3883o = c75.m3883o("Ran off end of other: 0, ", i, ", ");
            sbM3883o.append(n50Var.size());
            throw new IllegalArgumentException(sbM3883o.toString());
        }
        byte[] bArr = this.f22894d;
        int i2 = this.f22895e;
        if (z) {
            return n50.m8526l(bArr, i2, ((p50) n50Var).f27379d, 0, i);
        }
        if (!(n50Var instanceof k50)) {
            return n50Var.mo7405m(0, i).equals(mo7405m(i2, i + i2));
        }
        k50 k50Var = (k50) n50Var;
        return n50.m8526l(bArr, i2, k50Var.f22894d, k50Var.f22895e, i);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: e */
    public final byte mo7403e(int i) {
        return this.f22894d[this.f22895e + i];
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: g */
    public final int mo7404g(int i, int i2) {
        return l62.m7836b(i, this.f22895e, i2, this.f22894d);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: m */
    public final n50 mo7405m(int i, int i2) {
        int iM8524a = n50.m8524a(i, i2, this.f22896f);
        if (iM8524a == 0) {
            return n50.f25466b;
        }
        return new k50(this.f22894d, this.f22895e + i, iM8524a);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: r */
    public final void mo7406r(C1145sh c1145sh) {
        c1145sh.m10756B(this.f22894d, this.f22895e, this.f22896f);
    }

    @Override // p000.n50
    public final int size() {
        return this.f22896f;
    }
}
