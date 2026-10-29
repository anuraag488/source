package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f23163t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ lj1 f23164u;

    /* JADX INFO: renamed from: v */
    public int f23165v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(lj1 lj1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f23164u = lj1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f23163t = obj;
        this.f23165v |= Integer.MIN_VALUE;
        return this.f23164u.emit(null, this);
    }
}
