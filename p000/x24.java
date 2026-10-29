package p000;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class x24 {

    /* JADX INFO: renamed from: a */
    public static final String f33946a;

    /* JADX INFO: renamed from: b */
    public static final String f33947b;

    static {
        String processName;
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
        } else {
            processName = Application.getProcessName();
            if (processName == null && (processName = C0638f5.m5551v()) == null) {
                processName = "";
            }
        }
        String strEncodeToString = Base64.encodeToString(processName.getBytes(z80.f35863a), 10);
        f33946a = zi4.m13621u("firebase_session_", strEncodeToString, "_data");
        f33947b = zi4.m13621u("firebase_session_", strEncodeToString, "_settings");
    }
}
