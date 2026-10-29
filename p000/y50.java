package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y50 extends mt2 implements y23, o40, s31 {

    /* JADX INFO: renamed from: o */
    public final z50 f34896o;

    /* JADX INFO: renamed from: p */
    public boolean f34897p;

    /* JADX INFO: renamed from: q */
    public yp1 f34898q;

    public y50(z50 z50Var, yp1 yp1Var) {
        this.f34896o = z50Var;
        this.f34898q = yp1Var;
        z50Var.f35750a = this;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        m12933O0();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m12933O0() {
        this.f34897p = false;
        this.f34896o.f35751b = null;
        z62.m13348G(this);
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        m12933O0();
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        boolean z = this.f34897p;
        z50 z50Var = this.f34896o;
        if (!z) {
            z50Var.f35751b = null;
            C0675g4 c0675g4 = new C0675g4((byte) 13);
            c0675g4.f19600b = this;
            c0675g4.f19601c = z50Var;
            VarHandle.storeStoreFence();
            c20.m3797B(this, c0675g4);
            if (z50Var.f35751b == null) {
                throw d55.m4363h("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f34897p = true;
        }
        z50Var.f35751b.f30740a.invoke(yf2Var);
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        m12933O0();
    }

    @Override // p000.o40
    /* JADX INFO: renamed from: c */
    public final ky0 mo8939c() {
        return sc6.m10652X(this).f33336z;
    }

    @Override // p000.o40
    /* JADX INFO: renamed from: d */
    public final long mo8940d() {
        return z62.m13369a0(sc6.m10650V(this, 4).f16901c);
    }

    @Override // p000.o40
    public final df2 getLayoutDirection() {
        return sc6.m10652X(this).f33293A;
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: r0 */
    public final void mo10513r0() {
        m12933O0();
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: z0 */
    public final void mo4199z0() {
        m12933O0();
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
    }
}
