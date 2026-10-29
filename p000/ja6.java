package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ja6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22140a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ qx5 f22141b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ AppMeasurementDynamiteService f22142c;

    public /* synthetic */ ja6(byte b) {
        this.f22140a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f22140a) {
            case 0:
                oj6 oj6VarM9027n = this.f22142c.f16259a.m9027n();
                qx5 qx5Var = this.f22141b;
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                cp6 cp6VarM9142L = oj6VarM9027n.m9142L(false);
                yn3 yn3Var = new yn3((byte) 20);
                yn3Var.f35360b = cp6VarM9142L;
                yn3Var.f35361c = qx5Var;
                yn3Var.f35362d = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(yn3Var);
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f22142c;
                dn6 dn6Var = appMeasurementDynamiteService.f16259a.f26517i;
                oa6.m9014j(dn6Var);
                oa6 oa6Var = appMeasurementDynamiteService.f16259a;
                if (oa6Var.f26533y != null && oa6Var.f26533y.booleanValue()) {
                    z = true;
                }
                dn6Var.m4607g0(this.f22141b, z);
                break;
        }
    }
}
