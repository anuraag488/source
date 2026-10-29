package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i90 extends mt2 implements g14 {

    /* JADX INFO: renamed from: o */
    public C0499bp f21183o;

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        dt0.m4695X(this, ia5.f21226q, new C0499bp((byte) 10));
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        ia5 ia5Var = ia5.f21226q;
        h90 h90Var = new h90((byte) 0);
        h90Var.f20445b = q14Var;
        VarHandle.storeStoreFence();
        dt0.m4695X(this, ia5Var, h90Var);
        this.f21183o.getClass();
    }
}
