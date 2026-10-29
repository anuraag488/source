package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xk2 extends so0 implements mx0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34332h = AtomicIntegerFieldUpdater.newUpdater(xk2.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ long f34333i = AbstractC1078qo.f28633a.objectFieldOffset(xk2.class.getDeclaredField("runningWorkers$volatile"));

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mx0 f34334b;

    /* JADX INFO: renamed from: c */
    public so0 f34335c;

    /* JADX INFO: renamed from: d */
    public int f34336d;

    /* JADX INFO: renamed from: e */
    public String f34337e;

    /* JADX INFO: renamed from: f */
    public gn2 f34338f;

    /* JADX INFO: renamed from: g */
    public Object f34339g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Override // p000.mx0
    /* JADX INFO: renamed from: A */
    public final w01 mo6961A(long j, Runnable runnable, ro0 ro0Var) {
        return this.f34334b.mo6961A(j, runnable, ro0Var);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: K */
    public final void mo5041K(ro0 ro0Var, Runnable runnable) {
        Runnable runnableM12700O;
        this.f34338f.m6049a(runnable);
        if (AbstractC1078qo.f28633a.getIntVolatile(this, f34333i) >= this.f34336d || !m12701P() || (runnableM12700O = m12700O()) == null) {
            return;
        }
        try {
            g01.m5868b(this.f34335c, this, new oz5(this, runnableM12700O));
        } catch (Throwable th) {
            f34332h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: L */
    public final void mo6175L(ro0 ro0Var, Runnable runnable) {
        Runnable runnableM12700O;
        this.f34338f.m6049a(runnable);
        if (AbstractC1078qo.f28633a.getIntVolatile(this, f34333i) >= this.f34336d || !m12701P() || (runnableM12700O = m12700O()) == null) {
            return;
        }
        try {
            this.f34335c.mo6175L(this, new oz5(this, runnableM12700O));
        } catch (Throwable th) {
            f34332h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: N */
    public final so0 mo5042N(int i, String str) {
        vd6.m11848g(i);
        return i >= this.f34336d ? vd6.m11823G(this, str) : super.mo5042N(i, str);
    }

    /* JADX INFO: renamed from: O */
    public final Runnable m12700O() {
        while (true) {
            Runnable runnable = (Runnable) this.f34338f.m6051c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f34339g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34332h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f34338f.m6050b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m12701P() {
        synchronized (this.f34339g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34332h;
            if (AbstractC1078qo.f28633a.getIntVolatile(this, f34333i) >= this.f34336d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: j */
    public final void mo5055j(long j, b70 b70Var) {
        this.f34334b.mo5055j(j, b70Var);
    }

    @Override // p000.so0
    public final String toString() {
        String str = this.f34337e;
        if (str != null) {
            return str;
        }
        return this.f34335c + ".limitedParallelism(" + this.f34336d + ')';
    }
}
