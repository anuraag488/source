package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class i74 extends st2 {

    /* JADX INFO: renamed from: a */
    public ag1 f21159a;

    /* JADX INFO: renamed from: b */
    public C0853kz f21160b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        ag1 ag1Var = this.f21159a;
        C0853kz c0853kz = this.f21160b;
        l74 l74Var = new l74();
        l74Var.f23835o = ag1Var;
        l74Var.f23836p = c0853kz;
        l74Var.f23837q = -9223372034707292160L;
        l74Var.f23838r = ll0.m8010b(0, 0, 0, 0, 15);
        l74Var.f23840t = k43.m7398w(null);
        VarHandle.storeStoreFence();
        return l74Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i74)) {
            return false;
        }
        i74 i74Var = (i74) obj;
        return z62.m13387o(i74Var.f21159a, this.f21159a) && z62.m13387o(i74Var.f21160b, this.f21160b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        l74 l74Var = (l74) mt2Var;
        l74Var.f23835o = this.f21159a;
        l74Var.f23836p = this.f21160b;
    }

    public final int hashCode() {
        return (this.f21160b.hashCode() + (this.f21159a.hashCode() * 31)) * 31;
    }
}
