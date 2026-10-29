package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class b16 extends Binder implements q36, IInterface {
    /* JADX INFO: renamed from: E */
    public static q36 m3402E(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iInterfaceQueryLocalInterface instanceof q36) {
            return (q36) iInterfaceQueryLocalInterface;
        }
        uy5 uy5Var = new uy5();
        uy5Var.f32264a = iBinder;
        VarHandle.storeStoreFence();
        return uy5Var;
    }
}
