package p000;

import ads_mobile_sdk.q12;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kk4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23201t;

    /* JADX INFO: renamed from: u */
    public boolean f23202u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f23203v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f23204w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk4(Object obj, boolean z, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f23201t = b;
        this.f23204w = obj;
        this.f23203v = z;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f23201t;
        boolean z = this.f23203v;
        Object obj2 = this.f23204w;
        switch (b) {
            case 0:
                return new kk4((pk4) obj2, z, wm0Var, (byte) 0);
            default:
                return new kk4((q12) obj2, z, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23201t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((kk4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return new kk4((q12) this.f23204w, this.f23203v, (wm0) obj2, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ha0 ha0Var;
        byte b = this.f23201t;
        ju4 ju4Var = ju4.f22634a;
        boolean z = this.f23203v;
        Object obj2 = this.f23204w;
        C0875lk c0875lkM13792y = null;
        switch (b) {
            case 0:
                pk4 pk4Var = (pk4) obj2;
                ap0 ap0Var = ap0.f14763a;
                boolean z2 = this.f23202u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                if (!ql4.m9900d(pk4Var.m9550l().f34342b)) {
                    c0875lkM13792y = zt5.m13792y(pk4Var.m9550l());
                    if (z) {
                        int iM9902f = ql4.m9902f(pk4Var.m9550l().f34342b);
                        pk4Var.f27695c.invoke(pk4.m9539b(pk4Var.m9550l().f34341a, sc6.m10657b(iM9902f, iM9902f)));
                        pk4Var.m9556r(wu1.f33741a);
                    }
                }
                if (c0875lkM13792y == null || (ha0Var = pk4Var.f27699g) == null) {
                    return ju4Var;
                }
                ga0 ga0VarM59O = C0006a5.m59O(c0875lkM13792y);
                this.f23202u = true;
                ((C0486bc) ha0Var).f15199a.m13305A().setPrimaryClip(ga0VarM59O.f19683a);
                return ju4Var == ap0Var ? ap0Var : ju4Var;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z3 = this.f23202u;
                if (!z3) {
                    k43.m7376J(obj);
                    this.f23202u = true;
                    return q12.m2010a((q12) obj2, z, this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z3) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
