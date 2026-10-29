package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hu0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public boolean f20861t;

    /* JADX INFO: renamed from: u */
    public of4 f20862u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f20863v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ru0 f20864w;

    /* JADX INFO: renamed from: x */
    public int f20865x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(ru0 ru0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f20864w = ru0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20863v = obj;
        this.f20865x |= Integer.MIN_VALUE;
        return this.f20864w.m10435h(false, null, this);
    }
}
