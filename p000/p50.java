package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p50 extends n50 {

    /* JADX INFO: renamed from: d */
    public final byte[] f27379d;

    public p50(byte[] bArr) {
        bArr.getClass();
        this.f27379d = bArr;
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: c */
    public final void mo7401c(int i, byte[] bArr) {
        System.arraycopy(this.f27379d, 0, bArr, 0, i);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: d */
    public final boolean mo7402d(n50 n50Var) {
        boolean z = n50Var instanceof p50;
        byte[] bArr = this.f27379d;
        if (z) {
            return Arrays.equals(bArr, ((p50) n50Var).f27379d);
        }
        if (!(n50Var instanceof k50)) {
            return n50Var.mo7402d(this);
        }
        int length = bArr.length;
        k50 k50Var = (k50) n50Var;
        int i = k50Var.f22896f;
        if (length > i) {
            xy4.m12779g(length, bArr.length);
            return false;
        }
        if (length <= i) {
            return n50Var instanceof p50 ? n50.m8526l(bArr, 0, ((p50) n50Var).f27379d, 0, length) : n50.m8526l(bArr, 0, k50Var.f22894d, k50Var.f22895e, length);
        }
        C1077qn.m9987m(zi4.m13618r(length, i, "Ran off end of other: 0, ", ", "));
        return false;
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: e */
    public final byte mo7403e(int i) {
        return this.f27379d[i];
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: g */
    public final int mo7404g(int i, int i2) {
        return l62.m7836b(i, 0, i2, this.f27379d);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: m */
    public final n50 mo7405m(int i, int i2) {
        byte[] bArr = this.f27379d;
        int iM8524a = n50.m8524a(0, i2, bArr.length);
        return iM8524a == 0 ? n50.f25466b : new k50(bArr, 0, iM8524a);
    }

    @Override // p000.n50
    /* JADX INFO: renamed from: r */
    public final void mo7406r(C1145sh c1145sh) {
        byte[] bArr = this.f27379d;
        c1145sh.m10756B(bArr, 0, bArr.length);
    }

    @Override // p000.n50
    public final int size() {
        return this.f27379d.length;
    }
}
