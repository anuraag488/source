package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class yy5 {
    /* JADX INFO: renamed from: a */
    public void mo5083a(sh6 sh6Var, sh6 sh6Var2) {
        sh6Var.f30284b = sh6Var2;
    }

    /* JADX INFO: renamed from: b */
    public void mo5084b(sh6 sh6Var, Thread thread) {
        sh6Var.f30283a = thread;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo5085c(ok6 ok6Var, x76 x76Var, x76 x76Var2) {
        synchronized (ok6Var) {
            try {
                if (ok6Var.f26829b != x76Var) {
                    return false;
                }
                ok6Var.f26829b = x76Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo5086d(ok6 ok6Var, Object obj, Object obj2) {
        synchronized (ok6Var) {
            try {
                if (ok6Var.f26828a != obj) {
                    return false;
                }
                ok6Var.f26828a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo5087e(ok6 ok6Var, sh6 sh6Var, sh6 sh6Var2) {
        synchronized (ok6Var) {
            try {
                if (ok6Var.f26830c != sh6Var) {
                    return false;
                }
                ok6Var.f26830c = sh6Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
