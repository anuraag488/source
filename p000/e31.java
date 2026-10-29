package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e31 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f17659t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ x21 f17660u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e31(x21 x21Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f17659t = b;
        this.f17660u = x21Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f17659t;
        x21 x21Var = this.f17660u;
        switch (b) {
            case 0:
                return new e31(x21Var, wm0Var, (byte) 0);
            case 1:
                return new e31(x21Var, wm0Var, (byte) 1);
            case 2:
                return new e31(x21Var, wm0Var, (byte) 2);
            default:
                return new e31(x21Var, wm0Var, (byte) 3);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17659t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                ((e31) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 1:
                ((e31) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            case 2:
                ((e31) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            default:
                ((e31) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f17659t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                break;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                break;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                break;
        }
        return ju4Var;
    }
}
