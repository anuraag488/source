package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j03 extends ym0 {

    /* JADX INFO: renamed from: t */
    public long f21929t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f21930u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ k03 f21931v;

    /* JADX INFO: renamed from: w */
    public int f21932w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j03(k03 k03Var, ym0 ym0Var) {
        super(ym0Var);
        this.f21931v = k03Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f21930u = obj;
        this.f21932w |= Integer.MIN_VALUE;
        return this.f21931v.mo4259Z(0L, this);
    }
}
