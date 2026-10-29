package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ConnectivityManagerWrapper;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.VersionSafeProxyOptions;
import p000.C1077qn;
import p000.ar1;
import p000.b36;
import p000.dp2;
import p000.dt0;
import p000.ep5;
import p000.er0;
import p000.er5;
import p000.f36;
import p000.fo5;
import p000.fr0;
import p000.gr0;
import p000.hp5;
import p000.hr0;
import p000.iw5;
import p000.jr5;
import p000.jt5;
import p000.kr0;
import p000.kr6;
import p000.ks5;
import p000.mr0;
import p000.n83;
import p000.nr0;
import p000.on6;
import p000.oz5;
import p000.pp5;
import p000.pr0;
import p000.qm5;
import p000.r16;
import p000.ry5;
import p000.sk5;
import p000.so5;
import p000.tn5;
import p000.tr0;
import p000.ws5;
import p000.x06;
import p000.xp5;
import p000.xy4;
import p000.y26;
import p000.zo6;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class CronetUrlRequestContext extends fr0 {

    /* JADX INFO: renamed from: v */
    public static final HashSet f27017v = new HashSet();

    /* JADX INFO: renamed from: a */
    public final Object f27018a;

    /* JADX INFO: renamed from: b */
    public final ConditionVariable f27019b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f27020c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f27021d;

    /* JADX INFO: renamed from: e */
    public long f27022e;

    /* JADX INFO: renamed from: f */
    public final boolean f27023f;

    /* JADX INFO: renamed from: g */
    public final Object f27024g;

    /* JADX INFO: renamed from: h */
    public final Object f27025h;

    /* JADX INFO: renamed from: i */
    public final int f27026i;

    /* JADX INFO: renamed from: j */
    public final int f27027j;

    /* JADX INFO: renamed from: k */
    public final int f27028k;

    /* JADX INFO: renamed from: l */
    public final on6 f27029l;

    /* JADX INFO: renamed from: m */
    public final on6 f27030m;

    /* JADX INFO: renamed from: n */
    public final HashMap f27031n;

    /* JADX INFO: renamed from: o */
    public final ConditionVariable f27032o;

    /* JADX INFO: renamed from: p */
    public final String f27033p;

    /* JADX INFO: renamed from: q */
    public boolean f27034q;

    /* JADX INFO: renamed from: r */
    public boolean f27035r;

    /* JADX INFO: renamed from: s */
    public long f27036s;

    /* JADX INFO: renamed from: t */
    public final dt0 f27037t;

    /* JADX INFO: renamed from: u */
    public final ep5 f27038u;

    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    public CronetUrlRequestContext(gr0 gr0Var, long j) {
        boolean z;
        int iLongValue;
        int i;
        boolean zM11072c;
        int i2;
        boolean z2;
        Object obj = new Object();
        this.f27018a = obj;
        this.f27019b = new ConditionVariable(false);
        this.f27020c = new AtomicInteger(0);
        this.f27021d = new AtomicInteger(0);
        this.f27024g = new Object();
        this.f27025h = new Object();
        this.f27026i = -1;
        this.f27027j = -1;
        this.f27028k = -1;
        this.f27029l = new on6();
        this.f27030m = new on6();
        this.f27031n = new HashMap();
        this.f27032o = new ConditionVariable();
        this.f27036s = -1L;
        ry5.m10503a("CronetUrlRequestContext#CronetUrlRequestContext");
        try {
            this.f27023f = gr0Var.f20073n;
            boolean zM6474a = hr0.m6474a(gr0Var.f20061b);
            int i3 = 1;
            if (sk5.m10840f(gr0Var.f20070k) == 1) {
                String str = gr0Var.f20066g;
                this.f27033p = str;
                HashSet hashSet = f27017v;
                synchronized (hashSet) {
                    try {
                        if (!hashSet.add(str)) {
                            throw new IllegalStateException("Disk cache storage path already in use");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                this.f27033p = null;
            }
            VersionSafeProxyOptions versionSafeProxyOptions = gr0Var.f20074o;
            if (versionSafeProxyOptions != null) {
                versionSafeProxyOptions.createProxyCallbackList();
            }
            nr0 nr0Var = r16.f28959t;
            String strM13649a = zo6.m13649a(gr0Var.f20072m, Collections.unmodifiableMap(iw5.m6959b(x06.f33904a, nr0Var).f35372a));
            synchronized (obj) {
                ry5.m10503a("CronetUrlRequestContext#CronetUrlRequestContext creating adapter");
                try {
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(iw5.m6959b(x06.f33904a, nr0Var).f35372a);
                    tn5 tn5Var = (tn5) mapUnmodifiableMap.get("Cronet_override_network_thread_priority");
                    tn5 tn5Var2 = (tn5) mapUnmodifiableMap.get("Cronet_always_enable_brotli");
                    boolean zM11072c2 = tn5Var2 != null ? tn5Var2.m11072c() : false;
                    pp5 pp5VarM12731l = xp5.m12731l();
                    boolean z3 = gr0Var.f20067h;
                    pp5VarM12731l.m6062b();
                    xp5.m12744y((xp5) pp5VarM12731l.f20035b, z3);
                    boolean z4 = gr0Var.f20068i;
                    pp5VarM12731l.m6062b();
                    xp5.m12737r((xp5) pp5VarM12731l.f20035b, z4);
                    boolean z5 = zM11072c2 || gr0Var.f20069j;
                    pp5VarM12731l.m6062b();
                    xp5.m12732m((xp5) pp5VarM12731l.f20035b, z5);
                    int i4 = gr0Var.f20070k;
                    if (i4 == 1) {
                        z = false;
                    } else {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                z = false;
                            } else if (i4 != 4) {
                                throw null;
                            }
                        }
                        z = true;
                    }
                    pp5VarM12731l.m6062b();
                    xp5.m12734o((xp5) pp5VarM12731l.f20035b, !z);
                    byte bM10840f = sk5.m10840f(gr0Var.f20070k);
                    pp5VarM12731l.m6062b();
                    xp5.m12739t((xp5) pp5VarM12731l.f20035b, bM10840f);
                    long j2 = gr0Var.f20071l;
                    pp5VarM12731l.m6062b();
                    xp5.m12738s((xp5) pp5VarM12731l.f20035b, j2);
                    pp5VarM12731l.m6062b();
                    xp5.m12740u((xp5) pp5VarM12731l.f20035b);
                    boolean z6 = gr0Var.f20073n;
                    pp5VarM12731l.m6062b();
                    xp5.m12735p((xp5) pp5VarM12731l.f20035b, z6);
                    boolean z7 = gr0Var.f20064e;
                    pp5VarM12731l.m6062b();
                    xp5.m12733n((xp5) pp5VarM12731l.f20035b, z7);
                    if (tn5Var != null) {
                        tn5Var.m11073d(1);
                        iLongValue = (int) ((Long) tn5Var.f31275a).longValue();
                    } else {
                        iLongValue = 0;
                    }
                    pp5VarM12731l.m6062b();
                    xp5.m12741v((xp5) pp5VarM12731l.f20035b, iLongValue);
                    VersionSafeProxyOptions versionSafeProxyOptions2 = gr0Var.f20074o;
                    if (versionSafeProxyOptions2 != null) {
                        hp5 hp5VarCreateProxyOptionsProto = versionSafeProxyOptions2.createProxyOptionsProto();
                        pp5VarM12731l.m6062b();
                        xp5.m12742w((xp5) pp5VarM12731l.f20035b, hp5VarCreateProxyOptionsProto);
                    }
                    String str2 = gr0Var.f20065f;
                    if (str2 != null) {
                        pp5VarM12731l.m6062b();
                        xp5.m12730A((xp5) pp5VarM12731l.f20035b, str2);
                    }
                    String str3 = gr0Var.f20066g;
                    if (str3 != null) {
                        pp5VarM12731l.m6062b();
                        xp5.m12745z((xp5) pp5VarM12731l.f20035b, str3);
                    }
                    gr0Var.m6105d();
                    String strM6105d = gr0Var.m6105d();
                    pp5VarM12731l.m6062b();
                    xp5.m12743x((xp5) pp5VarM12731l.f20035b, strM6105d);
                    if (strM13649a != null) {
                        pp5VarM12731l.m6062b();
                        xp5.m12736q((xp5) pp5VarM12731l.f20035b, strM13649a);
                    }
                    xp5 xp5Var = (xp5) pp5VarM12731l.m6061a();
                    try {
                        int iMo6948b = xp5Var.mo6948b(null);
                        byte[] bArr = new byte[iMo6948b];
                        n83 n83Var = new n83(bArr, iMo6948b, (byte) 4);
                        xp5Var.mo6947a(n83Var);
                        n83Var.m8596C();
                        long jMB3ntV7V = AbstractC0768N.MB3ntV7V(bArr);
                        long j3 = 0;
                        if (jMB3ntV7V == 0) {
                            throw new IllegalArgumentException("Experimental options parsing failed.");
                        }
                        ArrayList arrayList = gr0Var.f20062c;
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            jr5 jr5Var = (jr5) obj2;
                            AbstractC0768N.MyRIv1Ij(jMB3ntV7V, jr5Var.f22546a, jr5Var.f22547b, jr5Var.f22548c);
                            j3 = j3;
                        }
                        long j4 = j3;
                        ArrayList arrayList2 = gr0Var.f20063d;
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj3 = arrayList2.get(i6);
                            i6++;
                            er5 er5Var = (er5) obj3;
                            AbstractC0768N.Muq3ic6p(jMB3ntV7V, er5Var.f18422a, er5Var.f18423b, er5Var.f18424c, er5Var.f18425d.getTime());
                            i3 = i3;
                        }
                        i = i3;
                        this.f27022e = AbstractC0768N.M135Cu0D(jMB3ntV7V);
                        Trace.endSection();
                        if (this.f27022e == j4) {
                            throw new NullPointerException("Context Adapter creation failed.");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("Serializing " + xp5Var.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                    }
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            dt0 dt0VarM7599F = ks5.m7599F(gr0Var.f20061b, nr0Var);
            this.f27037t = dt0VarM7599F;
            long jMo4725C = dt0VarM7599F.mo4725C();
            kr0 kr0VarM6106e = gr0Var.m6106e();
            try {
                dt0VarM7599F.mo4109I(jMo4725C, kr0VarM6106e, new pr0("Cronet/".concat(ImplVersion.getCronetVersionWithLastChange()).split("/")[i].split("@")[0]), nr0Var);
            } catch (RuntimeException e2) {
                Log.i("cn_CronetUrlRequestContext", "Error while trying to log CronetEngine creation: ", e2);
            }
            dp2 dp2Var = zM6474a ? new dp2(this.f27037t, kr0VarM6106e.f23349h, j) : null;
            oz5 oz5Var = new oz5((byte) 15);
            oz5Var.f27249b = dp2Var;
            oz5Var.f27250c = this;
            VarHandle.storeStoreFence();
            HandlerThread handlerThread = hr0.f20801f;
            if (handlerThread.getLooper() == Looper.myLooper()) {
                oz5Var.run();
            } else {
                new Handler(handlerThread.getLooper()).post(oz5Var);
            }
            if (dp2Var != null) {
                mr0 mr0Var = (mr0) dp2Var.f17256c;
                int iUptimeMillis = (int) (SystemClock.uptimeMillis() - dp2Var.f17254a);
                synchronized (mr0Var) {
                    mr0Var.f25164b = iUptimeMillis;
                    mr0 mr0Var2 = (mr0) dp2Var.f17256c;
                    if (mr0Var2.f25164b >= 0 && mr0Var2.f25165c >= 0) {
                        ((dt0) dp2Var.f17255b).mo4110J(mr0Var2);
                    }
                }
            }
            Trace.endSection();
            Context context = gr0Var.f20061b;
            dt0 dt0Var = this.f27037t;
            String str4 = "N";
            ep5 ep5Var = new ep5();
            ep5Var.f18368j = Collections.synchronizedMap(new HashMap());
            ep5Var.f18369k = Collections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
            ep5Var.f18370l = new AtomicReference(null);
            ry5.m10503a("CronetAdaptiveRequestContext#constructor");
            try {
                ep5Var.f18359a = context.getApplicationContext();
                ep5Var.f18360b = dt0Var;
                ep5Var.f18371m = new ConnectivityManagerWrapper(context);
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(iw5.m6959b(context, r16.f28959t).f35372a);
                if (mapUnmodifiableMap2.containsKey("Cronet_enable_adaptive_network_hosts")) {
                    ep5Var.f18361c = ((tn5) mapUnmodifiableMap2.get("Cronet_enable_adaptive_network_hosts")).m11071b().trim().split(",");
                } else {
                    ep5Var.f18361c = new String[0];
                }
                ep5Var.f18362d = new HashSet();
                if (mapUnmodifiableMap2.containsKey("Cronet_enable_adaptive_network_paths")) {
                    for (String str5 : ((tn5) mapUnmodifiableMap2.get("Cronet_enable_adaptive_network_paths")).m11071b().trim().split(",")) {
                        if (!str5.isEmpty()) {
                            ep5Var.f18362d.add(str5);
                        }
                    }
                }
                if (mapUnmodifiableMap2.containsKey("Cronet_adaptive_failover_ms")) {
                    tn5 tn5Var3 = (tn5) mapUnmodifiableMap2.get("Cronet_adaptive_failover_ms");
                    tn5Var3.m11073d(i);
                    ep5Var.f18364f = ((Long) tn5Var3.f31275a).longValue();
                } else {
                    ep5Var.f18364f = 3000L;
                }
                if (mapUnmodifiableMap2.containsKey("Cronet_enable_adaptive_network")) {
                    zM11072c = ((tn5) mapUnmodifiableMap2.get("Cronet_enable_adaptive_network")).m11072c();
                    ep5Var.f18365g = zM11072c;
                } else {
                    ep5Var.f18365g = false;
                    zM11072c = false;
                }
                if (mapUnmodifiableMap2.containsKey("Cronet_enable_adaptive_network_for_all")) {
                    boolean zM11072c3 = ((tn5) mapUnmodifiableMap2.get("Cronet_enable_adaptive_network_for_all")).m11072c();
                    ep5Var.f18366h = zM11072c3;
                    z2 = zM11072c3;
                    i2 = 0;
                } else {
                    i2 = 0;
                    ep5Var.f18366h = false;
                    z2 = false;
                }
                if (mapUnmodifiableMap2.containsKey("Cronet_adaptive_network_dev_toast") && ((tn5) mapUnmodifiableMap2.get("Cronet_adaptive_network_dev_toast")).m11072c()) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    ep5Var.f18367i = handler;
                    if (!ep5.f18358n) {
                        String packageName = ep5Var.f18359a.getPackageName();
                        String str6 = true != zM11072c ? "N" : "Y";
                        if (true == z2) {
                            str4 = "Y";
                        }
                        Objects.requireNonNull(handler);
                        ar1 ar1Var = new ar1((byte) 8);
                        ar1Var.f14798b = ep5Var;
                        ar1Var.f14799c = "CRONET[" + packageName + "]: CANS enabled: " + str6 + ", for all: " + str4;
                        VarHandle.storeStoreFence();
                        handler.post(ar1Var);
                        ep5.f18358n = true;
                    }
                }
                ep5Var.f18363e = new HashSet();
                if (mapUnmodifiableMap2.containsKey("Cronet_fast_idempotent_paths")) {
                    String[] strArrSplit = ((tn5) mapUnmodifiableMap2.get("Cronet_fast_idempotent_paths")).m11071b().trim().split(",");
                    int length = strArrSplit.length;
                    while (i2 < length) {
                        String str7 = strArrSplit[i2];
                        if (!str7.isEmpty()) {
                            ep5Var.f18363e.add(str7);
                        }
                        i2++;
                    }
                }
                Trace.endSection();
                VarHandle.storeStoreFence();
                this.f27038u = ep5Var;
            } catch (Throwable th4) {
                try {
                    Trace.endSection();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            try {
                Trace.endSection();
                throw th6;
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
                throw th6;
            }
        }
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: a */
    public final ExperimentalBidirectionalStream mo5788a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, ArrayList arrayList, int i, boolean z, ArrayList arrayList2, boolean z2, int i2, boolean z3, int i3, long j) throws Throwable {
        long j2 = j == -1 ? this.f27036s : j;
        synchronized (this.f27018a) {
            try {
                try {
                    m9249c();
                    ep5 ep5Var = this.f27038u;
                    URI uriM5271a = ep5Var.m5271a(str);
                    fo5 fo5Var = null;
                    so5 so5VarM5272b = uriM5271a != null ? ep5Var.m5272b(uriM5271a, j2) : null;
                    if (so5VarM5272b != null) {
                        AtomicReference atomicReference = ep5Var.f18370l;
                        if (atomicReference.get() == null) {
                            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                            while (!atomicReference.compareAndSet(null, scheduledExecutorServiceNewSingleThreadScheduledExecutor) && atomicReference.get() == null) {
                            }
                        }
                        fo5Var = new fo5(callback, (ScheduledExecutorService) atomicReference.get(), ep5Var, uriM5271a, this.f27037t, ep5Var.f18363e.contains(uriM5271a.getPath()));
                    }
                    BidirectionalStream.Callback callback2 = fo5Var != null ? fo5Var.f19207s : callback;
                    if (so5VarM5272b != null) {
                        j2 = so5VarM5272b.f30452a;
                    }
                    fo5 fo5Var2 = fo5Var;
                    so5 so5Var = so5VarM5272b;
                    er0 er0Var = new er0(this, str, i, callback2, executor, str2, arrayList, z, z2, i2, z3, i3, j2, uriM5271a != null);
                    if (fo5Var2 == null) {
                        return er0Var;
                    }
                    fo5Var2.f19192d = new er0(this, str, i, fo5Var2.f19207s, executor, str2, arrayList, z, z2, i2, z3, i3, so5Var.f30453b, true);
                    fo5Var2.f19190b = er0Var;
                    return fo5Var2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.f27025h) {
            this.f27031n.put(listener, new f36(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return;
        }
        synchronized (this.f27024g) {
            try {
                if (this.f27029l.f26921c == 0) {
                    synchronized (this.f27018a) {
                        m9249c();
                        AbstractC0768N.MpnFLFF2(this.f27022e, true);
                    }
                }
                this.f27029l.m9193a(new y26(networkQualityRttListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return;
        }
        synchronized (this.f27024g) {
            try {
                if (this.f27030m.f26921c == 0) {
                    synchronized (this.f27018a) {
                        m9249c();
                        AbstractC0768N.MnPUhNKP(this.f27022e, true);
                    }
                }
                this.f27030m.m9193a(new b36(networkQualityThroughputListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: b */
    public final ExperimentalUrlRequest mo3890b(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) throws Throwable {
        long j2 = j == -1 ? this.f27036s : j;
        synchronized (this.f27018a) {
            try {
                try {
                    m9249c();
                    return new tr0(this, str, i, callback, executor, z, z2, z3, z4, i2, z5, i3, listener, i4, j2, str2, arrayList2, uploadDataProvider, executor2, bArr, byteBuffer, str3);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.f27036s = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m9249c() {
        if (this.f27022e != 0) {
            return;
        }
        C1077qn.m9989o("Engine is shut down.");
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return;
        }
        synchronized (this.f27018a) {
            m9249c();
            AbstractC0768N.M6sIJDgy_ForTesting(this.f27022e, z, z2, z3);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        jt5 jt5Var = new jt5();
        jt5Var.f22613a = this;
        VarHandle.storeStoreFence();
        return jt5Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.f27021d.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        int i;
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return 0;
        }
        synchronized (this.f27024g) {
            i = this.f27028k;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return 0;
        }
        synchronized (this.f27024g) {
        }
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        int i;
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return 0;
        }
        synchronized (this.f27024g) {
            i = this.f27026i;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        int i;
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return 0;
        }
        synchronized (this.f27024g) {
            i = this.f27027j;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "Cronet/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new kr6(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            xy4.m12791t();
            return null;
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new ws5(url, this);
        }
        qm5.m9919j("Unexpected protocol:".concat(String.valueOf(protocol)));
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.f27025h) {
            this.f27031n.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return;
        }
        synchronized (this.f27024g) {
            try {
                on6 on6Var = this.f27029l;
                if (on6Var.m9194b(new y26(networkQualityRttListener))) {
                    if (on6Var.f26921c == 0) {
                        synchronized (this.f27018a) {
                            m9249c();
                            AbstractC0768N.MpnFLFF2(this.f27022e, false);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.f27023f) {
            C1077qn.m9989o("Network quality estimator must be enabled");
            return;
        }
        synchronized (this.f27024g) {
            try {
                on6 on6Var = this.f27030m;
                if (on6Var.m9194b(new b36(networkQualityThroughputListener))) {
                    if (on6Var.f26921c == 0) {
                        synchronized (this.f27018a) {
                            m9249c();
                            AbstractC0768N.MnPUhNKP(this.f27022e, false);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        boolean z;
        ry5.m10503a("CronetUrlRequestContext#shutdown");
        try {
            String str = this.f27033p;
            if (str != null) {
                HashSet hashSet = f27017v;
                synchronized (hashSet) {
                    hashSet.remove(str);
                }
            }
            synchronized (this.f27018a) {
                m9249c();
                if (this.f27020c.get() != 0) {
                    throw new IllegalStateException("Cannot shutdown with running requests.");
                }
                if (Thread.currentThread() == null) {
                    throw new IllegalThreadStateException("Cannot shutdown from network thread.");
                }
            }
            this.f27019b.block();
            Object obj = this.f27018a;
            synchronized (obj) {
                m9249c();
                z = true;
                if (this.f27034q && !this.f27035r) {
                    AbstractC0768N.MKFm_qQ7(this.f27022e);
                    this.f27035r = true;
                    ConditionVariable conditionVariable = this.f27032o;
                    conditionVariable.block();
                    conditionVariable.close();
                    synchronized (obj) {
                        this.f27035r = false;
                        this.f27034q = false;
                    }
                }
            }
            synchronized (this.f27018a) {
                try {
                    long j = this.f27022e;
                    if (j == 0) {
                        z = false;
                    }
                    if (z) {
                        AbstractC0768N.MeBvNXm5(j);
                        this.f27022e = 0L;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.f27018a) {
            try {
                m9249c();
                if (this.f27034q) {
                    return;
                }
                AbstractC0768N.MTULt02u(this.f27022e, str, z, i);
                this.f27034q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        synchronized (this.f27018a) {
            try {
                m9249c();
                if (this.f27034q) {
                    return;
                }
                if (!AbstractC0768N.MgwJQAH1(this.f27022e, str, z)) {
                    throw new RuntimeException("Unable to start NetLog");
                }
                this.f27034q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        Object obj = this.f27018a;
        synchronized (obj) {
            m9249c();
            if (this.f27034q && !this.f27035r) {
                AbstractC0768N.MKFm_qQ7(this.f27022e);
                this.f27035r = true;
                ConditionVariable conditionVariable = this.f27032o;
                conditionVariable.block();
                conditionVariable.close();
                synchronized (obj) {
                    this.f27035r = false;
                    this.f27034q = false;
                }
            }
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new kr6(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }
}
