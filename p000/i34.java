package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i34 {

    /* JADX INFO: renamed from: a */
    public String f21102a;

    /* JADX INFO: renamed from: b */
    public String f21103b;

    /* JADX INFO: renamed from: c */
    public int f21104c;

    /* JADX INFO: renamed from: d */
    public long f21105d;

    /* JADX INFO: renamed from: e */
    public ft0 f21106e;

    /* JADX INFO: renamed from: f */
    public String f21107f;

    /* JADX INFO: renamed from: g */
    public String f21108g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i34)) {
            return false;
        }
        i34 i34Var = (i34) obj;
        return this.f21102a.equals(i34Var.f21102a) && z62.m13387o(this.f21103b, i34Var.f21103b) && this.f21104c == i34Var.f21104c && this.f21105d == i34Var.f21105d && this.f21106e.equals(i34Var.f21106e) && this.f21107f.equals(i34Var.f21107f) && this.f21108g.equals(i34Var.f21108g);
    }

    public final int hashCode() {
        return this.f21108g.hashCode() + zi4.m13613m((this.f21106e.hashCode() + zi4.m13612l(zi4.m13609i(this.f21104c, zi4.m13613m(this.f21102a.hashCode() * 31, this.f21103b, 31), 31), this.f21105d, 31)) * 31, this.f21107f, 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f21102a + ", firstSessionId=" + this.f21103b + ", sessionIndex=" + this.f21104c + ", eventTimestampUs=" + this.f21105d + ", dataCollectionStatus=" + this.f21106e + ", firebaseInstallationId=" + this.f21107f + ", firebaseAuthenticationToken=" + this.f21108g + ')';
    }
}
