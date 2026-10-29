package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wr5 extends Thread {

    /* JADX INFO: renamed from: a */
    public WeakReference f33663a;

    /* JADX INFO: renamed from: b */
    public long f33664b;

    /* JADX INFO: renamed from: c */
    public CountDownLatch f33665c;

    /* JADX INFO: renamed from: d */
    public boolean f33666d;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0481b7 c0481b7;
        WeakReference weakReference = this.f33663a;
        try {
            if (this.f33665c.await(this.f33664b, TimeUnit.MILLISECONDS) || (c0481b7 = (C0481b7) weakReference.get()) == null) {
                return;
            }
            c0481b7.m3473b();
            this.f33666d = true;
        } catch (InterruptedException unused) {
            C0481b7 c0481b8 = (C0481b7) weakReference.get();
            if (c0481b8 != null) {
                c0481b8.m3473b();
                this.f33666d = true;
            }
        }
    }
}
