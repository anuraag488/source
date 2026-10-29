package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp3 implements k11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25112a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ qp3 f25113b;

    public /* synthetic */ mp3(byte b) {
        this.f25112a = b;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public final double mo7356e(double d) {
        switch (this.f25112a) {
            case 0:
                qp3 qp3Var = this.f25113b;
                return sc6.m10673n(qp3Var.f28668k.mo7356e(d), qp3Var.f28662e, qp3Var.f28663f);
            default:
                qp3 qp3Var2 = this.f25113b;
                return qp3Var2.f28671n.mo7356e(sc6.m10673n(d, qp3Var2.f28662e, qp3Var2.f28663f));
        }
    }
}
