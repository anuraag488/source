package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zx4 {
    /* JADX INFO: renamed from: a */
    public static w05 m13834a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        w05 w05VarM12042c = w05.m12042c(null, rootWindowInsets);
        t05 t05Var = w05VarM12042c.f33012a;
        t05Var.mo7788y(w05VarM12042c);
        View rootView = view.getRootView();
        t05Var.mo7773d(rootView);
        t05Var.mo7780p(rootView);
        t05Var.mo7781q();
        return w05VarM12042c;
    }
}
