package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class qp4 extends st2 {

    /* JADX INFO: renamed from: a */
    public vh2 f28675a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        vh2 vh2Var = this.f28675a;
        rp4 rp4Var = new rp4();
        rp4Var.f29517o = vh2Var;
        VarHandle.storeStoreFence();
        return rp4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp4) && z62.m13387o(this.f28675a, ((qp4) obj).f28675a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((rp4) mt2Var).f29517o = this.f28675a;
    }

    public final int hashCode() {
        return this.f28675a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f28675a + ")";
    }
}
