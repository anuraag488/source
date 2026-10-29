package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.fc2;
import ads_mobile_sdk.gd2;
import ads_mobile_sdk.hc2;
import ads_mobile_sdk.rc2;
import ads_mobile_sdk.sy3;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qk3 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28544b;

    public /* synthetic */ qk3(Object obj, byte b) {
        this.f28543a = b;
        this.f28544b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        byte b = this.f28543a;
        Object obj = this.f28544b;
        switch (b) {
            case 0:
                ((tt2) obj).m11155w(network, true);
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                r50 r50Var = i41.f21117b;
                rc2 rc2Var = (rc2) obj;
                gd5 gd5Var = rc2Var.f10636c;
                long jM3239R = as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS);
                AbstractC0137h.m1113b(new fc2(jM3239R, network, (byte) 0));
                sy3.m2303a(rc2Var.f10635b, (t82) null, new k31((Object) rc2Var, jM3239R, (Object) network, (wm0) null, (byte) 5), 3);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f28543a) {
            case 1:
                synchronized (((gd2) this.f28544b)) {
                    gd2 gd2Var = (gd2) this.f28544b;
                    gd2Var.f3920d = network;
                    gd2Var.f3919c = networkCapabilities;
                    break;
                }
                return;
            case 2:
                r50 r50Var = i41.f21117b;
                rc2 rc2Var = (rc2) this.f28544b;
                gd5 gd5Var = rc2Var.f10636c;
                long jM3239R = as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS);
                AbstractC0137h.m1113b(new hc2(jM3239R, network, networkCapabilities));
                sy3.m2303a(rc2Var.f10635b, (t82) null, new rb3(rc2Var, jM3239R, network, networkCapabilities, (wm0) null), 3);
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f28543a) {
            case 0:
                ((tt2) this.f28544b).m11155w(network, false);
                return;
            case 1:
                synchronized (((gd2) this.f28544b)) {
                    try {
                        if (network.equals(((gd2) this.f28544b).f3920d)) {
                            gd2 gd2Var = (gd2) this.f28544b;
                            gd2Var.f3920d = null;
                            gd2Var.f3919c = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                r50 r50Var = i41.f21117b;
                rc2 rc2Var = (rc2) this.f28544b;
                gd5 gd5Var = rc2Var.f10636c;
                long jM3239R = as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS);
                AbstractC0137h.m1113b(new fc2(jM3239R, network, (byte) 1));
                sy3.m2303a(rc2Var.f10635b, (t82) null, new C0455ai((byte) 3, jM3239R, null, rc2Var), 3);
                return;
        }
    }
}
