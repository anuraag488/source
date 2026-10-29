package p000;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w63 extends xq1 implements mq1 {

    /* JADX INFO: renamed from: b */
    public static final w63 f33123b = new w63(2, x63.class, "isServiceEnabled", "isServiceEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        PackageManager packageManager = (PackageManager) obj;
        ComponentName componentName = (ComponentName) obj2;
        String str = x63.f34026a;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        boolean zBooleanValue = false;
        if (componentEnabledSetting == 0) {
            HashMap map = x63.f34027b;
            synchronized (map) {
                Boolean bool = (Boolean) map.get(componentName);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 512);
                        if (serviceInfo != null) {
                            zBooleanValue = ((ComponentInfo) serviceInfo).enabled;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        wn2.m12326e().m12333i(x63.f34026a, componentName.getClassName() + " could not be found in manifest", e);
                    }
                    HashMap map2 = x63.f34027b;
                    synchronized (map2) {
                        map2.put(componentName, Boolean.valueOf(zBooleanValue));
                    }
                }
            }
        } else if (componentEnabledSetting == 1) {
            zBooleanValue = true;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
