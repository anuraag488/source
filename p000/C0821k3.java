package p000;

import ads_mobile_sdk.cy3;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0821k3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22837t;

    /* JADX INFO: renamed from: u */
    public boolean f22838u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yp1 f22839v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0821k3(wm0 wm0Var, yp1 yp1Var, byte b) {
        super(2, wm0Var);
        this.f22837t = b;
        this.f22839v = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22837t;
        yp1 yp1Var = this.f22839v;
        switch (b) {
            case 0:
                return new C0821k3(yp1Var, wm0Var, (byte) 0);
            case 1:
                return new C0821k3(yp1Var, wm0Var, (byte) 1);
            case 2:
                return new C0821k3(wm0Var, yp1Var, (byte) 2);
            case 3:
                return new C0821k3(wm0Var, yp1Var, (byte) 3);
            case 4:
                return new C0821k3(wm0Var, yp1Var, (byte) 4);
            case 5:
                return new C0821k3(yp1Var, wm0Var, (byte) 5);
            case 6:
                return new C0821k3(yp1Var, wm0Var, (byte) 6);
            case 7:
                return new C0821k3(yp1Var, wm0Var, (byte) 7);
            default:
                return new C0821k3(yp1Var, wm0Var, (byte) 8);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22837t;
        yp1 yp1Var = this.f22839v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0821k3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0821k3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0821k3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C0821k3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C0821k3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0821k3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return new C0821k3(yp1Var, (wm0) obj2, (byte) 6).invokeSuspend(ju4Var);
            case 7:
                return new C0821k3(yp1Var, (wm0) obj2, (byte) 7).invokeSuspend(ju4Var);
            default:
                return new C0821k3(yp1Var, (wm0) obj2, (byte) 8).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f22837t;
        ju4 ju4Var = ju4.f22634a;
        yp1 yp1Var = this.f22839v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f22838u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                if (yp1Var == null) {
                    return ju4Var;
                }
                this.f22838u = true;
                return yp1Var.invoke(this) == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f22838u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    Object objInvoke = yp1Var.invoke(this);
                    return objInvoke == ap0Var2 ? ap0Var2 : objInvoke;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f22838u;
                if (!z3) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    Object objInvoke2 = yp1Var.invoke(this);
                    return objInvoke2 == ap0Var3 ? ap0Var3 : objInvoke2;
                }
                if (z3) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f22838u;
                if (!z4) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    Object objInvoke3 = yp1Var.invoke(this);
                    return objInvoke3 == ap0Var4 ? ap0Var4 : objInvoke3;
                }
                if (z4) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f22838u;
                if (!z5) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    return yp1Var.invoke(this) == ap0Var5 ? ap0Var5 : ju4Var;
                }
                if (z5) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f22838u;
                if (!z6) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    return yp1Var.invoke(this) == ap0Var6 ? ap0Var6 : ju4Var;
                }
                if (z6) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z7 = this.f22838u;
                if (!z7) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    Object objInvoke4 = yp1Var.invoke(this);
                    return objInvoke4 == ap0Var7 ? ap0Var7 : objInvoke4;
                }
                if (z7) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                ap0 ap0Var8 = ap0.f14763a;
                boolean z8 = this.f22838u;
                if (!z8) {
                    k43.m7376J(obj);
                    this.f22838u = true;
                    Object objInvoke5 = yp1Var.invoke(this);
                    return objInvoke5 == ap0Var8 ? ap0Var8 : objInvoke5;
                }
                if (z8) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var9 = ap0.f14763a;
                boolean z9 = this.f22838u;
                if (z9) {
                    if (z9) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                cy3.m654a(cy3.m656b(), null);
                this.f22838u = true;
                Object objInvoke6 = yp1Var.invoke(this);
                return objInvoke6 == ap0Var9 ? ap0Var9 : objInvoke6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0821k3(yp1 yp1Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f22837t = b;
        this.f22839v = yp1Var;
    }
}
