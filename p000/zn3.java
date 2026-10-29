package p000;

import android.os.SystemClock;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zn3 {

    /* JADX INFO: renamed from: a */
    public double f36199a;

    /* JADX INFO: renamed from: b */
    public double f36200b;

    /* JADX INFO: renamed from: c */
    public long f36201c;

    /* JADX INFO: renamed from: d */
    public long f36202d;

    /* JADX INFO: renamed from: e */
    public int f36203e;

    /* JADX INFO: renamed from: f */
    public ArrayBlockingQueue f36204f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f36205g;

    /* JADX INFO: renamed from: h */
    public C1122rv f36206h;

    /* JADX INFO: renamed from: i */
    public nh3 f36207i;

    /* JADX INFO: renamed from: j */
    public int f36208j;

    /* JADX INFO: renamed from: k */
    public long f36209k;

    /* JADX INFO: renamed from: a */
    public final int m13644a() {
        if (this.f36209k == 0) {
            this.f36209k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f36209k) / this.f36201c);
        int size = this.f36204f.size();
        int i = this.f36203e;
        int i2 = this.f36208j;
        int iMin = size == i ? Math.min(100, i2 + iCurrentTimeMillis) : Math.max(0, i2 - iCurrentTimeMillis);
        if (this.f36208j != iMin) {
            this.f36208j = iMin;
            this.f36209k = System.currentTimeMillis();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    public final void m13645b(C0809js c0809js, li4 li4Var) {
        String str = "Sending report through Google DataTransport: " + c0809js.f22550b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        boolean z = SystemClock.elapsedRealtime() - this.f36202d < 2000;
        C1122rv c1122rv = this.f36206h;
        C1417zt c1417zt = new C1417zt(c0809js.f22549a, ag3.f14487c);
        xn3 xn3Var = new xn3();
        xn3Var.f34461a = this;
        xn3Var.f34462b = li4Var;
        xn3Var.f34463c = z;
        xn3Var.f34464d = c0809js;
        VarHandle.storeStoreFence();
        c1122rv.m10464w(c1417zt, xn3Var);
    }
}
