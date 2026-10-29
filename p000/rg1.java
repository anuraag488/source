package p000;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 implements sg1 {

    /* JADX INFO: renamed from: m */
    public static final Object f29235m = new Object();

    /* JADX INFO: renamed from: a */
    public hg1 f29236a;

    /* JADX INFO: renamed from: b */
    public pg1 f29237b;

    /* JADX INFO: renamed from: c */
    public z32 f29238c;

    /* JADX INFO: renamed from: d */
    public dw4 f29239d;

    /* JADX INFO: renamed from: e */
    public qg2 f29240e;

    /* JADX INFO: renamed from: f */
    public oj3 f29241f;

    /* JADX INFO: renamed from: g */
    public Object f29242g;

    /* JADX INFO: renamed from: h */
    public ExecutorService f29243h;

    /* JADX INFO: renamed from: i */
    public e24 f29244i;

    /* JADX INFO: renamed from: j */
    public String f29245j;

    /* JADX INFO: renamed from: k */
    public HashSet f29246k;

    /* JADX INFO: renamed from: l */
    public ArrayList f29247l;

    static {
        new AtomicInteger(1);
    }

    /* JADX INFO: renamed from: d */
    public static rg1 m10328d() {
        return (rg1) hg1.m6386c().m6389b(sg1.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m10329a() {
        C1084qu c1084quM13315M;
        byte b;
        synchronized (f29235m) {
            try {
                hg1 hg1Var = this.f29236a;
                hg1Var.m6388a();
                nh3 nh3VarM8732d = nh3.m8732d(hg1Var.f20545a);
                try {
                    c1084quM13315M = this.f29238c.m13315M();
                    int i = c1084quM13315M.f28795b;
                    b = 2;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strM10334g = m10334g(c1084quM13315M);
                        z32 z32Var = this.f29238c;
                        C1047pu c1047puM10124a = c1084quM13315M.m10124a();
                        c1047puM10124a.f27982a = strM10334g;
                        c1047puM10124a.f27983b = 3;
                        c1084quM13315M = c1047puM10124a.m9676a();
                        z32Var.m13310H(c1084quM13315M);
                    }
                    if (nh3VarM8732d != null) {
                        nh3VarM8732d.m8743J();
                    }
                } catch (Throwable th) {
                    if (nh3VarM8732d != null) {
                        nh3VarM8732d.m8743J();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m10337j(c1084quM13315M);
        e24 e24Var = this.f29244i;
        qg1 qg1Var = new qg1(b);
        qg1Var.f28451b = this;
        VarHandle.storeStoreFence();
        e24Var.execute(qg1Var);
    }

    /* JADX INFO: renamed from: b */
    public final C1084qu m10330b(C1084qu c1084qu) throws tg1 {
        int i;
        C0552cv c0552cv;
        C0552cv c0552cvM9525f;
        pg1 pg1Var = this.f29237b;
        hg1 hg1Var = this.f29236a;
        hg1Var.m6388a();
        String str = hg1Var.f20547c.f31842a;
        String str2 = c1084qu.f28794a;
        hg1 hg1Var2 = this.f29236a;
        hg1Var2.m6388a();
        String str3 = hg1Var2.f20547c.f31849h;
        String str4 = c1084qu.f28797d;
        b52 b52Var = pg1Var.f27593c;
        if (!b52Var.m3454a()) {
            throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM9521a = pg1.m9521a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM9529c = pg1Var.m9529c(urlM9521a, str);
            try {
                try {
                    httpURLConnectionM9529c.setRequestMethod("POST");
                    httpURLConnectionM9529c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM9529c.setDoOutput(true);
                    pg1.m9527h(httpURLConnectionM9529c);
                    int responseCode = httpURLConnectionM9529c.getResponseCode();
                    b52Var.m3455b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c0552cvM9525f = pg1.m9525f(httpURLConnectionM9529c);
                        httpURLConnectionM9529c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    pg1.m9522b(httpURLConnectionM9529c, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            c0552cv = new C0552cv();
                            c0552cv.f16500a = null;
                            c0552cv.f16501b = 0L;
                            c0552cv.f16502c = 3;
                            VarHandle.storeStoreFence();
                        } else {
                            if (responseCode == 429) {
                                throw new tg1("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                c0552cv = new C0552cv();
                                c0552cv.f16500a = null;
                                c0552cv.f16501b = 0L;
                                c0552cv.f16502c = 2;
                                VarHandle.storeStoreFence();
                            }
                            httpURLConnectionM9529c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionM9529c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0552cvM9525f = c0552cv;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionM9529c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int iM4376u = d55.m4376u(c0552cvM9525f.f16502c);
        if (iM4376u == 0) {
            String str5 = c0552cvM9525f.f16500a;
            long j = c0552cvM9525f.f16501b;
            this.f29239d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            C1047pu c1047puM10124a = c1084qu.m10124a();
            c1047puM10124a.f27984c = str5;
            c1047puM10124a.f27986e = j;
            byte b = (byte) (c1047puM10124a.f27989h | 1);
            c1047puM10124a.f27987f = jCurrentTimeMillis;
            c1047puM10124a.f27989h = (byte) (b | 2);
            return c1047puM10124a.m9676a();
        }
        if (iM4376u == 1) {
            C1047pu c1047puM10124a2 = c1084qu.m10124a();
            c1047puM10124a2.f27988g = "BAD CONFIG";
            c1047puM10124a2.f27983b = 5;
            return c1047puM10124a2.m9676a();
        }
        if (iM4376u != 2) {
            throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f29245j = null;
        }
        C1047pu c1047puM10124a3 = c1084qu.m10124a();
        c1047puM10124a3.f27983b = 2;
        return c1047puM10124a3.m9676a();
    }

    /* JADX INFO: renamed from: c */
    public final nr6 m10331c() {
        String str;
        m10333f();
        synchronized (this) {
            str = this.f29245j;
        }
        if (str != null) {
            return y62.m12936B(str);
        }
        li4 li4Var = new li4();
        hs1 hs1Var = new hs1();
        hs1Var.f20825a = li4Var;
        VarHandle.storeStoreFence();
        synchronized (this.f29242g) {
            this.f29247l.add(hs1Var);
        }
        nr6 nr6Var = li4Var.f24059a;
        ExecutorService executorService = this.f29243h;
        qg1 qg1Var = new qg1((byte) 0);
        qg1Var.f28451b = this;
        VarHandle.storeStoreFence();
        executorService.execute(qg1Var);
        return nr6Var;
    }

    /* JADX INFO: renamed from: e */
    public final nr6 m10332e() {
        m10333f();
        li4 li4Var = new li4();
        dw4 dw4Var = this.f29239d;
        gs1 gs1Var = new gs1();
        gs1Var.f20089a = dw4Var;
        gs1Var.f20090b = li4Var;
        VarHandle.storeStoreFence();
        synchronized (this.f29242g) {
            this.f29247l.add(gs1Var);
        }
        nr6 nr6Var = li4Var.f24059a;
        ExecutorService executorService = this.f29243h;
        qg1 qg1Var = new qg1((byte) 1);
        qg1Var.f28451b = this;
        VarHandle.storeStoreFence();
        executorService.execute(qg1Var);
        return nr6Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m10333f() {
        hg1 hg1Var = this.f29236a;
        hg1Var.m6388a();
        y42.m12852Y(hg1Var.f20547c.f31843b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hg1Var.m6388a();
        y42.m12852Y(hg1Var.f20547c.f31849h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hg1Var.m6388a();
        y42.m12852Y(hg1Var.f20547c.f31842a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hg1Var.m6388a();
        String str = hg1Var.f20547c.f31843b;
        Pattern pattern = dw4.f17467a;
        y42.m12848U("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hg1Var.m6388a();
        y42.m12848U("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", dw4.f17467a.matcher(hg1Var.f20547c.f31842a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [wm0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: g */
    public final String m10334g(C1084qu c1084qu) {
        e82 e82Var;
        String strEncodeToString;
        byte b;
        r71 r71Var;
        String str;
        String str2;
        PublicKey publicKeyGeneratePublic;
        oj3 oj3Var = this.f29241f;
        hg1 hg1Var = this.f29236a;
        hg1Var.m6388a();
        String str3 = hg1Var.f20546b;
        if (!str3.equals("CHIME_ANDROID_SDK")) {
            hg1Var.m6388a();
            if ("[DEFAULT]".equals(str3)) {
                if (c1084qu.f28795b == 1) {
                    e82Var = ((r02) this.f29240e.get()).f28927a;
                    e82Var.getClass();
                    strEncodeToString = 0;
                    strEncodeToString = 0;
                    strEncodeToString = 0;
                    b = 4;
                    it1 it1Var = new it1(e82Var, r02.f28925d, (wm0) strEncodeToString, b);
                    r71Var = r71.f29063a;
                    str = (String) y70.m13014O(r71Var, it1Var);
                    if (str != null) {
                        strEncodeToString = str;
                    } else {
                        str2 = (String) y70.m13014O(r71Var, new it1(e82Var, r02.f28924c, (wm0) strEncodeToString, b));
                        if (str2 != null) {
                            try {
                                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                                Log.w("ContentValues", "Invalid key stored " + e);
                                publicKeyGeneratePublic = null;
                            }
                            if (publicKeyGeneratePublic != null) {
                                try {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strEncodeToString)) {
                        return strEncodeToString;
                    }
                    oj3Var.getClass();
                    return oj3.m9131a();
                }
            }
        } else if (c1084qu.f28795b == 1) {
            e82Var = ((r02) this.f29240e.get()).f28927a;
            e82Var.getClass();
            strEncodeToString = 0;
            strEncodeToString = 0;
            strEncodeToString = 0;
            b = 4;
            it1 it1Var2 = new it1(e82Var, r02.f28925d, (wm0) strEncodeToString, b);
            r71Var = r71.f29063a;
            str = (String) y70.m13014O(r71Var, it1Var2);
            if (str != null) {
                strEncodeToString = str;
            } else {
                str2 = (String) y70.m13014O(r71Var, new it1(e82Var, r02.f28924c, (wm0) strEncodeToString, b));
                if (str2 != null) {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                    if (publicKeyGeneratePublic != null) {
                        byte[] bArrDigest2 = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                        bArrDigest2[0] = (byte) (((bArrDigest2[0] & 15) + 112) & 255);
                        strEncodeToString = Base64.encodeToString(bArrDigest2, 0, 8, 11);
                    }
                }
            }
            if (TextUtils.isEmpty(strEncodeToString)) {
                return strEncodeToString;
            }
            oj3Var.getClass();
            return oj3.m9131a();
        }
        oj3Var.getClass();
        return oj3.m9131a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [hu] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: h */
    public final C1084qu m10335h(C1084qu c1084qu) throws JSONException, tg1 {
        String string;
        wm0 wm0Var;
        char c;
        hg1 hg1Var = this.f29236a;
        String str = c1084qu.f28794a;
        byte b = 4;
        wm0 wm0Var2 = null;
        if (str != null && str.length() == 11) {
            r02 r02Var = (r02) this.f29240e.get();
            r02Var.getClass();
            int i = 0;
            while (true) {
                if (i < 4) {
                    xd3 xd3Var = new xd3(c75.m3879k("|T|", r02Var.f28928b, "|", r02.f28926e[i]));
                    e82 e82Var = r02Var.f28927a;
                    e82Var.getClass();
                    string = (String) y70.m13014O(r71.f29063a, new it1(e82Var, xd3Var, wm0Var2, b));
                    if (string != null && !string.isEmpty()) {
                        if (!string.startsWith("{")) {
                            break;
                        }
                        try {
                            string = new JSONObject(string).getString("token");
                            break;
                        } catch (JSONException unused) {
                            string = null;
                            break;
                        }
                    }
                    i++;
                }
                string = null;
                break;
            }
        } else {
            string = null;
            break;
        }
        pg1 pg1Var = this.f29237b;
        hg1Var.m6388a();
        String str2 = hg1Var.f20547c.f31842a;
        hg1Var.m6388a();
        String str3 = hg1Var.f20547c.f31849h;
        hg1Var.m6388a();
        String str4 = hg1Var.f20547c.f31843b;
        b52 b52Var = pg1Var.f27593c;
        if (!b52Var.m3454a()) {
            throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM9521a = pg1.m9521a("projects/" + str3 + "/installations");
        int i2 = 0;
        C0738hu c0738hu = str4;
        ?? M4376u = str;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM9529c = pg1Var.m9529c(urlM9521a, str2);
            try {
                try {
                    httpURLConnectionM9529c.setRequestMethod("POST");
                    httpURLConnectionM9529c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM9529c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    pg1.m9526g(httpURLConnectionM9529c, M4376u, c0738hu);
                    int responseCode = httpURLConnectionM9529c.getResponseCode();
                    b52Var.m3455b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        C0738hu c0738huM9524e = pg1.m9524e(httpURLConnectionM9529c);
                        httpURLConnectionM9529c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0738hu = c0738huM9524e;
                    } else {
                        try {
                            pg1.m9522b(httpURLConnectionM9529c, c0738hu, str2, str3);
                            if (responseCode == 429) {
                                wm0Var = null;
                                c = 4;
                                try {
                                    throw new tg1("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                } catch (IOException | AssertionError unused2) {
                                    httpURLConnectionM9529c.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i2++;
                                    wm0Var2 = wm0Var;
                                    c0738hu = c0738hu;
                                    M4376u = M4376u;
                                }
                            } else if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                C0738hu c0738hu2 = new C0738hu();
                                wm0Var = null;
                                try {
                                    c0738hu2.f20856a = null;
                                    c0738hu2.f20857b = null;
                                    c0738hu2.f20858c = null;
                                    c0738hu2.f20859d = null;
                                    c0738hu2.f20860e = 2;
                                    VarHandle.storeStoreFence();
                                    httpURLConnectionM9529c.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    c0738hu = c0738hu2;
                                } catch (IOException | AssertionError unused3) {
                                    c = 4;
                                    httpURLConnectionM9529c.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i2++;
                                    wm0Var2 = wm0Var;
                                    c0738hu = c0738hu;
                                    M4376u = M4376u;
                                }
                            } else {
                                httpURLConnectionM9529c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                wm0Var = null;
                                c = 4;
                                i2++;
                                wm0Var2 = wm0Var;
                                c0738hu = c0738hu;
                                M4376u = M4376u;
                            }
                        } catch (IOException | AssertionError unused4) {
                            wm0Var = null;
                        }
                    }
                    M4376u = d55.m4376u(c0738hu.f20860e);
                    if (M4376u != 0) {
                        if (M4376u != 1) {
                            throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        C1047pu c1047puM10124a = c1084qu.m10124a();
                        c1047puM10124a.f27988g = "BAD CONFIG";
                        c1047puM10124a.f27983b = 5;
                        return c1047puM10124a.m9676a();
                    }
                    String str5 = c0738hu.f20857b;
                    String str6 = c0738hu.f20858c;
                    this.f29239d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    C0552cv c0552cv = c0738hu.f20859d;
                    String str7 = c0552cv.f16500a;
                    long j = c0552cv.f16501b;
                    C1047pu c1047puM10124a2 = c1084qu.m10124a();
                    c1047puM10124a2.f27982a = str5;
                    c1047puM10124a2.f27983b = 4;
                    c1047puM10124a2.f27984c = str7;
                    c1047puM10124a2.f27985d = str6;
                    c1047puM10124a2.f27986e = j;
                    byte b2 = (byte) (c1047puM10124a2.f27989h | 1);
                    c1047puM10124a2.f27987f = jCurrentTimeMillis;
                    c1047puM10124a2.f27989h = (byte) (b2 | 2);
                    return c1047puM10124a2.m9676a();
                } catch (Throwable th) {
                    httpURLConnectionM9529c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused5) {
                wm0Var = wm0Var2;
            }
        }
        throw new tg1("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX INFO: renamed from: i */
    public final void m10336i(Exception exc) {
        synchronized (this.f29242g) {
            try {
                Iterator it = this.f29247l.iterator();
                while (it.hasNext()) {
                    if (((ec4) it.next()).mo5081a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10337j(C1084qu c1084qu) {
        synchronized (this.f29242g) {
            try {
                Iterator it = this.f29247l.iterator();
                while (it.hasNext()) {
                    if (((ec4) it.next()).mo5082b(c1084qu)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
