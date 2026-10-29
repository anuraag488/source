package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b74 extends ym0 {

    /* JADX INFO: renamed from: t */
    public gx2 f15147t;

    /* JADX INFO: renamed from: u */
    public boolean f15148u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f15149v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ c74 f15150w;

    /* JADX INFO: renamed from: x */
    public int f15151x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b74(c74 c74Var, ym0 ym0Var) {
        super(ym0Var);
        this.f15150w = c74Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15149v = obj;
        this.f15151x |= Integer.MIN_VALUE;
        return this.f15150w.m3867c(null, this);
    }
}
