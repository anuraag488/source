package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0522cc implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15919a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f15920b;

    public /* synthetic */ C0522cc(byte b) {
        this.f15919a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f15919a;
        ju4 ju4Var = ju4.f22634a;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f15920b;
        switch (b) {
            case 0:
                bl4 textInputService = viewTreeObserverOnGlobalLayoutListenerC1140sc.getTextInputService();
                C0723hf c0723hf = new C0723hf();
                c0723hf.f20523a = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                c0723hf.f20524b = textInputService;
                c0723hf.f20525c = (zo0) obj;
                c0723hf.f20526d = new AtomicReference(null);
                VarHandle.storeStoreFence();
                return c0723hf;
            case 1:
                wp1 wp1Var = (wp1) obj;
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC1140sc.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    wp1Var.invoke();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.getHandler();
                    if (handler2 != null) {
                        RunnableC0683gc runnableC0683gc = new RunnableC0683gc((byte) 0);
                        runnableC0683gc.f19736b = wp1Var;
                        VarHandle.storeStoreFence();
                        handler2.post(runnableC0683gc);
                    }
                }
                return ju4Var;
            case 2:
                ((bl1) viewTreeObserverOnGlobalLayoutListenerC1140sc.getFocusOwner()).m3621g(((mk1) obj).f24973a, false);
                return ju4Var;
            case 3:
                return viewTreeObserverOnGlobalLayoutListenerC1140sc.getSavedStateRegistry();
            case 4:
                return Boolean.valueOf(viewTreeObserverOnGlobalLayoutListenerC1140sc.getScrollCaptureInProgress());
            case 5:
                return viewTreeObserverOnGlobalLayoutListenerC1140sc.getInputModeManager();
            case 6:
                return viewTreeObserverOnGlobalLayoutListenerC1140sc.getTextInputService();
            case 7:
                return viewTreeObserverOnGlobalLayoutListenerC1140sc.getSoftwareKeyboardController();
            case 8:
                return viewTreeObserverOnGlobalLayoutListenerC1140sc.getTextToolbar();
            default:
                return viewTreeObserverOnGlobalLayoutListenerC1140sc.getPointerIconService();
        }
    }
}
