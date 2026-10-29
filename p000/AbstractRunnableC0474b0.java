package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0474b0 extends ik1 implements Runnable {

    /* JADX INFO: renamed from: h */
    public jk1 f14972h;

    /* JADX INFO: renamed from: i */
    public Class f14973i;

    /* JADX INFO: renamed from: j */
    public Object f14974j;

    public AbstractRunnableC0474b0(jk1 jk1Var, Class cls, Object obj) {
        this.f14972h = jk1Var;
        this.f14973i = cls;
        this.f14974j = obj;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: d */
    public final void mo3380d() {
        jk1 jk1Var = this.f14972h;
        if ((jk1Var != null) & (this.f21942a instanceof C1314x0)) {
            jk1Var.cancel(m6990q());
        }
        this.f14972h = null;
        this.f14973i = null;
        this.f14974j = null;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: k */
    public final String mo3313k() {
        String str;
        jk1 jk1Var = this.f14972h;
        Class cls = this.f14973i;
        Object obj = this.f14974j;
        String strMo3313k = super.mo3313k();
        if (jk1Var != null) {
            str = "inputFuture=[" + jk1Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo3313k != null) {
                return str.concat(strMo3313k);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        jk1 jk1Var = this.f14972h;
        Class cls = this.f14973i;
        Object obj = this.f14974j;
        if (((obj == null) || ((jk1Var == null) | (cls == null))) || (this.f21942a instanceof C1314x0)) {
            return;
        }
        this.f14972h = null;
        if (jk1Var != null) {
            try {
                e = jk1Var.m6989p();
            } catch (Error | RuntimeException e2) {
                e = e2;
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    cause = new NullPointerException("Future type " + jk1Var.getClass() + " threw " + e3.getClass() + " without a cause");
                }
                e = cause;
            }
        } else {
            e = null;
        }
        Object objM10121z = e == null ? qs5.m10121z(jk1Var) : null;
        if (e == null) {
            m6986m(objM10121z);
            return;
        }
        if (!cls.isInstance(e)) {
            m6988o(jk1Var);
            return;
        }
        try {
            Object objMo0t = mo0t(obj, e);
            this.f14973i = null;
            this.f14974j = null;
            mo1u(objMo0t);
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m6987n(th);
            } finally {
                this.f14973i = null;
                this.f14974j = null;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public Object mo0t(Object obj, Throwable th) {
        InterfaceC1412zo interfaceC1412zo = (InterfaceC1412zo) obj;
        zl2 zl2VarApply = interfaceC1412zo.apply(th);
        if (zl2VarApply != null) {
            return zl2VarApply;
        }
        xy4.m12782k(sc6.m10639K("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1412zo));
        return null;
    }

    /* JADX INFO: renamed from: u */
    public void mo1u(Object obj) {
        m6988o((zl2) obj);
    }
}
