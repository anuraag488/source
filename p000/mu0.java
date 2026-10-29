package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f25215t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ru0 f25216u;

    /* JADX INFO: renamed from: v */
    public int f25217v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(ru0 ru0Var, ym0 ym0Var) {
        super(ym0Var);
        this.f25216u = ru0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f25215t = obj;
        this.f25217v |= Integer.MIN_VALUE;
        return this.f25216u.m10436i(null, this);
    }
}
