package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f19128t;

    /* JADX INFO: renamed from: u */
    public boolean f19129u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yp1 f19130v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn0(yp1 yp1Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f19128t = b;
        this.f19130v = yp1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f19128t;
        ju4 ju4Var = ju4.f22634a;
        yp1 yp1Var = this.f19130v;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new fn0(yp1Var, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new fn0(yp1Var, wm0Var, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f19128t;
        yp1 yp1Var = this.f19130v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f19129u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f19129u = true;
                    if (yp1Var.invoke(this) == ap0Var) {
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
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f19129u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f19129u = true;
                    Object objMo9530l = C0006a5.m84v(getContext()).mo9530l(yp1Var, this);
                    return objMo9530l == ap0Var2 ? ap0Var2 : objMo9530l;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
