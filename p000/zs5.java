package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zs5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36347a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f36348b;

    public /* synthetic */ zs5(byte b) {
        this.f36347a = b;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX INFO: renamed from: g */
    public void m13743g(pz5 pz5Var, Bundle bundle) {
        oa6 oa6Var = (oa6) ((mg6) this.f36348b).f36084a;
        try {
            try {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12504a("onActivityCreated");
                Intent intent = pz5Var.f28111f;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (TextUtils.isEmpty(string)) {
                                data = null;
                            } else {
                                data = Uri.parse(string);
                            }
                        } else {
                            data = null;
                        }
                    }
                    if (data != null && data.isHierarchical()) {
                        oa6.m9014j(oa6Var.f26517i);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        ea6 ea6Var = oa6Var.f26515g;
                        oa6.m9016l(ea6Var);
                        fe6 fe6Var = new fe6((byte) 2);
                        fe6Var.f18934d = z;
                        fe6Var.f18935e = data;
                        fe6Var.f18932b = str;
                        fe6Var.f18933c = queryParameter;
                        fe6Var.f18936f = this;
                        VarHandle.storeStoreFence();
                        ea6Var.m5033D(fe6Var);
                    }
                }
            } catch (RuntimeException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            uh6 uh6Var = oa6Var.f26520l;
            oa6.m9015k(uh6Var);
            uh6Var.m11555C(pz5Var, bundle);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m13744h(pz5 pz5Var) {
        uh6 uh6Var = ((oa6) ((mg6) this.f36348b).f36084a).f26520l;
        oa6.m9015k(uh6Var);
        synchronized (uh6Var.f31889p) {
            try {
                if (Objects.equals(uh6Var.f31884k, pz5Var)) {
                    uh6Var.f31884k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((oa6) uh6Var.f36084a).f26512d.m9229I()) {
            uh6Var.f31883j.remove(Integer.valueOf(pz5Var.f28109d));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13745i(pz5 pz5Var) {
        byte b;
        oa6 oa6Var = (oa6) ((mg6) this.f36348b).f36084a;
        uh6 uh6Var = oa6Var.f26520l;
        oa6.m9015k(uh6Var);
        synchronized (uh6Var.f31889p) {
            uh6Var.f31888o = false;
            b = 1;
            uh6Var.f31885l = true;
        }
        oa6 oa6Var2 = (oa6) uh6Var.f36084a;
        oa6Var2.f26519k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (oa6Var2.f26512d.m9229I()) {
            eh6 eh6VarM11559z = uh6Var.m11559z(pz5Var);
            uh6Var.f31881h = uh6Var.f31880g;
            uh6Var.f31880g = null;
            ea6 ea6Var = oa6Var2.f26515g;
            oa6.m9016l(ea6Var);
            um5 um5Var = new um5((byte) 2);
            um5Var.f31995b = eh6VarM11559z;
            um5Var.f31996c = jElapsedRealtime;
            um5Var.f31997d = uh6Var;
            VarHandle.storeStoreFence();
            ea6Var.m5033D(um5Var);
        } else {
            uh6Var.f31880g = null;
            ea6 ea6Var2 = oa6Var2.f26515g;
            oa6.m9016l(ea6Var2);
            cv5 cv5Var = new cv5(b);
            cv5Var.f16518b = jElapsedRealtime;
            cv5Var.f16519c = uh6Var;
            VarHandle.storeStoreFence();
            ea6Var2.m5033D(cv5Var);
        }
        vk6 vk6Var = oa6Var.f26516h;
        oa6.m9015k(vk6Var);
        oa6 oa6Var3 = (oa6) vk6Var.f36084a;
        oa6Var3.f26519k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ea6 ea6Var3 = oa6Var3.f26515g;
        oa6.m9016l(ea6Var3);
        ak6 ak6Var = new ak6(b);
        ak6Var.f14602b = jElapsedRealtime2;
        ak6Var.f14603c = vk6Var;
        VarHandle.storeStoreFence();
        ea6Var3.m5033D(ak6Var);
    }

    /* JADX INFO: renamed from: j */
    public void m13746j(pz5 pz5Var) {
        oa6 oa6Var = (oa6) ((mg6) this.f36348b).f36084a;
        vk6 vk6Var = oa6Var.f26516h;
        oa6.m9015k(vk6Var);
        oa6 oa6Var2 = (oa6) vk6Var.f36084a;
        oa6Var2.f26519k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ea6 ea6Var = oa6Var2.f26515g;
        oa6.m9016l(ea6Var);
        byte b = 0;
        ak6 ak6Var = new ak6(b);
        ak6Var.f14602b = jElapsedRealtime;
        ak6Var.f14603c = vk6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ak6Var);
        uh6 uh6Var = oa6Var.f26520l;
        oa6.m9015k(uh6Var);
        Object obj = uh6Var.f31889p;
        synchronized (obj) {
            byte b2 = 1;
            uh6Var.f31888o = true;
            if (!Objects.equals(pz5Var, uh6Var.f31884k)) {
                synchronized (obj) {
                    uh6Var.f31884k = pz5Var;
                    uh6Var.f31885l = false;
                    oa6 oa6Var3 = (oa6) uh6Var.f36084a;
                    if (oa6Var3.f26512d.m9229I()) {
                        uh6Var.f31886m = null;
                        ea6 ea6Var2 = oa6Var3.f26515g;
                        oa6.m9016l(ea6Var2);
                        kh6 kh6Var = new kh6(b2);
                        kh6Var.f23133b = uh6Var;
                        VarHandle.storeStoreFence();
                        ea6Var2.m5033D(kh6Var);
                    }
                }
            }
        }
        oa6 oa6Var4 = (oa6) uh6Var.f36084a;
        if (!oa6Var4.f26512d.m9229I()) {
            uh6Var.f31880g = uh6Var.f31886m;
            ea6 ea6Var3 = oa6Var4.f26515g;
            oa6.m9016l(ea6Var3);
            kh6 kh6Var2 = new kh6(b);
            kh6Var2.f23133b = uh6Var;
            VarHandle.storeStoreFence();
            ea6Var3.m5033D(kh6Var2);
            return;
        }
        uh6Var.m11556D(pz5Var.f28110e, uh6Var.m11559z(pz5Var), false);
        ly5 ly5Var = ((oa6) uh6Var.f36084a).f26522n;
        oa6.m9013i(ly5Var);
        oa6 oa6Var5 = (oa6) ly5Var.f36084a;
        oa6Var5.f26519k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ea6 ea6Var4 = oa6Var5.f26515g;
        oa6.m9016l(ea6Var4);
        cv5 cv5Var = new cv5(b);
        cv5Var.f16518b = jElapsedRealtime2;
        cv5Var.f16519c = ly5Var;
        VarHandle.storeStoreFence();
        ea6Var4.m5033D(cv5Var);
    }

    /* JADX INFO: renamed from: k */
    public void m13747k(pz5 pz5Var, Bundle bundle) {
        eh6 eh6Var;
        uh6 uh6Var = ((oa6) ((mg6) this.f36348b).f36084a).f26520l;
        oa6.m9015k(uh6Var);
        if (!((oa6) uh6Var.f36084a).f26512d.m9229I() || bundle == null || (eh6Var = (eh6) uh6Var.f31883j.get(Integer.valueOf(pz5Var.f28109d))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", eh6Var.f18107c);
        bundle2.putString("name", eh6Var.f18105a);
        bundle2.putString("referrer_name", eh6Var.f18106b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2;
        HashMap map;
        switch (this.f36347a) {
            case 0:
                gt5 gt5Var = (gt5) this.f36348b;
                if (bundle != null && (bundle2 = bundle.getBundle("hsdp_session_state")) != null) {
                    Log.i("HsdpLifecycleManager", "Restoring HSDP session state from bundle for ".concat(activity.getClass().getName()));
                    wx1 wx1Var = (wx1) gt5Var.f20117b.get(bundle2.getString("session_id"));
                    String string = bundle2.getString("session_id");
                    String str = string == null ? "" : string;
                    String string2 = bundle2.getString("target_package");
                    String str2 = string2 == null ? "" : string2;
                    String string3 = bundle2.getString("referrer");
                    String str3 = string3 == null ? "" : string3;
                    boolean z = bundle2.getBoolean("auto_trigger");
                    long j = bundle2.getLong("request_timestamp_ms", 0L);
                    int i = bundle2.getInt("last_width");
                    int i2 = bundle2.getInt("last_height");
                    byte[] byteArray = bundle2.getByteArray("config_proto_bytes");
                    Bundle bundle3 = bundle2.getBundle("extra_query_params");
                    if (bundle3 != null) {
                        map = new HashMap();
                        for (String str4 : bundle3.keySet()) {
                            String string4 = bundle3.getString(str4);
                            Bundle bundle4 = bundle3;
                            map.put(str4, string4 == null ? "" : string4);
                            bundle3 = bundle4;
                        }
                    } else {
                        map = null;
                    }
                    ct5 ct5Var = new ct5(str2, str3, wx1Var, map, z, j, i, i2, byteArray, str);
                    ct5Var.f16474i = true;
                    gt5Var.f20116a.put(activity, ct5Var);
                }
                break;
            case 1:
                ((x36) this.f36348b).m12478c(new h06(this, bundle, activity));
                break;
            default:
                m13743g(pz5.m9692a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f36347a) {
            case 0:
                gt5 gt5Var = (gt5) this.f36348b;
                ct5 ct5Var = (ct5) gt5Var.f20116a.remove(activity);
                if (ct5Var != null) {
                    if (activity.isChangingConfigurations()) {
                        Log.i("HsdpLifecycleManager", "Activity is destroying due to config change, keeping listener.");
                    } else {
                        Log.i("HsdpLifecycleManager", "Activity is destroying permanently, removing listener.");
                        gt5Var.f20117b.remove(ct5Var.f16466a);
                    }
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) gt5Var.f20118c.remove(activity);
                if (componentCallbacks != null) {
                    activity.unregisterComponentCallbacks(componentCallbacks);
                }
                break;
            case 1:
                ((x36) this.f36348b).m12478c(new t26(this, activity, (byte) 4));
                break;
            default:
                m13744h(pz5.m9692a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f36347a) {
            case 0:
                break;
            case 1:
                ((x36) this.f36348b).m12478c(new t26(this, activity, (byte) 2));
                break;
            default:
                m13745i(pz5.m9692a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f36347a) {
            case 0:
                break;
            case 1:
                ((x36) this.f36348b).m12478c(new t26(this, activity, (byte) 1));
                break;
            default:
                m13746j(pz5.m9692a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f36347a) {
            case 0:
                ct5 ct5Var = (ct5) ((gt5) this.f36348b).f20116a.get(activity);
                if (ct5Var != null) {
                    Log.i("HsdpLifecycleManager", "Saving HSDP session state to bundle for ".concat(activity.getClass().getName()));
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("session_id", ct5Var.f16466a);
                    bundle2.putString("target_package", ct5Var.f16467b);
                    bundle2.putString("referrer", ct5Var.f16468c);
                    bundle2.putBoolean("auto_trigger", ct5Var.f16471f);
                    bundle2.putLong("request_timestamp_ms", ct5Var.f16472g);
                    bundle2.putInt("last_width", ct5Var.f16475j);
                    bundle2.putInt("last_height", ct5Var.f16476k);
                    byte[] bArr = ct5Var.f16473h;
                    if (bArr != null) {
                        bundle2.putByteArray("config_proto_bytes", bArr);
                    }
                    Map map = ct5Var.f16470e;
                    if (map != null) {
                        Bundle bundle3 = new Bundle();
                        for (Map.Entry entry : map.entrySet()) {
                            bundle3.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        bundle2.putBundle("extra_query_params", bundle3);
                    }
                    bundle.putBundle("hsdp_session_state", bundle2);
                }
                break;
            case 1:
                zw5 zw5Var = new zw5();
                ((x36) this.f36348b).m12478c(new h06(this, activity, zw5Var));
                Bundle bundleM13832F = zw5Var.m13832F(50L);
                if (bundleM13832F != null) {
                    bundle.putAll(bundleM13832F);
                }
                break;
            default:
                m13747k(pz5.m9692a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f36347a) {
            case 1:
                ((x36) this.f36348b).m12478c(new t26(this, activity, (byte) 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f36347a) {
            case 1:
                ((x36) this.f36348b).m12478c(new t26(this, activity, (byte) 3));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m13737a(Activity activity) {
    }

    /* JADX INFO: renamed from: b */
    private final void m13738b(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    private final void m13739c(Activity activity) {
    }

    /* JADX INFO: renamed from: d */
    private final void m13740d(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    private final void m13741e(Activity activity) {
    }

    /* JADX INFO: renamed from: f */
    private final void m13742f(Activity activity) {
    }
}
