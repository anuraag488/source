package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg0 implements qq1 {
    @Override // p000.qq1
    /* JADX INFO: renamed from: c */
    public final Object mo6204c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        Object obj7;
        pg0 pg0VarM11834R;
        C0766im c0766im = (C0766im) obj;
        yp1 yp1Var = (yp1) obj2;
        nq1 nq1Var = (nq1) obj3;
        nt2 nt2Var = (nt2) obj4;
        mi0 mi0Var = (mi0) obj5;
        int iIntValue = ((Integer) obj6).intValue();
        byte b = 2;
        if ((iIntValue & 6) == 0) {
            i = (((ir1) mi0Var).m6890g(c0766im) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((ir1) mi0Var).m6894i(yp1Var) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((ir1) mi0Var).m6894i(nq1Var) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((ir1) mi0Var).m6890g(nt2Var) ? 2048 : 1024;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(i & 1, (i & 9363) != 9362)) {
            boolean z = ((i & 112) == 32) | ((i & 14) == 4);
            Object objM6869O = ir1Var.m6869O();
            if (z || objM6869O == ki0.f23136a) {
                obj7 = objM6869O;
                C0675g4 c0675g4 = new C0675g4((byte) 18);
                c0675g4.f19600b = yp1Var;
                c0675g4.f19601c = c0766im;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0675g4);
                obj7 = c0675g4;
            }
            obj7 = objM6869O;
            wp1 wp1Var = (wp1) obj7;
            C1076qm c1076qm = new C1076qm(b);
            c1076qm.f28561b = c0766im;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R2 = vd6.m11834R(91601199, c1076qm, ir1Var);
            C1076qm c1076qm2 = new C1076qm((byte) 3);
            c1076qm2.f28561b = c0766im;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R3 = vd6.m11834R(-1097191375, c1076qm2, ir1Var);
            if (nq1Var == null) {
                ir1Var.m6885d0(-2053209932);
                ir1Var.m6912r(false);
                pg0VarM11834R = null;
            } else {
                ir1Var.m6885d0(-2053209931);
                ne0 ne0Var = new ne0((byte) 15);
                ne0Var.f25728b = nq1Var;
                ne0Var.f25729c = c0766im;
                VarHandle.storeStoreFence();
                pg0VarM11834R = vd6.m11834R(-1439334148, ne0Var, ir1Var);
                ir1Var.m6912r(false);
            }
            mz3.m8463e(nt2Var, null, false, wp1Var, null, null, pg0VarM11834R2, null, pg0VarM11834R3, pg0VarM11834R, ir1Var, ((i >> 9) & 14) | 102236160, 182);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
