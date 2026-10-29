package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bh1;
import p000.i20;
import p000.vj0;
import p000.wj0;
import p000.xg1;
import p000.y42;
import p000.yg1;
import p000.zj0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h */
    public static final Pattern f16311h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a */
    public Context f16312a;

    /* JADX INFO: renamed from: b */
    public String f16313b;

    /* JADX INFO: renamed from: c */
    public String f16314c;

    /* JADX INFO: renamed from: d */
    public String f16315d;

    /* JADX INFO: renamed from: e */
    public String f16316e;

    /* JADX INFO: renamed from: f */
    public long f16317f;

    /* JADX INFO: renamed from: g */
    public long f16318g;

    /* JADX INFO: renamed from: c */
    public static JSONObject m4079c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4080d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m4081a(String str, String str2, Map map, Long l, Map map2) throws xg1 {
        Context context = this.f16312a;
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new xg1("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f16313b);
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(packageInfo.getLongVersionCode()));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "24.0.1");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection m4082b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f16315d + "/namespaces/" + this.f16316e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new yg1(e.getMessage());
        }
    }

    public zj0 fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) {
        String strM6591p;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z;
        httpURLConnection.setDoOutput(true);
        long j = this.f16317f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f16318g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f16314c);
        Context context = this.f16312a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrM12865n0 = y42.m12865n0(context, context.getPackageName());
            if (bArrM12865n0 == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strM6591p = null;
            } else {
                strM6591p = i20.m6591p(bArrM12865n0);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strM6591p);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                m4080d(httpURLConnection, m4081a(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    bh1 bh1Var = new bh1(httpURLConnection.getResponseMessage());
                    bh1Var.f15266a = responseCode;
                    throw bh1Var;
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectM4079c = m4079c(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                try {
                    vj0 vj0VarM12309d = wj0.m12309d();
                    vj0VarM12309d.f32660b = date;
                    try {
                        jSONObject = jSONObjectM4079c.getJSONObject("entries");
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            vj0VarM12309d.f32659a = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused3) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectM4079c.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused4) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            vj0VarM12309d.f32661c = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused5) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectM4079c.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused6) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            vj0VarM12309d.f32662d = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused7) {
                        }
                    }
                    String string = jSONObjectM4079c.has("templateVersion") ? jSONObjectM4079c.getString("templateVersion") : null;
                    if (string != null) {
                        vj0VarM12309d.f32663e = Long.parseLong(string);
                    }
                    try {
                        jSONArray2 = jSONObjectM4079c.getJSONArray("rolloutMetadata");
                    } catch (JSONException unused8) {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null) {
                        try {
                            vj0VarM12309d.f32664f = new JSONArray(jSONArray2.toString());
                        } catch (JSONException unused9) {
                        }
                    }
                    wj0 wj0VarM11901a = vj0VarM12309d.m11901a();
                    try {
                        z = !jSONObjectM4079c.get("state").equals("NO_CHANGE");
                    } catch (JSONException unused10) {
                        z = true;
                    }
                    return !z ? new zj0(1, wj0VarM11901a, null) : new zj0(0, wj0VarM11901a, headerField);
                } catch (JSONException e2) {
                    throw new xg1("Fetch failed: fetch response could not be parsed.", e2);
                }
            } catch (IOException | JSONException e3) {
                throw new xg1("The client had an error while calling the backend!", e3);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused11) {
            }
            throw th;
        }
    }
}
