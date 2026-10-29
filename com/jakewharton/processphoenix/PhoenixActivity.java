package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class PhoenixActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        Intent[] intentArr = (Intent[]) getIntent().getParcelableArrayListExtra("phoenix_restart_intents").toArray(new Intent[0]);
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        startActivities(intentArr);
        finish();
        Runtime.getRuntime().exit(0);
    }
}
