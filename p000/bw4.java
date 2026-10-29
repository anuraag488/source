package p000;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bw4 extends AccessibilityService.GestureResultCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b70 f15661a;

    public bw4(b70 b70Var) {
        this.f15661a = b70Var;
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCancelled(GestureDescription gestureDescription) {
        b70 b70Var = this.f15661a;
        if (b70Var.m3496t() instanceof s13) {
            b70Var.resumeWith(Boolean.FALSE);
        }
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCompleted(GestureDescription gestureDescription) {
        b70 b70Var = this.f15661a;
        if (b70Var.m3496t() instanceof s13) {
            b70Var.resumeWith(Boolean.TRUE);
        }
    }
}
