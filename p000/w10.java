package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w10 implements xh1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ fy4 f33013a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ d64 f33014b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ky0 f33015c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ z84 f33016d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ wp1 f33017e;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p000.xh1
    /* JADX INFO: renamed from: a */
    public final Object mo3327a(tx3 tx3Var, float f, wm0 wm0Var) {
        v10 v10Var;
        wp1 wp1Var = this.f33017e;
        ky0 ky0Var = this.f33015c;
        d64 d64Var = this.f33014b;
        C0940nb c0940nb = d64Var.f16820d;
        if (wm0Var instanceof v10) {
            v10Var = (v10) wm0Var;
            int i = v10Var.f32303v;
            if ((i & Integer.MIN_VALUE) != 0) {
                v10Var.f32303v = i - Integer.MIN_VALUE;
            } else {
                v10Var = new v10(this, (ym0) wm0Var);
            }
        } else {
            v10Var = new v10(this, (ym0) wm0Var);
        }
        Object objMo3327a = v10Var.f32301t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = v10Var.f32303v;
        try {
            if (i2 == 0) {
                k43.m7376J(objMo3327a);
                float fMo5856a = this.f33013a.mo5856a();
                float fM10674o = sc6.m10674o(f, -fMo5856a, fMo5856a);
                if (fM10674o > 0.0f) {
                    uv0 uv0VarM8670h = c0940nb.m8670h();
                    e64 e64Var = e64.f17842a;
                    if (uv0VarM8670h.m11653c(e64Var)) {
                        float fMax = Math.max(0.0f, c0940nb.m8670h().m11656f(e64Var) - c0940nb.m8675m());
                        float fMo3575E = ky0Var.mo3575E(125.0f);
                        if (fMax < fMo3575E) {
                            float f2 = fMax / fMo3575E;
                            fM10674o *= f2 * f2;
                            float fMo3575E2 = ky0Var.mo3575E(125.0f);
                            if (f >= fMo3575E2) {
                                fM10674o = Math.max(fM10674o, fMo3575E2);
                            }
                        }
                    }
                }
                z84 z84Var = this.f33016d;
                v10Var.f32303v = 1;
                objMo3327a = z84Var.mo3327a(tx3Var, fM10674o, v10Var);
                if (objMo3327a == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(objMo3327a);
            }
            float fFloatValue = ((Number) objMo3327a).floatValue();
            if (!d64Var.m4388e()) {
                wp1Var.invoke();
            }
            return new Float(fFloatValue);
        } catch (Throwable th) {
            if (!d64Var.m4388e()) {
                wp1Var.invoke();
            }
            throw th;
        }
    }
}
