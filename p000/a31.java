package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a31 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public C0940nb f75o;

    /* JADX INFO: renamed from: p */
    public mq1 f76p;

    /* JADX INFO: renamed from: q */
    public d63 f77q;

    /* JADX INFO: renamed from: r */
    public boolean f78r;

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        this.f78r = false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        boolean z = true;
        if (!zq2Var.mo3587z() || !this.f78r) {
            l73 l73Var = (l73) this.f76p.invoke(w52.m12106a((((long) db3VarMo5826e.f16899a) << 32) | (((long) db3VarMo5826e.f16900b) & 4294967295L)), kl0.m7531a(j));
            uv0 uv0Var = (uv0) l73Var.f23833a;
            Object obj = l73Var.f23834b;
            C0940nb c0940nb = this.f75o;
            uv0 uv0VarM8670h = c0940nb.m8670h();
            d83 d83Var = (d83) c0940nb.f25609f;
            if (!z62.m13387o(uv0VarM8670h, uv0Var)) {
                ((d83) c0940nb.f25610g).setValue(uv0Var);
                dx2 dx2Var = (dx2) c0940nb.f25606c;
                gx2 gx2Var = dx2Var.f17478b;
                gx2 gx2Var2 = dx2Var.f17478b;
                boolean zM6192f = gx2Var.m6192f();
                if (zM6192f) {
                    try {
                        C0903mb c0903mb = (C0903mb) c0940nb.f25614k;
                        float fM11656f = c0940nb.m8670h().m11656f(obj);
                        if (!Float.isNaN(fM11656f)) {
                            c0903mb.m8259a(fM11656f, 0.0f);
                            d83Var.setValue(null);
                        }
                        ((d83) c0940nb.f25607d).setValue(obj);
                        ((d83) c0940nb.f25608e).setValue(obj);
                        gx2Var2.m6193g(null);
                    } catch (Throwable th) {
                        gx2Var2.m6193g(null);
                        throw th;
                    }
                }
                if (!zM6192f) {
                    d83Var.setValue(obj);
                }
            }
            this.f78r = true;
        }
        if (!zq2Var.mo3587z() && !this.f78r) {
            z = false;
        }
        this.f78r = z;
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C1164t c1164t = new C1164t((byte) 12);
        c1164t.f30700c = zq2Var;
        c1164t.f30699b = this;
        c1164t.f30701d = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c1164t);
    }
}
