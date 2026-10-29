package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zt4 extends nw3 {

    /* JADX INFO: renamed from: f */
    public ThreadLocal f36364f;
    private volatile boolean threadLocalIsSet;

    @Override // p000.nw3
    /* JADX INFO: renamed from: k0 */
    public final void mo8876k0() {
        m13754m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m13753l0() {
        boolean z = this.threadLocalIsSet && this.f36364f.get() == null;
        this.f36364f.remove();
        return !z;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m13754m0() {
        if (this.threadLocalIsSet) {
            l73 l73Var = (l73) this.f36364f.get();
            if (l73Var != null) {
                dm4.m4554a((ro0) l73Var.f23833a, l73Var.f23834b);
            }
            this.f36364f.remove();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m13755n0(ro0 ro0Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f36364f.set(new l73(ro0Var, obj));
    }

    @Override // p000.nw3, p000.e92
    /* JADX INFO: renamed from: r */
    public final void mo5004r(Object obj) {
        m13754m0();
        Object objM3799D = c20.m3799D(obj);
        wm0 wm0Var = this.f26153e;
        ro0 context = wm0Var.getContext();
        Object objM4555b = dm4.m4555b(context, null);
        zt4 zt4VarM3805J = objM4555b != dm4.f17189a ? c20.m3805J(wm0Var, context, objM4555b) : null;
        try {
            wm0Var.resumeWith(objM3799D);
        } finally {
            if (zt4VarM3805J == null || zt4VarM3805J.m13753l0()) {
                dm4.m4554a(context, objM4555b);
            }
        }
    }
}
