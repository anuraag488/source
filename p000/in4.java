package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class in4 extends st2 {

    /* JADX INFO: renamed from: a */
    public final boolean f21586a;

    /* JADX INFO: renamed from: b */
    public final nv2 f21587b;

    /* JADX INFO: renamed from: c */
    public final q22 f21588c;

    /* JADX INFO: renamed from: d */
    public final boolean f21589d;

    /* JADX INFO: renamed from: e */
    public final lq3 f21590e;

    /* JADX INFO: renamed from: f */
    public final yp1 f21591f;

    public in4(boolean z, nv2 nv2Var, q22 q22Var, boolean z2, lq3 lq3Var, yp1 yp1Var) {
        this.f21586a = z;
        this.f21587b = nv2Var;
        this.f21588c = q22Var;
        this.f21589d = z2;
        this.f21590e = lq3Var;
        this.f21591f = yp1Var;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        dz3 dz3Var = new dz3((byte) 1);
        yp1 yp1Var = this.f21591f;
        dz3Var.f17535b = yp1Var;
        boolean z = this.f21586a;
        dz3Var.f17536c = z;
        VarHandle.storeStoreFence();
        kn4 kn4Var = new kn4(this.f21587b, this.f21588c, false, this.f21589d, null, this.f21590e, dz3Var);
        kn4Var.f23262M = z;
        kn4Var.f23263N = yp1Var;
        sj4 sj4Var = new sj4((byte) 4);
        sj4Var.f30344b = kn4Var;
        VarHandle.storeStoreFence();
        kn4Var.f23264O = sj4Var;
        VarHandle.storeStoreFence();
        return kn4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || in4.class != obj.getClass()) {
            return false;
        }
        in4 in4Var = (in4) obj;
        return this.f21586a == in4Var.f21586a && z62.m13387o(this.f21587b, in4Var.f21587b) && z62.m13387o(this.f21588c, in4Var.f21588c) && this.f21589d == in4Var.f21589d && z62.m13387o(this.f21590e, in4Var.f21590e) && this.f21591f == in4Var.f21591f;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        kn4 kn4Var = (kn4) mt2Var;
        boolean z = kn4Var.f23262M;
        boolean z2 = this.f21586a;
        if (z != z2) {
            kn4Var.f23262M = z2;
            y70.m13004E(kn4Var);
        }
        kn4Var.f23263N = this.f21591f;
        kn4Var.m8168e1(this.f21587b, this.f21588c, false, this.f21589d, null, this.f21590e, kn4Var.f23264O);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21586a) * 31;
        nv2 nv2Var = this.f21587b;
        int iHashCode2 = (iHashCode + (nv2Var != null ? nv2Var.hashCode() : 0)) * 31;
        q22 q22Var = this.f21588c;
        int iM13611k = zi4.m13611k(zi4.m13611k((iHashCode2 + (q22Var != null ? q22Var.hashCode() : 0)) * 31, 31, false), 31, this.f21589d);
        lq3 lq3Var = this.f21590e;
        return this.f21591f.hashCode() + ((iM13611k + (lq3Var != null ? Integer.hashCode(lq3Var.f24281a) : 0)) * 31);
    }
}
