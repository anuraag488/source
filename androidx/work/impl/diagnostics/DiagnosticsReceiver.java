package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p000.g25;
import p000.tt2;
import p000.wn2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f14709a = wn2.m12327g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        wn2 wn2VarM12326e = wn2.m12326e();
        String str = f14709a;
        wn2VarM12326e.m12328b(str, "Requesting diagnostics");
        try {
            g25.m5888b(context).m5890a(new tt2(DiagnosticsWorker.class).m11150a());
        } catch (IllegalStateException e) {
            wn2.m12326e().m12330d(str, "WorkManager is not initialized", e);
        }
    }
}
