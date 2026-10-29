package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: oh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0983oh implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ b70 f26689a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f26690b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objM7389n;
        b70 b70Var = this.f26689a;
        try {
            objM7389n = this.f26690b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            objM7389n = k43.m7389n(th);
        }
        b70Var.resumeWith(objM7389n);
    }
}
