package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qd3 extends hz2 {

    /* JADX INFO: renamed from: a */
    public Object f28399a;

    /* JADX INFO: renamed from: b */
    public long f28400b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        return this.f28399a.equals(qd3Var.f28399a) && this.f28400b == qd3Var.f28400b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28400b) + (this.f28399a.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f28399a + ", compositeKey=" + this.f28400b + ')';
    }
}
