package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o33 {
    private boolean isEnabled;
    private final ArrayList eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public o33(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(q33 q33Var) {
        this.closeables.add(q33Var);
    }

    public final n33 createNavigationEventHandler$activity(p33 p33Var) {
        n33 n33Var = new n33(p33Var, this.isEnabled, 0);
        n33Var.f25420h = this;
        n33Var.f25421i = true;
        VarHandle.storeStoreFence();
        this.eventHandlers.add(n33Var);
        return n33Var;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        boolean zIsTerminated;
        CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList = this.closeables;
        Iterator<AutoCloseable> it = copyOnWriteArrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.eventHandlers;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((n33) obj).m4817f();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else {
                if (!(next instanceof ExecutorService)) {
                    ds3.m4665g();
                    return;
                }
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        ArrayList arrayList = this.eventHandlers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n33 n33Var = (n33) obj;
            n33Var.m4818g(n33Var.f25421i && z);
        }
    }

    public void handleOnBackProgressed(C1233uv c1233uv) {
    }

    public void handleOnBackStarted(C1233uv c1233uv) {
    }

    public void handleOnBackCancelled() {
    }
}
