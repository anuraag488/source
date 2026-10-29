package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yf0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: a */
    public long f35189a;

    /* JADX INFO: renamed from: b */
    public Runnable f35190b;

    /* JADX INFO: renamed from: c */
    public boolean f35191c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ag0 f35192d;

    /* JADX INFO: renamed from: a */
    public final void m13112a(View view) {
        if (this.f35191c) {
            return;
        }
        this.f35191c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f35190b = runnable;
        View decorView = this.f35192d.getWindow().getDecorView();
        if (this.f35191c) {
            if (z62.m13387o(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 6);
        runnableC1054q0.f28115b = this;
        VarHandle.storeStoreFence();
        decorView.postOnAnimation(runnableC1054q0);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f35190b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f35189a) {
                this.f35191c = false;
                this.f35192d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f35190b = null;
        vp1 vp1Var = (vp1) this.f35192d.f14453g.getValue();
        synchronized (vp1Var.f32768a) {
            z = vp1Var.f32769b;
        }
        if (z) {
            this.f35191c = false;
            this.f35192d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35192d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
