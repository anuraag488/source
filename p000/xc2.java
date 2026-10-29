package p000;

import android.view.KeyEvent;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xc2 extends mt2 implements wc2 {

    /* JADX INFO: renamed from: o */
    public yp1 f34150o;

    /* JADX INFO: renamed from: p */
    public yp1 f34151p;

    @Override // p000.wc2
    /* JADX INFO: renamed from: X */
    public final boolean mo6965X(KeyEvent keyEvent) {
        yp1 yp1Var = this.f34150o;
        if (yp1Var == null) {
            return false;
        }
        sc2 sc2Var = new sc2();
        sc2Var.f30158a = keyEvent;
        VarHandle.storeStoreFence();
        return ((Boolean) yp1Var.invoke(sc2Var)).booleanValue();
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: n */
    public final boolean mo6969n(KeyEvent keyEvent) {
        yp1 yp1Var = this.f34151p;
        if (yp1Var == null) {
            return false;
        }
        sc2 sc2Var = new sc2();
        sc2Var.f30158a = keyEvent;
        VarHandle.storeStoreFence();
        return ((Boolean) yp1Var.invoke(sc2Var)).booleanValue();
    }
}
