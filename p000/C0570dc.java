package p000;

import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: dc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0570dc implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16912a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f16913b;

    public /* synthetic */ C0570dc(byte b) {
        this.f16912a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f16912a;
        int i = 0;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f16913b;
        switch (b) {
            case 0:
                C0689gi c0689gi = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30094M;
                if (c0689gi != null) {
                    int childCount = c0689gi.getChildCount();
                    while (i < childCount) {
                        View childAt = c0689gi.getChildAt(i);
                        AbstractC0492bi abstractC0492bi = childAt instanceof AbstractC0492bi ? (AbstractC0492bi) childAt : null;
                        if (abstractC0492bi != null && abstractC0492bi.isLayoutRequested()) {
                            abstractC0492bi.layout(abstractC0492bi.getLeft(), abstractC0492bi.getTop(), abstractC0492bi.getRight(), abstractC0492bi.getBottom());
                        }
                        i++;
                    }
                }
                return ju4.f22634a;
            case 1:
                if (viewTreeObserverOnGlobalLayoutListenerC1140sc.isAttachedToWindow()) {
                    if (ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30073K0 == null) {
                        RunnableC0484ba runnableC0484ba = new RunnableC0484ba((byte) 1);
                        ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30073K0 = runnableC0484ba;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30070H0 == null) {
                                ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30070H0 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30071I0;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30070H0;
                                declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30071I0 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, runnableC0484ba);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    cw2 cw2Var = ViewTreeObserverOnGlobalLayoutListenerC1140sc.f30072J0;
                    synchronized (cw2Var) {
                        cw2Var.m4200a(viewTreeObserverOnGlobalLayoutListenerC1140sc);
                    }
                }
                return ju4.f22634a;
            case 2:
                Boolean bool = (Boolean) viewTreeObserverOnGlobalLayoutListenerC1140sc.f30135p.getValue();
                bool.getClass();
                return bool;
            case 3:
                an2 an2VarM3052a = an2.m3052a(viewTreeObserverOnGlobalLayoutListenerC1140sc.getConfiguration().getLocales());
                if (an2VarM3052a.f14639a.f15435a.isEmpty()) {
                    an2VarM3052a = an2.m3052a(LocaleList.getDefault());
                }
                bn2 bn2Var = an2VarM3052a.f14639a;
                int size = bn2Var.f15435a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    arrayList.add(new ym2(bn2Var.f15435a.get(i)));
                    i++;
                }
                return new zm2(arrayList);
            default:
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                if (motionEvent != null) {
                    boolean zContains = kx5.m7694Y(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.f30132n0 = SystemClock.uptimeMillis();
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.post(viewTreeObserverOnGlobalLayoutListenerC1140sc.f30146u0);
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC1140sc.f30076A0.invoke();
                return ju4.f22634a;
        }
    }
}
