package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b11 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f14993t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ c11 f14994u;

    /* JADX INFO: renamed from: v */
    public int f14995v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b11(c11 c11Var, wm0 wm0Var) {
        super(wm0Var);
        this.f14994u = c11Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f14993t = obj;
        this.f14995v |= Integer.MIN_VALUE;
        return this.f14994u.emit(null, this);
    }
}
