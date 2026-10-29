package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k34 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22846a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22847b;

    public /* synthetic */ k34(byte b) {
        this.f22846a = b;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xr5 hr5Var = null;
        byte b = 0;
        switch (this.f22846a) {
            case 0:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                tt2 tt2Var = (tt2) this.f22847b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) tt2Var.f31430d;
                sb.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb.toString());
                tt2Var.f31429c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                lb5.m7910S(zp0.m13670b((ro0) tt2Var.f31428b), null, null, new it1((Object) tt2Var, (Object) arrayList, (wm0) (b == true ? 1 : 0), (byte) 25), 3);
                break;
            default:
                qv5.m10139g("BillingClientTesting", "Billing Override Service connected.");
                ez5 ez5Var = (ez5) this.f22847b;
                int i = lr5.f24318j;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    hr5Var = iInterfaceQueryLocalInterface instanceof xr5 ? (xr5) iInterfaceQueryLocalInterface : new hr5(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 5);
                }
                ez5Var.f18617H = hr5Var;
                ez5Var.f18616G = (byte) 2;
                ez5Var.m5429P(26);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f22846a) {
            case 0:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ((tt2) this.f22847b).f31429c = null;
                break;
            default:
                qv5.m10140h("BillingClientTesting", "Billing Override Service disconnected.");
                ez5 ez5Var = (ez5) this.f22847b;
                ez5Var.f18617H = null;
                ez5Var.f18616G = (byte) 0;
                break;
        }
    }
}
