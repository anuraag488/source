package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t23 implements vq4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f30735a;

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        if (cs4Var.f16429a != Object.class) {
            return null;
        }
        int i = this.f30735a;
        u23 u23Var = new u23();
        u23Var.f31625a = ou1Var;
        u23Var.f31626b = i;
        VarHandle.storeStoreFence();
        return u23Var;
    }
}
