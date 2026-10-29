package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jk4 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22350t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ pk4 f22351u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk4(pk4 pk4Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f22350t = b;
        this.f22351u = pk4Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22350t;
        ju4 ju4Var = ju4.f22634a;
        pk4 pk4Var = this.f22351u;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                new jk4(pk4Var, wm0Var, (byte) 0).invokeSuspend(ju4Var);
                break;
            case 1:
                new jk4(pk4Var, wm0Var, (byte) 1).invokeSuspend(ju4Var);
                break;
            case 2:
                new jk4(pk4Var, wm0Var, (byte) 2).invokeSuspend(ju4Var);
                break;
            default:
                new jk4(pk4Var, wm0Var, (byte) 3).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f22350t;
        ju4 ju4Var = ju4.f22634a;
        pk4 pk4Var = this.f22351u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                pk4Var.f27692A = false;
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                pk4Var.m9541c();
                break;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                pk4Var.m9540a(pk4Var.f27692A);
                break;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                pk4Var.m9553o();
                break;
        }
        return ju4Var;
    }
}
