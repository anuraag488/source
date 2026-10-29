package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kf4 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f23100a = as4.m3262u(new nu3((byte) 13));

    /* JADX INFO: renamed from: a */
    public static final void m7511a(nt2 nt2Var, p44 p44Var, long j, long j2, float f, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            nt2Var = kt2.f23428a;
        }
        if ((i2 & 2) != 0) {
            p44Var = k43.f22879x;
        }
        if ((i2 & 4) != 0) {
            j = ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24277a.f16959p;
        }
        if ((i2 & 8) != 0) {
            j2 = ic0.m6742b(j, mi0Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        ir1 ir1Var = (ir1) mi0Var;
        kj0 kj0Var = f23100a;
        float f2 = ((p11) ir1Var.m6898k(kj0Var)).f27285a + f;
        zh3[] zh3VarArr = {zl0.f36166a.mo7523a(pb0.m9462a(j2)), kj0Var.mo7523a(p11.m9350a(f2))};
        hf4 hf4Var = new hf4();
        hf4Var.f20532a = nt2Var;
        hf4Var.f20533b = p44Var;
        hf4Var.f20534c = j;
        hf4Var.f20535d = f2;
        hf4Var.f20536e = 0.0f;
        hf4Var.f20537f = pg0Var;
        VarHandle.storeStoreFence();
        as4.m3245d(zh3VarArr, vd6.m11834R(421772006, hf4Var, ir1Var), ir1Var, 48);
    }

    /* JADX INFO: renamed from: b */
    public static final void m7512b(wp1 wp1Var, nt2 nt2Var, boolean z, p44 p44Var, long j, long j2, float f, float f2, h10 h10Var, nv2 nv2Var, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        long j3;
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            j3 = ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24277a.f16959p;
        } else {
            j3 = j;
        }
        long jM6742b = (i2 & 32) != 0 ? ic0.m6742b(j3, mi0Var) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & 128) == 0 ? f2 : 0.0f;
        h10 h10Var2 = (i2 & 256) != 0 ? null : h10Var;
        nv2 nv2Var2 = (i2 & 512) == 0 ? nv2Var : null;
        if (nv2Var2 == null) {
            ir1 ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(-1701074900);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = sj3.m10810f();
                ir1Var.m6905n0(objM6869O);
            }
            ir1Var.m6912r(false);
            nv2Var2 = (nv2) objM6869O;
        } else {
            ir1 ir1Var2 = (ir1) mi0Var;
            ir1Var2.m6885d0(2023335947);
            ir1Var2.m6912r(false);
        }
        ir1 ir1Var3 = (ir1) mi0Var;
        kj0 kj0Var = f23100a;
        float f5 = ((p11) ir1Var3.m6898k(kj0Var)).f27285a + f3;
        zh3[] zh3VarArr = {zl0.f36166a.mo7523a(pb0.m9462a(jM6742b)), kj0Var.mo7523a(p11.m9350a(f5))};
        if4 if4Var = new if4();
        if4Var.f21343a = nt2Var;
        if4Var.f21344b = nv2Var2;
        if4Var.f21345c = p44Var;
        if4Var.f21346d = j3;
        if4Var.f21347e = f5;
        if4Var.f21348f = h10Var2;
        if4Var.f21349g = z;
        if4Var.f21350h = wp1Var;
        if4Var.f21351i = f4;
        if4Var.f21352j = pg0Var;
        VarHandle.storeStoreFence();
        as4.m3245d(zh3VarArr, vd6.m11834R(849208527, if4Var, ir1Var3), ir1Var3, 48);
    }

    /* JADX INFO: renamed from: c */
    public static final nt2 m7513c(nt2 nt2Var, p44 p44Var, long j, h10 h10Var, float f) {
        p44 p44Var2;
        nt2 nt2VarM10694G;
        kt2 kt2Var = kt2.f23428a;
        if (f > 0.0f) {
            p44Var2 = p44Var;
            nt2VarM10694G = se0.m10694G(kt2Var, 0.0f, f, p44Var2, false, 1042399);
        } else {
            p44Var2 = p44Var;
            nt2VarM10694G = kt2Var;
        }
        nt2 nt2VarMo7630d = nt2Var.mo7630d(nt2VarM10694G);
        nt2 nt2Var2 = kt2Var;
        if (h10Var != null) {
            ga4 ga4Var = h10Var.f20260a;
            g10 g10Var = new g10();
            g10Var.f19482a = 1.0f;
            g10Var.f19483b = ga4Var;
            g10Var.f19484c = p44Var2;
            VarHandle.storeStoreFence();
            nt2Var2 = g10Var;
        }
        return i25.m6619m(as4.m3258q(nt2VarMo7630d.mo7630d(nt2Var2), j, p44Var2), p44Var2);
    }

    /* JADX INFO: renamed from: d */
    public static final long m7514d(long j, float f, ir1 ir1Var) {
        dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
        boolean zBooleanValue = ((Boolean) ir1Var.m6898k(ic0.f21254a)).booleanValue();
        long j2 = dc0Var.f16959p;
        int i = pb0.f27502i;
        return (ws4.m12408a(j, j2) && zBooleanValue) ? ic0.m6747g(dc0Var, f) : j;
    }
}
