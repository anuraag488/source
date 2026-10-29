package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vt4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ sw2 f32861A;

    /* JADX INFO: renamed from: t */
    public boolean f32862t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ lk2 f32863u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0910mi f32864v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f32865w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ky0 f32866x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f32867y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ a83 f32868z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt4(lk2 lk2Var, C0910mi c0910mi, boolean z, ky0 ky0Var, long j, a83 a83Var, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32863u = lk2Var;
        this.f32864v = c0910mi;
        this.f32865w = z;
        this.f32866x = ky0Var;
        this.f32867y = j;
        this.f32868z = a83Var;
        this.f32861A = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new vt4(this.f32863u, this.f32864v, this.f32865w, this.f32866x, this.f32867y, this.f32868z, this.f32861A, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((vt4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objM13685q;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f32862t;
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
        fk2 fk2Var = fk2.f19054a;
        ut4 ut4Var = new ut4(this.f32864v, this.f32865w, this.f32866x, this.f32867y, this.f32868z, this.f32861A, null);
        this.f32862t = true;
        gk2 lifecycle = this.f32863u.getLifecycle();
        if (lifecycle.mo6016b() == fk2.f19054a || (objM13685q = zp0.m13685q(new er2(lifecycle, ut4Var, (wm0) null), this)) != ap0Var) {
            objM13685q = ju4Var;
        }
        if (objM13685q != ap0Var) {
            objM13685q = ju4Var;
        }
        return objM13685q == ap0Var ? ap0Var : ju4Var;
    }
}
