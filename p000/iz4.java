package p000;

import ads_mobile_sdk.C0310ra;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class iz4 {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f21911a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f21911a = new WeakHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m6973a(WebView webView, String str, HashSet hashSet, C0310ra c0310ra) {
        if (!kz4.f23641c.mo7351a()) {
            throw kz4.m7754a();
        }
        oz4 oz4VarM6974b = m6974b(webView);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterface = oz4VarM6974b.f27247a;
        wd3 wd3Var = new wd3((byte) 20);
        wd3Var.f33259b = c0310ra;
        VarHandle.storeStoreFence();
        webViewProviderBoundaryInterface.addWebMessageListener(str, strArr, i20.m6594s(wd3Var));
    }

    /* JADX INFO: renamed from: b */
    public static oz4 m6974b(WebView webView) {
        if (!kz4.f23649k.mo7351a()) {
            return new oz4(mz4.f25346a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f21911a;
        oz4 oz4Var = (oz4) weakHashMap.get(webView);
        if (oz4Var != null) {
            return oz4Var;
        }
        oz4 oz4Var2 = new oz4(mz4.f25346a.createWebView(webView));
        weakHashMap.put(webView, oz4Var2);
        return oz4Var2;
    }

    /* JADX INFO: renamed from: c */
    public static void m6975c(WebView webView, Executor executor, r50 r50Var) {
        if (!kz4.f23648j.mo7351a()) {
            throw kz4.m7754a();
        }
        oz4 oz4VarM6974b = m6974b(webView);
        final byte b = 0;
        ValueCallback<Void> valueCallback = new ValueCallback() { // from class: nz4
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                switch (b) {
                    case 0:
                        break;
                    default:
                        new g82("Prerender operation failed", (Throwable) obj);
                        break;
                }
            }
        };
        VarHandle.storeStoreFence();
        final byte b2 = 1;
        ValueCallback<Throwable> valueCallback2 = new ValueCallback() { // from class: nz4
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                switch (b2) {
                    case 0:
                        break;
                    default:
                        new g82("Prerender operation failed", (Throwable) obj);
                        break;
                }
            }
        };
        VarHandle.storeStoreFence();
        oz4VarM6974b.f27247a.prerenderUrl("https://googlemobileads.com/warmup", null, executor, valueCallback, valueCallback2);
    }
}
