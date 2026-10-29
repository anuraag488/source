package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class im5 extends us1 {

    /* JADX INFO: renamed from: c */
    public si4 f21563c;

    @Override // p000.AbstractC1235ux
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof fm5 ? (fm5) iInterfaceQueryLocalInterface : new fm5(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 0);
    }

    @Override // p000.AbstractC1235ux
    public final ed1[] getApiFeatures() {
        return kx5.f23601m;
    }

    @Override // p000.AbstractC1235ux
    public final Bundle getGetServiceRequestExtraArgs() {
        si4 si4Var = this.f21563c;
        si4Var.getClass();
        Bundle bundle = new Bundle();
        String str = si4Var.f30323b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // p000.AbstractC1235ux
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // p000.AbstractC1235ux
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p000.AbstractC1235ux
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p000.AbstractC1235ux
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
