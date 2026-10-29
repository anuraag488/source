package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f15603t;

    /* JADX INFO: renamed from: u */
    public boolean f15604u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ru0 f15605v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu0(ru0 ru0Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f15603t = b;
        this.f15605v = ru0Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f15603t;
        ju4 ju4Var = ju4.f22634a;
        ru0 ru0Var = this.f15605v;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new bu0(ru0Var, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new bu0(ru0Var, wm0Var, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.f15603t;
        ru0 ru0Var = this.f15605v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f15604u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                c74 c74VarM10430c = ru0Var.m10430c();
                this.f15604u = true;
                Integer numM3865a = c74VarM10430c.m3865a();
                return numM3865a == ap0Var ? ap0Var : numM3865a;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f15604u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ff1 ff1Var = (ff1) ru0Var.f29634j.getValue();
                this.f15604u = true;
                Object objM5699a = ff1Var.m5699a(new st0(3, (wm0) null), this);
                return objM5699a == ap0Var2 ? ap0Var2 : objM5699a;
        }
    }
}
