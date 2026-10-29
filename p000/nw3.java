package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class nw3 extends AbstractC1165t0 implements bp0 {

    /* JADX INFO: renamed from: e */
    public final wm0 f26153e;

    public nw3(wm0 wm0Var, ro0 ro0Var) {
        super(ro0Var, true);
        this.f26153e = wm0Var;
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: T */
    public final boolean mo4988T() {
        return true;
    }

    @Override // p000.bp0
    public final bp0 getCallerFrame() {
        wm0 wm0Var = this.f26153e;
        if (wm0Var instanceof bp0) {
            return (bp0) wm0Var;
        }
        return null;
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: p */
    public void mo5002p(Object obj) {
        g01.m5867a(C0006a5.m86x(this.f26153e), c20.m3799D(obj));
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: r */
    public void mo5004r(Object obj) {
        this.f26153e.resumeWith(c20.m3799D(obj));
    }

    /* JADX INFO: renamed from: k0 */
    public void mo8876k0() {
    }
}
