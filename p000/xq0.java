package p000;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public js1 f34531a;

    /* JADX INFO: renamed from: b */
    public C1372yl f34532b;

    /* JADX INFO: renamed from: c */
    public Thread.UncaughtExceptionHandler f34533c;

    /* JADX INFO: renamed from: d */
    public sp0 f34534d;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f34535e;

    /* JADX INFO: renamed from: a */
    public final boolean m12746a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f34534d.m10889b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f34533c;
        AtomicBoolean atomicBoolean = this.f34535e;
        atomicBoolean.set(true);
        try {
            try {
                if (m12746a(thread, th)) {
                    this.f34531a.m7281r(this.f34532b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                ig1 ig1Var = ig1.f21399w;
                ig1Var.m6799n("An error occurred in the uncaught exception handler", e);
                if (uncaughtExceptionHandler != null) {
                    ig1Var.m6798m("Completed exception processing. Invoking default exception handler.", null);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    ig1Var.m6798m("Completed exception processing, but no default exception handler.", null);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
