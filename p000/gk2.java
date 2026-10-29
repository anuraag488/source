package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk2 {
    public gk2() {
        new AtomicReference(null);
    }

    /* JADX INFO: renamed from: a */
    public void mo6015a(kk2 kk2Var) {
        if (kk2Var instanceof jw0) {
            jw0 jw0Var = (jw0) kk2Var;
            jw0Var.mo4241e();
            jw0Var.onResume();
        } else {
            throw new IllegalArgumentException((kk2Var + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public fk2 mo6016b() {
        return fk2.f19058e;
    }

    /* JADX INFO: renamed from: c */
    public void mo6017c(kk2 kk2Var) {
    }
}
