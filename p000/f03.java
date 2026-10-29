package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f03 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f18637t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ g03 f18638u;

    /* JADX INFO: renamed from: v */
    public int f18639v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f03(g03 g03Var, ym0 ym0Var) {
        super(ym0Var);
        this.f18638u = g03Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18637t = obj;
        this.f18639v |= Integer.MIN_VALUE;
        return this.f18638u.m5871b(0L, this);
    }
}
