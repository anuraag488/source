package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v86 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public String f32467a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ y86 f32468b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y86 y86Var = this.f32468b;
        if (iBinder == null) {
            d76 d76Var = y86Var.f35029b.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12504a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = cu5.f16499a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Object xt5Var = iInterfaceQueryLocalInterface instanceof eu5 ? (eu5) iInterfaceQueryLocalInterface : new xt5(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", (byte) 6);
            oa6 oa6Var = y86Var.f35029b;
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16831L.m12504a("Install Referrer Service connected");
            ea6 ea6Var = oa6Var.f26515g;
            oa6.m9016l(ea6Var);
            ar1 ar1Var = new ar1((byte) 19);
            ar1Var.f14798b = xt5Var;
            ar1Var.f14799c = this;
            VarHandle.storeStoreFence();
            ea6Var.m5033D(ar1Var);
        } catch (RuntimeException e) {
            d76 d76Var3 = y86Var.f35029b.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16838m.m12505b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d76 d76Var = this.f32468b.f35029b.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12504a("Install Referrer Service disconnected");
    }
}
