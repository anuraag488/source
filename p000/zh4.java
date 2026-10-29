package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zh4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f36099t;

    /* JADX INFO: renamed from: u */
    public boolean f36100u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ df3 f36101v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh4(df3 df3Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f36099t = b;
        this.f36101v = df3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f36099t;
        df3 df3Var = this.f36101v;
        switch (b) {
            case 0:
                return new zh4(df3Var, wm0Var, (byte) 0);
            default:
                return new zh4(df3Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36099t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((zh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f36099t;
        ju4 ju4Var = ju4.f22634a;
        df3 df3Var = this.f36101v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f36100u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f36100u = true;
                    return df3Var.m4500e(this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f36100u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f36100u = true;
                    return df3Var.m4500e(this) == ap0Var2 ? ap0Var2 : ju4Var;
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
