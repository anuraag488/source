package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class rj4 extends st2 {

    /* JADX INFO: renamed from: a */
    public yg3 f29358a;

    /* JADX INFO: renamed from: b */
    public ik4 f29359b;

    /* JADX INFO: renamed from: c */
    public jk4 f29360c;

    /* JADX INFO: renamed from: d */
    public eo0 f29361d;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yg3 yg3Var = this.f29358a;
        ik4 ik4Var = this.f29359b;
        jk4 jk4Var = this.f29360c;
        eo0 eo0Var = this.f29361d;
        tj4 tj4Var = new tj4();
        tj4Var.f31197q = yg3Var;
        tj4Var.f31198r = ik4Var;
        tj4Var.f31199s = jk4Var;
        tj4Var.f31200t = eo0Var;
        sj4 sj4Var = new sj4((byte) 0);
        sj4Var.f30344b = tj4Var;
        VarHandle.storeStoreFence();
        tj4Var.f31202v = s94.m10566b(sj4Var);
        tj4Var.f31203w = jl3.f22395e;
        VarHandle.storeStoreFence();
        return tj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj4)) {
            return false;
        }
        rj4 rj4Var = (rj4) obj;
        return this.f29358a == rj4Var.f29358a && this.f29359b == rj4Var.f29359b && this.f29360c == rj4Var.f29360c && this.f29361d == rj4Var.f29361d;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        tj4 tj4Var = (tj4) mt2Var;
        yg3 yg3Var = this.f29358a;
        tj4Var.f31197q.f35215b = null;
        tj4Var.f31197q = yg3Var;
        yg3Var.f35215b = tj4Var;
        yg3Var.f35216c = tj4Var.f25208n ? un4.f32017c : un4.f32016b;
        tj4Var.f31198r = this.f29359b;
        tj4Var.f31199s = this.f29360c;
        tj4Var.f31200t = this.f29361d;
    }

    public final int hashCode() {
        int iHashCode = this.f29358a.hashCode() * 31;
        ik4 ik4Var = this.f29359b;
        int iHashCode2 = (iHashCode + (ik4Var != null ? ik4Var.hashCode() : 0)) * 31;
        jk4 jk4Var = this.f29360c;
        return this.f29361d.hashCode() + ((iHashCode2 + (jk4Var != null ? jk4Var.hashCode() : 0)) * 31);
    }
}
