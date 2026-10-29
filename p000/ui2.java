package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ui2 {

    /* JADX INFO: renamed from: a */
    public static final mi2 f31892a;

    static {
        ti2 ti2Var = new ti2();
        VarHandle.storeStoreFence();
        f31892a = new mi2(null, 0, false, 0.0f, ti2Var, 0.0f, false, zp0.m13670b(r71.f29063a), oh6.m9098d(1.0f, 1.0f), ll0.m8010b(0, 0, 0, 0, 15), 0, v71.f32439a, 0, 0, 0, d63.f16814a, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final si2 m11560a(mi0 mi0Var) {
        Object[] objArr = new Object[0];
        yg3 yg3Var = si2.f30294x;
        boolean zM6886e = ((ir1) mi0Var).m6886e(0) | ((ir1) mi0Var).m6886e(0);
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (zM6886e || objM6869O == ki0.f23136a) {
            objM6869O = new da2((byte) 4);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(objM6869O);
        }
        return (si2) dt0.m4688Q(objArr, yg3Var, (wp1) objM6869O, ir1Var, 0);
    }
}
