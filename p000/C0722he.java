package p000;

/* JADX INFO: renamed from: he */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0722he implements au1 {

    /* JADX INFO: renamed from: a */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f20506a;

    /* JADX INFO: renamed from: b */
    public Object f20507b;

    /* JADX INFO: renamed from: c */
    public boolean f20508c;

    /* JADX INFO: renamed from: d */
    public ComponentCallbacks2C0648fe f20509d;

    @Override // p000.au1
    /* JADX INFO: renamed from: a */
    public final void mo3311a(bu1 bu1Var) {
        synchronized (this.f20507b) {
            if (!bu1Var.f15626s) {
                bu1Var.f15626s = true;
                bu1Var.m3685b();
            }
        }
    }

    @Override // p000.au1
    /* JADX INFO: renamed from: b */
    public final bu1 mo3312b() {
        bu1 bu1Var;
        synchronized (this.f20507b) {
            this.f20506a.getUniqueDrawingId();
            bu1Var = new bu1(new fu1());
        }
        return bu1Var;
    }
}
