package p000;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rj0 {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArraySet f29340a;

    /* JADX INFO: renamed from: b */
    public HttpURLConnection f29341b;

    /* JADX INFO: renamed from: c */
    public wo5 f29342c;

    /* JADX INFO: renamed from: d */
    public uj0 f29343d;

    /* JADX INFO: renamed from: e */
    public dk0 f29344e;

    /* JADX INFO: renamed from: f */
    public ScheduledExecutorService f29345f;

    /* JADX INFO: renamed from: g */
    public Random f29346g;

    /* JADX INFO: renamed from: h */
    public gk0 f29347h;

    /* JADX INFO: renamed from: i */
    public boolean f29348i;

    /* JADX INFO: renamed from: a */
    public final void m10339a(int i, long j) {
        if (i == 0) {
            new bh1("Unable to fetch the latest version of the template.");
            m10342d();
            return;
        }
        int iNextInt = this.f29346g.nextInt(4);
        ScheduledExecutorService scheduledExecutorService = this.f29345f;
        qj0 qj0Var = new qj0();
        qj0Var.f28521c = this;
        qj0Var.f28519a = i;
        qj0Var.f28520b = j;
        VarHandle.storeStoreFence();
        scheduledExecutorService.schedule(qj0Var, iNextInt, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m10340b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                strConcat = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strConcat.substring(iIndexOf, iLastIndexOf + 1);
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            dk0 dk0Var = this.f29344e;
                            new bh1("The server is temporarily unavailable. Try again in a few minutes.");
                            dk0Var.m4518a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f29340a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = ((gk0) this.f29342c.f33573h).f19824a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                m10339a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            m10343e(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = "";
                    } catch (JSONException e) {
                        new xg1("Unable to parse config update message.", e.getCause());
                        m10342d();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m10341c() {
        HttpURLConnection httpURLConnection = this.f29341b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    m10340b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    if (!this.f29348i) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m10342d() {
        Iterator it = this.f29340a.iterator();
        while (it.hasNext()) {
            ((dk0) it.next()).m4518a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m10343e(int i) {
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        gk0 gk0Var = this.f29347h;
        synchronized (gk0Var.f19827d) {
            gk0Var.f19824a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
