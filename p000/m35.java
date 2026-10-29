package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m35 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f24621t;

    /* JADX INFO: renamed from: u */
    public boolean f24622u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ n35 f24623v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m35(n35 n35Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f24621t = b;
        this.f24623v = n35Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f24621t;
        n35 n35Var = this.f24623v;
        switch (b) {
            case 0:
                return new m35(n35Var, wm0Var, (byte) 0);
            default:
                return new m35(n35Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24621t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((m35) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f24621t;
        n35 n35Var = this.f24623v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f24622u;
                if (!z) {
                    k43.m7376J(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = n35Var.f25424a;
                    this.f24622u = true;
                    Object objM13484e = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30149w.m13484e(this);
                    if (objM13484e != ap0Var) {
                        objM13484e = ju4Var;
                    }
                    if (objM13484e == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f24622u;
                if (!z2) {
                    k43.m7376J(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc2 = n35Var.f25424a;
                    this.f24622u = true;
                    Object objM6753a = viewTreeObserverOnGlobalLayoutListenerC1140sc2.f30151x.m6753a(this);
                    if (objM6753a != ap0Var2) {
                        objM6753a = ju4Var;
                    }
                    if (objM6753a == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
        }
    }
}
