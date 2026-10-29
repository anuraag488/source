package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c64 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public nl3 f15842t;

    /* JADX INFO: renamed from: u */
    public boolean f15843u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ C0903mb f15844v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ nl3 f15845w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ xh1 f15846x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ d64 f15847y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f15848z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c64(nl3 nl3Var, xh1 xh1Var, d64 d64Var, float f, wm0 wm0Var) {
        super(3, wm0Var);
        this.f15845w = nl3Var;
        this.f15846x = xh1Var;
        this.f15847y = d64Var;
        this.f15848z = f;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d64 d64Var = this.f15847y;
        float f = this.f15848z;
        c64 c64Var = new c64(this.f15845w, this.f15846x, d64Var, f, (wm0) obj3);
        c64Var.f15844v = (C0903mb) obj;
        return c64Var.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        nl3 nl3Var;
        C0903mb c0903mb = this.f15844v;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f15843u;
        if (!z) {
            k43.m7376J(obj);
            C0605eb c0605eb = new C0605eb((byte) 2);
            c0605eb.f17940b = this.f15847y;
            c0605eb.f17941c = c0903mb;
            VarHandle.storeStoreFence();
            this.f15844v = null;
            nl3 nl3Var2 = this.f15845w;
            this.f15842t = nl3Var2;
            this.f15843u = true;
            obj = this.f15846x.mo3327a(c0605eb, this.f15848z, this);
            if (obj == ap0Var) {
                return ap0Var;
            }
            nl3Var = nl3Var2;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nl3Var = this.f15842t;
            k43.m7376J(obj);
        }
        nl3Var.f25933a = ((Number) obj).floatValue();
        return ju4.f22634a;
    }
}
