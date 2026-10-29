package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f27589d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    public static final Charset f27590e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public Context f27591a;

    /* JADX INFO: renamed from: b */
    public bi3 f27592b;

    /* JADX INFO: renamed from: c */
    public b52 f27593c;

    /* JADX INFO: renamed from: a */
    public static URL m9521a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            throw new tg1(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9522b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f27590e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", zi4.m13622v("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : zi4.m13620t(", ", str)));
    }

    /* JADX INFO: renamed from: d */
    public static long m9523d(String str) {
        y42.m12848U("Invalid Expiration Timestamp.", f27589d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: e */
    public static C0738hu m9524e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f27590e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long jM9523d = 0;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        C0552cv c0552cv = null;
        String strNextString4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        strNextString4 = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        jM9523d = m9523d(jsonReader.nextString());
                        b = (byte) (b | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    C1077qn.m9989o("Missing required properties: tokenExpirationTimestamp");
                    return null;
                }
                c0552cv = new C0552cv();
                c0552cv.f16500a = strNextString4;
                c0552cv.f16501b = jM9523d;
                c0552cv.f16502c = 0;
                VarHandle.storeStoreFence();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        C0738hu c0738hu = new C0738hu();
        c0738hu.f20856a = strNextString;
        c0738hu.f20857b = strNextString2;
        c0738hu.f20858c = strNextString3;
        c0738hu.f20859d = c0552cv;
        c0738hu.f20860e = 1;
        VarHandle.storeStoreFence();
        return c0738hu;
    }

    /* JADX INFO: renamed from: f */
    public static C0552cv m9525f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f27590e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long jM9523d = 0;
        String strNextString = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jM9523d = m9523d(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b != 1) {
            C1077qn.m9989o("Missing required properties: tokenExpirationTimestamp");
            return null;
        }
        C0552cv c0552cv = new C0552cv();
        c0552cv.f16500a = strNextString;
        c0552cv.f16501b = jM9523d;
        c0552cv.f16502c = 1;
        VarHandle.storeStoreFence();
        return c0552cv;
    }

    /* JADX INFO: renamed from: g */
    public static void m9526g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:20.0.0");
            m9528i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m9527h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:20.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m9528i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m9528i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            wb1.m12191j("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final HttpURLConnection m9529c(URL url, String str) {
        Context context = this.f27591a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            xv1 xv1Var = (xv1) this.f27592b.get();
            if (xv1Var != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) y62.m12981m(((ew0) xv1Var).m5408a()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            String strM6591p = null;
            try {
                byte[] bArrM12865n0 = y42.m12865n0(context, context.getPackageName());
                if (bArrM12865n0 == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strM6591p = i20.m6591p(bArrM12865n0);
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strM6591p);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
