package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15968a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ od1 f15969b;

    public /* synthetic */ ce0(byte b) {
        this.f15968a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM13620t;
        byte b = this.f15968a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        od1 od1Var = this.f15969b;
        switch (b) {
            case 0:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var);
                    pg0 pg0Var = y62.f34923a;
                    pg0 pg0Var2 = y62.f34924b;
                    ce0 ce0Var = new ce0(b2);
                    ce0Var.f15969b = od1Var;
                    VarHandle.storeStoreFence();
                    mz3.m8460b(nt2VarM3253l, null, false, null, pg0Var, pg0Var2, null, vd6.m11834R(-585440470, ce0Var, ir1Var), ir1Var, 819462144, 318);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    wp1 wp1Var = (wp1) ir1Var2.m6898k(hj0.f20619a);
                    boolean zM6890g = ir1Var2.m6890g(od1Var) | ir1Var2.m6890g(wp1Var);
                    Object objM6869O = ir1Var2.m6869O();
                    byte b3 = 0;
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        objM6869O = new C0671g0((Object) od1Var, (Object) wp1Var, (wm0) (b3 == true ? 1 : 0), (byte) 15);
                        ir1Var2.m6905n0(objM6869O);
                    }
                    sw2 sw2VarM13358Q = z62.m13358Q(ir1Var2, (mq1) objM6869O, null);
                    if (od1Var.f26639d.mo9870c()) {
                        i41 i41Var = (i41) sw2VarM13358Q.getValue();
                        strM13620t = zi4.m13620t("Free trial ends in ", i41Var != null ? AbstractC0647fd.m5660R(i41Var.f21121a) : null);
                    } else {
                        strM13620t = "In trial mode, this app only works while it is open. Upgrade to premium to use it in the background.";
                    }
                    gl4.m6037b(strM13620t, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 0, 0, 262142);
                }
                break;
        }
        return ju4Var;
    }
}
