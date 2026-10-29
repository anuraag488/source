package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p36 extends bn5 {

    /* JADX INFO: renamed from: g */
    public final IBinder f27345g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC1235ux f27346h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p36(AbstractC1235ux abstractC1235ux, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC1235ux, i, bundle);
        this.f27346h = abstractC1235ux;
        this.f27345g = iBinder;
    }

    @Override // p000.bn5
    /* JADX INFO: renamed from: a */
    public final boolean mo3638a() {
        IBinder iBinder = this.f27345g;
        try {
            y42.m12854a0(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC1235ux abstractC1235ux = this.f27346h;
            if (!abstractC1235ux.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = abstractC1235ux.getServiceDescriptor();
                Log.w("GmsClient", c75.m3882n(new StringBuilder(serviceDescriptor.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = abstractC1235ux.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(abstractC1235ux.zze(2, 4, iInterfaceCreateServiceInterface) || abstractC1235ux.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            abstractC1235ux.zzn(null);
            if (abstractC1235ux.zzk() == null) {
                return true;
            }
            abstractC1235ux.zzk().onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p000.bn5
    /* JADX INFO: renamed from: b */
    public final void mo3639b(lk0 lk0Var) {
        AbstractC1235ux abstractC1235ux = this.f27346h;
        if (abstractC1235ux.zzl() != null) {
            abstractC1235ux.zzl().onConnectionFailed(lk0Var);
        }
        System.currentTimeMillis();
    }
}
