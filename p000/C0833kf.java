package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: kf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0833kf implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23094a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cd3 f23095b;

    public /* synthetic */ C0833kf(byte b) {
        this.f23094a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f23094a;
        ju4 ju4Var = ju4.f22634a;
        cd3 cd3Var = this.f23095b;
        switch (b) {
            case 0:
                cd3Var.m13900setPopupContentSizefhxjrPA((w52) obj);
                cd3Var.m3983q();
                break;
            case 1:
                cd3Var.m3982p(((cf2) obj).mo4011n());
                break;
            default:
                wp1 wp1Var = (wp1) obj;
                Handler handler = cd3Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = cd3Var.getHandler();
                    if (handler2 != null) {
                        RunnableC0683gc runnableC0683gc = new RunnableC0683gc((byte) 3);
                        runnableC0683gc.f19736b = wp1Var;
                        VarHandle.storeStoreFence();
                        handler2.post(runnableC0683gc);
                    }
                } else {
                    wp1Var.invoke();
                }
                break;
        }
        return ju4Var;
    }
}
