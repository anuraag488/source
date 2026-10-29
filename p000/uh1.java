package p000;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f31867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sw2 f31868b;

    public uh1(sw2 sw2Var, String str) {
        this.f31867a = str;
        this.f31868b = sw2Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (z62.m13387o(str, this.f31867a)) {
            this.f31868b.setValue(Boolean.TRUE);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (z62.m13387o(str, this.f31867a)) {
            this.f31868b.setValue(Boolean.FALSE);
        }
    }
}
