package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nr6 {

    /* JADX INFO: renamed from: a */
    public final Object f26057a = new Object();

    /* JADX INFO: renamed from: b */
    public final rd6 f26058b;

    /* JADX INFO: renamed from: c */
    public boolean f26059c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f26060d;

    /* JADX INFO: renamed from: e */
    public Object f26061e;

    /* JADX INFO: renamed from: f */
    public Exception f26062f;

    public nr6() {
        rd6 rd6Var = new rd6((byte) 5);
        rd6Var.f29197c = new Object();
        VarHandle.storeStoreFence();
        this.f26058b = rd6Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8817a(Executor executor, v33 v33Var) {
        a86 a86Var = new a86((byte) 0);
        a86Var.f169c = new Object();
        a86Var.f168b = executor;
        a86Var.f170d = v33Var;
        VarHandle.storeStoreFence();
        this.f26058b.m10307g(a86Var);
        m8833q();
    }

    /* JADX INFO: renamed from: b */
    public final void m8818b(w33 w33Var) {
        this.f26058b.m10307g(new a86(mi4.f24958a, w33Var));
        m8833q();
    }

    /* JADX INFO: renamed from: c */
    public final void m8819c(Executor executor, y33 y33Var) {
        a86 a86Var = new a86((byte) 2);
        a86Var.f169c = new Object();
        a86Var.f168b = executor;
        a86Var.f170d = y33Var;
        VarHandle.storeStoreFence();
        this.f26058b.m10307g(a86Var);
        m8833q();
    }

    /* JADX INFO: renamed from: d */
    public final void m8820d(Executor executor, e43 e43Var) {
        a86 a86Var = new a86((byte) 3);
        a86Var.f169c = new Object();
        a86Var.f168b = executor;
        a86Var.f170d = e43Var;
        VarHandle.storeStoreFence();
        this.f26058b.m10307g(a86Var);
        m8833q();
    }

    /* JADX INFO: renamed from: e */
    public final nr6 m8821e(Executor executor, xm0 xm0Var) {
        nr6 nr6Var = new nr6();
        my5 my5Var = new my5((byte) 0);
        my5Var.f25305b = executor;
        my5Var.f25306c = xm0Var;
        my5Var.f25307d = nr6Var;
        VarHandle.storeStoreFence();
        this.f26058b.m10307g(my5Var);
        m8833q();
        return nr6Var;
    }

    /* JADX INFO: renamed from: f */
    public final nr6 m8822f(Executor executor, xm0 xm0Var) {
        nr6 nr6Var = new nr6();
        my5 my5Var = new my5((byte) 1);
        my5Var.f25305b = executor;
        my5Var.f25306c = xm0Var;
        my5Var.f25307d = nr6Var;
        VarHandle.storeStoreFence();
        this.f26058b.m10307g(my5Var);
        m8833q();
        return nr6Var;
    }

    /* JADX INFO: renamed from: g */
    public final Exception m8823g() {
        Exception exc;
        synchronized (this.f26057a) {
            exc = this.f26062f;
        }
        return exc;
    }

    /* JADX INFO: renamed from: h */
    public final Object m8824h() {
        Object obj;
        synchronized (this.f26057a) {
            try {
                y42.m12856c0("Task is not yet complete", this.f26059c);
                if (this.f26060d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f26062f;
                if (exc != null) {
                    throw new jt3(exc);
                }
                obj = this.f26061e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8825i() {
        boolean z;
        synchronized (this.f26057a) {
            z = this.f26059c;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8826j() {
        boolean z;
        synchronized (this.f26057a) {
            try {
                z = false;
                if (this.f26059c && !this.f26060d && this.f26062f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final nr6 m8827k(Executor executor, le4 le4Var) {
        nr6 nr6Var = new nr6();
        this.f26058b.m10307g(new a86(executor, le4Var, nr6Var));
        m8833q();
        return nr6Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m8828l(Object obj) {
        synchronized (this.f26057a) {
            m8832p();
            this.f26059c = true;
            this.f26061e = obj;
        }
        this.f26058b.m10309i(this);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8829m(Object obj) {
        synchronized (this.f26057a) {
            try {
                if (this.f26059c) {
                    return false;
                }
                this.f26059c = true;
                this.f26061e = obj;
                this.f26058b.m10309i(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8830n(Exception exc) {
        y42.m12855b0(exc, "Exception must not be null");
        synchronized (this.f26057a) {
            m8832p();
            this.f26059c = true;
            this.f26062f = exc;
        }
        this.f26058b.m10309i(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m8831o() {
        synchronized (this.f26057a) {
            try {
                if (this.f26059c) {
                    return;
                }
                this.f26059c = true;
                this.f26060d = true;
                this.f26058b.m10309i(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8832p() {
        String strConcat;
        if (this.f26059c) {
            if (!m8825i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM8823g = m8823g();
            if (excM8823g != null) {
                strConcat = "failure";
            } else if (m8826j()) {
                strConcat = "result ".concat(String.valueOf(m8824h()));
            } else {
                strConcat = this.f26060d ? "cancellation" : "unknown issue";
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8833q() {
        synchronized (this.f26057a) {
            try {
                if (this.f26059c) {
                    this.f26058b.m10309i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
