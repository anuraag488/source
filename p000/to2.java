package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class to2 extends cb3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f31286b;

    /* JADX INFO: renamed from: c */
    public Object f31287c;

    public /* synthetic */ to2(byte b) {
        this.f31286b = b;
    }

    @Override // p000.cb3
    /* JADX INFO: renamed from: a */
    public float mo3947a(gx1 gx1Var) {
        yp1 yp1Var;
        int iM9210e0;
        u63 snapshotObserver;
        int iM9210e1;
        switch (this.f31286b) {
            case 0:
                mq1 mq1Var = gx1Var.f20169a;
                if (mq1Var != null) {
                    return ((Number) mq1Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                so2 so2Var = (so2) this.f31287c;
                if (so2Var.f30441o) {
                    return Float.NaN;
                }
                ql3 ql3Var = new ql3();
                ql3Var.f28555a = so2Var;
                while (true) {
                    x72 x72Var = ((so2) ql3Var.f28555a).f30443q;
                    float f = (x72Var == null || (iM9210e1 = AbstractC0990oo.m9210e0(gx1Var, (gx1[]) x72Var.f34037b)) < 0) ? Float.NaN : ((float[]) x72Var.f34038c)[iM9210e1];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = ql3Var.f28555a;
                    if (!zIsNaN) {
                        ((so2) obj).m10884t0(so2Var.mo4854E0(), gx1Var);
                        return gx1Var.m6189a(f, ((so2) ql3Var.f28555a).mo4852C0(), so2Var.mo4852C0());
                    }
                    so2 so2Var2 = (so2) obj;
                    mq1 mq1Var2 = so2Var2.f30434h;
                    if (mq1Var2 != null && (yp1Var = so2Var2.f30435i) != null && ((Boolean) yp1Var.invoke(gx1Var)).booleanValue()) {
                        so2 so2Var3 = (so2) ql3Var.f28555a;
                        lw2 lw2Var = so2Var3.f30437k;
                        if (lw2Var == null) {
                            long[] jArr = tv3.f31472a;
                            lw2Var = new lw2();
                            so2Var3.f30437k = lw2Var;
                        }
                        Object objM8132g = lw2Var.m8132g(gx1Var);
                        if (objM8132g == null) {
                            objM8132g = new fb3(so2Var3.mo4855F0(), so2Var3, gx1Var);
                            lw2Var.m8138m(gx1Var, objM8132g);
                        }
                        fb3 fb3Var = (fb3) objM8132g;
                        fb3Var.f18892a = so2Var3.mo4855F0();
                        r63 r63Var = so2Var.mo4854E0().f33325o;
                        if (r63Var != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).getSnapshotObserver()) != null) {
                            C1048pv c1048pv = new C1048pv((byte) 10);
                            c1048pv.f28016b = mq1Var2;
                            c1048pv.f28017c = ql3Var;
                            c1048pv.f28018d = gx1Var;
                            VarHandle.storeStoreFence();
                            snapshotObserver.f31675a.m159e(fb3Var, so2.f30431t, c1048pv);
                        }
                        ((so2) ql3Var.f28555a).m10884t0(so2Var.mo4854E0(), gx1Var);
                        x72 x72Var2 = ((so2) ql3Var.f28555a).f30443q;
                        float f2 = (x72Var2 == null || (iM9210e0 = AbstractC0990oo.m9210e0(gx1Var, (gx1[]) x72Var2.f34037b)) < 0) ? Float.NaN : ((float[]) x72Var2.f34038c)[iM9210e0];
                        if (!Float.isNaN(f2)) {
                            return gx1Var.m6189a(f2, ((so2) ql3Var.f28555a).mo4852C0(), so2Var.mo4852C0());
                        }
                    }
                    so2 so2VarMo4856G0 = ((so2) ql3Var.f28555a).mo4856G0();
                    if (so2VarMo4856G0 == null) {
                        ((so2) ql3Var.f28555a).m10884t0(so2Var.mo4854E0(), gx1Var);
                        return Float.NaN;
                    }
                    ql3Var.f28555a = so2VarMo4856G0;
                }
                break;
            default:
                return super.mo3947a(gx1Var);
        }
    }

    @Override // p000.cb3
    /* JADX INFO: renamed from: b */
    public final cf2 mo3948b() {
        switch (this.f31286b) {
            case 0:
                so2 so2Var = (so2) this.f31287c;
                cf2 cf2VarMo4852C0 = so2Var.f30441o ? null : so2Var.mo4852C0();
                if (cf2VarMo4852C0 == null) {
                    so2Var.mo4854E0().f33300H.m2983b();
                }
                return cf2VarMo4852C0;
            default:
                return (e13) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f31287c).getRoot().f33299G.f25608e;
        }
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        switch (this.f31286b) {
            case 0:
                return ((so2) this.f31287c).mo3580c();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f31287c).getDensity().mo3580c();
        }
    }

    @Override // p000.cb3
    /* JADX INFO: renamed from: e */
    public final df2 mo3949e() {
        switch (this.f31286b) {
            case 0:
                return ((so2) this.f31287c).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f31287c).getLayoutDirection();
        }
    }

    @Override // p000.cb3
    /* JADX INFO: renamed from: h */
    public final int mo3950h() {
        switch (this.f31286b) {
            case 0:
                return ((so2) this.f31287c).mo4421j0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f31287c).getRoot().f33300H.f14483p.f16899a;
        }
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        switch (this.f31286b) {
            case 0:
                return ((so2) this.f31287c).mo3585r();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f31287c).getDensity().mo3585r();
        }
    }
}
