package p000;

import android.view.View;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class yx4 {
    /* JADX INFO: renamed from: a */
    public static void m13270a(View view, k33 k33Var) {
        xx4 xx4Var = k33Var != null ? new xx4(view, k33Var) : null;
        if (view.getTag(C0995R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (xx4Var != null) {
            view.setOnApplyWindowInsetsListener(xx4Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0995R.id.tag_window_insets_animation_callback));
        }
    }
}
