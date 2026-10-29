package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sz3 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f30690t;

    /* JADX INFO: renamed from: u */
    public boolean f30691u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yz3 f30692v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f30693w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ dp4 f30694x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz3(yz3 yz3Var, Object obj, dp4 dp4Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f30690t = b;
        this.f30692v = yz3Var;
        this.f30693w = obj;
        this.f30694x = dp4Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f30690t;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new sz3(this.f30692v, this.f30693w, this.f30694x, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new sz3(this.f30692v, this.f30693w, this.f30694x, wm0Var, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        float f;
        byte b = this.f30690t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f30691u;
                if (!z) {
                    k43.m7376J(obj);
                    C1160sw c1160sw = new C1160sw(this.f30692v, this.f30693w, this.f30694x, null, (byte) 2);
                    this.f30691u = true;
                    return zp0.m13685q(c1160sw, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f30691u;
                dp4 dp4Var = this.f30694x;
                if (!z2) {
                    k43.m7376J(obj);
                    yz3 yz3Var = this.f30692v;
                    yz3Var.m13282v();
                    d83 d83Var = yz3Var.f35651f;
                    yz3Var.f35662q = Long.MIN_VALUE;
                    yz3Var.m13275C(0.0f);
                    Object value = yz3Var.f35652g.getValue();
                    Object obj2 = this.f30693w;
                    if (z62.m13387o(obj2, value)) {
                        f = -4.0f;
                    } else {
                        f = z62.m13387o(obj2, d83Var.getValue()) ? -5.0f : -3.0f;
                    }
                    dp4Var.m4659u(obj2);
                    dp4Var.m4655q(0L);
                    d83Var.setValue(obj2);
                    yz3Var.m13275C(0.0f);
                    yz3Var.mo11190q(obj2);
                    dp4Var.m4651m(f);
                    if (f == -3.0f) {
                        this.f30691u = true;
                        if (yz3Var.m13278F(this) == ap0Var2) {
                            return ap0Var2;
                        }
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                dp4Var.m4650l();
                return ju4Var;
        }
    }
}
