package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class a04 extends oj0 implements s13 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20e = AtomicIntegerFieldUpdater.newUpdater(a04.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f21f = AbstractC1078qo.f28633a.objectFieldOffset(a04.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d */
    public final long f22d;

    public a04(long j, a04 a04Var, int i) {
        super(a04Var);
        this.f22d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p000.oj0
    /* JADX INFO: renamed from: d */
    public final boolean mo3d() {
        return AbstractC1078qo.f28633a.getIntVolatile(this, f21f) == mo5g() && m9129c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4f() {
        return f20e.addAndGet(this, -65536) == mo5g() && m9129c() != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo5g();

    /* JADX INFO: renamed from: h */
    public abstract void mo6h(int i, ro0 ro0Var);

    /* JADX INFO: renamed from: i */
    public final void m7i() {
        if (f20e.incrementAndGet(this) == mo5g()) {
            m9130e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8j() {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f21f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.mo5g() && this.m9129c() != null) {
                return false;
            }
            a04 a04Var = this;
            if (unsafe.compareAndSwapInt(a04Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = a04Var;
        }
    }
}
