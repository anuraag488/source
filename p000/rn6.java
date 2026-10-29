package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rn6 implements gd6 {

    /* JADX INFO: renamed from: a */
    public az5 f29467a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AppMeasurementDynamiteService f29468b;

    @Override // p000.gd6
    /* JADX INFO: renamed from: a */
    public final void mo5973a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f29467a.mo3375c(str, str2, bundle, j);
        } catch (RemoteException e) {
            oa6 oa6Var = this.f29468b.f16259a;
            if (oa6Var != null) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(e, "Event listener threw exception");
            }
        }
    }
}
