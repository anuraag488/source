package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends mt2 implements hl1, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver f28540o;

    /* JADX INFO: renamed from: p */
    public pk1 f28541p;

    /* JADX INFO: renamed from: q */
    public pk1 f28542q;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        ViewTreeObserver viewTreeObserver = zc6.m13511H(this).getViewTreeObserver();
        this.f28540o = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        ViewTreeObserver viewTreeObserver = this.f28540o;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f28540o = null;
        zc6.m13511H(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    /* JADX INFO: renamed from: O0 */
    public final sl1 m9895O0() {
        boolean z;
        if (!this.f25195a.f25208n) {
            q32.m9721c("visitLocalDescendants called on an unattached node");
        }
        mt2 mt2Var = this.f25195a;
        if ((mt2Var.f25198d & 1024) != 0) {
            boolean z2 = false;
            for (mt2 mt2Var2 = mt2Var.f25200f; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                if ((mt2Var2.f25197c & 1024) != 0) {
                    mt2 mt2VarM10644P = mt2Var2;
                    uw2 uw2Var = null;
                    while (mt2VarM10644P != null) {
                        if (mt2VarM10644P instanceof sl1) {
                            sl1 sl1Var = (sl1) mt2VarM10644P;
                            if (z2) {
                                return sl1Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                            int i = 0;
                            for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                if ((mt2Var3.f25197c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mt2VarM10644P = mt2Var3;
                                    } else {
                                        if (uw2Var == null) {
                                            uw2Var = new uw2(new mt2[16]);
                                        }
                                        if (mt2VarM10644P != null) {
                                            uw2Var.m11663b(mt2VarM10644P);
                                            mt2VarM10644P = null;
                                        }
                                        uw2Var.m11663b(mt2Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mt2VarM10644P = sc6.m10644P(uw2Var);
                    }
                }
            }
        }
        C1077qn.m9989o("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // p000.hl1
    /* JADX INFO: renamed from: W */
    public final void mo6426W(cl1 cl1Var) {
        cl1Var.mo4040c(false);
        cl1Var.mo4038a(this.f28541p);
        cl1Var.mo4042e(this.f28542q);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (sc6.m10652X(this).f33325o == null) {
            return;
        }
        View viewM13789v = zt5.m13789v(this);
        zk1 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getFocusOwner();
        r63 r63VarM10653Y = sc6.m10653Y(this);
        if (view != null && !view.equals(r63VarM10653Y)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewM13789v.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(r63VarM10653Y)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else {
                    if (parent2 == viewM13789v.getParent()) {
                        z2 = true;
                        break;
                    }
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            return;
        }
        if (!z2) {
            if (z && m9895O0().m10858T0().m8794a()) {
                ((bl1) focusOwner).m3616b(8, false, false);
                return;
            }
            return;
        }
        sl1 sl1VarM9895O0 = m9895O0();
        int iOrdinal = sl1VarM9895O0.m10858T0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            kx5.m7711h0(sl1VarM9895O0);
        } else {
            C0670g.m5864c();
        }
    }
}
