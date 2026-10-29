package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class gj4 extends st2 {

    /* JADX INFO: renamed from: a */
    public mn3 f19821a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        mn3 mn3Var = this.f19821a;
        ij4 ij4Var = new ij4();
        ij4Var.f21497q = mn3Var;
        ij4Var.f21498r = new d83(null, o85.f26450j);
        C1252vd c1252vd = new C1252vd((byte) 5);
        c1252vd.f32529b = ij4Var;
        VarHandle.storeStoreFence();
        ec3 ec3Var = rf4.f29227a;
        ij4Var.m10154O0(new vf4(null, null, c1252vd));
        VarHandle.storeStoreFence();
        return ij4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj4) && this.f19821a == ((gj4) obj).f19821a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((ij4) mt2Var).f21497q = this.f19821a;
    }

    public final int hashCode() {
        mn3 mn3Var = this.f19821a;
        if (mn3Var != null) {
            return mn3Var.hashCode();
        }
        return 0;
    }
}
