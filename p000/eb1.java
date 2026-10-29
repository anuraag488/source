package p000;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class eb1 extends so0 implements mx0 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ long f17944e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f17945f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f17946g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f17947h = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: b */
    public long f17948b;

    /* JADX INFO: renamed from: c */
    public boolean f17949c;

    /* JADX INFO: renamed from: d */
    public C0461ao f17950d;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f17946g = unsafe.objectFieldOffset(eb1.class.getDeclaredField("_queue$volatile"));
        f17944e = unsafe.objectFieldOffset(eb1.class.getDeclaredField("_delayed$volatile"));
        f17945f = unsafe.objectFieldOffset(eb1.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: K */
    public final void mo5041K(ro0 ro0Var, Runnable runnable) {
        mo5045Q(runnable);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: N */
    public final so0 mo5042N(int i, String str) {
        vd6.m11848g(i);
        return vd6.m11823G(this, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m5043O(boolean z) {
        long j = this.f17948b - (z ? 4294967296L : 1L);
        this.f17948b = j;
        if (j <= 0 && this.f17949c) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m5044P(i01 i01Var) {
        C0461ao c0461ao = this.f17950d;
        if (c0461ao == null) {
            c0461ao = new C0461ao();
            this.f17950d = c0461ao;
        }
        c0461ao.addLast(i01Var);
    }

    /* JADX INFO: renamed from: Q */
    public void mo5045Q(Runnable runnable) {
        m5046R();
        if (!m5047S(runnable)) {
            xv0.f34637i.mo5045Q(runnable);
            return;
        }
        Thread threadMo5048T = mo5048T();
        if (Thread.currentThread() != threadMo5048T) {
            LockSupport.unpark(threadMo5048T);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m5046R() {
        cb1 cb1VarM6042c;
        db1 db1Var = (db1) AbstractC1078qo.f28633a.getObjectVolatile(this, f17944e);
        if (db1Var == null || db1Var.m6041b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (db1Var) {
                try {
                    cb1[] cb1VarArr = db1Var.f19885a;
                    cb1VarM6042c = null;
                    cb1 cb1Var = cb1VarArr != null ? cb1VarArr[0] : null;
                    if (cb1Var != null) {
                        if (jNanoTime - cb1Var.f15912a >= 0 ? m5047S(cb1Var) : false) {
                            cb1VarM6042c = db1Var.m6042c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (cb1VarM6042c != null);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m5047S(Runnable runnable) {
        eb1 eb1Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f17946g;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (unsafe.getIntVolatile(this, f17945f) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                eb1Var = this;
                if (unsafe.compareAndSwapObject(eb1Var, j, (Object) null, runnable)) {
                    return true;
                }
                this = eb1Var;
            } else {
                eb1Var = this;
                if (objectVolatile instanceof in2) {
                    in2 in2Var = (in2) objectVolatile;
                    int iM6820a = in2Var.m6820a(runnable);
                    if (iM6820a == 0) {
                        return true;
                    }
                    if (iM6820a == 1) {
                        unsafe.compareAndSwapObject(eb1Var, j, objectVolatile, in2Var.m6822c());
                    } else if (iM6820a == 2) {
                        return false;
                    }
                    this = eb1Var;
                } else {
                    if (objectVolatile == fb1.f18891b) {
                        return false;
                    }
                    in2 in2Var2 = new in2(8, true);
                    in2Var2.m6820a((Runnable) objectVolatile);
                    in2Var2.m6820a(runnable);
                    if (unsafe.compareAndSwapObject(eb1Var, j, objectVolatile, in2Var2)) {
                        return true;
                    }
                    this = eb1Var;
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public abstract Thread mo5048T();

    /* JADX INFO: renamed from: U */
    public final void m5049U(boolean z) {
        this.f17948b = (z ? 4294967296L : 1L) + this.f17948b;
        if (z) {
            return;
        }
        this.f17949c = true;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m5050V() {
        C0461ao c0461ao = this.f17950d;
        if (c0461ao != null ? c0461ao.isEmpty() : true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            db1 db1Var = (db1) unsafe.getObjectVolatile(this, f17944e);
            if (db1Var != null && db1Var.m6041b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, f17946g);
            if (objectVolatile != null) {
                if (objectVolatile instanceof in2) {
                    long longVolatile = unsafe.getLongVolatile((in2) objectVolatile, in2.f21576g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == fb1.f18891b) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public final long m5051W() {
        Unsafe unsafe;
        long j;
        eb1 eb1Var;
        Runnable runnable;
        cb1 cb1Var;
        C0641f8 c0641f8 = fb1.f18891b;
        if (!m5052X()) {
            m5046R();
            while (true) {
                unsafe = AbstractC1078qo.f28633a;
                j = f17946g;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    eb1Var = this;
                } else if (objectVolatile instanceof in2) {
                    in2 in2Var = (in2) objectVolatile;
                    Object objM6823d = in2Var.m6823d();
                    if (objM6823d != in2.f21574e) {
                        runnable = (Runnable) objM6823d;
                        eb1Var = this;
                        break;
                    }
                    in2 in2VarM6822c = in2Var.m6822c();
                    eb1Var = this;
                    unsafe.compareAndSwapObject(eb1Var, j, objectVolatile, in2VarM6822c);
                    this = eb1Var;
                } else {
                    eb1Var = this;
                    if (objectVolatile != c0641f8) {
                        if (unsafe.compareAndSwapObject(eb1Var, j, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            break;
                        }
                        this = eb1Var;
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0461ao c0461ao = eb1Var.f17950d;
            if (((c0461ao == null || c0461ao.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(eb1Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof in2) {
                        long longVolatile = unsafe.getLongVolatile((in2) objectVolatile2, in2.f21576g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == c0641f8) {
                        return Long.MAX_VALUE;
                    }
                }
                db1 db1Var = (db1) unsafe.getObjectVolatile(eb1Var, f17944e);
                if (db1Var != null) {
                    synchronized (db1Var) {
                        cb1[] cb1VarArr = db1Var.f19885a;
                        cb1Var = cb1VarArr != null ? cb1VarArr[0] : null;
                    }
                    if (cb1Var != null) {
                        long jNanoTime = cb1Var.f15912a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m5052X() {
        C0461ao c0461ao = this.f17950d;
        if (c0461ao == null) {
            return false;
        }
        i01 i01Var = (i01) (c0461ao.isEmpty() ? null : c0461ao.removeFirst());
        if (i01Var == null) {
            return false;
        }
        i01Var.run();
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public void mo5053Y(long j, cb1 cb1Var) {
        xv0.f34637i.m5054Z(j, cb1Var);
    }

    /* JADX INFO: renamed from: Z */
    public final void m5054Z(long j, cb1 cb1Var) {
        int iM3938b;
        Thread threadMo5048T;
        long j2 = f17944e;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        if (unsafe.getIntVolatile(this, f17945f) == 1) {
            iM3938b = 1;
        } else {
            db1 db1Var = (db1) unsafe.getObjectVolatile(this, j2);
            if (db1Var == null) {
                db1 db1Var2 = new db1();
                db1Var2.f16893c = j;
                unsafe.compareAndSwapObject(this, j2, (Object) null, db1Var2);
                db1Var = (db1) unsafe.getObjectVolatile(this, j2);
            }
            iM3938b = cb1Var.m3938b(j, db1Var, this);
        }
        if (iM3938b != 0) {
            if (iM3938b == 1) {
                mo5053Y(j, cb1Var);
                return;
            } else {
                if (iM3938b == 2) {
                    return;
                }
                C1077qn.m9989o("unexpected result");
                return;
            }
        }
        db1 db1Var3 = (db1) unsafe.getObjectVolatile(this, j2);
        cb1 cb1Var2 = null;
        if (db1Var3 != null) {
            synchronized (db1Var3) {
                cb1[] cb1VarArr = db1Var3.f19885a;
                cb1Var2 = cb1VarArr != null ? cb1VarArr[0] : null;
            }
        }
        if (cb1Var2 != cb1Var || Thread.currentThread() == (threadMo5048T = mo5048T())) {
            return;
        }
        LockSupport.unpark(threadMo5048T);
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: j */
    public final void mo5055j(long j, b70 b70Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ab1 ab1Var = new ab1(this, j2 + jNanoTime, b70Var);
            m5054Z(jNanoTime, ab1Var);
            c20.m3817l(b70Var, ab1Var);
        }
    }

    public void shutdown() {
        C0641f8 c0641f8;
        cb1 cb1VarM6042c;
        em4.f18262a.set(null);
        AbstractC1078qo.f28633a.putIntVolatile(this, f17945f, 1);
        C0641f8 c0641f9 = fb1.f18891b;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f17946g;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                c0641f8 = c0641f9;
                if (unsafe.compareAndSwapObject(this, j, (Object) null, c0641f9)) {
                    break;
                } else {
                    c0641f9 = c0641f8;
                }
            } else {
                c0641f8 = c0641f9;
                if (objectVolatile instanceof in2) {
                    ((in2) objectVolatile).m6821b();
                    break;
                } else {
                    if (objectVolatile == c0641f8) {
                        break;
                    }
                    in2 in2Var = new in2(8, true);
                    in2Var.m6820a((Runnable) objectVolatile);
                    if (unsafe.compareAndSwapObject(this, j, objectVolatile, in2Var)) {
                        break;
                    } else {
                        c0641f9 = c0641f8;
                    }
                }
            }
        }
        while (m5051W() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            db1 db1Var = (db1) AbstractC1078qo.f28633a.getObjectVolatile(this, f17944e);
            if (db1Var == null) {
                return;
            }
            synchronized (db1Var) {
                cb1VarM6042c = db1Var.m6041b() > 0 ? db1Var.m6042c(0) : null;
            }
            if (cb1VarM6042c == null) {
                return;
            } else {
                mo5053Y(jNanoTime, cb1VarM6042c);
            }
        }
    }
}
