package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f18926t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe0(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f18926t = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f18926t;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        switch (b) {
            case 0:
                new fe0(b2, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
                return Boolean.TRUE;
            case 1:
                new fe0(b2, (wm0) obj, b2).invokeSuspend(ju4Var);
                return ju4Var;
            case 2:
                new fe0(b2, (wm0) obj, (byte) 2);
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(ju4Var);
                return ju4Var;
            default:
                new fe0(b2, (wm0) obj, (byte) 3);
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f18926t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.TRUE;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
        }
    }
}
