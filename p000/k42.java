package p000;

import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k42 extends b05 implements Runnable, k33, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public y05 f22857b;

    /* JADX INFO: renamed from: c */
    public boolean f22858c;

    /* JADX INFO: renamed from: d */
    public boolean f22859d;

    /* JADX INFO: renamed from: e */
    public w05 f22860e;

    @Override // p000.b05
    /* JADX INFO: renamed from: a */
    public final void mo3390a(d05 d05Var) {
        y05 y05Var = this.f22857b;
        this.f22858c = false;
        this.f22859d = false;
        w05 w05Var = this.f22860e;
        if (((WindowInsetsAnimation) d05Var.f16688a.f33259b).getDurationMillis() > 0 && w05Var != null) {
            t05 t05Var = w05Var.f33012a;
            y05Var.f34793t.m9321f(as4.m3240S(t05Var.mo7777i(8)));
            y05Var.f34792s.m9321f(as4.m3240S(t05Var.mo7777i(8)));
            y05.m12812b(y05Var, w05Var);
        }
        this.f22860e = null;
    }

    @Override // p000.k33
    /* JADX INFO: renamed from: b */
    public final w05 mo3601b(w05 w05Var) {
        this.f22860e = w05Var;
        y05 y05Var = this.f22857b;
        ow4 ow4Var = y05Var.f34792s;
        t05 t05Var = w05Var.f33012a;
        ow4Var.m9321f(as4.m3240S(t05Var.mo7777i(8)));
        if (!this.f22858c && !this.f22859d) {
            y05Var.f34793t.m9321f(as4.m3240S(t05Var.mo7777i(8)));
            y05.m12812b(y05Var, w05Var);
        }
        return y05Var.f34794u ? w05.f33011b : w05Var;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: c */
    public final void mo3391c(d05 d05Var) {
        this.f22858c = true;
        this.f22859d = true;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: d */
    public final w05 mo3392d(w05 w05Var, List list) {
        y05 y05Var = this.f22857b;
        y05.m12812b(y05Var, w05Var);
        return y05Var.f34794u ? w05.f33011b : w05Var;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: e */
    public final yg3 mo3393e(d05 d05Var, yg3 yg3Var) {
        this.f22858c = false;
        return yg3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        y05 y05Var = this.f22857b;
        if (this.f22858c) {
            this.f22858c = false;
            this.f22859d = false;
            w05 w05Var = this.f22860e;
            if (w05Var != null) {
                y05Var.f34793t.m9321f(as4.m3240S(w05Var.f33012a.mo7777i(8)));
                y05.m12812b(y05Var, w05Var);
                this.f22860e = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
