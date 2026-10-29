package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qx1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f28864t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ sx1 f28865u;

    /* JADX INFO: renamed from: v */
    public int f28866v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx1(sx1 sx1Var, ym0 ym0Var) {
        super(ym0Var);
        this.f28865u = sx1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f28864t = obj;
        this.f28866v |= Integer.MIN_VALUE;
        return this.f28865u.m10944P0(this);
    }
}
