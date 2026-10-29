package p000;

/* JADX INFO: renamed from: iz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0779iz {

    /* JADX INFO: renamed from: a */
    public final float f21896a;

    public C0779iz(float f) {
        this.f21896a = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m6970a(int i, int i2, df2 df2Var) {
        float f = (i2 - i) / 2.0f;
        df2 df2Var2 = df2.f17011a;
        float f2 = this.f21896a;
        if (df2Var != df2Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0779iz) && Float.compare(this.f21896a, ((C0779iz) obj).f21896a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21896a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.f21896a + ")";
    }
}
