package p000;

import android.view.Choreographer;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lh4 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public ArrayList f24036a;

    /* JADX INFO: renamed from: b */
    public WindowInsets f24037b;

    /* JADX INFO: renamed from: c */
    public boolean f24038c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ nh4 f24039d;

    /* JADX INFO: renamed from: a */
    public final void m7971a() {
        nh4 nh4Var = this.f24039d;
        WindowInsets windowInsets = nh4Var.f25820i.getCurrentWindowMetrics().getWindowInsets();
        if (z62.m13387o(windowInsets, this.f24037b)) {
            return;
        }
        xn2 xn2Var = nh4Var.f25827p;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "window insets changed " + windowInsets, null);
            }
        }
        this.f24037b = windowInsets;
        ArrayList arrayList = this.f24036a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f24038c = false;
        m7971a();
    }
}
