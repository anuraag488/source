package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h01 extends nw3 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f20242f = AbstractC1078qo.f28633a.objectFieldOffset(h01.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.nw3, p000.e92
    /* JADX INFO: renamed from: p */
    public final void mo5002p(Object obj) {
        mo5004r(obj);
    }

    @Override // p000.nw3, p000.e92
    /* JADX INFO: renamed from: r */
    public final void mo5004r(Object obj) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f20242f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    g01.m5867a(C0006a5.m86x(this.f26153e), c20.m3799D(obj));
                    return;
                } else {
                    C1077qn.m9989o("Already resumed");
                    return;
                }
            }
            h01 h01Var = this;
            if (unsafe.compareAndSwapInt(h01Var, j, 0, 2)) {
                return;
            } else {
                this = h01Var;
            }
        }
    }
}
