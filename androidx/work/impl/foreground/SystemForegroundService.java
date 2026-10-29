package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import p000.C0675g4;
import p000.cu2;
import p000.ek2;
import p000.g25;
import p000.gk2;
import p000.hg4;
import p000.j24;
import p000.j25;
import p000.lk2;
import p000.ok2;
import p000.oz5;
import p000.qq2;
import p000.r50;
import p000.tt2;
import p000.wn2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends Service implements lk2 {

    /* JADX INFO: renamed from: e */
    public static final String f14710e = wn2.m12327g("SystemFgService");

    /* JADX INFO: renamed from: a */
    public final tt2 f14711a;

    /* JADX INFO: renamed from: b */
    public boolean f14712b;

    /* JADX INFO: renamed from: c */
    public hg4 f14713c;

    /* JADX INFO: renamed from: d */
    public NotificationManager f14714d;

    public SystemForegroundService() {
        tt2 tt2Var = new tt2((byte) 10, false);
        tt2Var.f31428b = new ok2(this, true);
        tt2Var.f31429c = new Handler(Looper.getMainLooper());
        VarHandle.storeStoreFence();
        this.f14711a = tt2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3085a() {
        this.f14714d = (NotificationManager) getApplicationContext().getSystemService("notification");
        Context applicationContext = getApplicationContext();
        hg4 hg4Var = new hg4();
        hg4Var.f20561c = new Object();
        g25 g25VarM5888b = g25.m5888b(applicationContext);
        hg4Var.f20559a = g25VarM5888b;
        hg4Var.f20560b = g25VarM5888b.f19515d;
        hg4Var.f20562d = null;
        hg4Var.f20563e = new LinkedHashMap();
        hg4Var.f20565g = new HashMap();
        hg4Var.f20564f = new HashMap();
        hg4Var.f20566h = new cu2(g25VarM5888b.f19521j);
        g25VarM5888b.f19517f.m7104a(hg4Var);
        VarHandle.storeStoreFence();
        this.f14713c = hg4Var;
        if (hg4Var.f20567i != null) {
            wn2.m12326e().m12329c(hg4.f20558j, "A callback already exists.");
        } else {
            hg4Var.f20567i = this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3086b() {
        tt2 tt2Var = this.f14711a;
        tt2Var.getClass();
        tt2Var.m11157y(ek2.ON_CREATE);
        super.onCreate();
    }

    /* JADX INFO: renamed from: c */
    public final void m3087c() {
        tt2 tt2Var = this.f14711a;
        tt2Var.getClass();
        tt2Var.m11157y(ek2.ON_STOP);
        tt2Var.m11157y(ek2.ON_DESTROY);
        super.onDestroy();
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        return (ok2) this.f14711a.f31428b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        tt2 tt2Var = this.f14711a;
        tt2Var.getClass();
        tt2Var.m11157y(ek2.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        m3086b();
        m3085a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m3087c();
        this.f14713c.m6395c();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        tt2 tt2Var = this.f14711a;
        tt2Var.getClass();
        tt2Var.m11157y(ek2.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f14712b;
        String str = f14710e;
        if (z) {
            wn2.m12326e().m12331f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f14713c.m6395c();
            m3085a();
            this.f14712b = false;
        }
        if (intent == null) {
            return 3;
        }
        hg4 hg4Var = this.f14713c;
        hg4Var.getClass();
        String str2 = hg4.f20558j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            wn2.m12326e().m12331f(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            j25 j25Var = hg4Var.f20560b;
            oz5 oz5Var = new oz5((byte) 5);
            oz5Var.f27250c = hg4Var;
            oz5Var.f27249b = stringExtra;
            VarHandle.storeStoreFence();
            j25Var.f21972a.execute(oz5Var);
            hg4Var.m6393a(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            hg4Var.m6393a(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            wn2.m12326e().m12331f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = hg4Var.f20567i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f14712b = true;
            wn2.m12326e().m12328b(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        wn2.m12326e().m12331f(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        g25 g25Var = hg4Var.f20559a;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        g25Var.getClass();
        r50 r50Var = g25Var.f19513b.f21515l;
        j24 j24Var = g25Var.f19515d.f21972a;
        C0675g4 c0675g4 = new C0675g4((byte) 14);
        c0675g4.f19600b = g25Var;
        c0675g4.f19601c = uuidFromString;
        VarHandle.storeStoreFence();
        qq2.m10040x(r50Var, "CancelWorkById", j24Var, c0675g4);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f14713c.m6396e(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.f14713c.m6396e(i, i2);
    }
}
