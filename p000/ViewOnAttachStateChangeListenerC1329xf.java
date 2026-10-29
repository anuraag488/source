package p000;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: xf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1329xf implements ke3, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h */
    public static long f34212h;

    /* JADX INFO: renamed from: a */
    public View f34213a;

    /* JADX INFO: renamed from: b */
    public PriorityQueue f34214b;

    /* JADX INFO: renamed from: c */
    public boolean f34215c;

    /* JADX INFO: renamed from: d */
    public Choreographer f34216d;

    /* JADX INFO: renamed from: e */
    public C1291wf f34217e;

    /* JADX INFO: renamed from: f */
    public boolean f34218f;

    /* JADX INFO: renamed from: g */
    public long f34219g;

    @Override // p000.ke3
    /* JADX INFO: renamed from: a */
    public final void mo7510a(ie3 ie3Var) {
        this.f34214b.add(new cg3(1, ie3Var));
        if (this.f34215c) {
            return;
        }
        this.f34215c = true;
        this.f34213a.post(this);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12683b() {
        PriorityQueue priorityQueue = this.f34214b;
        C1291wf c1291wf = this.f34217e;
        long jM12242a = c1291wf.m12242a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jM12242a);
        boolean z = true;
        if (jM12242a > 0) {
            if (!((cg3) priorityQueue.peek()).f16006b.m6774b(c1291wf)) {
                priorityQueue.poll();
                z = false;
            }
            c1291wf.f33283a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f34218f) {
            this.f34219g = j;
            this.f34213a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f34218f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f34218f = false;
        this.f34213a.removeCallbacks(this);
        this.f34216d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f34213a;
        C1291wf c1291wf = this.f34217e;
        PriorityQueue priorityQueue = this.f34214b;
        if (priorityQueue.isEmpty() || !this.f34215c || !this.f34218f || view.getWindowVisibility() != 0) {
            this.f34215c = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
        c1291wf.f33283a = System.nanoTime() > (2 * f34212h) + nanos;
        c1291wf.f33284b = Math.max(this.f34219g, nanos) + f34212h;
        boolean zM12683b = false;
        while (!priorityQueue.isEmpty() && !zM12683b) {
            if (c1291wf.f33283a) {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    zM12683b = m12683b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                zM12683b = m12683b();
            }
        }
        if (zM12683b) {
            this.f34216d.postFrameCallback(this);
        } else {
            this.f34215c = false;
        }
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
    }
}
