package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class c43 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f15795a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f15795a;
        d43 d43Var = new d43();
        d43Var.f16777o = yp1Var;
        d43Var.f16778p = -9223372034707292160L;
        VarHandle.storeStoreFence();
        return d43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c43) && this.f15795a == ((c43) obj).f15795a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        d43 d43Var = (d43) mt2Var;
        d43Var.f16777o = this.f15795a;
        d43Var.f16778p = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.f15795a.hashCode();
    }
}
