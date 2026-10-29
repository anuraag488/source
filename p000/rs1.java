package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 extends rw2 {
    @Override // p000.rw2
    /* JADX INFO: renamed from: C */
    public final rw2 mo6057C(yp1 yp1Var, yp1 yp1Var2) {
        C0686gf c0686gf = new C0686gf((byte) 8);
        c0686gf.f19762b = yp1Var;
        c0686gf.f19763c = yp1Var2;
        VarHandle.storeStoreFence();
        C0797jg c0797jg = new C0797jg((byte) 7);
        c0797jg.f22228b = c0686gf;
        VarHandle.storeStoreFence();
        return (rw2) ((e94) k94.m7445b(c0797jg));
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: c */
    public final void mo3384c() {
        synchronized (k94.f23012c) {
            m5023o();
        }
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: k */
    public final void mo5019k() {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: l */
    public final void mo5020l() {
        kx5.m7741w0();
        throw null;
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: m */
    public final void mo5021m() {
        k94.m7446c();
    }

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: u */
    public final e94 mo3785u(yp1 yp1Var) {
        qs1 qs1Var = new qs1((byte) 0);
        qs1Var.f28748b = yp1Var;
        VarHandle.storeStoreFence();
        C0797jg c0797jg = new C0797jg((byte) 7);
        c0797jg.f22228b = qs1Var;
        VarHandle.storeStoreFence();
        return (wj3) ((e94) k94.m7445b(c0797jg));
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: w */
    public final y42 mo3385w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
