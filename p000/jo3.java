package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jo3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22471a;

    /* JADX INFO: renamed from: b */
    public Handler f22472b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22471a) {
            case 0:
                Handler handler = this.f22472b;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f22472b.post(runnable);
                return;
        }
    }
}
