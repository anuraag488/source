package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z61 extends y61 {
    @Override // p000.x61, p000.v61
    /* JADX INFO: renamed from: a */
    public void mo11753a(eg4 eg4Var, eg4 eg4Var2, Window window, View view, boolean z, boolean z2) {
        z62.m13363V(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            C1018p1 c1018p1 = new C1018p1((byte) 7);
            c1018p1.f27270c = viewGroup;
            VarHandle.storeStoreFence();
            while (c1018p1.hasNext()) {
                Object tag = ((View) c1018p1.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof cc0)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        w42 w42Var = new w42(view);
        pq3 x05Var = Build.VERSION.SDK_INT >= 35 ? new x05(window, w42Var) : new pq3(window, w42Var);
        x05Var.mo9612k(!z);
        x05Var.mo9611i(true ^ z2);
    }
}
