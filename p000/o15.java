package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o15 {

    /* JADX INFO: renamed from: a */
    public static final lw2 f26290a;

    static {
        long[] jArr = tv3.f31472a;
        f26290a = new lw2();
    }

    /* JADX INFO: renamed from: a */
    public static final ui0 m8926a(View view) {
        Object tag = view.getTag(C0995R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof ui0) {
            return (ui0) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final el3 m8927b(View view) {
        ro0 ro0Var;
        C1034ph c1034ph;
        eu2 eu2Var;
        if (!view.isAttachedToWindow()) {
            q32.m9721c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objM8506p = n40.m8506p(view);
        while (objM8506p instanceof View) {
            View view2 = (View) objM8506p;
            if (view2.getId() == 16908290) {
                break;
            }
            objM8506p = view2.getParent();
            view = view2;
        }
        ui0 ui0VarM8926a = m8926a(view);
        wm0 wm0Var = null;
        if (ui0VarM8926a != null) {
            if (ui0VarM8926a instanceof el3) {
                return (el3) ui0VarM8926a;
            }
            C1077qn.m9989o("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((j15) k15.f22818a.get()).getClass();
        ro0 ro0Var2 = r71.f29063a;
        dg4 dg4Var = C0946nh.f25787l;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ro0Var = (ro0) C0946nh.f25787l.getValue();
        } else {
            ro0Var = (ro0) C0946nh.f25788m.get();
            if (ro0Var == null) {
                C1077qn.m9989o("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        ro0 ro0VarPlus = ro0Var.plus(ro0Var2);
        vt2 vt2Var = (vt2) ro0VarPlus.get(wv1.f33767j);
        byte b = 1;
        if (vt2Var != null) {
            c1034ph = new C1034ph((byte) 3);
            c1034ph.f27603b = vt2Var;
            C1126rz c1126rz = new C1126rz();
            Object obj = new Object();
            c1126rz.f29738b = obj;
            c1126rz.f29740d = new ArrayList();
            c1126rz.f29739c = new ArrayList();
            c1126rz.f29737a = true;
            VarHandle.storeStoreFence();
            c1034ph.f27604c = c1126rz;
            VarHandle.storeStoreFence();
            synchronized (obj) {
                c1126rz.f29737a = false;
            }
        } else {
            c1034ph = null;
        }
        ql3 ql3Var = new ql3();
        du2 du2Var = (du2) ro0VarPlus.get(o85.f26449i);
        ro0 ro0Var3 = du2Var;
        if (du2Var == null) {
            Context applicationContext = view.getContext().getApplicationContext();
            eu2Var = new eu2();
            eu2Var.f18489a = applicationContext;
            eu2Var.f18491c = new z73(1.0f);
            VarHandle.storeStoreFence();
            ql3Var.f28555a = eu2Var;
        }
        if (c1034ph != null) {
            ro0Var3 = eu2Var;
            ro0Var2 = c1034ph;
        }
        ro0Var3 = eu2Var;
        ro0 ro0VarPlus2 = ro0VarPlus.plus(ro0Var2).plus(ro0Var3);
        el3 el3Var = new el3(ro0VarPlus2);
        synchronized (el3Var.f18216c) {
            el3Var.f18233t = true;
        }
        um0 um0VarM13670b = zp0.m13670b(ro0VarPlus2);
        lk2 lk2VarM13694z = zp0.m13694z(view);
        gk2 lifecycle = lk2VarM13694z != null ? lk2VarM13694z.getLifecycle() : null;
        if (lifecycle == null) {
            q32.m9722d("ViewTreeLifecycleOwner not found from " + view);
            xy4.m12794w();
            return null;
        }
        dy4 dy4Var = new dy4(b);
        dy4Var.f17507b = view;
        dy4Var.f17508c = el3Var;
        VarHandle.storeStoreFence();
        view.addOnAttachStateChangeListener(dy4Var);
        m15 m15Var = new m15();
        m15Var.f24578a = um0VarM13670b;
        m15Var.f24579b = c1034ph;
        m15Var.f24580c = el3Var;
        m15Var.f24581d = ql3Var;
        VarHandle.storeStoreFence();
        lifecycle.mo6015a(m15Var);
        view.setTag(C0995R.id.androidx_compose_ui_view_composition_context, el3Var);
        ps1 ps1Var = ps1.f27931a;
        Handler handler = view.getHandler();
        int i = zu1.f36381a;
        t82 t82VarM7910S = lb5.m7910S(ps1Var, new yu1(handler, "windowRecomposer cleanup", false).f35531e, null, new vp4(el3Var, view, wm0Var, (byte) 4), 2);
        ViewOnAttachStateChangeListenerC0685ge viewOnAttachStateChangeListenerC0685ge = new ViewOnAttachStateChangeListenerC0685ge((byte) 2);
        viewOnAttachStateChangeListenerC0685ge.f19751b = t82VarM7910S;
        VarHandle.storeStoreFence();
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0685ge);
        return el3Var;
    }
}
