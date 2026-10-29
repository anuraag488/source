package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uz3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f32268t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f32269u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f32270v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f32271w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ yz3 f32272x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ dp4 f32273y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f32274z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz3(Object obj, Object obj2, yz3 yz3Var, dp4 dp4Var, float f, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32270v = obj;
        this.f32271w = obj2;
        this.f32272x = yz3Var;
        this.f32273y = dp4Var;
        this.f32274z = f;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        uz3 uz3Var = new uz3(this.f32270v, this.f32271w, this.f32272x, this.f32273y, this.f32274z, wm0Var);
        uz3Var.f32269u = obj;
        return uz3Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((uz3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f32268t;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        yz3 yz3Var = this.f32272x;
        if (!z) {
            k43.m7376J(obj);
            zo0 zo0Var = (zo0) this.f32269u;
            Object obj2 = this.f32270v;
            Object obj3 = this.f32271w;
            if (z62.m13387o(obj2, obj3)) {
                yz3Var.f35647M = null;
                if (z62.m13387o(yz3Var.f35652g.getValue(), obj2)) {
                    return ju4Var;
                }
            } else {
                yz3Var.m13283x();
            }
            boolean zM13387o = z62.m13387o(obj2, obj3);
            float f = this.f32274z;
            if (!zM13387o) {
                dp4 dp4Var = this.f32273y;
                dp4Var.m4659u(obj2);
                dp4Var.m4655q(0L);
                yz3Var.f35651f.setValue(obj2);
                dp4Var.m4651m(f);
            }
            yz3Var.m13275C(f);
            if (yz3Var.f35646L.m4209j()) {
                lb5.m7910S(zo0Var, null, null, new C0982og((Object) yz3Var, wm0Var, (byte) 22), 3);
            } else {
                yz3Var.f35662q = Long.MIN_VALUE;
            }
            this.f32268t = true;
            if (yz3Var.m13278F(this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        yz3Var.m13274B();
        return ju4Var;
    }
}
