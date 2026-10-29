package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30354a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ky0 f30355b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f30356c;

    public /* synthetic */ sk4(byte b) {
        this.f30354a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f30354a) {
            case 0:
                ky0 ky0Var = this.f30355b;
                sw2 sw2Var = this.f30356c;
                gb5 gb5Var = gb5.f19719j;
                C0729hl c0729hl = new C0729hl((byte) 3);
                c0729hl.f20669b = (wp1) obj;
                VarHandle.storeStoreFence();
                sk4 sk4Var = new sk4((byte) 1);
                sk4Var.f30355b = ky0Var;
                sk4Var.f30356c = sw2Var;
                VarHandle.storeStoreFence();
                p14 p14Var = lp2.f24268a;
                ip2 ip2Var = new ip2();
                ip2Var.f21621a = c0729hl;
                ip2Var.f21622b = sk4Var;
                ip2Var.f21623c = Float.NaN;
                ip2Var.f21624d = true;
                ip2Var.f21625e = 9205357640488583168L;
                ip2Var.f21626f = Float.NaN;
                ip2Var.f21627g = Float.NaN;
                ip2Var.f21628h = true;
                ip2Var.f21629i = gb5Var;
                VarHandle.storeStoreFence();
                return ip2Var;
            default:
                ky0 ky0Var2 = this.f30355b;
                sw2 sw2Var2 = this.f30356c;
                ((t11) obj).getClass();
                sw2Var2.setValue(w52.m12106a((((long) ky0Var2.mo3579U(t11.m10960b(0L))) << 32) | (((long) ky0Var2.mo3579U(t11.m10959a(0L))) & 4294967295L)));
                return ju4.f22634a;
        }
    }
}
