package p000;

import android.app.Service;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31154a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f31155b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31156c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f31157d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Cloneable f31158e;

    public /* synthetic */ tg6(byte b) {
        this.f31154a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31154a) {
            case 0:
                tq5 tq5Var = (tq5) this.f31156c;
                ((rg6) tq5Var.f31344e).mo3676c(this.f31155b, (Exception) this.f31157d, (byte[]) this.f31158e);
                break;
            default:
                bt5 bt5Var = (bt5) this.f31156c;
                int i = this.f31155b;
                d76 d76Var = (d76) this.f31157d;
                Intent intent = (Intent) this.f31158e;
                Service service = (Service) bt5Var.f15596b;
                uj6 uj6Var = (uj6) service;
                if (uj6Var.mo4063a(i)) {
                    d76Var.f16831L.m12505b(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    d76 d76Var2 = oa6.m9017q(service, null, null).f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16831L.m12504a("Completed wakeful intent.");
                    uj6Var.mo4064b(intent);
                }
                break;
        }
    }
}
