package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: dj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class C0577dj<S> extends st2 {

    /* JADX INFO: renamed from: a */
    public yo4 f17093a;

    /* JADX INFO: renamed from: b */
    public sw2 f17094b;

    /* JADX INFO: renamed from: c */
    public C0727hj f17095c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yo4 yo4Var = this.f17093a;
        sw2 sw2Var = this.f17094b;
        C0727hj c0727hj = this.f17095c;
        C0690gj c0690gj = new C0690gj();
        c0690gj.f19807o = yo4Var;
        c0690gj.f19808p = sw2Var;
        c0690gj.f19809q = c0727hj;
        c0690gj.f19812t = 0L;
        c0690gj.f19813u = 0L;
        c0690gj.f19814v = new C0614ej(c0690gj, (byte) 1);
        c0690gj.f19815w = new C0614ej(c0690gj, (byte) 0);
        c0690gj.f19816x = -9223372034707292160L;
        VarHandle.storeStoreFence();
        return c0690gj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0577dj)) {
            return false;
        }
        C0577dj c0577dj = (C0577dj) obj;
        return z62.m13387o(c0577dj.f17093a, this.f17093a) && z62.m13387o(c0577dj.f17094b, this.f17094b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        C0690gj c0690gj = (C0690gj) mt2Var;
        c0690gj.f19807o = this.f17093a;
        c0690gj.f19808p = this.f17094b;
        c0690gj.f19809q = this.f17095c;
    }

    public final int hashCode() {
        int iHashCode = this.f17095c.hashCode() * 31;
        yo4 yo4Var = this.f17093a;
        return this.f17094b.hashCode() + ((iHashCode + (yo4Var != null ? yo4Var.hashCode() : 0)) * 31);
    }
}
