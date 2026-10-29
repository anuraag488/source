package p000;

/* JADX INFO: renamed from: vy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1273vy extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f32921t;

    /* JADX INFO: renamed from: u */
    public boolean f32922u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f32923v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ pc3 f32924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ co4 f32925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1273vy(pc3 pc3Var, co4 co4Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f32921t = b;
        this.f32924w = pc3Var;
        this.f32925x = co4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f32921t) {
            case 0:
                C1273vy c1273vy = new C1273vy(this.f32924w, this.f32925x, wm0Var, (byte) 0);
                c1273vy.f32923v = obj;
                return c1273vy;
            default:
                C1273vy c1273vy2 = new C1273vy(this.f32924w, this.f32925x, wm0Var, (byte) 1);
                c1273vy2.f32923v = obj;
                return c1273vy2;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32921t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((C1273vy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f32921t;
        ju4 ju4Var = ju4.f22634a;
        co4 co4Var = this.f32925x;
        pc3 pc3Var = this.f32924w;
        switch (b) {
            case 0:
                zo0 zo0Var = (zo0) this.f32923v;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f32922u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                C1236uy c1236uy = new C1236uy(zo0Var, co4Var, null);
                this.f32923v = null;
                this.f32922u = true;
                return gq6.m6084i(pc3Var, c1236uy, this) == ap0Var ? ap0Var : ju4Var;
            default:
                zo0 zo0Var2 = (zo0) this.f32923v;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f32922u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                C1348xy c1348xy = new C1348xy(zo0Var2, co4Var, null);
                this.f32923v = null;
                this.f32922u = true;
                return ((vf4) pc3Var).m11889O0(c1348xy, this) == ap0Var2 ? ap0Var2 : ju4Var;
        }
    }
}
