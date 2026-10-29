package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ue5 extends AbstractC1235ux {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f31815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue5(Context context, Looper looper, int i, InterfaceC1124rx interfaceC1124rx, InterfaceC1161sx interfaceC1161sx, byte b) {
        super(i, interfaceC1124rx, interfaceC1161sx, context, looper);
        this.f31815b = b;
    }

    @Override // p000.AbstractC1235ux
    public final IInterface createServiceInterface(IBinder iBinder) {
        switch (this.f31815b) {
            case 0:
                int i = wd5.f33260j;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface instanceof ke5 ? (ke5) iInterfaceQueryLocalInterface : new id5(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", (byte) 1);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                return iInterfaceQueryLocalInterface2 instanceof s56 ? (s56) iInterfaceQueryLocalInterface2 : new f56(iBinder);
        }
    }

    @Override // p000.AbstractC1235ux
    public final int getMinApkVersion() {
        switch (this.f31815b) {
            case 0:
                return 243300000;
            default:
                return 12451000;
        }
    }

    @Override // p000.AbstractC1235ux
    public final String getServiceDescriptor() {
        switch (this.f31815b) {
            case 0:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
            default:
                return "com.google.android.gms.measurement.internal.IMeasurementService";
        }
    }

    @Override // p000.AbstractC1235ux
    public final String getStartServiceAction() {
        switch (this.f31815b) {
            case 0:
                return "com.google.android.gms.ads.service.START";
            default:
                return "com.google.android.gms.measurement.START";
        }
    }
}
