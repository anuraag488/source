package p000;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gr2 {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m6121A(Exception exc) {
        return exc instanceof HttpException;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m6122B(Exception exc) {
        return exc instanceof QuicException;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m6123C(Exception exc) {
        return exc instanceof NetworkException;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m6124D(Exception exc) {
        return exc instanceof CallbackException;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ SdkSandboxController m6130f(Object obj) {
        return (SdkSandboxController) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ NetworkException m6131g(Exception exc) {
        return (NetworkException) exc;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ QuicException m6132h(Exception exc) {
        return (QuicException) exc;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ Class m6133i() {
        return SdkSandboxController.class;
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m6143s(Exception exc) {
        return exc instanceof InlineExecutionProhibitedException;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m6148x(Exception exc) {
        return exc instanceof HttpException;
    }
}
