package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class j31 {

    /* JADX INFO: renamed from: a */
    public static final d31 f21983a;

    /* JADX INFO: renamed from: b */
    public static final d31 f21984b;

    static {
        int i = 3;
        wm0 wm0Var = null;
        f21983a = new d31(i, wm0Var, (byte) 0);
        f21984b = new d31(i, wm0Var, (byte) 1);
    }

    /* JADX INFO: renamed from: a */
    public static final m31 m6996a(yp1 yp1Var, mi0 mi0Var) {
        sw2 sw2VarM7369C = k43.m7369C(yp1Var, mi0Var);
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            C0761ih c0761ih = new C0761ih((byte) 5);
            c0761ih.f21416b = sw2VarM7369C;
            VarHandle.storeStoreFence();
            wv0 wv0Var = new wv0();
            wv0Var.f33749a = c0761ih;
            vv0 vv0Var = new vv0((byte) 0);
            vv0Var.f32885b = wv0Var;
            VarHandle.storeStoreFence();
            wv0Var.f33750b = vv0Var;
            wv0Var.f33751c = new dx2();
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(wv0Var);
            objM6869O = wv0Var;
        }
        return (m31) objM6869O;
    }

    /* JADX INFO: renamed from: b */
    public static final long m6997b(long j) {
        return qs5.m10097b(Float.isNaN(jx4.m7332c(j)) ? 0.0f : jx4.m7332c(j), Float.isNaN(jx4.m7333d(j)) ? 0.0f : jx4.m7333d(j));
    }
}
