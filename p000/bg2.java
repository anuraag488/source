package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bg2 implements fe4, zq2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ eg2 f15256a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ jg2 f15257b;

    @Override // p000.ky0
    /* JADX INFO: renamed from: A0 */
    public final float mo3572A0(float f) {
        return f / this.f15256a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return this.f15256a.mo3573C(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: D */
    public final long mo3574D(long j) {
        return this.f15256a.mo3574D(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: E */
    public final float mo3575E(float f) {
        return this.f15256a.mo3580c() * f;
    }

    @Override // p000.fe4
    /* JADX INFO: renamed from: L */
    public final List mo3576L(mq1 mq1Var, Object obj) {
        jg2 jg2Var = this.f15257b;
        wf2 wf2Var = jg2Var.f22230a;
        lw2 lw2Var = jg2Var.f22236g;
        wf2 wf2Var2 = (wf2) lw2Var.m8132g(obj);
        if (wf2Var2 != null && ((uw2) ((aw2) wf2Var.m12289p()).f14915b).m11670j(wf2Var2) < jg2Var.f22233d) {
            return wf2Var2.m12287n();
        }
        lw2 lw2Var2 = jg2Var.f22241l;
        lw2 lw2Var3 = jg2Var.f22239j;
        uw2 uw2Var = jg2Var.f22242m;
        if (uw2Var.f32213c < jg2Var.f22234e) {
            q32.m9719a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        wf2 wf2Var3 = (wf2) lw2Var.m8132g(obj);
        int i = uw2Var.f32213c;
        int i2 = jg2Var.f22234e;
        if (i == i2) {
            uw2Var.m11663b(obj);
        } else {
            Object[] objArr = uw2Var.f32211a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        jg2Var.f22234e++;
        boolean zM8127b = lw2Var3.m8127b(obj);
        if (zM8127b || wf2Var3 != null) {
            if (!zM8127b && wf2Var3 != null) {
                jg2Var.m7098k(((uw2) ((aw2) wf2Var.m12289p()).f14915b).m11670j(wf2Var3), ((uw2) ((aw2) wf2Var.m12289p()).f14915b).f32213c);
                jg2Var.f22244o++;
                lw2Var.m8136k(obj);
                lw2Var3.m8138m(obj, wf2Var3);
                lw2Var2.m8138m(obj, jg2Var.m7093f(obj));
                if (wf2Var.m12256J()) {
                    jg2Var.m7096i();
                }
            }
            wf2 wf2Var4 = (wf2) lw2Var3.m8132g(obj);
            cg2 cg2Var = wf2Var4 != null ? (cg2) jg2Var.f22235f.m8132g(wf2Var4) : null;
            if (cg2Var != null && cg2Var.f16000d) {
                jg2Var.m7101n(wf2Var4, obj, false, mq1Var);
            }
            if ((cg2Var != null ? cg2Var.f16002f : null) != null) {
                jg2Var.m7092b(cg2Var, true);
            }
        } else {
            jg2Var.m7099l(obj, mq1Var, false);
            lw2Var2.m8138m(obj, jg2Var.m7093f(obj));
        }
        wf2 wf2Var5 = (wf2) lw2Var3.m8132g(obj);
        if (wf2Var5 == null) {
            return v71.f32439a;
        }
        List listM12379t0 = wf2Var5.f33300H.f14483p.m12379t0();
        int size = listM12379t0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((wq2) ((aw2) listM12379t0).get(i3)).f33621f.f14469b = true;
        }
        return listM12379t0;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        return this.f15256a.mo3577O(j);
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: T */
    public final yq2 mo3578T(int i, int i2, Map map, yp1 yp1Var, yp1 yp1Var2) {
        return this.f15256a.mo3578T(i, i2, map, yp1Var, yp1Var2);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: U */
    public final int mo3579U(float f) {
        return this.f15256a.mo3579U(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f15256a.f18069b;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c0 */
    public final long mo3581c0(long j) {
        return this.f15256a.mo3581c0(j);
    }

    @Override // p000.s62
    public final df2 getLayoutDirection() {
        return this.f15256a.f18068a;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: h0 */
    public final float mo3582h0(long j) {
        return this.f15256a.mo3582h0(j);
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: l0 */
    public final yq2 mo3583l0(int i, int i2, Map map, yp1 yp1Var) {
        return this.f15256a.mo3578T(i, i2, map, null, yp1Var);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: o0 */
    public final long mo3584o0(float f) {
        return this.f15256a.mo3584o0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f15256a.f18070c;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: w0 */
    public final float mo3586w0(int i) {
        return this.f15256a.mo3586w0(i);
    }

    @Override // p000.s62
    /* JADX INFO: renamed from: z */
    public final boolean mo3587z() {
        return this.f15256a.mo3587z();
    }
}
