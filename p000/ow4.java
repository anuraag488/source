package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ow4 implements a05 {

    /* JADX INFO: renamed from: a */
    public String f27178a;

    /* JADX INFO: renamed from: b */
    public d83 f27179b;

    @Override // p000.a05
    /* JADX INFO: renamed from: a */
    public final int mo9a(ky0 ky0Var) {
        return m9320e().f27375d;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: b */
    public final int mo10b(ky0 ky0Var) {
        return m9320e().f27373b;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: c */
    public final int mo11c(ky0 ky0Var, df2 df2Var) {
        return m9320e().f27374c;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: d */
    public final int mo12d(ky0 ky0Var, df2 df2Var) {
        return m9320e().f27372a;
    }

    /* JADX INFO: renamed from: e */
    public final p42 m9320e() {
        return (p42) this.f27179b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ow4) {
            return z62.m13387o(m9320e(), ((ow4) obj).m9320e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m9321f(p42 p42Var) {
        this.f27179b.setValue(p42Var);
    }

    public final int hashCode() {
        return this.f27178a.hashCode();
    }

    public final String toString() {
        return this.f27178a + "(left=" + m9320e().f27372a + ", top=" + m9320e().f27373b + ", right=" + m9320e().f27374c + ", bottom=" + m9320e().f27375d + ")";
    }
}
