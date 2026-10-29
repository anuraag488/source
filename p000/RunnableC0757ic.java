package p000;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: renamed from: ic */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0757ic implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21252a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f21253b;

    public /* synthetic */ RunnableC0757ic(byte b) {
        this.f21252a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f21252a;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f21253b;
        switch (b) {
            case 0:
                C0461ao c0461ao = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30121i;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c0461ao.isEmpty()) {
                    try {
                        ((wp1) c0461ao.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC1140sc.f30150w0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.m10603H(motionEvent);
                    return;
                } else {
                    C1077qn.m9989o("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            default:
                ViewTreeObserverOnGlobalLayoutListenerC1140sc.m10593k(viewTreeObserverOnGlobalLayoutListenerC1140sc.getRoot());
                return;
        }
    }
}
