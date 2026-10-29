package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vz3 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public boolean f32986t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f32987u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f32988v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ yz3 f32989w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ dp4 f32990x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f32991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz3(Object obj, Object obj2, yz3 yz3Var, dp4 dp4Var, float f, wm0 wm0Var) {
        super(1, wm0Var);
        this.f32987u = obj;
        this.f32988v = obj2;
        this.f32989w = yz3Var;
        this.f32990x = dp4Var;
        this.f32991y = f;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        dp4 dp4Var = this.f32990x;
        float f = this.f32991y;
        return new vz3(this.f32987u, this.f32988v, this.f32989w, dp4Var, f, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f32986t;
        if (!z) {
            k43.m7376J(obj);
            uz3 uz3Var = new uz3(this.f32987u, this.f32988v, this.f32989w, this.f32990x, this.f32991y, null);
            this.f32986t = true;
            if (zp0.m13685q(uz3Var, this) == ap0Var) {
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
