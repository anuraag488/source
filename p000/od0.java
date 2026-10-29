package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class od0 extends st2 {

    /* JADX INFO: renamed from: a */
    public final nv2 f26630a;

    /* JADX INFO: renamed from: b */
    public final q22 f26631b;

    /* JADX INFO: renamed from: c */
    public final boolean f26632c;

    /* JADX INFO: renamed from: d */
    public final boolean f26633d;

    /* JADX INFO: renamed from: e */
    public final wp1 f26634e;

    /* JADX INFO: renamed from: f */
    public final wp1 f26635f;

    public od0(nv2 nv2Var, q22 q22Var, boolean z, boolean z2, wp1 wp1Var, wp1 wp1Var2) {
        this.f26630a = nv2Var;
        this.f26631b = q22Var;
        this.f26632c = z;
        this.f26633d = z2;
        this.f26634e = wp1Var;
        this.f26635f = wp1Var2;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        rd0 rd0Var = new rd0(this.f26630a, this.f26631b, this.f26632c, this.f26633d, null, null, this.f26634e);
        rd0Var.f29165K = this.f26635f;
        rd0Var.f29166L = true;
        int i = do2.f17236a;
        rd0Var.f29167M = new sv2(6);
        rd0Var.f29168N = new sv2(6);
        rd0Var.f29174T = -1L;
        rd0Var.f29181a0 = -1L;
        VarHandle.storeStoreFence();
        return rd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || od0.class != obj.getClass()) {
            return false;
        }
        od0 od0Var = (od0) obj;
        return z62.m13387o(this.f26630a, od0Var.f26630a) && z62.m13387o(this.f26631b, od0Var.f26631b) && this.f26632c == od0Var.f26632c && this.f26633d == od0Var.f26633d && this.f26634e == od0Var.f26634e && this.f26635f == od0Var.f26635f;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        boolean z;
        rd0 rd0Var = (rd0) mt2Var;
        rd0Var.f29166L = true;
        boolean z2 = rd0Var.f29165K == null;
        wp1 wp1Var = this.f26635f;
        if (z2 != (wp1Var == null)) {
            rd0Var.m8157T0();
            y70.m13004E(rd0Var);
            z = true;
        } else {
            z = false;
        }
        rd0Var.f29165K = wp1Var;
        boolean z3 = rd0Var.f24505v;
        boolean z4 = this.f26633d;
        boolean z5 = z3 != z4 ? true : z;
        rd0Var.m8168e1(this.f26630a, this.f26631b, this.f26632c, z4, null, null, this.f26634e);
        if (z5) {
            rd0Var.m10294f1(false);
            rd0Var.m10294f1(true);
        }
    }

    public final int hashCode() {
        nv2 nv2Var = this.f26630a;
        int iHashCode = (nv2Var != null ? nv2Var.hashCode() : 0) * 31;
        q22 q22Var = this.f26631b;
        int iHashCode2 = (this.f26634e.hashCode() + zi4.m13611k(zi4.m13611k((iHashCode + (q22Var != null ? q22Var.hashCode() : 0)) * 31, 31, this.f26632c), 29791, this.f26633d)) * 961;
        wp1 wp1Var = this.f26635f;
        return Boolean.hashCode(true) + ((iHashCode2 + (wp1Var != null ? wp1Var.hashCode() : 0)) * 961);
    }
}
