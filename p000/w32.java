package p000;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w32 extends e13 {

    /* JADX INFO: renamed from: g0 */
    public static final C1253ve f33058g0;

    /* JADX INFO: renamed from: e0 */
    public vh4 f33059e0;

    /* JADX INFO: renamed from: f0 */
    public v32 f33060f0;

    static {
        C1253ve c1253veM3810e = c20.m3810e();
        c1253veM3810e.m11881k(pb0.f27498e);
        ((Paint) c1253veM3810e.f32549b).setStrokeWidth(1.0f);
        c1253veM3810e.m11885o(1);
        f33058g0 = c1253veM3810e;
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: T0 */
    public final void mo4865T0() {
        if (this.f33060f0 == null) {
            this.f33060f0 = new v32(this);
        }
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: W */
    public final int mo5823W(int i) {
        nh3 nh3VarM12294u = this.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo6055i((e13) wf2Var.f33299G.f25608e, wf2Var.m12287n(), i);
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: X0 */
    public final uo2 mo4869X0() {
        return this.f33060f0;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: Z */
    public final int mo5824Z(int i) {
        nh3 nh3VarM12294u = this.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo5762b((e13) wf2Var.f33299G.f25608e, wf2Var.m12287n(), i);
    }

    @Override // p000.e13
    /* JADX INFO: renamed from: Z0 */
    public final mt2 mo4871Z0() {
        return this.f33059e0;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: b0 */
    public final int mo5825b0(int i) {
        nh3 nh3VarM12294u = this.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo6054g((e13) wf2Var.f33299G.f25608e, wf2Var.m12287n(), i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: e */
    public final db3 mo5826e(long j) {
        if (this.f17627w) {
            j = this.f33060f0.f16902d;
        }
        m4427r0(j);
        wf2 wf2Var = this.f17625u;
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wf2) objArr[i2]).f33300H.f14483p.f33627l = uf2.f31823c;
        }
        m4891t1(wf2Var.f33334x.mo5763f(this, wf2Var.m12287n(), j));
        m4882k1();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // p000.e13
    /* JADX INFO: renamed from: g1 */
    public final void mo4878g1(d13 d13Var, long j, qw1 qw1Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        wf2 wf2Var;
        long jM10143a;
        wf2 wf2Var2 = this.f17625u;
        boolean z3 = false;
        if (d13Var.mo3794o(wf2Var2)) {
            if (!m4851B1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m4862Q0(j, m4870Y0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = qw1Var.f28849c;
                    uw2 uw2VarM12299z = wf2Var2.m12299z();
                    objArr = uw2VarM12299z.f32211a;
                    i3 = uw2VarM12299z.f32213c - 1;
                    while (i3 >= 0) {
                        wf2Var = (wf2) objArr[i3];
                        if (wf2Var.m12257K()) {
                            d13Var.mo3792k(wf2Var, j, qw1Var, i2, z2);
                            jM10143a = qw1Var.m10143a();
                            if (zp0.m13650A(jM10143a) >= 0.0f && zp0.m13655F(jM10143a) && !zp0.m13654E(jM10143a) && !d13Var.mo3793l(qw1Var, wf2Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    qw1Var.f28849c = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = qw1Var.f28849c;
                uw2 uw2VarM12299z2 = wf2Var2.m12299z();
                objArr = uw2VarM12299z2.f32211a;
                i3 = uw2VarM12299z2.f32213c - 1;
                while (i3 >= 0) {
                    wf2Var = (wf2) objArr[i3];
                    if (wf2Var.m12257K()) {
                        d13Var.mo3792k(wf2Var, j, qw1Var, i2, z2);
                        jM10143a = qw1Var.m10143a();
                        if (zp0.m13650A(jM10143a) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                qw1Var.f28849c = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = qw1Var.f28849c;
            uw2 uw2VarM12299z3 = wf2Var2.m12299z();
            objArr = uw2VarM12299z3.f32211a;
            i3 = uw2VarM12299z3.f32213c - 1;
            while (i3 >= 0) {
                wf2Var = (wf2) objArr[i3];
                if (wf2Var.m12257K()) {
                    d13Var.mo3792k(wf2Var, j, qw1Var, i2, z2);
                    jM10143a = qw1Var.m10143a();
                    if (zp0.m13650A(jM10143a) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            qw1Var.f28849c = i6;
        }
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: h */
    public final int mo5827h(int i) {
        nh3 nh3VarM12294u = this.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo6053a((e13) wf2Var.f33299G.f25608e, wf2Var.m12287n(), i);
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: n0 */
    public final void mo4424n0(long j, float f, yp1 yp1Var) {
        if (this.f17626v) {
            m4888q1(mo4869X0().f32027v, f, yp1Var, null);
        } else {
            m4888q1(j, f, yp1Var, null);
        }
        if (this.f30440n) {
            return;
        }
        this.f17625u.f33300H.f14483p.m12383z0();
    }

    @Override // p000.e13, p000.db3
    /* JADX INFO: renamed from: p0 */
    public final void mo4425p0(long j, float f, bu1 bu1Var) {
        w32 w32Var;
        if (this.f17626v) {
            w32Var = this;
            w32Var.m4888q1(mo4869X0().f32027v, f, null, bu1Var);
        } else {
            w32Var = this;
            w32Var.m4888q1(j, f, null, bu1Var);
        }
        if (w32Var.f30440n) {
            return;
        }
        w32Var.f17625u.f33300H.f14483p.m12383z0();
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: u0 */
    public final int mo8294u0(AbstractC0568da abstractC0568da) {
        v32 v32Var = this.f33060f0;
        if (v32Var != null) {
            return v32Var.mo8294u0(abstractC0568da);
        }
        wq2 wq2Var = this.f17625u.f33300H.f14483p;
        xf2 xf2Var = wq2Var.f33640y;
        if (!wq2Var.f33628m) {
            if (wq2Var.f33621f.f14471d == sf2.f30226a) {
                xf2Var.f34230f = true;
                if (xf2Var.f34226b) {
                    wq2Var.f33638w = true;
                    wq2Var.f33639x = true;
                }
            } else {
                xf2Var.f34231g = true;
            }
        }
        w32 w32VarMo6286u = wq2Var.mo6286u();
        boolean z = w32VarMo6286u.f30441o;
        w32VarMo6286u.f30441o = true;
        wq2Var.mo6282B();
        w32VarMo6286u.f30441o = z;
        Integer num = (Integer) xf2Var.f34233i.get(abstractC0568da);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
