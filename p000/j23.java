package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j23 extends uq4 {

    /* JADX INFO: renamed from: b */
    public static final i23 f21965b;

    /* JADX INFO: renamed from: a */
    public int f21966a;

    static {
        j23 j23Var = new j23();
        j23Var.f21966a = 2;
        VarHandle.storeStoreFence();
        i23 i23Var = new i23((byte) 0);
        i23Var.f21063b = j23Var;
        VarHandle.storeStoreFence();
        f21965b = i23Var;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        int iMo7481R = kb2Var.mo7481R();
        int iM4376u = d55.m4376u(iMo7481R);
        if (iM4376u == 5 || iM4376u == 6) {
            return zi4.m13602b(this.f21966a, kb2Var);
        }
        if (iM4376u == 8) {
            kb2Var.mo7477N();
            return null;
        }
        throw new lb2("Expecting number, got: " + d55.m4377v(iMo7481R) + "; at path " + kb2Var.mo7498q());
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        yb2Var.mo12201K((Number) obj);
    }
}
