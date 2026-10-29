package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class so0 extends AbstractC1202u0 implements po0 {
    public so0() {
        super(gb5.f19711b);
    }

    /* JADX INFO: renamed from: K */
    public void mo5041K(ro0 ro0Var, Runnable runnable) {
        gw0.f20150c.mo5041K(ro0Var, runnable);
    }

    /* JADX INFO: renamed from: L */
    public void mo6175L(ro0 ro0Var, Runnable runnable) {
        g01.m5868b(this, ro0Var, runnable);
    }

    /* JADX INFO: renamed from: M */
    public boolean mo6962M(ro0 ro0Var) {
        return !(this instanceof yt4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public so0 mo5042N(int i, String str) {
        vd6.m11848g(i);
        xk2 xk2Var = new xk2();
        mx0 mx0Var = this instanceof mx0 ? (mx0) this : null;
        if (mx0Var == null) {
            mx0Var = yv0.f35546a;
        }
        xk2Var.f34334b = mx0Var;
        xk2Var.f34335c = this;
        xk2Var.f34336d = i;
        xk2Var.f34337e = str;
        xk2Var.f34338f = new gn2();
        xk2Var.f34339g = new Object();
        VarHandle.storeStoreFence();
        return xk2Var;
    }

    @Override // p000.AbstractC1202u0, p000.ro0
    public final po0 get(qo0 qo0Var) {
        if (!(qo0Var instanceof AbstractC1239v0)) {
            if (gb5.f19711b == qo0Var) {
                return this;
            }
            return null;
        }
        if (getKey() != ((AbstractC1239v0) qo0Var)) {
            return null;
        }
        throw null;
    }

    @Override // p000.AbstractC1202u0, p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        if (!(qo0Var instanceof AbstractC1239v0)) {
            return gb5.f19711b == qo0Var ? r71.f29063a : this;
        }
        if (getKey() != ((AbstractC1239v0) qo0Var)) {
            return this;
        }
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ev0.m5354d0(this);
    }
}
