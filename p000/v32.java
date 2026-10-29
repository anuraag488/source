package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v32 extends uo2 {
    @Override // p000.uo2
    /* JADX INFO: renamed from: O0 */
    public final void mo11598O0() {
        this.f32026u.f17625u.f33300H.f14484q.m13197C0();
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: W */
    public final int mo5823W(int i) {
        nh3 nh3VarM12294u = this.f32026u.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo6055i((e13) wf2Var.f33299G.f25608e, wf2Var.m12286m(), i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: Z */
    public final int mo5824Z(int i) {
        nh3 nh3VarM12294u = this.f32026u.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo5762b((e13) wf2Var.f33299G.f25608e, wf2Var.m12286m(), i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: b0 */
    public final int mo5825b0(int i) {
        nh3 nh3VarM12294u = this.f32026u.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo6054g((e13) wf2Var.f33299G.f25608e, wf2Var.m12286m(), i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: e */
    public final db3 mo5826e(long j) {
        m4427r0(j);
        e13 e13Var = this.f32026u;
        uw2 uw2VarM12248A = e13Var.f17625u.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            ((wf2) objArr[i2]).f33300H.f14484q.f35407j = uf2.f31823c;
        }
        wf2 wf2Var = e13Var.f17625u;
        m11601R0(wf2Var.f33334x.mo5763f(this, wf2Var.m12286m(), j));
        return this;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: h */
    public final int mo5827h(int i) {
        nh3 nh3VarM12294u = this.f32026u.f17625u.m12294u();
        xq2 xq2VarM8739F = nh3VarM12294u.m8739F();
        wf2 wf2Var = (wf2) nh3VarM12294u.f25810b;
        return xq2VarM8739F.mo6053a((e13) wf2Var.f33299G.f25608e, wf2Var.m12286m(), i);
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: u0 */
    public final int mo8294u0(AbstractC0568da abstractC0568da) {
        yo2 yo2Var = this.f32026u.f17625u.f33300H.f14484q;
        xf2 xf2Var = yo2Var.f35416s;
        if (!yo2Var.f35408k) {
            ag2 ag2Var = yo2Var.f35403f;
            if (ag2Var.f14471d == sf2.f30227b) {
                xf2Var.f34230f = true;
                if (xf2Var.f34226b) {
                    ag2Var.f14473f = true;
                    ag2Var.f14474g = true;
                }
            } else {
                xf2Var.f34231g = true;
            }
        }
        v32 v32Var = yo2Var.mo6286u().f33060f0;
        Boolean boolValueOf = v32Var != null ? Boolean.valueOf(v32Var.f30441o) : null;
        v32 v32Var2 = yo2Var.mo6286u().f33060f0;
        if (v32Var2 != null) {
            v32Var2.f30441o = true;
        }
        yo2Var.mo6282B();
        v32 v32Var3 = yo2Var.mo6286u().f33060f0;
        if (v32Var3 != null) {
            v32Var3.f30441o = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) xf2Var.f34233i.get(abstractC0568da);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f32031z.m13263g(iIntValue, abstractC0568da);
        return iIntValue;
    }
}
