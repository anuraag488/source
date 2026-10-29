package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0245n0;
import ads_mobile_sdk.ey0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ci2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f16043t;

    /* JADX INFO: renamed from: u */
    public boolean f16044u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f16045v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f16046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci2(Object obj, int i, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f16043t = b;
        this.f16046w = obj;
        this.f16045v = i;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f16043t;
        int i = this.f16045v;
        Object obj2 = this.f16046w;
        switch (b) {
            case 0:
                return new ci2((di2) obj2, i, wm0Var, (byte) 0);
            default:
                return new ci2((C0245n0) obj2, i, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16043t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((ci2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return new ci2((C0245n0) this.f16046w, this.f16045v, (wm0) obj2, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f16043t;
        ju4 ju4Var = ju4.f22634a;
        int i = this.f16045v;
        Object obj2 = this.f16046w;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f16044u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                yh2 yh2Var = ((di2) obj2).f17076p;
                this.f16044u = true;
                si2 si2Var = yh2Var.f35226b;
                yg3 yg3Var = si2.f30294x;
                si2Var.getClass();
                Object objMo6021d = si2Var.mo6021d(xw2.f34665a, new ri2(si2Var, i, wm0Var, (byte) 0), this);
                if (objMo6021d != ap0Var) {
                    objMo6021d = ju4Var;
                }
                if (objMo6021d != ap0Var) {
                    objMo6021d = ju4Var;
                }
                return objMo6021d == ap0Var ? ap0Var : ju4Var;
            default:
                C0245n0 c0245n0 = (C0245n0) obj2;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f16044u;
                if (!z2) {
                    k43.m7376J(obj);
                    ey0 ey0Var = c0245n0.f7450b;
                    r50 r50Var = i41.f21117b;
                    long j = ((i41) ey0Var.m13553a("gads:ad_activity_delegate_map_retain_duration", zy5.m13887v(60, m41.SECONDS), C0033as.a$10)).f21121a;
                    this.f16044u = true;
                    if (d24.m4318s(j, this) == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                c0245n0.f7452d.remove(new Integer(i));
                return ju4Var;
        }
    }
}
