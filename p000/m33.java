package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m33 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ l33 f24619a;

    public final void onBackCancelled() {
        l33 l33Var = this.f24619a;
        C1283w7 c1283w7 = l33Var.f21899a;
        if (c1283w7 == null) {
            C1077qn.m9989o("This input is not added to any dispatcher.");
            return;
        }
        if (!l33Var.f21900b) {
            c1283w7.m12148x(l33Var, null);
        }
        jz2 jz2Var = (jz2) c1283w7.f33128d;
        if (l33Var.equals(jz2Var.f22760h) && -1 == jz2Var.f22759g) {
            dz2 dz2VarM7349c = jz2Var.f22758f;
            if (dz2VarM7349c == null) {
                dz2VarM7349c = jz2Var.m7349c(-1);
            }
            jz2Var.f22758f = null;
            jz2Var.f22759g = 0;
            jz2Var.f22760h = null;
            lz2 lz2Var = lz2.f24483a;
            if (dz2VarM7349c != null) {
                dz2VarM7349c.f17530d = lz2Var;
                dz2VarM7349c.mo4812a();
            }
            ac4 ac4Var = jz2Var.f22753a;
            ac4Var.getClass();
            ac4Var.m200k(null, lz2Var);
        }
        l33Var.f21900b = false;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f24619a.m6971a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        l33 l33Var = this.f24619a;
        bz2 bz2VarM10658b0 = sc6.m10658b0(backEvent);
        C1283w7 c1283w7 = l33Var.f21899a;
        if (c1283w7 == null) {
            C1077qn.m9989o("This input is not added to any dispatcher.");
            return;
        }
        if (l33Var.f21900b) {
            jz2 jz2Var = (jz2) c1283w7.f33128d;
            if (l33Var.equals(jz2Var.f22760h) && -1 == jz2Var.f22759g) {
                dz2 dz2VarM7349c = jz2Var.f22758f;
                if (dz2VarM7349c == null) {
                    dz2VarM7349c = jz2Var.m7349c(-1);
                }
                if (dz2VarM7349c != null) {
                    dz2VarM7349c.f17530d = new mz2(bz2VarM10658b0, -1);
                    dz2VarM7349c.mo4814c(bz2VarM10658b0);
                }
                ac4 ac4Var = jz2Var.f22753a;
                mz2 mz2Var = new mz2(bz2VarM10658b0, -1);
                ac4Var.getClass();
                ac4Var.m200k(null, mz2Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        l33 l33Var = this.f24619a;
        bz2 bz2VarM10658b0 = sc6.m10658b0(backEvent);
        C1283w7 c1283w7 = l33Var.f21899a;
        if (c1283w7 == null) {
            C1077qn.m9989o("This input is not added to any dispatcher.");
        } else {
            if (l33Var.f21900b) {
                return;
            }
            c1283w7.m12148x(l33Var, bz2VarM10658b0);
            l33Var.f21900b = true;
        }
    }
}
