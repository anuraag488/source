package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class li4 {

    /* JADX INFO: renamed from: a */
    public nr6 f24059a = new nr6();

    /* JADX INFO: renamed from: a */
    public final void m7988a(Object obj) {
        this.f24059a.m8828l(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m7989b(Exception exc) {
        nr6 nr6Var = this.f24059a;
        nr6Var.getClass();
        y42.m12855b0(exc, "Exception must not be null");
        synchronized (nr6Var.f26057a) {
            try {
                if (nr6Var.f26059c) {
                    return;
                }
                nr6Var.f26059c = true;
                nr6Var.f26062f = exc;
                nr6Var.f26058b.m10309i(nr6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7990c(Object obj) {
        this.f24059a.m8829m(obj);
    }
}
