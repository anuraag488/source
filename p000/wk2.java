package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wk2 implements a05 {

    /* JADX INFO: renamed from: a */
    public a05 f33445a;

    /* JADX INFO: renamed from: b */
    public int f33446b;

    @Override // p000.a05
    /* JADX INFO: renamed from: a */
    public final int mo9a(ky0 ky0Var) {
        if ((this.f33446b & 32) != 0) {
            return this.f33445a.mo9a(ky0Var);
        }
        return 0;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: b */
    public final int mo10b(ky0 ky0Var) {
        if ((this.f33446b & 16) != 0) {
            return this.f33445a.mo10b(ky0Var);
        }
        return 0;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: c */
    public final int mo11c(ky0 ky0Var, df2 df2Var) {
        if (((df2Var == df2.f17011a ? 4 : 1) & this.f33446b) != 0) {
            return this.f33445a.mo11c(ky0Var, df2Var);
        }
        return 0;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: d */
    public final int mo12d(ky0 ky0Var, df2 df2Var) {
        if (((df2Var == df2.f17011a ? 8 : 2) & this.f33446b) != 0) {
            return this.f33445a.mo12d(ky0Var, df2Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk2)) {
            return false;
        }
        wk2 wk2Var = (wk2) obj;
        return z62.m13387o(this.f33445a, wk2Var.f33445a) && this.f33446b == wk2Var.f33446b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33446b) + (this.f33445a.hashCode() * 31);
    }

    public final String toString() {
        a05 a05Var = this.f33445a;
        int i = this.f33446b;
        StringBuilder sb = new StringBuilder();
        int i2 = sj3.f30337g;
        if ((i & i2) == i2) {
            sj3.m10804M("Start", sb);
        }
        int i3 = sj3.f30339i;
        if ((i & i3) == i3) {
            sj3.m10804M("Left", sb);
        }
        if ((i & 16) == 16) {
            sj3.m10804M("Top", sb);
        }
        int i4 = sj3.f30338h;
        if ((i & i4) == i4) {
            sj3.m10804M("End", sb);
        }
        int i5 = sj3.f30340j;
        if ((i & i5) == i5) {
            sj3.m10804M("Right", sb);
        }
        if ((i & 32) == 32) {
            sj3.m10804M("Bottom", sb);
        }
        return "(" + a05Var + " only " + zi4.m13621u("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
