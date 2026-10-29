package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z84 implements xh1 {

    /* JADX INFO: renamed from: a */
    public jp0 f35873a;

    /* JADX INFO: renamed from: b */
    public gv0 f35874b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1407zj f35875c;

    /* JADX INFO: renamed from: d */
    public xz0 f35876d;

    @Override // p000.xh1
    /* JADX INFO: renamed from: a */
    public Object mo3327a(tx3 tx3Var, float f, wm0 wm0Var) {
        return m13451c(tx3Var, f, gq6.f20047l, (ym0) wm0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m13450b(tx3 tx3Var, float f, yp1 yp1Var, ym0 ym0Var) throws Throwable {
        u84 u84Var;
        yp1 yp1Var2;
        if (ym0Var instanceof u84) {
            u84Var = (u84) ym0Var;
            int i = u84Var.f31734w;
            if ((i & Integer.MIN_VALUE) != 0) {
                u84Var.f31734w = i - Integer.MIN_VALUE;
            } else {
                u84Var = new u84(this, ym0Var);
            }
        } else {
            u84Var = new u84(this, ym0Var);
        }
        Object objM7921b0 = u84Var.f31732u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = u84Var.f31734w;
        if (i2 == 0) {
            k43.m7376J(objM7921b0);
            xz0 xz0Var = this.f35876d;
            w84 w84Var = new w84(this, f, yp1Var, tx3Var, null);
            u84Var.f31731t = yp1Var;
            u84Var.f31734w = 1;
            objM7921b0 = lb5.m7921b0(xz0Var, w84Var, u84Var);
            if (objM7921b0 == ap0Var) {
                return ap0Var;
            }
            yp1Var2 = yp1Var;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp1Var2 = u84Var.f31731t;
            k43.m7376J(objM7921b0);
        }
        C1295wj c1295wj = (C1295wj) objM7921b0;
        yp1Var2.invoke(new Float(0.0f));
        return c1295wj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m13451c(tx3 tx3Var, float f, r54 r54Var, ym0 ym0Var) throws Throwable {
        x84 x84Var;
        if (ym0Var instanceof x84) {
            x84Var = (x84) ym0Var;
            int i = x84Var.f34068v;
            if ((i & Integer.MIN_VALUE) != 0) {
                x84Var.f34068v = i - Integer.MIN_VALUE;
            } else {
                x84Var = new x84(this, ym0Var);
            }
        } else {
            x84Var = new x84(this, ym0Var);
        }
        Object objM13450b = x84Var.f34066t;
        Object obj = ap0.f14763a;
        int i2 = x84Var.f34068v;
        if (i2 == 0) {
            k43.m7376J(objM13450b);
            x84Var.f34068v = 1;
            objM13450b = m13450b(tx3Var, f, r54Var, x84Var);
            if (objM13450b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objM13450b);
        }
        C1295wj c1295wj = (C1295wj) objM13450b;
        return new Float(c1295wj.f33413a.floatValue() != 0.0f ? ((Number) c1295wj.f33414b.m3020a()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m13452d(tx3 tx3Var, float f, float f2, v84 v84Var, ym0 ym0Var) {
        y84 y84Var;
        InterfaceC0657fn interfaceC0657fn;
        if (ym0Var instanceof y84) {
            y84Var = (y84) ym0Var;
            int i = y84Var.f35027v;
            if ((i & Integer.MIN_VALUE) != 0) {
                y84Var.f35027v = i - Integer.MIN_VALUE;
            } else {
                y84Var = new y84(this, ym0Var);
            }
        } else {
            y84Var = new y84(this, ym0Var);
        }
        y84 y84Var2 = y84Var;
        Object objMo5747k = y84Var2.f35025t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = y84Var2.f35027v;
        if (i2 == 0) {
            k43.m7376J(objMo5747k);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return k43.m7379a(f, f2, 28);
            }
            y84Var2.f35027v = 1;
            gv0 gv0Var = this.f35874b;
            if (Math.abs(ks5.m7611l(gv0Var, 0.0f, f2)) >= Math.abs(f)) {
                js1 js1Var = new js1();
                js1Var.f22555a = gv0Var;
                VarHandle.storeStoreFence();
                interfaceC0657fn = js1Var;
            } else {
                InterfaceC1407zj interfaceC1407zj = this.f35875c;
                wd3 wd3Var = new wd3((byte) 14);
                wd3Var.f33259b = interfaceC1407zj;
                VarHandle.storeStoreFence();
                interfaceC0657fn = wd3Var;
            }
            objMo5747k = interfaceC0657fn.mo5747k(tx3Var, new Float(f), new Float(f2), v84Var, y84Var2);
            if (objMo5747k == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objMo5747k);
        }
        return ((C1295wj) objMo5747k).f33414b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z84) {
            z84 z84Var = (z84) obj;
            return z62.m13387o(z84Var.f35875c, this.f35875c) && z62.m13387o(z84Var.f35874b, this.f35874b) && z84Var.f35873a == this.f35873a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35873a.hashCode() + ((this.f35874b.hashCode() + (this.f35875c.hashCode() * 31)) * 31);
    }
}
