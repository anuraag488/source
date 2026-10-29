package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends ym0 {

    /* JADX INFO: renamed from: t */
    public Object f20966t;

    /* JADX INFO: renamed from: u */
    public v14 f20967u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f20968v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ j00 f20969w;

    /* JADX INFO: renamed from: x */
    public int f20970x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(j00 j00Var, ym0 ym0Var) {
        super(ym0Var);
        this.f20969w = j00Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20968v = obj;
        this.f20970x |= Integer.MIN_VALUE;
        return this.f20969w.m6976a(this);
    }
}
