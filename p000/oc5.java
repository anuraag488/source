package p000;

import ads_mobile_sdk.ir0;
import ads_mobile_sdk.l24;
import ads_mobile_sdk.m24;
import ads_mobile_sdk.ms0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc5 implements InterfaceC1412zo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26624a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ m24 f26625b;

    public /* synthetic */ oc5(byte b) {
        this.f26624a = b;
    }

    @Override // p000.InterfaceC1412zo
    public final zl2 apply(Object obj) {
        byte b = this.f26624a;
        m24 m24Var = this.f26625b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return m24Var.m1687c(0);
                }
                m24Var.f7088d.m1894b(ir0.f5233P);
                return qs5.m10084I(l24.f6671b);
            default:
                ms0 ms0Var = (ms0) obj;
                dg5 dg5Var = m24Var.f7087c;
                if (ms0Var.x$1() == 2) {
                    return dg5Var.mo900a(ms0Var.m1728w(), ms0Var.m1727v().m1995i());
                }
                if (ms0Var.x$1() == 3) {
                    return dg5Var.mo901a(ms0Var.m1728w(), ms0Var.m1729y().m1995i(), ms0Var.m1727v().m1995i());
                }
                C1077qn.m9985k("Unreachable");
                return null;
        }
    }
}
