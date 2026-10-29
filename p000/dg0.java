package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17027a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ eg0 f17028b;

    public /* synthetic */ dg0(byte b) {
        this.f17027a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f17027a;
        eg0 eg0Var = this.f17028b;
        switch (b) {
            case 0:
                uz0 uz0Var = new uz0();
                eg0Var.mo2974a().m12137g(uz0Var);
                return uz0Var;
            default:
                RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 7);
                runnableC1054q0.f28115b = eg0Var;
                VarHandle.storeStoreFence();
                return new t33(runnableC1054q0);
        }
    }
}
