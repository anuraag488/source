package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class n63 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f25473a = as4.m3263v(new kr2((byte) 22));

    /* JADX INFO: renamed from: a */
    public static final nt2 m8545a(nt2 nt2Var) {
        o63 o63Var = new o63();
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(o63Var);
    }

    /* JADX INFO: renamed from: b */
    public static final C1289wd m8546b(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(282942128);
        C1327xd c1327xd = (C1327xd) ir1Var.m6898k(f25473a);
        if (c1327xd == null) {
            ir1Var.m6912r(false);
            return null;
        }
        boolean zM6890g = ir1Var.m6890g(c1327xd);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = c1327xd.m12663a();
            ir1Var.m6905n0(objM6869O);
        }
        C1289wd c1289wd = (C1289wd) objM6869O;
        ir1Var.m6912r(false);
        return c1289wd;
    }
}
