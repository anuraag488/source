package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30214a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ g44 f30215b;

    public /* synthetic */ se3(byte b) {
        this.f30214a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f30214a;
        ju4 ju4Var = ju4.f22634a;
        g44 g44Var = this.f30215b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g44Var.setValue(bool);
                break;
            case 1:
                re3 re3Var = new re3((byte) 1);
                re3Var.f29211b = g44Var;
                VarHandle.storeStoreFence();
                oi2.m9121c((vg2) obj, null, new pg0(-1959151506, true, re3Var), 3);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                g44Var.setValue(bool2);
                break;
        }
        return ju4Var;
    }
}
