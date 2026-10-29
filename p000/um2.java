package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class um2 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f31991a = as4.m3262u(new da2((byte) 7));

    /* JADX INFO: renamed from: a */
    public static u33 m11585a(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        u33 u33Var = (u33) ir1Var.m6898k(f31991a);
        Object obj = null;
        if (u33Var == null) {
            ir1Var.m6885d0(1208426157);
            View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
            while (true) {
                if (view == null) {
                    u33Var = null;
                    break;
                }
                Object tag = view.getTag(C0995R.id.view_tree_on_back_pressed_dispatcher_owner);
                u33 u33Var2 = tag instanceof u33 ? (u33) tag : null;
                if (u33Var2 != null) {
                    u33Var = u33Var2;
                    break;
                }
                Object objM8506p = n40.m8506p(view);
                view = objM8506p instanceof View ? (View) objM8506p : null;
            }
        } else {
            ir1Var.m6885d0(1208423708);
        }
        ir1Var.m6912r(false);
        if (u33Var != null) {
            ir1Var.m6885d0(1208423789);
            ir1Var.m6912r(false);
            return u33Var;
        }
        ir1Var.m6885d0(1208428160);
        for (Context baseContext = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof u33) {
                obj = baseContext;
                break;
            }
        }
        u33 u33Var3 = (u33) obj;
        ir1Var.m6912r(false);
        return u33Var3;
    }
}
