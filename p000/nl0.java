package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 implements p74, jf2 {

    /* JADX INFO: renamed from: a */
    public ac4 f25926a;

    @Override // p000.p74
    /* JADX INFO: renamed from: c */
    public final Object mo7272c(kk3 kk3Var) {
        ac4 ac4Var = this.f25926a;
        C0843kp c0843kp = new C0843kp((byte) 1);
        c0843kp.f23306b = ac4Var;
        VarHandle.storeStoreFence();
        return lb5.m7901I(c0843kp, kk3Var);
    }

    @Override // p000.jf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo6529e(zq2 zq2Var, sq2 sq2Var, long j) {
        ac4 ac4Var = this.f25926a;
        kl0 kl0VarM7531a = kl0.m7531a(j);
        ac4Var.getClass();
        ac4Var.m200k(null, kl0VarM7531a);
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 3);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }
}
