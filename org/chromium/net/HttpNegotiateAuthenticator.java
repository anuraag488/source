package org.chromium.net;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Locale;
import p000.AbstractC0581dn;
import p000.i20;
import p000.qh6;
import p000.x06;
import p000.zb6;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    public HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    public static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle bundle, qh6 qh6Var) {
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i = -9;
        switch (bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        AbstractC0768N.M0s8NeYn(qh6Var.f28484a, i, bundle.getString("authtoken"));
    }

    private void requestTokenWithActivity(Context context, Activity activity, qh6 qh6Var, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", $assertionsDisabled)) {
            Locale locale = Locale.US;
            Log.e("cn_net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: android.permission.GET_ACCOUNTS permission not granted. Aborting authentication");
            AbstractC0768N.M0s8NeYn(qh6Var.f28484a, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            return;
        }
        AccountManager accountManager = qh6Var.f28485b;
        String str = this.mAccountType;
        String str2 = qh6Var.f28487d;
        Bundle bundle = qh6Var.f28486c;
        zb6 zb6Var = new zb6((byte) 1);
        zb6Var.f35936c = this;
        zb6Var.f35935b = qh6Var;
        accountManager.getAuthTokenByFeatures(str, str2, strArr, activity, null, bundle, zb6Var, new Handler(i20.m6575J().getLooper()));
    }

    private void requestTokenWithoutActivity(Context context, qh6 qh6Var, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            Log.e("cn_net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            AbstractC0768N.M0s8NeYn(qh6Var.f28484a, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            return;
        }
        AccountManager accountManager = qh6Var.f28485b;
        String str = this.mAccountType;
        zb6 zb6Var = new zb6((byte) 0);
        zb6Var.f35936c = this;
        zb6Var.f35935b = qh6Var;
        VarHandle.storeStoreFence();
        accountManager.getAccountsByTypeAndFeatures(str, strArr, zb6Var, new Handler(i20.m6575J().getLooper()));
    }

    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = x06.f33904a;
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            bundle.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        bundle.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z);
        AccountManager accountManager = AccountManager.get(context);
        String strConcat = HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE.concat(String.valueOf(str));
        qh6 qh6Var = new qh6();
        qh6Var.f28484a = j;
        qh6Var.f28485b = accountManager;
        qh6Var.f28486c = bundle;
        qh6Var.f28487d = strConcat;
        VarHandle.storeStoreFence();
        HashMap map = AbstractC0581dn.f17200a;
        requestTokenWithoutActivity(context, qh6Var, strArr);
    }

    public boolean lacksPermission(Context context, String str, boolean z) {
        if (z || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return $assertionsDisabled;
        }
        return true;
    }
}
