package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ky2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public byte f23614t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ float f23615u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ float f23616v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ yz3 f23617w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ wv3 f23618x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky2(float f, float f2, yz3 yz3Var, wv3 wv3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f23615u = f;
        this.f23616v = f2;
        this.f23617w = yz3Var;
        this.f23618x = wv3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new ky2(this.f23615u, this.f23616v, this.f23617w, this.f23618x, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ky2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objM5420a;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f23614t;
        ju4 ju4Var = ju4.f22634a;
        yz3 yz3Var = this.f23617w;
        float f = this.f23616v;
        float f2 = this.f23615u;
        if (b == 0) {
            k43.m7376J(obj);
            if (f2 != f) {
                this.f23614t = (byte) 1;
                if (yz3Var.m13273A(f2, yz3Var.f35651f.getValue(), this) != ap0Var) {
                }
            }
            return ap0Var;
        }
        if (b != 1) {
            if (b == 2) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        if (f2 == f) {
            this.f23614t = (byte) 2;
            dp4 dp4Var = yz3Var.f35654i;
            if (dp4Var == null) {
                objM5420a = ju4Var;
            } else {
                Object value = yz3Var.f35652g.getValue();
                wv3 wv3Var = this.f23618x;
                if ((z62.m13387o(value, wv3Var) && z62.m13387o(yz3Var.f35651f.getValue(), wv3Var)) || (objM5420a = ex2.m5420a(yz3Var.f35661p, new sz3(yz3Var, wv3Var, dp4Var, null, (byte) 1), this)) != ap0Var) {
                    objM5420a = ju4Var;
                }
            }
            if (objM5420a == ap0Var) {
                return ap0Var;
            }
        }
        return ju4Var;
    }
}
