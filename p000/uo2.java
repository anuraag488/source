package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class uo2 extends so2 implements sq2 {

    /* JADX INFO: renamed from: u */
    public final e13 f32026u;

    /* JADX INFO: renamed from: v */
    public long f32027v = 0;

    /* JADX INFO: renamed from: w */
    public LinkedHashMap f32028w;

    /* JADX INFO: renamed from: x */
    public final vo2 f32029x;

    /* JADX INFO: renamed from: y */
    public yq2 f32030y;

    /* JADX INFO: renamed from: z */
    public final yv2 f32031z;

    public uo2(e13 e13Var) {
        this.f32026u = e13Var;
        vo2 vo2Var = new vo2();
        vo2Var.f32763a = this;
        VarHandle.storeStoreFence();
        this.f32029x = vo2Var;
        yv2 yv2Var = p23.f27324a;
        this.f32031z = new yv2();
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: C0 */
    public final cf2 mo4852C0() {
        return this.f32029x;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4853D0() {
        return this.f32030y != null;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: E0 */
    public final wf2 mo4854E0() {
        return this.f32026u.f17625u;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: F0 */
    public final yq2 mo4855F0() {
        yq2 yq2Var = this.f32030y;
        if (yq2Var != null) {
            return yq2Var;
        }
        throw d55.m4363h("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: G0 */
    public final so2 mo4856G0() {
        e13 e13Var = this.f32026u.f17629y;
        if (e13Var != null) {
            return e13Var.mo4869X0();
        }
        return null;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: H0 */
    public final long mo4857H0() {
        return this.f32027v;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: L0 */
    public final void mo4858L0() {
        mo4424n0(this.f32027v, 0.0f, null);
    }

    /* JADX INFO: renamed from: N0 */
    public final long m11597N0() {
        return (((long) this.f16899a) << 32) | (((long) this.f16900b) & 4294967295L);
    }

    /* JADX INFO: renamed from: O0 */
    public void mo11598O0() {
        mo4855F0().mo4503b();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m11599P0(long j) {
        if (!o52.m8956c(this.f32027v, j)) {
            this.f32027v = j;
            e13 e13Var = this.f32026u;
            yo2 yo2Var = e13Var.f17625u.f33300H.f14484q;
            if (yo2Var != null) {
                yo2Var.m13203y0();
            }
            so2.m10880J0(e13Var);
        }
        if (this.f30441o) {
            return;
        }
        m10886y0(mo4855F0());
    }

    /* JADX INFO: renamed from: Q0 */
    public final long m11600Q0(uo2 uo2Var, boolean z) {
        long jM8958e = 0;
        while (!this.equals(uo2Var)) {
            if (!this.f30438l || !z) {
                jM8958e = o52.m8958e(jM8958e, this.f32027v);
            }
            this = this.f32026u.f17629y.mo4869X0();
        }
        return jM8958e;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m11601R0(yq2 yq2Var) {
        LinkedHashMap linkedHashMap;
        if (yq2Var != null) {
            m4426q0((((long) yq2Var.mo4504d()) & 4294967295L) | (((long) yq2Var.mo4506g()) << 32));
        } else {
            m4426q0(0L);
        }
        if (!z62.m13387o(this.f32030y, yq2Var) && yq2Var != null && ((((linkedHashMap = this.f32028w) != null && !linkedHashMap.isEmpty()) || !yq2Var.mo4502a().isEmpty()) && !z62.m13387o(yq2Var.mo4502a(), this.f32028w))) {
            this.f32026u.f17625u.f33300H.f14484q.f35416s.m12691f();
            LinkedHashMap linkedHashMap2 = this.f32028w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f32028w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(yq2Var.mo4502a());
        }
        this.f32030y = yq2Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f32026u.mo3580c();
    }

    @Override // p000.s62
    public final df2 getLayoutDirection() {
        return this.f32026u.f17625u.f33293A;
    }

    @Override // p000.db3, p000.sq2
    /* JADX INFO: renamed from: m */
    public final Object mo4423m() {
        return this.f32026u.mo4423m();
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: n0 */
    public final void mo4424n0(long j, float f, yp1 yp1Var) {
        m11599P0(j);
        if (this.f30440n) {
            return;
        }
        mo11598O0();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f32026u.mo3585r();
    }

    @Override // p000.so2, p000.s62
    /* JADX INFO: renamed from: z */
    public final boolean mo3587z() {
        return true;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: z0 */
    public final so2 mo4896z0() {
        e13 e13Var = this.f32026u.f17628x;
        if (e13Var != null) {
            return e13Var.mo4869X0();
        }
        return null;
    }
}
