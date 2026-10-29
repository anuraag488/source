package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q00 extends mt2 implements lf2, g14 {

    /* JADX INFO: renamed from: o */
    public yp1 f28116o;

    public q00(yp1 yp1Var) {
        this.f28116o = yp1Var;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0558d0 c0558d0 = new C0558d0((byte) 16);
        c0558d0.f16655b = db3VarMo5826e;
        c0558d0.f16656c = this;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0558d0);
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        p44 p44Var;
        boolean z;
        e13 e13VarM10650V = sc6.m10650V(this, 2);
        if (e13VarM10650V.f17617P) {
            p44Var = e13VarM10650V.f17613L;
            z = e13VarM10650V.f17616O;
        } else {
            jp3 jp3Var = se0.f30201n;
            if (jp3Var == null) {
                se0.f30201n = new jp3();
            } else {
                jp3Var.m7252a();
            }
            jp3 jp3Var2 = se0.f30201n;
            jp3Var2.f22505q = e13VarM10650V.f17625u.f33336z;
            jp3Var2.f22503o = z62.m13369a0(e13VarM10650V.f16901c);
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                this.f28116o.invoke(jp3Var2);
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                p44Var = jp3Var2.f22501m;
                z = jp3Var2.f22502n;
            } catch (Throwable th) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th;
            }
        }
        if (z) {
            o14.m8924e(q14Var, p44Var);
        }
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: k */
    public final boolean mo5442k() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f28116o + ")";
    }
}
