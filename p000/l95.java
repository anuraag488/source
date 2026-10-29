package p000;

import ads_mobile_sdk.el3;
import ads_mobile_sdk.i01;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l95 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23881a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23882b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23883c;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23881a) {
            case 0:
                ((i01) this.f23882b).m1249a((x34) this.f23883c, 1, 0L);
                return;
            default:
                el3 el3Var = (el3) this.f23882b;
                MotionEvent motionEvent = (MotionEvent) this.f23883c;
                try {
                    el3Var.m834b(motionEvent);
                    if (motionEvent != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                }
        }
    }
}
