package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: bn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0497bn extends st2 implements lt2 {

    /* JADX INFO: renamed from: a */
    public boolean f15424a;

    /* JADX INFO: renamed from: b */
    public yp1 f15425b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        boolean z = this.f15424a;
        yp1 yp1Var = this.f15425b;
        wn0 wn0Var = new wn0();
        wn0Var.f33511o = z;
        wn0Var.f33512p = false;
        wn0Var.f33513q = yp1Var;
        VarHandle.storeStoreFence();
        return wn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0497bn)) {
            return false;
        }
        C0497bn c0497bn = (C0497bn) obj;
        return this.f15424a == c0497bn.f15424a && this.f15425b == c0497bn.f15425b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        wn0 wn0Var = (wn0) mt2Var;
        wn0Var.f33511o = this.f15424a;
        wn0Var.f33513q = this.f15425b;
    }

    public final int hashCode() {
        return this.f15425b.hashCode() + (Boolean.hashCode(this.f15424a) * 31);
    }
}
