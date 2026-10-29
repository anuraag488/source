package p000;

/* JADX INFO: renamed from: g5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0676g5 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19613a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xb4 f19614b;

    public /* synthetic */ C0676g5(byte b) {
        this.f19613a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f19613a;
        ju4 ju4Var = ju4.f22634a;
        xb4 xb4Var = this.f19614b;
        switch (b) {
            case 0:
                ((jp3) obj).m7253b(((Number) xb4Var.getValue()).floatValue());
                return ju4Var;
            case 1:
                u31 u31Var = (u31) obj;
                long j = ((pb0) xb4Var.getValue()).f27503a;
                if (!ws4.m12408a(j, pb0.f27501h)) {
                    u31.m11225x(u31Var, j, 0L, 0L, null, 126);
                }
                return ju4Var;
            case 2:
                jp3 jp3Var = (jp3) obj;
                jp3Var.m7257k(((Number) xb4Var.getValue()).floatValue());
                jp3Var.m7258l(((Number) xb4Var.getValue()).floatValue());
                return ju4Var;
            case 3:
                ((jp3) obj).m7256j(((Number) xb4Var.getValue()).floatValue());
                return ju4Var;
            case 4:
                ((jp3) obj).m7256j(((Number) xb4Var.getValue()).floatValue());
                return ju4Var;
            case 5:
                return o52.m8954a(((long) ((Number) xb4Var.getValue()).intValue()) << 32);
            case 6:
                return o52.m8954a(((long) ((Number) xb4Var.getValue()).intValue()) << 32);
            case 7:
                ((jp3) obj).m7253b(((Number) xb4Var.getValue()).floatValue());
                return ju4Var;
            default:
                ((jp3) obj).m7253b(((Number) xb4Var.getValue()).floatValue());
                return ju4Var;
        }
    }
}
