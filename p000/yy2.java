package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yy2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ b33 f35616A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ sw2 f35617B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C0910mi f35618C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ lu2 f35619D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f35620E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f35621F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ float f35622G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ b33 f35623H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C0910mi f35624I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f35625J;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f35626t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f35627u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ jx4 f35628v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ wf4 f35629w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ fs1 f35630x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0910mi f35631y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zx2 f35632z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy2(jx4 jx4Var, wf4 wf4Var, fs1 fs1Var, C0910mi c0910mi, zx2 zx2Var, b33 b33Var, sw2 sw2Var, C0910mi c0910mi2, lu2 lu2Var, float f, float f2, float f3, b33 b33Var2, C0910mi c0910mi3, sw2 sw2Var2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35628v = jx4Var;
        this.f35629w = wf4Var;
        this.f35630x = fs1Var;
        this.f35631y = c0910mi;
        this.f35632z = zx2Var;
        this.f35616A = b33Var;
        this.f35617B = sw2Var;
        this.f35618C = c0910mi2;
        this.f35619D = lu2Var;
        this.f35620E = f;
        this.f35621F = f2;
        this.f35622G = f3;
        this.f35623H = b33Var2;
        this.f35624I = c0910mi3;
        this.f35625J = sw2Var2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f35626t) {
            case 0:
                yy2 yy2Var = new yy2(this.f35628v, this.f35629w, this.f35630x, this.f35631y, this.f35632z, this.f35616A, this.f35617B, this.f35618C, this.f35619D, this.f35620E, this.f35621F, this.f35622G, this.f35623H, this.f35624I, wm0Var);
                yy2Var.f35625J = obj;
                return yy2Var;
            default:
                return new yy2(this.f35628v, this.f35629w, this.f35630x, this.f35631y, this.f35632z, this.f35616A, this.f35617B, this.f35618C, this.f35619D, this.f35620E, this.f35621F, this.f35622G, this.f35623H, this.f35624I, (sw2) this.f35625J, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35626t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((yy2) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        long jM3238Q;
        Object objM13685q;
        byte b = this.f35626t;
        jx4 jx4Var = this.f35628v;
        switch (b) {
            case 0:
                zo0 zo0Var = (zo0) this.f35625J;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f35627u;
                if (!z) {
                    k43.m7376J(obj);
                    lb5.m7910S(zo0Var, null, null, new er2(this.f35631y, this.f35632z, this.f35616A, null, (byte) 2), 3);
                    if (jx4Var != null) {
                        if (this.f35629w == wf4.f33340b) {
                            r50 r50Var = i41.f21117b;
                            jM3238Q = as4.m3238Q(240, m41.MILLISECONDS);
                        } else {
                            r50 r50Var2 = i41.f21117b;
                            jM3238Q = as4.m3238Q(320, m41.MILLISECONDS);
                        }
                        this.f35625J = zo0Var;
                        this.f35627u = true;
                        if (d24.m4318s(jM3238Q, this) == ap0Var) {
                            return ap0Var;
                        }
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                fs1 fs1Var = this.f35630x;
                sw2 sw2Var = this.f35617B;
                sw2Var.setValue(fs1Var);
                lb5.m7910S(zo0Var, null, null, new er2(this.f35618C, this.f35619D, sw2Var, null, (byte) 3), 3);
                return lb5.m7910S(zo0Var, null, null, new xy2(this.f35629w, this.f35620E, this.f35621F, this.f35622G, this.f35632z, this.f35623H, this.f35624I, null), 3);
            default:
                sw2 sw2Var2 = (sw2) this.f35625J;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f35627u;
                try {
                    if (!z2) {
                        k43.m7376J(obj);
                        yy2 yy2Var = new yy2(this.f35628v, this.f35629w, this.f35630x, this.f35631y, this.f35632z, this.f35616A, this.f35617B, this.f35618C, this.f35619D, this.f35620E, this.f35621F, this.f35622G, this.f35623H, this.f35624I, null);
                        this.f35627u = true;
                        objM13685q = zp0.m13685q(yy2Var, this);
                        if (objM13685q == ap0Var2) {
                            return ap0Var2;
                        }
                    } else {
                        if (!z2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                        objM13685q = obj;
                    }
                    if (jx4Var != null) {
                        sw2Var2.setValue(null);
                    }
                    return ju4.f22634a;
                } catch (Throwable th) {
                    if (jx4Var != null) {
                        sw2Var2.setValue(null);
                    }
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy2(jx4 jx4Var, wf4 wf4Var, fs1 fs1Var, C0910mi c0910mi, zx2 zx2Var, b33 b33Var, sw2 sw2Var, C0910mi c0910mi2, lu2 lu2Var, float f, float f2, float f3, b33 b33Var2, C0910mi c0910mi3, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35628v = jx4Var;
        this.f35629w = wf4Var;
        this.f35630x = fs1Var;
        this.f35631y = c0910mi;
        this.f35632z = zx2Var;
        this.f35616A = b33Var;
        this.f35617B = sw2Var;
        this.f35618C = c0910mi2;
        this.f35619D = lu2Var;
        this.f35620E = f;
        this.f35621F = f2;
        this.f35622G = f3;
        this.f35623H = b33Var2;
        this.f35624I = c0910mi3;
    }
}
