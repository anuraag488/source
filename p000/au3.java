package p000;

import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class au3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14879a;

    /* JADX INFO: renamed from: b */
    public Runnable f14880b;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14879a) {
            case 0:
                try {
                    this.f14880b.run();
                } catch (Exception e) {
                    se0.m10739t("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                this.f14880b.run();
                break;
            case 2:
                this.f14880b.run();
                break;
            case 3:
                try {
                    this.f14880b.run();
                } catch (RuntimeException e2) {
                    Log.e("ServiceConnMgrImpl", "error caused by ", e2);
                    return;
                }
                break;
            default:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                this.f14880b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f14879a) {
            case 1:
                return this.f14880b.toString();
            case 2:
                return this.f14880b.toString();
            default:
                return super.toString();
        }
    }
}
