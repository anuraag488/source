package p000;

import android.content.ContentProvider;
import android.os.SystemClock;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ng1 extends ContentProvider {

    /* JADX INFO: renamed from: a */
    public static final C1344xu f25769a;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f25770b;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1344xu c1344xu = new C1344xu();
        c1344xu.f34622a = jCurrentTimeMillis;
        c1344xu.f34623b = jElapsedRealtime;
        c1344xu.f34624c = jUptimeMillis;
        VarHandle.storeStoreFence();
        f25769a = c1344xu;
        f25770b = new AtomicBoolean(false);
    }
}
