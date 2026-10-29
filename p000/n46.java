package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n46 extends r46 {

    /* JADX INFO: renamed from: c */
    public final byte[] f25455c;

    /* JADX INFO: renamed from: d */
    public final int f25456d;

    /* JADX INFO: renamed from: e */
    public final int f25457e;

    public n46(byte[] bArr, int i, int i2) {
        r46.m10201q(i, i + i2, bArr.length);
        this.f25455c = bArr;
        this.f25456d = i;
        this.f25457e = i2;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: b */
    public final byte mo8517b(int i) {
        return this.f25455c[this.f25456d + i];
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: c */
    public final int mo8518c(int i, int i2) {
        return j76.m7045a(i, this.f25456d, i2, this.f25455c);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: d */
    public final int mo8519d() {
        return this.f25457e;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: e */
    public final r46 mo8520e(int i, int i2) {
        int iM10201q = r46.m10201q(i, i2, this.f25457e);
        if (iM10201q == 0) {
            return r46.f29010b;
        }
        return new n46(this.f25455c, this.f25456d + i, iM10201q);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: g */
    public final void mo8521g(int i, byte[] bArr) {
        System.arraycopy(this.f25455c, this.f25456d, bArr, 0, i);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo8522l(n83 n83Var) {
        n83Var.m8609m(this.f25455c, this.f25456d, this.f25457e);
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: m */
    public final boolean mo8523m(r46 r46Var) {
        boolean z = r46Var instanceof t46;
        if (!z && !(r46Var instanceof n46)) {
            return r46Var.mo8523m(this);
        }
        int iMo8519d = r46Var.mo8519d();
        int i = this.f25457e;
        if (i > iMo8519d) {
            qm5.m9911b(i);
            return false;
        }
        if (i > r46Var.mo8519d()) {
            C1077qn.m9987m(zi4.m13618r(i, r46Var.mo8519d(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.f25455c;
        int i2 = this.f25456d;
        if (z) {
            return r46.m10203s(bArr, i2, ((t46) r46Var).f30780c, 0, i);
        }
        if (!(r46Var instanceof n46)) {
            return r46Var.mo8520e(0, i).equals(mo8520e(i2, i + i2));
        }
        n46 n46Var = (n46) r46Var;
        return r46.m10203s(bArr, i2, n46Var.f25455c, n46Var.f25456d, i);
    }
}
