package p000;

/* JADX INFO: renamed from: kz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0853kz implements InterfaceC0520ca {

    /* JADX INFO: renamed from: a */
    public final float f23628a;

    /* JADX INFO: renamed from: b */
    public final float f23629b;

    public C0853kz(float f, float f2) {
        this.f23628a = f;
        this.f23629b = f2;
    }

    @Override // p000.InterfaceC0520ca
    /* JADX INFO: renamed from: a */
    public final long mo3927a(long j, long j2, df2 df2Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        df2 df2Var2 = df2.f17011a;
        float f3 = this.f23628a;
        if (df2Var != df2Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f23629b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853kz)) {
            return false;
        }
        C0853kz c0853kz = (C0853kz) obj;
        return Float.compare(this.f23628a, c0853kz.f23628a) == 0 && Float.compare(this.f23629b, c0853kz.f23629b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23629b) + (Float.hashCode(this.f23628a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.f23628a + ", verticalBias=" + this.f23629b + ")";
    }
}
