package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class u14 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f31592c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f31593d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31594e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f31595f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f31596g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f31597h;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f31598a;

    /* JADX INFO: renamed from: b */
    public final C0928n f31599b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f31596g = unsafe.objectFieldOffset(u14.class.getDeclaredField("head$volatile"));
        f31592c = AtomicLongFieldUpdater.newUpdater(u14.class, "deqIdx$volatile");
        f31597h = unsafe.objectFieldOffset(u14.class.getDeclaredField("tail$volatile"));
        f31593d = AtomicLongFieldUpdater.newUpdater(u14.class, "enqIdx$volatile");
        f31594e = AtomicIntegerFieldUpdater.newUpdater(u14.class, "_availablePermits$volatile");
        f31595f = unsafe.objectFieldOffset(u14.class.getDeclaredField("_availablePermits$volatile"));
    }

    public u14(int i, int i2) {
        this.f31598a = i;
        if (i <= 0) {
            C1077qn.m9988n(c75.m3877i(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            C1077qn.m9988n(c75.m3877i(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        x14 x14Var = new x14(0L, null, 2);
        this.head$volatile = x14Var;
        this.tail$volatile = x14Var;
        this._availablePermits$volatile = i - i2;
        C0928n c0928n = new C0928n((byte) 22);
        c0928n.f25353b = this;
        VarHandle.storeStoreFence();
        this.f31599b = c0928n;
    }

    /* JADX INFO: renamed from: a */
    public final Object m11203a(ym0 ym0Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f31594e;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f31598a;
        } while (andDecrement > i);
        ju4 ju4Var = ju4.f22634a;
        if (andDecrement <= 0) {
            b70 b70VarM3824u = c20.m3824u(C0006a5.m86x(ym0Var));
            try {
                if (!m11204b(b70VarM3824u)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                b70VarM3824u.mo113h(ju4Var, this.f31599b);
                                break;
                            }
                            if (m11204b(b70VarM3824u)) {
                                break;
                            }
                        }
                    }
                }
                Object objM3495r = b70VarM3824u.m3495r();
                ap0 ap0Var = ap0.f14763a;
                if (objM3495r != ap0Var) {
                    objM3495r = ju4Var;
                }
                if (objM3495r == ap0Var) {
                    return objM3495r;
                }
            } catch (Throwable th) {
                b70VarM3824u.m3479B();
                throw th;
            }
        }
        return ju4Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11204b(yy4 yy4Var) {
        Object objM8780a;
        u14 u14Var = this;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f31597h;
        x14 x14Var = (x14) unsafe.getObjectVolatile(u14Var, j);
        long andIncrement = f31593d.getAndIncrement(u14Var);
        s14 s14Var = s14.f29825b;
        long j2 = andIncrement / ((long) w14.f33034f);
        loop0: while (true) {
            objM8780a = nj0.m8780a(x14Var, j2, s14Var);
            if (as4.m3227F(objM8780a)) {
                break;
            }
            a04 a04VarM3226E = as4.m3226E(objM8780a);
            while (true) {
                Unsafe unsafe2 = AbstractC1078qo.f28633a;
                a04 a04Var = (a04) unsafe2.getObjectVolatile(u14Var, j);
                if (a04Var.f22d >= a04VarM3226E.f22d) {
                    u14Var = this;
                    break loop0;
                }
                if (!a04VarM3226E.m8j()) {
                    break;
                }
                u14Var = this;
                if (unsafe2.compareAndSwapObject(u14Var, f31597h, a04Var, a04VarM3226E)) {
                    if (!a04Var.m4f()) {
                        break loop0;
                    }
                    a04Var.m9130e();
                    break loop0;
                }
                if (a04VarM3226E.m4f()) {
                    a04VarM3226E.m9130e();
                }
            }
            u14Var = this;
        }
        x14 x14Var2 = (x14) as4.m3226E(objM8780a);
        AtomicReferenceArray atomicReferenceArray = x14Var2.f33925g;
        int i = (int) (andIncrement % ((long) w14.f33034f));
        if (atomicReferenceArray.compareAndSet(i, null, yy4Var)) {
            yy4Var.mo3483a(x14Var2, i);
            return true;
        }
        if (!atomicReferenceArray.compareAndSet(i, w14.f33030b, w14.f33031c)) {
            return false;
        }
        ((a70) yy4Var).mo113h(ju4.f22634a, u14Var.f31599b);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m11205c() {
        Object objM8780a;
        int i;
        u14 u14Var = this;
        do {
            int andIncrement = f31594e.getAndIncrement(u14Var);
            int i2 = u14Var.f31598a;
            if (andIncrement >= i2) {
                while (true) {
                    Unsafe unsafe = AbstractC1078qo.f28633a;
                    long j = f31595f;
                    int intVolatile = unsafe.getIntVolatile(u14Var, j);
                    int i3 = u14Var.f31598a;
                    if (intVolatile <= i3 || unsafe.compareAndSwapInt(u14Var, j, intVolatile, i3)) {
                        break;
                    } else {
                        u14Var = this;
                    }
                }
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = AbstractC1078qo.f28633a;
            long j2 = f31596g;
            x14 x14Var = (x14) unsafe2.getObjectVolatile(u14Var, j2);
            long andIncrement2 = f31592c.getAndIncrement(u14Var);
            long j3 = andIncrement2 / ((long) w14.f33034f);
            t14 t14Var = t14.f30723b;
            while (true) {
                objM8780a = nj0.m8780a(x14Var, j3, t14Var);
                if (as4.m3227F(objM8780a)) {
                    break;
                }
                a04 a04VarM3226E = as4.m3226E(objM8780a);
                while (true) {
                    Unsafe unsafe3 = AbstractC1078qo.f28633a;
                    a04 a04Var = (a04) unsafe3.getObjectVolatile(u14Var, j2);
                    if (a04Var.f22d >= a04VarM3226E.f22d) {
                        u14Var = this;
                        break;
                    }
                    if (!a04VarM3226E.m8j()) {
                        break;
                    }
                    u14Var = this;
                    if (unsafe3.compareAndSwapObject(u14Var, f31596g, a04Var, a04VarM3226E)) {
                        if (!a04Var.m4f()) {
                            break;
                        }
                        a04Var.m9130e();
                        break;
                    } else if (a04VarM3226E.m4f()) {
                        a04VarM3226E.m9130e();
                    }
                }
                u14Var = this;
            }
            x14 x14Var2 = (x14) as4.m3226E(objM8780a);
            AtomicReferenceArray atomicReferenceArray = x14Var2.f33925g;
            x14Var2.m9128a();
            i = 0;
            if (x14Var2.f22d <= j3) {
                int i4 = (int) (andIncrement2 % ((long) w14.f33034f));
                Object andSet = atomicReferenceArray.getAndSet(i4, w14.f33030b);
                if (andSet == null) {
                    int i5 = w14.f33029a;
                    while (true) {
                        if (i >= i5) {
                            i = !atomicReferenceArray.compareAndSet(i4, w14.f33030b, w14.f33032d) ? 1 : 0;
                            break;
                        } else {
                            if (atomicReferenceArray.get(i4) == w14.f33031c) {
                                i = 1;
                                break;
                            }
                            i++;
                        }
                    }
                } else if (andSet != w14.f33033e) {
                    boolean z = andSet instanceof a70;
                    ju4 ju4Var = ju4.f22634a;
                    if (z) {
                        a70 a70Var = (a70) andSet;
                        C0641f8 c0641f8Mo114j = a70Var.mo114j(ju4Var, u14Var.f31599b);
                        if (c0641f8Mo114j != null) {
                            a70Var.mo116s(c0641f8Mo114j);
                            i = 1;
                            break;
                            break;
                        }
                    } else if (!(andSet instanceof g04)) {
                        nm0.m8798k(andSet, "unexpected: ");
                        return;
                    } else if (((g04) andSet).m5880i(u14Var, ju4Var) == 0) {
                        i = 1;
                        break;
                        break;
                    }
                }
            }
        } while (i == 0);
    }
}
