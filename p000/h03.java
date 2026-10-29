package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class h03 extends st2 {

    /* JADX INFO: renamed from: a */
    public d03 f20245a;

    /* JADX INFO: renamed from: b */
    public g03 f20246b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new k03(this.f20245a, this.f20246b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03Var = (h03) obj;
        return z62.m13387o(h03Var.f20245a, this.f20245a) && z62.m13387o(h03Var.f20246b, this.f20246b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        k03 k03Var = (k03) mt2Var;
        d03 d03Var = this.f20245a;
        g03 g03Var = this.f20246b;
        k03Var.f22795o = d03Var;
        g03 g03Var2 = k03Var.f22796p;
        if (g03Var2.f19466a == k03Var) {
            g03Var2.f19466a = null;
            g03Var2.f19469d = null;
            g03Var2.f19468c = sc6.f30169f;
        }
        if (g03Var == null) {
            g03Var = new g03();
            k03Var.f22796p = g03Var;
        } else if (g03Var != g03Var2) {
            k03Var.f22796p = g03Var;
        } else {
            g03Var = g03Var2;
        }
        if (k03Var.f25208n) {
            g03Var.f19466a = k03Var;
            g03Var.f19467b = null;
            k03Var.f22797q = null;
            g32 g32Var = new g32((byte) 11);
            g32Var.f19558b = k03Var;
            VarHandle.storeStoreFence();
            g03Var.f19468c = g32Var;
            g03Var.f19469d = k03Var.m8391C0();
        }
    }

    public final int hashCode() {
        int iHashCode = this.f20245a.hashCode() * 31;
        g03 g03Var = this.f20246b;
        return iHashCode + (g03Var != null ? g03Var.hashCode() : 0);
    }
}
