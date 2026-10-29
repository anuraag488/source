package p000;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17381a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f17382b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Runnable f17383c;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17381a) {
            case 0:
                ry5.m10503a("CronetUploadDataStream#postTaskToExecutor " + this.f17382b + " running callback");
                try {
                    this.f17383c.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                ry5.m10503a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + this.f17382b + " running callback");
                try {
                    this.f17383c.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
