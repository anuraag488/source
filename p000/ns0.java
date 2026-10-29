package p000;

import android.os.StrictMode;
import java.lang.invoke.VarHandle;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f26065e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f26066a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f26067b;

    /* JADX INFO: renamed from: c */
    public final byte f26068c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f26069d;

    /* JADX WARN: Multi-variable type inference failed */
    public ns0(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f26067b = str;
        this.f26068c = i;
        this.f26069d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 8);
        runnableC1285w9.f33164b = this;
        runnableC1285w9.f33165c = runnable;
        VarHandle.storeStoreFence();
        Thread threadNewThread = f26065e.newThread(runnableC1285w9);
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f26067b + " Thread #" + this.f26066a.getAndIncrement());
        return threadNewThread;
    }
}
