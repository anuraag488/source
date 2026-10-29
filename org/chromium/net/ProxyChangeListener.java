package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.util.Locale;
import p000.f51;
import p000.hn5;
import p000.n36;
import p000.o30;
import p000.x06;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public class ProxyReceiver extends BroadcastReceiver {
        public /* synthetic */ ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            int i = f51.f18769a;
            n36.f25429a.m11148I(0, "Net.ProxyChangeListener.ReflectedCall");
            if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                ProxyChangeListener.this.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProxyChangeListener.this.proxySettingsChanged(ProxyChangeListener.extractNewProxy(intent));
                    }
                });
            }
        }
    }

    private ProxyChangeListener() {
        Looper looperMyLooper = Looper.myLooper();
        this.mLooper = looperMyLooper;
        this.mHandler = new Handler(looperMyLooper);
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static hn5 extractNewProxy(Intent intent) {
        int i = f51.f18769a;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return hn5.m6459a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private hn5 getProxyConfig(Intent intent) {
        int i = f51.f18769a;
        hn5 hn5VarM6459a = hn5.m6459a(((ConnectivityManager) x06.f33904a.getSystemService("connectivity")).getDefaultProxy());
        if (hn5VarM6459a == null) {
            return hn5.f20731e;
        }
        if (!hn5VarM6459a.f20732a.equals("localhost") || hn5VarM6459a.f20733b != -1) {
            return hn5VarM6459a;
        }
        hn5 hn5VarExtractNewProxy = extractNewProxy(intent);
        Locale locale = Locale.US;
        Log.i("cn_ProxyChangeListener", "configFromConnectivityManager = " + hn5VarM6459a + ", configFromIntent = " + hn5VarExtractNewProxy);
        if (hn5VarExtractNewProxy == null) {
            return null;
        }
        return new hn5(hn5VarExtractNewProxy.f20732a, hn5VarM6459a.f20735d, hn5VarExtractNewProxy.f20733b, hn5VarM6459a.f20734c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDelegateForTesting$0(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$0(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return $assertionsDisabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(hn5 hn5Var) {
        int i = f51.f18769a;
        Delegate delegate = this.mDelegate;
        if (delegate != null) {
            delegate.proxySettingsChanged();
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        if (hn5Var != null) {
            AbstractC0768N.MyoFZt$2(j, hn5Var.f20732a, hn5Var.f20733b, hn5Var.f20734c, hn5Var.f20735d);
        } else {
            AbstractC0768N.MCIk73GZ(j);
        }
    }

    private void registerBroadcastReceiver() {
        int i;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (!Process.isSdkSandbox()) {
            x06.f33904a.registerReceiver(this.mProxyReceiver, new IntentFilter(), null, null, 4);
        }
        o30 o30Var = new o30((byte) 2);
        o30Var.f26313b = this;
        VarHandle.storeStoreFence();
        this.mRealProxyReceiver = o30Var;
        x06.f33904a.registerReceiver(o30Var, intentFilter, null, null, 0);
        long jElapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000;
        if (jElapsedRealtimeNanos2 > 2147483647L) {
            i = Integer.MAX_VALUE;
        } else {
            i = jElapsedRealtimeNanos2 < -2147483648L ? Integer.MIN_VALUE : (int) jElapsedRealtimeNanos2;
        }
        n36.f25429a.m11148I(i, "Net.ProxyChangeListener.RegistrationTime");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    private void unregisterBroadcastReceiver() {
        x06.f33904a.unregisterReceiver(this.mProxyReceiver);
        BroadcastReceiver broadcastReceiver = this.mRealProxyReceiver;
        if (broadcastReceiver != null) {
            x06.f33904a.unregisterReceiver(broadcastReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public void start(long j) {
        int i = f51.f18769a;
        this.mNativePtr = j;
        registerBroadcastReceiver();
    }

    public void stop() {
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$updateProxyConfigFromConnectivityManager$0(intent);
            }
        });
    }

    private void assertOnThread() {
    }
}
