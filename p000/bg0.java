package p000;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bg0 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f15252a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: a */
    public static final void m3568a(ag0 ag0Var, ui0 ui0Var, pg0 pg0Var) {
        View childAt = ((ViewGroup) ag0Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        fi0 fi0Var = childAt instanceof fi0 ? (fi0) childAt : null;
        if (fi0Var != null) {
            fi0Var.setParentCompositionContext(ui0Var);
            fi0Var.setContent(pg0Var);
            return;
        }
        fi0 fi0Var2 = new fi0(ag0Var);
        fi0Var2.f19012j = k43.m7398w(null);
        VarHandle.storeStoreFence();
        fi0Var2.setParentCompositionContext(ui0Var);
        fi0Var2.setContent(pg0Var);
        View decorView = ag0Var.getWindow().getDecorView();
        if (zp0.m13694z(decorView) == null) {
            decorView.setTag(C0995R.id.view_tree_lifecycle_owner, ag0Var);
        }
        if (ev0.m5352b0(decorView) == null) {
            decorView.setTag(C0995R.id.view_tree_view_model_store_owner, ag0Var);
        }
        if (dt0.m4681D(decorView) == null) {
            decorView.setTag(C0995R.id.view_tree_saved_state_registry_owner, ag0Var);
        }
        ag0Var.setContentView(fi0Var2, f15252a);
    }
}
