package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class yr4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) {
        return new AtomicBoolean(kb2Var.mo7471C());
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        yb2Var.mo12203M(((AtomicBoolean) obj).get());
    }
}
