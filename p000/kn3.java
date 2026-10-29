package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kn3 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23259t;

    /* JADX INFO: renamed from: u */
    public boolean f23260u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ rn3 f23261v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn3(rn3 rn3Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f23259t = b;
        this.f23261v = rn3Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f23259t;
        ju4 ju4Var = ju4.f22634a;
        rn3 rn3Var = this.f23261v;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new kn3(rn3Var, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new kn3(rn3Var, wm0Var, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f23259t;
        ju4 ju4Var = ju4.f22634a;
        rn3 rn3Var = this.f23261v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f23260u;
                if (!z) {
                    k43.m7376J(obj);
                    ky3 ky3Var = ky3.f23619a;
                    this.f23260u = true;
                    return rn3Var.m10378e(ky3Var, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f23260u;
                if (!z2) {
                    k43.m7376J(obj);
                    ky3 ky3Var2 = ky3.f23620b;
                    this.f23260u = true;
                    return rn3Var.m10378e(ky3Var2, this) == ap0Var2 ? ap0Var2 : ju4Var;
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
