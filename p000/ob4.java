package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ob4 implements InterfaceC1407zj {

    /* JADX INFO: renamed from: a */
    public ag1 f26542a;

    /* JADX INFO: renamed from: b */
    public long f26543b;

    @Override // p000.InterfaceC1407zj
    /* JADX INFO: renamed from: a */
    public final yw4 mo4410a(sq4 sq4Var) {
        yw4 yw4VarMo4410a = this.f26542a.mo4410a(sq4Var);
        long j = this.f26543b;
        pb4 pb4Var = new pb4();
        pb4Var.f27512a = yw4VarMo4410a;
        pb4Var.f27513b = j;
        VarHandle.storeStoreFence();
        return pb4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ob4)) {
            return false;
        }
        ob4 ob4Var = (ob4) obj;
        return ob4Var.f26543b == this.f26543b && z62.m13387o(ob4Var.f26542a, this.f26542a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f26543b) + (this.f26542a.hashCode() * 31);
    }
}
