package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aa6 extends Thread {

    /* JADX INFO: renamed from: a */
    public final Object f221a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f222b;

    /* JADX INFO: renamed from: c */
    public boolean f223c = false;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ea6 f224d;

    public aa6(ea6 ea6Var, String str, BlockingQueue blockingQueue) {
        this.f224d = ea6Var;
        y42.m12854a0(blockingQueue);
        this.f221a = new Object();
        this.f222b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m161a() {
        ea6 ea6Var = this.f224d;
        synchronized (ea6Var.f17937m) {
            try {
                if (!this.f223c) {
                    ea6Var.f17938n.release();
                    ea6Var.f17937m.notifyAll();
                    if (this == ea6Var.f17931g) {
                        ea6Var.f17931g = null;
                    } else if (this == ea6Var.f17932h) {
                        ea6Var.f17932h = null;
                    } else {
                        d76 d76Var = ((oa6) ea6Var.f36084a).f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16835j.m12504a("Current scheduler thread is neither worker nor network");
                    }
                    this.f223c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f224d.f17938n.acquire();
                z = true;
            } catch (InterruptedException e) {
                d76 d76Var = ((oa6) this.f224d.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f222b;
                y96 y96Var = (y96) blockingQueue.poll();
                if (y96Var != null) {
                    Process.setThreadPriority(true != y96Var.f35057b ? 10 : threadPriority);
                    y96Var.run();
                } else {
                    Object obj = this.f221a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f224d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                d76 d76Var2 = ((oa6) this.f224d.f36084a).f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16838m.m12505b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f224d.f17937m) {
                        if (this.f222b.peek() == null) {
                            m161a();
                            m161a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m161a();
            throw th;
        }
    }
}
