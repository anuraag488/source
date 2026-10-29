package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d90 extends w82 {

    /* JADX INFO: renamed from: e */
    public b70 f16866e;

    @Override // p000.w82
    /* JADX INFO: renamed from: n */
    public final boolean mo3514n() {
        return true;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: o */
    public final void mo3515o(Throwable th) {
        b70 b70Var = this.f16866e;
        Throwable thMo3494q = b70Var.mo3494q(m12167m());
        if (b70Var.m3501y()) {
            f01 f01Var = (f01) b70Var.f15138d;
            while (true) {
                Unsafe unsafe = AbstractC1078qo.f28633a;
                long j = f01.f18625h;
                Object objectVolatile = unsafe.getObjectVolatile(f01Var, j);
                C0641f8 c0641f8 = g01.f19458b;
                if (z62.m13387o(objectVolatile, c0641f8)) {
                    if (unsafe.compareAndSwapObject(f01Var, j, c0641f8, thMo3494q)) {
                        return;
                    }
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    if (unsafe.compareAndSwapObject(f01Var, j, objectVolatile, (Object) null)) {
                        break;
                    }
                }
            }
        }
        b70Var.mo115m(thMo3494q);
        if (b70Var.m3501y()) {
            return;
        }
        b70Var.m3492o();
    }
}
