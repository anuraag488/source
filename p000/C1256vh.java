package p000;

import android.view.MotionEvent;

/* JADX INFO: renamed from: vh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1256vh implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32603a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gy4 f32604b;

    public /* synthetic */ C1256vh(byte b) {
        this.f32603a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        byte b = this.f32603a;
        ju4 ju4Var = ju4.f22634a;
        gy4 gy4Var = this.f32604b;
        switch (b) {
            case 0:
                gy4Var.f15300q = (yp1) obj;
                return ju4Var;
            case 1:
                r63 r63Var = (r63) obj;
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = r63Var instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc ? (ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null) {
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().removeViewInLayout(gy4Var);
                    as4.m3256o(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(gy4Var));
                    gy4Var.setImportantForAccessibility(0);
                }
                gy4Var.removeAllViewsInLayout();
                return ju4Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = gy4Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = gy4Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
