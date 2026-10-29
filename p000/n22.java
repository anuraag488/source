package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class n22 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f25413a = as4.m3262u(new fj0((byte) 23));

    /* JADX INFO: renamed from: a */
    public static final nt2 m8478a(nt2 nt2Var, nv2 nv2Var, q22 q22Var) {
        if (q22Var == null) {
            return nt2Var;
        }
        o22 o22Var = new o22();
        o22Var.f26300a = nv2Var;
        o22Var.f26301b = q22Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(o22Var);
    }
}
