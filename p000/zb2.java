package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class zb2 extends jf1 {
    @Override // p000.jf1
    /* JADX INFO: renamed from: e */
    public final void mo3776e(p83 p83Var) throws IOException {
        if (p83Var.toFile().mkdir()) {
            return;
        }
        xe1 xe1VarMo3779q = mo3779q(p83Var);
        if (xe1VarMo3779q == null || !xe1VarMo3779q.f34191b) {
            nm0.m8795g(p83Var, "failed to create directory: ");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
