package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mz2 extends nz2 {

    /* JADX INFO: renamed from: a */
    public final bz2 f25342a;

    /* JADX INFO: renamed from: b */
    public final int f25343b;

    public mz2(bz2 bz2Var, int i) {
        this.f25342a = bz2Var;
        this.f25343b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mz2.class != obj.getClass()) {
            return false;
        }
        mz2 mz2Var = (mz2) obj;
        return this.f25343b == mz2Var.f25343b && z62.m13387o(this.f25342a, mz2Var.f25342a);
    }

    public final int hashCode() {
        return this.f25342a.hashCode() + (this.f25343b * 31);
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f25342a + ", direction=" + this.f25343b + ')';
    }
}
