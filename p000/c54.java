package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c54 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public static final c54 f15812a = new c54();

    /* JADX INFO: renamed from: b */
    public static final Object f15813b = new Object();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f15814c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static NetworkCapabilities f15815d;

    /* JADX INFO: renamed from: e */
    public static boolean f15816e;

    /* JADX INFO: renamed from: f */
    public static Boolean f15817f;

    /* JADX INFO: renamed from: a */
    public static void m3847a() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (f15813b) {
            try {
                if (f15816e && f15817f != null) {
                    Iterator it = f15814c.entrySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        yp1 yp1Var = (yp1) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        c54 c54Var = f15812a;
                        NetworkCapabilities networkCapabilities = f15815d;
                        c54Var.getClass();
                        if (!f15817f.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities)) {
                            i = 1;
                        }
                        arrayList.add(new l73(yp1Var, i != 0 ? ol0.f26840a : new pl0(7)));
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        l73 l73Var = (l73) obj;
                        ((yp1) l73Var.f23833a).invoke((ql0) l73Var.f23834b);
                    }
                    return;
                }
                wn2.m12326e().m12328b(w15.f33035a, "Not dispatching constraint state yet: isBlocked=" + f15817f + ", capabilitiesInitialized=" + f15816e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (f15813b) {
            if (z62.m13387o(f15817f, Boolean.valueOf(z))) {
                return;
            }
            f15817f = Boolean.valueOf(z);
            m3847a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f15813b) {
            f15815d = networkCapabilities;
            f15816e = true;
        }
        m3847a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController onLost callback");
        synchronized (f15813b) {
            f15815d = null;
            Iterator it = f15814c.keySet().iterator();
            while (it.hasNext()) {
                ((yp1) it.next()).invoke(new pl0(7));
            }
        }
    }
}
