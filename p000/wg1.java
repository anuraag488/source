package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 {

    /* JADX INFO: renamed from: a */
    public bg1 f33356a;

    /* JADX INFO: renamed from: b */
    public Executor f33357b;

    /* JADX INFO: renamed from: c */
    public uj0 f33358c;

    /* JADX INFO: renamed from: d */
    public uj0 f33359d;

    /* JADX INFO: renamed from: e */
    public uj0 f33360e;

    /* JADX INFO: renamed from: f */
    public wo5 f33361f;

    /* JADX INFO: renamed from: g */
    public ak0 f33362g;

    /* JADX INFO: renamed from: h */
    public nh3 f33363h;

    /* JADX INFO: renamed from: i */
    public C1283w7 f33364i;

    /* JADX INFO: renamed from: e */
    public static ArrayList m12301e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final nr6 m12302a() {
        wo5 wo5Var = this.f33361f;
        long j = ((gk0) wo5Var.f33573h).f19824a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap map = new HashMap((HashMap) wo5Var.f33574i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        nr6 nr6VarM11571b = ((uj0) wo5Var.f33571f).m11571b();
        Executor executor = (Executor) wo5Var.f33568c;
        yj0 yj0Var = new yj0();
        yj0Var.f35261b = wo5Var;
        yj0Var.f35260a = j;
        yj0Var.f35262c = map;
        VarHandle.storeStoreFence();
        nr6 nr6VarM8827k = nr6VarM11571b.m8822f(executor, yj0Var).m8827k(mg1.f24881a, new wb1((byte) 12));
        Executor executor2 = this.f33357b;
        vg1 vg1Var = new vg1();
        vg1Var.f32593a = this;
        VarHandle.storeStoreFence();
        return nr6VarM8827k.m8827k(executor2, vg1Var);
    }

    /* JADX INFO: renamed from: b */
    public final ch1 m12303b(String str) {
        String string;
        ak0 ak0Var = this.f33362g;
        wj0 wj0VarM11572c = ak0Var.f14579c.m11572c();
        String string2 = null;
        if (wj0VarM11572c == null) {
            string = null;
        } else {
            try {
                string = wj0VarM11572c.f33417b.getString(str);
            } catch (JSONException unused) {
                string = null;
            }
        }
        if (string == null) {
            wj0 wj0VarM11572c2 = ak0Var.f14580d.m11572c();
            if (wj0VarM11572c2 != null) {
                try {
                    string2 = wj0VarM11572c2.f33417b.getString(str);
                } catch (JSONException unused2) {
                }
            }
            if (string2 != null) {
                return new ch1(string2, 1);
            }
            Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
            return new ch1("", 0);
        }
        wj0 wj0VarM11572c3 = ak0Var.f14579c.m11572c();
        byte b = 2;
        if (wj0VarM11572c3 != null) {
            synchronized (ak0Var.f14577a) {
                try {
                    for (tm3 tm3Var : ak0Var.f14577a) {
                        Executor executor = ak0Var.f14578b;
                        RunnableC0612eh runnableC0612eh = new RunnableC0612eh(b);
                        runnableC0612eh.f18081b = tm3Var;
                        runnableC0612eh.f18082c = str;
                        runnableC0612eh.f18083d = wj0VarM11572c3;
                        VarHandle.storeStoreFence();
                        executor.execute(runnableC0612eh);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new ch1(string, 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m12304c(boolean z) {
        HttpURLConnection httpURLConnection;
        nh3 nh3Var = this.f33363h;
        synchronized (nh3Var) {
            ek0 ek0Var = (ek0) nh3Var.f25811c;
            synchronized (ek0Var.f18168r) {
                try {
                    ek0Var.f18155e = z;
                    rj0 rj0Var = ek0Var.f18157g;
                    if (rj0Var != null) {
                        rj0Var.f29348i = z;
                    }
                    if (z && (httpURLConnection = ek0Var.f18156f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                synchronized (nh3Var) {
                    if (!((CopyOnWriteArraySet) nh3Var.f25810b).isEmpty()) {
                        ((ek0) nh3Var.f25811c).m5143e(0L);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final nr6 m12305d(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map2.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            vj0 vj0VarM12309d = wj0.m12309d();
            vj0VarM12309d.f32659a = new JSONObject(map2);
            return this.f33360e.m11573d(vj0VarM12309d.m11901a()).m8827k(mg1.f24881a, new wb1((byte) 11));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            return y62.m12936B(null);
        }
    }
}
