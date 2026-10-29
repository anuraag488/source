package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f36463t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ bz1 f36464u;

    /* JADX INFO: renamed from: v */
    public int f36465v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(bz1 bz1Var, ym0 ym0Var) {
        super(ym0Var);
        this.f36464u = bz1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f36463t = obj;
        this.f36465v |= Integer.MIN_VALUE;
        return this.f36464u.m3768b(null, this);
    }
}
