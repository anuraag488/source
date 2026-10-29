package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: uh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1219uh implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31863a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gy4 f31864b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ wf2 f31865c;

    public /* synthetic */ C1219uh(byte b) {
        this.f31863a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsM12043b;
        byte b = this.f31863a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                gy4 gy4Var = this.f31864b;
                n40.m8511u(gy4Var, this.f31865c);
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) gy4Var.f15286c).f30081D = true;
                int[] iArr = gy4Var.f15297n;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = gy4Var.f15285b;
                view.getLocationOnScreen(iArr);
                long j = gy4Var.f15298o;
                long jMo4004R = ((cf2) obj).mo4004R();
                gy4Var.f15298o = jMo4004R;
                w05 w05Var = gy4Var.f15299p;
                if (w05Var != null && ((i != iArr[0] || i2 != iArr[1] || !w52.m12108c(j, jMo4004R)) && (windowInsetsM12043b = gy4Var.m3604f(w05Var).m12043b()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsM12043b);
                }
                break;
            case 1:
                gy4 gy4Var2 = this.f31864b;
                View view2 = gy4Var2.f15285b;
                wf2 wf2Var = this.f31865c;
                r63 r63Var = (r63) obj;
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = r63Var instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc ? (ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null) {
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(gy4Var2, wf2Var);
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().addView(gy4Var2);
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(wf2Var, gy4Var2);
                    gy4Var2.setImportantForAccessibility(1);
                    cy4.m4232a(gy4Var2, new C0904mc(viewTreeObserverOnGlobalLayoutListenerC1140sc, wf2Var, viewTreeObserverOnGlobalLayoutListenerC1140sc));
                }
                if (view2.getParent() != gy4Var2) {
                    gy4Var2.addView(view2);
                }
                break;
            default:
                n40.m8511u(this.f31864b, this.f31865c);
                break;
        }
        return ju4Var;
    }
}
