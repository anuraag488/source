package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z72 extends AbstractC0819k1 {

    /* JADX INFO: renamed from: h */
    public static final z72 f35803h;

    /* JADX INFO: renamed from: g */
    public Object[] f35804g;

    static {
        z72 z72Var = new z72(0, 0);
        z72Var.f35804g = new Object[0];
        VarHandle.storeStoreFence();
        f35803h = z72Var;
    }

    @Override // p000.AbstractC0819k1
    /* JADX INFO: renamed from: b */
    public final Object mo7355b(int i) {
        return this.f35804g[i];
    }
}
