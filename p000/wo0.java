package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wo0 extends Thread {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33535i = AtomicIntegerFieldUpdater.newUpdater(wo0.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f33536j = AbstractC1078qo.f28633a.objectFieldOffset(wo0.class.getDeclaredField("workerCtl$volatile"));

    /* JADX INFO: renamed from: a */
    public final o25 f33537a;

    /* JADX INFO: renamed from: b */
    public final ql3 f33538b;

    /* JADX INFO: renamed from: c */
    public xo0 f33539c;

    /* JADX INFO: renamed from: d */
    public long f33540d;

    /* JADX INFO: renamed from: e */
    public long f33541e;

    /* JADX INFO: renamed from: f */
    public int f33542f;

    /* JADX INFO: renamed from: g */
    public boolean f33543g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ yo0 f33544h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public wo0(yo0 yo0Var, int i) {
        this.f33544h = yo0Var;
        setDaemon(true);
        setContextClassLoader(yo0.class.getClassLoader());
        o25 o25Var = new o25();
        o25Var.f26309a = new AtomicReferenceArray(128);
        VarHandle.storeStoreFence();
        this.f33537a = o25Var;
        this.f33538b = new ql3();
        this.f33539c = xo0.f34481d;
        this.nextParkedWorker = yo0.f35384k;
        int iNanoTime = (int) System.nanoTime();
        this.f33542f = iNanoTime == 0 ? 42 : iNanoTime;
        m12339f(i);
    }

    /* JADX INFO: renamed from: a */
    public final ji4 m12334a(boolean z) {
        ji4 ji4VarM12338e;
        ji4 ji4VarM12338e2;
        long j;
        xo0 xo0Var = this.f33539c;
        xo0 xo0Var2 = xo0.f34478a;
        yo0 yo0Var = this.f33544h;
        ji4 ji4Var = null;
        o25 o25Var = this.f33537a;
        if (xo0Var != xo0Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = yo0.f35382i;
            do {
                j = atomicLongFieldUpdater.get(yo0Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    o25Var.getClass();
                    while (true) {
                        Unsafe unsafe = AbstractC1078qo.f28633a;
                        long j2 = o25.f26307f;
                        ji4 ji4Var2 = (ji4) unsafe.getObjectVolatile(o25Var, j2);
                        if (ji4Var2 == null || !ji4Var2.f22318b) {
                            int intVolatile = unsafe.getIntVolatile(o25Var, o25.f26306e);
                            int intVolatile2 = unsafe.getIntVolatile(o25Var, o25.f26308g);
                            while (intVolatile != intVolatile2 && AbstractC1078qo.f28633a.getIntVolatile(o25Var, o25.f26305d) != 0) {
                                intVolatile2--;
                                ji4 ji4VarM8931d = o25Var.m8931d(intVolatile2, true);
                                if (ji4VarM8931d != null) {
                                    ji4Var = ji4VarM8931d;
                                    break;
                                }
                            }
                            break;
                        }
                        if (unsafe.compareAndSwapObject(o25Var, j2, ji4Var2, (Object) null)) {
                            ji4Var = ji4Var2;
                            break;
                        }
                    }
                    if (ji4Var != null) {
                        return ji4Var;
                    }
                    ji4 ji4Var3 = (ji4) yo0Var.f35390f.m6051c();
                    return ji4Var3 == null ? m12342i(1) : ji4Var3;
                }
            } while (!yo0.f35382i.compareAndSet(yo0Var, j, j - 4398046511104L));
            this.f33539c = xo0.f34478a;
        }
        if (z) {
            boolean z2 = m12337d(yo0Var.f35385a * 2) == 0;
            if (z2 && (ji4VarM12338e2 = m12338e()) != null) {
                return ji4VarM12338e2;
            }
            o25Var.getClass();
            ji4 ji4VarM8930c = (ji4) AbstractC1078qo.f28633a.getAndSetObject(o25Var, o25.f26307f, (Object) null);
            if (ji4VarM8930c == null) {
                ji4VarM8930c = o25Var.m8930c();
            }
            if (ji4VarM8930c != null) {
                return ji4VarM8930c;
            }
            if (!z2 && (ji4VarM12338e = m12338e()) != null) {
                return ji4VarM12338e;
            }
        } else {
            ji4 ji4VarM12338e3 = m12338e();
            if (ji4VarM12338e3 != null) {
                return ji4VarM12338e3;
            }
        }
        return m12342i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m12335b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m12336c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m12337d(int i) {
        int i2 = this.f33542f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f33542f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: e */
    public final ji4 m12338e() {
        int iM12337d = m12337d(2);
        yo0 yo0Var = this.f33544h;
        os1 os1Var = yo0Var.f35390f;
        os1 os1Var2 = yo0Var.f35389e;
        if (iM12337d == 0) {
            ji4 ji4Var = (ji4) os1Var2.m6051c();
            return ji4Var != null ? ji4Var : (ji4) os1Var.m6051c();
        }
        ji4 ji4Var2 = (ji4) os1Var.m6051c();
        return ji4Var2 != null ? ji4Var2 : (ji4) os1Var2.m6051c();
    }

    /* JADX INFO: renamed from: f */
    public final void m12339f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33544h.f35388d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m12340g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12341h(xo0 xo0Var) {
        xo0 xo0Var2 = this.f33539c;
        boolean z = xo0Var2 == xo0.f34478a;
        if (z) {
            yo0.f35382i.addAndGet(this.f33544h, 4398046511104L);
        }
        if (xo0Var2 != xo0Var) {
            this.f33539c = xo0Var;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final ji4 m12342i(int i) {
        int i2;
        long j;
        ji4 ji4VarM8930c;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = yo0.f35382i;
        yo0 yo0Var = this.f33544h;
        int i3 = (int) (atomicLongFieldUpdater.get(yo0Var) & 2097151);
        ji4 ji4Var = null;
        if (i3 < 2) {
            return null;
        }
        int iM12337d = m12337d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iM12337d++;
            if (iM12337d > i3) {
                iM12337d = 1;
            }
            wo0 wo0Var = (wo0) yo0Var.f35391g.m8060b(iM12337d);
            if (wo0Var == null || wo0Var == this) {
                i2 = i3;
            } else {
                o25 o25Var = wo0Var.f33537a;
                o25Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    Unsafe unsafe = AbstractC1078qo.f28633a;
                    j = 0;
                    int intVolatile = unsafe.getIntVolatile(o25Var, o25.f26306e);
                    int intVolatile2 = unsafe.getIntVolatile(o25Var, o25.f26308g);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (AbstractC1078qo.f28633a.getIntVolatile(o25Var, o25.f26305d) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            ji4 ji4VarM8931d = o25Var.m8931d(intVolatile, z);
                            if (ji4VarM8931d != null) {
                                ji4VarM8930c = ji4VarM8931d;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        ji4VarM8930c = ji4Var;
                        break;
                    }
                } else {
                    ji4VarM8930c = o25Var.m8930c();
                    i2 = i3;
                    j = 0;
                }
                ql3 ql3Var = this.f33538b;
                if (ji4VarM8930c == null) {
                    while (true) {
                        Unsafe unsafe2 = AbstractC1078qo.f28633a;
                        j2 = -1;
                        long j4 = o25.f26307f;
                        ji4 ji4Var2 = (ji4) unsafe2.getObjectVolatile(o25Var, j4);
                        if (ji4Var2 != null) {
                            if (((ji4Var2.f22318b ? 1 : 2) & i) != 0) {
                                qi4.f28516f.getClass();
                                o25 o25Var2 = o25Var;
                                long jNanoTime = System.nanoTime() - ji4Var2.f22317a;
                                long j5 = qi4.f28512b;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                if (unsafe2.compareAndSwapObject(o25Var2, j4, ji4Var2, (Object) null)) {
                                    ql3Var.f28555a = ji4Var2;
                                    j3 = -1;
                                    break;
                                }
                                o25Var = o25Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    ql3Var.f28555a = ji4VarM8930c;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    ji4 ji4Var3 = (ji4) ql3Var.f28555a;
                    ql3Var.f28555a = null;
                    return ji4Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            ji4Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f33541e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (yo0.f35383j.get(this.f33544h) != 1) {
                    xo0 xo0Var = this.f33539c;
                    xo0 xo0Var2 = xo0.f34482e;
                    if (xo0Var == xo0Var2) {
                        break loop0;
                    }
                    ji4 ji4VarM12334a = m12334a(this.f33543g);
                    if (ji4VarM12334a != null) {
                        this.f33541e = 0L;
                        yo0 yo0Var = this.f33544h;
                        this.f33540d = 0L;
                        if (this.f33539c == xo0.f34480c) {
                            this.f33539c = xo0.f34479b;
                        }
                        if (!ji4VarM12334a.f22318b) {
                            try {
                                ji4VarM12334a.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (m12341h(xo0.f34479b) && !yo0Var.m13193k() && !yo0Var.m13192j(yo0.f35382i.get(yo0Var))) {
                            yo0Var.m13193k();
                        }
                        try {
                            ji4VarM12334a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        yo0.f35382i.addAndGet(yo0Var, -2097152L);
                        if (this.f33539c == xo0Var2) {
                            break;
                        }
                        this.f33539c = xo0.f34481d;
                        break;
                    }
                    this.f33543g = false;
                    if (this.f33541e == 0) {
                        Object obj = this.nextParkedWorker;
                        C0641f8 c0641f8 = yo0.f35384k;
                        if (obj != c0641f8) {
                            int i = -1;
                            AbstractC1078qo.f28633a.putIntVolatile(this, f33536j, -1);
                            while (this.nextParkedWorker != yo0.f35384k) {
                                Unsafe unsafe = AbstractC1078qo.f28633a;
                                long j = f33536j;
                                if (unsafe.getIntVolatile(this, j) != i) {
                                    break;
                                }
                                yo0 yo0Var2 = this.f33544h;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yo0.f35383j;
                                if (atomicIntegerFieldUpdater.get(yo0Var2) == 1) {
                                    break;
                                }
                                xo0 xo0Var3 = this.f33539c;
                                xo0 xo0Var4 = xo0.f34482e;
                                if (xo0Var3 == xo0Var4) {
                                    break;
                                }
                                m12341h(xo0.f34480c);
                                Thread.interrupted();
                                if (this.f33540d == 0) {
                                    this.f33540d = System.nanoTime() + this.f33544h.f35387c;
                                }
                                LockSupport.parkNanos(this.f33544h.f35387c);
                                if (System.nanoTime() - this.f33540d >= 0) {
                                    this.f33540d = 0L;
                                    yo0 yo0Var3 = this.f33544h;
                                    synchronized (yo0Var3.f35391g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater.get(yo0Var3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = yo0.f35382i;
                                                if (((int) (atomicLongFieldUpdater.get(yo0Var3) & 2097151)) > yo0Var3.f35385a && unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                    int i2 = this.indexInArray;
                                                    m12339f(0);
                                                    yo0Var3.m13191g(this, i2, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(yo0Var3) & 2097151);
                                                    if (andDecrement != i2) {
                                                        wo0 wo0Var = (wo0) yo0Var3.f35391g.m8060b(andDecrement);
                                                        yo0Var3.f35391g.m8061c(i2, wo0Var);
                                                        wo0Var.m12339f(i2);
                                                        yo0Var3.m13191g(wo0Var, andDecrement, i2);
                                                    }
                                                    yo0Var3.f35391g.m8061c(andDecrement, null);
                                                    this.f33539c = xo0Var4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                i = -1;
                            }
                        } else {
                            yo0 yo0Var4 = this.f33544h;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = yo0.f35381h;
                            if (this.nextParkedWorker == c0641f8) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(yo0Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = yo0Var4.f35391g.m8060b((int) (j2 & 2097151));
                                    yo0 yo0Var5 = yo0Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(yo0Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i3))) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    yo0Var4 = yo0Var5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            m12341h(xo0.f34480c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f33541e);
                            this.f33541e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        m12341h(xo0.f34482e);
    }
}
