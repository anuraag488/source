package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ek0 {

    /* JADX INFO: renamed from: s */
    public static final int[] f18149s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: t */
    public static final Pattern f18150t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArraySet f18151a;

    /* JADX INFO: renamed from: b */
    public boolean f18152b;

    /* JADX INFO: renamed from: c */
    public int f18153c;

    /* JADX INFO: renamed from: d */
    public boolean f18154d;

    /* JADX INFO: renamed from: e */
    public boolean f18155e;

    /* JADX INFO: renamed from: f */
    public HttpURLConnection f18156f;

    /* JADX INFO: renamed from: g */
    public rj0 f18157g;

    /* JADX INFO: renamed from: h */
    public ScheduledExecutorService f18158h;

    /* JADX INFO: renamed from: i */
    public wo5 f18159i;

    /* JADX INFO: renamed from: j */
    public hg1 f18160j;

    /* JADX INFO: renamed from: k */
    public sg1 f18161k;

    /* JADX INFO: renamed from: l */
    public uj0 f18162l;

    /* JADX INFO: renamed from: m */
    public Context f18163m;

    /* JADX INFO: renamed from: n */
    public String f18164n;

    /* JADX INFO: renamed from: o */
    public Random f18165o;

    /* JADX INFO: renamed from: p */
    public ia5 f18166p;

    /* JADX INFO: renamed from: q */
    public gk0 f18167q;

    /* JADX INFO: renamed from: r */
    public Object f18168r;

    /* JADX INFO: renamed from: d */
    public static boolean m5138d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: renamed from: f */
    public static String m5139f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m5140a() {
        return (this.f18151a.isEmpty() || this.f18152b || this.f18154d || this.f18155e) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m5141b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f18156f;
        if (httpURLConnection != null && !this.f18155e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m5142c(String str) {
        hg1 hg1Var = this.f18160j;
        hg1Var.m6388a();
        Matcher matcher = f18150t.matcher(hg1Var.f20547c.f31843b);
        return zi4.m13622v("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5143e(long j) {
        try {
            if (m5140a()) {
                int i = this.f18153c;
                if (i > 0) {
                    this.f18153c = i - 1;
                    ScheduledExecutorService scheduledExecutorService = this.f18158h;
                    RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 1);
                    runnableC1029pc.f27515b = this;
                    VarHandle.storeStoreFence();
                    scheduledExecutorService.schedule(runnableC1029pc, j, TimeUnit.MILLISECONDS);
                } else if (!this.f18155e) {
                    new xg1("Unable to connect to the server. Check your connection and try again.");
                    m5144g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5144g() {
        Iterator it = this.f18151a.iterator();
        while (it.hasNext()) {
            ((dk0) it.next()).m4518a();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m5145h() {
        this.f18166p.getClass();
        m5143e(Math.max(0L, this.f18167q.m6012c().f19052b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX INFO: renamed from: i */
    public final void m5146i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strM6591p;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        hg1 hg1Var = this.f18160j;
        hg1Var.m6388a();
        ug1 ug1Var = hg1Var.f20547c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", ug1Var.f31842a);
        Context context = this.f18163m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrM12865n0 = y42.m12865n0(context, context.getPackageName());
            if (bArrM12865n0 == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strM6591p = null;
            } else {
                strM6591p = i20.m6591p(bArrM12865n0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strM6591p);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        hg1Var.m6388a();
        Matcher matcher = f18150t.matcher(ug1Var.f31843b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f18164n);
        map.put("lastKnownVersionNumber", Long.toString(((gk0) this.f18159i.f33573h).f19824a.getLong("last_template_version", 0L)));
        hg1Var.m6388a();
        map.put("appId", ug1Var.f31843b);
        map.put("sdkVersion", "24.0.1");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized rj0 m5147j(HttpURLConnection httpURLConnection) {
        rj0 rj0Var;
        dk0 dk0Var = new dk0();
        dk0Var.f17112a = this;
        VarHandle.storeStoreFence();
        wo5 wo5Var = this.f18159i;
        uj0 uj0Var = this.f18162l;
        CopyOnWriteArraySet copyOnWriteArraySet = this.f18151a;
        ScheduledExecutorService scheduledExecutorService = this.f18158h;
        gk0 gk0Var = this.f18167q;
        rj0Var = new rj0();
        rj0Var.f29341b = httpURLConnection;
        rj0Var.f29342c = wo5Var;
        rj0Var.f29343d = uj0Var;
        rj0Var.f29340a = copyOnWriteArraySet;
        rj0Var.f29344e = dk0Var;
        rj0Var.f29345f = scheduledExecutorService;
        rj0Var.f29346g = new Random();
        rj0Var.f29348i = false;
        rj0Var.f29347h = gk0Var;
        VarHandle.storeStoreFence();
        return rj0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m5148k(Date date) {
        gk0 gk0Var = this.f18167q;
        int i = gk0Var.m6012c().f19051a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f18149s[(i < 8 ? i : 8) - 1]);
        gk0Var.m6014e(i, new Date(date.getTime() + (millis / 2) + ((long) this.f18165o.nextInt((int) millis))));
    }
}
