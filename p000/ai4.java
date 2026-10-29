package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ai4 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public boolean f14523u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f14524v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zo0 f14525w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ df3 f14526x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ nq1 f14527y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ yp1 f14528z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai4(zo0 zo0Var, df3 df3Var, nq1 nq1Var, yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f14525w = zo0Var;
        this.f14526x = df3Var;
        this.f14527y = nq1Var;
        this.f14528z = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        ai4 ai4Var = new ai4(this.f14525w, this.f14526x, this.f14527y, this.f14528z, wm0Var);
        ai4Var.f14524v = obj;
        return ai4Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ai4) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f14523u;
        if (!z) {
            k43.m7376J(obj);
            uf4 uf4Var = (uf4) this.f14524v;
            this.f14523u = true;
            if (fi4.m5723g(uf4Var, this.f14525w, this.f14526x, this.f14527y, this.f14528z, this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
