package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n12 implements zl2 {

    /* JADX INFO: renamed from: b */
    public static final n12 f25382b = new n12(null);

    /* JADX INFO: renamed from: c */
    public static final Logger f25383c = Logger.getLogger(n12.class.getName());

    /* JADX INFO: renamed from: a */
    public final Object f25384a;

    public n12(Object obj) {
        this.f25384a = obj;
    }

    @Override // p000.zl2
    /* JADX INFO: renamed from: a */
    public final void mo6454a(Runnable runnable, Executor executor) {
        dt0.m4718t(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f25383c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f25384a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f25384a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f25384a;
    }
}
