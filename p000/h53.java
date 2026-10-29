package p000;

import java.lang.invoke.VarHandle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h53 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final h53 f20400c = new h53(0, 1, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        yk3 yk3Var = (yk3) xa0Var.m12602f(0);
        Set set = om3Var.f26880a;
        if (set == null) {
            return;
        }
        o93 o93Var = new o93();
        o93Var.f26492a = set;
        o93Var.f26493b = new uw2(new mr1[16]);
        VarHandle.storeStoreFence();
        lw2 lw2Var = om3Var.f26888i;
        if (lw2Var == null) {
            long[] jArr = tv3.f31472a;
            lw2Var = new lw2();
            om3Var.f26888i = lw2Var;
        }
        lw2Var.m8138m(yk3Var, o93Var);
        om3Var.f26884e.m11663b(new mr1(o93Var, -1));
    }
}
