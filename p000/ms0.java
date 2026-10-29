package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ms0 implements ServiceConnection {
    private Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(z32 z32Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lz1 lz1Var;
        if (this.mApplicationContext == null) {
            C1077qn.m9989o("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = kz1.f23631a;
        if (iBinder == null) {
            lz1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(lz1.f24482ep);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof lz1)) {
                jz1 jz1Var = new jz1();
                jz1Var.f22752a = iBinder;
                lz1Var = jz1Var;
            } else {
                lz1Var = (lz1) iInterfaceQueryLocalInterface;
            }
        }
        z32 z32Var = new z32((byte) 10);
        z32Var.f35738b = lz1Var;
        z32Var.f35739c = componentName;
        VarHandle.storeStoreFence();
        onCustomTabsServiceConnected(z32Var);
    }

    public final void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
