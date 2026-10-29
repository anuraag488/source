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

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ok6 implements yz5 {

    /* JADX INFO: renamed from: d */
    public static final boolean f26824d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f26825e = Logger.getLogger(ok6.class.getName());

    /* JADX INFO: renamed from: f */
    public static final yy5 f26826f;

    /* JADX INFO: renamed from: g */
    public static final Object f26827g;

    /* JADX INFO: renamed from: a */
    public volatile Object f26828a;

    /* JADX INFO: renamed from: b */
    public volatile x76 f26829b;

    /* JADX INFO: renamed from: c */
    public volatile sh6 f26830c;

    static {
        yy5 xf6Var;
        try {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(sh6.class, Thread.class, "a");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(sh6.class, sh6.class, "b");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(ok6.class, sh6.class, "c");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(ok6.class, x76.class, "b");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(ok6.class, Object.class, "a");
            ec6 ec6Var = new ec6();
            ec6Var.f18006a = atomicReferenceFieldUpdaterNewUpdater;
            ec6Var.f18007b = atomicReferenceFieldUpdaterNewUpdater2;
            ec6Var.f18008c = atomicReferenceFieldUpdaterNewUpdater3;
            ec6Var.f18009d = atomicReferenceFieldUpdaterNewUpdater4;
            ec6Var.f18010e = atomicReferenceFieldUpdaterNewUpdater5;
            VarHandle.storeStoreFence();
            th = null;
            xf6Var = ec6Var;
        } catch (Throwable th) {
            th = th;
            xf6Var = new xf6();
        }
        Throwable th2 = th;
        f26826f = xf6Var;
        if (th2 != null) {
            f26825e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f26827g = new Object();
    }

    /* JADX INFO: renamed from: d */
    public static void m9160d(ok6 ok6Var) {
        sh6 sh6Var;
        yy5 yy5Var;
        x76 x76Var;
        x76 x76Var2;
        x76 x76Var3;
        do {
            sh6Var = ok6Var.f26830c;
            yy5Var = f26826f;
        } while (!yy5Var.mo5087e(ok6Var, sh6Var, sh6.f30282c));
        while (true) {
            x76Var = null;
            if (sh6Var == null) {
                break;
            }
            Thread thread = sh6Var.f30283a;
            if (thread != null) {
                sh6Var.f30283a = null;
                LockSupport.unpark(thread);
            }
            sh6Var = sh6Var.f30284b;
        }
        do {
            x76Var2 = ok6Var.f26829b;
        } while (!yy5Var.mo5085c(ok6Var, x76Var2, x76.f34050d));
        while (true) {
            x76Var3 = x76Var;
            x76Var = x76Var2;
            if (x76Var == null) {
                break;
            }
            x76Var2 = x76Var.f34053c;
            x76Var.f34053c = x76Var3;
        }
        while (x76Var3 != null) {
            Runnable runnable = x76Var3.f34051a;
            x76 x76Var4 = x76Var3.f34053c;
            m9161f(runnable, x76Var3.f34052b);
            x76Var3 = x76Var4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m9161f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f26825e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", c75.m3879k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Object m9162h(Object obj) throws ExecutionException {
        if (obj instanceof f16) {
            Throwable th = ((f16) obj).f18665a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof o56) {
            throw new ExecutionException(((o56) obj).f26363a);
        }
        if (obj == f26827g) {
            return null;
        }
        return obj;
    }

    @Override // p000.yz5
    /* JADX INFO: renamed from: b */
    public final void mo4845b(Runnable runnable, Executor executor) {
        executor.getClass();
        x76 x76Var = this.f26829b;
        x76 x76Var2 = x76.f34050d;
        if (x76Var != x76Var2) {
            x76 x76Var3 = new x76(runnable, executor);
            do {
                x76Var3.f34053c = x76Var;
                if (f26826f.mo5085c(this, x76Var, x76Var3)) {
                    return;
                } else {
                    x76Var = this.f26829b;
                }
            } while (x76Var != x76Var2);
        }
        m9161f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo5787c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        f16 f16Var;
        Object obj = this.f26828a;
        if (obj != null) {
            return false;
        }
        if (f26824d) {
            f16Var = new f16(new CancellationException("Future.cancel() was called."));
        } else {
            f16Var = z ? f16.f18663b : f16.f18664c;
        }
        if (!f26826f.mo5086d(this, obj, f16Var)) {
            return false;
        }
        m9160d(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m9163e(StringBuilder sb) {
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
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX INFO: renamed from: g */
    public final void m9164g(sh6 sh6Var) {
        sh6Var.f30283a = null;
        while (true) {
            sh6 sh6Var2 = this.f26830c;
            if (sh6Var2 != sh6.f30282c) {
                sh6 sh6Var3 = null;
                while (sh6Var2 != null) {
                    sh6 sh6Var4 = sh6Var2.f30284b;
                    if (sh6Var2.f30283a != null) {
                        sh6Var3 = sh6Var2;
                    } else if (sh6Var3 != null) {
                        sh6Var3.f30284b = sh6Var4;
                        if (sh6Var3.f30283a == null) {
                        }
                    } else if (!f26826f.mo5087e(this, sh6Var2, sh6Var4)) {
                    }
                    sh6Var2 = sh6Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f26828a;
        if (obj != null) {
            return m9162h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            sh6 sh6Var = this.f26830c;
            sh6 sh6Var2 = sh6.f30282c;
            if (sh6Var != sh6Var2) {
                sh6 sh6Var3 = new sh6();
                while (true) {
                    yy5 yy5Var = f26826f;
                    yy5Var.mo5083a(sh6Var3, sh6Var);
                    if (yy5Var.mo5087e(this, sh6Var, sh6Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m9164g(sh6Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f26828a;
                            if (obj2 != null) {
                                return m9162h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m9164g(sh6Var3);
                        break;
                    }
                    sh6Var = this.f26830c;
                    if (sh6Var == sh6Var2) {
                    }
                }
            }
            return m9162h(this.f26828a);
        }
        while (nanos > 0) {
            Object obj3 = this.f26828a;
            if (obj3 != null) {
                return m9162h(obj3);
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
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26828a instanceof f16;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26828a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f26828a instanceof f16) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m9163e(sb);
        } else {
            try {
                strConcat = mo5787c();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                m9163e(sb);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f26828a;
            if (obj2 != null) {
                return m9162h(obj2);
            }
            sh6 sh6Var = this.f26830c;
            sh6 sh6Var2 = sh6.f30282c;
            if (sh6Var != sh6Var2) {
                sh6 sh6Var3 = new sh6();
                do {
                    yy5 yy5Var = f26826f;
                    yy5Var.mo5083a(sh6Var3, sh6Var);
                    if (yy5Var.mo5087e(this, sh6Var, sh6Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f26828a;
                            } else {
                                m9164g(sh6Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m9162h(obj);
                    }
                    sh6Var = this.f26830c;
                } while (sh6Var != sh6Var2);
            }
            return m9162h(this.f26828a);
        }
        throw new InterruptedException();
    }
}
