package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface WebViewProviderBoundaryInterface {

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Retention(RetentionPolicy.SOURCE)
    public @interface JavaScriptInjectionTime {
        public static final int DOCUMENT_END = 1;
        public static final int DOCUMENT_START = 0;
    }

    InvocationHandler addDocumentStartJavaScript(String str, String[] strArr);

    InvocationHandler addJavaScriptOnEvent(String str, String[] strArr, int i, String str2);

    void addWebMessageListener(String str, String[] strArr, InvocationHandler invocationHandler);

    void addWebMessageListener(String str, String[] strArr, InvocationHandler invocationHandler, String str2);

    void addWebViewNavigationListener(Executor executor, InvocationHandler invocationHandler);

    InvocationHandler[] createWebMessageChannel();

    int getJavaScriptWorld(String str);

    InvocationHandler getProfile();

    WebChromeClient getWebChromeClient();

    WebViewClient getWebViewClient();

    InvocationHandler getWebViewNavigationClient();

    InvocationHandler getWebViewRenderer();

    InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long j, InvocationHandler invocationHandler);

    boolean isAudioMuted();

    InvocationHandler navigate(String str, InvocationHandler invocationHandler);

    void postMessageToMainFrame(InvocationHandler invocationHandler, Uri uri);

    void prerenderUrl(String str, CancellationSignal cancellationSignal, Executor executor, ValueCallback<Void> valueCallback, ValueCallback<Throwable> valueCallback2);

    void prerenderUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler, ValueCallback<Void> valueCallback, ValueCallback<Throwable> valueCallback2);

    void removeWebMessageListener(String str);

    void removeWebMessageListener(String str, String str2);

    void removeWebViewNavigationListener(InvocationHandler invocationHandler);

    void saveState(Bundle bundle, int i, boolean z);

    void setAudioMuted(boolean z);

    void setProfile(String str);

    void setWebViewNavigationClient(InvocationHandler invocationHandler);

    void setWebViewRendererClient(InvocationHandler invocationHandler);
}
