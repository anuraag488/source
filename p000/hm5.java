package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hm5 extends ot1 {

    /* JADX INFO: renamed from: i */
    public static final nh3 f20705i = new nh3("ClientTelemetry.API", new ll5((byte) 2), new gb5());

    /* JADX INFO: renamed from: j */
    public static final nh3 f20706j = new nh3("LocationServices.API", new ll5((byte) 3), new gb5());

    /* JADX INFO: renamed from: d */
    public nr6 m6446d(cs0 cs0Var) {
        ki4 ki4Var = new ki4();
        ki4Var.f23156b = true;
        bt5 bt5Var = new bt5((byte) 1);
        bt5Var.f15596b = cs0Var;
        VarHandle.storeStoreFence();
        ki4Var.f23158d = bt5Var;
        ki4Var.f23157c = (short) 2415;
        return m9264c(0, ki4Var.m7522a());
    }

    /* JADX INFO: renamed from: e */
    public nr6 m6447e(ri4 ri4Var) {
        ki4 ki4Var = new ki4();
        ki4Var.f23157c = (short) 0;
        ki4Var.f23155a = new ed1[]{kx5.f23600l};
        ki4Var.f23156b = false;
        w42 w42Var = new w42((byte) 26, false);
        w42Var.f33090b = ri4Var;
        VarHandle.storeStoreFence();
        ki4Var.f23158d = w42Var;
        return m9264c(2, ki4Var.m7522a());
    }
}
