package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.g25;
import p000.wn2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f14703a = wn2.m12327g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wn2.m12326e().m12328b(f14703a, "Received intent " + intent);
        try {
            g25 g25VarM5888b = g25.m5888b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            g25VarM5888b.getClass();
            synchronized (g25.f19511m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = g25VarM5888b.f19520i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    g25VarM5888b.f19520i = pendingResultGoAsync;
                    if (g25VarM5888b.f19519h) {
                        pendingResultGoAsync.finish();
                        g25VarM5888b.f19520i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            wn2.m12326e().m12330d(f14703a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
