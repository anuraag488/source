package p000;

import ads_mobile_sdk.cy3;
import ads_mobile_sdk.gw2;
import ads_mobile_sdk.k31;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.n10;
import ads_mobile_sdk.p31;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.r11;
import ads_mobile_sdk.y80;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.view.KeyEvent;
import com.google.firebase.components.ComponentRegistrar;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h50 implements l50, o03, w81, ai3, kc0, ad2, PrefetchOperationCallbackBoundaryInterface, cr0, f44, qo0, ax4, t65 {

    /* JADX INFO: renamed from: b */
    public static h50 f20394b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20395a;

    public /* synthetic */ h50(byte b) {
        this.f20395a = b;
    }

    /* JADX INFO: renamed from: A */
    public static p83 m6220A(File file) {
        String str = p83.f27431b;
        String string = file.toString();
        s50 s50Var = AbstractC0593e.f17543a;
        w30 w30Var = new w30();
        w30Var.m12058S(string);
        return AbstractC0593e.m4823d(w30Var, false);
    }

    /* JADX INFO: renamed from: B */
    public static p83 m6221B(String str) {
        s50 s50Var = AbstractC0593e.f17543a;
        w30 w30Var = new w30();
        w30Var.m12058S(str);
        return AbstractC0593e.m4823d(w30Var, false);
    }

    /* JADX INFO: renamed from: C */
    public static m90 m6222C(String str) {
        m90 m90Var = new m90(str);
        m90.f24746d.put(str, m90Var);
        return m90Var;
    }

    /* JADX INFO: renamed from: m */
    public static gw2 m6223m(int i) {
        if (i == 0) {
            return gw2.f4160b;
        }
        if (i != 1) {
            return i != 2 ? gw2.f4161c : gw2.f4162d;
        }
        return gw2.f4161c;
    }

    /* JADX INFO: renamed from: n */
    public static Uri m6224n(Uri uri, String str) {
        String string = uri.toString();
        int iM6343i0 = hd4.m6343i0(string, "&adurl", 0, false, 6);
        if (iM6343i0 == -1) {
            iM6343i0 = hd4.m6343i0(string, "?adurl=", 0, false, 6);
        }
        if (iM6343i0 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        StringBuilder sb = new StringBuilder(str.length() + string.length() + 2 + 2);
        int i = iM6343i0 + 1;
        sb.append(string.substring(0, i));
        sb.append("ms=");
        sb.append(str);
        sb.append("&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: renamed from: u */
    public static String m6225u(Context context) {
        String string;
        AtomicReference atomicReference = p31.f8448g;
        String str = (String) atomicReference.get();
        if (str != null) {
            return str;
        }
        String strM6229y = "B3EEABB8EE11C2BE770B684D95219ECB";
        if (!y62.m12977k() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null && string.length() != 0) {
            strM6229y = m6229y(string);
        }
        atomicReference.set(strM6229y);
        return (String) atomicReference.get();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m6226v(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: w */
    public static String m6227w(String str, String str2) {
        C1283w7 c1283w7M6596u = i20.m6596u(Pattern.compile(str).matcher(str2), 0, str2);
        if (c1283w7M6596u == null) {
            return null;
        }
        Collection collectionM12120G = c1283w7M6596u.m12120G();
        AbstractC0929n0 abstractC0929n0 = (AbstractC0929n0) collectionM12120G;
        if (abstractC0929n0.mo103a() < 2) {
            return null;
        }
        int iMo103a = abstractC0929n0.mo103a();
        for (int i = 1; i < iMo103a; i++) {
            hq2 hq2Var = (hq2) collectionM12120G;
            if (!hd4.m6345k0((CharSequence) hq2Var.get(i))) {
                return (String) hq2Var.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static String m6228x(String str) {
        gq2 gq2VarM6851b;
        C1283w7 c1283w7M4045a = cm3.m4045a(p31.f8450i, str);
        if (c1283w7M4045a == null || (gq2VarM6851b = ((iq2) c1283w7M4045a.f33129e).m6851b(1)) == null) {
            return null;
        }
        return gq2VarM6851b.f20026a;
    }

    /* JADX INFO: renamed from: y */
    public static String m6229y(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes(z80.f35863a));
                return String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public List m6230D(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (qf0 qf0Var : componentRegistrar.getComponents()) {
            String str = qf0Var.f28428a;
            if (str != null) {
                C1163sz c1163sz = new C1163sz((byte) 1);
                c1163sz.f30676b = str;
                c1163sz.f30677c = qf0Var;
                VarHandle.storeStoreFence();
                Set set = qf0Var.f28429b;
                Set set2 = qf0Var.f28430c;
                byte b = qf0Var.f28431d;
                boolean z = qf0Var.f28432e;
                qf0Var = new qf0(str, set, set2, b, z ? 1 : 0, c1163sz, qf0Var.f28434g);
            }
            arrayList.add(qf0Var);
        }
        return arrayList;
    }

    @Override // p000.t65
    /* JADX INFO: renamed from: a */
    public Object mo5605a(int i) {
        y80 y80Var;
        switch (this.f20395a) {
            case 25:
                n10 n10VarM1739a = n10.m1739a(i);
                return n10VarM1739a == null ? n10.f7470F : n10VarM1739a;
            default:
                y80 y80Var2 = y80.f13535b;
                if (i == 0) {
                    y80Var = y80Var2;
                } else if (i == 1) {
                    y80Var = y80.f13536c;
                } else if (i == 2) {
                    y80Var = y80.f13537d;
                } else if (i == 3) {
                    y80Var = y80.f13538e;
                } else if (i != 4) {
                    y80Var = i != 5 ? null : y80.f13540g;
                } else {
                    y80Var = y80.f13539f;
                }
                return y80Var == null ? y80Var2 : y80Var;
        }
    }

    @Override // p000.l50
    /* JADX INFO: renamed from: b */
    public byte[] mo6231b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: d */
    public Object mo5607d(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // p000.ai3
    public Object get() {
        return um4.f31993a;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"PREFETCH_WITH_CALLBACK_RESULT_V1"};
    }

    @Override // p000.o03
    /* JADX INFO: renamed from: h */
    public boolean mo6232h() {
        return true;
    }

    @Override // p000.f44
    /* JADX INFO: renamed from: i */
    public c44 mo5505i(q50 q50Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        z34 z34Var = jSONObject.has("session") ? new z34(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new z34(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        y34 y34Var = new y34(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new c44(jCurrentTimeMillis, z34Var, y34Var, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // p000.ax4
    /* JADX INFO: renamed from: k */
    public int mo3359k() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public Object m6233o(long j, yp1 yp1Var, ym0 ym0Var) {
        k31 k31Var;
        if (ym0Var instanceof k31) {
            k31Var = (k31) ym0Var;
            int i = k31Var.f6058c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k31Var.f6058c = i - Integer.MIN_VALUE;
            } else {
                k31Var = new k31(this, ym0Var);
            }
        } else {
            k31Var = new k31(this, ym0Var);
        }
        Object objM10725h0 = k31Var.f6056a;
        ap0 ap0Var = ap0.f14763a;
        int i2 = k31Var.f6058c;
        wm0 wm0Var = null;
        try {
            if (i2 == 0) {
                k43.m7376J(objM10725h0);
                C0821k3 c0821k3 = new C0821k3(yp1Var, wm0Var, (byte) 6);
                k31Var.f6058c = 1;
                objM10725h0 = se0.m10725h0(j, c0821k3, k31Var);
                if (objM10725h0 == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(objM10725h0);
            }
            return new q11(objM10725h0);
        } catch (zm4 e) {
            r11 r11Var = new r11(e, 1);
            mx3 mx3VarM653a = cy3.m653a();
            mx3VarM653a.mo1538e().f5878m = false;
            mx3VarM653a.m1735a(e);
            return r11Var;
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onFailure(int i, String str, int i2) {
        if (i != 1) {
            new g82(str);
        } else {
            new je3(str);
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onResult(int i) {
        if (i != 0) {
            if (i == 1) {
                new je3("Duplicate prefetch request");
            } else {
                C1077qn.m9987m("Given type isn't defined.");
            }
        }
    }

    @Override // p000.ad2
    /* JADX INFO: renamed from: q */
    public oc2 mo204q(KeyEvent keyEvent) {
        int iM3822s = c20.m3822s(keyEvent);
        oc2 oc2Var = null;
        if (iM3822s == AbstractC1356y5.f34893p) {
            long jM6579d = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d, nc2.f25652f)) {
                oc2Var = oc2.SELECT_LINE_LEFT;
            } else if (nc2.m8689a(jM6579d, nc2.f25653g)) {
                oc2Var = oc2.SELECT_LINE_RIGHT;
            } else if (nc2.m8689a(jM6579d, nc2.f25650d)) {
                oc2Var = oc2.SELECT_HOME;
            } else if (nc2.m8689a(jM6579d, nc2.f25651e)) {
                oc2Var = oc2.SELECT_END;
            }
        } else if (iM3822s == 1) {
            long jM6579d2 = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d2, nc2.f25652f)) {
                oc2Var = oc2.LINE_LEFT;
            } else if (nc2.m8689a(jM6579d2, nc2.f25653g)) {
                oc2Var = oc2.LINE_RIGHT;
            } else if (nc2.m8689a(jM6579d2, nc2.f25650d)) {
                oc2Var = oc2.HOME;
            } else if (nc2.m8689a(jM6579d2, nc2.f25651e)) {
                oc2Var = oc2.END;
            } else if (nc2.m8689a(jM6579d2, nc2.f25665s)) {
                oc2Var = oc2.DELETE_FROM_LINE_START;
            }
        }
        return oc2Var == null ? bd2.f15216a.mo204q(keyEvent) : oc2Var;
    }

    @Override // p000.ax4
    /* JADX INFO: renamed from: r */
    public int mo3360r() {
        return 0;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return j < 0 ? abstractC0654fk : abstractC0654fk2;
    }

    public String toString() {
        switch (this.f20395a) {
            case 17:
                int iHashCode = hashCode();
                y62.m12992v(16);
                return zi4.m13622v("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rl3.m10361a(py4.class).m10249b(), ">");
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: z */
    public synchronized m90 m6234z(String str) {
        m90 m90Var;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = m90.f24746d;
            m90Var = (m90) linkedHashMap.get(str);
            if (m90Var == null) {
                if (od4.m9043X(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = od4.m9043X(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                m90Var = (m90) linkedHashMap.get(strConcat);
                if (m90Var == null) {
                    m90Var = new m90(str);
                }
                linkedHashMap.put(str, m90Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m90Var;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return abstractC0654fk3;
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onSuccess() {
    }

    @Override // p000.o03
    public void shutdown() {
    }
}
