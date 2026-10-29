package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pp3 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f27886i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ qp3 f27887j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp3(qp3 qp3Var, byte b) {
        super(1);
        this.f27886i = b;
        this.f27887j = qp3Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f27886i;
        qp3 qp3Var = this.f27887j;
        switch (b) {
            case 0:
                return Double.valueOf(qp3Var.f28671n.mo7356e(sc6.m10673n(((Number) obj).doubleValue(), qp3Var.f28662e, qp3Var.f28663f)));
            default:
                return Double.valueOf(sc6.m10673n(qp3Var.f28668k.mo7356e(((Number) obj).doubleValue()), qp3Var.f28662e, qp3Var.f28663f));
        }
    }
}
