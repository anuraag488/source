package p000;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ba */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0484ba implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15185a;

    public /* synthetic */ RunnableC0484ba(byte b) {
        this.f15185a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15185a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f16209a;
                return;
            case 1:
                cw2 cw2Var = ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30072J0;
                synchronized (cw2Var) {
                    Object[] objArr = cw2Var.f16532a;
                    int i2 = cw2Var.f16533b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) objArr[i3];
                        RunnableC0757ic runnableC0757ic = new RunnableC0757ic((byte) 2);
                        runnableC0757ic.f21253b = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                        VarHandle.storeStoreFence();
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.post(runnableC0757ic);
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3521a() {
    }
}
