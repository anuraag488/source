package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23430a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zg0 f23431b;

    public /* synthetic */ kt4(byte b) {
        this.f23430a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.f23430a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 0;
        zg0 zg0Var = this.f23431b;
        switch (b) {
            case 0:
                wp1 wp1Var = (wp1) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6894i(wp1Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    boolean zM6890g = ir1Var.m6890g(zg0Var) | ((iIntValue & 14) == 4);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        obj4 = objM6869O;
                        cz3 cz3Var = new cz3((byte) 21);
                        cz3Var.f16638b = zg0Var;
                        cz3Var.f16639c = wp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(cz3Var);
                        obj4 = cz3Var;
                    }
                    obj4 = objM6869O;
                    zc6.m13517b(null, (yp1) obj4, ir1Var, 0);
                }
                break;
            default:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ir1Var2.m6874W();
                } else {
                    nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var2);
                    oz3 oz3VarM10799H = sj3.m10799H(qn4.f28627d, null, null, ir1Var2, 12582918, 126);
                    kt4 kt4Var = new kt4(b2);
                    kt4Var.f23431b = zg0Var;
                    VarHandle.storeStoreFence();
                    C1297wl c1297wlM10510c = rz2.m10510c(vd6.m11834R(-1315371524, kt4Var, ir1Var2), ir1Var2);
                    n14 n14Var = new n14((byte) 17);
                    VarHandle.storeStoreFence();
                    mz3.m8463e(nt2VarM3253l, oz3VarM10799H, false, c1297wlM10510c, null, null, vd6.m11834R(-50270294, n14Var, ir1Var2), null, ev0.f18497e, null, ir1Var2, 102236160, 692);
                }
                break;
        }
        return ju4Var;
    }
}
