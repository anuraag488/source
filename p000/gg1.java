package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f19778b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public Context f19779a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (hg1.f20543k) {
            try {
                Iterator it = ((C0769io) hg1.f20544l.values()).iterator();
                while (it.hasNext()) {
                    ((hg1) it.next()).m6391e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f19779a.unregisterReceiver(this);
    }
}
