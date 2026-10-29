package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bf3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f15237t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ df3 f15238u;

    /* JADX INFO: renamed from: v */
    public int f15239v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf3(df3 df3Var, ym0 ym0Var) {
        super(ym0Var);
        this.f15238u = df3Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15237t = obj;
        this.f15239v |= Integer.MIN_VALUE;
        return this.f15238u.m4500e(this);
    }
}
