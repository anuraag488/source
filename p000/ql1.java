package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ql1 extends qx0 implements y23, bj0 {

    /* JADX INFO: renamed from: q */
    public sl1 f28551q;

    /* JADX INFO: renamed from: r */
    public qh2 f28552r;

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        ql3 ql3Var = new ql3();
        C0675g4 c0675g4 = new C0675g4((byte) 27);
        c0675g4.f19600b = ql3Var;
        c0675g4.f19601c = this;
        VarHandle.storeStoreFence();
        c20.m3797B(this, c0675g4);
        qh2 qh2Var = (qh2) ql3Var.f28555a;
        if (this.f28551q.m10858T0().m8794a()) {
            qh2 qh2Var2 = this.f28552r;
            if (qh2Var2 != null) {
                qh2Var2.m9888b();
            }
            if (qh2Var != null) {
                qh2Var.m9887a();
            } else {
                qh2Var = null;
            }
            this.f28552r = qh2Var;
        }
    }
}
