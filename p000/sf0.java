package p000;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30224a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ag0 f30225b;

    public /* synthetic */ sf0(byte b) {
        this.f30224a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        ly4 ly4Var;
        switch (this.f30224a) {
            case 0:
                this.f30225b.reportFullyDrawn();
                return ju4.f22634a;
            case 1:
                vp1 vp1Var = new vp1();
                vp1Var.f32768a = new Object();
                vp1Var.f32770c = new ArrayList();
                VarHandle.storeStoreFence();
                return vp1Var;
            case 2:
                ag0 ag0Var = this.f30225b;
                uz0 uz0Var = new uz0();
                ag0Var.mo2974a().m12137g(uz0Var);
                return uz0Var;
            case 3:
                ag0 ag0Var2 = this.f30225b;
                Application application = ag0Var2.getApplication();
                Bundle extras = ag0Var2.getIntent() != null ? ag0Var2.getIntent().getExtras() : null;
                bv3 bv3Var = new bv3();
                bv3Var.f15651e = ag0Var2.getSavedStateRegistry();
                bv3Var.f15650d = ag0Var2.getLifecycle();
                bv3Var.f15649c = extras;
                bv3Var.f15647a = application;
                if (application != null) {
                    ly4Var = ly4.f24471c;
                    if (ly4Var == null) {
                        ly4Var = new ly4(application);
                        ly4.f24471c = ly4Var;
                    }
                } else {
                    ly4Var = new ly4(null);
                }
                bv3Var.f15648b = ly4Var;
                VarHandle.storeStoreFence();
                return bv3Var;
            default:
                ag0 ag0Var3 = this.f30225b;
                rf0 rf0Var = new rf0((byte) 1);
                rf0Var.f29221b = ag0Var3;
                VarHandle.storeStoreFence();
                t33 t33Var = new t33(rf0Var);
                if (z62.m13387o(Looper.myLooper(), Looper.getMainLooper())) {
                    ok2 ok2Var = ag0Var3.f14447a;
                    tf0 tf0Var = new tf0();
                    tf0Var.f31110a = t33Var;
                    tf0Var.f31111b = ag0Var3;
                    VarHandle.storeStoreFence();
                    ok2Var.mo6015a(tf0Var);
                } else {
                    Handler handler = new Handler(Looper.getMainLooper());
                    RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 3);
                    runnableC1285w9.f33164b = ag0Var3;
                    runnableC1285w9.f33165c = t33Var;
                    VarHandle.storeStoreFence();
                    handler.post(runnableC1285w9);
                }
                return t33Var;
        }
    }
}
