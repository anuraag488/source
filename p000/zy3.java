package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zy3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36469a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pg0 f36470b;

    public /* synthetic */ zy3(byte b) {
        this.f36469a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f36469a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 2;
        pg0 pg0Var = this.f36470b;
        switch (b) {
            case 0:
                C0897m5 c0897m5 = new C0897m5(b2);
                c0897m5.f24664b = pg0Var;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(-342282268, true, c0897m5));
                break;
            default:
                vg2 vg2Var = (vg2) obj;
                hv1 hv1Var = new hv1((byte) 2);
                VarHandle.storeStoreFence();
                oi2.m9121c(vg2Var, "header", new pg0(270457962, true, hv1Var), 2);
                zy3 zy3Var = new zy3((byte) 0);
                zy3Var.f36470b = pg0Var;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, null, zy3Var, 3);
                break;
        }
        return ju4Var;
    }
}
