package p000;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ch4 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ nh4 f16030a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ b70 f16031b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f16030a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f16031b.resumeWith(ju4.f22634a);
        return true;
    }
}
