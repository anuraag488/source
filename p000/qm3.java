package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qm3 extends AbstractC1202u0 implements to0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xi0 f28574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rm3 f28575c;

    /* JADX WARN: Illegal instructions before constructor call */
    public qm3(xi0 xi0Var, rm3 rm3Var) {
        wv1 wv1Var = wv1.f33762e;
        this.f28574b = xi0Var;
        this.f28575c = rm3Var;
        super(wv1Var);
    }

    @Override // p000.to0
    public final void handleException(ro0 ro0Var, Throwable th) throws Throwable {
        xi0 xi0Var = this.f28574b;
        rm3 rm3Var = this.f28575c;
        xi0Var.m12697c(rm3Var, th);
        ro0 ro0Var2 = rm3Var.f29416b;
        wv1 wv1Var = wv1.f33762e;
        to0 to0Var = (to0) ro0Var2.get(wv1Var);
        if (to0Var != null) {
            to0Var.handleException(ro0Var, th);
            return;
        }
        to0 to0Var2 = (to0) rm3Var.f29415a.get(wv1Var);
        if (to0Var2 == null) {
            throw th;
        }
        to0Var2.handleException(ro0Var, th);
    }
}
