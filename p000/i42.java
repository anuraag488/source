package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i42 extends mt2 implements pp4 {

    /* JADX INFO: renamed from: o */
    public a05 f21122o;

    /* JADX INFO: renamed from: p */
    public a05 f21123p;

    public i42() {
        oh1 oh1Var = ev0.f18505m;
        this.f21122o = oh1Var;
        this.f21123p = oh1Var;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public void mo26G0() {
        h42 h42Var = new h42((byte) 1);
        h42Var.f20380b = this;
        VarHandle.storeStoreFence();
        dt0.m4695X(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", h42Var);
        mo6659P0();
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public void mo27H0() {
        this.f21123p = this.f21122o;
        h42 h42Var = new h42((byte) 0);
        h42Var.f20380b = this;
        VarHandle.storeStoreFence();
        dt0.m4697Z(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", h42Var);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        this.f21122o = ev0.f18505m;
    }

    /* JADX INFO: renamed from: O0 */
    public abstract a05 mo6658O0(a05 a05Var);

    /* JADX INFO: renamed from: P0 */
    public void mo6659P0() {
        this.f21123p = mo6658O0(this.f21122o);
        h42 h42Var = new h42((byte) 0);
        h42Var.f20380b = this;
        VarHandle.storeStoreFence();
        dt0.m4697Z(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", h42Var);
    }

    @Override // p000.pp4
    /* JADX INFO: renamed from: w */
    public final Object mo3663w() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
