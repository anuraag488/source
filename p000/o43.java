package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o43 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final o43 f26333c = new o43(0, 2, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        z32 z32Var;
        t52 t52Var = (t52) xa0Var.m12602f(1);
        int i = t52Var != null ? t52Var.f30789a : 0;
        y70 y70Var = (y70) xa0Var.m12602f(0);
        if (i > 0) {
            e00 e00Var = new e00();
            e00Var.f17554c = interfaceC0618en;
            e00Var.f17552a = i;
            VarHandle.storeStoreFence();
            interfaceC0618en = e00Var;
        }
        if (w53Var != null) {
            z32Var = new z32((byte) 25);
            z32Var.f35738b = w53Var;
            z32Var.f35739c = p84Var;
            VarHandle.storeStoreFence();
        } else {
            z32Var = null;
        }
        y70Var.m13046u(interfaceC0618en, p84Var, om3Var, z32Var);
    }
}
