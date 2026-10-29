package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yh4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f35228t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ df3 f35229u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh4(df3 df3Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f35228t = b;
        this.f35229u = df3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f35228t;
        df3 df3Var = this.f35229u;
        switch (b) {
            case 0:
                return new yh4(df3Var, wm0Var, (byte) 0);
            case 1:
                return new yh4(df3Var, wm0Var, (byte) 1);
            case 2:
                return new yh4(df3Var, wm0Var, (byte) 2);
            case 3:
                return new yh4(df3Var, wm0Var, (byte) 3);
            case 4:
                return new yh4(df3Var, wm0Var, (byte) 4);
            case 5:
                return new yh4(df3Var, wm0Var, (byte) 5);
            case 6:
                return new yh4(df3Var, wm0Var, (byte) 6);
            default:
                return new yh4(df3Var, wm0Var, (byte) 7);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35228t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 1:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 2:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 3:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 4:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 5:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 6:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            default:
                ((yh4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f35228t;
        ju4 ju4Var = ju4.f22634a;
        df3 df3Var = this.f35229u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4498a();
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4499b();
                break;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4499b();
                break;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4498a();
                break;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4499b();
                break;
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4499b();
                break;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4498a();
                break;
            default:
                ap0 ap0Var8 = ap0.f14763a;
                k43.m7376J(obj);
                df3Var.m4499b();
                break;
        }
        return ju4Var;
    }
}
