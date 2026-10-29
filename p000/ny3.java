package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f26198t;

    /* JADX INFO: renamed from: u */
    public boolean f26199u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ py3 f26200v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny3(py3 py3Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f26198t = b;
        this.f26200v = py3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f26198t;
        py3 py3Var = this.f26200v;
        switch (b) {
            case 0:
                return new ny3(py3Var, wm0Var, (byte) 0);
            default:
                return new ny3(py3Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26198t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ny3) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f26198t;
        ju4 ju4Var = ju4.f22634a;
        py3 py3Var = this.f26200v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f26199u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f26199u = true;
                    return py3Var.m9685a(this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f26199u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f26199u = true;
                    return py3Var.m9687c(this) == ap0Var2 ? ap0Var2 : ju4Var;
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
