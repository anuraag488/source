package p000;

import ads_mobile_sdk.vx3;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cj5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vx3 f16068a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Thread.UncaughtExceptionHandler f16069b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        vx3 vx3Var = this.f16068a;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16069b;
        try {
            vx3Var.m2571a(th);
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable unused) {
            if (uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
