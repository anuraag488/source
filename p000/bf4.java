package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bf4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public cf4 f15240t;

    /* JADX INFO: renamed from: u */
    public uo1 f15241u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f15242v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ cf4 f15243w;

    /* JADX INFO: renamed from: x */
    public int f15244x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf4(cf4 cf4Var, ym0 ym0Var) {
        super(ym0Var);
        this.f15243w = cf4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15242v = obj;
        this.f15244x |= Integer.MIN_VALUE;
        return this.f15243w.m4014d(null, null, this);
    }
}
