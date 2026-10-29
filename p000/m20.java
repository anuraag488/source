package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m20 extends mt2 implements bj0, s31, lf2 {

    /* JADX INFO: renamed from: o */
    public zo2 f24584o;

    /* JADX INFO: renamed from: p */
    public ry2 f24585p;

    /* JADX INFO: renamed from: q */
    public mq1 f24586q;

    /* JADX INFO: renamed from: r */
    public boolean f24587r;

    /* JADX INFO: renamed from: s */
    public n20 f24588s;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        this.f24587r = true;
    }

    /* JADX INFO: renamed from: O0 */
    public final yq2 m8193O0(InterfaceC0804jn interfaceC0804jn, sq2 sq2Var, long j) {
        n20 n20Var = this.f24588s;
        long jM7168d = n20Var.f25401f;
        if (jM7168d == 9205357640488583168L) {
            jM7168d = z62.m13369a0(interfaceC0804jn.mo6044i());
        }
        jl3 jl3Var = n20Var.m8477a() ? null : (jl3) n20Var.f25402g.getValue();
        if (jl3Var != null) {
            jM7168d = jl3Var.m7168d();
        }
        long jM13361T = z62.m13361T(jM7168d);
        long j2 = ((kl0) this.f24586q.invoke(w52.m12106a(jM13361T), kl0.m7531a(j))).f23210a;
        db3 db3VarMo5826e = sq2Var.mo5826e(j2);
        long jM8012d = ll0.m8012d(j2, jM13361T);
        return interfaceC0804jn.mo3583l0((int) (jM8012d >> 32), (int) (jM8012d & 4294967295L), w71.f33134a, new l20(this, db3VarMo5826e, (byte) 0));
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        yf2Var.m13113a();
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 1);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }
}
