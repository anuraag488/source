package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.common.api.Status;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class pq3 implements InterfaceC1052pz, nz5, zq1, dr6, dd6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27895a;

    /* JADX INFO: renamed from: b */
    public Object f27896b;

    /* JADX INFO: renamed from: c */
    public Object f27897c;

    public pq3(Context context, re6 re6Var) {
        this.f27895a = (byte) 13;
        li0 li0Var = new li0((byte) 7);
        try {
            mp4.m8367b(context);
            li0Var.f24044c = mp4.m8366a().m8368c(v50.f32411e).m8072a("PLAY_BILLING_LIBRARY", j81.m7046a("proto"), new aj5((byte) 15));
        } catch (Throwable unused) {
            li0Var.f24043b = true;
        }
        this.f27897c = li0Var;
        this.f27896b = re6Var;
    }

    /* JADX INFO: renamed from: A */
    public void m9601A(kg6 kg6Var) {
        try {
            li0 li0Var = (li0) this.f27897c;
            mf6 mf6VarM8705s = nf6.m8705s();
            mf6VarM8705s.m8296c((re6) this.f27896b);
            mf6VarM8705s.m8971b();
            nf6.m8703q((nf6) mf6VarM8705s.f26373b, kg6Var);
            li0Var.m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m9602B(qg6 qg6Var) {
        if (qg6Var == null) {
            return;
        }
        try {
            mf6 mf6VarM8705s = nf6.m8705s();
            mf6VarM8705s.m8296c((re6) this.f27896b);
            mf6VarM8705s.m8971b();
            nf6.m8704r((nf6) mf6VarM8705s.f26373b, qg6Var);
            ((li0) this.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9603C(yc6 yc6Var, re6 re6Var) {
        if (yc6Var == null) {
            return;
        }
        try {
            mf6 mf6VarM8705s = nf6.m8705s();
            mf6VarM8705s.m8296c(re6Var);
            mf6VarM8705s.m8971b();
            nf6.m8706t((nf6) mf6VarM8705s.f26373b, yc6Var);
            ((li0) this.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m9604D(fd6 fd6Var, re6 re6Var) {
        if (fd6Var == null) {
            return;
        }
        try {
            mf6 mf6VarM8705s = nf6.m8705s();
            mf6VarM8705s.m8296c(re6Var);
            mf6VarM8705s.m8971b();
            nf6.m8707u((nf6) mf6VarM8705s.f26373b, fd6Var);
            ((li0) this.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // p000.InterfaceC1052pz
    /* JADX INFO: renamed from: a */
    public void mo7233a(f00 f00Var) {
        qv5.m10139g("BillingClient", "Reconnection finished with result: " + f00Var.f18622a);
        try {
            ((dm6) this.f27896b).m4562a(f00Var);
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Exception setting completer.", th);
        }
        C0927mz c0927mz = (C0927mz) this.f27897c;
        if (c0927mz.f25309B != null) {
            oz5 oz5Var = new oz5((byte) 13);
            oz5Var.f27249b = this;
            oz5Var.f27250c = f00Var;
            VarHandle.storeStoreFence();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                oz5Var.run();
            } else {
                c0927mz.f25317e.post(oz5Var);
            }
        }
    }

    @Override // p000.InterfaceC1052pz
    /* JADX INFO: renamed from: b */
    public void mo7234b() {
        qv5.m10139g("BillingClient", "Reconnection attempt failed.");
        try {
            ((dm6) this.f27896b).m4562a(rz5.f29767j);
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Exception setting completer.", th);
        }
        C0927mz c0927mz = (C0927mz) this.f27897c;
        if (c0927mz.f25309B != null) {
            RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 17);
            runnableC1029pc.f27515b = this;
            VarHandle.storeStoreFence();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC1029pc.run();
            } else {
                c0927mz.f25317e.post(runnableC1029pc);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m9605c(e25 e25Var) {
        boolean zContainsKey;
        synchronized (this.f27897c) {
            zContainsKey = ((ys0) this.f27896b).f35491a.containsKey(e25Var);
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: d */
    public C1232uu m9606d(wj0 wj0Var) throws xg1 {
        String string;
        JSONArray jSONArray = wj0Var.f33422g;
        long j = wj0Var.f33421f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                wj0 wj0VarM11572c = ((uj0) this.f27896b).m11572c();
                String string3 = null;
                if (wj0VarM11572c == null) {
                    string = null;
                } else {
                    try {
                        string = wj0VarM11572c.f33417b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    wj0 wj0VarM11572c2 = ((uj0) this.f27897c).m11572c();
                    if (wj0VarM11572c2 != null) {
                        try {
                            string3 = wj0VarM11572c2.f33417b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = mq3.f25138a;
                C1121ru c1121ru = new C1121ru();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                c1121ru.f29619a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                c1121ru.f29620b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                c1121ru.f29621c = strOptString;
                c1121ru.f29622d = string;
                c1121ru.f29623e = j;
                c1121ru.f29624f = (byte) (c1121ru.f29624f | 1);
                hashSet.add(c1121ru.m10428a());
            } catch (JSONException e) {
                throw new xg1("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        C1232uu c1232uu = new C1232uu();
        c1232uu.f32169a = hashSet;
        VarHandle.storeStoreFence();
        return c1232uu;
    }

    /* JADX INFO: renamed from: e */
    public void m9607e() {
        ((zu3) this.f27896b).m13795a();
    }

    /* JADX INFO: renamed from: f */
    public void m9608f(Bundle bundle) {
        zu3 zu3Var = (zu3) this.f27896b;
        av3 av3Var = zu3Var.f36384a;
        if (!zu3Var.f36388e) {
            zu3Var.m13795a();
        }
        if (av3Var.getLifecycle().mo6016b().m5728a(fk2.f19057d)) {
            xd2.m12669p(av3Var.getLifecycle().mo6016b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (zu3Var.f36390g) {
            C1077qn.m9989o("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM10081F = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM10081F = qs5.m10081F("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        zu3Var.f36389f = bundleM10081F;
        zu3Var.f36390g = true;
    }

    /* JADX INFO: renamed from: g */
    public void m9609g(Bundle bundle) {
        zu3 zu3Var = (zu3) this.f27896b;
        Bundle bundleM7742x = kx5.m7742x((l73[]) Arrays.copyOf(new l73[0], 0));
        Bundle bundle2 = zu3Var.f36389f;
        if (bundle2 != null) {
            bundleM7742x.putAll(bundle2);
        }
        synchronized (zu3Var.f36386c) {
            for (Map.Entry entry : zu3Var.f36387d.entrySet()) {
                bundleM7742x.putBundle((String) entry.getKey(), ((xu3) entry.getValue()).mo6427a());
            }
        }
        if (bundleM7742x.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM7742x);
    }

    /* JADX INFO: renamed from: h */
    public qb4 m9610h(e25 e25Var) {
        qb4 qb4VarM13232b;
        synchronized (this.f27897c) {
            qb4VarM13232b = ((ys0) this.f27896b).m13232b(e25Var);
        }
        return qb4VarM13232b;
    }

    /* JADX INFO: renamed from: i */
    public void mo9611i(boolean z) {
        Window window = (Window) this.f27897c;
        if (window != null) {
            if (!z) {
                m9617p(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f27896b;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public Object mo4146j() {
        Application application = (Application) ((C1392z4) this.f27896b).f35744a;
        up5 up5Var = (up5) ((cr6) this.f27897c).mo4146j();
        uf6 uf6Var = new uf6();
        uf6Var.f31831a = up5Var;
        uf6Var.f31832b = application.getApplicationContext();
        VarHandle.storeStoreFence();
        return uf6Var;
    }

    /* JADX INFO: renamed from: k */
    public void mo9612k(boolean z) {
        Window window = (Window) this.f27897c;
        if (window != null) {
            if (!z) {
                m9617p(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f27896b;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo9613l(int i) {
        Window window = (Window) this.f27897c;
        if (window == null) {
            ((WindowInsetsController) this.f27896b).setSystemBarsBehavior(i);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            m9617p(6144);
            return;
        }
        if (i == 1) {
            m9617p(4096);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
        } else {
            if (i != 2) {
                return;
            }
            m9617p(2048);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m9614m(qb4 qb4Var, h50 h50Var) {
        j25 j25Var = (j25) this.f27897c;
        RunnableC0612eh runnableC0612eh = new RunnableC0612eh((byte) 5);
        runnableC0612eh.f18081b = this;
        runnableC0612eh.f18082c = qb4Var;
        runnableC0612eh.f18083d = h50Var;
        VarHandle.storeStoreFence();
        j25Var.f21972a.execute(runnableC0612eh);
    }

    /* JADX INFO: renamed from: n */
    public void m9615n(qb4 qb4Var, int i) {
        j25 j25Var = (j25) this.f27897c;
        j25Var.f21972a.execute(new rc4((jg3) this.f27896b, qb4Var, false, i));
    }

    /* JADX INFO: renamed from: o */
    public qb4 m9616o(e25 e25Var) {
        qb4 qb4VarM13234d;
        synchronized (this.f27897c) {
            qb4VarM13234d = ((ys0) this.f27896b).m13234d(e25Var);
        }
        return qb4VarM13234d;
    }

    @Override // p000.zq1
    public void onFailure(Throwable th) {
        cl6 cl6Var = (cl6) this.f27896b;
        mg6 mg6Var = (mg6) this.f27897c;
        mg6Var.mo5038t();
        boolean z = false;
        mg6Var.f24904m = false;
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        op5 op5Var = oa6Var.f26512d;
        d76 d76Var = oa6Var.f26514f;
        int i = 2;
        byte b = 1;
        if (op5Var.m9225E(null, e56.f17756T0)) {
            String message = th.getMessage();
            mg6Var.f24888L = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        mg6Var.f24888L = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12506c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", d76.m4401y(oa6Var.m9029p().m4936A()), d76.m4401y(th.toString()));
            mg6Var.f24905n = 1;
            mg6Var.m8318U().add(cl6Var);
            return;
        }
        if (i2 != 1) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", d76.m4401y(oa6Var.m9029p().m4936A()), th);
            m9619r();
            mg6Var.f24905n = 1;
            mg6Var.m8319W();
            return;
        }
        mg6Var.m8318U().add(cl6Var);
        if (mg6Var.f24905n > ((Integer) e56.f17824w0.m4379a(null)).intValue()) {
            mg6Var.f24905n = 1;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12506c("registerTriggerAsync failed. May try later. App ID, throwable", d76.m4401y(oa6Var.m9029p().m4936A()), d76.m4401y(th.toString()));
            return;
        }
        oa6.m9016l(d76Var);
        d76Var.f16838m.m12507d("registerTriggerAsync failed. App ID, delay in seconds, throwable", d76.m4401y(oa6Var.m9029p().m4936A()), d76.m4401y(String.valueOf(mg6Var.f24905n)), d76.m4401y(th.toString()));
        int i3 = mg6Var.f24905n;
        nd6 nd6Var = mg6Var.f24906o;
        if (nd6Var == null) {
            nd6Var = new nd6(mg6Var, oa6Var, b, z);
            mg6Var.f24906o = nd6Var;
        }
        nd6Var.m6923b(((long) i3) * 1000);
        int i4 = mg6Var.f24905n;
        mg6Var.f24905n = i4 + i4;
    }

    @Override // p000.zq1
    public void onSuccess(Object obj) {
        mg6 mg6Var = (mg6) this.f27897c;
        mg6Var.mo5038t();
        m9619r();
        mg6Var.f24904m = false;
        mg6Var.f24905n = 1;
        d76 d76Var = ((oa6) mg6Var.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12505b(((cl6) this.f27896b).f16114d, "Successfully registered trigger URI");
        mg6Var.m8319W();
    }

    /* JADX INFO: renamed from: p */
    public void m9617p(int i) {
        View decorView = ((Window) this.f27897c).getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: q */
    public void m9618q(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f27896b)) {
            map = new HashMap((Map) this.f27896b);
        }
        synchronized (((Map) this.f27897c)) {
            map2 = new HashMap((Map) this.f27897c);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                xy4.m12778e();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((li4) entry2.getKey()).m7989b(new C1334xk(status));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m9619r() {
        oa6 oa6Var = (oa6) ((mg6) this.f27897c).f36084a;
        s86 s86Var = oa6Var.f26513e;
        oa6.m9014j(s86Var);
        SparseArray sparseArrayM10555A = s86Var.m10555A();
        cl6 cl6Var = (cl6) this.f27896b;
        sparseArrayM10555A.put(cl6Var.f16116f, Long.valueOf(cl6Var.f16115e));
        s86 s86Var2 = oa6Var.f26513e;
        oa6.m9014j(s86Var2);
        int[] iArr = new int[sparseArrayM10555A.size()];
        long[] jArr = new long[sparseArrayM10555A.size()];
        for (int i = 0; i < sparseArrayM10555A.size(); i++) {
            iArr[i] = sparseArrayM10555A.keyAt(i);
            jArr[i] = ((Long) sparseArrayM10555A.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        s86Var2.f29973L.m10195f(bundle);
    }

    /* JADX INFO: renamed from: s */
    public void m9620s(yc6 yc6Var) {
        try {
            m9603C(yc6Var, (re6) this.f27896b);
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: t */
    public wd3 m9621t() {
        hu5 hu5Var = (hu5) this.f27897c;
        if (hu5Var == null) {
            C1077qn.m9989o(String.valueOf(hu5.class.getCanonicalName()).concat(" must be set"));
            return null;
        }
        wo5 wo5Var = (wo5) this.f27896b;
        C1392z4 c1392z4 = (C1392z4) wo5Var.f33567b;
        wd3 wd3Var = new wd3((byte) 29);
        rr5 rr5Var = new rr5((byte) 3);
        rr5Var.f29555b = c1392z4;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a = cr6.m4145a(rr5Var);
        C1392z4 c1392z5 = new C1392z4();
        c1392z5.f35744a = hu5Var;
        VarHandle.storeStoreFence();
        rr5 rr5Var2 = new rr5((byte) 18);
        wd3Var.f33259b = rr5Var2;
        cr6 cr6Var = (cr6) wo5Var.f33571f;
        hq5 hq5Var = (hq5) wo5Var.f33574i;
        cr6 cr6Var2 = (cr6) wo5Var.f33568c;
        C0602e8 c0602e8 = new C0602e8();
        c0602e8.f17867a = c1392z4;
        c0602e8.f17868b = cr6VarM4145a;
        c0602e8.f17869c = cr6Var;
        c0602e8.f17870d = hq5Var;
        c0602e8.f17871e = rr5Var2;
        c0602e8.f17872f = cr6Var2;
        VarHandle.storeStoreFence();
        yg3 yg3Var = new yg3((byte) 16);
        yg3Var.f35215b = cr6VarM4145a;
        yg3Var.f35216c = c0602e8;
        VarHandle.storeStoreFence();
        cr6 cr6Var3 = (cr6) wo5Var.f33569d;
        cr6 cr6Var4 = (cr6) wo5Var.f33572g;
        lg0 lg0Var = new lg0();
        lg0Var.f24016a = c1392z4;
        lg0Var.f24017b = cr6Var3;
        lg0Var.f24018c = cr6VarM4145a;
        lg0Var.f24019d = cr6Var2;
        lg0Var.f24020e = c1392z5;
        lg0Var.f24021f = yg3Var;
        lg0Var.f24022g = cr6Var4;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a2 = cr6.m4145a(lg0Var);
        if (((cr6) rr5Var2.f29555b) != null) {
            xy4.m12787p();
            return null;
        }
        rr5Var2.f29555b = cr6VarM4145a2;
        VarHandle.storeStoreFence();
        return wd3Var;
    }

    public String toString() {
        switch (this.f27895a) {
            case 10:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f27896b);
                sb.append('{');
                yg3 yg3Var = (yg3) ((yg3) this.f27897c).f35216c;
                String str = "";
                while (yg3Var != null) {
                    Object obj = yg3Var.f35215b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    yg3Var = (yg3) yg3Var.f35216c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m9622u(yc6 yc6Var, int i, long j) {
        try {
            pe6 pe6Var = (pe6) ((re6) this.f27896b).m10543l();
            pe6Var.m8971b();
            re6.m10313D((re6) pe6Var.f26373b, i);
            re6 re6Var = (re6) pe6Var.m8970a();
            this.f27896b = re6Var;
            if (j != 0) {
                pe6 pe6Var2 = (pe6) re6Var.m10543l();
                pe6Var2.m9505e(j);
                re6Var = (re6) pe6Var2.m8970a();
            }
            m9603C(yc6Var, re6Var);
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9623v(yc6 yc6Var, long j, boolean z) {
        try {
            uc6 uc6Var = (uc6) yc6Var.m10543l();
            af6 af6Var = (af6) yc6Var.m13096v().m10543l();
            af6Var.m8971b();
            if6.m6793r((if6) af6Var.f26373b, z);
            uc6Var.m8971b();
            yc6.m13089q((yc6) uc6Var.f26373b, (if6) af6Var.m8970a());
            yc6 yc6Var2 = (yc6) uc6Var.m8970a();
            re6 re6Var = (re6) this.f27896b;
            if (j != 0) {
                pe6 pe6Var = (pe6) re6Var.m10543l();
                pe6Var.m9505e(j);
                re6Var = (re6) pe6Var.m8970a();
            }
            m9603C(yc6Var2, re6Var);
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m9624w(yc6 yc6Var, int i, long j, boolean z) {
        try {
            pe6 pe6Var = (pe6) ((re6) this.f27896b).m10543l();
            pe6Var.m8971b();
            re6.m10313D((re6) pe6Var.f26373b, i);
            this.f27896b = (re6) pe6Var.m8970a();
            uc6 uc6Var = (uc6) yc6Var.m10543l();
            af6 af6Var = (af6) yc6Var.m13096v().m10543l();
            af6Var.m8971b();
            if6.m6793r((if6) af6Var.f26373b, z);
            uc6Var.m8971b();
            yc6.m13089q((yc6) uc6Var.f26373b, (if6) af6Var.m8970a());
            yc6 yc6Var2 = (yc6) uc6Var.m8970a();
            re6 re6Var = (re6) this.f27896b;
            if (j != 0) {
                pe6 pe6Var2 = (pe6) re6Var.m10543l();
                pe6Var2.m9505e(j);
                re6Var = (re6) pe6Var2.m8970a();
            }
            m9603C(yc6Var2, re6Var);
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m9625x(sd6 sd6Var) {
        try {
            mf6 mf6VarM8705s = nf6.m8705s();
            mf6VarM8705s.m8296c((re6) this.f27896b);
            mf6VarM8705s.m8971b();
            nf6.m8708v((nf6) mf6VarM8705s.f26373b, sd6Var);
            ((li0) this.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m9626y(f00 f00Var, long j) {
        try {
            ie6 ie6VarM8693q = ne6.m8693q();
            ie6VarM8693q.m8971b();
            ne6.m8698v((ne6) ie6VarM8693q.f26373b, 4);
            xd6 xd6Var = xd6.f34179f;
            ie6VarM8693q.m8971b();
            ne6.m8694r((ne6) ie6VarM8693q.f26373b, xd6Var);
            if (f00Var != null) {
                id6 id6VarM9048r = od6.m9048r();
                int i = f00Var.f18622a;
                id6VarM9048r.m8971b();
                od6.m9047q((od6) id6VarM9048r.f26373b, i);
                String str = f00Var.f18624c;
                id6VarM9048r.m8971b();
                od6.m9050t((od6) id6VarM9048r.f26373b, str);
                ie6VarM8693q.m8971b();
                ne6.m8695s((ne6) ie6VarM8693q.f26373b, (od6) id6VarM9048r.m8970a());
            }
            mf6 mf6VarM8705s = nf6.m8705s();
            re6 re6Var = (re6) this.f27896b;
            if (j != 0) {
                pe6 pe6Var = (pe6) re6Var.m10543l();
                pe6Var.m9505e(j);
                re6Var = (re6) pe6Var.m8970a();
            }
            mf6VarM8705s.m8296c(re6Var);
            mf6VarM8705s.m8971b();
            nf6.m8709w((nf6) mf6VarM8705s.f26373b, (ne6) ie6VarM8693q.m8970a());
            ((li0) this.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m9627z(eg6 eg6Var) {
        try {
            mf6 mf6VarM8705s = nf6.m8705s();
            mf6VarM8705s.m8296c((re6) this.f27896b);
            ie6 ie6VarM8693q = ne6.m8693q();
            ie6VarM8693q.m8971b();
            ne6.m8696t((ne6) ie6VarM8693q.f26373b);
            ie6VarM8693q.m8971b();
            ne6.m8698v((ne6) ie6VarM8693q.f26373b, 2);
            ie6VarM8693q.m8971b();
            ne6.m8697u((ne6) ie6VarM8693q.f26373b, eg6Var);
            mf6VarM8705s.m8971b();
            nf6.m8709w((nf6) mf6VarM8705s.f26373b, (ne6) ie6VarM8693q.m8970a());
            ((li0) this.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to log.", th);
        }
    }

    public pq3(f00 f00Var, ArrayList arrayList) {
        this.f27895a = (byte) 14;
        this.f27896b = arrayList;
        this.f27897c = f00Var;
    }

    public /* synthetic */ pq3(byte b) {
        this.f27895a = b;
    }

    public pq3(jg3 jg3Var, j25 j25Var) {
        this.f27895a = (byte) 7;
        this.f27896b = jg3Var;
        this.f27897c = j25Var;
    }

    public pq3(Window window, w42 w42Var) {
        this.f27895a = (byte) 6;
        this.f27896b = window.getInsetsController();
        this.f27897c = window;
    }
}
