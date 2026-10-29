package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t10 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f30717t;

    /* JADX INFO: renamed from: u */
    public boolean f30718u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ d64 f30719v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t10(d64 d64Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f30717t = b;
        this.f30719v = d64Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f30717t;
        d64 d64Var = this.f30719v;
        switch (b) {
            case 0:
                return new t10(d64Var, wm0Var, (byte) 0);
            case 1:
                return new t10(d64Var, wm0Var, (byte) 1);
            case 2:
                return new t10(d64Var, wm0Var, (byte) 2);
            case 3:
                return new t10(d64Var, wm0Var, (byte) 3);
            case 4:
                return new t10(d64Var, wm0Var, (byte) 4);
            case 5:
                return new t10(d64Var, wm0Var, (byte) 5);
            case 6:
                return new t10(d64Var, wm0Var, (byte) 6);
            default:
                return new t10(d64Var, wm0Var, (byte) 7);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30717t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((t10) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objM4385b;
        Object objM4385b2;
        byte b = this.f30717t;
        ju4 ju4Var = ju4.f22634a;
        d64 d64Var = this.f30719v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f30718u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f30718u = true;
                    return d64Var.m4389f(this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f30718u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f30718u = true;
                    return d64Var.m4387d(this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f30718u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                this.f30718u = true;
                yp1 yp1Var = d64Var.f16819c;
                e64 e64Var = e64.f17843b;
                if (!((Boolean) yp1Var.invoke(e64Var)).booleanValue() || (objM4385b = d64Var.m4385b(e64Var, d64Var.f16821e, this)) != ap0Var3) {
                    objM4385b = ju4Var;
                }
                return objM4385b == ap0Var3 ? ap0Var3 : ju4Var;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f30718u;
                if (!z4) {
                    k43.m7376J(obj);
                    this.f30718u = true;
                    return d64Var.m4390g(this) == ap0Var4 ? ap0Var4 : ju4Var;
                }
                if (z4) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f30718u;
                if (z5) {
                    if (z5) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                this.f30718u = true;
                yp1 yp1Var2 = d64Var.f16819c;
                e64 e64Var2 = e64.f17843b;
                if (!((Boolean) yp1Var2.invoke(e64Var2)).booleanValue() || (objM4385b2 = d64Var.m4385b(e64Var2, d64Var.f16821e, this)) != ap0Var5) {
                    objM4385b2 = ju4Var;
                }
                return objM4385b2 == ap0Var5 ? ap0Var5 : ju4Var;
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f30718u;
                if (!z6) {
                    k43.m7376J(obj);
                    this.f30718u = true;
                    return d64Var.m4389f(this) == ap0Var6 ? ap0Var6 : ju4Var;
                }
                if (z6) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z7 = this.f30718u;
                if (!z7) {
                    k43.m7376J(obj);
                    this.f30718u = true;
                    return d64Var.m4387d(this) == ap0Var7 ? ap0Var7 : ju4Var;
                }
                if (z7) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var8 = ap0.f14763a;
                boolean z8 = this.f30718u;
                if (!z8) {
                    k43.m7376J(obj);
                    this.f30718u = true;
                    return d64Var.m4387d(this) == ap0Var8 ? ap0Var8 : ju4Var;
                }
                if (z8) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
