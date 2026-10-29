package p000;

import java.lang.invoke.VarHandle;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n35 implements ti0, jk2 {

    /* JADX INFO: renamed from: a */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f25424a;

    /* JADX INFO: renamed from: b */
    public zi0 f25425b;

    /* JADX INFO: renamed from: c */
    public boolean f25426c;

    /* JADX INFO: renamed from: d */
    public gk2 f25427d;

    /* JADX INFO: renamed from: e */
    public mq1 f25428e;

    @Override // p000.ti0
    /* JADX INFO: renamed from: a */
    public final void mo8488a() {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f25424a;
        if (!this.f25426c) {
            this.f25426c = true;
            viewTreeObserverOnGlobalLayoutListenerC1140sc.getView().setTag(C0995R.id.wrapped_composition_tag, null);
            gk2 gk2Var = this.f25427d;
            if (gk2Var != null) {
                gk2Var.mo6017c(this);
            }
            this.f25427d = null;
            x01 x01Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30117g;
            if (x01Var != null) {
                x01Var.f33896b.invoke();
            }
            viewTreeObserverOnGlobalLayoutListenerC1140sc.f30117g = null;
        }
        this.f25425b.mo8488a();
    }

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        if (ek2Var == ek2.ON_DESTROY) {
            mo8488a();
        } else {
            if (ek2Var != ek2.ON_CREATE || this.f25426c) {
                return;
            }
            m8489c(this.f25428e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8489c(mq1 mq1Var) {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f25424a;
        cz3 cz3Var = new cz3((byte) 29);
        cz3Var.f16638b = this;
        cz3Var.f16639c = mq1Var;
        VarHandle.storeStoreFence();
        viewTreeObserverOnGlobalLayoutListenerC1140sc.setOnReadyForComposition(cz3Var);
    }
}
