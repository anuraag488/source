package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1204u2 extends ik1 implements Runnable {

    /* JADX INFO: renamed from: h */
    public zl2 f31608h;

    /* JADX INFO: renamed from: i */
    public Object f31609i;

    public AbstractRunnableC1204u2(zl2 zl2Var, Object obj) {
        zl2Var.getClass();
        this.f31608h = zl2Var;
        this.f31609i = obj;
    }

    /* JADX INFO: renamed from: t */
    public static C1130s2 m11206t(zl2 zl2Var, InterfaceC1412zo interfaceC1412zo, Executor executor) {
        executor.getClass();
        C1130s2 c1130s2 = new C1130s2(zl2Var, interfaceC1412zo);
        zl2Var.mo6454a(c1130s2, C0638f5.m5526F(executor, c1130s2));
        return c1130s2;
    }

    /* JADX INFO: renamed from: u */
    public static C1167t2 m11207u(zl2 zl2Var, uq1 uq1Var, Executor executor) {
        C1167t2 c1167t2 = new C1167t2(zl2Var, uq1Var);
        zl2Var.mo6454a(c1167t2, C0638f5.m5526F(executor, c1167t2));
        return c1167t2;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: d */
    public final void mo3380d() {
        zl2 zl2Var = this.f31608h;
        if ((zl2Var != null) & (this.f21942a instanceof C1314x0)) {
            zl2Var.cancel(m6990q());
        }
        this.f31608h = null;
        this.f31609i = null;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: k */
    public final String mo3313k() {
        String str;
        zl2 zl2Var = this.f31608h;
        Object obj = this.f31609i;
        String strMo3313k = super.mo3313k();
        if (zl2Var != null) {
            str = "inputFuture=[" + zl2Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo3313k != null) {
                return str.concat(strMo3313k);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl2 zl2Var = this.f31608h;
        Object obj = this.f31609i;
        if (((this.f21942a instanceof C1314x0) | (zl2Var == null)) || (obj == null)) {
            return;
        }
        this.f31608h = null;
        if (zl2Var.isCancelled()) {
            m6988o(zl2Var);
            return;
        }
        try {
            try {
                Object objMo10961v = mo10961v(obj, qs5.m10121z(zl2Var));
                this.f31609i = null;
                mo10962w(objMo10961v);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m6987n(th);
                } finally {
                    this.f31609i = null;
                }
            }
        } catch (Error e) {
            m6987n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            m6987n(e2);
        } catch (ExecutionException e3) {
            m6987n(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: v */
    public Object mo10961v(Object obj, Object obj2) {
        InterfaceC1412zo interfaceC1412zo = (InterfaceC1412zo) obj;
        zl2 zl2VarApply = interfaceC1412zo.apply(obj2);
        if (zl2VarApply != null) {
            return zl2VarApply;
        }
        xy4.m12782k(sc6.m10639K("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1412zo));
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void mo10962w(Object obj) {
        m6988o((zl2) obj);
    }
}
