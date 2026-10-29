package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public vz0 f33287o;

    /* JADX INFO: renamed from: p */
    public float f33288p;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        int iM7541k;
        int iM7539i;
        int iM7538h;
        int i;
        if (!kl0.m7535e(j) || this.f33287o == vz0.f32978a) {
            iM7541k = kl0.m7541k(j);
            iM7539i = kl0.m7539i(j);
        } else {
            int iRound = Math.round(kl0.m7539i(j) * this.f33288p);
            int iM7541k2 = kl0.m7541k(j);
            iM7541k = kl0.m7539i(j);
            if (iRound < iM7541k2) {
                iRound = iM7541k2;
            }
            if (iRound <= iM7541k) {
                iM7541k = iRound;
            }
            iM7539i = iM7541k;
        }
        if (!kl0.m7534d(j) || this.f33287o == vz0.f32979b) {
            int iM7540j = kl0.m7540j(j);
            int iM7538h2 = kl0.m7538h(j);
            iM7538h = iM7540j;
            i = iM7538h2;
        } else {
            int iRound2 = Math.round(kl0.m7538h(j) * this.f33288p);
            int iM7540j2 = kl0.m7540j(j);
            iM7538h = kl0.m7538h(j);
            if (iRound2 < iM7540j2) {
                iRound2 = iM7540j2;
            }
            if (iRound2 <= iM7538h) {
                iM7538h = iRound2;
            }
            i = iM7538h;
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8009a(iM7541k, iM7539i, iM7538h, i));
        int i2 = db3VarMo5826e.f16899a;
        int i3 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 5);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i2, i3, w71.f33134a, c0830kc);
    }
}
