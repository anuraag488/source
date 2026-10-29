package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a74 extends ym0 {

    /* JADX INFO: renamed from: t */
    public of4 f154t;

    /* JADX INFO: renamed from: u */
    public gx2 f155u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f156v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ c74 f157w;

    /* JADX INFO: renamed from: x */
    public int f158x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a74(c74 c74Var, ym0 ym0Var) {
        super(ym0Var);
        this.f157w = c74Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f156v = obj;
        this.f158x |= Integer.MIN_VALUE;
        return this.f157w.m3866b(null, this);
    }
}
