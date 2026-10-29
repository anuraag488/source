package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class br1 extends AbstractC0634f1 implements Runnable {

    /* JADX INFO: renamed from: h */
    public zl2 f15520h;

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: d */
    public final void mo3380d() {
        this.f15520h = null;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: k */
    public final String mo3313k() {
        zl2 zl2Var = this.f15520h;
        if (zl2Var == null) {
            return null;
        }
        return "delegate=[" + zl2Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl2 zl2Var = this.f15520h;
        if (zl2Var != null) {
            m6988o(zl2Var);
        }
    }
}
