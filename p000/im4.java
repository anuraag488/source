package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class im4 extends w82 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f21560g = AbstractC1078qo.f28633a.objectFieldOffset(im4.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e */
    public Thread f21561e;

    /* JADX INFO: renamed from: f */
    public w01 f21562f;

    /* JADX INFO: renamed from: q */
    public static void m6818q(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: n */
    public final boolean mo3514n() {
        return true;
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: o */
    public final void mo3515o(Throwable th) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f21560g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                m6818q(intVolatile);
                throw null;
            }
            im4 im4Var = this;
            if (unsafe.compareAndSwapInt(im4Var, f21560g, intVolatile, 2)) {
                im4Var.f21561e.interrupt();
                unsafe.putIntVolatile(im4Var, j, 3);
                return;
            }
            this = im4Var;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6819p() {
        im4 im4Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f21560g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                im4Var = this;
                if (unsafe.compareAndSwapInt(im4Var, j, intVolatile, 1)) {
                    w01 w01Var = im4Var.f21562f;
                    if (w01Var != null) {
                        w01Var.mo3937a();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m6818q(intVolatile);
                        throw null;
                    }
                }
                im4Var = this;
            }
            this = im4Var;
        }
    }
}
