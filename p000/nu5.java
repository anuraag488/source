package p000;

import ads_mobile_sdk.v31;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nu5 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26103a = 2;

    /* JADX INFO: renamed from: b */
    public Object f26104b;

    public /* synthetic */ nu5(ru5 ru5Var) {
        Objects.requireNonNull(ru5Var);
        this.f26104b = ru5Var;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).doUpdateVisitedHistory(webView, str, z);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onFormResubmission(webView, message, message2);
                break;
            default:
                super.onFormResubmission(webView, message, message2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f26103a) {
            case 0:
                ru5 ru5Var = (ru5) this.f26104b;
                int i = ru5.f29646d;
                if (str != null && str.startsWith("consent://")) {
                    ru5Var.f29648b.m13169h(str);
                    break;
                }
                break;
            case 1:
            default:
                super.onLoadResource(webView, str);
                break;
            case 2:
                ((WebViewClient) this.f26104b).onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onPageCommitVisible(webView, str);
                break;
            default:
                super.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f26103a) {
            case 0:
                ru5 ru5Var = (ru5) this.f26104b;
                if (!ru5Var.f29649c) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    ru5Var.f29649c = true;
                }
                break;
            case 1:
            default:
                super.onPageFinished(webView, str);
                break;
            case 2:
                ((WebViewClient) this.f26104b).onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onReceivedClientCertRequest(webView, clientCertRequest);
                break;
            default:
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f26103a) {
            case 0:
                C1372yl c1372yl = ((ru5) this.f26104b).f29648b;
                c1372yl.getClass();
                Locale locale = Locale.US;
                ((ts5) c1372yl.f35310g).m11131c(new n56(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
                break;
            case 1:
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
            case 2:
                ((WebViewClient) this.f26104b).onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
            default:
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onReceivedLoginRequest(webView, str, str2, str3);
                break;
            default:
                super.onReceivedLoginRequest(webView, str, str2, str3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f26103a) {
            case 0:
                if (webView != null) {
                    String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : "crashed";
                    Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            case 1:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 2:
                return ((WebViewClient) this.f26104b).onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onScaleChanged(webView, f, f2);
                break;
            default:
                super.onScaleChanged(webView, f, f2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onUnhandledKeyEvent(webView, keyEvent);
                break;
            default:
                super.onUnhandledKeyEvent(webView, keyEvent);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f26103a) {
            case 2:
                return ((WebViewClient) this.f26104b).shouldInterceptRequest(webView, webResourceRequest);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f26103a) {
            case 2:
                return ((WebViewClient) this.f26104b).shouldOverrideKeyEvent(webView, keyEvent);
            default:
                return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f26103a) {
            case 0:
                String string = webResourceRequest.getUrl().toString();
                ru5 ru5Var = (ru5) this.f26104b;
                int i = ru5.f29646d;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                ru5Var.f29648b.m13169h(string);
                return true;
            case 1:
                ((v31) this.f26104b).f12585a.m1142a(webResourceRequest.getUrl());
                return true;
            default:
                if (y62.m12979l(webResourceRequest.getUrl().toString())) {
                    return true;
                }
                return ((WebViewClient) this.f26104b).shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public nu5(v31 v31Var) {
        this.f26104b = v31Var;
    }

    public /* synthetic */ nu5() {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.f26103a) {
            case 2:
                return ((WebViewClient) this.f26104b).shouldInterceptRequest(webView, str);
            default:
                return super.shouldInterceptRequest(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f26103a) {
            case 2:
                ((WebViewClient) this.f26104b).onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f26103a) {
            case 0:
                ru5 ru5Var = (ru5) this.f26104b;
                int i = ru5.f29646d;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                ru5Var.f29648b.m13169h(str);
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (y62.m12979l(str)) {
                    return true;
                }
                return ((WebViewClient) this.f26104b).shouldOverrideUrlLoading(webView, str);
        }
    }
}
