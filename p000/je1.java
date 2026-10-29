package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class je1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22197a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ie1 f22198b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f22199c;

    public /* synthetic */ je1(byte b) {
        this.f22197a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22197a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 3;
        byte b3 = 1;
        switch (b) {
            case 0:
                ie1 ie1Var = this.f22198b;
                yp1 yp1Var = this.f22199c;
                vg2 vg2Var = (vg2) obj;
                ke1 ke1Var = new ke1((byte) 0);
                ke1Var.f23083b = ie1Var;
                ke1Var.f23084c = yp1Var;
                VarHandle.storeStoreFence();
                oi2.m9121c(vg2Var, null, new pg0(549977675, true, ke1Var), 3);
                pg0 pg0Var = lb5.f23921i;
                je1 je1Var = new je1(b3);
                je1Var.f22198b = ie1Var;
                je1Var.f22199c = yp1Var;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, pg0Var, je1Var, 2);
                break;
            default:
                ie1 ie1Var2 = this.f22198b;
                yp1 yp1Var2 = this.f22199c;
                ke1 ke1Var2 = new ke1(b2);
                ke1Var2.f23083b = ie1Var2;
                ke1Var2.f23084c = yp1Var2;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(1826262469, true, ke1Var2));
                break;
        }
        return ju4Var;
    }
}
