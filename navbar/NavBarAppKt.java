package navbar;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.List;
import p000.AbstractC0647fd;
import p000.AbstractC0730hm;
import p000.AbstractC1410zm;
import p000.cp1;
import p000.dc0;
import p000.dh0;
import p000.g12;
import p000.gi2;
import p000.hd1;
import p000.i50;
import p000.ic2;
import p000.ir1;
import p000.ki0;
import p000.kx5;
import p000.mi0;
import p000.mq1;
import p000.ng3;
import p000.og3;
import p000.pb0;
import p000.pd1;
import p000.pe3;
import p000.sj3;
import p000.wx2;
import p000.yk3;
import p000.yp1;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class NavBarAppKt {
    public static final void NavBarApp(mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1434621183);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(mq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            ic2[] ic2VarArr = wx2.f33821a;
            g12 g12Var = (g12) AbstractC0730hm.f20690a.getValue();
            long jM13870e = zy5.m13870e(4285558739L);
            long jM13870e2 = zy5.m13870e(4294932799L);
            List listSingletonList = Collections.singletonList(sj3.m10793B(ir1Var, 6, 0));
            ng3 ng3Var = ng3.Subs;
            List listM7694Y = kx5.m7694Y(new og3("premium_monthly", ng3Var), new og3("premium_yearly", ng3Var), new og3("premium_lifetime", ng3.InApp));
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new dh0((byte) 17);
                ir1Var.m6905n0(objM6869O);
            }
            pe3 pe3Var = new pe3("Use app in background", "Use the custom navigation bar in every app.", (g12) AbstractC0647fd.m5646D((yp1) objM6869O).getValue());
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new dh0((byte) 18);
                ir1Var.m6905n0(objM6869O2);
            }
            pe3 pe3Var2 = new pe3("Backup and restore", "Backup and restore your configuration", (g12) AbstractC0647fd.m5646D((yp1) objM6869O2).getValue());
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var) {
                objM6869O3 = new dh0((byte) 19);
                ir1Var.m6905n0(objM6869O3);
            }
            pe3 pe3Var3 = new pe3("Start on boot", "This app starts automatically works after every restart", (g12) AbstractC0647fd.m5646D((yp1) objM6869O3).getValue());
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = new dh0((byte) 20);
                ir1Var.m6905n0(objM6869O4);
            }
            pe3 pe3Var4 = new pe3("Long-term support", "Receive new features, bug fixes and developer support for years to come", (g12) AbstractC0647fd.m5646D((yp1) objM6869O4).getValue());
            Object objM6869O5 = ir1Var.m6869O();
            if (objM6869O5 == i50Var) {
                objM6869O5 = new dh0((byte) 21);
                ir1Var.m6905n0(objM6869O5);
            }
            pe3 pe3Var5 = new pe3("Remove ads", null, (g12) AbstractC0647fd.m5646D((yp1) objM6869O5).getValue());
            Object objM6869O6 = ir1Var.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = new dh0((byte) 22);
                ir1Var.m6905n0(objM6869O6);
            }
            List listM7694Y2 = kx5.m7694Y(pe3Var, pe3Var2, pe3Var3, pe3Var4, pe3Var5, new pe3("Plus you'll be supporting a solo developer!", null, (g12) AbstractC0647fd.m5646D((yp1) objM6869O6).getValue()));
            cp1 cp1Var = new cp1();
            cp1Var.f16330a = listM7694Y;
            cp1Var.f16331b = listM7694Y2;
            VarHandle.storeStoreFence();
            ic2[] ic2VarArr2 = pd1.f27529a;
            dc0 dc0VarM13638b = AbstractC1410zm.m13638b(false, false, null, pb0.m9462a(jM13870e), pb0.m9462a(jM13870e2), null, ir1Var, 0, 175);
            hd1 hd1Var = new hd1();
            hd1Var.f20483a = g12Var;
            hd1Var.f20484b = dc0VarM13638b;
            hd1Var.f20485c = "navbar_enabled";
            hd1Var.f20486d = listSingletonList;
            hd1Var.f20487e = cp1Var;
            VarHandle.storeStoreFence();
            pd1.m9498c(hd1Var, mq1Var, ir1Var, (i2 << 3) & 112);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gi2 gi2Var = new gi2((byte) 1);
            gi2Var.f19805c = mq1Var;
            gi2Var.f19804b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gi2Var;
        }
    }
}
