package p000;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y91 extends uq4 {

    /* JADX INFO: renamed from: d */
    public static final x91 f35037d = new x91();

    /* JADX INFO: renamed from: a */
    public HashMap f35038a;

    /* JADX INFO: renamed from: b */
    public HashMap f35039b;

    /* JADX INFO: renamed from: c */
    public HashMap f35040c;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        String strMo7479P = kb2Var.mo7479P();
        Enum r0 = (Enum) this.f35038a.get(strMo7479P);
        return r0 == null ? (Enum) this.f35039b.get(strMo7479P) : r0;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        yb2Var.mo12202L(r2 == null ? null : (String) this.f35040c.get(r2));
    }
}
