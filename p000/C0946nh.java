package p000;

import android.os.Handler;
import android.view.Choreographer;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: renamed from: nh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0946nh extends so0 {

    /* JADX INFO: renamed from: l */
    public static final dg4 f25787l = new dg4(new C0515c5(9));

    /* JADX INFO: renamed from: m */
    public static final C0753i8 f25788m = new C0753i8((byte) 4);

    /* JADX INFO: renamed from: b */
    public final Choreographer f25789b;

    /* JADX INFO: renamed from: c */
    public final Handler f25790c;

    /* JADX INFO: renamed from: d */
    public final Object f25791d = new Object();

    /* JADX INFO: renamed from: e */
    public final C0461ao f25792e = new C0461ao();

    /* JADX INFO: renamed from: f */
    public ArrayList f25793f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public ArrayList f25794g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f25795h;

    /* JADX INFO: renamed from: i */
    public boolean f25796i;

    /* JADX INFO: renamed from: j */
    public final ChoreographerFrameCallbackC0909mh f25797j;

    /* JADX INFO: renamed from: k */
    public final C1034ph f25798k;

    public C0946nh(Choreographer choreographer, Handler handler) {
        this.f25789b = choreographer;
        this.f25790c = handler;
        ChoreographerFrameCallbackC0909mh choreographerFrameCallbackC0909mh = new ChoreographerFrameCallbackC0909mh();
        choreographerFrameCallbackC0909mh.f24909a = this;
        VarHandle.storeStoreFence();
        this.f25797j = choreographerFrameCallbackC0909mh;
        C1034ph c1034ph = new C1034ph((byte) 0);
        c1034ph.f27603b = choreographer;
        c1034ph.f27604c = this;
        VarHandle.storeStoreFence();
        this.f25798k = c1034ph;
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: K */
    public final void mo5041K(ro0 ro0Var, Runnable runnable) {
        synchronized (this.f25791d) {
            this.f25792e.addLast(runnable);
            if (!this.f25795h) {
                this.f25795h = true;
                this.f25790c.post(this.f25797j);
                if (!this.f25796i) {
                    this.f25796i = true;
                    this.f25789b.postFrameCallback(this.f25797j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m8730O() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.f25791d) {
                C0461ao c0461ao = this.f25792e;
                runnable = (Runnable) (c0461ao.isEmpty() ? null : c0461ao.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.f25791d) {
                    C0461ao c0461ao2 = this.f25792e;
                    runnable = (Runnable) (c0461ao2.isEmpty() ? null : c0461ao2.removeFirst());
                }
            }
            synchronized (this.f25791d) {
                if (this.f25792e.isEmpty()) {
                    z = false;
                    this.f25795h = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
