package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ly2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24464a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dp4 f24465b;

    public /* synthetic */ ly2(byte b) {
        this.f24464a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f24464a;
        dp4 dp4Var = this.f24465b;
        switch (b) {
            case 0:
                return Boolean.valueOf(dp4Var.m4647i());
            case 1:
                return Boolean.valueOf(!z62.m13387o(dp4Var.f17261d.getValue(), dp4Var.f17258a.mo11188l()) || dp4Var.m4647i() || ((Boolean) dp4Var.f17266i.getValue()).booleanValue());
            default:
                return Long.valueOf(dp4Var.m4640b());
        }
    }
}
