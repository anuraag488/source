package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z31 implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ a41 f35735a;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a41 a41Var = this.f35735a;
        d83 d83Var = a41Var.f92g;
        d83Var.setValue(Integer.valueOf(((Number) d83Var.getValue()).intValue() + 1));
        Drawable drawable2 = a41Var.f91f;
        pg2 pg2Var = c41.f15794a;
        a41Var.f93h.setValue(h74.m6269a((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : i20.m6583h(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ((Handler) c41.f15794a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        ((Handler) c41.f15794a.getValue()).removeCallbacks(runnable);
    }
}
