package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c53 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final c53 f15811c = new c53(0, 3, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        z32 z32Var;
        m84 m84Var = (m84) xa0Var.m12602f(1);
        cr1 cr1Var = (cr1) xa0Var.m12602f(0);
        rh1 rh1Var = (rh1) xa0Var.m12602f(2);
        p84 p84VarM8231l = m84Var.m8231l();
        if (w53Var != null) {
            try {
                z32Var = new z32((byte) 25);
                z32Var.f35738b = w53Var;
                z32Var.f35739c = p84Var;
                VarHandle.storeStoreFence();
            } catch (Throwable th) {
                p84VarM8231l.m9417e(false);
                throw th;
            }
        } else {
            z32Var = null;
        }
        if (!rh1Var.f29284g.m12493W()) {
            qi0.m9889a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        rh1Var.f29283f.m12492V(interfaceC0618en, p84VarM8231l, om3Var, z32Var);
        p84VarM8231l.m9417e(true);
        p84Var.m9416d();
        cr1Var.getClass();
        p84Var.m9436z(m84Var, m84Var.m8227a(cr1Var));
        p84Var.m9421j();
    }
}
