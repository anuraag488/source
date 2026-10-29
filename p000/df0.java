package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class df0 {

    /* JADX INFO: renamed from: a */
    public final Object f17001a;

    /* JADX INFO: renamed from: b */
    public final x60 f17002b;

    /* JADX INFO: renamed from: c */
    public final nq1 f17003c;

    /* JADX INFO: renamed from: d */
    public final Object f17004d;

    /* JADX INFO: renamed from: e */
    public final Throwable f17005e;

    public /* synthetic */ df0(Object obj, x60 x60Var, nq1 nq1Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : x60Var, (i & 4) != 0 ? null : nq1Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: a */
    public static df0 m4497a(df0 df0Var, x60 x60Var, Throwable th, int i) {
        Object obj = df0Var.f17001a;
        if ((i & 2) != 0) {
            x60Var = df0Var.f17002b;
        }
        x60 x60Var2 = x60Var;
        nq1 nq1Var = df0Var.f17003c;
        Object obj2 = df0Var.f17004d;
        if ((i & 16) != 0) {
            th = df0Var.f17005e;
        }
        return new df0(obj, x60Var2, nq1Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df0)) {
            return false;
        }
        df0 df0Var = (df0) obj;
        return z62.m13387o(this.f17001a, df0Var.f17001a) && z62.m13387o(this.f17002b, df0Var.f17002b) && z62.m13387o(this.f17003c, df0Var.f17003c) && z62.m13387o(this.f17004d, df0Var.f17004d) && z62.m13387o(this.f17005e, df0Var.f17005e);
    }

    public final int hashCode() {
        Object obj = this.f17001a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        x60 x60Var = this.f17002b;
        int iHashCode2 = (iHashCode + (x60Var == null ? 0 : x60Var.hashCode())) * 31;
        nq1 nq1Var = this.f17003c;
        int iHashCode3 = (iHashCode2 + (nq1Var == null ? 0 : nq1Var.hashCode())) * 31;
        Object obj2 = this.f17004d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f17005e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f17001a + ", cancelHandler=" + this.f17002b + ", onCancellation=" + this.f17003c + ", idempotentResume=" + this.f17004d + ", cancelCause=" + this.f17005e + ')';
    }

    public df0(Object obj, x60 x60Var, nq1 nq1Var, Object obj2, Throwable th) {
        this.f17001a = obj;
        this.f17002b = x60Var;
        this.f17003c = nq1Var;
        this.f17004d = obj2;
        this.f17005e = th;
    }
}
