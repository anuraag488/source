package p000;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: op */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0991op extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26932a = 0;

    public /* synthetic */ C0991op(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f26932a) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C1116rp.f29488j;
                reentrantLock.lock();
                try {
                    C1116rp c1116rpM4307h = d24.m4307h();
                    if (c1116rpM4307h == C1116rp.f29487i) {
                        C1116rp.f29487i = null;
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c1116rpM4307h != null) {
                            c1116rpM4307h.mo4413j();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ C0991op(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
