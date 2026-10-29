package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: mh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0909mh implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0946nh f24909a;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f24909a.f25790c.removeCallbacks(this);
        this.f24909a.m8730O();
        C0946nh c0946nh = this.f24909a;
        synchronized (c0946nh.f25791d) {
            if (c0946nh.f25796i) {
                c0946nh.f25796i = false;
                ArrayList arrayList = c0946nh.f25793f;
                c0946nh.f25793f = c0946nh.f25794g;
                c0946nh.f25794g = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24909a.m8730O();
        C0946nh c0946nh = this.f24909a;
        synchronized (c0946nh.f25791d) {
            if (c0946nh.f25793f.isEmpty()) {
                c0946nh.f25789b.removeFrameCallback(this);
                c0946nh.f25796i = false;
            }
        }
    }
}
