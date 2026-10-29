package p000;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31165a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ CameraManager f31166b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f31167c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f31168d;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f31165a) {
            case 0:
                CameraManager cameraManager = this.f31166b;
                String str = this.f31167c;
                sw2 sw2Var = this.f31168d;
                uh1 uh1Var = new uh1(sw2Var, str);
                cameraManager.registerAvailabilityCallback(uh1Var, (Handler) null);
                C0785j4 c0785j4 = new C0785j4((byte) 2);
                c0785j4.f21994b = cameraManager;
                c0785j4.f21995c = uh1Var;
                c0785j4.f21996d = sw2Var;
                VarHandle.storeStoreFence();
                return c0785j4;
            default:
                CameraManager cameraManager2 = this.f31166b;
                String str2 = this.f31167c;
                sw2 sw2Var2 = this.f31168d;
                vh1 vh1Var = new vh1(sw2Var2, str2);
                cameraManager2.registerTorchCallback(vh1Var, (Handler) null);
                C0785j4 c0785j5 = new C0785j4((byte) 3);
                c0785j5.f21994b = cameraManager2;
                c0785j5.f21995c = vh1Var;
                c0785j5.f21996d = sw2Var2;
                VarHandle.storeStoreFence();
                return c0785j5;
        }
    }
}
