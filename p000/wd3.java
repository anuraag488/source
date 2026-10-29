package p000;

import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0310ra;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wd3 implements wg3, ii1, InterfaceC0657fn, w33, InterfaceC0691gk, WebMessageListenerBoundaryInterface, pz4, WebViewStartUpConfigBoundaryInterface, InterfaceC1161sx, e43, dr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33258a;

    /* JADX INFO: renamed from: b */
    public Object f33259b;

    public wd3(ky0 ky0Var) {
        this.f33258a = (byte) 11;
        float f = xa4.f34115a;
        zh1 zh1Var = new zh1();
        zh1Var.f36085a = f;
        float fMo3580c = ky0Var.mo3580c();
        float f2 = ai1.f14520a;
        zh1Var.f36086b = fMo3580c * 386.0878f * 160.0f * 0.84f;
        VarHandle.storeStoreFence();
        this.f33259b = zh1Var;
    }

    /* JADX INFO: renamed from: e */
    public static wd3 m12234e() {
        v80 v80Var = new v80();
        VarHandle.storeStoreFence();
        w42 w42Var = new w42((byte) 14, false);
        w42Var.f33090b = v80Var;
        VarHandle.storeStoreFence();
        return new wd3(w42Var, (byte) 12);
    }

    /* JADX INFO: renamed from: n */
    public static void m12235n(View view, b05 b05Var) {
        c05 c05Var;
        if (b05Var != null) {
            c05Var = new c05(b05Var.f14983a);
            c05Var.f15744d = new HashMap();
            c05Var.f15741a = b05Var;
            VarHandle.storeStoreFence();
        } else {
            c05Var = null;
        }
        view.setWindowInsetsAnimationCallback(c05Var);
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: a */
    public long mo5958a(float f) {
        return ((long) (Math.exp(((zh1) this.f33259b).m13559b(f) / (((double) ai1.f14520a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p000.pz4
    /* JADX INFO: renamed from: b */
    public String[] mo6794b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f33259b).getSupportedFeatures();
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: c */
    public float mo5960c() {
        return 0.0f;
    }

    @Override // p000.pz4
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) i20.m6592q(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f33259b).createWebView(webView));
    }

    /* JADX INFO: renamed from: d */
    public w42 m12236d() {
        mi2 mi2VarM10789h = ((si2) this.f33259b).m10789h();
        w42 w42Var = new w42((byte) 9, false);
        w42Var.f33090b = mi2VarM10789h;
        VarHandle.storeStoreFence();
        return w42Var;
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: f */
    public float mo5961f(float f, float f2) {
        zh1 zh1Var = (zh1) this.f33259b;
        double dM13559b = zh1Var.m13559b(f2);
        double d = ai1.f14520a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dM13559b) * ((double) (zh1Var.f36085a * zh1Var.f36086b))))) + f;
    }

    @Override // p000.pz4
    /* JADX INFO: renamed from: g */
    public void mo6795g(rz4 rz4Var, C1040pn c1040pn) {
        WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) this.f33259b;
        wd3 wd3Var = new wd3((byte) 22);
        wd3Var.f33259b = rz4Var;
        VarHandle.storeStoreFence();
        h20 h20VarM6594s = i20.m6594s(wd3Var);
        C1040pn c1040pn2 = new C1040pn((byte) 21);
        c1040pn2.f27754b = c1040pn;
        VarHandle.storeStoreFence();
        w42 w42Var = new w42((byte) 23, false);
        w42Var.f33090b = c1040pn2;
        VarHandle.storeStoreFence();
        webViewProviderFactoryBoundaryInterface.startUpWebView(h20VarM6594s, i20.m6594s(w42Var));
    }

    @Override // p000.InterfaceC0691gk
    public di1 get(int i) {
        switch (this.f33258a) {
            case 17:
                return ((mi1[]) this.f33259b)[i];
            default:
                return (di1) this.f33259b;
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return ((rz4) this.f33259b).f29755a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Set getProfileNamesToLoad() {
        return ((rz4) this.f33259b).f29757c;
    }

    @Override // p000.pz4
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) i20.m6592q(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f33259b).getProfileStore());
    }

    @Override // p000.pz4
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) i20.m6592q(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f33259b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // p000.pz4
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) i20.m6592q(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f33259b).getWebkitToCompatConverter());
    }

    @Override // p000.wg3
    /* JADX INFO: renamed from: h */
    public void mo10207h(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f33259b).setResultCode(i);
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: i */
    public float mo5963i(long j, float f) {
        long j2 = j / 1000000;
        yh1 yh1VarM13558a = ((zh1) this.f33259b).m13558a(f);
        long j3 = yh1VarM13558a.f35224c;
        return (((Math.signum(yh1VarM13558a.f35222a) * AbstractC0488be.m3552a(j3 > 0 ? j2 / j3 : 1.0f).f14398b) * yh1VarM13558a.f35223b) / j3) * 1000.0f;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object mo4146j() {
        wo5 wo5Var = (wo5) ((wo5) this.f33259b).f33566a;
        pq3 pq3Var = new pq3((byte) 9);
        pq3Var.f27896b = wo5Var;
        VarHandle.storeStoreFence();
        return pq3Var;
    }

    @Override // p000.InterfaceC0657fn
    /* JADX INFO: renamed from: k */
    public Object mo5747k(tx3 tx3Var, Float f, Float f2, yp1 yp1Var, y84 y84Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objM13679k = zp0.m13679k(tx3Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, k43.m7379a(0.0f, fFloatValue2, 28), (InterfaceC1407zj) this.f33259b, yp1Var, y84Var);
        return objM13679k == ap0.f14763a ? objM13679k : (C1295wj) objM13679k;
    }

    @Override // p000.ii1
    /* JADX INFO: renamed from: l */
    public float mo5964l(float f, float f2, long j) {
        long j2 = j / 1000000;
        yh1 yh1VarM13558a = ((zh1) this.f33259b).m13558a(f2);
        long j3 = yh1VarM13558a.f35224c;
        return (Math.signum(yh1VarM13558a.f35222a) * yh1VarM13558a.f35223b * AbstractC0488be.m3552a(j3 > 0 ? j2 / j3 : 1.0f).f14397a) + f;
    }

    /* JADX INFO: renamed from: m */
    public c44 m12237m(JSONObject jSONObject) throws JSONException {
        f44 h50Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            h50Var = new f70((byte) 4);
        } else {
            h50Var = new h50((byte) 18);
        }
        return h50Var.mo5505i((q50) this.f33259b, jSONObject);
    }

    /* JADX INFO: renamed from: o */
    public me3 m12238o(CharSequence charSequence) {
        charSequence.getClass();
        me3 me3Var = new me3((byte) 1);
        me3Var.f24840c = this;
        me3Var.f24839b = charSequence;
        VarHandle.storeStoreFence();
        return me3Var;
    }

    @Override // p000.w33
    public void onComplete(nr6 nr6Var) {
        Exception excM8823g = nr6Var.m8823g();
        if (excM8823g != null) {
            ((b70) this.f33259b).resumeWith(k43.m7389n(excM8823g));
            return;
        }
        boolean z = nr6Var.f26060d;
        b70 b70Var = (b70) this.f33259b;
        if (z) {
            b70Var.mo115m(null);
        } else {
            b70Var.resumeWith(nr6Var.m8824h());
        }
    }

    @Override // p000.InterfaceC1161sx
    public void onConnectionFailed(lk0 lk0Var) {
        ((st1) this.f33259b).onConnectionFailed(lk0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        uq3 uq3Var;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) i20.m6592q(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        w42[] w42VarArr = new w42[ports.length];
        boolean z2 = false;
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            w42 w42Var = new w42((byte) 22, z2);
            w42Var.f33090b = (WebMessagePortBoundaryInterface) i20.m6592q(WebMessagePortBoundaryInterface.class, invocationHandler3);
            w42VarArr[i] = w42Var;
        }
        if (kz4.f23639a.mo7351a()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) i20.m6592q(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                uq3Var = null;
                if (type == 1) {
                    byte[] asArrayBuffer = webMessagePayloadBoundaryInterface.getAsArrayBuffer();
                    uq3 uq3Var2 = new uq3();
                    Objects.requireNonNull(asArrayBuffer);
                    uq3Var2.f32103a = null;
                    uq3Var2.f32104b = true;
                    VarHandle.storeStoreFence();
                    uq3Var = uq3Var2;
                }
            } else {
                uq3Var = new uq3(webMessagePayloadBoundaryInterface.getAsString());
            }
        } else {
            uq3Var = new uq3(webMessageBoundaryInterface.getData());
        }
        if (uq3Var != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) i20.m6592q(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            sj0 sj0Var = new sj0((byte) 2);
            sj0Var.f30325b = jsReplyProxyBoundaryInterface;
            VarHandle.storeStoreFence();
            C0200km c0200km = (C0200km) ((C0310ra) this.f33259b).f10609a;
            boolean z3 = uq3Var.f32104b;
            if (z3) {
                throw new IllegalStateException(zi4.m13623w(new StringBuilder("Wrong data accessor type detected. "), z3 ? !z3 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got String"));
            }
            String str = uq3Var.f32103a;
            c0200km.getClass();
            try {
                JSONObject jSONObject = new JSONObject(str);
                ((qi5) c0200km.f6401b).mo1284a(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
            } catch (JSONException e) {
                Log.e("OMIDLIB", "Error parsing JS message", e);
            }
        }
    }

    @Override // p000.e43
    public void onSuccess(Object obj) {
        ((li4) ((bt5) this.f33259b).f15596b).f24059a.m8831o();
    }

    /* JADX INFO: renamed from: p */
    public void m12239p(int i, Object obj, zv5 zv5Var) {
        n83 n83Var = (n83) this.f33259b;
        iv5 iv5Var = (iv5) obj;
        n83Var.m8619w(i, 2);
        n83Var.m8621y(iv5Var.mo6948b(zv5Var));
        zv5Var.mo9298i(iv5Var, this);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return ((rz4) this.f33259b).f29756b;
    }

    public /* synthetic */ wd3(Object obj, byte b) {
        this.f33258a = b;
        this.f33259b = obj;
    }

    public /* synthetic */ wd3(byte b) {
        this.f33258a = b;
    }
}
