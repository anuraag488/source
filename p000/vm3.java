package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vm3 implements ah1 {

    /* JADX INFO: renamed from: j */
    public static final Random f32733j = new Random();

    /* JADX INFO: renamed from: k */
    public static final HashMap f32734k = new HashMap();

    /* JADX INFO: renamed from: a */
    public HashMap f32735a;

    /* JADX INFO: renamed from: b */
    public Context f32736b;

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f32737c;

    /* JADX INFO: renamed from: d */
    public hg1 f32738d;

    /* JADX INFO: renamed from: e */
    public sg1 f32739e;

    /* JADX INFO: renamed from: f */
    public bg1 f32740f;

    /* JADX INFO: renamed from: g */
    public bi3 f32741g;

    /* JADX INFO: renamed from: h */
    public String f32742h;

    /* JADX INFO: renamed from: i */
    public HashMap f32743i;

    /* JADX INFO: renamed from: f */
    public static gk0 m11934f(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("frc_" + str + "_firebase_settings", 0);
        gk0 gk0Var = new gk0();
        gk0Var.f19824a = sharedPreferences;
        gk0Var.f19825b = new Object();
        gk0Var.f19826c = new Object();
        gk0Var.f19827d = new Object();
        VarHandle.storeStoreFence();
        return gk0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized wg1 m11935a() throws Throwable {
        nh3 nh3Var;
        try {
            try {
                uj0 uj0VarM11937c = m11937c("fetch");
                uj0 uj0VarM11937c2 = m11937c("activate");
                uj0 uj0VarM11937c3 = m11937c("defaults");
                gk0 gk0VarM11934f = m11934f(this.f32736b, this.f32742h);
                try {
                    try {
                        ScheduledExecutorService scheduledExecutorService = this.f32737c;
                        ak0 ak0Var = new ak0();
                        HashSet hashSet = new HashSet();
                        ak0Var.f14577a = hashSet;
                        ak0Var.f14578b = scheduledExecutorService;
                        ak0Var.f14579c = uj0VarM11937c2;
                        ak0Var.f14580d = uj0VarM11937c3;
                        VarHandle.storeStoreFence();
                        hg1 hg1Var = this.f32738d;
                        bi3 bi3Var = this.f32741g;
                        hg1Var.m6388a();
                        boolean z = false;
                        byte b = 0;
                        if (hg1Var.f20546b.equals("[DEFAULT]")) {
                            nh3Var = new nh3((byte) 28, z);
                            nh3Var.f25811c = Collections.synchronizedMap(new HashMap());
                            nh3Var.f25810b = bi3Var;
                            VarHandle.storeStoreFence();
                        } else {
                            nh3Var = null;
                        }
                        if (nh3Var != null) {
                            tm3 tm3Var = new tm3();
                            tm3Var.f31239a = nh3Var;
                            VarHandle.storeStoreFence();
                            synchronized (hashSet) {
                                hashSet.add(tm3Var);
                            }
                        }
                        pq3 pq3Var = new pq3(b == true ? 1 : 0);
                        pq3Var.f27896b = uj0VarM11937c2;
                        pq3Var.f27897c = uj0VarM11937c3;
                        ScheduledExecutorService scheduledExecutorService2 = this.f32737c;
                        C1283w7 c1283w7 = new C1283w7((byte) 16);
                        c1283w7.f33126b = Collections.newSetFromMap(new ConcurrentHashMap());
                        c1283w7.f33127c = uj0VarM11937c2;
                        c1283w7.f33128d = pq3Var;
                        c1283w7.f33129e = scheduledExecutorService2;
                        return m11936b(this.f32738d, this.f32739e, this.f32740f, this.f32737c, uj0VarM11937c, uj0VarM11937c2, uj0VarM11937c3, m11938d(uj0VarM11937c, gk0VarM11934f), ak0Var, gk0VarM11934f, c1283w7);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized wg1 m11936b(hg1 hg1Var, sg1 sg1Var, bg1 bg1Var, Executor executor, uj0 uj0Var, uj0 uj0Var2, uj0 uj0Var3, wo5 wo5Var, ak0 ak0Var, gk0 gk0Var, C1283w7 c1283w7) {
        if (!this.f32735a.containsKey("firebase")) {
            hg1Var.m6388a();
            if (!hg1Var.f20546b.equals("[DEFAULT]")) {
                bg1Var = null;
            }
            Context context = this.f32736b;
            synchronized (this) {
                nh3 nh3Var = new nh3(hg1Var, sg1Var, wo5Var, uj0Var2, context, gk0Var, this.f32737c);
                wg1 wg1Var = new wg1();
                wg1Var.f33356a = bg1Var;
                wg1Var.f33357b = executor;
                wg1Var.f33358c = uj0Var;
                wg1Var.f33359d = uj0Var2;
                wg1Var.f33360e = uj0Var3;
                wg1Var.f33361f = wo5Var;
                wg1Var.f33362g = ak0Var;
                wg1Var.f33363h = nh3Var;
                wg1Var.f33364i = c1283w7;
                VarHandle.storeStoreFence();
                uj0Var2.m11571b();
                uj0Var3.m11571b();
                uj0Var.m11571b();
                this.f32735a.put("firebase", wg1Var);
                f32734k.put("firebase", wg1Var);
            }
        }
        return (wg1) this.f32735a.get("firebase");
    }

    /* JADX INFO: renamed from: c */
    public final uj0 m11937c(String str) {
        hk0 hk0Var;
        uj0 uj0Var;
        String strM13622v = zi4.m13622v("frc_", this.f32742h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f32737c;
        Context context = this.f32736b;
        HashMap map = hk0.f20632c;
        synchronized (hk0.class) {
            try {
                HashMap map2 = hk0.f20632c;
                if (!map2.containsKey(strM13622v)) {
                    hk0 hk0Var2 = new hk0();
                    hk0Var2.f20633a = context;
                    hk0Var2.f20634b = strM13622v;
                    VarHandle.storeStoreFence();
                    map2.put(strM13622v, hk0Var2);
                }
                hk0Var = (hk0) map2.get(strM13622v);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = uj0.f31901d;
        synchronized (uj0.class) {
            try {
                String str2 = hk0Var.f20634b;
                HashMap map4 = uj0.f31901d;
                if (!map4.containsKey(str2)) {
                    uj0 uj0Var2 = new uj0();
                    uj0Var2.f31903a = scheduledExecutorService;
                    uj0Var2.f31904b = hk0Var;
                    uj0Var2.f31905c = null;
                    VarHandle.storeStoreFence();
                    map4.put(str2, uj0Var2);
                }
                uj0Var = (uj0) map4.get(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uj0Var;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized wo5 m11938d(uj0 uj0Var, gk0 gk0Var) {
        wo5 wo5Var;
        try {
            sg1 sg1Var = this.f32739e;
            hg1 hg1Var = this.f32738d;
            hg1Var.m6388a();
            Object jg0Var = hg1Var.f20546b.equals("[DEFAULT]") ? this.f32741g : new jg0((byte) 6);
            ScheduledExecutorService scheduledExecutorService = this.f32737c;
            ia5 ia5Var = ia5.f21219j;
            Random random = f32733j;
            hg1 hg1Var2 = this.f32738d;
            hg1Var2.m6388a();
            ConfigFetchHttpClient configFetchHttpClientM11939e = m11939e(hg1Var2.f20547c.f31842a, gk0Var);
            HashMap map = this.f32743i;
            wo5Var = new wo5();
            wo5Var.f33566a = sg1Var;
            wo5Var.f33567b = jg0Var;
            wo5Var.f33568c = scheduledExecutorService;
            wo5Var.f33569d = ia5Var;
            wo5Var.f33570e = random;
            wo5Var.f33571f = uj0Var;
            wo5Var.f33572g = configFetchHttpClientM11939e;
            wo5Var.f33573h = gk0Var;
            wo5Var.f33574i = map;
            VarHandle.storeStoreFence();
        } catch (Throwable th) {
            throw th;
        }
        return wo5Var;
    }

    /* JADX INFO: renamed from: e */
    public final ConfigFetchHttpClient m11939e(String str, gk0 gk0Var) {
        hg1 hg1Var = this.f32738d;
        hg1Var.m6388a();
        String str2 = hg1Var.f20547c.f31843b;
        Context context = this.f32736b;
        SharedPreferences sharedPreferences = gk0Var.f19824a;
        long j = sharedPreferences.getLong("fetch_timeout_in_seconds", 60L);
        long j2 = sharedPreferences.getLong("fetch_timeout_in_seconds", 60L);
        ConfigFetchHttpClient configFetchHttpClient = new ConfigFetchHttpClient();
        configFetchHttpClient.f16312a = context;
        configFetchHttpClient.f16313b = str2;
        configFetchHttpClient.f16314c = str;
        Matcher matcher = ConfigFetchHttpClient.f16311h.matcher(str2);
        configFetchHttpClient.f16315d = matcher.matches() ? matcher.group(1) : null;
        configFetchHttpClient.f16316e = "firebase";
        configFetchHttpClient.f16317f = j;
        configFetchHttpClient.f16318g = j2;
        VarHandle.storeStoreFence();
        return configFetchHttpClient;
    }
}
