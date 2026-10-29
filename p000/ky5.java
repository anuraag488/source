package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ky5 {

    /* JADX INFO: renamed from: a */
    public static final Handler f23626a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final yq0 f23627b;

    static {
        yq0 yq0Var = new yq0();
        yq0Var.f35458b = new AtomicInteger(1);
        yq0Var.f35460d = new WeakReference(null);
        zw0 zw0Var = new zw0((byte) 2);
        zw0Var.f36423b = yq0Var;
        VarHandle.storeStoreFence();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zw0Var);
        yq0Var.f35459c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        VarHandle.storeStoreFence();
        f23627b = yq0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m7752a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        C1077qn.m9989o("Method must be call on main thread.");
    }
}
