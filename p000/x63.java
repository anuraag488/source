package p000;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class x63 {

    /* JADX INFO: renamed from: a */
    public static final String f34026a = wn2.m12327g("PackageManagerHelper");

    /* JADX INFO: renamed from: b */
    public static final HashMap f34027b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final void m12495a(PackageManager packageManager, ComponentName componentName, boolean z, mq1 mq1Var) {
        String str = f34026a;
        try {
            if (z == ((Boolean) mq1Var.invoke(packageManager, componentName)).booleanValue()) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
            wn2.m12326e().m12328b(str, componentName.getClassName() + " " + (z ? "enabled" : "disabled"));
        } catch (Exception e) {
            wn2 wn2VarM12326e = wn2.m12326e();
            String str2 = componentName.getClassName() + " could not be " + (z ? "enabled" : "disabled");
            if (wn2VarM12326e.f33518a <= 3) {
                Log.d(str, str2, e);
            }
        }
    }
}
