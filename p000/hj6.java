package p000;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20630a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ oj6 f20631b;

    public /* synthetic */ hj6(byte b) {
        this.f20630a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20630a) {
            case 0:
                this.f20631b.m9132A();
                break;
            case 1:
                oj6 oj6Var = this.f20631b;
                oa6 oa6Var = (oa6) oj6Var.f36084a;
                s56 s56Var = oj6Var.f26789h;
                if (s56Var == null) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12504a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        s56Var.mo5583z(oj6Var.m9142L(false));
                        oj6Var.m9139I();
                    } catch (RemoteException e) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12505b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                oj6 oj6Var2 = this.f20631b;
                oa6 oa6Var2 = (oa6) oj6Var2.f36084a;
                s56 s56Var2 = oj6Var2.f26789h;
                if (s56Var2 == null) {
                    d76 d76Var3 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16835j.m12504a("Failed to send storage consent settings to service");
                } else {
                    try {
                        s56Var2.mo5577r(oj6Var2.m9142L(false));
                        oj6Var2.m9139I();
                    } catch (RemoteException e2) {
                        d76 d76Var4 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16835j.m12505b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
