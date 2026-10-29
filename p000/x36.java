package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x36 {

    /* JADX INFO: renamed from: h */
    public static volatile x36 f33960h;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f33961a;

    /* JADX INFO: renamed from: b */
    public final AppMeasurementSdk f33962b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f33963c;

    /* JADX INFO: renamed from: d */
    public int f33964d;

    /* JADX INFO: renamed from: e */
    public boolean f33965e;

    /* JADX INFO: renamed from: f */
    public final String f33966f;

    /* JADX INFO: renamed from: g */
    public volatile gx5 f33967g;

    public x36(Context context, Bundle bundle) {
        zw0 zw0Var = new zw0((byte) 3);
        zw0Var.f36423b = Executors.defaultThreadFactory();
        VarHandle.storeStoreFence();
        byte b = 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zw0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f33961a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f33962b = new AppMeasurementSdk(this);
        this.f33963c = new ArrayList();
        try {
            if (iw5.m6958a(context, p96.m9440a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, x36.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f33966f = null;
                    this.f33965e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f33966f = "fa";
        m12478c(new h06(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
            return;
        }
        zs5 zs5Var = new zs5(b);
        zs5Var.f36348b = this;
        VarHandle.storeStoreFence();
        application.registerActivityLifecycleCallbacks(zs5Var);
    }

    /* JADX INFO: renamed from: e */
    public static x36 m12475e(Context context, Bundle bundle) {
        y42.m12854a0(context);
        if (f33960h == null) {
            synchronized (x36.class) {
                try {
                    if (f33960h == null) {
                        f33960h = new x36(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33960h;
    }

    /* JADX INFO: renamed from: a */
    public final Map m12476a(String str, String str2, boolean z) {
        zw5 zw5Var = new zw5();
        m12478c(new qz5(this, str, str2, z, zw5Var));
        Bundle bundleM13832F = zw5Var.m13832F(5000L);
        if (bundleM13832F == null || bundleM13832F.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM13832F.size());
        for (String str3 : bundleM13832F.keySet()) {
            Object obj = bundleM13832F.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final int m12477b(String str) {
        zw5 zw5Var = new zw5();
        m12478c(new h06(this, str, zw5Var));
        Integer num = (Integer) zw5.m13831G(zw5Var.m13832F(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m12478c(h26 h26Var) {
        this.f33961a.execute(h26Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m12479d(Exception exc, boolean z, boolean z2) {
        this.f33965e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m12478c(new sz5(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: f */
    public final List m12480f(String str, String str2) {
        zw5 zw5Var = new zw5();
        m12478c(new vz5(this, str, str2, zw5Var));
        List list = (List) zw5.m13831G(zw5Var.m13832F(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: g */
    public final long m12481g() {
        zw5 zw5Var = new zw5();
        m12478c(new o06(this, zw5Var, (byte) 2));
        Long l = (Long) zw5.m13831G(zw5Var.m13832F(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.f33964d + 1;
        this.f33964d = i;
        return jNextLong + ((long) i);
    }
}
