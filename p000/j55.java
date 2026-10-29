package p000;

import ads_mobile_sdk.al3;
import ads_mobile_sdk.el3;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.qx2;
import ads_mobile_sdk.wr3;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j55 implements InterfaceC1412zo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22033a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22034b;

    public /* synthetic */ j55(byte b) {
        this.f22033a = b;
    }

    @Override // p000.InterfaceC1412zo
    public final zl2 apply(Object obj) {
        byte b = this.f22033a;
        Object obj2 = this.f22034b;
        switch (b) {
            case 0:
                wr3 wr3Var = ((al3) obj2).f674b;
                oy3 oy3Var = wr3Var.f13060c;
                ir0 ir0Var = ir0.f5236P2;
                sj5 sj5Var = new sj5((byte) 0);
                sj5Var.f30346b = wr3Var;
                VarHandle.storeStoreFence();
                pq4 pq4VarM10092Q = qs5.m10092Q(sj5Var, wr3Var.f13059b);
                oy3Var.m1892a(ir0Var, (ik1) pq4VarM10092Q);
                return pq4VarM10092Q;
            case 1:
                el3 el3Var = (el3) obj2;
                Throwable th = (Throwable) obj;
                if (!el3Var.f3100m) {
                    th.getClass();
                    m12 m12Var = new m12();
                    m12Var.m6987n(th);
                    return m12Var;
                }
                pq4 pq4VarMo904d = el3Var.f3091d.mo904d();
                t75 t75Var = new t75((byte) 1);
                t75Var.f30979b = el3Var;
                VarHandle.storeStoreFence();
                return AbstractRunnableC1204u2.m11207u(pq4VarMo904d, t75Var, rz0.f29741a);
            default:
                return ((qx2) obj2).f10497c.mo899a();
        }
    }
}
