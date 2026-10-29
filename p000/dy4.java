package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dy4 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17506a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ View f17507b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f17508c;

    public /* synthetic */ dy4(byte b) {
        this.f17506a = b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f17506a) {
            case 0:
                AbstractC1091r0 abstractC1091r0 = (AbstractC1091r0) this.f17507b;
                lk2 lk2VarM13694z = zp0.m13694z(abstractC1091r0);
                if (lk2VarM13694z == null) {
                    q32.m9722d("View tree for " + abstractC1091r0 + " has no ViewTreeLifecycleOwner");
                    xy4.m12794w();
                } else {
                    ((ql3) this.f17508c).f28555a = i20.m6599x(abstractC1091r0, lk2VarM13694z.getLifecycle());
                    abstractC1091r0.removeOnAttachStateChangeListener(this);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f17506a) {
            case 0:
                break;
            default:
                this.f17507b.removeOnAttachStateChangeListener(this);
                ((el3) this.f17508c).m5164A();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m4799a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m4800b(View view) {
    }
}
