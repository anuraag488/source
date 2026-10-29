package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y81 extends ym0 {

    /* JADX INFO: renamed from: t */
    public long f35014t;

    /* JADX INFO: renamed from: u */
    public long f35015u;

    /* JADX INFO: renamed from: v */
    public long f35016v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f35017w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ z81 f35018x;

    /* JADX INFO: renamed from: y */
    public int f35019y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(z81 z81Var, ym0 ym0Var) {
        super(ym0Var);
        this.f35018x = z81Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f35017w = obj;
        this.f35019y |= Integer.MIN_VALUE;
        return this.f35018x.mo4258R(0L, 0L, this);
    }
}
