package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e03 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f17563t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ g03 f17564u;

    /* JADX INFO: renamed from: v */
    public int f17565v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e03(g03 g03Var, ym0 ym0Var) {
        super(ym0Var);
        this.f17564u = g03Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f17563t = obj;
        this.f17565v |= Integer.MIN_VALUE;
        return this.f17564u.m5870a(0L, 0L, this);
    }
}
