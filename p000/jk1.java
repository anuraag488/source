package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jk1 extends AbstractC0782j1 {
    /* JADX INFO: renamed from: s */
    public static jk1 m7135s(zl2 zl2Var) {
        if (zl2Var instanceof jk1) {
            return (jk1) zl2Var;
        }
        hn1 hn1Var = new hn1();
        zl2Var.getClass();
        hn1Var.f20718h = zl2Var;
        VarHandle.storeStoreFence();
        return hn1Var;
    }

    /* JADX INFO: renamed from: r */
    public final C0001a0 m7136r(Class cls, uq1 uq1Var, Executor executor) {
        C0001a0 c0001a0 = new C0001a0(this, cls, uq1Var);
        mo6454a(c0001a0, C0638f5.m5526F(executor, c0001a0));
        return c0001a0;
    }
}
