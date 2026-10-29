package p000;

import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ew5 {

    /* JADX INFO: renamed from: a */
    public static Integer f18548a;

    /* JADX INFO: renamed from: b */
    public static Boolean f18549b;

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX INFO: renamed from: a */
    public static int m5417a() {
        int i;
        Integer numValueOf = f18548a;
        if (numValueOf == null) {
            String str = SystemProperties.get("debug.cronet.trace_netlog", "heavily_redacted");
            boolean z = true;
            int i2 = 0;
            if (str.equals("heavily_redacted")) {
                i = 0;
            } else if (str.equals("on")) {
                i = 1;
            } else if (str.equals("include_sensitive")) {
                i = 2;
            } else if (str.equals("everything")) {
                i = 3;
            } else {
                Locale locale = Locale.US;
                Log.w("cn_DebugFlags", "Unknown value for debug.cronet.trace_netlog system property, ignoring: ".concat(str));
                i = 0;
            }
            if (i <= 0) {
                i2 = i;
            } else {
                Boolean boolValueOf = f18549b;
                if (boolValueOf == null) {
                    String str2 = Build.TYPE;
                    if (!str2.equals("userdebug") && !str2.equals("eng") && (2 & x06.f33904a.getApplicationInfo().flags) == 0) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                    f18549b = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    i2 = i;
                } else {
                    Locale locale2 = Locale.US;
                    Log.w("cn_DebugFlags", "Ignoring requested Cronet trace netlog capture mode (debug.cronet.trace_netlog=" + str + ") because neither the device nor app are debuggable");
                }
            }
            numValueOf = Integer.valueOf(i2);
            f18548a = numValueOf;
        }
        return numValueOf.intValue();
    }
}
