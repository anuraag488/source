package p000;

import java.lang.invoke.VarHandle;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782j1 implements zl2 {

    /* JADX INFO: renamed from: d */
    public static final boolean f21938d;

    /* JADX INFO: renamed from: e */
    public static final Logger f21939e;

    /* JADX INFO: renamed from: f */
    public static final y62 f21940f;

    /* JADX INFO: renamed from: g */
    public static final Object f21941g;

    /* JADX INFO: renamed from: a */
    public volatile Object f21942a;

    /* JADX INFO: renamed from: b */
    public volatile C0002a1 f21943b;

    /* JADX INFO: renamed from: c */
    public volatile C0746i1 f21944c;

    static {
        boolean z;
        y62 c0559d1;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f21938d = z;
        f21939e = Logger.getLogger(AbstractC0782j1.class.getName());
        Throwable th = null;
        try {
            c0559d1 = new C0709h1();
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            try {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C0746i1.class, Thread.class, "a");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C0746i1.class, C0746i1.class, "b");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0782j1.class, C0746i1.class, "c");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0782j1.class, C0002a1.class, "b");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0782j1.class, Object.class, "a");
                C0475b1 c0475b1 = new C0475b1();
                c0475b1.f14984C = atomicReferenceFieldUpdaterNewUpdater;
                c0475b1.f14985D = atomicReferenceFieldUpdaterNewUpdater2;
                c0475b1.f14986E = atomicReferenceFieldUpdaterNewUpdater3;
                c0475b1.f14987F = atomicReferenceFieldUpdaterNewUpdater4;
                c0475b1.f14988G = atomicReferenceFieldUpdaterNewUpdater5;
                VarHandle.storeStoreFence();
                c0559d1 = c0475b1;
            } catch (Error | RuntimeException e2) {
                th = e2;
                c0559d1 = new C0559d1();
            }
        }
        f21940f = c0559d1;
        if (th != null) {
            Logger logger = f21939e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", e);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f21941g = new Object();
    }

    /* JADX INFO: renamed from: f */
    public static void m6978f(AbstractC0782j1 abstractC0782j1, boolean z) {
        C0002a1 c0002a1 = null;
        while (true) {
            for (C0746i1 c0746i1Mo3395E = f21940f.mo3395E(abstractC0782j1); c0746i1Mo3395E != null; c0746i1Mo3395E = c0746i1Mo3395E.f20996b) {
                Thread thread = c0746i1Mo3395E.f20995a;
                if (thread != null) {
                    c0746i1Mo3395E.f20995a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC0782j1.mo6984j();
                z = false;
            }
            abstractC0782j1.mo3380d();
            y62 y62Var = f21940f;
            C0002a1 c0002a2 = C0002a1.f28d;
            C0002a1 c0002a3 = c0002a1;
            C0002a1 c0002a1Mo3394D = y62Var.mo3394D(abstractC0782j1);
            C0002a1 c0002a4 = c0002a3;
            while (c0002a1Mo3394D != null) {
                C0002a1 c0002a5 = c0002a1Mo3394D.f31c;
                c0002a1Mo3394D.f31c = c0002a4;
                c0002a4 = c0002a1Mo3394D;
                c0002a1Mo3394D = c0002a5;
            }
            while (c0002a4 != null) {
                c0002a1 = c0002a4.f31c;
                Runnable runnable = c0002a4.f29a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0511c1) {
                    RunnableC0511c1 runnableC0511c1 = (RunnableC0511c1) runnable;
                    abstractC0782j1 = runnableC0511c1.f15746a;
                    if (abstractC0782j1.f21942a == runnableC0511c1) {
                        if (f21940f.mo3399t(abstractC0782j1, runnableC0511c1, m6981i(runnableC0511c1.f15747b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0002a4.f30b;
                    Objects.requireNonNull(executor);
                    m6979g(runnable, executor);
                }
                c0002a4 = c0002a1;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6979g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f21939e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m6980h(Object obj) throws ExecutionException {
        if (obj instanceof C1314x0) {
            Throwable th = ((C1314x0) obj).f33894b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1388z0) {
            throw new ExecutionException(((C1388z0) obj).f35664a);
        }
        if (obj == f21941g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static Object m6981i(zl2 zl2Var) {
        Object obj;
        Throwable thM6989p;
        if (zl2Var instanceof InterfaceC0595e1) {
            Object c1314x0 = ((AbstractC0782j1) zl2Var).f21942a;
            if (c1314x0 instanceof C1314x0) {
                C1314x0 c1314x1 = (C1314x0) c1314x0;
                if (c1314x1.f33893a) {
                    c1314x0 = c1314x1.f33894b != null ? new C1314x0(c1314x1.f33894b, false) : C1314x0.f33892d;
                }
            }
            Objects.requireNonNull(c1314x0);
            return c1314x0;
        }
        if ((zl2Var instanceof AbstractC0782j1) && (thM6989p = ((AbstractC0782j1) zl2Var).m6989p()) != null) {
            C1388z0 c1388z0 = new C1388z0();
            c1388z0.f35664a = thM6989p;
            return c1388z0;
        }
        boolean zIsCancelled = zl2Var.isCancelled();
        boolean z = true;
        if ((!f21938d) && zIsCancelled) {
            C1314x0 c1314x2 = C1314x0.f33892d;
            Objects.requireNonNull(c1314x2);
            return c1314x2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = zl2Var.get();
                    break;
                } catch (Error | RuntimeException e) {
                    C1388z0 c1388z1 = new C1388z0();
                    c1388z1.f35664a = e;
                    return c1388z1;
                } catch (CancellationException e2) {
                    if (zIsCancelled) {
                        return new C1314x0(e2, false);
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + zl2Var, e2);
                    C1388z0 c1388z2 = new C1388z0();
                    c1388z2.f35664a = illegalArgumentException;
                    return c1388z2;
                } catch (ExecutionException e3) {
                    if (zIsCancelled) {
                        return new C1314x0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zl2Var, e3), false);
                    }
                    Throwable cause = e3.getCause();
                    C1388z0 c1388z3 = new C1388z0();
                    cause.getClass();
                    c1388z3.f35664a = cause;
                    return c1388z3;
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f21941g : obj;
        }
        return new C1314x0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zl2Var), false);
    }

    @Override // p000.zl2
    /* JADX INFO: renamed from: a */
    public void mo6454a(Runnable runnable, Executor executor) {
        C0002a1 c0002a1;
        dt0.m4718t(executor, "Executor was null.");
        if (!isDone() && (c0002a1 = this.f21943b) != C0002a1.f28d) {
            C0002a1 c0002a2 = new C0002a1();
            c0002a2.f29a = runnable;
            c0002a2.f30b = executor;
            do {
                c0002a2.f31c = c0002a1;
                if (f21940f.mo3398s(this, c0002a1, c0002a2)) {
                    return;
                } else {
                    c0002a1 = this.f21943b;
                }
            } while (c0002a1 != C0002a1.f28d);
        }
        m6979g(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m6982c(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m6983e(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C1314x0 c1314x0;
        Object obj = this.f21942a;
        if (!(obj == null) && !(obj instanceof RunnableC0511c1)) {
            return false;
        }
        if (f21938d) {
            c1314x0 = new C1314x0(new CancellationException("Future.cancel() was called."), z);
        } else {
            c1314x0 = z ? C1314x0.f33891c : C1314x0.f33892d;
            Objects.requireNonNull(c1314x0);
        }
        boolean z2 = false;
        while (true) {
            if (f21940f.mo3399t(this, obj, c1314x0)) {
                m6978f(this, z);
                if (obj instanceof RunnableC0511c1) {
                    zl2 zl2Var = ((RunnableC0511c1) obj).f15747b;
                    if (zl2Var instanceof InterfaceC0595e1) {
                        this = (AbstractC0782j1) zl2Var;
                        obj = this.f21942a;
                        if ((obj == null) | (obj instanceof RunnableC0511c1)) {
                            z2 = true;
                        }
                    } else {
                        zl2Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f21942a;
            if (!(obj instanceof RunnableC0511c1)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6983e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        C0746i1 c0746i1 = C0746i1.f20994c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f21942a;
        if ((obj != null) && (!(obj instanceof RunnableC0511c1))) {
            return m6980h(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0746i1 c0746i2 = this.f21944c;
            if (c0746i2 != c0746i1) {
                C0746i1 c0746i3 = new C0746i1();
                z = true;
                while (true) {
                    y62 y62Var = f21940f;
                    y62Var.mo3396T(c0746i3, c0746i2);
                    if (y62Var.mo3400u(this, c0746i2, c0746i3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m6985l(c0746i3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f21942a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0511c1))) {
                                return m6980h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m6985l(c0746i3);
                        break;
                    }
                    long j4 = j3;
                    c0746i2 = this.f21944c;
                    if (c0746i2 != c0746i1) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f21942a;
            Objects.requireNonNull(obj3);
            return m6980h(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.f21942a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof RunnableC0511c1))) {
                return m6980h(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(zi4.m13621u(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f21942a instanceof C1314x0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f21942a;
        return (!(obj instanceof RunnableC0511c1)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public String mo3313k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: l */
    public final void m6985l(C0746i1 c0746i1) {
        c0746i1.f20995a = null;
        while (true) {
            C0746i1 c0746i2 = this.f21944c;
            if (c0746i2 == C0746i1.f20994c) {
                return;
            }
            C0746i1 c0746i3 = null;
            while (c0746i2 != null) {
                C0746i1 c0746i4 = c0746i2.f20996b;
                if (c0746i2.f20995a != null) {
                    c0746i3 = c0746i2;
                } else if (c0746i3 != null) {
                    c0746i3.f20996b = c0746i4;
                    if (c0746i3.f20995a == null) {
                    }
                } else if (!f21940f.mo3400u(this, c0746i2, c0746i4)) {
                }
                c0746i2 = c0746i4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m6986m(Object obj) {
        if (obj == null) {
            obj = f21941g;
        }
        if (!f21940f.mo3399t(this, null, obj)) {
            return false;
        }
        m6978f(this, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m6987n(Throwable th) {
        th.getClass();
        C1388z0 c1388z0 = new C1388z0();
        c1388z0.f35664a = th;
        if (!f21940f.mo3399t(this, null, c1388z0)) {
            return false;
        }
        m6978f(this, false);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m6988o(zl2 zl2Var) {
        C1388z0 c1388z0;
        zl2Var.getClass();
        Object obj = this.f21942a;
        if (obj == null) {
            if (zl2Var.isDone()) {
                if (f21940f.mo3399t(this, null, m6981i(zl2Var))) {
                    m6978f(this, false);
                    return;
                }
                return;
            }
            RunnableC0511c1 runnableC0511c1 = new RunnableC0511c1();
            runnableC0511c1.f15746a = this;
            runnableC0511c1.f15747b = zl2Var;
            VarHandle.storeStoreFence();
            if (f21940f.mo3399t(this, null, runnableC0511c1)) {
                try {
                    zl2Var.mo6454a(runnableC0511c1, rz0.f29741a);
                    return;
                } catch (Error | RuntimeException e) {
                    try {
                        c1388z0 = new C1388z0();
                        c1388z0.f35664a = e;
                    } catch (Error | RuntimeException unused) {
                        c1388z0 = C1388z0.f35663b;
                    }
                    f21940f.mo3399t(this, runnableC0511c1, c1388z0);
                    return;
                }
            }
            obj = this.f21942a;
        }
        if (obj instanceof C1314x0) {
            zl2Var.cancel(((C1314x0) obj).f33893a);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m6989p() {
        if (!(this instanceof InterfaceC0595e1)) {
            return null;
        }
        Object obj = this.f21942a;
        if (obj instanceof C1388z0) {
            return ((C1388z0) obj).f35664a;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6990q() {
        Object obj = this.f21942a;
        return (obj instanceof C1314x0) && ((C1314x0) obj).f33893a;
    }

    public String toString() {
        String strMo3313k;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m6982c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f21942a;
            if (obj instanceof RunnableC0511c1) {
                sb.append(", setFuture=[");
                zl2 zl2Var = ((RunnableC0511c1) obj).f15747b;
                try {
                    if (zl2Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zl2Var);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo3313k = mo3313k();
                    if (ib3.m6739a(strMo3313k)) {
                        strMo3313k = null;
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    strMo3313k = "Exception thrown from implementation: " + e2.getClass();
                }
                if (strMo3313k != null) {
                    sb.append(", info=[");
                    sb.append(strMo3313k);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m6982c(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C0746i1 c0746i1 = C0746i1.f20994c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f21942a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0511c1))) {
                return m6980h(obj2);
            }
            C0746i1 c0746i2 = this.f21944c;
            if (c0746i2 != c0746i1) {
                C0746i1 c0746i3 = new C0746i1();
                do {
                    y62 y62Var = f21940f;
                    y62Var.mo3396T(c0746i3, c0746i2);
                    if (y62Var.mo3400u(this, c0746i2, c0746i3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f21942a;
                            } else {
                                m6985l(c0746i3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0511c1))));
                        return m6980h(obj);
                    }
                    c0746i2 = this.f21944c;
                } while (c0746i2 != c0746i1);
            }
            Object obj3 = this.f21942a;
            Objects.requireNonNull(obj3);
            return m6980h(obj3);
        }
        throw new InterruptedException();
    }

    /* JADX INFO: renamed from: d */
    public void mo3380d() {
    }

    /* JADX INFO: renamed from: j */
    public void mo6984j() {
    }
}
