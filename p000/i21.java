package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i21 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21060a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f21061b;

    public /* synthetic */ i21(byte b) {
        this.f21060a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        byte b = this.f21060a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        yp1 yp1Var = this.f21061b;
        switch (b) {
            case 0:
                yp1Var.invoke(b33.m3423a(((lc3) obj2).f23937c));
                break;
            case 1:
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    boolean zM6890g = ir1Var.m6890g(yp1Var);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        yy0 yy0Var = new yy0((byte) 3);
                        yy0Var.f35613b = yp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(yy0Var);
                        obj4 = yy0Var;
                    }
                    zy5.m13882q((wp1) obj4, null, false, null, null, null, null, ir1Var, 805306368);
                    boolean zM6890g2 = ir1Var.m6890g(yp1Var);
                    Object objM6869O2 = ir1Var.m6869O();
                    Object obj6 = objM6869O2;
                    if (zM6890g2 || objM6869O2 == i50Var) {
                        yy0 yy0Var2 = new yy0((byte) 4);
                        yy0Var2.f35613b = yp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(yy0Var2);
                        obj6 = yy0Var2;
                    }
                    zy5.m13865b((wp1) obj6, null, false, null, null, null, null, null, ks5.f23399h, ir1Var, 805306368, 510);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    boolean zM6890g3 = ir1Var2.m6890g(yp1Var);
                    Object objM6869O3 = ir1Var2.m6869O();
                    if (zM6890g3 || objM6869O3 == i50Var) {
                        obj5 = objM6869O3;
                        yy0 yy0Var3 = new yy0((byte) 5);
                        yy0Var3.f35613b = yp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(yy0Var3);
                        obj5 = yy0Var3;
                    }
                    dt0.m4707i(1572864, AbstractC1356y5.f34885h, ir1Var2, (wp1) obj5, null, null, null, false);
                }
                break;
        }
        return ju4Var;
    }
}
