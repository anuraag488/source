package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ji6 extends ir5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f22320e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oj6 f22321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji6(oj6 oj6Var, oc6 oc6Var, byte b) {
        super(oc6Var);
        this.f22320e = b;
        this.f22321f = oj6Var;
    }

    @Override // p000.ir5
    /* JADX INFO: renamed from: a */
    public final void mo6922a() {
        byte b = this.f22320e;
        oj6 oj6Var = this.f22321f;
        switch (b) {
            case 0:
                oj6Var.mo5038t();
                if (oj6Var.m9143M()) {
                    d76 d76Var = ((oa6) oj6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12504a("Inactivity, disconnecting from the service");
                    oj6Var.m9134C();
                    break;
                }
                break;
            default:
                d76 d76Var2 = ((oa6) oj6Var.f36084a).f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16838m.m12504a("Tasks have been queued for a long time");
                break;
        }
    }
}
