package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import org.chromium.net.C0995R;
import p000.du5;
import p000.ep6;
import p000.gq6;
import p000.k26;
import p000.vt5;
import p000.wp5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class HsdpShimActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public String f16299a = null;

    /* JADX INFO: renamed from: b */
    public boolean f16300b = false;

    /* JADX INFO: renamed from: a */
    public final void m4070a(boolean z) {
        HashMap map;
        vt5 vt5Var;
        if (isFinishing()) {
            Log.w("HsdpShimActivity", "Activity is finishing, ignoring safeShowServiceBasedHsdp.");
            return;
        }
        try {
            IBinder windowToken = getWindow().getDecorView().getWindowToken();
            if (windowToken == null) {
                Log.e("HsdpShimActivity", "windowToken is null, finishing shim activity.");
                finish();
                return;
            }
            Intent intent = getIntent();
            if (intent == null) {
                Log.e("HsdpShimActivity", "Missing required extras in showServiceBasedHsdp, finishing shim activity.");
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra("target_package_name");
            String stringExtra2 = intent.getStringExtra("referrer");
            String stringExtra3 = intent.getStringExtra("deeplink_url");
            if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
                ep6 ep6VarM6075M = gq6.m6075M(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
                if (!z && stringExtra.equals(this.f16299a) && (vt5Var = (vt5) ((wp5) ep6VarM6075M).f33585c.get(stringExtra)) != null && vt5Var.f32869a == 2) {
                    if (Log.isLoggable("HsdpShimActivity", 4)) {
                        Log.i("HsdpShimActivity", "HSDP is already showing for " + stringExtra + ", ignore.");
                        return;
                    }
                    return;
                }
                this.f16299a = stringExtra;
                this.f16300b = false;
                boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
                long longExtra = intent.getLongExtra("request_timestamp_ms", 0L);
                byte[] byteArrayExtra = intent.getByteArrayExtra("config_proto_bytes");
                Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
                if (bundleExtra != null) {
                    map = new HashMap();
                    for (String str : bundleExtra.keySet()) {
                        String string = bundleExtra.getString(str);
                        map.put(str, string == null ? "" : string);
                    }
                } else {
                    map = null;
                }
                du5 du5Var = new du5();
                du5Var.f17416a = stringExtra;
                du5Var.f17417b = stringExtra2;
                du5Var.f17418c = map;
                du5Var.f17419d = this;
                VarHandle.storeStoreFence();
                ((wp5) ep6VarM6075M).m12354a(stringExtra, stringExtra3, windowToken, k26.m7361c(this), k26.m7360b(this), booleanExtra, z, longExtra, du5Var, byteArrayExtra);
                return;
            }
            Log.e("HsdpShimActivity", "Missing required extras in showServiceBasedHsdp, finishing shim activity.");
            finish();
        } catch (Exception e) {
            Log.e("HsdpShimActivity", "Failed to show service based HSDP, finishing shim activity.", e);
            this.f16299a = null;
            this.f16300b = false;
            finish();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("HsdpShimActivity", "shim activity onAttachedToWindow");
        if (isFinishing()) {
            Log.w("HsdpShimActivity", "Activity is finishing, ignoring onAttachedToWindow.");
        } else {
            m4070a(false);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.i("HsdpShimActivity", "shim activity onConfigurationChanged");
        if (isFinishing()) {
            Log.w("HsdpShimActivity", "Activity is finishing, ignoring onConfigurationChanged.");
        } else {
            m4070a(true);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || intent.getStringExtra("target_package_name") == null || intent.getStringExtra("referrer") == null || intent.getStringExtra("deeplink_url") == null) {
            Log.e("HsdpShimActivity", "Missing required intent extras in onCreate, finishing shim activity.");
            finish();
            return;
        }
        try {
            setContentView(C0995R.layout.hsdp_shim_activity);
            Window window = getWindow();
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        } catch (Exception e) {
            Log.e("HsdpShimActivity", "Failed to initialize window in onCreate, finishing shim activity.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Log.i("HsdpShimActivity", "shim activity onDestroy");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("HsdpShimActivity", "shim activity onNewIntent");
        if (isFinishing()) {
            Log.w("HsdpShimActivity", "Activity is finishing, ignoring onNewIntent.");
            return;
        }
        if (intent == null || intent.getStringExtra("target_package_name") == null || intent.getStringExtra("referrer") == null || intent.getStringExtra("deeplink_url") == null) {
            Log.w("HsdpShimActivity", "Received intent without required extras in onNewIntent, finishing shim activity.");
            finish();
        } else {
            setIntent(intent);
            m4070a(false);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        Log.i("HsdpShimActivity", "shim activity onPause");
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Log.i("HsdpShimActivity", "shim activity onResume");
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Log.i("HsdpShimActivity", "shim activity onStart");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        Log.i("HsdpShimActivity", "shim activity onStop");
    }
}
