package p000;

import ads_mobile_sdk.nv1;
import ads_mobile_sdk.pv1;
import ads_mobile_sdk.s41;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qe5 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ FrameLayout f28420a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ s41 f28421b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f28422c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ WindowManager.LayoutParams f28423d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f28424e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ pv1 f28425f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ WindowManager f28426g;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        FrameLayout frameLayout = this.f28420a;
        s41 s41Var = this.f28421b;
        String str = this.f28422c;
        WindowManager.LayoutParams layoutParams = this.f28423d;
        int i = this.f28424e;
        pv1 pv1Var = this.f28425f;
        WindowManager windowManager = this.f28426g;
        Rect rect = new Rect();
        if (!frameLayout.getGlobalVisibleRect(rect) || s41Var.getWindowToken() == null) {
            return;
        }
        if ("1".equals(str) || "2".equals(str)) {
            layoutParams.y = rect.bottom - i;
        } else {
            layoutParams.y = rect.top - i;
        }
        lb5.m7910S(pv1Var.f8764e, null, null, new nv1(windowManager, s41Var, layoutParams, null, (byte) 1), 3);
    }
}
