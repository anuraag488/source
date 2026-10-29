package p000;

import ads_mobile_sdk.C0015a;
import ads_mobile_sdk.C0254ni;
import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.dn3;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.lx3;
import ads_mobile_sdk.oy3;
import android.util.Base64;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y65 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34964a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dn3 f34965b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strEncodeToString;
        byte b = this.f34964a;
        dn3 dn3Var = this.f34965b;
        switch (b) {
            case 0:
                C0015a c0015a = dn3Var.f2586b;
                String str = dn3Var.f2588d;
                c0015a.getClass();
                oa5 oa5VarM2115D = C0313rh.m2115D();
                oa5VarM2115D.m9012c(c75.m3871c(24));
                return Base64.encodeToString(c0015a.m209a(((C0313rh) oa5VarM2115D.m2518b()).m860c(), str, true), 11);
            default:
                oy3 oy3Var = dn3Var.f2591g;
                lx3 lx3Var = new lx3(ir0.f5346o, oy3Var.f8415b, oy3Var.f8414a);
                try {
                    lx3Var.m1630b();
                    C0015a c0015a2 = dn3Var.f2586b;
                    C0313rh c0313rh = (C0313rh) dn3Var.f2589e.m2518b();
                    String str2 = dn3Var.f2588d;
                    c0015a2.getClass();
                    try {
                        strEncodeToString = Base64.encodeToString(((C0254ni) c0015a2.m206a(str2, c0313rh.m860c()).m2518b()).m860c(), 11);
                        break;
                    } catch (IllegalArgumentException unused) {
                        oa5 oa5VarM2115D2 = C0313rh.m2115D();
                        oa5VarM2115D2.m9012c(c75.m3871c(22));
                        strEncodeToString = Base64.encodeToString(c0015a2.m209a(((C0313rh) oa5VarM2115D2.m2518b()).m860c(), str2, true), 11);
                    }
                    lx3Var.m1628a();
                    return strEncodeToString;
                } catch (Throwable th) {
                    try {
                        lx3Var.m1629a(th);
                        throw th;
                    } catch (Throwable th2) {
                        lx3Var.m1628a();
                        throw th2;
                    }
                }
        }
    }
}
