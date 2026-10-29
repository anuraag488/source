package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vy5 extends us1 {
    @Override // p000.AbstractC1235ux
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        if (iInterfaceQueryLocalInterface instanceof m56) {
            return (m56) iInterfaceQueryLocalInterface;
        }
        m56 m56Var = new m56();
        m56Var.f24675a = iBinder;
        VarHandle.storeStoreFence();
        return m56Var;
    }

    @Override // p000.AbstractC1235ux
    public final ed1[] getApiFeatures() {
        return sc6.f30173j;
    }

    @Override // p000.AbstractC1235ux
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // p000.AbstractC1235ux
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // p000.AbstractC1235ux
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // p000.AbstractC1235ux
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
