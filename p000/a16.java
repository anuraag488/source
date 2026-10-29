package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a16 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public int f56a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AbstractC1235ux f57b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        kn5 kn5Var;
        AbstractC1235ux abstractC1235ux = this.f57b;
        if (iBinder == null) {
            abstractC1235ux.zzf();
            return;
        }
        synchronized (abstractC1235ux.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kn5)) {
                    kn5Var = new kn5();
                    kn5Var.f23265a = iBinder;
                    VarHandle.storeStoreFence();
                } else {
                    kn5Var = (kn5) iInterfaceQueryLocalInterface;
                }
                abstractC1235ux.zzi(kn5Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1235ux abstractC1235ux2 = this.f57b;
        int i = this.f56a;
        abstractC1235ux2.getClass();
        l56 l56Var = new l56(abstractC1235ux2, 0, null);
        ur5 ur5Var = abstractC1235ux2.zzb;
        ur5Var.sendMessage(ur5Var.obtainMessage(7, i, -1, l56Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1235ux abstractC1235ux = this.f57b;
        synchronized (abstractC1235ux.zzh()) {
            abstractC1235ux.zzi(null);
        }
        AbstractC1235ux abstractC1235ux2 = this.f57b;
        int i = this.f56a;
        ur5 ur5Var = abstractC1235ux2.zzb;
        ur5Var.sendMessage(ur5Var.obtainMessage(6, i, 1));
    }
}
