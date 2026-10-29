package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g35 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f19593t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ h35 f19594u;

    /* JADX INFO: renamed from: v */
    public int f19595v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g35(h35 h35Var, ym0 ym0Var) {
        super(ym0Var);
        this.f19594u = h35Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f19593t = obj;
        this.f19595v |= Integer.MIN_VALUE;
        return this.f19594u.m6215f(this);
    }
}
