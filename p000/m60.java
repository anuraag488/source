package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m60 {

    /* JADX INFO: renamed from: a */
    public Object f24678a;

    /* JADX INFO: renamed from: b */
    public p60 f24679b;

    /* JADX INFO: renamed from: c */
    public no3 f24680c;

    /* JADX INFO: renamed from: d */
    public boolean f24681d;

    /* JADX INFO: renamed from: a */
    public final void m8198a(Object obj) {
        this.f24681d = true;
        p60 p60Var = this.f24679b;
        if (p60Var == null || !p60Var.f27392b.m7820k(obj)) {
            return;
        }
        this.f24678a = null;
        this.f24679b = null;
        this.f24680c = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m8199b(Throwable th) {
        this.f24681d = true;
        p60 p60Var = this.f24679b;
        if (p60Var == null || !p60Var.f27392b.mo7821l(th)) {
            return;
        }
        this.f24678a = null;
        this.f24679b = null;
        this.f24680c = null;
    }

    public final void finalize() {
        no3 no3Var;
        p60 p60Var = this.f24679b;
        if (p60Var != null) {
            o60 o60Var = p60Var.f27392b;
            if (!o60Var.isDone()) {
                o60Var.mo7821l(new C1351y0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f24678a, (byte) 2));
            }
        }
        if (this.f24681d || (no3Var = this.f24680c) == null) {
            return;
        }
        no3Var.m7820k(null);
    }
}
