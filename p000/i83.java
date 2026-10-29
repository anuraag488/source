package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i83 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f21171a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f21171a;
        h83 h83Var = new h83();
        h83Var.f20424o = yp1Var;
        VarHandle.storeStoreFence();
        return h83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i83) && this.f21171a == ((i83) obj).f21171a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        h83 h83Var = (h83) mt2Var;
        h83Var.f20424o = this.f21171a;
        y70.m13004E(h83Var);
    }

    public final int hashCode() {
        return this.f21171a.hashCode();
    }
}
