package p000;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e06 extends yx5 implements yz5 {

    /* JADX INFO: renamed from: h */
    public yz5 f17576h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f17577i;

    /* JADX INFO: renamed from: e */
    public static Object m4840e(Object obj) throws ExecutionException {
        if (obj instanceof lx5) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((lx5) obj).f24456b);
            throw cancellationException;
        }
        if (obj instanceof ox5) {
            throw new ExecutionException(((ox5) obj).f27195a);
        }
        if (obj == yx5.f35601d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4841g(Object obj) {
        return !(obj instanceof mx5);
    }

    /* JADX INFO: renamed from: h */
    public static Object m4842h(yz5 yz5Var) {
        Object obj;
        Throwable thMo4846d;
        if (yz5Var instanceof e06) {
            Object lx5Var = ((e06) yz5Var).f35605a;
            if (lx5Var instanceof lx5) {
                lx5 lx5Var2 = (lx5) lx5Var;
                if (lx5Var2.f24455a) {
                    Throwable th = lx5Var2.f24456b;
                    lx5Var = th != null ? new lx5(th, false) : lx5.f24454d;
                }
            }
            Objects.requireNonNull(lx5Var);
            return lx5Var;
        }
        if ((yz5Var instanceof yx5) && (thMo4846d = ((yx5) yz5Var).mo4846d()) != null) {
            ox5 ox5Var = new ox5();
            ox5Var.f27195a = thMo4846d;
            return ox5Var;
        }
        boolean zIsCancelled = yz5Var.isCancelled();
        boolean z = true;
        if ((!yx5.f35603f) && zIsCancelled) {
            lx5 lx5Var3 = lx5.f24454d;
            Objects.requireNonNull(lx5Var3);
            return lx5Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = yz5Var.get();
                    break;
                } catch (Error | Exception e) {
                    ox5 ox5Var2 = new ox5();
                    ox5Var2.f27195a = e;
                    return ox5Var2;
                } catch (CancellationException e2) {
                    if (zIsCancelled) {
                        return new lx5(e2, false);
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(yz5Var)), e2);
                    ox5 ox5Var3 = new ox5();
                    ox5Var3.f27195a = illegalArgumentException;
                    return ox5Var3;
                } catch (ExecutionException e3) {
                    if (zIsCancelled) {
                        return new lx5(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(yz5Var)), e3), false);
                    }
                    Throwable cause = e3.getCause();
                    ox5 ox5Var4 = new ox5();
                    cause.getClass();
                    ox5Var4.f27195a = cause;
                    return ox5Var4;
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new lx5(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(yz5Var))), false);
        }
        return obj == null ? yx5.f35601d : obj;
    }

    /* JADX INFO: renamed from: j */
    public static void m4843j(e06 e06Var) {
        px5 px5Var = null;
        while (true) {
            e06Var.getClass();
            for (wx5 wx5VarMo10948c = yx5.f35604g.mo10948c(e06Var); wx5VarMo10948c != null; wx5VarMo10948c = wx5VarMo10948c.f33843b) {
                Thread thread = wx5VarMo10948c.f33842a;
                if (thread != null) {
                    wx5VarMo10948c.f33842a = null;
                    LockSupport.unpark(thread);
                }
            }
            yz5 yz5Var = e06Var.f17576h;
            if ((e06Var.f35605a instanceof lx5) & (yz5Var != null)) {
                Object obj = e06Var.f35605a;
                yz5Var.cancel((obj instanceof lx5) && ((lx5) obj).f24455a);
            }
            ScheduledFuture scheduledFuture = e06Var.f17577i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            e06Var.f17576h = null;
            e06Var.f17577i = null;
            px5 px5Var2 = px5.f28071d;
            px5 px5Var3 = px5Var;
            px5 px5VarMo10947a = yx5.f35604g.mo10947a(e06Var);
            px5 px5Var4 = px5Var3;
            while (px5VarMo10947a != null) {
                px5 px5Var5 = px5VarMo10947a.f28074c;
                px5VarMo10947a.f28074c = px5Var4;
                px5Var4 = px5VarMo10947a;
                px5VarMo10947a = px5Var5;
            }
            while (px5Var4 != null) {
                Runnable runnable = px5Var4.f28072a;
                px5 px5Var6 = px5Var4.f28074c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof mx5) {
                    mx5 mx5Var = (mx5) runnable;
                    e06Var = mx5Var.f25285a;
                    if (e06Var.f35605a != mx5Var) {
                        continue;
                    } else if (yx5.f35604g.mo10952g(e06Var, mx5Var, m4842h(mx5Var.f25286b))) {
                        px5Var = px5Var6;
                    }
                } else {
                    Executor executor = px5Var4.f28073b;
                    Objects.requireNonNull(executor);
                    m4844k(runnable, executor);
                }
                px5Var4 = px5Var6;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4844k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            yx5.f35602e.m11815a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", c75.m3879k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // p000.yz5
    /* JADX INFO: renamed from: b */
    public final void mo4845b(Runnable runnable, Executor executor) {
        px5 px5Var;
        if (executor == null) {
            xy4.m12782k("Executor was null.");
            return;
        }
        if (!isDone() && (px5Var = this.f35606b) != px5.f28071d) {
            px5 px5Var2 = new px5();
            px5Var2.f28072a = runnable;
            px5Var2.f28073b = executor;
            do {
                px5Var2.f28074c = px5Var;
                if (yx5.f35604g.mo10951f(this, px5Var, px5Var2)) {
                    return;
                } else {
                    px5Var = this.f35606b;
                }
            } while (px5Var != px5.f28071d);
        }
        m4844k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        lx5 lx5Var;
        Object obj = this.f35605a;
        if (!(obj instanceof mx5) && !(obj == null)) {
            return false;
        }
        if (yx5.f35603f) {
            lx5Var = new lx5(new CancellationException("Future.cancel() was called."), z);
        } else {
            lx5Var = z ? lx5.f24453c : lx5.f24454d;
            Objects.requireNonNull(lx5Var);
        }
        boolean z2 = false;
        while (true) {
            if (yx5.f35604g.mo10952g(this, obj, lx5Var)) {
                m4843j(this);
                if (obj instanceof mx5) {
                    yz5 yz5Var = ((mx5) obj).f25286b;
                    if (yz5Var instanceof e06) {
                        this = (e06) yz5Var;
                        obj = this.f35605a;
                        if ((obj == null) | (obj instanceof mx5)) {
                            z2 = true;
                        }
                    } else {
                        yz5Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f35605a;
            if (m4841g(obj)) {
                return z2;
            }
        }
    }

    @Override // p000.yx5
    /* JADX INFO: renamed from: d */
    public final Throwable mo4846d() {
        if (!(this instanceof e06)) {
            return null;
        }
        Object obj = this.f35605a;
        if (obj instanceof ox5) {
            return ((ox5) obj).f27195a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m4847f() {
        yz5 yz5Var = this.f17576h;
        ScheduledFuture scheduledFuture = this.f17577i;
        if (yz5Var == null) {
            return null;
        }
        String strM13621u = zi4.m13621u("inputFuture=[", yz5Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strM13621u + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strM13621u;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        wx5 wx5Var = wx5.f33841c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f35605a;
        if ((obj != null) && m4841g(obj)) {
            return m4840e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            wx5 wx5Var2 = this.f35607c;
            if (wx5Var2 != wx5Var) {
                wx5 wx5Var3 = new wx5();
                while (true) {
                    sx5 sx5Var = yx5.f35604g;
                    sx5Var.mo10949d(wx5Var3, wx5Var2);
                    if (sx5Var.mo10953h(this, wx5Var2, wx5Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m13271c(wx5Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f35605a;
                            if ((obj2 != null) && m4841g(obj2)) {
                                return m4840e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m13271c(wx5Var3);
                        break;
                    }
                    long j4 = j3;
                    wx5Var2 = this.f35607c;
                    if (wx5Var2 != wx5Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f35605a;
            Objects.requireNonNull(obj3);
            return m4840e(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.f35605a;
            if ((obj4 != null) && m4841g(obj4)) {
                return m4840e(obj4);
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
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
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

    /* JADX INFO: renamed from: i */
    public final void m4848i(StringBuilder sb) {
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
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
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
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f35605a instanceof lx5;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f35605a;
        return (obj != null) & m4841g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f35605a instanceof lx5) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4848i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f35605a;
            if (obj instanceof mx5) {
                sb.append(", setFuture=[");
                yz5 yz5Var = ((mx5) obj).f25286b;
                try {
                    if (yz5Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(yz5Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = m4847f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m4848i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        wx5 wx5Var = wx5.f33841c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f35605a;
            if ((obj2 != null) & m4841g(obj2)) {
                return m4840e(obj2);
            }
            wx5 wx5Var2 = this.f35607c;
            if (wx5Var2 != wx5Var) {
                wx5 wx5Var3 = new wx5();
                do {
                    sx5 sx5Var = yx5.f35604g;
                    sx5Var.mo10949d(wx5Var3, wx5Var2);
                    if (sx5Var.mo10953h(this, wx5Var2, wx5Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f35605a;
                            } else {
                                m13271c(wx5Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & m4841g(obj)));
                        return m4840e(obj);
                    }
                    wx5Var2 = this.f35607c;
                } while (wx5Var2 != wx5Var);
            }
            Object obj3 = this.f35605a;
            Objects.requireNonNull(obj3);
            return m4840e(obj3);
        }
        throw new InterruptedException();
    }
}
