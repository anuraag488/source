package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: renamed from: ln */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0878ln implements InterfaceC0804jn, zq2, zo2 {

    /* JADX INFO: renamed from: a */
    public final of2 f24187a;

    /* JADX INFO: renamed from: b */
    public m20 f24188b;

    /* JADX INFO: renamed from: c */
    public boolean f24189c;

    public C0878ln(of2 of2Var, m20 m20Var) {
        this.f24187a = of2Var;
        this.f24188b = m20Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: A0 */
    public final float mo3572A0(float f) {
        return f / this.f24187a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return this.f24187a.mo3573C(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: D */
    public final long mo3574D(long j) {
        return this.f24187a.mo3574D(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: E */
    public final float mo3575E(float f) {
        return this.f24187a.mo3580c() * f;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        return this.f24187a.mo3577O(j);
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: T */
    public final yq2 mo3578T(int i, int i2, Map map, yp1 yp1Var, yp1 yp1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q32.m9721c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        C0841kn c0841kn = new C0841kn((byte) 0);
        c0841kn.f23249f = yp1Var2;
        c0841kn.f23250g = this;
        c0841kn.f23245b = i;
        c0841kn.f23246c = i2;
        c0841kn.f23247d = map;
        c0841kn.f23248e = yp1Var;
        VarHandle.storeStoreFence();
        return c0841kn;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: U */
    public final int mo3579U(float f) {
        return this.f24187a.mo3579U(f);
    }

    @Override // p000.zo2
    /* JADX INFO: renamed from: a */
    public final cf2 mo3108a(cf2 cf2Var) {
        vo2 vo2Var;
        if (cf2Var instanceof vo2) {
            return cf2Var;
        }
        if (cf2Var instanceof e13) {
            uo2 uo2VarMo4869X0 = ((e13) cf2Var).mo4869X0();
            return (uo2VarMo4869X0 == null || (vo2Var = uo2VarMo4869X0.f32029x) == null) ? cf2Var : vo2Var;
        }
        q32.m9720b("Unsupported LayoutCoordinates");
        xy4.m12794w();
        return null;
    }

    @Override // p000.zo2
    /* JADX INFO: renamed from: b */
    public final cf2 mo3109b() {
        w32 w32Var;
        wf2 wf2Var = this.f24187a.f17625u.f33319i;
        if (wf2Var == null) {
            q32.m9720b("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            xy4.m12794w();
            return null;
        }
        if (!wf2Var.f33318h) {
            return (e13) wf2Var.f33299G.f25608e;
        }
        wf2 wf2VarM12295v = wf2Var.m12295v();
        return (wf2VarM12295v == null || (w32Var = (w32) wf2VarM12295v.f33299G.f25607d) == null) ? (e13) ((wf2) ((aw2) wf2Var.m12288o()).get(0)).f33299G.f25608e : w32Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f24187a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c0 */
    public final long mo3581c0(long j) {
        return this.f24187a.mo3581c0(j);
    }

    @Override // p000.s62
    public final df2 getLayoutDirection() {
        return this.f24187a.f17625u.f33293A;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: h0 */
    public final float mo3582h0(long j) {
        return this.f24187a.mo3582h0(j);
    }

    @Override // p000.InterfaceC0694gn
    /* JADX INFO: renamed from: i */
    public final long mo6044i() {
        yq2 yq2VarMo4855F0 = this.f24187a.f26673g0.mo4855F0();
        return (((long) yq2VarMo4855F0.mo4506g()) << 32) | (((long) yq2VarMo4855F0.mo4504d()) & 4294967295L);
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: l0 */
    public final yq2 mo3583l0(int i, int i2, Map map, yp1 yp1Var) {
        return this.f24187a.mo3578T(i, i2, map, null, yp1Var);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: o0 */
    public final long mo3584o0(float f) {
        return this.f24187a.mo3584o0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f24187a.mo3585r();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: w0 */
    public final float mo3586w0(int i) {
        return this.f24187a.mo3586w0(i);
    }

    @Override // p000.s62
    /* JADX INFO: renamed from: z */
    public final boolean mo3587z() {
        return false;
    }
}
