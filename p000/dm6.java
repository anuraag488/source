package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dm6 {

    /* JADX INFO: renamed from: a */
    public Object f17196a;

    /* JADX INFO: renamed from: b */
    public wq6 f17197b;

    /* JADX INFO: renamed from: c */
    public jr6 f17198c;

    /* JADX INFO: renamed from: d */
    public boolean f17199d;

    /* JADX INFO: renamed from: a */
    public final void m4562a(Object obj) {
        this.f17199d = true;
        wq6 wq6Var = this.f17197b;
        if (wq6Var != null) {
            fq6 fq6Var = wq6Var.f33645b;
            fq6Var.getClass();
            if (obj == null) {
                obj = ok6.f26827g;
            }
            if (ok6.f26826f.mo5086d(fq6Var, null, obj)) {
                ok6.m9160d(fq6Var);
                this.f17196a = null;
                this.f17197b = null;
                this.f17198c = null;
            }
        }
    }

    public final void finalize() {
        jr6 jr6Var;
        wq6 wq6Var = this.f17197b;
        if (wq6Var != null) {
            fq6 fq6Var = wq6Var.f33645b;
            if (!fq6Var.isDone()) {
                if (ok6.f26826f.mo5086d(fq6Var, null, new o56(new C1351y0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f17196a)), (byte) 4)))) {
                    ok6.m9160d(fq6Var);
                }
            }
        }
        if (this.f17199d || (jr6Var = this.f17198c) == null) {
            return;
        }
        jr6Var.m7266i(null);
    }
}
