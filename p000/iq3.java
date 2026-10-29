package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iq3 {

    /* JADX INFO: renamed from: a */
    public boolean f21636a;

    /* JADX INFO: renamed from: b */
    public float f21637b;

    /* JADX INFO: renamed from: c */
    public js1 f21638c;

    /* JADX INFO: renamed from: d */
    public hq3 f21639d;

    /* JADX INFO: renamed from: e */
    public dq3 f21640e;

    /* JADX INFO: renamed from: f */
    public fq3 f21641f;

    /* JADX INFO: renamed from: g */
    public bq3 f21642g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq3)) {
            return false;
        }
        iq3 iq3Var = (iq3) obj;
        return this.f21636a == iq3Var.f21636a && p11.m9352c(this.f21637b, iq3Var.f21637b) && z62.m13387o(this.f21638c, iq3Var.f21638c) && this.f21639d.equals(iq3Var.f21639d) && this.f21640e.equals(iq3Var.f21640e) && this.f21641f.equals(iq3Var.f21641f) && this.f21642g.equals(iq3Var.f21642g);
    }

    public final int hashCode() {
        return this.f21642g.hashCode() + ((this.f21641f.hashCode() + ((this.f21640e.hashCode() + ((this.f21639d.hashCode() + ((this.f21638c.hashCode() + c75.m3874f(this.f21637b, Boolean.hashCode(this.f21636a) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }
}
