package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28744t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f28745u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yp1 f28746v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs0(wm0 wm0Var, yp1 yp1Var, byte b) {
        super(2, wm0Var);
        this.f28744t = b;
        this.f28746v = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28744t;
        yp1 yp1Var = this.f28746v;
        switch (b) {
            case 0:
                qs0 qs0Var = new qs0(wm0Var, yp1Var, (byte) 0);
                qs0Var.f28745u = obj;
                return qs0Var;
            case 1:
                qs0 qs0Var2 = new qs0(wm0Var, yp1Var, (byte) 1);
                qs0Var2.f28745u = obj;
                return qs0Var2;
            default:
                qs0 qs0Var3 = new qs0(yp1Var, wm0Var);
                qs0Var3.f28745u = obj;
                return qs0Var3;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28744t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((qs0) create((wm0) obj2, (af4) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((qs0) create((wm0) obj2, (af4) obj)).invokeSuspend(ju4Var);
            default:
                ((qs0) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f28744t;
        yp1 yp1Var = this.f28746v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return yp1Var.invoke(((af4) this.f28745u).mo2969b());
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return yp1Var.invoke(((af4) this.f28745u).mo2969b());
            default:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                yp1Var.invoke((hw2) this.f28745u);
                return ju4.f22634a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28744t = (byte) 2;
        this.f28746v = yp1Var;
    }
}
