package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rx3 extends mt2 implements lf2, g14 {

    /* JADX INFO: renamed from: o */
    public wx3 f29707o;

    /* JADX INFO: renamed from: p */
    public boolean f29708p;

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        if (!this.f29708p) {
            i = Integer.MAX_VALUE;
        }
        return sq2Var.mo5825b0(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        if (this.f29708p) {
            i = Integer.MAX_VALUE;
        }
        return sq2Var.mo5823W(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        qq2.m10027k(j, this.f29708p ? d63.f16814a : d63.f16815b);
        db3 db3VarMo5826e = sq2Var.mo5826e(kl0.m7532b(j, 0, this.f29708p ? kl0.m7539i(j) : Integer.MAX_VALUE, 0, this.f29708p ? Integer.MAX_VALUE : kl0.m7538h(j), 5));
        int i = db3VarMo5826e.f16899a;
        int iM7539i = kl0.m7539i(j);
        if (i > iM7539i) {
            i = iM7539i;
        }
        int i2 = db3VarMo5826e.f16900b;
        int iM7538h = kl0.m7538h(j);
        if (i2 > iM7538h) {
            i2 = iM7538h;
        }
        int i3 = db3VarMo5826e.f16900b - i2;
        int i4 = db3VarMo5826e.f16899a - i;
        if (!this.f29708p) {
            i3 = i4;
        }
        wx3 wx3Var = this.f29707o;
        a83 a83Var = wx3Var.f33833f;
        a83 a83Var2 = wx3Var.f33828a;
        a83Var.m133i(i3);
        e94 e94VarM5353c0 = ev0.m5353c0();
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            if (a83Var2.m132h() > i3) {
                a83Var2.m133i(i3);
            }
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            this.f29707o.f33829b.m133i(this.f29708p ? i2 : i);
            this.f29707o.f33830c.m133i(this.f29708p ? db3VarMo5826e.f16900b : db3VarMo5826e.f16899a);
            this.f29707o.f33831d.setValue(Boolean.FALSE);
            C0005a4 c0005a4 = new C0005a4((byte) 2);
            c0005a4.f88c = this;
            c0005a4.f87b = i3;
            c0005a4.f89d = db3VarMo5826e;
            VarHandle.storeStoreFence();
            return zq2Var.mo3583l0(i, i2, w71.f33134a, c0005a4);
        } catch (Throwable th) {
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            throw th;
        }
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        if (this.f29708p) {
            i = Integer.MAX_VALUE;
        }
        return sq2Var.mo5824Z(i);
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        o14.m8925f(q14Var);
        qx3 qx3Var = new qx3((byte) 0);
        qx3Var.f28868b = this;
        VarHandle.storeStoreFence();
        qx3 qx3Var2 = new qx3((byte) 1);
        qx3Var2.f28868b = this;
        VarHandle.storeStoreFence();
        ww3 ww3Var = new ww3(qx3Var, qx3Var2);
        if (this.f29708p) {
            p14 p14Var = m14.f24574w;
            ic2 ic2Var = o14.f26289a[13];
            p14Var.getClass();
            q14Var.mo4898a(p14Var, ww3Var);
            return;
        }
        p14 p14Var2 = m14.f24573v;
        ic2 ic2Var2 = o14.f26289a[12];
        p14Var2.getClass();
        q14Var.mo4898a(p14Var2, ww3Var);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        if (!this.f29708p) {
            i = Integer.MAX_VALUE;
        }
        return sq2Var.mo5827h(i);
    }
}
