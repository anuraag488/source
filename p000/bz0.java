package p000;

import android.app.Activity;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Activity f15690a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ql3 f15691b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ b70 f15692c;

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            ViewTreeObserver viewTreeObserver = this.f15690a.getWindow().getDecorView().getViewTreeObserver();
            Object obj = this.f15691b.f28555a;
            if (obj == null) {
                z62.m13366Y("listener");
                throw null;
            }
            viewTreeObserver.removeOnWindowFocusChangeListener((ViewTreeObserver.OnWindowFocusChangeListener) obj);
            this.f15692c.resumeWith(ju4.f22634a);
        }
    }
}
