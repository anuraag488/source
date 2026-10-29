package p000;

import java.lang.invoke.VarHandle;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ym0 extends AbstractC0888lx {
    private final ro0 _context;
    private transient wm0 intercepted;

    public ym0(wm0 wm0Var) {
        this(wm0Var, wm0Var != null ? wm0Var.getContext() : null);
    }

    @Override // p000.wm0
    public ro0 getContext() {
        return this._context;
    }

    public final wm0 intercepted() {
        wm0 wm0Var;
        wm0 wm0Var2 = this.intercepted;
        if (wm0Var2 != null) {
            return wm0Var2;
        }
        so0 so0Var = (so0) getContext().get(gb5.f19711b);
        if (so0Var != null) {
            f01 f01Var = new f01(-1);
            f01Var.f18626d = so0Var;
            f01Var.f18627e = this;
            f01Var.f18628f = g01.f19457a;
            f01Var.f18629g = getContext().fold(dm4.f17190b, 0);
            VarHandle.storeStoreFence();
            wm0Var = f01Var;
        } else {
            wm0Var = this;
        }
        this.intercepted = wm0Var;
        return wm0Var;
    }

    @Override // p000.AbstractC0888lx
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        wm0 wm0Var = this.intercepted;
        if (wm0Var != null && wm0Var != this) {
            f01 f01Var = (f01) wm0Var;
            do {
                unsafe = AbstractC1078qo.f28633a;
                j = f01.f18625h;
            } while (unsafe.getObjectVolatile(f01Var, j) == g01.f19458b);
            Object objectVolatile = unsafe.getObjectVolatile(f01Var, j);
            b70 b70Var = objectVolatile instanceof b70 ? (b70) objectVolatile : null;
            if (b70Var != null) {
                b70Var.m3492o();
            }
        }
        this.intercepted = ef0.f18040b;
    }

    public ym0(wm0 wm0Var, ro0 ro0Var) {
        super(wm0Var);
        this._context = ro0Var;
    }
}
