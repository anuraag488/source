package p000;

import ads_mobile_sdk.al3;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.lx2;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.zx2;
import android.os.Build;
import java.io.File;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i55 implements uq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21136a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ al3 f21137b;

    public /* synthetic */ i55(byte b) {
        this.f21136a = b;
    }

    @Override // p000.uq1
    public final Object apply(Object obj) {
        byte b = this.f21136a;
        al3 al3Var = this.f21137b;
        switch (b) {
            case 0:
                zx2 zx2Var = (zx2) obj;
                if (al3Var.f675c.mo1179b(zx2Var) && zx2Var != null) {
                    return Boolean.TRUE;
                }
                al3Var.f676d.m1894b(ir0.f5299e2);
                throw new gf0(1);
            default:
                lx2 lx2Var = (lx2) obj;
                if (lx2Var == null) {
                    throw new gf0(3);
                }
                File file = lx2Var.f7031b;
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                oy3 oy3Var = al3Var.f676d;
                ir0 ir0Var = ir0.f5294d2;
                RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 26);
                runnableC1285w9.f33164b = al3Var;
                runnableC1285w9.f33165c = lx2Var;
                VarHandle.storeStoreFence();
                oy3Var.m1893a(ir0Var, runnableC1285w9);
                return Boolean.TRUE;
        }
    }
}
