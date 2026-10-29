package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class sd4 extends st2 {

    /* JADX INFO: renamed from: a */
    public wp1 f30185a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        wp1 wp1Var = this.f30185a;
        td4 td4Var = new td4();
        td4Var.f31091q = wp1Var;
        C1252vd c1252vd = new C1252vd((byte) 4);
        c1252vd.f32529b = td4Var;
        VarHandle.storeStoreFence();
        ec3 ec3Var = rf4.f29227a;
        vf4 vf4Var = new vf4(null, null, c1252vd);
        td4Var.m10154O0(vf4Var);
        td4Var.f31093s = vf4Var;
        VarHandle.storeStoreFence();
        return td4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd4) && this.f30185a == ((sd4) obj).f30185a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((td4) mt2Var).f31091q = this.f30185a;
    }

    public final int hashCode() {
        return this.f30185a.hashCode();
    }
}
