package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 {

    /* JADX INFO: renamed from: a */
    public bl1 f34327a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f34328b;

    /* JADX INFO: renamed from: c */
    public mw2 f34329c;

    /* JADX INFO: renamed from: d */
    public mw2 f34330d;

    /* JADX INFO: renamed from: e */
    public boolean f34331e;

    /* JADX INFO: renamed from: a */
    public final void m12699a() {
        if (this.f34331e) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f34328b;
        C0941nc c0941nc = new C0941nc(0, this, xk1.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 5);
        cw2 cw2Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30136p0;
        if (!cw2Var.m4204e(c0941nc)) {
            cw2Var.m4200a(c0941nc);
        }
        this.f34331e = true;
    }
}
