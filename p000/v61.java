package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class v61 {
    /* JADX INFO: renamed from: a */
    public void mo11753a(eg4 eg4Var, eg4 eg4Var2, Window window, View view, boolean z, boolean z2) {
        z62.m13363V(window);
        window.setStatusBarColor(z ? eg4Var.f18078b : eg4Var.f18077a);
        window.setNavigationBarColor(z2 ? eg4Var2.f18078b : eg4Var2.f18077a);
        w42 w42Var = new w42(view);
        pq3 x05Var = Build.VERSION.SDK_INT >= 35 ? new x05(window, w42Var) : new pq3(window, w42Var);
        x05Var.mo9612k(!z);
        x05Var.mo9611i(!z2);
    }
}
