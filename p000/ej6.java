package p000;

import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ej6 {

    /* JADX INFO: renamed from: a */
    public final NetworkCapabilities f18144a;

    public ej6(NetworkCapabilities networkCapabilities) {
        this.f18144a = networkCapabilities;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5137a(int i) {
        NetworkCapabilities networkCapabilities = this.f18144a;
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(i);
        }
        return true;
    }
}
