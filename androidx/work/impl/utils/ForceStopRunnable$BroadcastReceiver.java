package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import p000.cn1;
import p000.wn2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f14715a = wn2.m12327g("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (wn2.m12326e().f33518a <= 2) {
            Log.v(f14715a, "Rescheduling alarm that keeps track of force-stops.");
        }
        String str = cn1.f16136e;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent2.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent2, 167772160);
        long jCurrentTimeMillis = System.currentTimeMillis() + cn1.f16137f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }
}
