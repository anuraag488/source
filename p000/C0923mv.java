package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: mv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0923mv extends mt2 {

    /* JADX INFO: renamed from: o */
    public lm4 f25226o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0960nv f25227p;

    public C0923mv(C0960nv c0960nv) {
        this.f25227p = c0960nv;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        C0960nv c0960nv = this.f25227p;
        c0960nv.f26105a = this;
        if (c0960nv.f26106b != null) {
            C0558d0 c0558d0 = new C0558d0((byte) 9);
            c0558d0.f16655b = this;
            c0558d0.f16656c = c0960nv;
            VarHandle.storeStoreFence();
            this.f25226o = dt0.m4684M(this, c0558d0);
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        C0960nv c0960nv = this.f25227p;
        if (c0960nv.f26105a == this) {
            c0960nv.f26105a = null;
        }
        lm4 lm4Var = this.f25226o;
        if (lm4Var != null) {
            lm4Var.m8038b();
        }
        this.f25226o = null;
    }
}
