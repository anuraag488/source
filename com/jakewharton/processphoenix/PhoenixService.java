package com.jakewharton.processphoenix;

import android.app.IntentService;
import android.content.Intent;
import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class PhoenixService extends IntentService {
    public PhoenixService() {
        super("PhoenixService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        Process.killProcess(intent.getIntExtra("phoenix_main_process_pid", -1));
        Intent intent2 = (Intent) intent.getParcelableExtra("phoenix_restart_intent", Intent.class);
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        startForegroundService(intent2);
        Runtime.getRuntime().exit(0);
    }
}
