package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rx1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29701t;

    /* JADX INFO: renamed from: u */
    public boolean f29702u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ sx1 f29703v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx1(sx1 sx1Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f29701t = b;
        this.f29703v = sx1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f29701t;
        sx1 sx1Var = this.f29703v;
        switch (b) {
            case 0:
                return new rx1(sx1Var, wm0Var, (byte) 0);
            default:
                return new rx1(sx1Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29701t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((rx1) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f29701t;
        ju4 ju4Var = ju4.f22634a;
        sx1 sx1Var = this.f29703v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f29702u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f29702u = true;
                    return sx1Var.m10943O0(this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f29702u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f29702u = true;
                    return sx1Var.m10944P0(this) == ap0Var2 ? ap0Var2 : ju4Var;
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
