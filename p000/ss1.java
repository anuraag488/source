package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ss1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f30542a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f30543b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m10910a() {
        if (f30542a.compareAndSet(false, true)) {
            f40 f40VarM5333H = ev0.m5333H(1, null, null, 6);
            lb5.m7910S(zp0.m13670b((ro0) C0946nh.f25787l.getValue()), null, null, new C0671g0(f40VarM5333H, null), 3);
            b71 b71Var = new b71((byte) 5);
            b71Var.f15141b = f40VarM5333H;
            VarHandle.storeStoreFence();
            synchronized (k94.f23012c) {
                k94.f23018i = hb0.m6311W0(k94.f23018i, b71Var);
            }
            k94.m7446c();
        }
    }
}
