package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t21 extends ym0 {

    /* JADX INFO: renamed from: t */
    public f21 f30726t;

    /* JADX INFO: renamed from: u */
    public x21 f30727u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f30728v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ v21 f30729w;

    /* JADX INFO: renamed from: x */
    public int f30730x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(v21 v21Var, ym0 ym0Var) {
        super(ym0Var);
        this.f30729w = v21Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f30728v = obj;
        this.f30730x |= Integer.MIN_VALUE;
        return this.f30729w.m11701a1(null, this);
    }
}
