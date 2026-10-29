package p000;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends AbstractC1323x9 {

    /* JADX INFO: renamed from: p */
    public td0 f31791p;

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: j */
    public final void mo6984j() {
        td0 td0Var = this.f31791p;
        if (td0Var != null) {
            td0Var.m9745c();
        }
    }

    @Override // p000.AbstractC1323x9
    /* JADX INFO: renamed from: u */
    public final void mo163u() {
        td0 td0Var = this.f31791p;
        if (td0Var != null) {
            try {
                td0Var.run();
            } catch (RejectedExecutionException e) {
                td0Var.f31085c.m6987n(e);
            }
        }
    }

    @Override // p000.AbstractC1323x9
    /* JADX INFO: renamed from: x */
    public final void mo164x(int i) {
        if (i == 0) {
            throw null;
        }
        this.f34070l = null;
        if (i == 1) {
            this.f31791p = null;
        }
    }
}
