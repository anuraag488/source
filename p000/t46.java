package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t46 extends r46 {

    /* JADX INFO: renamed from: c */
    public final byte[] f30780c;

    public t46(byte[] bArr) {
        this.f30780c = bArr;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: b */
    public final byte mo8517b(int i) {
        return this.f30780c[i];
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: c */
    public final int mo8518c(int i, int i2) {
        return j76.m7045a(i, 0, i2, this.f30780c);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: d */
    public final int mo8519d() {
        return this.f30780c.length;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: e */
    public final r46 mo8520e(int i, int i2) {
        byte[] bArr = this.f30780c;
        int iM10201q = r46.m10201q(0, i2, bArr.length);
        return iM10201q == 0 ? r46.f29010b : new n46(bArr, 0, iM10201q);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: g */
    public final void mo8521g(int i, byte[] bArr) {
        System.arraycopy(this.f30780c, 0, bArr, 0, i);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo8522l(n83 n83Var) {
        byte[] bArr = this.f30780c;
        n83Var.m8609m(bArr, 0, bArr.length);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: m */
    public final boolean mo8523m(r46 r46Var) {
        boolean z = r46Var instanceof t46;
        byte[] bArr = this.f30780c;
        if (z) {
            return Arrays.equals(bArr, ((t46) r46Var).f30780c);
        }
        boolean z2 = r46Var instanceof n46;
        if (!z2) {
            return r46Var.mo8523m(this);
        }
        n46 n46Var = (n46) r46Var;
        int i = n46Var.f25457e;
        int length = bArr.length;
        if (length > i) {
            qm5.m9911b(length);
            return false;
        }
        if (length > i) {
            C1077qn.m9987m(zi4.m13618r(length, i, "Ran off end of other: 0, ", ", "));
            return false;
        }
        if (z) {
            return r46.m10203s(bArr, 0, ((t46) r46Var).f30780c, 0, length);
        }
        return z2 ? r46.m10203s(bArr, 0, n46Var.f25455c, n46Var.f25456d, length) : r46Var.mo8520e(0, length).equals(mo8520e(0, length));
    }
}
