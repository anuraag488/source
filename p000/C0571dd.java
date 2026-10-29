package p000;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0571dd {

    /* JADX INFO: renamed from: a */
    public static final C0571dd f16993a = new C0571dd();

    /* JADX INFO: renamed from: a */
    public final void m4444a(View view, jc3 jc3Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = jc3Var instanceof C0796jf ? PointerIcon.getSystemIcon(context, ((C0796jf) jc3Var).f22201b) : PointerIcon.getSystemIcon(context, 1000);
        if (z62.m13387o(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
