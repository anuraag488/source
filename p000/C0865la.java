package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: la */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0865la implements InterfaceC0828ka {

    /* JADX INFO: renamed from: c */
    public static volatile C0865la f23884c;

    /* JADX INFO: renamed from: a */
    public AppMeasurementSdk f23885a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f23886b;

    /* JADX INFO: renamed from: a */
    public final void m7883a(String str, String str2, Bundle bundle) {
        if (!fv5.f19344c.contains(str) && fv5.m5821a(str2, bundle) && fv5.m5822b(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f23885a.logEvent(str, str2, bundle);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ia5 m7884b(String str, z32 z32Var) {
        Object obj;
        bt5 bt5Var;
        yg3 yg3Var;
        ConcurrentHashMap concurrentHashMap = this.f23886b;
        if (!fv5.f19344c.contains(str) && (str.isEmpty() || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null)) {
            AppMeasurementSdk appMeasurementSdk = this.f23885a;
            if ("fiam".equals(str)) {
                yg3Var = new yg3((byte) 19);
                yg3Var.f35216c = z32Var;
                py5 py5Var = new py5((byte) 0);
                py5Var.f28102b = yg3Var;
                VarHandle.storeStoreFence();
                appMeasurementSdk.registerOnMeasurementEventListener(py5Var);
                yg3Var.f35215b = new HashSet();
                VarHandle.storeStoreFence();
            } else if ("clx".equals(str)) {
                bt5Var = new bt5((byte) 8);
                bt5Var.f15596b = z32Var;
                py5 py5Var2 = new py5((byte) 1);
                py5Var2.f28102b = bt5Var;
                VarHandle.storeStoreFence();
                appMeasurementSdk.registerOnMeasurementEventListener(py5Var2);
                VarHandle.storeStoreFence();
            } else {
                obj = null;
            }
            if (obj != null) {
                obj = bt5Var;
                obj = yg3Var;
                concurrentHashMap.put(str, obj);
                return new ia5((byte) 27);
            }
        }
        obj = bt5Var;
        obj = yg3Var;
        return null;
    }
}
