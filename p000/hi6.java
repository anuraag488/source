package p000;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hi6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20612a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cp6 f20613b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ oj6 f20614c;

    public /* synthetic */ hi6(byte b) {
        this.f20612a = b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f20612a) {
            case 0:
                oj6 oj6Var = this.f20614c;
                s56 s56Var = oj6Var.f26789h;
                oa6 oa6Var = (oa6) oj6Var.f36084a;
                if (s56Var == null) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12504a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        cp6 cp6Var = this.f20613b;
                        op5 op5Var = oa6Var.f26512d;
                        d56 d56Var = e56.f17777c1;
                        if (op5Var.m9225E(null, d56Var)) {
                            oj6Var.m9145O(s56Var, null, cp6Var);
                        }
                        s56Var.mo5572k(cp6Var);
                        oa6Var.m9026m().m8205z();
                        oa6Var.f26512d.m9225E(null, d56Var);
                        oj6Var.m9145O(s56Var, null, cp6Var);
                        oj6Var.m9139I();
                    } catch (RemoteException e) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12505b(e, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                oj6 oj6Var2 = this.f20614c;
                s56 s56Var2 = oj6Var2.f26789h;
                oa6 oa6Var2 = (oa6) oj6Var2.f36084a;
                if (s56Var2 == null) {
                    d76 d76Var3 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16835j.m12504a("Failed to send consent settings to service");
                } else {
                    try {
                        s56Var2.mo5579v(this.f20613b);
                        oj6Var2.m9139I();
                    } catch (RemoteException e2) {
                        d76 d76Var4 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16835j.m12505b(e2, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
