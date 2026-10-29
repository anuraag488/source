package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class iz2 {

    /* JADX INFO: renamed from: a */
    public C1283w7 f21899a;

    /* JADX INFO: renamed from: b */
    public boolean f21900b;

    /* JADX INFO: renamed from: a */
    public final void m6971a() {
        C1283w7 c1283w7 = this.f21899a;
        if (c1283w7 == null) {
            C1077qn.m9989o("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f21900b) {
            c1283w7.m12148x(this, null);
        }
        jz2 jz2Var = (jz2) c1283w7.f33128d;
        C1040pn c1040pn = (C1040pn) c1283w7.f33127c;
        if (equals(jz2Var.f22760h) && -1 == jz2Var.f22759g) {
            dz2 dz2VarM7349c = jz2Var.f22758f;
            if (dz2VarM7349c == null) {
                dz2VarM7349c = jz2Var.m7349c(-1);
            }
            jz2Var.f22758f = null;
            jz2Var.f22759g = 0;
            jz2Var.f22760h = null;
            lz2 lz2Var = lz2.f24483a;
            if (dz2VarM7349c == null) {
                Runnable runnable = ((t33) c1040pn.f27754b).f30741a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                dz2VarM7349c.f17530d = lz2Var;
                dz2VarM7349c.mo4813b();
            }
            ac4 ac4Var = jz2Var.f22753a;
            ac4Var.getClass();
            ac4Var.m200k(null, lz2Var);
        }
        this.f21900b = false;
    }

    /* JADX INFO: renamed from: b */
    public void mo6972b(boolean z) {
    }
}
