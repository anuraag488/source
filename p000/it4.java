package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21774a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pn0 f21775b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f21776c;

    public /* synthetic */ it4(byte b) {
        this.f21774a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f21774a;
        ju4 ju4Var = ju4.f22634a;
        i50 i50Var = ki0.f23136a;
        byte b2 = 2;
        switch (b) {
            case 0:
                pn0 pn0Var = this.f21775b;
                yp1 yp1Var = this.f21776c;
                wp1 wp1Var = (wp1) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6894i(wp1Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    boolean zM6890g = ir1Var.m6890g(pn0Var) | ir1Var.m6890g(yp1Var) | ((iIntValue & 14) == 4);
                    Object objM6869O = ir1Var.m6869O();
                    Object obj4 = objM6869O;
                    if (zM6890g || objM6869O == i50Var) {
                        bh4 bh4Var = new bh4((byte) 5);
                        bh4Var.f15274b = pn0Var;
                        bh4Var.f15275c = yp1Var;
                        bh4Var.f15276d = wp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(bh4Var);
                        obj4 = bh4Var;
                    }
                    AbstractC0647fd.m5674l(null, null, false, (yp1) obj4, ir1Var, 0, 7);
                }
                break;
            default:
                pn0 pn0Var2 = this.f21775b;
                yp1 yp1Var2 = this.f21776c;
                wp1 wp1Var2 = (wp1) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6894i(wp1Var2) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ir1Var2.m6874W();
                } else {
                    Object objM6869O2 = ir1Var2.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var2);
                        ir1Var2.m6905n0(objM6869O2);
                    }
                    ie0 ie0Var = new ie0(b2);
                    ie0Var.f21278b = (zo0) objM6869O2;
                    ie0Var.f21279c = pn0Var2;
                    ie0Var.f21280d = yp1Var2;
                    ie0Var.f21281e = wp1Var2;
                    VarHandle.storeStoreFence();
                    zc6.m13517b(null, ie0Var, ir1Var2, 0);
                }
                break;
        }
        return ju4Var;
    }
}
