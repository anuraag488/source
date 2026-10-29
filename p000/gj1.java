package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f19817t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ fa1 f19818u;

    /* JADX INFO: renamed from: v */
    public int f19819v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(fa1 fa1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f19818u = fa1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f19817t = obj;
        this.f19819v |= Integer.MIN_VALUE;
        return this.f19818u.emit(null, this);
    }
}
