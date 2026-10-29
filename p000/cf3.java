package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cf3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f15980t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ df3 f15981u;

    /* JADX INFO: renamed from: v */
    public int f15982v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf3(df3 df3Var, ym0 ym0Var) {
        super(ym0Var);
        this.f15981u = df3Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15980t = obj;
        this.f15982v |= Integer.MIN_VALUE;
        return this.f15981u.m4501h(this);
    }
}
