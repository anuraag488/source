package p000;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1103rc extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f29144t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f29145u;

    /* JADX INFO: renamed from: v */
    public int f29146v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103rc(ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, ym0 ym0Var) {
        super(ym0Var);
        this.f29145u = viewTreeObserverOnGlobalLayoutListenerC1140sc;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f29144t = obj;
        this.f29146v |= Integer.MIN_VALUE;
        this.f29145u.m10605J(null, this);
        return ap0.f14763a;
    }
}
