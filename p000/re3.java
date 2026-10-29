package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class re3 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29210a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ g44 f29211b;

    public /* synthetic */ re3(byte b) {
        this.f29210a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        byte b = this.f29210a;
        ju4 ju4Var = ju4.f22634a;
        i50 i50Var = ki0.f23136a;
        boolean z = false;
        g44 g44Var = this.f29211b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    boolean zBooleanValue = ((Boolean) g44Var.getValue()).booleanValue();
                    boolean zM6890g = ir1Var.m6890g(g44Var);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        se3 se3Var = new se3(z ? 1 : 0);
                        se3Var.f30215b = g44Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(se3Var);
                        obj4 = se3Var;
                    }
                    mz3.m8466h(zBooleanValue, (yp1) obj4, null, null, false, null, null, oh6.f26716J, null, ir1Var, 12582912, 892);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    boolean zBooleanValue2 = ((Boolean) g44Var.getValue()).booleanValue();
                    boolean zM6890g2 = ir1Var2.m6890g(g44Var);
                    Object objM6869O2 = ir1Var2.m6869O();
                    if (zM6890g2 || objM6869O2 == i50Var) {
                        obj5 = objM6869O2;
                        se3 se3Var2 = new se3((byte) 2);
                        se3Var2.f30215b = g44Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(se3Var2);
                        obj5 = se3Var2;
                    }
                    mz3.m8466h(zBooleanValue2, (yp1) obj5, null, null, false, null, null, dt0.f17353k, null, ir1Var2, 12582912, 892);
                }
                break;
        }
        return ju4Var;
    }
}
