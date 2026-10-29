package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q43 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final q43 f28208c = new q43(0, 4, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        uu2 uu2Var = (uu2) xa0Var.m12602f(2);
        uu2 uu2Var2 = (uu2) xa0Var.m12602f(3);
        ui0 ui0Var = (ui0) xa0Var.m12602f(1);
        tu2 tu2VarMo5186p = (tu2) xa0Var.m12602f(0);
        if (tu2VarMo5186p == null && (tu2VarMo5186p = ui0Var.mo5186p(uu2Var)) == null) {
            qi0.m9890b("Could not resolve state for movable content");
            xy4.m12794w();
            return;
        }
        m84 m84VarM8980a = o84.m8980a(tu2VarMo5186p.f31455a);
        if (p84Var.f27446n > 0 || p84Var.m9431t(p84Var.f27452t + 1) != 1) {
            qi0.m9889a("Check failed");
        }
        int i = p84Var.f27452t;
        int i2 = p84Var.f27441i;
        int i3 = p84Var.f27442j;
        p84Var.m9413a(1);
        p84Var.m9406Q();
        p84Var.m9416d();
        p84 p84VarM8231l = m84VarM8980a.m8231l();
        try {
            List listM8512v = n40.m8512v(p84VarM8231l, 2, p84Var, false, true, true);
            p84VarM8231l.m9417e(true);
            p84Var.m9421j();
            p84Var.m9420i();
            p84Var.f27452t = i;
            p84Var.f27441i = i2;
            p84Var.f27442j = i3;
            zc6.m13530o(p84Var, listM8512v, uu2Var2.f32181c);
        } catch (Throwable th) {
            p84VarM8231l.m9417e(false);
            throw th;
        }
    }
}
