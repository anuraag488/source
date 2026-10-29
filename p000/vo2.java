package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vo2 implements cf2 {

    /* JADX INFO: renamed from: a */
    public uo2 f32763a;

    @Override // p000.cf2
    /* JADX INFO: renamed from: G */
    public final long mo3998G(cf2 cf2Var, long j) {
        return mo4006V(cf2Var, j, true);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: I */
    public final long mo3999I(long j) {
        return b33.m3430h(this.f32763a.f32026u.mo3999I(j), m11943a());
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: K */
    public final boolean mo4000K() {
        return this.f32763a.f32026u.mo4871Z0().f25208n;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: N */
    public final void mo4001N(float[] fArr) {
        this.f32763a.f32026u.mo4001N(fArr);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: P */
    public final void mo4002P(cf2 cf2Var, float[] fArr) {
        this.f32763a.f32026u.mo4002P(cf2Var, fArr);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: Q */
    public final jl3 mo4003Q(cf2 cf2Var, boolean z) {
        return this.f32763a.f32026u.mo4003Q(cf2Var, z);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: R */
    public final long mo4004R() {
        uo2 uo2Var = this.f32763a;
        return (((long) uo2Var.f16899a) << 32) | (((long) uo2Var.f16900b) & 4294967295L);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: S */
    public final long mo4005S(long j) {
        return this.f32763a.f32026u.mo4005S(b33.m3430h(j, m11943a()));
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: V */
    public final long mo4006V(cf2 cf2Var, long j, boolean z) {
        uo2 uo2Var = this.f32763a;
        if (!(cf2Var instanceof vo2)) {
            uo2 uo2VarM12931y = AbstractC1356y5.m12931y(uo2Var);
            cf2 cf2Var2 = uo2VarM12931y.f32026u;
            long jMo4006V = mo4006V(uo2VarM12931y.f32029x, j, z);
            long j2 = uo2VarM12931y.f32027v;
            long jM3429g = b33.m3429g(jMo4006V, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            cf2 cf2VarMo4012v = cf2Var2.mo4012v();
            if (cf2VarMo4012v != null) {
                cf2Var2 = cf2VarMo4012v;
            }
            return b33.m3430h(jM3429g, ((e13) cf2Var2).mo4006V(cf2Var, 0L, z));
        }
        uo2 uo2Var2 = ((vo2) cf2Var).f32763a;
        e13 e13Var = uo2Var2.f32026u;
        e13Var.m4881j1();
        uo2 uo2VarMo4869X0 = uo2Var.f32026u.m4866U0(e13Var).mo4869X0();
        if (uo2VarMo4869X0 != null) {
            boolean z2 = !z;
            long jM8957d = o52.m8957d(o52.m8958e(uo2Var2.m11600Q0(uo2VarMo4869X0, z2), y42.m12827F0(j)), uo2Var.m11600Q0(uo2VarMo4869X0, z2));
            return (((long) Float.floatToRawIntBits((int) (jM8957d >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM8957d & 4294967295L))) & 4294967295L);
        }
        uo2 uo2VarM12931y2 = AbstractC1356y5.m12931y(uo2Var2);
        boolean z3 = !z;
        long jM8958e = o52.m8958e(o52.m8958e(uo2Var2.m11600Q0(uo2VarM12931y2, z3), uo2VarM12931y2.f32027v), y42.m12827F0(j));
        uo2 uo2VarM12931y3 = AbstractC1356y5.m12931y(uo2Var);
        long jM8957d2 = o52.m8957d(jM8958e, o52.m8958e(uo2Var.m11600Q0(uo2VarM12931y3, z3), uo2VarM12931y3.f32027v));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM8957d2 >> 32));
        return uo2VarM12931y3.f32026u.f17629y.mo4006V(uo2VarM12931y2.f32026u.f17629y, (((long) Float.floatToRawIntBits((int) (jM8957d2 & 4294967295L))) & 4294967295L) | (jFloatToRawIntBits << 32), z);
    }

    /* JADX INFO: renamed from: a */
    public final long m11943a() {
        uo2 uo2Var = this.f32763a;
        uo2 uo2VarM12931y = AbstractC1356y5.m12931y(uo2Var);
        return b33.m3429g(mo4006V(uo2VarM12931y.f32029x, 0L, true), uo2Var.f32026u.mo4006V(uo2VarM12931y.f32026u, 0L, true));
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: b */
    public final long mo4007b(long j) {
        return this.f32763a.f32026u.mo4007b(b33.m3430h(j, m11943a()));
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: j */
    public final long mo4008j(long j) {
        return b33.m3430h(this.f32763a.f32026u.mo4008j(j), m11943a());
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: k */
    public final long mo4009k(long j) {
        return this.f32763a.f32026u.mo4009k(b33.m3430h(j, m11943a()));
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: l */
    public final boolean mo4010l() {
        return this.f32763a.f30438l;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: n */
    public final cf2 mo4011n() {
        uo2 uo2VarMo4869X0;
        if (!mo4000K()) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e13 e13Var = ((e13) this.f32763a.f32026u.f17625u.f33299G.f25608e).f17629y;
        if (e13Var == null || (uo2VarMo4869X0 = e13Var.mo4869X0()) == null) {
            return null;
        }
        return uo2VarMo4869X0.f32029x;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: v */
    public final cf2 mo4012v() {
        uo2 uo2VarMo4869X0;
        if (!mo4000K()) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e13 e13Var = this.f32763a.f32026u.f17629y;
        if (e13Var == null || (uo2VarMo4869X0 = e13Var.mo4869X0()) == null) {
            return null;
        }
        return uo2VarMo4869X0.f32029x;
    }
}
