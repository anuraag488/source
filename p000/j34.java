package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j34 extends Handler {

    /* JADX INFO: renamed from: a */
    public ro0 f21989a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        if (message.what != 3) {
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
            return;
        }
        Bundle data = message.getData();
        if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
            string = "";
        }
        Log.d("SessionLifecycleClient", "Session update received.");
        lb5.m7910S(zp0.m13670b(this.f21989a), null, null, new C0982og(string, (wm0) null, (byte) 24), 3);
    }
}
