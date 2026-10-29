package essentials.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import p000.C0682gb;
import p000.C0946nh;
import p000.lb5;
import p000.ps1;
import p000.qw2;
import p000.r30;
import p000.ro0;
import p000.z44;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EsBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        LinkedHashMap linkedHashMap = r30.f28977a;
        Object objM13332b = linkedHashMap.get(action);
        if (objM13332b == null) {
            objM13332b = z44.m13332b(0, 7, null);
            linkedHashMap.put(action, objM13332b);
        }
        lb5.m7910S(ps1.f27931a, (ro0) C0946nh.f25787l.getValue(), null, new C0682gb((qw2) objM13332b, intent, null, (byte) 4), 2);
    }
}
