package p000;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mg3 extends AbstractC1165t0 implements b80, y14 {

    /* JADX INFO: renamed from: e */
    public f40 f24885e;

    @Override // p000.e92, p000.t82
    /* JADX INFO: renamed from: a */
    public final void mo4993a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new u82(mo4970A(), null, this);
        }
        mo5009y(cancellationException);
    }

    @Override // p000.y14
    /* JADX INFO: renamed from: c */
    public final Object mo5484c(wm0 wm0Var, Object obj) {
        return this.f24885e.mo5484c(wm0Var, obj);
    }

    @Override // p000.b80
    /* JADX INFO: renamed from: d */
    public final Object mo3509d(wm0 wm0Var) {
        return this.f24885e.mo3509d(wm0Var);
    }

    @Override // p000.AbstractC1165t0
    /* JADX INFO: renamed from: h0 */
    public final void mo8297h0(Throwable th, boolean z) {
        if (this.f24885e.m5486f(th, false) || z) {
            return;
        }
        n40.m8509s(this.f30702d, th);
    }

    @Override // p000.b80
    /* JADX INFO: renamed from: i */
    public final Object mo3510i() {
        return this.f24885e.mo3510i();
    }

    @Override // p000.AbstractC1165t0
    /* JADX INFO: renamed from: i0 */
    public final void mo8298i0(Object obj) {
        this.f24885e.m5485e(null);
    }

    @Override // p000.b80
    public final z30 iterator() {
        return this.f24885e.iterator();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8299k0(ci0 ci0Var) {
        Unsafe unsafe;
        long j;
        C0641f8 c0641f8;
        f40 f40Var = this.f24885e;
        f40Var.getClass();
        if (AbstractC1078qo.f28633a.compareAndSwapObject(f40Var, f40.f18733m, (Object) null, ci0Var)) {
            return;
        }
        do {
            unsafe = AbstractC1078qo.f28633a;
            j = f40.f18733m;
            Object objectVolatile = unsafe.getObjectVolatile(f40Var, j);
            c0641f8 = h40.f20376q;
            if (objectVolatile != c0641f8) {
                if (objectVolatile == h40.f20377r) {
                    C1077qn.m9989o("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    nm0.m8798k(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
        } while (!unsafe.compareAndSwapObject(f40Var, j, c0641f8, h40.f20377r));
        ci0Var.invoke(f40Var.m5494p());
    }

    @Override // p000.y14
    /* JADX INFO: renamed from: n */
    public final Object mo5493n(Object obj) {
        return this.f24885e.mo5493n(obj);
    }

    @Override // p000.b80
    /* JADX INFO: renamed from: o */
    public final Object mo3511o(nd0 nd0Var) {
        f40 f40Var = this.f24885e;
        f40Var.getClass();
        Object objM5468F = f40.m5468F(f40Var, nd0Var);
        ap0 ap0Var = ap0.f14763a;
        return objM5468F;
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: y */
    public final void mo5009y(CancellationException cancellationException) {
        this.f24885e.m5486f(cancellationException, true);
        m5008x(cancellationException);
    }
}
