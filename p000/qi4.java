package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qi4 {

    /* JADX INFO: renamed from: a */
    public static final String f28511a;

    /* JADX INFO: renamed from: b */
    public static final long f28512b;

    /* JADX INFO: renamed from: c */
    public static final int f28513c;

    /* JADX INFO: renamed from: d */
    public static final int f28514d;

    /* JADX INFO: renamed from: e */
    public static final long f28515e;

    /* JADX INFO: renamed from: f */
    public static final ia5 f28516f;

    static {
        String property;
        int i = ph4.f27610a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f28511a = property;
        f28512b = i20.m6569D("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = ph4.f27610a;
        if (i2 < 2) {
            i2 = 2;
        }
        f28513c = i20.m6570E(i2, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        f28514d = i20.m6570E(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        f28515e = TimeUnit.SECONDS.toNanos(i20.m6569D("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f28516f = ia5.f21224o;
    }
}
