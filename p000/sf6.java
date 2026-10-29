package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sf6 extends e26 {

    /* JADX INFO: renamed from: g */
    public static final String f30236g = e26.class.getSimpleName();

    /* JADX INFO: renamed from: h */
    public static boolean f30237h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m10746a(v76 v76Var, String str, Collection collection, f36 f36Var, int i, ir6 ir6Var, CronetException cronetException) {
        qr0 qr0Var = new qr0();
        qr0Var.f28707a = -1L;
        qr0Var.f28708b = -1L;
        qr0Var.f28709c = -1L;
        qr0Var.f28710d = -1L;
        qr0Var.f28711e = -1L;
        qr0Var.f28712f = -1L;
        qr0Var.f28713g = -1L;
        qr0Var.f28714h = -1L;
        qr0Var.f28715i = -1L;
        qr0Var.f28716j = -1L;
        qr0Var.f28717k = -1L;
        qr0Var.f28718l = -1L;
        qr0Var.f28719m = -1L;
        qr0Var.f28722p = 0L;
        qr0Var.f28723q = 0L;
        qr0Var.f28720n = null;
        qr0Var.f28721o = null;
        VarHandle.storeStoreFence();
        sf6 sf6Var = new sf6();
        sf6Var.f17650a = str;
        sf6Var.f17651b = collection;
        sf6Var.f17652c = qr0Var;
        sf6Var.f17653d = i;
        sf6Var.f17654e = ir6Var;
        sf6Var.f17655f = cronetException;
        VarHandle.storeStoreFence();
        v76Var.getClass();
        ArrayList arrayList = new ArrayList();
        Map map = v76Var.f32454b;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (f36Var != null) {
            arrayList.add(f36Var);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f36 f36Var2 = (f36) arrayList.get(i2);
            try {
                Executor executor = f36Var2.f18722a.getExecutor();
                ar1 ar1Var = new ar1((byte) 18);
                ar1Var.f14798b = f36Var2;
                ar1Var.f14799c = sf6Var;
                VarHandle.storeStoreFence();
                executor.execute(ar1Var);
            } catch (RejectedExecutionException e) {
                Log.e("cn_HttpEngineWrapper", "Exception posting task to executor", e);
            }
        }
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!f30237h) {
            Log.i("cn_".concat(f30236g), "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            f30237h = true;
        }
        return this.f17652c;
    }
}
