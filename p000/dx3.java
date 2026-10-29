package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dx3 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public byte f17479t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ ti1 f17480u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ ux3 f17481v;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dx3 dx3Var = new dx3(3, (wm0) obj3);
        dx3Var.f17480u = (ti1) obj;
        dx3Var.f17481v = (ux3) obj2;
        return dx3Var.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ti1 ti1Var = this.f17480u;
        ux3 ux3Var = this.f17481v;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f17479t;
        ju4 ju4Var = ju4.f22634a;
        if (b == 0) {
            k43.m7376J(obj);
            int i = ox3.f27193g;
            if (ux3Var.f32235c != 0 && ux3Var.f32236d != 0) {
                long j = ox3.f27191e;
                this.f17480u = ti1Var;
                this.f17481v = null;
                this.f17479t = (byte) 1;
                if (d24.m4318s(j, this) != ap0Var) {
                }
            }
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
        this.f17480u = null;
        this.f17481v = null;
        this.f17479t = (byte) 2;
        return ti1Var.emit(ju4Var, this) == ap0Var ? ap0Var : ju4Var;
    }
}
