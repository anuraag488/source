package p000;

import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f35381h = AtomicLongFieldUpdater.newUpdater(yo0.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f35382i = AtomicLongFieldUpdater.newUpdater(yo0.class, "controlState$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35383j = AtomicIntegerFieldUpdater.newUpdater(yo0.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k */
    public static final C0641f8 f35384k = new C0641f8("NOT_IN_STACK", (byte) 8);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f35385a;

    /* JADX INFO: renamed from: b */
    public final int f35386b;

    /* JADX INFO: renamed from: c */
    public final long f35387c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f35388d;

    /* JADX INFO: renamed from: e */
    public final os1 f35389e;

    /* JADX INFO: renamed from: f */
    public final os1 f35390f;

    /* JADX INFO: renamed from: g */
    public final lo3 f35391g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public yo0(int i, int i2, long j, String str) {
        this.f35385a = i;
        this.f35386b = i2;
        this.f35387c = j;
        this.f35388d = str;
        if (i < 1) {
            C1077qn.m9988n(c75.m3878j("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C1077qn.m9988n(zi4.m13618r(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C1077qn.m9988n(c75.m3878j("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f35389e = new os1();
        this.f35390f = new os1();
        this.f35391g = new lo3((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13188e(yo0 yo0Var, Runnable runnable, int i) {
        yo0Var.m13190b(runnable, false, (i & 4) == 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m13189a() {
        synchronized (this.f35391g) {
            try {
                if (f35383j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f35382i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f35385a) {
                    return 0;
                }
                if (i >= this.f35386b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f35391g.m8060b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                wo0 wo0Var = new wo0(this, i3);
                this.f35391g.m8061c(i3, wo0Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                wo0Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13190b(Runnable runnable, boolean z, boolean z2) {
        ji4 ji4VarM8928a;
        xo0 xo0Var;
        qi4.f28516f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof ji4) {
            ji4VarM8928a = (ji4) runnable;
            ji4VarM8928a.f22317a = jNanoTime;
            ji4VarM8928a.f22318b = z;
        } else {
            ni4 ni4Var = new ni4(jNanoTime, z);
            ni4Var.f25873c = runnable;
            VarHandle.storeStoreFence();
            ji4VarM8928a = ni4Var;
        }
        boolean z3 = ji4VarM8928a.f22318b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35382i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        wo0 wo0Var = threadCurrentThread instanceof wo0 ? (wo0) threadCurrentThread : null;
        if (wo0Var == null || wo0Var.f33544h != this) {
            wo0Var = null;
        }
        if (wo0Var != null && (xo0Var = wo0Var.f33539c) != xo0.f34482e && (ji4VarM8928a.f22318b || xo0Var != xo0.f34479b)) {
            wo0Var.f33543g = true;
            o25 o25Var = wo0Var.f33537a;
            if (z2) {
                ji4VarM8928a = o25Var.m8928a(ji4VarM8928a);
            } else {
                o25Var.getClass();
                ji4 ji4Var = (ji4) AbstractC1078qo.f28633a.getAndSetObject(o25Var, o25.f26307f, ji4VarM8928a);
                ji4VarM8928a = ji4Var == null ? null : o25Var.m8928a(ji4Var);
            }
        }
        if (ji4VarM8928a != null) {
            if (!(ji4VarM8928a.f22318b ? this.f35390f.m6049a(ji4VarM8928a) : this.f35389e.m6049a(ji4VarM8928a))) {
                throw new RejectedExecutionException(zi4.m13623w(new StringBuilder(), this.f35388d, " was terminated"));
            }
        }
        if (z3) {
            if (m13193k() || m13192j(jAddAndGet)) {
                return;
            }
            m13193k();
            return;
        }
        if (m13193k() || m13192j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m13193k();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        ji4 ji4VarM12334a;
        if (f35383j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            wo0 wo0Var = threadCurrentThread instanceof wo0 ? (wo0) threadCurrentThread : null;
            wo0 wo0Var2 = (wo0Var == null || wo0Var.f33544h != this) ? null : wo0Var;
            synchronized (this.f35391g) {
                i = (int) (f35382i.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    wo0 wo0Var3 = (wo0) this.f35391g.m8060b(i2);
                    if (wo0Var3 != wo0Var2) {
                        while (wo0Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(wo0Var3);
                            wo0Var3.join(10000L);
                        }
                        o25 o25Var = wo0Var3.f33537a;
                        os1 os1Var = this.f35390f;
                        o25Var.getClass();
                        ji4 ji4Var = (ji4) AbstractC1078qo.f28633a.getAndSetObject(o25Var, o25.f26307f, (Object) null);
                        if (ji4Var != null) {
                            os1Var.m6049a(ji4Var);
                        }
                        while (true) {
                            ji4 ji4VarM8930c = o25Var.m8930c();
                            if (ji4VarM8930c == null) {
                                break;
                            } else {
                                os1Var.m6049a(ji4VarM8930c);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            os1 os1Var2 = this.f35390f;
            while (true) {
                Unsafe unsafe = AbstractC1078qo.f28633a;
                long j = gn2.f19975a;
                in2 in2Var = (in2) unsafe.getObjectVolatile(os1Var2, j);
                if (in2Var.m6821b()) {
                    break;
                } else {
                    unsafe.compareAndSwapObject(os1Var2, j, in2Var, in2Var.m6822c());
                }
            }
            os1 os1Var3 = this.f35389e;
            while (true) {
                Unsafe unsafe2 = AbstractC1078qo.f28633a;
                long j2 = gn2.f19975a;
                in2 in2Var2 = (in2) unsafe2.getObjectVolatile(os1Var3, j2);
                if (in2Var2.m6821b()) {
                    break;
                } else {
                    unsafe2.compareAndSwapObject(os1Var3, j2, in2Var2, in2Var2.m6822c());
                }
            }
            while (true) {
                if (wo0Var2 != null) {
                    ji4VarM12334a = wo0Var2.m12334a(true);
                    if (ji4VarM12334a == null) {
                        ji4VarM12334a = (ji4) this.f35389e.m6051c();
                        if (ji4VarM12334a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    ji4VarM12334a = (ji4) this.f35389e.m6051c();
                    if (ji4VarM12334a == null && (ji4VarM12334a = (ji4) this.f35390f.m6051c()) == null) {
                        break;
                    }
                }
                try {
                    ji4VarM12334a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (wo0Var2 != null) {
                wo0Var2.m12341h(xo0.f34482e);
            }
            f35381h.set(this, 0L);
            f35382i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m13188e(this, runnable, 6);
    }

    /* JADX INFO: renamed from: g */
    public final void m13191g(wo0 wo0Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35381h;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM12336c = wo0Var.m12336c();
                    while (true) {
                        if (objM12336c == f35384k) {
                            i3 = -1;
                            break;
                        }
                        if (objM12336c == null) {
                            i3 = 0;
                            break;
                        }
                        wo0 wo0Var2 = (wo0) objM12336c;
                        int iM12335b = wo0Var2.m12335b();
                        if (iM12335b != 0) {
                            i3 = iM12335b;
                            break;
                        }
                        objM12336c = wo0Var2.m12336c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                yo0 yo0Var = this;
                if (atomicLongFieldUpdater.compareAndSet(yo0Var, j, j3)) {
                    return;
                } else {
                    this = yo0Var;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m13192j(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f35385a;
        if (i < i2) {
            int iM13189a = m13189a();
            if (iM13189a == 1 && i2 > 1) {
                m13189a();
            }
            if (iM13189a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13193k() {
        yo0 yo0Var;
        C0641f8 c0641f8;
        int iM12335b;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35381h;
            long j = atomicLongFieldUpdater.get(this);
            wo0 wo0Var = (wo0) this.f35391g.m8060b((int) (2097151 & j));
            if (wo0Var == null) {
                wo0Var = null;
                yo0Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM12336c = wo0Var.m12336c();
                while (true) {
                    c0641f8 = f35384k;
                    if (objM12336c == c0641f8) {
                        iM12335b = -1;
                        break;
                    }
                    if (objM12336c == null) {
                        iM12335b = 0;
                        break;
                    }
                    wo0 wo0Var2 = (wo0) objM12336c;
                    iM12335b = wo0Var2.m12335b();
                    if (iM12335b != 0) {
                        break;
                    }
                    objM12336c = wo0Var2.m12336c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iM12335b >= 0) {
                    yo0 yo0Var2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(yo0Var2, j, j2 | ((long) iM12335b));
                    yo0Var = yo0Var2;
                    if (zCompareAndSet) {
                        wo0Var.m12340g(c0641f8);
                    }
                    this = yo0Var;
                } else {
                    continue;
                }
            }
            if (wo0Var == null) {
                return false;
            }
            if (wo0.f33535i.compareAndSet(wo0Var, -1, 0)) {
                LockSupport.unpark(wo0Var);
                return true;
            }
            this = yo0Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        lo3 lo3Var = this.f35391g;
        int iM8059a = lo3Var.m8059a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM8059a; i6++) {
            wo0 wo0Var = (wo0) lo3Var.m8060b(i6);
            if (wo0Var != null) {
                o25 o25Var = wo0Var.f33537a;
                o25Var.getClass();
                Object objectVolatile = AbstractC1078qo.f28633a.getObjectVolatile(o25Var, o25.f26307f);
                int iM8929b = o25Var.m8929b();
                if (objectVolatile != null) {
                    iM8929b++;
                }
                int iOrdinal = wo0Var.f33539c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM8929b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM8929b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iM8929b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM8929b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        C0670g.m5864c();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f35382i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f35388d);
        sb4.append('@');
        sb4.append(ev0.m5354d0(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.f35385a;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f35386b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f35389e.m6050b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f35390f.m6050b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
