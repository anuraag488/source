package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk4 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31214a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pk4 f31215b;

    public /* synthetic */ tk4(byte b) {
        this.f31214a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f31214a;
        ju4 ju4Var = ju4.f22634a;
        pk4 pk4Var = this.f31215b;
        switch (b) {
            case 0:
                return Boolean.valueOf(!pk4Var.f27692A);
            case 1:
                xk4 xk4VarM9539b = pk4.m9539b(pk4Var.m9550l().f34341a, sc6.m10657b(0, pk4Var.m9550l().f34341a.f24092b.length()));
                pk4Var.f27695c.invoke(xk4VarM9539b);
                long j = xk4VarM9539b.f34342b;
                pk4Var.f27714v = ql4.m9897a(j);
                pk4Var.f27712t = xk4.m12702a(pk4Var.f27712t, null, j, 5);
                pk4Var.m9543e(true);
                return ju4Var;
            default:
                wp1 wp1Var = pk4Var.f27698f;
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                return ju4Var;
        }
    }
}
