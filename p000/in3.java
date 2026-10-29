package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class in3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21581t;

    /* JADX INFO: renamed from: u */
    public boolean f21582u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ rn3 f21583v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ qn3 f21584w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ qn3 f21585x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in3(rn3 rn3Var, qn3 qn3Var, qn3 qn3Var2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f21581t = b;
        this.f21583v = rn3Var;
        this.f21584w = qn3Var;
        this.f21585x = qn3Var2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f21581t) {
            case 0:
                return new in3(this.f21583v, this.f21584w, this.f21585x, wm0Var, (byte) 0);
            default:
                return new in3(this.f21583v, this.f21584w, this.f21585x, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21581t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((in3) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f21581t;
        ju4 ju4Var = ju4.f22634a;
        qn3 qn3Var = this.f21585x;
        qn3 qn3Var2 = this.f21584w;
        rn3 rn3Var = this.f21583v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f21582u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f21582u = true;
                    return rn3Var.m10379f(qn3Var2, qn3Var, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f21582u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f21582u = true;
                    return rn3Var.m10379f(qn3Var2, qn3Var, this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
