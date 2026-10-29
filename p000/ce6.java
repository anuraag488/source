package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ce6 extends aj6 {

    /* JADX INFO: renamed from: c */
    public final byte[] f15971c;

    /* JADX INFO: renamed from: d */
    public final int f15972d;

    /* JADX INFO: renamed from: e */
    public final int f15973e;

    public ce6(byte[] bArr, int i, int i2) {
        aj6.m3010q(i, i + i2, bArr.length);
        this.f15971c = bArr;
        this.f15972d = i;
        this.f15973e = i2;
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: b */
    public final byte mo3013b(int i) {
        return this.f15971c[this.f15972d + i];
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: c */
    public final int mo3014c(int i, int i2) {
        return kr5.m7589a(i, this.f15972d, i2, this.f15971c);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: d */
    public final int mo3015d() {
        return this.f15973e;
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: e */
    public final aj6 mo3016e(int i, int i2) {
        int iM3010q = aj6.m3010q(i, i2, this.f15973e);
        if (iM3010q == 0) {
            return aj6.f14569b;
        }
        return new ce6(this.f15971c, this.f15972d + i, iM3010q);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: g */
    public final void mo3017g(int i, byte[] bArr) {
        System.arraycopy(this.f15971c, this.f15972d, bArr, 0, i);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: l */
    public final void mo3018l(n83 n83Var) {
        n83Var.m8609m(this.f15971c, this.f15972d, this.f15973e);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: m */
    public final boolean mo3019m(aj6 aj6Var) {
        boolean z = aj6Var instanceof qk6;
        if (!z && !(aj6Var instanceof ce6)) {
            return aj6Var.mo3019m(this);
        }
        int iMo3015d = aj6Var.mo3015d();
        int i = this.f15973e;
        if (i > iMo3015d) {
            qm5.m9911b(i);
            return false;
        }
        if (i > aj6Var.mo3015d()) {
            StringBuilder sbM3883o = c75.m3883o("Ran off end of other: 0, ", i, ", ");
            sbM3883o.append(aj6Var.mo3015d());
            throw new IllegalArgumentException(sbM3883o.toString());
        }
        byte[] bArr = this.f15971c;
        int i2 = this.f15972d;
        if (z) {
            return aj6.m3012s(bArr, i2, ((qk6) aj6Var).f28550c, 0, i);
        }
        if (!(aj6Var instanceof ce6)) {
            return aj6Var.mo3016e(0, i).equals(mo3016e(i2, i + i2));
        }
        ce6 ce6Var = (ce6) aj6Var;
        return aj6.m3012s(bArr, i2, ce6Var.f15971c, ce6Var.f15972d, i);
    }
}
