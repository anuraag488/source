package p000;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gk0 {

    /* JADX INFO: renamed from: e */
    public static final Date f19822e = new Date(-1);

    /* JADX INFO: renamed from: f */
    public static final Date f19823f = new Date(-1);

    /* JADX INFO: renamed from: a */
    public SharedPreferences f19824a;

    /* JADX INFO: renamed from: b */
    public Object f19825b;

    /* JADX INFO: renamed from: c */
    public Object f19826c;

    /* JADX INFO: renamed from: d */
    public Object f19827d;

    /* JADX INFO: renamed from: a */
    public final fk0 m6010a() {
        fk0 fk0Var;
        synchronized (this.f19826c) {
            int i = this.f19824a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f19824a.getLong("backoff_end_time_in_millis", -1L));
            fk0Var = new fk0();
            fk0Var.f19051a = i;
            fk0Var.f19052b = date;
        }
        return fk0Var;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m6011b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f19824a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: c */
    public final fk0 m6012c() {
        fk0 fk0Var;
        synchronized (this.f19827d) {
            int i = this.f19824a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f19824a.getLong("realtime_backoff_end_time_in_millis", -1L));
            fk0Var = new fk0();
            fk0Var.f19051a = i;
            fk0Var.f19052b = date;
        }
        return fk0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m6013d(int i, Date date) {
        synchronized (this.f19826c) {
            this.f19824a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6014e(int i, Date date) {
        synchronized (this.f19827d) {
            this.f19824a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
