package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qk6 extends aj6 {

    /* JADX INFO: renamed from: c */
    public final byte[] f28550c;

    public qk6(byte[] bArr) {
        bArr.getClass();
        this.f28550c = bArr;
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: b */
    public final byte mo3013b(int i) {
        return this.f28550c[i];
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: c */
    public final int mo3014c(int i, int i2) {
        return kr5.m7589a(i, 0, i2, this.f28550c);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: d */
    public final int mo3015d() {
        return this.f28550c.length;
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: e */
    public final aj6 mo3016e(int i, int i2) {
        byte[] bArr = this.f28550c;
        int iM3010q = aj6.m3010q(0, i2, bArr.length);
        return iM3010q == 0 ? aj6.f14569b : new ce6(bArr, 0, iM3010q);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: g */
    public final void mo3017g(int i, byte[] bArr) {
        System.arraycopy(this.f28550c, 0, bArr, 0, i);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: l */
    public final void mo3018l(n83 n83Var) {
        byte[] bArr = this.f28550c;
        n83Var.m8609m(bArr, 0, bArr.length);
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: m */
    public final boolean mo3019m(aj6 aj6Var) {
        boolean z = aj6Var instanceof qk6;
        byte[] bArr = this.f28550c;
        if (z) {
            return Arrays.equals(bArr, ((qk6) aj6Var).f28550c);
        }
        boolean z2 = aj6Var instanceof ce6;
        if (!z2) {
            return aj6Var.mo3019m(this);
        }
        ce6 ce6Var = (ce6) aj6Var;
        int i = ce6Var.f15973e;
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
            return aj6.m3012s(bArr, 0, ((qk6) aj6Var).f28550c, 0, length);
        }
        return z2 ? aj6.m3012s(bArr, 0, ce6Var.f15971c, ce6Var.f15972d, length) : aj6Var.mo3016e(0, length).equals(mo3016e(0, length));
    }
}
