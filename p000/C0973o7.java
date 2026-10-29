package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0973o7 implements q72, p56 {

    /* JADX INFO: renamed from: A */
    public static final C0973o7 f26374A;

    /* JADX INFO: renamed from: B */
    public static final C0973o7 f26375B;

    /* JADX INFO: renamed from: C */
    public static final C0973o7 f26376C;

    /* JADX INFO: renamed from: c */
    public static final C0973o7 f26377c;

    /* JADX INFO: renamed from: d */
    public static final C0973o7 f26378d;

    /* JADX INFO: renamed from: e */
    public static final C0973o7 f26379e;

    /* JADX INFO: renamed from: f */
    public static final C0973o7 f26380f;

    /* JADX INFO: renamed from: g */
    public static final C0973o7 f26381g;

    /* JADX INFO: renamed from: h */
    public static final C0973o7 f26382h;

    /* JADX INFO: renamed from: i */
    public static final C0973o7 f26383i;

    /* JADX INFO: renamed from: j */
    public static final C0973o7 f26384j;

    /* JADX INFO: renamed from: k */
    public static final C0973o7 f26385k;

    /* JADX INFO: renamed from: l */
    public static final C0973o7 f26386l;

    /* JADX INFO: renamed from: m */
    public static final C0973o7 f26387m;

    /* JADX INFO: renamed from: n */
    public static final C0973o7 f26388n;

    /* JADX INFO: renamed from: o */
    public static final C0973o7 f26389o;

    /* JADX INFO: renamed from: p */
    public static final C0973o7 f26390p;

    /* JADX INFO: renamed from: q */
    public static final C0973o7 f26391q;

    /* JADX INFO: renamed from: r */
    public static final C0973o7 f26392r;

    /* JADX INFO: renamed from: s */
    public static final C0973o7 f26393s;

    /* JADX INFO: renamed from: t */
    public static final C0973o7 f26394t;

    /* JADX INFO: renamed from: u */
    public static final C0973o7 f26395u;

    /* JADX INFO: renamed from: v */
    public static final C0973o7 f26396v;

    /* JADX INFO: renamed from: w */
    public static final C0973o7 f26397w;

    /* JADX INFO: renamed from: x */
    public static final C0973o7 f26398x;

    /* JADX INFO: renamed from: y */
    public static final C0973o7 f26399y;

    /* JADX INFO: renamed from: z */
    public static final C0973o7 f26400z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26401a;

    /* JADX INFO: renamed from: b */
    public String f26402b;

    static {
        byte b = 0;
        f26377c = new C0973o7("TINK", b);
        f26378d = new C0973o7("CRUNCHY", b);
        f26379e = new C0973o7("LEGACY", b);
        f26380f = new C0973o7("NO_PREFIX", b);
        byte b2 = 1;
        f26381g = new C0973o7("TINK", b2);
        f26382h = new C0973o7("CRUNCHY", b2);
        f26383i = new C0973o7("NO_PREFIX", b2);
        byte b3 = 2;
        f26384j = new C0973o7("TINK", b3);
        f26385k = new C0973o7("CRUNCHY", b3);
        f26386l = new C0973o7("NO_PREFIX", b3);
        byte b4 = 3;
        f26387m = new C0973o7("TINK", b4);
        f26388n = new C0973o7("CRUNCHY", b4);
        f26389o = new C0973o7("NO_PREFIX", b4);
        byte b5 = 4;
        f26390p = new C0973o7("SHA256", b5);
        f26391q = new C0973o7("SHA384", b5);
        f26392r = new C0973o7("SHA512", b5);
        byte b6 = 5;
        f26393s = new C0973o7("TINK", b6);
        f26394t = new C0973o7("CRUNCHY", b6);
        f26395u = new C0973o7("LEGACY", b6);
        f26396v = new C0973o7("NO_PREFIX", b6);
        byte b7 = 6;
        f26397w = new C0973o7("TINK", b7);
        f26398x = new C0973o7("NO_PREFIX", b7);
        byte b8 = 7;
        f26399y = new C0973o7("TINK", b8);
        f26400z = new C0973o7("NO_PREFIX", b8);
        byte b9 = 8;
        f26374A = new C0973o7("TINK", b9);
        f26375B = new C0973o7("CRUNCHY", b9);
        f26376C = new C0973o7("NO_PREFIX", b9);
    }

    public /* synthetic */ C0973o7(String str, byte b) {
        this.f26401a = b;
        this.f26402b = str;
    }

    /* JADX INFO: renamed from: c */
    public static void m8972c(jp0 jp0Var, j44 j44Var) {
        String str = j44Var.f22005a;
        if (str != null) {
            jp0Var.m7220F("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        jp0Var.m7220F("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        jp0Var.m7220F("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        jp0Var.m7220F("Accept", "application/json");
        jp0Var.m7220F("X-CRASHLYTICS-DEVICE-MODEL", j44Var.f22006b);
        String str2 = j44Var.f22007c;
        if (str2 != null) {
            jp0Var.m7220F("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = j44Var.f22008d;
        if (str3 != null) {
            jp0Var.m7220F("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = j44Var.f22009e.m9695c().f20120a;
        if (str4 != null) {
            jp0Var.m7220F("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static HashMap m8973h(j44 j44Var) {
        HashMap map = new HashMap();
        map.put("build_version", j44Var.f22012h);
        map.put("display_version", j44Var.f22011g);
        map.put("source", Integer.toString(j44Var.f22013i));
        String str = j44Var.f22010f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: b */
    public boolean mo3135b() {
        return false;
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: d */
    public void mo3136d(Executor executor, C1163sz c1163sz) {
        throw new IllegalStateException("Calling setConsoleCallback() when ".concat(this.f26402b));
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: e */
    public zl2 mo3137e(String str) {
        throw new IllegalStateException("Calling evaluateJavaScriptAsync() when ".concat(this.f26402b));
    }

    @Override // p000.p56
    /* JADX INFO: renamed from: f */
    public Object mo4490f() {
        HandlerThread handlerThread = new HandlerThread(this.f26402b, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: g */
    public jp0 m8974g(HashMap map) {
        String str = this.f26402b;
        jp0 jp0Var = new jp0((byte) 22, false);
        jp0Var.f22482c = str;
        jp0Var.f22481b = map;
        jp0Var.f22483d = new HashMap();
        VarHandle.storeStoreFence();
        jp0Var.m7220F("User-Agent", "Crashlytics Android SDK/19.4.4");
        jp0Var.m7220F("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return jp0Var;
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m8975i(hf0 hf0Var) {
        String str = this.f26402b;
        int i = hf0Var.f20528b;
        ig1 ig1Var = ig1.f21399w;
        ig1Var.m6801p("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            ig1Var.m6799n("Settings request failed; (status: " + i + ") from " + str, null);
            return null;
        }
        String str2 = (String) hf0Var.f20529c;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            ig1Var.m6802q("Failed to parse settings JSON from ".concat(str), e);
            ig1Var.m6802q("Settings response " + str2, null);
            return null;
        }
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: j */
    public void mo3142j(Executor executor, i85 i85Var) {
        throw new IllegalStateException("Calling addOnTerminatedCallback() when ".concat(this.f26402b));
    }

    public String toString() {
        switch (this.f26401a) {
            case 0:
                return this.f26402b;
            case 1:
                return this.f26402b;
            case 2:
                return this.f26402b;
            case 3:
                return this.f26402b;
            case 4:
                return this.f26402b;
            case 5:
                return this.f26402b;
            case 6:
                return this.f26402b;
            case 7:
                return this.f26402b;
            case 8:
                return this.f26402b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0973o7(byte b) {
        this.f26401a = b;
    }

    @Override // p000.q72
    public void close() {
    }
}
