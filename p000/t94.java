package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t94 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f31013t;

    /* JADX INFO: renamed from: u */
    public boolean f31014u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f31015v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ mq1 f31016w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ sw2 f31017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t94(mq1 mq1Var, sw2 sw2Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31013t = b;
        this.f31016w = mq1Var;
        this.f31017x = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f31013t) {
            case 0:
                t94 t94Var = new t94(this.f31016w, this.f31017x, wm0Var, (byte) 0);
                t94Var.f31015v = obj;
                return t94Var;
            case 1:
                t94 t94Var2 = new t94(this.f31016w, this.f31017x, wm0Var, (byte) 1);
                t94Var2.f31015v = obj;
                return t94Var2;
            case 2:
                t94 t94Var3 = new t94(this.f31016w, this.f31017x, wm0Var, (byte) 2);
                t94Var3.f31015v = obj;
                return t94Var3;
            default:
                t94 t94Var4 = new t94(this.f31016w, this.f31017x, wm0Var, (byte) 3);
                t94Var4.f31015v = obj;
                return t94Var4;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31013t;
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
        }
        return ((t94) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f31013t;
        ju4 ju4Var = ju4.f22634a;
        sw2 sw2Var = this.f31017x;
        mq1 mq1Var = this.f31016w;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f31014u;
                if (!z) {
                    k43.m7376J(obj);
                    lg3 lg3Var = new lg3(sw2Var, ((zo0) this.f31015v).mo6367f());
                    this.f31014u = true;
                    return mq1Var.invoke(lg3Var, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f31014u;
                if (!z2) {
                    k43.m7376J(obj);
                    lg3 lg3Var2 = new lg3(sw2Var, ((zo0) this.f31015v).mo6367f());
                    this.f31014u = true;
                    return mq1Var.invoke(lg3Var2, this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f31014u;
                if (!z3) {
                    k43.m7376J(obj);
                    lg3 lg3Var3 = new lg3(sw2Var, ((zo0) this.f31015v).mo6367f());
                    this.f31014u = true;
                    return mq1Var.invoke(lg3Var3, this) == ap0Var3 ? ap0Var3 : ju4Var;
                }
                if (z3) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f31014u;
                if (!z4) {
                    k43.m7376J(obj);
                    lg3 lg3Var4 = new lg3(sw2Var, ((zo0) this.f31015v).mo6367f());
                    this.f31014u = true;
                    return mq1Var.invoke(lg3Var4, this) == ap0Var4 ? ap0Var4 : ju4Var;
                }
                if (z4) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
