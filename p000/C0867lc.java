package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: lc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0867lc extends mt2 implements z20, g14, wc2, lf2, pp4 {

    /* JADX INFO: renamed from: o */
    public final C1127s f23927o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f23928p;

    public C0867lc(ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc) {
        this.f23928p = viewTreeObserverOnGlobalLayoutListenerC1140sc;
        C1127s c1127s = new C1127s((byte) 7);
        c1127s.f29778b = this;
        VarHandle.storeStoreFence();
        this.f23927o = c1127s;
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: X */
    public final boolean mo6965X(KeyEvent keyEvent) {
        mk1 mk1VarM8337a;
        int[] iArr = wk1.f33443a;
        long jM10079D = qs5.m10079D(keyEvent);
        byte b = 6;
        if (nc2.m8689a(jM10079D, nc2.f25648b)) {
            mk1VarM8337a = mk1.m8337a(2);
        } else if (nc2.m8689a(jM10079D, nc2.f25649c)) {
            mk1VarM8337a = mk1.m8337a(1);
        } else if (nc2.m8689a(jM10079D, nc2.f25662p)) {
            mk1VarM8337a = mk1.m8337a(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (nc2.m8689a(jM10079D, nc2.f25653g)) {
            mk1VarM8337a = mk1.m8337a(4);
        } else if (nc2.m8689a(jM10079D, nc2.f25652f)) {
            mk1VarM8337a = mk1.m8337a(3);
        } else if (nc2.m8689a(jM10079D, nc2.f25650d) || nc2.m8689a(jM10079D, nc2.f25634C)) {
            mk1VarM8337a = mk1.m8337a(5);
        } else if (nc2.m8689a(jM10079D, nc2.f25651e) || nc2.m8689a(jM10079D, nc2.f25635D)) {
            mk1VarM8337a = mk1.m8337a(6);
        } else if (nc2.m8689a(jM10079D, nc2.f25654h) || nc2.m8689a(jM10079D, nc2.f25664r) || nc2.m8689a(jM10079D, nc2.f25636E)) {
            mk1VarM8337a = mk1.m8337a(7);
        } else {
            mk1VarM8337a = (nc2.m8689a(jM10079D, nc2.f25647a) || nc2.m8689a(jM10079D, nc2.f25667u)) ? mk1.m8337a(8) : null;
        }
        if (mk1VarM8337a != null) {
            int i = mk1VarM8337a.f24973a;
            if (qs5.m10083H(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f23928p;
                sl1 sl1VarM3620f = ((bl1) viewTreeObserverOnGlobalLayoutListenerC1140sc.getFocusOwner()).m3620f();
                if (sl1VarM3620f != null && sl1VarM3620f.f30366o && viewTreeObserverOnGlobalLayoutListenerC1140sc.m10621u(i)) {
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.getPlayNavigationSoundEffect$ui().invoke(mk1VarM8337a, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                jl3 embeddedViewFocusRect = viewTreeObserverOnGlobalLayoutListenerC1140sc.getEmbeddedViewFocusRect();
                zk1 focusOwner = viewTreeObserverOnGlobalLayoutListenerC1140sc.getFocusOwner();
                C1127s c1127s = new C1127s(b);
                c1127s.f29778b = mk1VarM8337a;
                VarHandle.storeStoreFence();
                Boolean boolM3619e = ((bl1) focusOwner).m3619e(i, embeddedViewFocusRect, c1127s);
                if (boolM3619e == null) {
                    return true;
                }
                if (boolM3619e.booleanValue()) {
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.getPlayNavigationSoundEffect$ui().invoke(mk1VarM8337a, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numM12316c = wk1.m12316c(i);
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC1140sc.getRootView(), viewTreeObserverOnGlobalLayoutListenerC1140sc.getView(), numM12316c != null ? numM12316c.intValue() : 2);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC1140sc)) {
                    return ((bl1) viewTreeObserverOnGlobalLayoutListenerC1140sc.getFocusOwner()).m3622h(i);
                }
            }
        }
        return false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 0);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3578T(i, i2, w71.f33134a, this.f23927o, c0830kc);
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: n */
    public final boolean mo6969n(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.z20
    /* JADX INFO: renamed from: u0 */
    public final Object mo6207u0(e13 e13Var, C0675g4 c0675g4, ym0 ym0Var) {
        long jMo4005S = e13Var.mo4005S(0L);
        jl3 jl3Var = (jl3) c0675g4.invoke();
        jl3 jl3VarM7174j = jl3Var != null ? jl3Var.m7174j(jMo4005S) : null;
        if (jl3VarM7174j != null) {
            this.f23928p.requestRectangleOnScreen(new Rect((int) jl3VarM7174j.f22396a, (int) jl3VarM7174j.f22397b, (int) jl3VarM7174j.f22398c, (int) jl3VarM7174j.f22399d), false);
        }
        return ju4.f22634a;
    }

    @Override // p000.pp4
    /* JADX INFO: renamed from: w */
    public final Object mo3663w() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
    }
}
