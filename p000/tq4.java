package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tq4 extends uq4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ uq4 f31339a;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() != 9) {
            return this.f31339a.mo166b(kb2Var);
        }
        kb2Var.mo7477N();
        return null;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) {
        if (obj == null) {
            yb2Var.mo12211t();
        } else {
            this.f31339a.mo167c(yb2Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f31339a + "]";
    }
}
