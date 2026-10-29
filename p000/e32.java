package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e32 implements InterfaceC1407zj {

    /* JADX INFO: renamed from: a */
    public j41 f17661a;

    /* JADX INFO: renamed from: b */
    public sn3 f17662b;

    @Override // p000.InterfaceC1407zj
    /* JADX INFO: renamed from: a */
    public final yw4 mo4410a(sq4 sq4Var) {
        ax4 ax4VarMo4410a = this.f17661a.mo4410a(sq4Var);
        sn3 sn3Var = this.f17662b;
        dx4 dx4Var = new dx4();
        dx4Var.f17484c = ax4VarMo4410a;
        dx4Var.f17485d = sn3Var;
        dx4Var.f17482a = ((long) (ax4VarMo4410a.mo3360r() + ax4VarMo4410a.mo3359k())) * 1000000;
        dx4Var.f17483b = 0L;
        VarHandle.storeStoreFence();
        return dx4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e32)) {
            return false;
        }
        e32 e32Var = (e32) obj;
        return e32Var.f17661a.equals(this.f17661a) && e32Var.f17662b == this.f17662b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.f17662b.hashCode() + (this.f17661a.hashCode() * 31)) * 31);
    }
}
