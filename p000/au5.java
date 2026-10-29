package p000;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class au5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ px4 f14886a;

    @Override // java.lang.Runnable
    public final void run() {
        ry5.m10503a("CronetUrlRequest#getStatus running callback");
        try {
            this.f14886a.onStatus(-1);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
