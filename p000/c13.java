package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c13 implements d13 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // p000.d13
    /* JADX INFO: renamed from: b */
    public final boolean mo3790b(mt2 mt2Var) {
        ?? uw2Var = 0;
        while (true) {
            int i = 0;
            if (mt2Var == 0) {
                return false;
            }
            if (mt2Var instanceof oc3) {
                ((oc3) mt2Var).mo9036t0();
            } else if ((mt2Var.f25197c & 16) != 0 && (mt2Var instanceof qx0)) {
                mt2 mt2Var2 = ((qx0) mt2Var).f28863p;
                uw2Var = uw2Var;
                mt2Var = mt2Var;
                while (mt2Var2 != null) {
                    if ((mt2Var2.f25197c & 16) != 0) {
                        i++;
                        if (i == 1) {
                            uw2Var = uw2Var;
                            mt2Var = mt2Var2;
                        } else {
                            if (uw2Var == 0) {
                                uw2Var = new uw2(new mt2[16]);
                            }
                            if (mt2Var != 0) {
                                uw2Var.m11663b(mt2Var);
                                mt2Var = 0;
                            }
                            uw2Var.m11663b(mt2Var2);
                        }
                    }
                    mt2Var2 = mt2Var2.f25200f;
                    uw2Var = uw2Var;
                    mt2Var = mt2Var;
                }
                if (i == 1) {
                }
            }
            mt2Var = sc6.m10644P(uw2Var);
        }
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: e */
    public final int mo3791e() {
        return 16;
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: k */
    public final void mo3792k(wf2 wf2Var, long j, qw1 qw1Var, int i, boolean z) {
        wf2Var.m12249B(j, qw1Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p000.d13
    /* JADX INFO: renamed from: l */
    public final boolean mo3793l(qw1 qw1Var, wf2 wf2Var) {
        e13 e13Var = (e13) wf2Var.f33299G.f25608e;
        e13Var.getClass();
        mt2 mt2VarM4874c1 = e13Var.m4874c1(f13.m5457g(16));
        if (mt2VarM4874c1 != null && mt2VarM4874c1.f25208n) {
            if (!mt2VarM4874c1.f25195a.f25208n) {
                q32.m9721c("visitLocalDescendants called on an unattached node");
            }
            mt2 mt2Var = mt2VarM4874c1.f25195a;
            if ((mt2Var.f25198d & 16) != 0) {
                while (mt2Var != null) {
                    if ((mt2Var.f25197c & 16) != 0) {
                        ?? M10644P = mt2Var;
                        ?? uw2Var = 0;
                        while (M10644P != 0) {
                            if (M10644P instanceof oc3) {
                                if (((oc3) M10644P).mo9034b0()) {
                                    qw1Var.f28849c = qw1Var.f28847a.f16533b - 1;
                                    return true;
                                }
                            } else if ((M10644P.f25197c & 16) != 0 && (M10644P instanceof qx0)) {
                                mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                                int i = 0;
                                while (mt2Var2 != null) {
                                    if ((mt2Var2.f25197c & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                            uw2Var = uw2Var;
                                            M10644P = mt2Var2;
                                        } else {
                                            if (uw2Var == 0) {
                                                uw2Var = new uw2(new mt2[16]);
                                            }
                                            if (M10644P != 0) {
                                                uw2Var.m11663b(M10644P);
                                                M10644P = 0;
                                            }
                                            uw2Var.m11663b(mt2Var2);
                                        }
                                    } else {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    mt2Var2 = mt2Var2.f25200f;
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                                if (i == 1) {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                } else {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                            }
                            M10644P = sc6.m10644P(uw2Var);
                        }
                    }
                    mt2Var = mt2Var.f25200f;
                }
            }
        }
        return false;
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: o */
    public final boolean mo3794o(wf2 wf2Var) {
        return true;
    }
}
