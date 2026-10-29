package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tz5 implements yz5 {

    /* JADX INFO: renamed from: b */
    public static final vd3 f31570b = new vd3(tz5.class);

    /* JADX INFO: renamed from: a */
    public Object f31571a;

    @Override // p000.yz5
    /* JADX INFO: renamed from: b */
    public final void mo4845b(Runnable runnable, Executor executor) {
        if (executor == null) {
            xy4.m12782k("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f31570b.m11815a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", c75.m3879k("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f31571a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f31571a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31571a;
    }
}
