package p000;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cq5 extends dt0 {

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f16377r;

    /* JADX INFO: renamed from: s */
    public final uq5 f16378s;

    public cq5() {
        uq5 uq5Var = new uq5();
        uq5Var.f32105a = new Object();
        uq5Var.f32107c = Long.MIN_VALUE;
        VarHandle.storeStoreFence();
        this.f16377r = new AtomicInteger();
        this.f16378s = uq5Var;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m4105f0(nr0 nr0Var) {
        int iOrdinal = nr0Var.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    @Override // p000.dt0
    /* JADX INFO: renamed from: F */
    public final void mo4106F(nr0 nr0Var, long j, boolean z, boolean z2) {
        ry5.m10503a("CronetLoggerImpl#logCronetAdaptiveTrafficAlternateNetworkComputation");
        try {
            fq5.m5782b(Process.myUid(), m4105f0(nr0Var), j, z, z2);
            Trace.endSection();
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

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    @Override // p000.dt0
    /* JADX INFO: renamed from: G */
    public final void mo4107G(C1283w7 c1283w7) {
        int i;
        int i2;
        ry5.m10503a("CronetLoggerImpl#logCronetAdaptiveTraffic");
        try {
            int iMyUid = Process.myUid();
            int iM4105f0 = m4105f0((nr0) c1283w7.f33126b);
            int iOrdinal = ((jr0) ((AtomicReference) c1283w7.f33129e).get()).ordinal();
            int i3 = 0;
            if (iOrdinal == 0) {
                i = 0;
            } else if (iOrdinal == 1) {
                i = 1;
            } else if (iOrdinal != 2) {
                i = 0;
            } else {
                i = 2;
            }
            int iOrdinal2 = ((ir0) ((AtomicReference) c1283w7.f33127c).get()).ordinal();
            if (iOrdinal2 == 1) {
                i2 = 1;
            } else if (iOrdinal2 == 2) {
                i2 = 2;
            } else if (iOrdinal2 == 3) {
                i2 = 3;
            } else if (iOrdinal2 != 4) {
                i2 = iOrdinal2 != 5 ? 0 : 5;
            } else {
                i2 = 4;
            }
            int iOrdinal3 = ((ir0) ((AtomicReference) c1283w7.f33128d).get()).ordinal();
            if (iOrdinal3 == 1) {
                i3 = 1;
            } else if (iOrdinal3 == 2) {
                i3 = 2;
            } else if (iOrdinal3 == 3) {
                i3 = 3;
            } else if (iOrdinal3 == 4) {
                i3 = 4;
            } else if (iOrdinal3 == 5) {
                i3 = 5;
            }
            fq5.m5781a(iMyUid, iM4105f0, i, i2, i3);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.dt0
    /* JADX INFO: renamed from: H */
    public final void mo4108H(lr0 lr0Var) {
        ry5.m10503a("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long j = lr0Var.f24298a;
            int iM4376u = d55.m4376u(lr0Var.f24299b);
            int i = 1;
            if (iM4376u != 0) {
                i = iM4376u != 1 ? 0 : 2;
            }
            int i2 = lr0Var.f24300c;
            int iM4105f0 = m4105f0(lr0Var.f24301d);
            int i3 = -1;
            int iM12482a = x46.m12482a(lr0Var.f24302e) - 1;
            pr0 pr0Var = lr0Var.f24303f;
            int i4 = pr0Var.f27907a;
            int i5 = pr0Var.f27908b;
            int i6 = pr0Var.f27909c;
            int i7 = pr0Var.f27910d;
            pr0 pr0Var2 = lr0Var.f24304g;
            int i8 = pr0Var2 == null ? -1 : pr0Var2.f27907a;
            int i9 = pr0Var2 == null ? -1 : pr0Var2.f27908b;
            int i10 = pr0Var2 == null ? -1 : pr0Var2.f27909c;
            if (pr0Var2 != null) {
                i3 = pr0Var2.f27910d;
            }
            fq5.m5784d(j, i, i2, iM4105f0, iM12482a, i4, i5, i6, i7, i8, i9, i10, i3, lr0Var.f24305h);
            Trace.endSection();
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

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // p000.dt0
    /* JADX INFO: renamed from: I */
    public final void mo4109I(long j, kr0 kr0Var, pr0 pr0Var, nr0 nr0Var) {
        int i;
        int i2;
        Object objCast;
        if (nr0Var == null) {
            return;
        }
        try {
            ry5.m10503a("CronetLoggerImpl#writeCronetEngineCreation");
            try {
                kq5 kq5Var = new kq5(kr0Var.f23347f);
                int i3 = pr0Var.f27907a;
                int i4 = pr0Var.f27908b;
                int i5 = pr0Var.f27909c;
                int i6 = pr0Var.f27910d;
                int iOrdinal = nr0Var.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else if (iOrdinal == 3) {
                    i = 3;
                } else if (iOrdinal != 4) {
                    i = 0;
                } else {
                    i = 4;
                }
                boolean z = kr0Var.f23345d;
                boolean z2 = kr0Var.f23344c;
                int i7 = kr0Var.f23346e;
                if (i7 == 0) {
                    i2 = 1;
                } else if (i7 == 1) {
                    i2 = 2;
                } else if (i7 == 2) {
                    i2 = 3;
                } else {
                    if (i7 != 3) {
                        throw new IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
                    }
                    i2 = 4;
                }
                boolean z3 = kr0Var.f23342a;
                boolean z4 = kr0Var.f23343b;
                boolean z5 = kr0Var.f23348g;
                String strM7577b = kq5Var.m7577b();
                int iM12482a = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "store_server_configs_in_properties", null, Boolean.class)) - 1;
                int iIntValue = ((Integer) kq5Var.m7576a("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
                int iIntValue2 = ((Integer) kq5Var.m7576a("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
                int iM12482a2 = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)) - 1;
                int iM12482a3 = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "close_sessions_on_ip_change", null, Boolean.class)) - 1;
                int iM12482a4 = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class)) - 1;
                int iM12482a5 = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "migrate_sessions_early_v2", null, Boolean.class)) - 1;
                int iM12482a6 = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "disable_bidirectional_streams", null, Boolean.class)) - 1;
                int iIntValue3 = ((Integer) kq5Var.m7576a("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                int iIntValue4 = ((Integer) kq5Var.m7576a("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                int iM12482a7 = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "enable_socket_recv_optimization", null, Boolean.class)) - 1;
                int iM12482a8 = x46.m12482a((Boolean) kq5Var.m7576a("AsyncDNS", "enable", null, Boolean.class)) - 1;
                int iM12482a9 = x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "enable", null, Boolean.class)) - 1;
                int iIntValue5 = ((Integer) kq5Var.m7576a("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
                int iIntValue6 = ((Integer) kq5Var.m7576a("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
                int iIntValue7 = ((Integer) kq5Var.m7576a("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
                int iM12482a10 = x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "allow_other_network", null, Boolean.class)) - 1;
                int iM12482a11 = x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "persist_to_disk", null, Boolean.class)) - 1;
                int iIntValue8 = ((Integer) kq5Var.m7576a("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
                int iM12482a12 = x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class)) - 1;
                JSONObject jSONObject = kq5Var.f23339a;
                if (jSONObject.length() == 0) {
                    objCast = null;
                } else {
                    try {
                        objCast = Boolean.class.cast(jSONObject.get("disable_ipv6_on_wifi"));
                    } catch (ClassCastException | JSONException e) {
                        if (Log.isLoggable("kq5", 2)) {
                            rw5.m10481c("kq5", "Failed to get %s options: %s", "disable_ipv6_on_wifi", e.getMessage());
                        }
                        objCast = null;
                    }
                }
                fq5.m5785e(j, i3, i4, i5, i6, i, z, z2, i2, z3, z4, z5, strM7577b, iM12482a, iIntValue, iIntValue2, iM12482a2, iM12482a3, iM12482a4, iM12482a5, iM12482a6, iIntValue3, iIntValue4, iM12482a7, iM12482a8, iM12482a9, iIntValue5, iIntValue6, iIntValue7, iM12482a10, iM12482a11, iIntValue8, iM12482a12, x46.m12482a((Boolean) objCast) - 1, kr0Var.f23349h, Process.myUid());
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            if (Log.isLoggable("cq5", 3)) {
                rw5.m10480b("cq5", "Failed to log CronetEngine:" + j + " creation: " + e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // p000.dt0
    /* JADX INFO: renamed from: J */
    public final void mo4110J(mr0 mr0Var) {
        ry5.m10503a("CronetLoggerImpl#logCronetInitializedInfo");
        try {
            fq5.m5783c(mr0Var.f25163a, mr0Var.f25164b, mr0Var.f25165c, new long[0], new long[0], mr0Var.f25166d, m4105f0(mr0Var.f25167e), Process.myUid());
            Trace.endSection();
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

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    @Override // p000.dt0
    /* JADX INFO: renamed from: K */
    public final void mo4111K(long j, or0 or0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bytes;
        uq5 uq5Var = this.f16378s;
        synchronized (uq5Var.f32105a) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (uq5Var.f32107c + 1000 <= jElapsedRealtime) {
                    uq5Var.f32106b = true;
                    uq5Var.f32107c = jElapsedRealtime;
                } else {
                    if (uq5Var.f32106b > 0) {
                        this.f16377r.incrementAndGet();
                        return;
                    }
                    uq5Var.f32106b = true;
                }
                int andSet = this.f16377r.getAndSet(0);
                ry5.m10503a("CronetLoggerImpl#writeCronetTrafficReported");
                try {
                    long j2 = or0Var.f26977a;
                    z46.m13336b("Request header size is negative", j2);
                    double d = j2 / 1024.0d;
                    int i6 = 6;
                    if (z46.m13337c(d, 0, 1)) {
                        i6 = 1;
                    } else if (z46.m13337c(d, 1, 10)) {
                        i6 = 2;
                    } else if (z46.m13337c(d, 10, 25)) {
                        i6 = 3;
                    } else if (z46.m13337c(d, 25, 50)) {
                        i6 = 4;
                    } else if (z46.m13337c(d, 50, 100)) {
                        i6 = 5;
                    }
                    long j3 = or0Var.f26978b;
                    z46.m13336b("Request body size is negative", j3);
                    double d2 = j3 / 1024.0d;
                    if (d2 == 0.0d) {
                        i = 1;
                    } else if (d2 > 0.0d && d2 < 10.0d) {
                        i = 2;
                    } else if (z46.m13337c(d2, 10, 50)) {
                        i = 3;
                    } else if (z46.m13337c(d2, 50, 200)) {
                        i = 4;
                    } else if (z46.m13337c(d2, 200, 500)) {
                        i = 5;
                    } else if (z46.m13337c(d2, 500, 1000)) {
                        i = 6;
                    } else {
                        i = z46.m13337c(d2, 1000, 5000) ? 7 : 8;
                    }
                    long j4 = or0Var.f26979c;
                    z46.m13336b("Response header size is negative", j4);
                    double d3 = j4 / 1024.0d;
                    if (z46.m13337c(d3, 0, 1)) {
                        i2 = 1;
                    } else if (z46.m13337c(d3, 1, 10)) {
                        i2 = 2;
                    } else if (z46.m13337c(d3, 10, 25)) {
                        i2 = 3;
                    } else if (z46.m13337c(d3, 25, 50)) {
                        i2 = 4;
                    } else {
                        i2 = z46.m13337c(d3, 50, 100) ? 5 : 6;
                    }
                    long j5 = or0Var.f26980d;
                    z46.m13336b("Response body size is negative", j5);
                    double d4 = j5 / 1024.0d;
                    if (d4 == 0.0d) {
                        i3 = 1;
                    } else if (d4 > 0.0d && d4 < 10.0d) {
                        i3 = 2;
                    } else if (z46.m13337c(d4, 10, 50)) {
                        i3 = 3;
                    } else if (z46.m13337c(d4, 50, 200)) {
                        i3 = 4;
                    } else if (z46.m13337c(d4, 200, 500)) {
                        i3 = 5;
                    } else if (z46.m13337c(d4, 500, 1000)) {
                        i3 = 6;
                    } else {
                        i3 = z46.m13337c(d4, 1000, 5000) ? 7 : 8;
                    }
                    int i7 = or0Var.f26981e;
                    String str = or0Var.f26983g;
                    MessageDigest messageDigest = pq5.f27900b;
                    long j6 = (messageDigest == null || str == null || str.isEmpty() || (bytes = str.getBytes(StandardCharsets.UTF_8)) == null || bytes.length == 0) ? 0L : ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                    int millis = (int) or0Var.f26982f.toMillis();
                    int iM4376u = d55.m4376u(or0Var.f26984h);
                    if (iM4376u == 0) {
                        i4 = 1;
                    } else if (iM4376u != 1) {
                        i4 = iM4376u != 2 ? 0 : 3;
                    } else {
                        i4 = 2;
                    }
                    int i8 = or0Var.f26985i;
                    int i9 = or0Var.f26986j;
                    int i10 = or0Var.f26987k;
                    Boolean bool = Boolean.FALSE;
                    int iM12482a = x46.m12482a(bool) - 1;
                    int iM12482a2 = x46.m12482a(Boolean.valueOf(or0Var.f26988l)) - 1;
                    int i11 = or0Var.f26989m;
                    int iM4376u2 = d55.m4376u(1);
                    if (iM4376u2 != 1) {
                        i5 = iM4376u2 != 2 ? 0 : 100;
                    } else {
                        i5 = 1;
                    }
                    fq5.m5786f(j, i6, i, i2, i3, i7, j6, -1, millis, andSet, i4, i8, i9, i10, iM12482a, iM12482a2, i11, 0, i5, x46.m12482a(bool) - 1, or0Var.f26990n, m4105f0(nr0.CRONET_SOURCE_FALLBACK), -1L, -1L, -1L, -1L, 1 - 1, x46.m12482a(bool) - 1);
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
