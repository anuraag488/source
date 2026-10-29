package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: gy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0705gy implements mj4 {

    /* JADX INFO: renamed from: a */
    public pg0 f20180a;

    /* JADX INFO: renamed from: b */
    public dx2 f20181b;

    /* JADX INFO: renamed from: c */
    public d83 f20182c;

    @Override // p000.mj4
    /* JADX INFO: renamed from: a */
    public final Object mo5708a(ej4 ej4Var, of4 of4Var) {
        C0668fy c0668fy = new C0668fy();
        c0668fy.f19405a = ej4Var;
        c0668fy.f19406b = ev0.m5333H(0, null, null, 7);
        VarHandle.storeStoreFence();
        dx2 dx2Var = this.f20181b;
        C0792jb c0792jb = new C0792jb(this, c0668fy, null, (byte) 5);
        xw2 xw2Var = xw2.f34665a;
        dx2Var.getClass();
        Object objM13685q = zp0.m13685q(new C0667fx(xw2Var, dx2Var, c0792jb, (wm0) null), of4Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: b */
    public final void m6194b(wp1 wp1Var, mi0 mi0Var, int i) {
        wp1 wp1Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(723898654);
        int i2 = (ir1Var.m6890g(this) ? 32 : 16) | i;
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            C0668fy c0668fy = (C0668fy) this.f20182c.getValue();
            if (c0668fy == null) {
                yk3 yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    C0630ey c0630ey = new C0630ey(b);
                    c0630ey.f18565b = this;
                    c0630ey.f18566c = wp1Var;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = c0630ey;
                    return;
                }
                return;
            }
            wp1Var2 = wp1Var;
            this.f20180a.mo6994d(c0668fy, c0668fy.f19405a, wp1Var2, ir1Var, 384);
        } else {
            wp1Var2 = wp1Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v2 = ir1Var.m6916v();
        if (yk3VarM6916v2 != null) {
            C0630ey c0630ey2 = new C0630ey(b2);
            c0630ey2.f18565b = this;
            c0630ey2.f18566c = wp1Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v2.f35300d = c0630ey2;
        }
    }
}
