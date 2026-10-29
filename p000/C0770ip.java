package p000;

/* JADX INFO: renamed from: ip */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0770ip extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f21610t;

    /* JADX INFO: renamed from: u */
    public int f21611u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0806jp f21612v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770ip(C0806jp c0806jp, wm0 wm0Var) {
        super(wm0Var);
        this.f21612v = c0806jp;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f21610t = obj;
        this.f21611u |= Integer.MIN_VALUE;
        return this.f21612v.emit(null, this);
    }
}
