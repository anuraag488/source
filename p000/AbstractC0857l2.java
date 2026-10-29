package p000;

import java.lang.invoke.VarHandle;
import java.util.Locale;
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

/* JADX INFO: renamed from: l2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857l2 implements zl2 {

    /* JADX INFO: renamed from: d */
    public static final boolean f23713d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f23714e = Logger.getLogger(AbstractC0857l2.class.getName());

    /* JADX INFO: renamed from: f */
    public static final k43 f23715f;

    /* JADX INFO: renamed from: g */
    public static final Object f23716g;

    /* JADX INFO: renamed from: a */
    public volatile Object f23717a;

    /* JADX INFO: renamed from: b */
    public volatile C0710h2 f23718b;

    /* JADX INFO: renamed from: c */
    public volatile C0820k2 f23719c;

    static {
        k43 c0783j2;
        try {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C0820k2.class, Thread.class, "a");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C0820k2.class, C0820k2.class, "b");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0857l2.class, C0820k2.class, "c");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0857l2.class, C0710h2.class, "b");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0857l2.class, Object.class, "a");
            C0747i2 c0747i2 = new C0747i2();
            c0747i2.f21042E = atomicReferenceFieldUpdaterNewUpdater;
            c0747i2.f21043F = atomicReferenceFieldUpdaterNewUpdater2;
            c0747i2.f21044G = atomicReferenceFieldUpdaterNewUpdater3;
            c0747i2.f21045H = atomicReferenceFieldUpdaterNewUpdater4;
            c0747i2.f21046I = atomicReferenceFieldUpdaterNewUpdater5;
            VarHandle.storeStoreFence();
            th = null;
            c0783j2 = c0747i2;
        } catch (Throwable th) {
            th = th;
            c0783j2 = new C0783j2();
        }
        f23715f = c0783j2;
        if (th != null) {
            f23714e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23716g = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m7812e(AbstractC0857l2 abstractC0857l2) {
        C0820k2 c0820k2;
        C0710h2 c0710h2;
        C0710h2 c0710h3;
        C0710h2 c0710h4;
        do {
            c0820k2 = abstractC0857l2.f23719c;
        } while (!f23715f.mo6563k(abstractC0857l2, c0820k2, C0820k2.f22821c));
        while (true) {
            c0710h2 = null;
            if (c0820k2 == null) {
                break;
            }
            Thread thread = c0820k2.f22822a;
            if (thread != null) {
                c0820k2.f22822a = null;
                LockSupport.unpark(thread);
            }
            c0820k2 = c0820k2.f22823b;
        }
        abstractC0857l2.mo7817d();
        do {
            c0710h3 = abstractC0857l2.f23718b;
        } while (!f23715f.mo6561i(abstractC0857l2, c0710h3, C0710h2.f20272d));
        while (true) {
            c0710h4 = c0710h2;
            c0710h2 = c0710h3;
            if (c0710h2 == null) {
                break;
            }
            c0710h3 = c0710h2.f20275c;
            c0710h2.f20275c = c0710h4;
        }
        while (c0710h4 != null) {
            C0710h2 c0710h5 = c0710h4.f20275c;
            m7813f(c0710h4.f20273a, c0710h4.f20274b);
            c0710h4 = c0710h5;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7813f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f23714e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m7814g(Object obj) throws ExecutionException {
        if (obj instanceof C0635f2) {
            Throwable th = ((C0635f2) obj).f18669b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0673g2) {
            throw new ExecutionException(((C0673g2) obj).f19498a);
        }
        if (obj == f23716g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m7815h(AbstractC0857l2 abstractC0857l2) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC0857l2.get();
                break;
            } catch (InterruptedException unused) {
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
        return obj;
    }

    @Override // p000.zl2
    /* JADX INFO: renamed from: a */
    public final void mo6454a(Runnable runnable, Executor executor) {
        executor.getClass();
        C0710h2 c0710h2 = this.f23718b;
        C0710h2 c0710h3 = C0710h2.f20272d;
        if (c0710h2 != c0710h3) {
            C0710h2 c0710h4 = new C0710h2(runnable, executor);
            do {
                c0710h4.f20275c = c0710h2;
                if (f23715f.mo6561i(this, c0710h2, c0710h4)) {
                    return;
                } else {
                    c0710h2 = this.f23718b;
                }
            } while (c0710h2 != c0710h3);
        }
        m7813f(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m7816c(StringBuilder sb) {
        try {
            Object objM7815h = m7815h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM7815h == this ? "this future" : String.valueOf(objM7815h));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0635f2 c0635f2;
        Object obj = this.f23717a;
        if (obj != null) {
            return false;
        }
        if (f23713d) {
            c0635f2 = new C0635f2(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0635f2 = z ? C0635f2.f18666c : C0635f2.f18667d;
        }
        if (!f23715f.mo6562j(this, obj, c0635f2)) {
            return false;
        }
        m7812e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0820k2 c0820k2 = C0820k2.f22821c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23717a;
        if (obj != null) {
            return m7814g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0820k2 c0820k3 = this.f23719c;
            if (c0820k3 != c0820k2) {
                C0820k2 c0820k4 = new C0820k2();
                while (true) {
                    k43 k43Var = f23715f;
                    k43Var.mo6564y(c0820k4, c0820k3);
                    if (k43Var.mo6563k(this, c0820k3, c0820k4)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m7819j(c0820k4);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23717a;
                            if (obj2 != null) {
                                return m7814g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m7819j(c0820k4);
                        break;
                    }
                    c0820k3 = this.f23719c;
                    if (c0820k3 == c0820k2) {
                    }
                }
            }
            return m7814g(this.f23717a);
        }
        while (nanos > 0) {
            Object obj3 = this.f23717a;
            if (obj3 != null) {
                return m7814g(obj3);
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
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(zi4.m13621u(strConcat, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public String mo7818i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23717a instanceof C0635f2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23717a != null;
    }

    /* JADX INFO: renamed from: j */
    public final void m7819j(C0820k2 c0820k2) {
        c0820k2.f22822a = null;
        while (true) {
            C0820k2 c0820k3 = this.f23719c;
            if (c0820k3 == C0820k2.f22821c) {
                return;
            }
            C0820k2 c0820k4 = null;
            while (c0820k3 != null) {
                C0820k2 c0820k5 = c0820k3.f22823b;
                if (c0820k3.f22822a != null) {
                    c0820k4 = c0820k3;
                } else if (c0820k4 != null) {
                    c0820k4.f22823b = c0820k5;
                    if (c0820k4.f22822a == null) {
                    }
                } else if (!f23715f.mo6563k(this, c0820k3, c0820k5)) {
                }
                c0820k3 = c0820k5;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m7820k(Object obj) {
        if (obj == null) {
            obj = f23716g;
        }
        if (!f23715f.mo6562j(this, null, obj)) {
            return false;
        }
        m7812e(this);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo7821l(Throwable th) {
        if (!f23715f.mo6562j(this, null, new C0673g2(th))) {
            return false;
        }
        m7812e(this);
        return true;
    }

    public final String toString() {
        String strMo7818i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f23717a instanceof C0635f2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7816c(sb);
        } else {
            try {
                strMo7818i = mo7818i();
            } catch (RuntimeException e) {
                strMo7818i = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo7818i != null && !strMo7818i.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo7818i);
                sb.append("]");
            } else if (isDone()) {
                m7816c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0820k2 c0820k2 = C0820k2.f22821c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23717a;
            if (obj2 != null) {
                return m7814g(obj2);
            }
            C0820k2 c0820k3 = this.f23719c;
            if (c0820k3 != c0820k2) {
                C0820k2 c0820k4 = new C0820k2();
                do {
                    k43 k43Var = f23715f;
                    k43Var.mo6564y(c0820k4, c0820k3);
                    if (k43Var.mo6563k(this, c0820k3, c0820k4)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23717a;
                            } else {
                                m7819j(c0820k4);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m7814g(obj);
                    }
                    c0820k3 = this.f23719c;
                } while (c0820k3 != c0820k2);
            }
            return m7814g(this.f23717a);
        }
        throw new InterruptedException();
    }

    /* JADX INFO: renamed from: d */
    public void mo7817d() {
    }
}
