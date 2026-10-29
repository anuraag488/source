package p000;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ei6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18125a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cp6 f18126b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ oj6 f18127c;

    public /* synthetic */ ei6(byte b) {
        this.f18125a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18125a) {
            case 0:
                oj6 oj6Var = this.f18127c;
                oa6 oa6Var = (oa6) oj6Var.f36084a;
                s56 s56Var = oj6Var.f26789h;
                if (s56Var != null) {
                    try {
                        s56Var.mo5571i(this.f18126b);
                    } catch (RemoteException e) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16835j.m12505b(e, "Failed to reset data on the service: remote exception");
                    }
                    oj6Var.m9139I();
                } else {
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12504a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                oj6 oj6Var2 = this.f18127c;
                oa6 oa6Var2 = (oa6) oj6Var2.f36084a;
                s56 s56Var2 = oj6Var2.f26789h;
                if (s56Var2 == null) {
                    d76 d76Var3 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16838m.m12504a("Failed to send app backgrounded");
                } else {
                    try {
                        s56Var2.mo5570g(this.f18126b);
                        oj6Var2.m9139I();
                    } catch (RemoteException e2) {
                        d76 d76Var4 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16835j.m12505b(e2, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                oj6 oj6Var3 = this.f18127c;
                oa6 oa6Var3 = (oa6) oj6Var3.f36084a;
                s56 s56Var3 = oj6Var3.f26789h;
                if (s56Var3 == null) {
                    d76 d76Var5 = oa6Var3.f26514f;
                    oa6.m9016l(d76Var5);
                    d76Var5.f16835j.m12504a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        s56Var3.mo5581x(this.f18126b);
                        oj6Var3.m9139I();
                    } catch (RemoteException e3) {
                        d76 d76Var6 = oa6Var3.f26514f;
                        oa6.m9016l(d76Var6);
                        d76Var6.f16835j.m12505b(e3, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
