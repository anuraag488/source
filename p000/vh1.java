package p000;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vh1 extends CameraManager.TorchCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f32612a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sw2 f32613b;

    public vh1(sw2 sw2Var, String str) {
        this.f32612a = str;
        this.f32613b = sw2Var;
    }

    @Override // android.hardware.camera2.CameraManager.TorchCallback
    public final void onTorchModeChanged(String str, boolean z) {
        if (z62.m13387o(this.f32612a, str)) {
            this.f32613b.setValue(Boolean.valueOf(z));
        }
    }
}
