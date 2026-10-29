package p000;

import android.content.Context;
import android.net.Network;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import java.net.URI;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.ConnectivityManagerWrapper;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ep5 {

    /* JADX INFO: renamed from: n */
    public static boolean f18358n;

    /* JADX INFO: renamed from: a */
    public Context f18359a;

    /* JADX INFO: renamed from: b */
    public dt0 f18360b;

    /* JADX INFO: renamed from: c */
    public String[] f18361c;

    /* JADX INFO: renamed from: d */
    public HashSet f18362d;

    /* JADX INFO: renamed from: e */
    public HashSet f18363e;

    /* JADX INFO: renamed from: f */
    public long f18364f;

    /* JADX INFO: renamed from: g */
    public boolean f18365g;

    /* JADX INFO: renamed from: h */
    public boolean f18366h;

    /* JADX INFO: renamed from: i */
    public Handler f18367i;

    /* JADX INFO: renamed from: j */
    public Map f18368j;

    /* JADX INFO: renamed from: k */
    public Set f18369k;

    /* JADX INFO: renamed from: l */
    public AtomicReference f18370l;

    /* JADX INFO: renamed from: m */
    public ConnectivityManagerWrapper f18371m;

    /* JADX INFO: renamed from: a */
    public final URI m5271a(String str) {
        URI uriCreate;
        ry5.m10503a("CronetAdaptiveRequestContext#getUriIfAdaptive");
        try {
            if (this.f18366h) {
                uriCreate = URI.create(str);
            } else {
                for (String str2 : this.f18361c) {
                    if (!str2.isEmpty() && str.startsWith(str2)) {
                        URI uriCreate2 = URI.create(str);
                        if (this.f18362d.contains(uriCreate2.getPath())) {
                            uriCreate = uriCreate2;
                        }
                    }
                }
                uriCreate = null;
            }
            Trace.endSection();
            return uriCreate;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final so5 m5272b(URI uri, long j) {
        Long l;
        Long lValueOf;
        ConnectivityManagerWrapper connectivityManagerWrapper = this.f18371m;
        so5 so5Var = null;
        if (!this.f18365g) {
            return null;
        }
        ry5.m10503a("CronetAdaptiveRequestContext#computeStreamNetworkHandles");
        try {
            Network[] allNetworks = connectivityManagerWrapper.getAllNetworks(null);
            Network defaultNetwork = connectivityManagerWrapper.getDefaultNetwork();
            String host = uri.getHost();
            Map map = this.f18368j;
            ap5 ap5Var = (ap5) map.get(host);
            int i = 0;
            if (ap5Var == null) {
                l = null;
            } else {
                if (SystemClock.elapsedRealtime() < ap5Var.f14772b) {
                    int length = allNetworks.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            long networkHandle = allNetworks[i2].getNetworkHandle();
                            l = ap5Var.f14771a;
                            if (networkHandle != l.longValue()) {
                                i2++;
                            }
                        }
                    }
                }
                map.remove(host);
                l = null;
            }
            boolean z = (l == null || l.longValue() == j) ? false : true;
            dt0 dt0Var = this.f18360b;
            nr0 nr0Var = r16.f28959t;
            int length2 = allNetworks.length;
            dt0Var.mo4106F(nr0Var, length2, defaultNetwork != null, z);
            if (z) {
                so5Var = new so5(l.longValue(), j);
            } else {
                while (true) {
                    if (i < length2) {
                        Network network = allNetworks[i];
                        if (network != null && !network.equals(defaultNetwork)) {
                            lValueOf = Long.valueOf(network.getNetworkHandle());
                            break;
                        }
                        i++;
                    } else {
                        lValueOf = null;
                        break;
                    }
                }
                if (lValueOf != null && lValueOf.longValue() == j) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    so5Var = new so5(j, lValueOf.longValue());
                }
            }
            Trace.endSection();
            return so5Var;
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
