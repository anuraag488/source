package p000;

/* JADX INFO: renamed from: hi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0726hi implements a05 {

    /* JADX INFO: renamed from: a */
    public short f20591a;

    /* JADX INFO: renamed from: b */
    public String f20592b;

    /* JADX INFO: renamed from: c */
    public d83 f20593c;

    /* JADX INFO: renamed from: d */
    public d83 f20594d;

    @Override // p000.a05
    /* JADX INFO: renamed from: a */
    public final int mo9a(ky0 ky0Var) {
        return m6404e().f19609d;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: b */
    public final int mo10b(ky0 ky0Var) {
        return m6404e().f19607b;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: c */
    public final int mo11c(ky0 ky0Var, df2 df2Var) {
        return m6404e().f19608c;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: d */
    public final int mo12d(ky0 ky0Var, df2 df2Var) {
        return m6404e().f19606a;
    }

    /* JADX INFO: renamed from: e */
    public final g42 m6404e() {
        return (g42) this.f20593c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0726hi) && this.f20591a == ((C0726hi) obj).f20591a;
    }

    /* JADX INFO: renamed from: f */
    public final void m6405f(boolean z) {
        this.f20594d.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m6406g(w05 w05Var, int i) {
        short s = this.f20591a;
        if (i == 0 || (i & s) != 0) {
            this.f20593c.setValue(w05Var.f33012a.mo7777i(s));
            m6405f(w05Var.f33012a.mo7784u(s));
        }
    }

    public final int hashCode() {
        return this.f20591a;
    }

    public final String toString() {
        return this.f20592b + "(" + m6404e().f19606a + ", " + m6404e().f19607b + ", " + m6404e().f19608c + ", " + m6404e().f19609d + ")";
    }
}
