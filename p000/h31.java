package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h31 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ zo0 f20298A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ sw2 f20299B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ wp1 f20300C;

    /* JADX INFO: renamed from: t */
    public boolean f20301t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f20302u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f20303v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ig1 f20304w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ mq1 f20305x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ yp1 f20306y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ sw2 f20307z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h31(boolean z, ig1 ig1Var, mq1 mq1Var, yp1 yp1Var, sw2 sw2Var, zo0 zo0Var, sw2 sw2Var2, wp1 wp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20303v = z;
        this.f20304w = ig1Var;
        this.f20305x = mq1Var;
        this.f20306y = yp1Var;
        this.f20307z = sw2Var;
        this.f20298A = zo0Var;
        this.f20299B = sw2Var2;
        this.f20300C = wp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        h31 h31Var = new h31(this.f20303v, this.f20304w, this.f20305x, this.f20306y, this.f20307z, this.f20298A, this.f20299B, this.f20300C, wm0Var);
        h31Var.f20302u = obj;
        return h31Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((h31) create((wm0) obj2, (pc3) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f20301t;
        ju4 ju4Var = ju4.f22634a;
        if (z) {
            if (z) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        pc3 pc3Var = (pc3) this.f20302u;
        if (this.f20303v) {
            yp1 yp1Var = this.f20306y;
            sw2 sw2Var = this.f20307z;
            zo0 zo0Var = this.f20298A;
            sw2 sw2Var2 = this.f20299B;
            f31 f31Var = new f31(yp1Var, sw2Var, zo0Var, sw2Var2);
            wp1 wp1Var = this.f20300C;
            g31 g31Var = new g31(wp1Var, sw2Var2, zo0Var, sw2Var, (byte) 0);
            g31 g31Var2 = new g31(wp1Var, sw2Var2, zo0Var, sw2Var, (byte) 1);
            this.f20301t = true;
            Object objM9709d = q21.m9709d(pc3Var, f31Var, g31Var, g31Var2, this.f20305x, this);
            if (objM9709d != ap0Var) {
                objM9709d = ju4Var;
            }
            if (objM9709d == ap0Var) {
                return ap0Var;
            }
        }
        return ju4Var;
    }
}
