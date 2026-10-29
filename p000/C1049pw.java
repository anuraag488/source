package p000;

/* JADX INFO: renamed from: pw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1049pw extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28040t;

    /* JADX INFO: renamed from: u */
    public boolean f28041u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC0961nw f28042v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1049pw(InterfaceC0961nw interfaceC0961nw, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f28040t = b;
        this.f28042v = interfaceC0961nw;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f28040t;
        ju4 ju4Var = ju4.f22634a;
        InterfaceC0961nw interfaceC0961nw = this.f28042v;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new C1049pw(interfaceC0961nw, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new C1049pw(interfaceC0961nw, wm0Var, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f28040t;
        ju4 ju4Var = ju4.f22634a;
        InterfaceC0961nw interfaceC0961nw = this.f28042v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f28041u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f28041u = true;
                    return interfaceC0961nw.mo8865c(this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f28041u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f28041u = true;
                    return interfaceC0961nw.mo8866e(this) == ap0Var2 ? ap0Var2 : ju4Var;
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
