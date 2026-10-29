package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1323x9 extends AbstractC0011aa {

    /* JADX INFO: renamed from: o */
    public static final Logger f34069o = Logger.getLogger(AbstractC1323x9.class.getName());

    /* JADX INFO: renamed from: l */
    public o12 f34070l;

    /* JADX INFO: renamed from: m */
    public final boolean f34071m;

    /* JADX INFO: renamed from: n */
    public final boolean f34072n;

    public AbstractC1323x9(o12 o12Var, boolean z, boolean z2) {
        int size = o12Var.size();
        this.f200h = null;
        this.f201i = size;
        this.f34070l = o12Var;
        this.f34071m = z;
        this.f34072n = z2;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: d */
    public final void mo3380d() {
        o12 o12Var = this.f34070l;
        mo164x(1);
        if ((o12Var != null) && (this.f21942a instanceof C1314x0)) {
            boolean zM6990q = m6990q();
            ru4 it = o12Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM6990q);
            }
        }
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: k */
    public final String mo3313k() {
        o12 o12Var = this.f34070l;
        if (o12Var == null) {
            return super.mo3313k();
        }
        return "futures=" + o12Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m12530s(int i, Future future) {
        try {
            mo162r(i, qs5.m10121z(future));
        } catch (Error | RuntimeException e) {
            m12532v(e);
        } catch (ExecutionException e2) {
            m12532v(e2.getCause());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12531t(o12 o12Var) {
        int iMo7748J = AbstractC0011aa.f198j.mo7748J(this);
        int i = 0;
        dt0.m4722x("Less than 0 remaining futures", iMo7748J >= 0);
        if (iMo7748J == 0) {
            if (o12Var != null) {
                ru4 it = o12Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        m12530s(i, future);
                    }
                    i++;
                }
            }
            this.f200h = null;
            mo163u();
            mo164x(2);
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo163u();

    /* JADX INFO: renamed from: v */
    public final void m12532v(Throwable th) {
        th.getClass();
        if (this.f34071m && !m6987n(th)) {
            Set set = this.f200h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f21942a instanceof C1314x0)) {
                    Throwable thM6989p = m6989p();
                    Objects.requireNonNull(thM6989p);
                    while (thM6989p != null && setNewSetFromMap.add(thM6989p)) {
                        thM6989p = thM6989p.getCause();
                    }
                }
                AbstractC0011aa.f198j.mo7746D(this, setNewSetFromMap);
                Set set2 = this.f200h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    f34069o.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            f34069o.log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m12533w() {
        Objects.requireNonNull(this.f34070l);
        if (this.f34070l.isEmpty()) {
            mo163u();
            return;
        }
        boolean z = this.f34071m;
        byte b = 0;
        rz0 rz0Var = rz0.f29741a;
        if (!z) {
            o12 o12Var = this.f34072n ? this.f34070l : null;
            RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9(b);
            runnableC1285w9.f33164b = this;
            runnableC1285w9.f33165c = o12Var;
            VarHandle.storeStoreFence();
            ru4 it = this.f34070l.iterator();
            while (it.hasNext()) {
                ((zl2) it.next()).mo6454a(runnableC1285w9, rz0Var);
            }
            return;
        }
        ru4 it2 = this.f34070l.iterator();
        int i = 0;
        while (it2.hasNext()) {
            zl2 zl2Var = (zl2) it2.next();
            RunnableC1248v9 runnableC1248v9 = new RunnableC1248v9(b);
            runnableC1248v9.f32471c = this;
            runnableC1248v9.f32472d = zl2Var;
            runnableC1248v9.f32470b = i;
            VarHandle.storeStoreFence();
            zl2Var.mo6454a(runnableC1248v9, rz0Var);
            i++;
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo164x(int i);

    /* JADX INFO: renamed from: r */
    public void mo162r(int i, Object obj) {
    }
}
