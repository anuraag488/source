package p000;

import ads_mobile_sdk.ay2;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.lx2;
import ads_mobile_sdk.mx2;
import ads_mobile_sdk.wr3;
import ads_mobile_sdk.zx2;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj5 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30345a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wr3 f30346b;

    public /* synthetic */ sj5(byte b) {
        this.f30345a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f30345a;
        wr3 wr3Var = this.f30346b;
        switch (b) {
            case 0:
                mx2 mx2Var = wr3Var.f13058a;
                zx2 zx2VarM1731a = mx2Var.m1731a(1);
                if (zx2VarM1731a == null) {
                    mx2Var.f7425e.m1894b(ir0.f5240Q2);
                    return null;
                }
                String strM318y = zx2VarM1731a.m2942y().m318y();
                File fileM5337L = ev0.m5337L(mx2Var.m1732a(), strM318y, "pcam.jar");
                fileM5337L.getClass();
                if (!fileM5337L.exists()) {
                    fileM5337L = ev0.m5337L(mx2Var.m1732a(), strM318y, "pcam");
                    fileM5337L.getClass();
                }
                File fileM5337L2 = ev0.m5337L(mx2Var.m1732a(), strM318y, "pcopt");
                fileM5337L2.getClass();
                File fileM5337L3 = ev0.m5337L(mx2Var.m1732a(), strM318y, "pcbc");
                fileM5337L3.getClass();
                ay2 ay2VarM2942y = zx2VarM1731a.m2942y();
                lx2 lx2Var = new lx2();
                lx2Var.f7030a = ay2VarM2942y;
                lx2Var.f7031b = fileM5337L;
                lx2Var.f7032c = fileM5337L2;
                lx2Var.f7033d = fileM5337L3;
                VarHandle.storeStoreFence();
                return lx2Var;
            default:
                zx2 zx2VarM1731a2 = wr3Var.f13058a.m1731a(1);
                return zx2VarM1731a2 == null ? zx2.m2937x() : zx2VarM1731a2;
        }
    }
}
