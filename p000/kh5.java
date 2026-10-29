package p000;

import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0386w4;
import ads_mobile_sdk.p04;
import ads_mobile_sdk.rh3;
import ads_mobile_sdk.ua2;
import ads_mobile_sdk.vq2;
import ads_mobile_sdk.xq3;
import android.os.Build;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kh5 implements v85 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23131a;

    public /* synthetic */ kh5(byte b) {
        this.f23131a = b;
    }

    @Override // p000.ki5
    public final Object get() {
        switch (this.f23131a) {
            case 0:
                rh3 rh3Var = new rh3();
                rh3Var.f10852a = new C0200km((yp1) null, (Object) null);
                VarHandle.storeStoreFence();
                return rh3Var;
            case 1:
                String str = Build.FINGERPRINT;
                y70.m13030j(str);
                return str;
            case 2:
                ua2 ua2Var = new ua2();
                ua2Var.f12236a = new WeakReference(null);
                ua2Var.f12237b = new WeakReference(null);
                ua2Var.f12238c = new WeakReference(null);
                ua2Var.f12239d = new WeakReference(null);
                return ua2Var;
            case 3:
                return new li5();
            case 4:
                String str2 = Build.HOST;
                y70.m13030j(str2);
                return str2;
            case 5:
                vq2 vq2Var = new vq2();
                vq2Var.f12805a = Executors.newSingleThreadScheduledExecutor();
                VarHandle.storeStoreFence();
                return vq2Var;
            case 6:
                return new ej5();
            case 7:
                C0386w4 c0386w4 = new C0386w4();
                c0386w4.f12889a = new C0200km((yp1) null, (Object) null);
                VarHandle.storeStoreFence();
                return c0386w4;
            case 8:
                return new mj5();
            case 9:
                return p04.a$1;
            case 10:
                return new uj5();
            default:
                xq3 xq3Var = new xq3();
                xq3Var.f13395a = new ArrayList();
                VarHandle.storeStoreFence();
                return xq3Var;
        }
    }
}
