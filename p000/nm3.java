package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nm3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f25946t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ex1 f25947u;

    /* JADX INFO: renamed from: v */
    public int f25948v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm3(ex1 ex1Var, ym0 ym0Var) {
        super(ym0Var);
        this.f25947u = ex1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f25946t = obj;
        this.f25948v |= Integer.MIN_VALUE;
        return this.f25947u.m5419b(0.0f, this);
    }
}
